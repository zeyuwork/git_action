package com.example.git_action.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class testResponse {
    boolean success;
    String message;

}
