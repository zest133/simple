package com.strategePattern.test;

public abstract class Animal {   // Animal 추상 클래스 
    
    public Animal(){
        
    }
    
    public void cry(){                    // 동물의 울기
        System.out.println("운다.");
    }
 
    public void move(){                    // 동물의 움직이기
        System.out.println("움직인다");
    }
    
    public void display(){                // 동물의 모습
        System.out.println("모습");
    }
}
 

