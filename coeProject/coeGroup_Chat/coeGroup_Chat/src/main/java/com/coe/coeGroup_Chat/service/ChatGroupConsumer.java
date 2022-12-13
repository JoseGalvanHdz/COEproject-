package com.coe.coeGroup_Chat.service;

import com.coe.coeGroup_Chat.Entity.GroupChatEntity;
import com.coe.coeGroup_Chat.repository.groupChatRepository;
import com.coeGroupChatProducer.ChatGroupProducer.model.GroupChatDTO;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.Date;

@Service
public class ChatGroupConsumer {
    @Autowired
    private groupChatRepository repository;

    @KafkaListener(topics = "groupchat", groupId = "group_json")
    public void GroupChatEntity(ConsumerRecord<Long, GroupChatDTO> record) throws IOException {
        System.out.println("Received Message: \n" + record.value());
    }

    @KafkaListener(topics = "group_chat", groupId = "group_json")
    public void SaveGroupChat(ConsumerRecord<Long, GroupChatDTO> record) throws IOException {
        GroupChatDTO groupChatDTO = record.value();
        groupChatDTO.setCreated_date(new Date());
        GroupChatEntity entity = new GroupChatEntity(groupChatDTO);
        repository.save(entity);
    }


    @KafkaListener(topics = "group_chat_delete", groupId = "group_json")
    public void deleteGroupChat(ConsumerRecord<Long, Integer> record) throws IOException {
        repository.deleteById(record.value());
        System.out.println("Entity deleted " + record.value());

    }

    @KafkaListener(topics = "group_chat_update", groupId = "group_json")
    public void updateGroupChat(ConsumerRecord<Long, GroupChatDTO> record) throws IOException {
        GroupChatDTO groupChatDTO = record.value();
        GroupChatEntity entity = (repository.findById(groupChatDTO.getId()) == null) ? null :
                repository.findById(groupChatDTO.getId()).get();

        if(entity != null){

            groupChatDTO.setCreated_date(new Date());
            entity = new GroupChatEntity(groupChatDTO);
            repository.save(entity);
        }

    }


}
