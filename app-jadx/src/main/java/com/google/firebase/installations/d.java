package com.google.firebase.installations;

import X9.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f43291a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f43291a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f43291a = aVar;
    }
}
