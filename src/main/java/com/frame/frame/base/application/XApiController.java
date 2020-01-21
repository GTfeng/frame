package com.frame.frame.base.application;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * @Author shr
 * @Date 2020-01-21 14:37
 * @Version 1.0
 */
public class XApiController extends ApiController {
    private static final Logger LOG = LoggerFactory.getLogger(XApiController.class);

    /**
     * @param result
     */
    protected void checkBindingResult(BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errorList = result.getAllErrors();
            for (ObjectError error : errorList) {
                LOG.error(error.getCode() + " msg=" + error.getDefaultMessage());
            }
            Preconditions.checkNotNull(null, errorList.get(0).getDefaultMessage());
        }
    }
}
