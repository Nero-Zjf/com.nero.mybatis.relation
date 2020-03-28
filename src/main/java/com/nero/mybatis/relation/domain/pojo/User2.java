package com.nero.mybatis.relation.domain.pojo;

import java.util.Date;

/**
 * 用户POJO类-以字段的形式关联身份证信息
 */
public class User2 {
    private long id; // 主键
    private String name;
    private String sex;
    private String cardNum;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"name\":\"" + name + '\"' +
                ", \"sex\":\"" + sex + '\"' +
                ", \"cardNum\":\"" + cardNum + '\"' +
                ", \"date\":" + date +
                '}';
    }
}
