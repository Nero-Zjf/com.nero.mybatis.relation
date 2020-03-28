package com.nero.mybatis.relation.domain.po;

/**
 * user表对应的PO类
 */
public class UserPO {
    private long id; // 主键
    private String name;
    private String sex;

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

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"name\":\"" + name + '\"' +
                ", \"sex\":\"" + sex + '\"' +
                '}';
    }
}
