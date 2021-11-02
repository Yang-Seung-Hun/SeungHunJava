package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)//데이터 변경은 transactional 안에서 일어나야함 디폴트는 읽기전용 아님 => 읽기 말고 데이터 변경 로직에 transactional 붙여줌
@RequiredArgsConstructor
public class MemberService {
//    //필드 주입
//    @Autowired
//    private MemberRepository memberRepository;

//    //세터 주입
//    private MemberRepository memberRepository;
//    @Autowired
//    public void setMemberRepository(MemberRepository memberRepository){
//        this.memberRepository = memberRepository;
//    }

    //생성자 주입 => 위 두개보다 생성자 주입을 쓰자
    private final MemberRepository memberRepository;
//    @Autowired//생성자 한개일때는 생략 해도 됨, lombok @RequiredArgsConstructor 는 final 붙은 걸로 생성자 한개 저절로 만들어줌
//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    //회원가입
    @Transactional//데이터 변경 부분
    public Long join(Member member){
        validateDuplicateMember(member);//중복 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    //회원 전체 조회
    public List<Member> findMembers(){ return memberRepository.findAll(); }

    //회원 아이디로 조회
    public Member findOne(Long memberId){
        return memberRepository.findOne(memberId);
    }

}