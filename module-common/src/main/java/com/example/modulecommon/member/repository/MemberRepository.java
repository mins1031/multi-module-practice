package com.example.modulecommon.member.repository;

import com.example.modulecommon.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
