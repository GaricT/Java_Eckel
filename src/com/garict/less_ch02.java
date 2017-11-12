package com.garict;
import java.util.*;

class tstclass01 {
    int fI;
    String fTxt;
    int storage (String s){
        return s.length() * 2;
    }
}

public class less_ch02 {
    public static void main (String[] args){
        tstclass01 vTstCl = new tstclass01();
        vTstCl.fTxt = "New data";
        System.out.println("fI = " + vTstCl.fI);
        System.out.println("fTxt = " + vTstCl.fTxt);
        System.out.println("storage() = " + vTstCl.storage(vTstCl.fTxt));

    }

}
