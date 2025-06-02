package org.example;

import org.example.exception.InvalidPassword;
import org.example.exception.SignUpException;

import java.util.HashSet;
import java.util.Set;

public class SignUp {
    static Set<String> set = new HashSet<String>();

    public void signUp(String username, String password) {
        if (set.contains(username)) {
            throw new SignUpException("Username is already in use");
        }

        if (password.length() < 6) {
            throw new InvalidPassword("Password must be at least 6 characters");
        }
        set.add(username);
    }
}
