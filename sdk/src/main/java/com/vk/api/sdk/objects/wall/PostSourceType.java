package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Type of post source
 */
public enum PostSourceType implements EnumParam {
    @SerializedName("vk")
    VK("vk"),

    @SerializedName("widget")
    WIDGET("widget"),

    @SerializedName("api")
    API("api"),

    @SerializedName("rss")
    RSS("rss"),

    @SerializedName("sms")
    SMS("sms");

    private final String value;

    PostSourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
