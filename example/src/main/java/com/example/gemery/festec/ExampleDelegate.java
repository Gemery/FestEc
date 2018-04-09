package com.example.gemery.festec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.latte_core.delegate.LatteDelegate;

/**
 * Created by gemery on 2018/4/9.
 */

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
