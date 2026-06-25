package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5176b {

    /* JADX INFO: renamed from: a */
    private byte[] f50524a;

    /* JADX INFO: renamed from: b */
    private final B0 f50525b;

    /* JADX INFO: renamed from: c */
    private final Callable f50526c;

    /* JADX INFO: renamed from: d */
    private String f50527d;

    /* JADX INFO: renamed from: e */
    private final String f50528e;

    /* JADX INFO: renamed from: f */
    private final String f50529f;

    /* JADX INFO: renamed from: g */
    private final boolean f50530g;

    /* JADX INFO: renamed from: h */
    private String f50531h;

    public C5176b(byte[] bArr, String str, String str2, boolean z10) {
        this(bArr, str, str2, "event.attachment", z10);
    }

    public static C5176b a(Callable callable, String str, String str2, boolean z10) {
        return new C5176b(callable, str, str2, "event.attachment", z10);
    }

    public static C5176b b(byte[] bArr) {
        return new C5176b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static C5176b c(io.sentry.protocol.J j10) {
        return new C5176b((B0) j10, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f50531h;
    }

    public Callable e() {
        return this.f50526c;
    }

    public byte[] f() {
        return this.f50524a;
    }

    public String g() {
        return this.f50529f;
    }

    public String h() {
        return this.f50528e;
    }

    public String i() {
        return this.f50527d;
    }

    public B0 j() {
        return this.f50525b;
    }

    boolean k() {
        return this.f50530g;
    }

    public C5176b(byte[] bArr, String str, String str2, String str3, boolean z10) {
        this.f50524a = bArr;
        this.f50525b = null;
        this.f50526c = null;
        this.f50528e = str;
        this.f50529f = str2;
        this.f50531h = str3;
        this.f50530g = z10;
    }

    public C5176b(B0 b02, String str, String str2, String str3, boolean z10) {
        this.f50524a = null;
        this.f50525b = b02;
        this.f50526c = null;
        this.f50528e = str;
        this.f50529f = str2;
        this.f50531h = str3;
        this.f50530g = z10;
    }

    public C5176b(Callable callable, String str, String str2, String str3, boolean z10) {
        this.f50524a = null;
        this.f50525b = null;
        this.f50526c = callable;
        this.f50528e = str;
        this.f50529f = str2;
        this.f50531h = str3;
        this.f50530g = z10;
    }
}
