package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U0 f39133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U0 f39134b;

    static {
        U0 u02 = null;
        try {
            u02 = (U0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39133a = u02;
        f39134b = new U0();
    }

    static U0 a() {
        return f39133a;
    }

    static U0 b() {
        return f39134b;
    }
}
