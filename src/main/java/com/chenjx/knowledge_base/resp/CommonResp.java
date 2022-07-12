package com.chenjx.knowledge_base.resp;

public class CommonResp<T> {
    private boolean result = true;
    private String message = "成功";
    private T content;

    //无参按默认
    public CommonResp() {
    }

    //仅内容
    public CommonResp(T content) {
        this.content = content;
    }

    //全参数构造
    public CommonResp(boolean result, String message, T content) {
        this.result = result;
        this.message = message;
        this.content = content;
    }

    //仅返回成功的结果，无所谓内容，如果指定泛型默认object
    public static CommonResp<Object> success() {
        return new CommonResp<Object>();
    }
    //返回有内容的成功结果
    public static <E> CommonResp<E> success(E content){
        return new CommonResp<>(content);
    }
    //返回有内容加信息的结果
    public static <E> CommonResp<E> success(String message, E content){
        return new CommonResp<>(true,message,content);
    }
    //返回失败的信息
    public static <E> CommonResp<E> error(String message, E content){
        return new CommonResp<>(false,message,content);
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
