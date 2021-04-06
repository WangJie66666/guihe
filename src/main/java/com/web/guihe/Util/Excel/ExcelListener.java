package com.web.guihe.Util.Excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.web.guihe.Service.GhCallSystemService;
import com.web.guihe.Util.Exception.GlobaExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Excel数据操作监听
 */
@Slf4j
public class ExcelListener extends AnalysisEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @Autowired
    private GhCallSystemService ghCallSystemService;

    /**
     * 每隔50条存储数据库，清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 50;

    /**
     * 可以通过实例获取该值
     */
    private List<Object> datas = new ArrayList<>();

    /**
     * 自定义用于暂时存储data。
     * 通过 AnalysisContext 对象还可以获取当前 sheet，当前行等数据
     */
    @Override
    public void invoke(Object object, AnalysisContext analysisContext) {
        LOG.info("解析到一条数据:{}", JSON.toJSONString(object));
        //数据存储到list，供批量处理，或后续自己业务逻辑处理。
        datas.add(object);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        LOG.info("所有数据解析完成！");
    }

    public List<Object> getDatas() {
        return datas;
    }

    public void setDatas(List<Object> datas) {
        this.datas = datas;
    }

}
