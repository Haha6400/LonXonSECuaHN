package com.elearningweb.library.dto;

import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
    @Size(min = 2, max = 10, message = "Invalid first name!(2-10 characters)")
    private String firstName;

    @Size(min = 2, max = 10, message = "Invalid last name!(2-10 characters)")
    private String lastName;

    private String username;

    @Size(min = 2, max = 10, message = "Invalid password!(2-10 characters)")
    private String password;

    private String repeatPassword;
}
