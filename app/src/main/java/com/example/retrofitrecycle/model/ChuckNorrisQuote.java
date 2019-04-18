package com.example.retrofitrecycle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChuckNorrisQuote {
    @SerializedName("category")
    @Expose
    public Object category;
    @SerializedName("icon_url")
    @Expose
    public String iconUrl;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("value")
    @Expose
    public String value;
}
