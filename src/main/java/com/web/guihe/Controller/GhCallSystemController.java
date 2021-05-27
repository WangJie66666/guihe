package com.web.guihe.Controller;

import com.web.guihe.Service.GhCallSystemService;
import com.web.guihe.Util.BasicUtil.CallSystemUtil;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import com.web.guihe.Util.Mqtt.MqttPushClient;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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
    public ReturnResult selectGroup(Integer cNum){
        return ghCallSystemService.selectGroup(cNum);
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

    /**
     * 根据呼叫中心id查询信息
     * @param cId
     * @return
     */
    @PostMapping("/findCallOne")
    @RequiresRoles(value = {"admin","IT"},logical = Logical.OR)
    public ReturnResult selectByPrimaryKey(Integer cId){
        return ghCallSystemService.selectByPrimaryKey(cId);
    }

    /**
     * 呼叫中心编辑/添加
     * @param callSystemUtil
     * @return
     */
    @PostMapping("/addAndEdit")
    @RequiresRoles(value = {"admin","IT"},logical = Logical.OR)
    public ReturnResult updateCallSystem(@RequestBody  CallSystemUtil callSystemUtil) throws IOException {
        return ghCallSystemService.updateCallSystem(callSystemUtil);
    }

    @Autowired
    private MqttPushClient mqttPushClient;

    @PostMapping("/Get")
    @RequiresRoles(value = {"admin","IT"},logical = Logical.OR)
    public ReturnResult test() throws MqttException {
        /*  订阅主题 */
        String topic = "key_login";
        /*mqttPushClient.subscribe(topic,1);*/
        /* 发布消息 */
        String message = "我是一个大帅哥!";
        mqttPushClient.publish(1,false,topic,message);
        returnResult.success();
        return returnResult;
    }

}
