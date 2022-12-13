package com.coeGroupChatProducer.ChatGroupProducer.model;

import java.io.Serializable;
import java.util.Date;


public class GroupChatDTO implements Serializable {


    private int id;

    private String name;

    private Date created_date;

    public GroupChatDTO() {

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
