package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.stories.responses.GetBannedResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getBanned method
 */
public class StoriesGetBannedQuery extends AbstractQueryBuilder<StoriesGetBannedQuery, GetBannedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StoriesGetBannedQuery(VkApiClient client, UserActor actor) {
        super(client, "stories.getBanned", GetBannedResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * '1' — to return additional fields for users and communities. Default value is 0.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetBannedQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * fields
     * Additional fields to return
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetBannedQuery fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Additional fields to return
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesGetBannedQuery fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected StoriesGetBannedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
