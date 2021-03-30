package com.web.guihe.Util.BasicUtil;

import com.web.guihe.Util.Exception.ExceptionCode;
import org.springframework.stereotype.Component;

@Component
public class ReturnResult {

    private String token;       //token秘钥

    private int state;          //返回状态

    private Object message;     //返回结果集

    private ExceptionCode exceptionCode;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

    public ReturnResult(){
        super();
    }

    public ReturnResult(String token,int state,Object message){
        this.token = token;
        this.state = state;
        this.message = message;
    }

    public void success(){
        setState(1);
    }

    public void error(){
        setState(2);
    }

    public void success(Object message){
        setState(1);
        setMessage(message);
    }

    public void error(Object message){
        setState(2);
        setMessage(message);
    }

    //自定义返回
    public void custom(int state,Object message){
        setState(state);
        setMessage(message);
    }

    //返回token秘钥
    public void back(int state,Object message,String token){
        setState(state);
        setMessage(message);
        setToken(token);
    }

    //token异常返回
    public void tokenError(ExceptionCode exceptionCode){
        setState(exceptionCode.getCode());
        setMessage(exceptionCode.getMsg());
        setToken(null);
    }

    public Object tokenRealm(ExceptionCode exceptionCode){
        return new ReturnResult("null",exceptionCode.getCode(),exceptionCode.getMsg());
    }

}
