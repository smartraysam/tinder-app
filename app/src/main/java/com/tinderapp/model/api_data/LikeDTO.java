package com.tinderapp.model.api_data;

import com.google.gson.annotations.SerializedName;

public class LikeDTO {
    @SerializedName("match")
    private Match match;

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}