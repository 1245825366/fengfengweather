package com.example.fengfeng.util;

import android.app.DownloadManager;
import android.os.Build;
import android.view.textclassifier.TextLinks;
import androidx.annotation.RequiresApi;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
