package com.example.latte_core.app;

import android.graphics.Bitmap;

import java.util.HashMap;

/**
 * Created by gemery on 2018/4/2.
 */

public class Configurator {
    private static final HashMap<String,Object> LATTE_CONFIG =  new HashMap<>();

    private Configurator(){
        LATTE_CONFIG.put(ConfigType.CONFIG_READY.name(),false);
    }
    private  static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }

    public static Configurator getInstance(){

        return Holder.INSTANCE;
    }

    final HashMap<String,Object> getLatteConfig(){
        return LATTE_CONFIG;
    }

    public  final void configure(){
        LATTE_CONFIG.put(ConfigType.CONFIG_READY.name(),true);
    }

    public final Configurator withApiHost(String host){
        LATTE_CONFIG.put(ConfigType.API_HOST.name(),host);
        return this;
    }
    private void checkConfiguration(){
        final boolean isReady = (boolean) LATTE_CONFIG.get(ConfigType.CONFIG_READY.name());

                if(!isReady){
                    throw new RuntimeException("configuration is not ready,call config");
                }
    }
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();;
        return  (T) LATTE_CONFIG.get(key.name());
    }
}
