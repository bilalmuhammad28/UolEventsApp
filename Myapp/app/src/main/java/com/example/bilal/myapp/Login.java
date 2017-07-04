package com.example.bilal.myapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.bilal.myapp.R.layout.registration;

/**
 * Created by Bilal on 6/24/2017.
 */

public class Login extends Fragment {

    private Button log;
    private Button reg;
    private EditText user;
    private EditText pass;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.loginuser, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        log = (Button) view.findViewById(R.id.log);
        reg = (Button) view.findViewById(R.id.reg);
        user = (EditText) view.findViewById(R.id.user);
        pass = (EditText) view.findViewById(R.id.pass);

        Jsonparser j=new Jsonparser();
        try {
                String[] arr=new String[2];
            arr[1]="{\"email\":\"tooba@gmail.om\",\"password\":\"123456\"}";
            arr[0]="http://192.168.10.5:8000/login";
            j.makePostRequest(arr);
            System.out.println(j.getResponseArray());
        }
        catch (Exception e)
        {
            System.out.println("I am in Eception");
        }
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = user.getText().toString().trim();
                String password = pass.getText().toString().trim();
                if (username.equals("bilal") && password.equals("123")) {

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Home f = new Home();
                    fragmentTransaction.replace(R.id.main_frame, f);
                    fragmentTransaction.commit();

                } else if (username.isEmpty()) {
                    Toast.makeText(getActivity(), "please enter your username", Toast.LENGTH_LONG).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(getActivity(), "please enter your password", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getActivity(), "Welcome to home screen", Toast.LENGTH_LONG).show();
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Register f = new Register();
                fragmentTransaction.replace(R.id.main_frame, f);
                fragmentTransaction.commit();
            }
        });

    }
}