package com.coeGroupChatProducer.ChatGroupProducer.controller;


import com.coeGroupChatProducer.ChatGroupProducer.model.GroupChatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("group-chat")
public class kafkaController {
    @Autowired
    private KafkaTemplate<String, GroupChatDTO> kafkaUserTemplate;
    @Autowired
    private KafkaTemplate<String, Integer> integerKafkaTemplate;


    @GetMapping("/produce/{name}")
    public String myMessage(@PathVariable("name") final String name){
        GroupChatDTO groupChatEntity = new GroupChatDTO();
        groupChatEntity.setName(name);
        kafkaUserTemplate.send("chatGroupEntity", groupChatEntity);
        return "Message Published Successfully";
    }

    @PostMapping("/produce/{name}")
    public String save(@PathVariable("name") String name) {
        GroupChatDTO chatDTO = new GroupChatDTO();
        chatDTO.setName(name);
        kafkaUserTemplate.send("group_chat", chatDTO);
        return "Ya se hizo el guiso";
    }

    @DeleteMapping("/produce/{idGroupChat}")
    public String delete(@PathVariable("idGroupChat") int idGroupChat) {
        integerKafkaTemplate.send("group_chat_delete", idGroupChat);
        return "Ya se hizo el guiso con el id";
    }

    @PutMapping("")
    public String update(@RequestBody GroupChatDTO groupChatDTO) {
        if (groupChatDTO.getId() <= 0)
            return "Nimodo perrillo será pa la otra";
        kafkaUserTemplate.send("group_chat_update", groupChatDTO);
        return "GroupChat was uploaded";
    }
}
