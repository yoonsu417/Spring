package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //Optional: null을 그대로 반환하지않고, Optional에 한번 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
