package com.frame.frame.web.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.frame.frame.base.entity.XSuperLogicEntity;
import lombok.Data;

@Data
//public class Stu extends Model<Stu> {
public class Stu extends XSuperLogicEntity<Stu> {
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



//    public Stu(Integer id, String tname, String sex, String tel, String addr, String fruit, String hobbit, String grade, String email, String tname2, String sex2, String tel2, String addr2, String fruit2, String hobbit2, String grade2, String email2) {
//        this.id = id;
//        this.tname = tname;
//        this.sex = sex;
//        this.tel = tel;
//        this.addr = addr;
//        this.fruit = fruit;
//        this.hobbit = hobbit;
//        this.grade = grade;
//        this.email = email;
//        this.tname2 = tname2;
//        this.sex2 = sex2;
//        this.tel2 = tel2;
//        this.addr2 = addr2;
//        this.fruit2 = fruit2;
//        this.hobbit2 = hobbit2;
//        this.grade2 = grade2;
//        this.email2 = email2;
//    }
//
//    public Stu() {
//        super();
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTname() {
//        return tname;
//    }
//
//    public void setTname(String tname) {
//        this.tname = tname == null ? null : tname.trim();
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex == null ? null : sex.trim();
//    }
//
//    public String getTel() {
//        return tel;
//    }
//
//    public void setTel(String tel) {
//        this.tel = tel == null ? null : tel.trim();
//    }
//
//    public String getAddr() {
//        return addr;
//    }
//
//    public void setAddr(String addr) {
//        this.addr = addr == null ? null : addr.trim();
//    }
//
//    public String getFruit() {
//        return fruit;
//    }
//
//    public void setFruit(String fruit) {
//        this.fruit = fruit == null ? null : fruit.trim();
//    }
//
//    public String getHobbit() {
//        return hobbit;
//    }
//
//    public void setHobbit(String hobbit) {
//        this.hobbit = hobbit == null ? null : hobbit.trim();
//    }
//
//    public String getGrade() {
//        return grade;
//    }
//
//    public void setGrade(String grade) {
//        this.grade = grade == null ? null : grade.trim();
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email == null ? null : email.trim();
//    }
//
//    public String getTname2() {
//        return tname2;
//    }
//
//    public void setTname2(String tname2) {
//        this.tname2 = tname2 == null ? null : tname2.trim();
//    }
//
//    public String getSex2() {
//        return sex2;
//    }
//
//    public void setSex2(String sex2) {
//        this.sex2 = sex2 == null ? null : sex2.trim();
//    }
//
//    public String getTel2() {
//        return tel2;
//    }
//
//    public void setTel2(String tel2) {
//        this.tel2 = tel2 == null ? null : tel2.trim();
//    }
//
//    public String getAddr2() {
//        return addr2;
//    }
//
//    public void setAddr2(String addr2) {
//        this.addr2 = addr2 == null ? null : addr2.trim();
//    }
//
//    public String getFruit2() {
//        return fruit2;
//    }
//
//    public void setFruit2(String fruit2) {
//        this.fruit2 = fruit2 == null ? null : fruit2.trim();
//    }
//
//    public String getHobbit2() {
//        return hobbit2;
//    }
//
//    public void setHobbit2(String hobbit2) {
//        this.hobbit2 = hobbit2 == null ? null : hobbit2.trim();
//    }
//
//    public String getGrade2() {
//        return grade2;
//    }
//
//    public void setGrade2(String grade2) {
//        this.grade2 = grade2 == null ? null : grade2.trim();
//    }
//
//    public String getEmail2() {
//        return email2;
//    }
//
//    public void setEmail2(String email2) {
//        this.email2 = email2 == null ? null : email2.trim();
//    }
}