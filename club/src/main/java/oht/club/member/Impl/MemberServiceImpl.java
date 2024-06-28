package oht.club.member.Impl;

import oht.club.member.Member;
import oht.club.member.MemberRepository;
import oht.club.member.MemberService;

public class MemberServiceImpl implements MemberService {

    public final MemberRepository memberRepository = new MemberRepositoryImpl();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }
}
