package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//import com.example.mylib1.MyUtil;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    String aa, bb, cc, dd;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person p = new Person();
        p.name = "zhouxingchi";
        p.firstname ="zhou";
        p.age = 44;
        String aaa = new Gson().toJson(new Integer(33));
        Log.e("luchao", "onCreate()  <<-  aaa=" + aaa);
        Log.e("luchao", "commit in dev1" + aaa);
        Log.e("luchao", "commit2 in dev1" + aaa);

//        MyUtil.test();

    }

    public static class Person{
        String name;
        String firstname;
        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}