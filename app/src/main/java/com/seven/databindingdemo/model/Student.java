package com.seven.databindingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.seven.databindingdemo.BR;

public class Student extends BaseObservable {
    private String name;
    private boolean male;
    private int age;
    private int number;

    public Student() {}

    public Student(String name, boolean male, int age, int number) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.number = number;
    }

    @Bindable
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setMale(boolean male) {
        this.male = male;
        notifyPropertyChanged(BR.male);
    }

    @Bindable
    public boolean getMale() {
        return male;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public int getAge() {
        return this.age;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyPropertyChanged(BR.number);
    }

    @Bindable
    public int getNumber() {
        return this.number;
    }
}
