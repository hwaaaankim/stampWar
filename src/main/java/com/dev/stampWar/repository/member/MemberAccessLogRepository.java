package com.dev.stampWar.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.stampWar.model.member.MemberAccessLog;

@Repository
public interface MemberAccessLogRepository extends JpaRepository<MemberAccessLog ,Long>{

}
