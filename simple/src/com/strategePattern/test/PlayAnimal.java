package com.strategePattern.test;

public class PlayAnimal {
    
    public static void main(String[] args){            // 어플리케이션 실행
        
        Animal tiger = new Tiger();                    // Animal의 Tiger 객체 생성
        
        tiger.display();                            // 호랑이의 모습
        tiger.move();                                // 호랑이 움직이기
        tiger.cry();                                // 호랑이 울기
        
        System.out.println("------------------");
        
        Animal eagle = new Eagle();                    // Animal의 Eagle 객체 생성
        
        eagle.display();                            // 독수리의 모습
        eagle.move();                                // 독수리의 움직이기
        eagle.cry();                                // 독수리의 울기
    }
}
