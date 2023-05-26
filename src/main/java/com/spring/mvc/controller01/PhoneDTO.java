package com.spring.mvc.controller01;

import lombok.Data;

// LOMBOK 사용법
@Data // 자동으로 getter, setter 생성자 등을 만들어줍니다.
public class PhoneDTO {
    private String ModelName; // 폰 모델명
    private int price; // 폰 가격
    private int ssd; // 폰 용량

    @Override
    public String toString(){
        return "재정의된 toString() 메서드";
    }

}
