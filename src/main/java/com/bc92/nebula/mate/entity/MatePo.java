package com.bc92.nebula.mate.entity;

import java.io.Serializable;

/**
 * Created by leehotin
 * Date: 2018/5/18  上午7:37
 * To change this template use File | Settings | FileTemplates
 */
public class MatePo implements Serializable {

    private int id;
    private String name;
    private String nick;
    private String phone;
    private String address;
    private int icon;
    private int clazz;//班级  92
    private String company;
    private String companyAddress;//公司地址
    private String college;//大学
    private String collegeAddress;//大学地址

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
