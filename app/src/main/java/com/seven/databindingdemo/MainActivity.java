package com.seven.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.seven.databindingdemo.databinding.ActivityMainBinding;
import com.seven.databindingdemo.model.Student;
import com.seven.databindingdemo.model.User;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private User mUser = new User();
    private Student mStudent = new Student();
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setUser(mUser);
        mBinding.setStudent(mStudent);
        final Random random = new Random();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int num = random.nextInt() % 7;
                switch (num) {
                    case 0:
                        mUser.name.set("Carl " + mCount);
                        break;
                    case 1:
                        mUser.gender.set(!mUser.gender.get());
                        break;
                    case 2:
                        mUser.age.set(mCount);
                        break;
                    case 3:
                        mStudent.setName(mUser.name.get());
                        break;
                    case 4:
                        mStudent.setMale(!mStudent.getMale());
                        break;
                    case 5:
                        mStudent.setNumber(random.nextInt() % 100);
                        break;
                    case 6:
                        mStudent.setAge(mCount);
                        break;
                }

                mCount ++;
            }
        }, 1000, 500);
    }
}
