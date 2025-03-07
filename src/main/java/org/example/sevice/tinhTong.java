package org.example.sevice;

public class tinhTong {
    public int tongmang(int[] arr){
        if(arr == null){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for(int number : arr){
            if(number <= 100 && number % 5 != 0){
                sum+= number;
            }
        }
        return sum;
    }
}
