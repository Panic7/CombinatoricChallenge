package com.company;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PentagonalNumbers pn = new PentagonalNumbers();
        pn.setNum(in.nextInt());
        System.out.println(pn.CombinatoricsChallenge(pn.getNum()));

    }
}
