package Pojjoo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Constructtt {
    @JsonSerialize
    private String email;
    @JsonSerialize
    private String password;
    public Constructtt(String email,String password){
        this.email=email;
        this.password=password;
    }
}
