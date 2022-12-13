package com.coe.coeGroup_Chat.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "group_chat_admin")
public class groupChatAdminEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",referencedColumnName ="id", nullable = false)
    private CustomerEntity customer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_chat_id",referencedColumnName ="id", nullable = false)
    private GroupChatEntity groupChat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerEntity getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(CustomerEntity customer_id) {
        this.customer_id = customer_id;
    }

    public GroupChatEntity getGroupChat() {
        return groupChat;
    }

    public void setGroupChat(GroupChatEntity groupChat) {
        this.groupChat = groupChat;
    }
}
