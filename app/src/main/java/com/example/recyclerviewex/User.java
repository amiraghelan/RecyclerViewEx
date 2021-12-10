package com.example.recyclerviewex;

import java.security.PrivateKey;

public class User {
    private String name;
    private String descriptopn;
    private int image;


    public User(String name, String descriptopn, int image) {
        this.name = name;
        this.descriptopn = descriptopn;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescriptopn() {
        return descriptopn;
    }

    public int getImage() {
        return image;
    }
}
