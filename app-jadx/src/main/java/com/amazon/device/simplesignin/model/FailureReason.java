package com.amazon.device.simplesignin.model;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum FailureReason {
    UNAUTHORIZED("The user isn’t authorized to do log in."),
    BAD_REQUEST("The request is corrupted."),
    NOT_FOUND("The login page the user is looking for cannot be found."),
    FORBIDDEN("No login opportunity is available."),
    INTERNAL_SERVER_ERROR("Something is wrong with the login.");

    private final String description;

    FailureReason(String str) {
        this.description = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.description;
    }
}
