package com.company;

import java.util.Scanner;

public class PentagonalNumbers {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num > 0) this.num = num;
        else System.out.println("Incorrect variable value");
    }

    public int CombinatoricsChallenge(int num)
    {
        return (int) (1 + (5/2.0 * num * (num - 1)));
    }//1+

}
