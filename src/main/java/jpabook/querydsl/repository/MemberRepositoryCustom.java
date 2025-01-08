package jpabook.querydsl.repository;

import jpabook.querydsl.dto.MemberSearchCondition;
import jpabook.querydsl.dto.MemberTeamDto;
import jpabook.querydsl.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
