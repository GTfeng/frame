package com.frame.frame.base;

import com.baomidou.mybatisplus.extension.api.IErrorCode;
import com.baomidou.mybatisplus.extension.enums.ApiErrorCode;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Optional;

/**
 * @Author shr
 * @Date 2020-01-21 14:33
 * @Version 1.0
 */

@Data
@Accessors
public class XR<T> implements Serializable {
    /**
     * 业务错误码
     */
    private long code;
    /**
     * 结果集
     */
    private T data;
    /**
     * 描述
     */
    private String msg;

    private boolean success;

    private long time;

    public XR() {
        // to do nothing
    }

    public XR(IErrorCode errorCode) {
        errorCode = Optional.ofNullable(errorCode).orElse(ApiErrorCode.FAILED);
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public static <T> XR<T> ok(T data) {
        ApiErrorCode aec = ApiErrorCode.SUCCESS;
        if (data instanceof Boolean && Boolean.FALSE.equals(data)) {
            aec = ApiErrorCode.FAILED;
        }
        return restResult(data, aec);
    }

    public static <T> XR<T> failed(String msg) {
        return restResult(null, ApiErrorCode.FAILED.getCode(), msg);
    }

    public static <T> XR<T> failed(IErrorCode errorCode) {
        return restResult(null, errorCode);
    }

    public static <T> XR<T> restResult(T data, IErrorCode errorCode) {
        return restResult(data, errorCode.getCode(), errorCode.getMsg());
    }

    private static <T> XR<T> restResult(T data, long code, String msg) {
        XR<T> apiResult = new XR<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);

        // NOTICE extjs 需要在根节点有success属性，否则form.load会无法正确触发success回调
        boolean success = apiResult.getCode() == ApiErrorCode.SUCCESS.getCode();
        apiResult.setSuccess(success);


        apiResult.setTime(System.currentTimeMillis());

        return apiResult;
    }

    public boolean ok() {
        return ApiErrorCode.SUCCESS.getCode() == code;
    }

    /**
     * 服务间调用非业务正常，异常直接释放
     */
    public T serviceData() {
        if (!ok()) {
            throw new ApiException(this.msg);
        }
        return data;
    }
}
