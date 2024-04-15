package lxj.engineering.demos.web.dto;


import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功message
     */
    public static final String SUCCESS_MESSAGE = "SUCCESS";
    /**
     * 成功code
     */
    public static final String SUCCESS_CODE = "200";

    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 响应信息
     */
    private String msg;

    public Result() {
    }

    public Result(String code, String msg, T data) {
        this.code = code == null ? "0" : code.toString();
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> defaultSuccess(T data) {
        return new Result<T>(SUCCESS_CODE, SUCCESS_MESSAGE, data);
    }

    public static <T> Result<T> defaultSuccess(String msg, T data) {
        return new Result<T>(SUCCESS_CODE, msg, data);
    }

    public static <T> Result<T> defaultFail(String code, String msg, T... data) {
        return new Result<>(code, msg, data != null && data.length > 0 ? data[0] : null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
}