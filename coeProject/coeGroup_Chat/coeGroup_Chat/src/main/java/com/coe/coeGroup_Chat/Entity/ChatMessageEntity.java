package com.coe.coeGroup_Chat.Entity;

import jakarta.persistence.*;
import java.util.Date;

/*
enum Status {
    Sent,
    Received,
    Seen,
    Error
}
*/
@Entity
@Table(name = "chat_message")
public class ChatMessageEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "chat_message_fk", referencedColumnName = "id")
    private ChatMessageEntity chatMessageId;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "status", nullable = false)
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ChatMessageEntity getChatMessageId() {
        return chatMessageId;
    }

    public void setChatMessageId(ChatMessageEntity chatMessageId) {
        this.chatMessageId = chatMessageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
