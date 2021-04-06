package com.web.guihe.Controller;

import com.web.guihe.Service.GhCallSystemService;
import com.web.guihe.Util.BasicUtil.CallSystemUtil;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 呼叫中心
 */
@CrossOrigin
@RestController
@RequestMapping("/callSystem")
public class GhCallSystemController {

    @Autowired
    private GhCallSystemService ghCallSystemService;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    /**
     * 分页
     * @param callSystemUtil
     * @return
     */
    @PostMapping("/page")
    @RequiresRoles(value = {"admin","IT"},logical = Logical.OR)
    public ReturnResult  pageCallSystem(CallSystemUtil callSystemUtil){
        return ghCallSystemService.pageCallSystem(callSystemUtil);
    }

    /**
     * 呼叫中心组别
     * @return
     */
    @GetMapping("/group")
    @RequiresRoles(value = {"admin","IT"},logical = Logical.OR)
    public ReturnResult selectGroup(){
        return ghCallSystemService.selectGroup();
    }

    /**
     * 数据导入
     * @param file
     * @return
     */
    @PostMapping("/uploadCallSystem")
    @RequiresRoles(value = {"admin","IT"},logical = Logical.OR)
    public ReturnResult uploadCallSystem(@RequestParam("file") MultipartFile file){
        return ghCallSystemService.uploadCallSystem(file);
    }
}
