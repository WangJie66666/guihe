package com.web.guihe.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.guihe.Entity.GhCallSystem;
import com.web.guihe.Entity.GhCallSystemExample;
import com.web.guihe.Mapper.GhCallSystemMapper;
import com.web.guihe.Util.BasicUtil.CallSystemUtil;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import com.web.guihe.Util.Excel.ExcelUtil;
import com.web.guihe.Util.Exception.BusinessRuntimeException;
import com.web.guihe.Util.Exception.ExceptionCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 呼叫中心
 */
@Service
public class GhCallSystemService {

    @Autowired
    private GhCallSystemMapper ghCallSystemMapper;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    /**
     * 分页
     * @param callSystemUtil
     * @return
     */
    public ReturnResult pageCallSystem(CallSystemUtil callSystemUtil){
        PageHelper.startPage(callSystemUtil.getPageNum(),callSystemUtil.getPageSize());
        GhCallSystemExample callSystemExample = new GhCallSystemExample();
        GhCallSystemExample.Criteria criteria = callSystemExample.createCriteria();
        if(!"全部".equals(callSystemUtil.getcGroup()) && callSystemUtil.getcGroup() != null && !"".equals(callSystemUtil.getcGroup())){
            if("空白".equals(callSystemUtil.getcGroup())){
                criteria.andCGroupEqualTo("");
            }else{
                criteria.andCGroupEqualTo(callSystemUtil.getcGroup());
            }
        }
        if(callSystemUtil.getcUser() != null && !"".equals(callSystemUtil.getcUser())){
            criteria.andCUserLike("%"+callSystemUtil.getcUser()+"%");
        }
        if(callSystemUtil.getcAccount() != null && !"".equals(callSystemUtil.getcAccount())){
            criteria.andCAccountLike("%"+callSystemUtil.getcAccount()+"%");
        }
        if(callSystemUtil.getcWebaccount() != null && !"".equals(callSystemUtil.getcWebaccount())){
            criteria.andCWebaccountLike("%"+callSystemUtil.getcWebaccount()+"%");
        }
        criteria.andCNumEqualTo(callSystemUtil.getcNum());
        criteria.andCStateEqualTo(callSystemUtil.getcState());
        List<GhCallSystem> list1 = ghCallSystemMapper.selectByExample(callSystemExample);
        PageInfo<GhCallSystem> page;
        if(!"".equals(callSystemUtil.getcB1()) && callSystemUtil.getcB1() != null){
            String cB1 = "%" + callSystemUtil.getcB1() + "%";
            List<GhCallSystem> list2 = ghCallSystemMapper.selectPhone(cB1);
            List<GhCallSystem> list3 = new ArrayList<>();
            list1.stream().forEach(ghCallSystem1 -> {
                list2.stream().forEach(ghCallSystem2 -> {
                    if(ghCallSystem1.getcAccount().equals(ghCallSystem2.getcAccount())){
                        list3.add(ghCallSystem2);
                    }
                });
            });
            page = new PageInfo<>(list3);
        }else {
            page = new PageInfo<>(list1);
        }
        page.setPageSize(callSystemUtil.getPageSize());
        returnResult.custom(1,page);
        return returnResult;
    }

    /**
     * 呼叫中心组别
     * @return
     */
    public ReturnResult selectGroup(Integer cNum){
        List<String> list1 = ghCallSystemMapper.selectGroup(cNum);
        List<String> list2 = new ArrayList<>();
        list2.add("全部");
        list2.add("空白");
        list1.stream().forEach(cGroup -> {
            if("".equals(cGroup) || cGroup == null){
                cGroup = "空白";
            }
            list2.add(cGroup);
        });
        returnResult.custom(1,list2.stream().distinct().collect(Collectors.toList()));
        return returnResult;
    }

    /**
     * 数据导入
     * @param file
     * @return
     */
    public ReturnResult uploadCallSystem(MultipartFile file){
        List<GhCallSystem> data = ExcelUtil.uploadExcel(file,GhCallSystem.class);
        if(data.size() == 0){
            throw new BusinessRuntimeException(ExceptionCode.EXCEL_NO_DATA);
        }else {
            data.stream().forEach(ghCallSystem -> {
                ghCallSystem.setcState(1);
                if(ghCallSystem.getcGroup() == null){
                    ghCallSystem.setcGroup("");
                }
                if(ghCallSystem.getcUser() == null){
                    ghCallSystem.setcUser("");
                }
            });
            ghCallSystemMapper.batchAddCallSystem(data);
            returnResult.success();
            return returnResult;
        }
    }

    /**
     * 根据呼叫中心id查询信息
     * @param cId
     * @return
     */
    public ReturnResult selectByPrimaryKey(Integer cId){
        GhCallSystem ghCallSystem = ghCallSystemMapper.selectByPrimaryKey(cId);
        returnResult.success(ghCallSystem);
        return returnResult;
    }

    /**
     * 呼叫中心编辑/添加
     * @param callSystemUtil
     * @return
     */
    public ReturnResult updateCallSystem( CallSystemUtil callSystemUtil) throws IOException {
        if(callSystemUtil.getGhCallSystem().getcId() != null && !"".equals(callSystemUtil.getGhCallSystem().getcId())){
            if("空白".equals(callSystemUtil.getGhCallSystem().getcGroup())){
                callSystemUtil.getGhCallSystem().setcGroup("");
            }
            ghCallSystemMapper.updateByPrimaryKeySelective(callSystemUtil.getGhCallSystem());
            returnResult.success("编辑成功!");
        }else{

        }
        return  returnResult;
    }
}
