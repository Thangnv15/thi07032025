package org.example.sevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhTongTest {
    //so duong
    tinhTong tinhTong = new tinhTong();
    @Test
    void tongmang() {
        int[] arr = {1,101,2,4};
        assertEquals(7, tinhTong.tongmang(arr));
    }
    //so am
    @Test
    void tongmang2() {
        int[] arr = {-1,-101,-2,-4};
        assertEquals(-108,tinhTong.tongmang(arr));
    }
    //so 0
    @Test
    void tongmang3() {
        int[] arr = {0};
        assertEquals(0, tinhTong.tongmang(arr));
    }
    //mang rong
    @Test
    void tongmang4() {
        int[] arr = {};
        assertEquals(0, tinhTong.tongmang(arr));
    }
    //null
    @Test
    void tongmang5() {
        int[] arr = null;
        assertThrows(IllegalArgumentException.class, () -> tinhTong.tongmang(null));
    }
}