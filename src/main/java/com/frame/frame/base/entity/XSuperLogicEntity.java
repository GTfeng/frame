package com.frame.frame.base.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author shr
 * @Date 2020-03-27 10:17
 * @Version 1.0
 */
@Data
public class XSuperLogicEntity<T extends Model> extends Model {

    @TableLogic
    private Integer disabled;

    @Version
    private Integer version;

    private String createdBy;

    private Date createdDate;

    private String lastModifiedBy;

    private Date  lastModifiedDate;



    @Override
    protected Serializable pkVal() {
        return null;
    }
}
