package com.javaWebExam.models.bindingModels;


public class RegisterModel {

    private String username;

    private String password;

    private String confirmPassword;

    public RegisterModel() {
    }

    public RegisterModel(String username, String password, String confurmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confurmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
