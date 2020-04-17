/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author giao-lang
 */
public class MyToys {
    
    //class này chứa các hàm tiện ích xài chung cho mọi dự án, nơi
    //nó sẽ là static
    //cF: compute Factorial, tính n! giai thừa = 1.2.3...n
    //trong đó n >= 0, 0! = 1; 
    //n! bùng nổ value nhanh lắm, cho nên xài long lưu kết quả
    //15! to lắm rồi
    //dành cho CI/Continuous Integration, đệ quy recursion sau
    public static long cF(int n) {
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("n must be between 0..15");
        
        if(n == 0 || n == 1)
            return 1;
        return n * cF(n - 1);
        
        //đệ quy, pro, recursion - con búp bê Nga
        //mở búp bê/thấy con nhỏ hơn y chang/mở con nhỏ, thấy nhỏ hơn nữa.... 6 con hết
        //đệ quy: gọi lại chính mình với quy mô nhỏ hơn
        //4! = 4 x 3!; 3! = 3 x 2!; 2! = 2 x 1!; 1! = 1;
        
        
        
        
//        //đến đây n 1..15
//        long product = 1; //biến nhân dồn, gom, tích lũy accumulation
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        return product;
    }
}

//stackoverflow.com
