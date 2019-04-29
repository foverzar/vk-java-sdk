package com.vk.api.sdk.objects.apps.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetFriendsListResponse object
 */
public class GetFriendsListResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<UserFull> items;

    public Integer getCount() {
        return count;
    }

    public GetFriendsListResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<UserFull> getItems() {
        return items;
    }

    public GetFriendsListResponse setItems(List<UserFull> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFriendsListResponse getFriendsListResponse = (GetFriendsListResponse) o;
        return Objects.equals(count, getFriendsListResponse.count) &&
                Objects.equals(items, getFriendsListResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetFriendsListResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
