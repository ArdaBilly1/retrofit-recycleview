package com.example.retrofitrecycle.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChuckNorrisQuote {
    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    @SerializedName("category")
    @Expose
    public Object category;
    @SerializedName("icon_url")
    @Expose
    public String iconUrl;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

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
