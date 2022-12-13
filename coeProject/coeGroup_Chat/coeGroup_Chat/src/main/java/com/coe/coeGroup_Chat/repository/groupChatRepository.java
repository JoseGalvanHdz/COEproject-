package com.coe.coeGroup_Chat.repository;

import com.coe.coeGroup_Chat.Entity.GroupChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface groupChatRepository extends JpaRepository<GroupChatEntity,Integer> {

}
