package com.ducanh.encrypt;

import android.content.Context;
import android.widget.Toast;

public class Encrypt {
    public String Encrypt(String input,Context context) {
        String a = "";
        for (int i = 0; i < input.length (); i++) {
            if (input.trim ().charAt (i) == '0') {//0
                a += "m+7";
            } else if (input.trim ().charAt (i) == '1') {//1
                a += "k&v";
            } else if (input.trim ().charAt (i) == '2') {//2
                a += "h^f";
            } else if (input.trim ().charAt (i) == '3') {//3
                a += "P;?";
            } else if (input.trim ().charAt (i) == '4') {//4
                a += "##v";
            } else if (input.trim ().charAt (i) == '5') {//5
                a += "%3F";
            } else if (input.trim ().charAt (i) == '6') {//6
                a += "&g#";
            } else if (input.trim ().charAt (i) == '7') {//7
                a += "!%g";
            } else if (input.trim ().charAt (i) == '8') {//8
                a += "&:^";
            } else if (input.trim ().charAt (i) == '9') {//9
                a += "78$";
            } else if (input.trim ().charAt (i) == 'A') {//A
                a += "lqp";
            } else if (input.trim ().charAt (i) == 'B') {//B
                a += "KDC";
            } else if (input.trim ().charAt (i) == 'C') {//C
                a += "SKC";
            } else if (input.trim ().charAt (i) == 'D') {//D
                a += "DCD";
            } else if (input.trim ().charAt (i) == 'E') {//E
                a += "DSA";
            } else if (input.trim ().charAt (i) == 'F') {//F
                a += "IDM";
            } else if (input.trim ().charAt (i) == 'G') {//G
                a += "IXS";
            } else if (input.trim ().charAt (i) == 'H') {//H
                a += "SPS";
            } else if (input.trim ().charAt (i) == 'I') {//I
                a += "PMD";
            } else if (input.trim ().charAt (i) == 'J') {//J
                a += "jsc";
            } else if (input.trim ().charAt (i) == 'K') {//K
                a += "pfv";
            } else if (input.trim ().charAt (i) == 'L') {//L
                a += "ywc";
            } else if (input.trim ().charAt (i) == 'M') {//M
                a += "lco";
            } else if (input.trim ().charAt (i) == 'N') {//N
                a += "aic";
            } else if (input.trim ().charAt (i) == 'O') {//O
                a += "cps";
            } else if (input.trim ().charAt (i) == 'P') {//P
                a += "msu";
            } else if (input.trim ().charAt (i) == 'Q') {//Q
                a += "psn";
            } else if (input.trim ().charAt (i) == 'R') {//R
                a += "p38";
            } else if (input.trim ().charAt (i) == 'S') {//S
                a += "c47";
            } else if (input.trim ().charAt (i) == 'T') {//T
                a += "o49";
            } else if (input.trim ().charAt (i) == 'U') {//U
                a += "b9d";
            } else if (input.trim ().charAt (i) == 'V') {//V
                a += "c3j";
            } else if (input.trim ().charAt (i) == 'W') {//W
                a += "m0s";
            } else if (input.trim ().charAt (i) == 'X') {//X
                a += "mr3";
            } else if (input.trim ().charAt (i) == 'Y') {//Y
                a += "mo2";
            } else if (input.trim ().charAt (i) == 'Z') {//Z
                a += "md8";
            } else if (input.trim ().charAt (i) == 'a') {//a
                a += "n2v";
            } else if (input.trim ().charAt (i) == 'b') {//b
                a += "p9a";
            } else if (input.trim ().charAt (i) == 'c') {//c
                a += "fn3";
            } else if (input.trim ().charAt (i) == 'd') {//d
                a += "x9q";
            } else if (input.trim ().charAt (i) == 'e') {//e
                a += "lf4";
            } else if (input.trim ().charAt (i) == 'f') {//f
                a += "lm;";
            } else if (input.trim ().charAt (i) == 'g') {//g
                a += "m'f";
            } else if (input.trim ().charAt (i) == 'h') {//h
                a += "''3";
            } else if (input.trim ().charAt (i) == 'i') {//i
                a += "m-e";
            } else if (input.trim ().charAt (i) == 'g') {//j
                a += "$$f";
            } else if (input.trim ().charAt (i) == 'k') {//k
                a += ".,f";
            } else if (input.trim ().charAt (i) == 'l') {//l
                a += "/<f";
            } else if (input.trim ().charAt (i) == 'm') {//m
                a += "kf/";
            } else if (input.trim ().charAt (i) == 'n') {//n
                a += "pr/";
            } else if (input.trim ().charAt (i) == 'o') {//o
                a += "e=d";
            } else if (input.trim ().charAt (i) == 'p') {//p
                a += "l+w";
            } else if (input.trim ().charAt (i) == 'q') {//q
                a += "$fv";
            } else if (input.trim ().charAt (i) == 'r') {//r
                a += "&3f";
            } else if (input.trim ().charAt (i) == 's') {//s
                a += "p(e";
            } else if (input.trim ().charAt (i) == 't') {//t
                a += "p-g";
            } else if (input.trim ().charAt (i) == 'u') {//u
                a += "--f";
            } else if (input.trim ().charAt (i) == 'v') {//v
                a += "ls=";
            } else if (input.trim ().charAt (i) == 'w') {//w
                a += "'(f";
            } else if (input.trim ().charAt (i) == 'x') {//x
                a += "q=$";
            } else if (input.trim ().charAt (i) == 'y') {//y
                a += "m}&";
            } else if (input.trim ().charAt (i) == 'z') {//z
                a += "lb<";
            } else if (input.trim ().charAt (i) == '.') {//y
                a += "?rc";
            } else if (input.trim ().charAt (i) == ',') {//z
                a += "dc-";
            } else if (input.trim ().charAt (i) == ' ') {// có dấu thường
                a += "L0z";
            } else if (input.trim ().charAt (i) == 'á') {//á
                a += "vP&";
            } else if (input.trim ().charAt (i) == 'à') {//à
                a += "l&M";
            } else if (input.trim ().charAt (i) == 'ả') {//ả
                a += "dA&";
            } else if (input.trim ().charAt (i) == 'ạ') {//ạ
                a += "mE$";
            } else if (input.trim ().charAt (i) == 'ã') {//ã
                a += "M&f";
            } else if (input.trim ().charAt (i) == 'ă') {//ă
                a += "]]f";
            } else if (input.trim ().charAt (i) == 'ắ') {//ắ
                a += "!&d";
            } else if (input.trim ().charAt (i) == 'ẵ') {//ẵ
                a += "/|5";
            } else if (input.trim ().charAt (i) == 'ẳ') {//ẳ
                a += "l-&";
            } else if (input.trim ().charAt (i) == 'ằ') {//ằ
                a += "%vb";
            } else if (input.trim ().charAt (i) == 'ặ') {//ặ
                a += "..#";
            } else if (input.trim ().charAt (i) == 'ó') {//ó
                a += ",&r";
            } else if (input.trim ().charAt (i) == 'õ') {//õ
                a += "(4}";
            } else if (input.trim ().charAt (i) == 'ỏ') {//ỏ
                a += "|3+";
            } else if (input.trim ().charAt (i) == 'ò') {//ò
                a += "C-s";
            } else if (input.trim ().charAt (i) == 'ọ') {//ọ
                a += "Lv=";
            } else if (input.trim ().charAt (i) == 'ô') {//ô
                a += "@#f";
            } else if (input.trim ().charAt (i) == 'ỗ') {//ỗ
                a += "$fr";
            } else if (input.trim ().charAt (i) == 'ộ') {//ộ
                a += "m0@";
            } else if (input.trim ().charAt (i) == 'ổ') {//ổ
                a += "k9%";
            } else if (input.trim ().charAt (i) == 'ố') {//ố
                a += "8$!";
            } else if (input.trim ().charAt (i) == 'ồ') {//ồ
                a += "91Q";
            } else if (input.trim ().charAt (i) == 'ơ') {//ơ
                a += "L]e";
            } else if (input.trim ().charAt (i) == 'ỡ') {//ỡ
                a += "&#m";
            } else if (input.trim ().charAt (i) == 'ớ') {//ớ
                a += "VL@";
            } else if (input.trim ().charAt (i) == 'ờ') {//ờ
                a += "%fs";
            } else if (input.trim ().charAt (i) == 'ở') {//ở
                a += "m#b";
            } else if (input.trim ().charAt (i) == 'ợ') {//ợ
                a += "05{";
                //////////////////////////////////////
            } else if (input.trim ().charAt (i) == 'é') {//é
                a += "@&$";
            } else if (input.trim ().charAt (i) == 'è') {//è
                a += "pR$";
            } else if (input.trim ().charAt (i) == 'ẽ') {//ẽ
                a += "mm{";
            } else if (input.trim ().charAt (i) == 'ẹ') {//ẹ
                a += "j#c";
            } else if (input.trim ().charAt (i) == 'ẻ') {//ẻ
                a += "pp]";
            } else if (input.trim ().charAt (i) == 'ê') {//ê
                a += "px@";
            } else if (input.trim ().charAt (i) == 'ể') {//ể
                a += "nw2";
            } else if (input.trim ().charAt (i) == 'ề') {//ề
                a += "l1x";
            } else if (input.trim ().charAt (i) == 'ế') {//ế
                a += "]&@";
            } else if (input.trim ().charAt (i) == 'ệ') {//ệ
                a += "kk^";
            } else if (input.trim ().charAt (i) == 'ễ') {//ễ
                a += "11<";
                // đã  xong
            } else if (input.trim ().charAt (i) == 'í') {//í
                a += "zz$";
            } else if (input.trim ().charAt (i) == 'ì') {//ì
                a += "%%d";
            } else if (input.trim ().charAt (i) == 'ĩ') {//ĩ
                a += "@!d";
            } else if (input.trim ().charAt (i) == 'ị') {//ị
                a += "@&r";
            } else if (input.trim ().charAt (i) == 'ỉ') {//ỉ
                a += "%^L";
            } else if (input.trim ().charAt (i) == 'ù') {//ù
                a += "Vx@";
            } else if (input.trim ().charAt (i) == 'ú') {//ú
                a += "Z(3";
            } else if (input.trim ().charAt (i) == 'ụ') {//ụ
                a += "p!x";
            } else if (input.trim ().charAt (i) == 'ũ') {//ũ
                a += "&$#";
            } else if (input.trim ().charAt (i) == 'ủ') {//ủ
                a += "Z1K";
            } else if (input.trim ().charAt (i) == 'ư') {//ư
                a += "BD+";
            } else if (input.trim ().charAt (i) == 'ứ') {//ứ
                a += "Hs%";
            } else if (input.trim ().charAt (i) == 'ừ') {//ừ
                a += "m}A";
            } else if (input.trim ().charAt (i) == 'ử') {//ử
                a += "Ci&";
            } else if (input.trim ().charAt (i) == 'ữ') {//ữ
                a += "zL&";
            } else if (input.trim ().charAt (i) == 'ự') {//ự
                a += "m&;";
            } else if (input.trim ().charAt (i) == 'ỷ') {//ỷ
                a += "m5!";
            } else if (input.trim ().charAt (i) == 'ỹ') {//ỹ
                a += "Nz&";
            } else if (input.trim ().charAt (i) == 'ỵ') {//ỵ
                a += ";+5";
            } else if (input.trim ().charAt (i) == 'ý') {//ý
                a += "bb$";
            } else if (input.trim ().charAt (i) == 'ỳ') {//ỳ
                a += "h0;";
            } else if (input.trim ().charAt (i) == 'đ') {//ỳ
                a += "&!K";
            } else if (input.trim ().charAt (i) == 'ấ') {//ấ
                a += "pp$";
            } else if (input.trim ().charAt (i) == 'ầ') {//ầ
                a += "p%)";
            } else if (input.trim ().charAt (i) == 'ẫ') {//ẫ
                a += "23&";
            } else if (input.trim ().charAt (i) == 'â') {//â
                a += "8F3";
            } else if (input.trim ().charAt (i) == 'ậ') {//ậ
                a += "-/^";
            } else if (input.trim ().charAt (i) == 'ẩ') {//ẩ
                a += "!z%";
            }
            // chữ hoa
            else if (input.trim ().charAt (i) == 'Đ') {//ỳ
                a += "&!9";
            }
        }
        Toast.makeText (context,"Mã hoá thành công !",Toast.LENGTH_SHORT).show ();
        return a;
    }
}
