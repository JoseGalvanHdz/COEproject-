package com.coe.coeGroup_Chat.controller;

import com.coe.coeGroup_Chat.repository.GroupChatAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/chat-group-admin-consumer")
public class GroupChatAdminController {

    private GroupChatAdminRepository groupChatAdminRepository;

    @Autowired
    public GroupChatAdminController(GroupChatAdminRepository groupChatAdminRepository) {
        this.groupChatAdminRepository = groupChatAdminRepository;
    }


}
