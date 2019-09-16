package cn.itsource.util;

/**
 * @author wangshen
 * @date 2019/9/16 21:18
 * 主要功能说明：
 */
public class AjaxResult {
    private boolean success = true;
    private String message;
    private int errorCode;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    //如果调用这个方法,则创建的是成功时的错误信息
    public AjaxResult(String message){
        this.message = message;
    }

    //失败的封装
    public AjaxResult(String message,int errorCode){
        this.success = false;
        this.message = message;
        this.errorCode = errorCode;
    }

}
