package com.how2java.tmall.pojo;

public class Category {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // trim方法用于删除字符串的头尾空白符
        this.name = name == null ? null : name.trim();
    }
}
