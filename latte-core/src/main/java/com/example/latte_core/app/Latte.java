package com.example.latte_core.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by gemery on 2018/4/2.
 */

public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());


        return Configurator.getInstance();
    }
    private static HashMap<String ,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfig();
    }
}
