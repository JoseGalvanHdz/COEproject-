package com.coe.coeGroup_Chat.service;

import com.coe.coeGroup_Chat.repository.GroupChatAdminRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GroupChatAdminConsumer {
    @Autowired
    private GroupChatAdminRepository groupChatAdminRepository;

    @KafkaListener(topics = "group-chat-admin", groupId = "group_json")
    public void getId(ConsumerRecord<Long, Integer> record) throws IOException {
        groupChatAdminRepository.getReferenceById(record.value());
        System.out.println("Successful");


    }
}
