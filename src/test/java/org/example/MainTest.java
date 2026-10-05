package org.example;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void AddTwo(){
        var calculate = new Main();
        System.out.println(calculate.Add(2,2));
    }
}