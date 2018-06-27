package com.seven.databindingdemo.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class User {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableBoolean gender = new ObservableBoolean();
    public final ObservableInt age = new ObservableInt();
}
