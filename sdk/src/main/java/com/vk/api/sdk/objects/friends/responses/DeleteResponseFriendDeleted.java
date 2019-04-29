package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Returns 1 if friend has been deleted
 */
public enum DeleteResponseFriendDeleted implements EnumParam {
    @SerializedName("1")
    OK(1);

    private final Integer value;

    DeleteResponseFriendDeleted(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }
}
