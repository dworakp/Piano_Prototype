package com.company;

/**
 * Created by student16 on 2015-11-09.
 */
public class Dzwiek {
    int dzwiek;
    public Dzwiek(){};
    public Dzwiek(int input){
        dzwiek = input;
    };

    public void play(){
        if(dzwiek==1){
            System.out.println("Zagrano dzwiek C");
        }else if(dzwiek==2){
            System.out.println("Zagrano dzwiek D");
        }else if(dzwiek==3){
            System.out.println("Zagrano dzwiek E");
        }else if(dzwiek==4) {
            System.out.println("Zagrano dzwiek F");
        }else if(dzwiek==5){
            System.out.println("Zagrano dzwiek C");
        }else if(dzwiek==6){
            System.out.println("Zagrano dzwiek D");
        }else if(dzwiek==7){
            System.out.println("Zagrano dzwiek E");
        }else if(dzwiek==8) {
            System.out.println("Zagrano dzwiek F");
        }

    }
}
