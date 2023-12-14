package com.nexlesoft.evalution.dto;

import com.nexlesoft.evalution.model.User;

import lombok.Data;

@Data
public class UserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String displayName;

    public UserDTO(User user){
        id = user.getId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        displayName = user.getFirstName() + user.getLastName();
    }
}
