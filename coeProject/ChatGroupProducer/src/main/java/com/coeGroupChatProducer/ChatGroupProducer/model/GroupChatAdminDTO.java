package com.coeGroupChatProducer.ChatGroupProducer.model;


public class GroupChatAdminDTO {

    private int id;
    private int customer_id;
    private int group_chat_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getGroup_chat_id() {
        return group_chat_id;
    }

    public void setGroup_chat_id(int group_chat_id) {
        this.group_chat_id = group_chat_id;
    }

    @Override
    public String toString() {
        return "GroupChatAdminDTO{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", group_chat_id=" + group_chat_id +
                '}';
    }
}
