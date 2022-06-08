package com.ducanh.encrypt;

import android.content.Context;
import android.util.Base64;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateFileKey {
    SecureRandom secureRandom;
    KeyPairGenerator keyPairGenerator;
    KeyPair keyPair;
    PublicKey publicKey;
    PrivateKey privateKey;
public void Main(Context context){
    getChildrenFolder(context,"privateKey");
    getChildrenFolder(context,"publicKey");
    try {
       secureRandom = new SecureRandom();
        keyPairGenerator = KeyPairGenerator.getInstance("RSA");
       keyPair = keyPairGenerator.genKeyPair();
         publicKey = keyPair.getPublic();
         privateKey = keyPair.getPrivate();
        CreateFileKey(context);
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
}
    public void CreateFileKey(Context context) throws NoSuchAlgorithmException {
        keyPairGenerator.initialize(2048,secureRandom);
        String path_public = context.getFilesDir()+File.separator+"publicKey";
      String path_private = context.getFilesDir()+File.separator+"privateKey";
        File file_public = new File(path_public, "public.rsa");
        File file_private = new File(path_private, "private.rsa");
       if(!file_public.exists()&&!file_private.exists()){
            try {
                write(file_public,publicKey.getEncoded());
                write(file_private,privateKey.getEncoded());
            } catch (IOException e) {
               e.printStackTrace();
           }
        }
    }
    private File getChildrenFolder(Context context, String path) {
        File dir = context.getFilesDir();
        List<String> dirs = new ArrayList<String>(Arrays.<String>asList(path.split("/")));
        for(int i = 0; i < dirs.size(); ++i) {
            dir = new File(dir, dirs.get(i)); //Getting a file within the dir.
            if(!dir.exists()) {
                dir.mkdir();
            }
        }
        return dir;
    }
    public void write(File file, byte[] bytes) throws IOException {
        FileOutputStream stream = new FileOutputStream(file);
        try {
            try {
                stream.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            stream.close();
        }
    }
}
