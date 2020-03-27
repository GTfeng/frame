package com.frame.frame.base.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

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



    @Override
    protected Serializable pkVal() {
        return null;
    }
}
