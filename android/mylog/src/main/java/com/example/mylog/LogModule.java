package com.example.mylog;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by aran.hu on 17/3/21.
 */

public class LogModule extends ReactContextBaseJavaModule {
    public LogModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "NativeLog";
    }

    @ReactMethod
    public void nativeLog(String message) {
        Log.d("android nativeLog: ", message);
    }

}
