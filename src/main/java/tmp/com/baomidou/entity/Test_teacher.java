package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shr
 * @since 2020-03-26
 */
public class Test_teacher extends Model<Test_teacher> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String t_name;

    private String t_password;

    private String sex;

    private String description;

    private String pic_url;

    private String school_name;

    private LocalDateTime regist_date;

    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public LocalDateTime getRegist_date() {
        return regist_date;
    }

    public void setRegist_date(LocalDateTime regist_date) {
        this.regist_date = regist_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Test_teacher{" +
        "id=" + id +
        ", t_name=" + t_name +
        ", t_password=" + t_password +
        ", sex=" + sex +
        ", description=" + description +
        ", pic_url=" + pic_url +
        ", school_name=" + school_name +
        ", regist_date=" + regist_date +
        ", remark=" + remark +
        "}";
    }
}
