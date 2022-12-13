package com.coe.coeGroup_Chat.Entity;

import com.coe.coeGroup_Chat.model.GroupChatDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "group_chat")
public class GroupChatEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create_date", nullable = false)
    private Date created_date;


    public GroupChatEntity() {

    }

    public GroupChatEntity(GroupChatDTO groupChatDTO) {
        this.id = groupChatDTO.getId();
        this.name = groupChatDTO.getName();
        this.created_date = new Date();

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
}
