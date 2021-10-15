package com.ducanh.encrypt;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button BtnEncrypt, BtnDycrypt;
    TextInputEditText Text_input;
    Encrypt encrypt = new Encrypt ();
    Decrypt decrypt = new Decrypt ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        InitView ();
        BtnDycrypt.setEnabled (false);
        BtnEncrypt.setEnabled (false);
        OnClick ();
        Check();
    }

    private void Check() {
        Text_input.addTextChangedListener (new TextWatcher () {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if(charSequence.length ()!=0) {
                   BtnDycrypt.setEnabled (true);
                   BtnEncrypt.setEnabled (true);
               }else{
                   BtnDycrypt.setEnabled (false);
                   BtnEncrypt.setEnabled (false);
               }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void InitView() {
        BtnEncrypt = findViewById (R.id.mahoa);
        BtnDycrypt = findViewById (R.id.giaima);
        Text_input = findViewById (R.id.input);
    }

    private void OnClick() {
        BtnDycrypt.setOnClickListener (this);
        BtnEncrypt.setOnClickListener (this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId ()) {
            case R.id.mahoa: {
                Text_input.setText (encrypt.Encrypt (Text_input.getText ().toString (), this));
                break;
            }
            case R.id.giaima: {
                Text_input.setText (decrypt.Decrypt (Text_input.getText ().toString (), this));
                break;
            }
        }
    }
}
