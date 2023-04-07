
package com.distribuidora;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encriptar {
    public static void main(String[] args) {
        var codigo = new BCryptPasswordEncoder();
        System.out.println("Yeikel (123): "+codigo.encode("123"));
        System.out.println("Priscilla (456): "+codigo.encode("456"));
        System.out.println("Adrian (789): "+codigo.encode("789"));
    }
}
