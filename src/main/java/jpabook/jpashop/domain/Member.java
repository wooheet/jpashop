package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    // 연관 관계의 주인이 아니다. (읽기전용)
    // 오더 테이블에 있는 멤버 필드에 의해서 맵핑 된거야
    @OneToMany(mappedBy = "member") // 나는 member필드에 의해 맵핑된 거울일 뿐이
    private List<Order> orders = new ArrayList<>();
}
