package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //내장 타입 어딘게아 내장이될수있다.
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
