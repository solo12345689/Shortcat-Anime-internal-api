package com.amazon.a.a.d;

import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f34320a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34323d;

    protected b(String str) {
        this(str, (String) null);
    }

    public final String a() {
        return this.f34321b;
    }

    public final String b() {
        return this.f34322c;
    }

    public final String c() {
        return this.f34323d;
    }

    protected b(String str, String str2) {
        this(str, str2, (String) null);
    }

    private static String a(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        Throwable thC = c(th2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(th2));
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb2.append(th2.getMessage());
        if (th2 != thC) {
            sb2.append("/");
            sb2.append(b(thC));
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(thC.getMessage());
        }
        return sb2.toString();
    }

    private static String b(Throwable th2) {
        return th2.getClass().getName();
    }

    private static Throwable c(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    protected b(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f34321b = str;
        this.f34322c = str2;
        this.f34323d = str3;
    }

    protected b(String str, Throwable th2) {
        this(str, b(th2), th2);
    }

    protected b(String str, String str2, Throwable th2) {
        this(str, str2, a(th2));
    }
}
