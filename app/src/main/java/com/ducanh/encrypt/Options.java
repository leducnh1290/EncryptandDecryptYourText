package com.ducanh.encrypt;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Options {
    SecretKeySpec skeySpec;
    Cipher cipher;
    public Options(String key,Context context) {
        skeySpec = new SecretKeySpec(key.getBytes(), "AES");
        try {
            cipher = Cipher.getInstance("AES");
        }catch (Exception E){

        }
    }
    public String Encrypt(String message,Context c){
        String encrypted ="";
        try {
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] byteEncrypted = cipher.doFinal(message.getBytes());
          encrypted =  Base64.encodeToString(byteEncrypted,1);
        }catch (Exception E){
            Log.d("1",E.toString());
        }
      return encrypted;
    }
public String Decrypt(String message,Context context) {
    String decrypted = "";
    try {
        SecretKeySpec spec = skeySpec;
        cipher.init(Cipher.DECRYPT_MODE, spec);
        Toast.makeText(context, spec.toString(), Toast.LENGTH_SHORT).show();
        byte[] byteDecrypted = cipher.doFinal(Base64.decode(message, 1));
        decrypted = new String(byteDecrypted);
    } catch (Exception E) {
       Log.e("123",E.toString());
    }
    return decrypted;
     }
}
