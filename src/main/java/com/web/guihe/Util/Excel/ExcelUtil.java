package com.web.guihe.Util.Excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Excel数据操作
 *
 */
public class ExcelUtil {

    /**
     * 数据导入
     * @param file 导入数据
     * @param  clazz 实体类反射
     * @return
     */
    public static <T> List<T> uploadExcel(MultipartFile file,Class<T> clazz){
        ExcelListener excelListener = new ExcelListener();
        ExcelReader excelReader = getReader(file,clazz,excelListener);
        if(excelReader == null){
            return new ArrayList<>();
        }
        //获取所有工作表
        List<ReadSheet> readSheetList = excelReader.excelExecutor().sheetList();
        for(ReadSheet readSheet : readSheetList){
            excelReader.read(readSheet);
        }
        excelReader.finish();
        return BeanUtil.objectConvertBean(excelListener.getDatas(),clazz);
    }

    /**
     * 返回ExcelReader
     * @param file         文件
     * @param clazz         实体类
     * @param excelListener
     */
    private static <T> ExcelReader getReader(MultipartFile file, Class<T> clazz, ExcelListener excelListener) {
        String filename = file.getOriginalFilename();
        try {
            if (filename == null || (!filename.toLowerCase().endsWith(".xls") && !filename.toLowerCase().endsWith(".xlsx"))) {
                return null;
            }
            InputStream inputStream = new BufferedInputStream(file.getInputStream());
            ExcelReader excelReader = EasyExcel.read(inputStream, clazz, excelListener).build();
            inputStream.close();
            return excelReader;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
