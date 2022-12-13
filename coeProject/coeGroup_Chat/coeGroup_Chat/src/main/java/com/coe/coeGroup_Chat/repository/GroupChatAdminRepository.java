package com.coe.coeGroup_Chat.repository;

import com.coe.coeGroup_Chat.Entity.groupChatAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupChatAdminRepository extends JpaRepository<groupChatAdminEntity, Integer> {
}
