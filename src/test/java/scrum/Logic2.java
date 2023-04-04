package scrum;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logic2 {
    public static void main(String[] args) {

    }
    public int blackjack(int a, int b) {
        if((a <= 21 && b > 21)||(a <= 21 && b < a)){
            return a;
        } else if ((b <= 21 && a > 21)||(b <= 21 && b > a)){
            return b;
        }
        return 0;
    }

    @Test
    public void blackjack(){
        Assert.assertEquals(blackjack(20,21),21);

    }


    public int loneSum(int a, int b, int c) {
        if ( a == b && b == c){
            return 0;
        }if (a == b){
            return c;
        }if (b == c){
            return a;
        }if (a == c){
            return b;
        }else{
            return a + b +c;
        }
    }

    }


