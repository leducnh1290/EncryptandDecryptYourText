package com.ducanh.encrypt;

import android.content.Context;
import android.widget.Toast;

public class Encrypt {
    public String Encrypt(String input,Context context) {
        String a = "";
        int b = 0;
        char char_input;
        try {
            while (b < input.length ()) {
                char_input = input.trim().charAt(b);
                if (char_input == '0') {//0
                    a += "m+7";
                } else if (char_input == '1') {//1
                    a += "k&v";
                } else if (char_input == '2') {//2
                    a += "h^f";
                } else if (char_input == '3') {//3
                    a += "P;?";
                } else if (char_input == '4') {//4
                    a += "##v";
                } else if (char_input == '5') {//5
                    a += "%3F";
                } else if (char_input == '6') {//6
                    a += "&g#";
                } else if (char_input == '7') {//7
                    a += "!%g";
                } else if (char_input == '8') {//8
                    a += "&:^";
                } else if (char_input == '9') {//9
                    a += "78$";
                } else if (char_input == 'A') {//A
                    a += "lqp";
                } else if (char_input == 'B') {//B
                    a += "KDC";
                } else if (char_input == 'C') {//C
                    a += "SKC";
                } else if (char_input == 'D') {//D
                    a += "DCD";
                } else if (char_input == 'E') {//E
                    a += "DSA";
                } else if (char_input == 'F') {//F
                    a += "IDM";
                } else if (char_input == 'G') {//G
                    a += "IXS";
                } else if (char_input == 'H') {//H
                    a += "SPS";
                } else if (char_input == 'I') {//I
                    a += "PMD";
                } else if (char_input == 'J') {//J
                    a += "jsc";
                } else if (char_input == 'K') {//K
                    a += "pfv";
                } else if (char_input == 'L') {//L
                    a += "ywc";
                } else if (char_input == 'M') {//M
                    a += "lco";
                } else if (char_input == 'N') {//N
                    a += "aic";
                } else if (char_input == 'O') {//O
                    a += "cps";
                } else if (char_input == 'P') {//P
                    a += "msu";
                } else if (char_input == 'Q') {//Q
                    a += "psn";
                } else if (char_input == 'R') {//R
                    a += "p38";
                } else if (char_input == 'S') {//S
                    a += "c47";
                } else if (char_input == 'T') {//T
                    a += "o49";
                } else if (char_input == 'U') {//U
                    a += "b9d";
                } else if (char_input == 'V') {//V
                    a += "c3j";
                } else if (char_input == 'W') {//W
                    a += "m0s";
                } else if (char_input == 'X') {//X
                    a += "mr3";
                } else if (char_input == 'Y') {//Y
                    a += "mo2";
                } else if (char_input == 'Z') {//Z
                    a += "md8";
                } else if (char_input == 'a') {//a
                    a += "n2v";
                } else if (char_input == 'b') {//b
                    a += "p9a";
                } else if (char_input == 'c') {//c
                    a += "fn3";
                } else if (char_input == 'd') {//d
                    a += "x9q";
                } else if (char_input == 'e') {//e
                    a += "lf4";
                } else if (char_input == 'f') {//f
                    a += "lm;";
                } else if (char_input == 'g') {//g
                    a += "m'f";
                } else if (char_input == 'h') {//h
                    a += "''3";
                } else if (char_input == 'i') {//i
                    a += "m-e";
                } else if (char_input == 'j') {//j
                    a += "$$f";
                } else if (char_input == 'k') {//k
                    a += ".,f";
                } else if (char_input == 'l') {//l
                    a += "/<f";
                } else if (char_input == 'm') {//m
                    a += "kf/";
                } else if (char_input == 'n') {//n
                    a += "pr/";
                } else if (char_input == 'o') {//o
                    a += "e=d";
                } else if (char_input == 'p') {//p
                    a += "l+w";
                } else if (char_input == 'q') {//q
                    a += "$fv";
                } else if (char_input == 'r') {//r
                    a += "&3f";
                } else if (char_input == 's') {//s
                    a += "p(e";
                } else if (char_input == 't') {//t
                    a += "p-g";
                } else if (char_input == 'u') {//u
                    a += "--f";
                } else if (char_input == 'v') {//v
                    a += "ls=";
                } else if (char_input == 'w') {//w
                    a += "'(f";
                } else if (char_input == 'x') {//x
                    a += "q=$";
                } else if (char_input == 'y') {//y
                    a += "m}&";
                } else if (char_input == 'z') {//z
                    a += "lb<";
                }else if(char_input=='/'){
                    a += "14m";
                }else if(char_input=='+'){
                    a += "10.";
                }else if(char_input=='='){
                    a += "1m.";
                }
            b++;
        }
        }catch (Exception E) {

        }
        if(b!=0&&a.trim().length()!=0){
            Toast.makeText (context,"Mã hoá thành công!",Toast.LENGTH_SHORT).show ();
        }else{
            Toast.makeText (context,"Vui Lòng nhập chuỗi cần mã hoá !",Toast.LENGTH_SHORT).show ();
        }
        return a;
    }
}
