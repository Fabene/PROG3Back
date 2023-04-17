package com.hei.school.myapp;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Abstract1 {
    @Autowired
    protected ConcreteDependance1 concreteDependance1;
    @Autowired
    protected ConcreteDependance2 concreteDependance2;
}
