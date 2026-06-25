package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3354g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3351f1 f39180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3351f1 f39181b;

    static {
        C3351f1 c3351f1 = null;
        try {
            c3351f1 = (C3351f1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39180a = c3351f1;
        f39181b = new C3351f1();
    }

    static C3351f1 a() {
        return f39180a;
    }

    static C3351f1 b() {
        return f39181b;
    }
}
