package com.example.hamming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingControllerTest {

    @Test
    void counterTest() {
        HammingController test = new HammingController();
        assertEquals(test.counter("101010"),3);
    }
    @Test
    void counterTest2() {
        HammingController test = new HammingController();
        assertEquals(test.counter("12304560789"),9);
    }
    @Test
    void previouInitTest(){
        HammingController test = new HammingController();
        assertEquals(test.getPrevious(),"0");
    }
    @Test
    void previousTest(){
        HammingController test = new HammingController();
        test.counter("12304560789");
        assertEquals(test.getPrevious(),"12304560789");
    }

}