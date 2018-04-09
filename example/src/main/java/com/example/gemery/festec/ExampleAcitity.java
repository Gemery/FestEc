package com.example.gemery.festec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.latte_core.activities.ProxyActivity;
import com.example.latte_core.delegate.LatteDelegate;

public class ExampleAcitity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
