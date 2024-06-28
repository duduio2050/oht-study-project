package oht.club;

import oht.club.member.Impl.MemberRepositoryImpl;
import oht.club.member.Member;
import oht.club.member.MemberRepository;
import oht.club.member.enums.Lane;
import oht.club.member.enums.Tier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MemberApplication {

    public static void main(String[] args) {

        // 현재 날짜와 시간을 얻음
        LocalDateTime now = LocalDateTime.now();

        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // LocalDateTime을 문자열로 포맷팅
        String formattedDateTime = now.format(formatter);

        Member member = new Member(1L, 29, Lane.MID, Lane.JUNGLE, Tier.EMERALD, "오현택", 3.5);
        MemberRepository memberRepository = new MemberRepositoryImpl();
    }
}
