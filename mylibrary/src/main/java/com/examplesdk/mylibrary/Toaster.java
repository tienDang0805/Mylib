package com.examplesdk.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void showToast(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }
}
