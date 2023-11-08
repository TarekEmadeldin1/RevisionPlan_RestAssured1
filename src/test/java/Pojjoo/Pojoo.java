package Pojjoo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Pojoo {
    @JsonSerialize
    private String Email;
    @JsonSerialize
    private String Password;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
