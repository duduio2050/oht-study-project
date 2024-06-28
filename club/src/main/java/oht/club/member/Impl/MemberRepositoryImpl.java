package oht.club.member.Impl;

import java.util.HashMap;
import java.util.Map;

import oht.club.member.Member;
import oht.club.member.MemberRepository;

public class MemberRepositoryImpl implements MemberRepository {

    private final static Map<Long, Member> memberStore = new HashMap<>();

    @Override
    public void save(Member member) {
        memberStore.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return memberStore.get(id);
    }
}
