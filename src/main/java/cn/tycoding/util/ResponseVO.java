package cn.tycoding.util;

/**
 * @Author: xck
 * @File: ResponseVO
 * @Time: 0:41 2020/4/4
 */
public class ResponseVO<T> {
    private T data;
    private String msg;
    private int code;

    public ResponseVO(T data, String msg, int code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public ResponseVO() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public static ResponseVO success(Object t){
        return new ResponseVO(t,"success",200);
    }

    public static ResponseVO error(Object t){
        return new ResponseVO(t,"error",500);
    }

    public static ResponseVO failed(Object t){
        return new ResponseVO(t,"failed",400);
    }

}
