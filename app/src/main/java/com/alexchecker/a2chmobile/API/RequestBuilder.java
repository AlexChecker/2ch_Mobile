package com.alexchecker.a2chmobile.API;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RequestBuilder {
private static String URL = "https://2ch.hk/api/mobile/v2/";
private static Retrofit retrofit = null;

public static Retrofit buildRequest()
{
    OkHttpClient okHttp = new OkHttpClient.Builder().build();

    retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).client(okHttp).build();

    return retrofit;

}

public static Retrofit buildRequest2()
{
    OkHttpClient okHttp = new OkHttpClient.Builder().build();

    retrofit = new Retrofit.Builder().baseUrl("https://2ch.hk/").addConverterFactory(GsonConverterFactory.create()).client(okHttp).build();

    return retrofit;

}

}
