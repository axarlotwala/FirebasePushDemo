package com.example.pushdemo.Activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.pushdemo.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

public class MainActivity extends AppCompatActivity {

    //eMZcl6tmtmk:APA91bGemlyLIY5AW2T1ESYcghM11kq94q3j-VdaBdrpmrCC5sAmBjH0GNXPtmlUzD6KtGJ5wO-i0sgqYJY-QmK6iSi54-BVm-2-JZHNtX2pbudjxhiB1CQ6JQoePPDTP6sEI9RdC-vl

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {

                           try{

                               String token = task.getResult().getToken();
                               Log.e("Fcm_Token",""+token);

                           }catch (Exception e){
                                    Global.Toasty(e.getMessage(),getApplicationContext());
                           }

                    }
                });
    }
}
