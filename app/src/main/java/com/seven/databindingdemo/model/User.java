package com.seven.databindingdemo.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class User {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableBoolean gender = new ObservableBoolean();
    public final ObservableInt age = new ObservableInt();

    public User() {}

    public User(String name, boolean gender, int age) {
        this.name.set(name);
        this.gender.set(gender);
        this.age.set(age);
    }
}
