package com.ducanh.encrypt;

import android.content.Context;
import android.widget.Toast;

public class Decrypt {
    public String Decrypt (String input, Context context){
        String a = "";
        int b = 0;
        try {
            while (b < input.length ()) {
                if (input.trim ().substring (b, b + 3).equals ("m+7")) {              //0
                    a += "0";
                } else if (input.trim ().substring (b, b + 3).equals ("k&v")) { //1
                    a += "1";
                } else if (input.trim ().substring (b, b + 3).equals ("h^f")) { //2
                    a += "2";
                } else if (input.trim ().substring (b, b + 3).equals ("P;?")) { //3
                    a += "3";
                } else if (input.trim ().substring (b, b + 3).equals ("##v")) { //4
                    a += "4";
                } else if (input.trim ().substring (b, b + 3).equals ("%3F")) { //5
                    a += "5";
                } else if (input.trim ().substring (b, b + 3).equals ("&g#")) { //6
                    a += "6";
                } else if (input.trim ().substring (b, b + 3).equals ("!%g")) { //7
                    a += "7";
                } else if (input.trim ().substring (b, b + 3).equals ("&:^")) { //8
                    a += "8";
                } else if (input.trim ().substring (b, b + 3).equals ("78$")) { //9
                    a += "9";
                } else if (input.trim ().substring (b, b + 3).equals ("lqp")) { //A
                    a += "A";
                } else if (input.trim ().substring (b, b + 3).equals ("KDC")) { //B
                    a += "B";
                } else if (input.trim ().substring (b, b + 3).equals ("SKC")) { //C
                    a += "C";
                } else if (input.trim ().substring (b, b + 3).equals ("DCD")) { //D
                    a += "D";
                } else if (input.trim ().substring (b, b + 3).equals ("DSA")) { //E
                    a += "E";
                } else if (input.trim ().substring (b, b + 3).equals ("IDM")) { //F
                    a += "F";
                } else if (input.trim ().substring (b, b + 3).equals ("IXS")) { //G
                    a += "G";
                } else if (input.trim ().substring (b, b + 3).equals ("SPS")) { //H
                    a += "H";
                } else if (input.trim ().substring (b, b + 3).equals ("PMD")) { //I
                    a += "I";
                } else if (input.trim ().substring (b, b + 3).equals ("jsc")) { //J
                    a += "J";
                } else if (input.trim ().substring (b, b + 3).equals ("pfv")) { //K
                    a += "K";
                } else if (input.trim ().substring (b, b + 3).equals ("ywc")) { //L
                    a += "L";
                } else if (input.trim ().substring (b, b + 3).equals ("lco")) { //M
                    a += "M";
                } else if (input.trim ().substring (b, b + 3).equals ("aic")) { //N
                    a += "N";
                } else if (input.trim ().substring (b, b + 3).equals ("cps")) { //O
                    a += "O";
                } else if (input.trim ().substring (b, b + 3).equals ("msu")) { //P
                    a += "P";
                } else if (input.trim ().substring (b, b + 3).equals ("psn")) { //Q
                    a += "Q";
                } else if (input.trim ().substring (b, b + 3).equals ("p38")) { //R
                    a += "R";
                } else if (input.trim ().substring (b, b + 3).equals ("c47")) { //S
                    a += "S";
                } else if (input.trim ().substring (b, b + 3).equals ("o49")) { //T
                    a += "T";
                } else if (input.trim ().substring (b, b + 3).equals ("b9d")) { //U
                    a += "U";
                } else if (input.trim ().substring (b, b + 3).equals ("c3j")) { //V
                    a += "V";
                } else if (input.trim ().substring (b, b + 3).equals ("m0s")) { //W
                    a += "W";
                } else if (input.trim ().substring (b, b + 3).equals ("mr3")) { //X
                    a += "X";
                } else if (input.trim ().substring (b, b + 3).equals ("mo2")) { //Y
                    a += "Y";
                } else if (input.trim ().substring (b, b + 3).equals ("md8")) { //Z
                    a += "Z";
                } else if (input.trim ().substring (b, b + 3).equals ("n2v")) { //a
                    a += "a";
                } else if (input.trim ().substring (b, b + 3).equals ("p9a")) { //b
                    a += "b";
                } else if (input.trim ().substring (b, b + 3).equals ("fn3")) { //c
                    a += "c";
                } else if (input.trim ().substring (b, b + 3).equals ("x9q")) { //d
                    a += "d";
                } else if (input.trim ().substring (b, b + 3).equals ("lf4")) { //e
                    a += "e";
                } else if (input.trim ().substring (b, b + 3).equals ("lm;")) { //f
                    a += "f";
                } else if (input.trim ().substring (b, b + 3).equals ("m'f")) { //g
                    a += "g";
                } else if (input.trim ().substring (b, b + 3).equals ("''3")) { //h
                    a += "h";
                } else if (input.trim ().substring (b, b + 3).equals ("m-e")) { //i
                    a += "i";
                } else if (input.trim ().substring (b, b + 3).equals ("$$f")) { //j
                    a += "j";
                } else if (input.trim ().substring (b, b + 3).equals (".,f")) { //k
                    a += "k";
                } else if (input.trim ().substring (b, b + 3).equals ("/<f")) { //l
                    a += "l";
                } else if (input.trim ().substring (b, b + 3).equals ("kf/")) { //m
                    a += "m";
                } else if (input.trim ().substring (b, b + 3).equals ("pr/")) { //n
                    a += "n";
                } else if (input.trim ().substring (b, b + 3).equals ("e=d")) { //o
                    a += "o";
                } else if (input.trim ().substring (b, b + 3).equals ("l+w")) { //p
                    a += "p";
                } else if (input.trim ().substring (b, b + 3).equals ("$fv")) { //q
                    a += "q";
                } else if (input.trim ().substring (b, b + 3).equals ("&3f")) { //r
                    a += "r";
                } else if (input.trim ().substring (b, b + 3).equals ("p(e")) { //s
                    a += "s";
                } else if (input.trim ().substring (b, b + 3).equals ("p-g")) { //t
                    a += "t";
                } else if (input.trim ().substring (b, b + 3).equals ("--f")) { //u
                    a += "u";
                } else if (input.trim ().substring (b, b + 3).equals ("ls=")) { //v
                    a += "v";
                } else if (input.trim ().substring (b, b + 3).equals ("'(f")) { //w
                    a += "w";
                } else if (input.trim ().substring (b, b + 3).equals ("q=$")) { //x
                    a += "x";
                } else if (input.trim ().substring (b, b + 3).equals ("m}&")) { //y
                    a += "y";
                } else if (input.trim ().substring (b, b + 3).equals ("lb<")) { //z
                    a += "z";
                } else if (input.trim ().substring (b, b + 3).equals ("?rc")) { //.
                    a += ".";
                } else if (input.trim ().substring (b, b + 3).equals ("dc-")) { //,
                    a += ",";
                } else if (input.trim ().substring (b, b + 3).equals ("L0z")) { //
                    a += " ";
                    // có dấu thường
                } else if (input.trim ().substring (b, b + 3).equals ("vP&")) { //á
                    a += "á";
                } else if (input.trim ().substring (b, b + 3).equals ("l&M")) { //à
                    a += "à";
                } else if (input.trim ().substring (b, b + 3).equals ("dA&")) { //ả
                    a += "ả";
                } else if (input.trim ().substring (b, b + 3).equals ("mE$")) { //ạ
                    a += "ạ";
                } else if (input.trim ().substring (b, b + 3).equals ("M&f")) { //ã
                    a += "ã";
                } else if (input.trim ().substring (b, b + 3).equals ("]]f")) { //ă
                    a += "ă";
                } else if (input.trim ().substring (b, b + 3).equals ("!&d")) { //ắ
                    a += "ắ";
                } else if (input.trim ().substring (b, b + 3).equals ("/|5")) { //ẵ
                    a += "ẵ";
                } else if (input.trim ().substring (b, b + 3).equals ("l-&")) { //ẳ
                    a += "ẳ";
                } else if (input.trim ().substring (b, b + 3).equals ("%vb")) { //ằ
                    a += "ằ";
                } else if (input.trim ().substring (b, b + 3).equals ("..#")) { //ặ
                    a += "ặ";
                } else if (input.trim ().substring (b, b + 3).equals (",&r")) { //ó
                    a += "ó";
                } else if (input.trim ().substring (b, b + 3).equals ("(4}")) { //õ
                    a += "õ";
                } else if (input.trim ().substring (b, b + 3).equals ("|3+")) { //ỏ
                    a += "ỏ";
                } else if (input.trim ().substring (b, b + 3).equals ("C-s")) { //ò
                    a += "ò";
                } else if (input.trim ().substring (b, b + 3).equals ("Lv=")) { //ọ
                    a += "ọ";
                } else if (input.trim ().substring (b, b + 3).equals ("@#f")) { //ô
                    a += "ô";
                } else if (input.trim ().substring (b, b + 3).equals ("$fr")) { //ỗ
                    a += "ỗ";
                } else if (input.trim ().substring (b, b + 3).equals ("m0@")) { //ộ
                    a += "ộ";
                } else if (input.trim ().substring (b, b + 3).equals ("k9%")) { //ổ
                    a += "ổ";
                } else if (input.trim ().substring (b, b + 3).equals ("8$!")) { //ố
                    a += "ố";
                } else if (input.trim ().substring (b, b + 3).equals ("91Q")) { //ồ
                    a += "ồ";
                } else if (input.trim ().substring (b, b + 3).equals ("L]e")) { //ơ
                    a += "ơ";
                } else if (input.trim ().substring (b, b + 3).equals ("&#m")) { //ỡ
                    a += "ỡ";
                } else if (input.trim ().substring (b, b + 3).equals ("VL@")) { //ớ
                    a += "ớ";
                } else if (input.trim ().substring (b, b + 3).equals ("%fs")) { //ờ
                    a += "ờ";
                } else if (input.trim ().substring (b, b + 3).equals ("m#b")) { //ở
                    a += "ở";
                } else if (input.trim ().substring (b, b + 3).equals ("05{")) { //ợ
                    a += "ợ";
                } else if (input.trim ().substring (b, b + 3).equals ("@&$")) { //é
                    a += "é";
                } else if (input.trim ().substring (b, b + 3).equals ("pR$")) { //è
                    a += "è";
                } else if (input.trim ().substring (b, b + 3).equals ("mm{")) { //ẽ
                    a += "ẽ";
                } else if (input.trim ().substring (b, b + 3).equals ("j#c")) { //ẹ
                    a += "ẹ";
                } else if (input.trim ().substring (b, b + 3).equals ("pp]")) { //ẻ
                    a += "ẻ";
                } else if (input.trim ().substring (b, b + 3).equals ("px@")) { //ê
                    a += "ê";
                } else if (input.trim ().substring (b, b + 3).equals ("nw2")) { //ể
                    a += "ể";
                } else if (input.trim ().substring (b, b + 3).equals ("l1x")) { //ề
                    a += "ề";
                } else if (input.trim ().substring (b, b + 3).equals ("]&@")) { //ế
                    a += "ế";
                } else if (input.trim ().substring (b, b + 3).equals ("kk^")) { //ệ
                    a += "ệ";
                } else if (input.trim ().substring (b, b + 3).equals ("11<")) { //ễ
                    a += "ễ";
                } else if (input.trim ().substring (b, b + 3).equals ("zz$")) { //í
                    a += "í";
                } else if (input.trim ().substring (b, b + 3).equals ("%%d")) { //ì
                    a += "ì";
                } else if (input.trim ().substring (b, b + 3).equals ("@!d")) { //ĩ
                    a += "ĩ";
                } else if (input.trim ().substring (b, b + 3).equals ("@&r")) { //ị
                    a += "ị";
                } else if (input.trim ().substring (b, b + 3).equals ("%^L")) { //ỉ
                    a += "ỉ";
                } else if (input.trim ().substring (b, b + 3).equals ("Vx@")) { //ù
                    a += "ù";
                } else if (input.trim ().substring (b, b + 3).equals ("Z(3")) { //ú
                    a += "ú";
                } else if (input.trim ().substring (b, b + 3).equals ("p!x")) { //ụ
                    a += "ụ";
                } else if (input.trim ().substring (b, b + 3).equals ("&$#")) { //ũ
                    a += "ũ";
                } else if (input.trim ().substring (b, b + 3).equals ("Z1K")) { //ủ
                    a += "ủ";
                } else if (input.trim ().substring (b, b + 3).equals ("BD+")) { //ư
                    a += "ư";
                } else if (input.trim ().substring (b, b + 3).equals ("Hs%")) { //ứ
                    a += "ứ";
                } else if (input.trim ().substring (b, b + 3).equals ("m}A")) { //ừ
                    a += "ừ";
                } else if (input.trim ().substring (b, b + 3).equals ("Ci&")) { //ử
                    a += "ử";
                } else if (input.trim ().substring (b, b + 3).equals ("zL&")) { //ữ
                    a += "ữ";
                } else if (input.trim ().substring (b, b + 3).equals ("m&;")) { //ự
                    a += "ự";
                } else if (input.trim ().substring (b, b + 3).equals ("m5!")) { //ỷ
                    a += "ỷ";
                } else if (input.trim ().substring (b, b + 3).equals ("Nz&")) { //ỹ
                    a += "ỹ";
                } else if (input.trim ().substring (b, b + 3).equals (";+5")) { //ỵ
                    a += "ỵ";
                } else if (input.trim ().substring (b, b + 3).equals ("bb$")) { //ý
                    a += "ý";
                } else if (input.trim ().substring (b, b + 3).equals ("h0;")) { //ỳ
                    a += "ỳ";
                } else if (input.trim ().substring (b, b + 3).equals ("pp$")) { //ấ
                    a += "ấ";
                } else if (input.trim ().substring (b, b + 3).equals ("p%)")) { //ầ
                    a += "ầ";
                } else if (input.trim ().substring (b, b + 3).equals ("23&")) { //ẫ
                    a += "ẫ";
                } else if (input.trim ().substring (b, b + 3).equals ("8F3")) { //â
                    a += "â";
                } else if (input.trim ().substring (b, b + 3).equals ("-/^")) { //ậ
                    a += "ậ";
                } else if (input.trim ().substring (b, b + 3).equals ("!z%")) { //ẩ
                    a += "ẩ";
                } else if (input.trim ().substring (b, b + 3).equals ("&!K")) { //đ
                    a += "đ";
                } else if (input.trim ().substring (b, b + 3).equals ("&!9")) { //Đ
                    a += "Đ";
                }
                b += 3;
            }
        }catch (Exception E){
            Toast.makeText (context,"Vui Lòng nhập chuỗi đã được mã hoá !",Toast.LENGTH_SHORT).show ();
        }

        Toast.makeText (context,"Giải mã thành công !",Toast.LENGTH_SHORT).show ();
        return a;
    }
}
