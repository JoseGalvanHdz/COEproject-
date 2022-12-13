package com.coe.coeGroup_Chat.controller;


import com.coe.coeGroup_Chat.Entity.GroupChatEntity;
import com.coe.coeGroup_Chat.model.GroupChatDTO;
import com.coe.coeGroup_Chat.repository.groupChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/chat-group-consumer")
public class ChatGroupConsumerController {
    @Autowired
    private groupChatRepository repository;

    @GetMapping("/{idGroupChat}")
    public GroupChatDTO getGroupChatById(@PathVariable("idGroupChat") int idGroupChat){

        if (idGroupChat <= 0){
            return null;
        }
        GroupChatEntity entity = repository.findById(idGroupChat).get();
        return new GroupChatDTO(entity);
    }

    @GetMapping("")
    public List<GroupChatDTO> getGroupChat(){
        List<GroupChatDTO> groupChatDTOS = new ArrayList<>();
        List<GroupChatEntity> groupChatEntities = repository.findAll();
        for (GroupChatEntity entity: groupChatEntities
             ) {
            groupChatDTOS.add(new GroupChatDTO(entity));
        }
        return groupChatDTOS;
    }
}
