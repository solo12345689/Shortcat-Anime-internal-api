package com.amazon.a.a.o.b.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.amazon.a.a.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34676a = "DATA_AUTH_KEY_LOAD_FAILURE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f34677b = 1;

    private a(String str, Throwable th2) {
        super(f34676a, str, th2);
    }

    public static a a(Throwable th2) {
        return new a("CERT_FAILED_TO_LOAD", th2);
    }

    public static a b(Throwable th2) {
        return new a("FAILED_TO_ESTABLISH_TRUST", th2);
    }

    public static a d() {
        return new a("CERT_NOT_FOUND", null);
    }

    public static a e() {
        return new a("CERT_INVALID", null);
    }

    public static a f() {
        return new a("VERIFICATION_FAILED", null);
    }
}
