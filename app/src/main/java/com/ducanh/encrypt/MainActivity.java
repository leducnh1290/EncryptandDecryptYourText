package com.ducanh.encrypt;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String KEY_MAIN = "stackjava.com.if",KEY_ENCRYPT = "";
    Button BtnEncrypt, BtnDycrypt,Btnclipboard;
    TextInputEditText Text_input;
    String action,type;
    Options options;
    Intent intent;
    Encrypt encryptmess = new Encrypt ();
    Decrypt decryptmess = new Decrypt ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        new CreateFileKey().Main(this);
        KEY_ENCRYPT = Encrypt(getApplicationContext(),KEY_MAIN);
        if(Build.VERSION.SDK_INT>=26) {
            options = new Options(Decrypt(getApplicationContext(), KEY_ENCRYPT), this);
        }
        InitView ();
        OnClick ();
      //  Check();
        if(new Check().isDeviceRooted()){
            Toast.makeText(getApplicationContext(), "Xin lỗi root rồi thì lượn dùm !", Toast.LENGTH_LONG).show();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    System.exit(1);
                }
            }, 3000);
        }
        // if value is not null then show the content
        if (Intent.ACTION_SEND.equals(action) && type != null) {
            handlesendText(intent);
        }
    }
    private void handlesendText(Intent intent) {
        // here we are getting the text
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null) {
            // showing the text in edittext
            Text_input.setText(sharedText);
        }
    }
    private String Encrypt(Context context,String main){
        String strEncrypt = "";
        try {
            String path_public = context.getFilesDir()+ File.separator+"publicKey";
            File file_public = new File(path_public, "public.rsa");
            int length = (int) file_public.length();

            byte[] bytes = new byte[length];

            FileInputStream in = null;
            try {
                in = new FileInputStream(file_public);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                in.read(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            X509EncodedKeySpec spec = new X509EncodedKeySpec(bytes);
            KeyFactory factory = KeyFactory.getInstance("RSA");
            PublicKey pubKey = factory.generatePublic(spec);
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.ENCRYPT_MODE, pubKey);
            String msg = main;
            byte encryptOut[] = c.doFinal(msg.getBytes());
             strEncrypt = Base64.encodeToString(encryptOut,2);
        }catch (Exception E){

        }
        return strEncrypt;
    }
    public String Decrypt(Context context,String main){
        String decrypt = "";
        String path_private = context.getFilesDir()+ File.separator+"privateKey";
        File file_private = new File(path_private, "private.rsa");
        int length = (int) file_private.length();
        byte[] bytes = new byte[length];
        try {
            FileInputStream in = null;
            in = new FileInputStream(file_private);
            in.read(bytes);
            in.close();
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(bytes);
            KeyFactory factory = KeyFactory.getInstance("RSA");
            PrivateKey priKey = factory.generatePrivate(spec);
            // Giải mã dữ liệu
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.DECRYPT_MODE, priKey);
           decrypt = new String(c.doFinal(Base64.decode(main, 2)));
        }catch (Exception E){
        }

        return decrypt;
    }
    private void InitView() {
        intent = getIntent();
        action = intent.getAction();
        // getting type of content shared
        type = intent.getType();
        BtnEncrypt = findViewById (R.id.mahoa);
        BtnDycrypt = findViewById (R.id.giaima);
        Text_input = findViewById (R.id.input);
        Btnclipboard = findViewById(R.id.copy_clipboard);
    }

    private void OnClick() {
        BtnDycrypt.setOnClickListener (this);
        BtnEncrypt.setOnClickListener (this);
        Btnclipboard.setOnClickListener (this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId ()) {
            case R.id.mahoa: {
                String a = options.Encrypt(Text_input.getText().toString(),getApplicationContext());
                Text_input.setText(encryptmess.Encrypt(a,getApplicationContext()));
                break;
            }
            case R.id.giaima: {
                String a = decryptmess.Decrypt(Text_input.getText().toString(),getApplicationContext());
                Text_input.setText(options.Decrypt(a,getApplicationContext()));
                break;
            }
            case R.id.copy_clipboard:{
                new Clipboard().setClipboard(this,Text_input.getText().toString());
            }
        }
    }
    private void Check() {
        BtnDycrypt.setEnabled (false);
        BtnEncrypt.setEnabled (false);
        Btnclipboard.setVisibility(View.INVISIBLE);

        Text_input.addTextChangedListener (new TextWatcher () {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length ()!=0) {
                    BtnDycrypt.setEnabled (true);
                    BtnEncrypt.setEnabled (true);
                    Btnclipboard.setVisibility(View.VISIBLE);
                }else{
                    BtnDycrypt.setEnabled (false);
                    BtnEncrypt.setEnabled (false);
                    Btnclipboard.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
