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
public class Stu extends Model<Stu> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String tname;

    private String sex;

    private String tel;

    private String addr;

    private String fruit;

    private String hobbit;

    private String grade;

    private String email;

    private String tname2;

    private String sex2;

    private String tel2;

    private String addr2;

    private String fruit2;

    private String hobbit2;

    private String grade2;

    private String email2;

    private Integer version;

    private String disabled;

    private String CREATED_BY;

    private LocalDateTime CREATED_DATE;

    private String LAST_MODIFIED_BY;

    private LocalDateTime LAST_MODIFIED_DATE;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTname2() {
        return tname2;
    }

    public void setTname2(String tname2) {
        this.tname2 = tname2;
    }

    public String getSex2() {
        return sex2;
    }

    public void setSex2(String sex2) {
        this.sex2 = sex2;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getFruit2() {
        return fruit2;
    }

    public void setFruit2(String fruit2) {
        this.fruit2 = fruit2;
    }

    public String getHobbit2() {
        return hobbit2;
    }

    public void setHobbit2(String hobbit2) {
        this.hobbit2 = hobbit2;
    }

    public String getGrade2() {
        return grade2;
    }

    public void setGrade2(String grade2) {
        this.grade2 = grade2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public LocalDateTime getCREATED_DATE() {
        return CREATED_DATE;
    }

    public void setCREATED_DATE(LocalDateTime CREATED_DATE) {
        this.CREATED_DATE = CREATED_DATE;
    }

    public String getLAST_MODIFIED_BY() {
        return LAST_MODIFIED_BY;
    }

    public void setLAST_MODIFIED_BY(String LAST_MODIFIED_BY) {
        this.LAST_MODIFIED_BY = LAST_MODIFIED_BY;
    }

    public LocalDateTime getLAST_MODIFIED_DATE() {
        return LAST_MODIFIED_DATE;
    }

    public void setLAST_MODIFIED_DATE(LocalDateTime LAST_MODIFIED_DATE) {
        this.LAST_MODIFIED_DATE = LAST_MODIFIED_DATE;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Stu{" +
        "id=" + id +
        ", tname=" + tname +
        ", sex=" + sex +
        ", tel=" + tel +
        ", addr=" + addr +
        ", fruit=" + fruit +
        ", hobbit=" + hobbit +
        ", grade=" + grade +
        ", email=" + email +
        ", tname2=" + tname2 +
        ", sex2=" + sex2 +
        ", tel2=" + tel2 +
        ", addr2=" + addr2 +
        ", fruit2=" + fruit2 +
        ", hobbit2=" + hobbit2 +
        ", grade2=" + grade2 +
        ", email2=" + email2 +
        ", version=" + version +
        ", disabled=" + disabled +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_DATE=" + CREATED_DATE +
        ", LAST_MODIFIED_BY=" + LAST_MODIFIED_BY +
        ", LAST_MODIFIED_DATE=" + LAST_MODIFIED_DATE +
        "}";
    }
}
