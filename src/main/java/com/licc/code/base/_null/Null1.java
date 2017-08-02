package com.licc.code.base._null;

import java.util.Optional;

import static java.util.Optional.ofNullable;

public class Null1 {

    public Optional<String >  getA(String  a){
        return   Optional.ofNullable(a);
    }
}
