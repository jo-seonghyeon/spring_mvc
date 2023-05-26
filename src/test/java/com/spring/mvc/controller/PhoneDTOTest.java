package com.spring.mvc.controller;

import com.spring.mvc.controller01.PhoneDTO;
import org.junit.jupiter.api.Test;

public class PhoneDTOTest {

    @Test
    public void phoneDTOtest(){
        PhoneDTO phone = new PhoneDTO();
        phone.getSsd(); // getter 생성 확인됨
        phone.setModelName("SAMSUNG S22"); // setter 동작 여부 확인
        System.out.println("setter 확인: " + phone);
    }
}
