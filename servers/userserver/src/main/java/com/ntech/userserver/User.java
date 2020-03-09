package com.ntech.userserver;

import javax.validation.constraints.Email;

/**
 * @author dan
 */
public class User {

    @Email
    private String email;

    private String name;

    private String password;

}
