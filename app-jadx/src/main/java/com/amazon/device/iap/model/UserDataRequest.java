package com.amazon.device.iap.model;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class UserDataRequest {
    private boolean fetchLWAConsentStatus;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class Builder {
        private boolean fetchLWAConsentStatus;

        public UserDataRequest build() {
            return new UserDataRequest(this);
        }

        public Builder setFetchLWAConsentStatus(boolean z10) {
            this.fetchLWAConsentStatus = z10;
            return this;
        }

        private Builder() {
        }
    }

    public UserDataRequest(Builder builder) {
        this.fetchLWAConsentStatus = builder.fetchLWAConsentStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getFetchLWAConsentStatus() {
        return this.fetchLWAConsentStatus;
    }
}
