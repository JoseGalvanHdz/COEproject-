package com.coeGroupChatProducer.ChatGroupProducer.controller;

import com.coeGroupChatProducer.ChatGroupProducer.model.GroupChatAdminDTO;
import com.coeGroupChatProducer.ChatGroupProducer.model.GroupChatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("group-chat-admin")
public class GroupChatAdminController {


    @Autowired
    private KafkaTemplate<String, GroupChatAdminDTO> kafkaUserTemplate;
    @Autowired
    private KafkaTemplate<String, Integer> integerKafkaTemplate;


  /*  @GetMapping("/admin/{name}")
    public String myMessage(@PathVariable("name") final String name){
        GroupChatAdminDTO groupChatAdminEntity = new GroupChatAdminDTO();
        groupChatAdminEntity.getName(name);
        kafkaUserTemplate.send("chatGroupEntity", groupChatAdminEntity);
        return "Message Published Successfully";
    }
    */

    @GetMapping("/produce/{idGroupChat}")
    public String getId(@PathVariable("idGroupChat") int idGroupChat){
       integerKafkaTemplate.send("group-chat-admin",idGroupChat );
       return "Id was sended";
    }
}
