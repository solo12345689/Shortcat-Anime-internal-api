package com.amazon.device.iap.internal.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f35018a = 7955687159702952249L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35020c;

    public e(String str, String str2) {
        this.f35019b = str;
        this.f35020c = str2;
    }

    public String a() {
        return this.f35019b;
    }

    public String b() {
        return this.f35020c;
    }

    public e(String str, String str2, Throwable th2) {
        super(th2);
        this.f35019b = str;
        this.f35020c = str2;
    }
}
