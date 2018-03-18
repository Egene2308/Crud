package com.djamware.angular.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {
    @Id
    String id;
    String name;
    String lastname;
    String age;
    String phone;
    String email;
    String idnumber;

    public Contact() {
    }


    public Contact(String name, String lastname, String age, String phone, String email, String idnumber) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.idnumber =  idnumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname= lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
}
