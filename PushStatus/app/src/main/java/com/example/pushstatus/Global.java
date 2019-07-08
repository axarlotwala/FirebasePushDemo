package com.example.pushstatus;

import android.content.Context;
import android.widget.Toast;

public class Global {

    public static void Toasty(String msg, Context context){
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }
}
