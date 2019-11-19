package com.market.shoppingmall.model.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Header<T> {
    //private static String description;
    //제네릭 타입으로 정의하여 body부분(data)부분을 정의
    //@JsonProperty("transation_time") 원하는 json 타입이름으로 적어 줄 수 있음.
    // 전체적용은 application.properties에 spring.jackson.property-naming-strategy=SNAKE_CASE을
    // 명시하여 전체 적용을 함.

    private LocalDateTime transationTime; //ISO, YYYY-MM-DD hh:mm:ss
    private String resultCode;
    private String description;

    private T data;

    //OK를 보내주는 메서드
    public static <T> Header<T> OK(){
        return (Header<T>)Header.builder().transationTime(LocalDateTime.now()).resultCode("OK").description("OK").build();
    }

    //Data가 들어가 있는 OK를 보내주는 메서드
    public static <T> Header<T> OK(T data){
        return (Header<T>)Header.builder().transationTime(LocalDateTime.now()).resultCode("OK").description("OK").data(data).build();
    }

    //ERROR를 보내주는 메서드
    public static <T> Header<T> ERROR(String description){
        return (Header<T>)Header.builder().transationTime(LocalDateTime.now()).resultCode("ERROR").description(description).build();
    }

}
