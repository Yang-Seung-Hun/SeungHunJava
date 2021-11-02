package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    private final EntityManager em;

    public void save(Item item){
        if(item.getId() == null){//아이디가 없다는 건 새로 생성된 객체라는 거(db에 들어가기 전에 item객체 아이디는 null이니까)
            em.persist(item);//이건 신규 등록
        }
        else{
            em.merge(item);//이건 업데이트 느낌 =>나중에 설명함
        }
    }

    public Item findOne(Long id){
        return em.find(Item.class,id);
    }

    public List<Item> findAll(){
        return em.createQuery("select i from Item i", Item.class).getResultList();
    }
}
