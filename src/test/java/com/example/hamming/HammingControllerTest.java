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
}