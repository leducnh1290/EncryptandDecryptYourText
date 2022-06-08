package com.ducanh.encrypt;

import android.content.Context;
import android.widget.Toast;

public class Decrypt {
    public String Decrypt (String input, Context context){
        String string_find_result,a = "";
        int b = 0;
        try {
            while (b < input.length ()) {
                string_find_result = input.trim().substring(b, b + 3);
                if (string_find_result.equals("m+7")) {              //0
                    a += "0";
                } else if (string_find_result.equals("k&v")) { //1
                    a += "1";
                } else if (string_find_result.equals("h^f")) { //2
                    a += "2";
                } else if (string_find_result.equals("P;?")) { //3
                    a += "3";
                } else if (string_find_result.equals("##v")) { //4
                    a += "4";
                } else if (string_find_result.equals("%3F")) { //5
                    a += "5";
                } else if (string_find_result.equals("&g#")) { //6
                    a += "6";
                } else if (string_find_result.equals("!%g")) { //7
                    a += "7";
                } else if (string_find_result.equals("&:^")) { //8
                    a += "8";
                } else if (string_find_result.equals("78$")) { //9
                    a += "9";
                } else if (string_find_result.equals("lqp")) { //A
                    a += "A";
                } else if (string_find_result.equals("KDC")) { //B
                    a += "B";
                } else if (string_find_result.equals("SKC")) { //C
                    a += "C";
                } else if (string_find_result.equals("DCD")) { //D
                    a += "D";
                } else if (string_find_result.equals("DSA")) { //E
                    a += "E";
                } else if (string_find_result.equals("IDM")) { //F
                    a += "F";
                } else if (string_find_result.equals("IXS")) { //G
                    a += "G";
                } else if (string_find_result.equals("SPS")) { //H
                    a += "H";
                } else if (string_find_result.equals("PMD")) { //I
                    a += "I";
                } else if (string_find_result.equals("jsc")) { //J
                    a += "J";
                } else if (string_find_result.equals("pfv")) { //K
                    a += "K";
                } else if (string_find_result.equals("ywc")) { //L
                    a += "L";
                } else if (string_find_result.equals("lco")) { //M
                    a += "M";
                } else if (string_find_result.equals("aic")) { //N
                    a += "N";
                } else if (string_find_result.equals("cps")) { //O
                    a += "O";
                } else if (string_find_result.equals("msu")) { //P
                    a += "P";
                } else if (string_find_result.equals("psn")) { //Q
                    a += "Q";
                } else if (string_find_result.equals("p38")) { //R
                    a += "R";
                } else if (string_find_result.equals("c47")) { //S
                    a += "S";
                } else if (string_find_result.equals("o49")) { //T
                    a += "T";
                } else if (string_find_result.equals("b9d")) { //U
                    a += "U";
                } else if (string_find_result.equals("c3j")) { //V
                    a += "V";
                } else if (string_find_result.equals("m0s")) { //W
                    a += "W";
                } else if (string_find_result.equals("mr3")) { //X
                    a += "X";
                } else if (string_find_result.equals("mo2")) { //Y
                    a += "Y";
                } else if (string_find_result.equals("md8")) { //Z
                    a += "Z";
                } else if (string_find_result.equals("n2v")) { //a
                    a += "a";
                } else if (string_find_result.equals("p9a")) { //b
                    a += "b";
                } else if (string_find_result.equals("fn3")) { //c
                    a += "c";
                } else if (string_find_result.equals("x9q")) { //d
                    a += "d";
                } else if (string_find_result.equals("lf4")) { //e
                    a += "e";
                } else if (string_find_result.equals("lm;")) { //f
                    a += "f";
                } else if (string_find_result.equals("m'f")) { //g
                    a += "g";
                } else if (string_find_result.equals("''3")) { //h
                    a += "h";
                } else if (string_find_result.equals("m-e")) { //i
                    a += "i";
                } else if (string_find_result.equals("$$f")) { //j
                    a += "j";
                } else if (string_find_result.equals(".,f")) { //k
                    a += "k";
                } else if (string_find_result.equals("/<f")) { //l
                    a += "l";
                } else if (string_find_result.equals("kf/")) { //m
                    a += "m";
                } else if (string_find_result.equals("pr/")) { //n
                    a += "n";
                } else if (string_find_result.equals("e=d")) { //o
                    a += "o";
                } else if (string_find_result.equals("l+w")) { //p
                    a += "p";
                } else if (string_find_result.equals("$fv")) { //q
                    a += "q";
                } else if (string_find_result.equals("&3f")) { //r
                    a += "r";
                } else if (string_find_result.equals("p(e")) { //s
                    a += "s";
                } else if (string_find_result.equals("p-g")) { //t
                    a += "t";
                } else if (string_find_result.equals("--f")) { //u
                    a += "u";
                } else if (string_find_result.equals("ls=")) { //v
                    a += "v";
                } else if (string_find_result.equals("'(f")) { //w
                    a += "w";
                } else if (string_find_result.equals("q=$")) { //x
                    a += "x";
                } else if (string_find_result.equals("m}&")) { //y
                    a += "y";
                } else if (string_find_result.equals("lb<")) { //z
                    a += "z";
                } else if (string_find_result.equals("14m")) { //
                    a += "/";
                } else if (string_find_result.equals("10.")) { //ẩ
                    a += "+";
                } else if (string_find_result.equals("1m.")) { //đ
                    a += "=";
                }
                b += 3;
            }
        }catch (Exception E){

        }
        if(b!=0&&a.length()!=0){
            Toast.makeText (context,"Giải mã thành công !",Toast.LENGTH_SHORT).show ();
        }else{
            Toast.makeText (context,"Vui Lòng nhập chuỗi đã được mã hoá !",Toast.LENGTH_SHORT).show ();
        }
        return a;
    }
}
