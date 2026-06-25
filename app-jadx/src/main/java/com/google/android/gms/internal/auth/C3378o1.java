package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3378o1 extends RuntimeException {
    public C3378o1(Z0 z02) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final H0 a() {
        return new H0(getMessage());
    }
}
