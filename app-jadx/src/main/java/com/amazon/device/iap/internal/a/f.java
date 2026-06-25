package com.amazon.device.iap.internal.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f35028a = 3715222306172636179L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35031d;

    public f(String str, String str2, String str3) {
        this.f35029b = str;
        this.f35030c = str2;
        this.f35031d = str3;
    }

    public String a() {
        return this.f35029b;
    }

    public String b() {
        return this.f35030c;
    }

    public String c() {
        return this.f35031d;
    }

    public f(String str, String str2, String str3, Throwable th2) {
        super(th2);
        this.f35029b = str;
        this.f35030c = str2;
        this.f35031d = str3;
    }
}
