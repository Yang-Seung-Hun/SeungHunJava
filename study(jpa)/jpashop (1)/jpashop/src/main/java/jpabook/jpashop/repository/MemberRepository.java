package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository//스프링빈 등록
@RequiredArgsConstructor
public class MemberRepository {

//    @PersistenceContext//엔티티 매니저 주입 받음
//    private EntityManager em;

    // 위방 법 안써도, 스프링부트 jpa가 생성자 주입도 가능하게 해줌 (원래는 @PersistenceContext 인데 @Autowired 가능하게 해준다는 뭐 그런 말....)
    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findOne(Long id){
        return em.find(Member.class,id);//클래스 타입, PK
    }

    public List<Member> findAll(){
        List<Member> result = em.createQuery("select m from Member m", Member.class).getResultList();//JPQL 사용
        return result;
    }

    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name",Member.class).setParameter("name",name).getResultList();
    }
}
