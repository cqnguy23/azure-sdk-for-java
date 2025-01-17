// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MediaStreamingUpdate model. */
@Fluent
public final class MediaStreamingUpdate {
    /*
     * The contentType property.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * The mediaStreamingStatus property.
     */
    @JsonProperty(value = "mediaStreamingStatus")
    private MediaStreamingStatus mediaStreamingStatus;

    /*
     * The mediaStreamingStatusDetails property.
     */
    @JsonProperty(value = "mediaStreamingStatusDetails")
    private MediaStreamingStatusDetails mediaStreamingStatusDetails;

    /**
     * Get the contentType property: The contentType property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The contentType property.
     *
     * @param contentType the contentType value to set.
     * @return the MediaStreamingUpdate object itself.
     */
    public MediaStreamingUpdate setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the mediaStreamingStatus property: The mediaStreamingStatus property.
     *
     * @return the mediaStreamingStatus value.
     */
    public MediaStreamingStatus getMediaStreamingStatus() {
        return this.mediaStreamingStatus;
    }

    /**
     * Set the mediaStreamingStatus property: The mediaStreamingStatus property.
     *
     * @param mediaStreamingStatus the mediaStreamingStatus value to set.
     * @return the MediaStreamingUpdate object itself.
     */
    public MediaStreamingUpdate setMediaStreamingStatus(MediaStreamingStatus mediaStreamingStatus) {
        this.mediaStreamingStatus = mediaStreamingStatus;
        return this;
    }

    /**
     * Get the mediaStreamingStatusDetails property: The mediaStreamingStatusDetails property.
     *
     * @return the mediaStreamingStatusDetails value.
     */
    public MediaStreamingStatusDetails getMediaStreamingStatusDetails() {
        return this.mediaStreamingStatusDetails;
    }

    /**
     * Set the mediaStreamingStatusDetails property: The mediaStreamingStatusDetails property.
     *
     * @param mediaStreamingStatusDetails the mediaStreamingStatusDetails value to set.
     * @return the MediaStreamingUpdate object itself.
     */
    public MediaStreamingUpdate setMediaStreamingStatusDetails(
            MediaStreamingStatusDetails mediaStreamingStatusDetails) {
        this.mediaStreamingStatusDetails = mediaStreamingStatusDetails;
        return this;
    }
}
