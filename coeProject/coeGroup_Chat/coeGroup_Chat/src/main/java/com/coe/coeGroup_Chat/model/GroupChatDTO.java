package com.coe.coeGroup_Chat.model;

import com.coe.coeGroup_Chat.Entity.GroupChatEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


public class GroupChatDTO implements Serializable {


    private int id;

    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date created_date;

    public GroupChatDTO(GroupChatEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.created_date = entity.getCreated_date();
    }


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

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "GroupChatEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created_date=" + created_date +
                '}';
    }
}
