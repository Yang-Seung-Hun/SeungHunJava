package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
//위2개 있어야 테스트를 스프링부트 위에서 할 수 있음
@Transactional//test에서는 기본이 커밋안하고 rollback임  *test트일 때만 그럼
//완정히 데이터베이스 없이도 동작 할려면 test에 resources디렉토리 만들고 거기 yml파일 복붙하고, datasource url에 jdbc:h2:mem:test 쓰면됨 아니면 설정 다 지우거나
public class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;

    @Test
    //@Rollback(false)//comit해서 보고 싶음 => 디비에 저장된다는 의미(test에서 이러면 안되자나)
    public void 회원가입() throws Exception{
        //given
        Member member = new Member();
        member.setName("kim");
        //when
        Long saveId = memberService.join(member);
        //then
        assertEquals(member,memberRepository.findOne(saveId));
    }

    @Test(expected = IllegalStateException.class)//expected 없으면 try catch 구문 써야함
    public void 중복회원예외() throws Exception{
        //given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");
        //when
        memberService.join(member1);
        memberService.join(member2);

//        memberService.join(member1);
//        try{
//            memberService.join(member2);//예외 발생해야함
//        }catch(IllegalStateException e){
//            return;
//        }
        //then
        fail("예외가 발생해야 함");//혹시 테스트 작성 잘못 해서 여기로 올때 처리


    }

}