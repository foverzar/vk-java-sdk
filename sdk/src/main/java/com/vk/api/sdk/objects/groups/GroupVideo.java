package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GroupVideo implements EnumParam {
    @SerializedName("0")
    DISABLED(0),

    @SerializedName("1")
    OPEN(1),

    @SerializedName("2")
    LIMITED(2);

    private final Integer value;

    GroupVideo(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }
}
