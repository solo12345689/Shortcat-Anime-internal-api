package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final A f38913e = new A(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f38914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f38915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Throwable f38916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f38917d;

    private A(boolean z10, int i10, int i11, String str, Throwable th2, long j10) {
        this.f38914a = z10;
        this.f38917d = i10;
        this.f38915b = str;
        this.f38916c = th2;
    }

    static A b() {
        return f38913e;
    }

    static A c(String str) {
        return new A(false, 1, 5, str, null, -1L);
    }

    static A d(String str, Throwable th2) {
        return new A(false, 1, 5, str, th2, -1L);
    }

    public static A f(int i10, long j10) {
        return new A(true, i10, 1, null, null, j10);
    }

    static A g(int i10, int i11, String str, Throwable th2) {
        return new A(false, i10, i11, str, th2, -1L);
    }

    String a() {
        return this.f38915b;
    }

    final void e() {
        if (this.f38914a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th2 = this.f38916c;
        if (th2 != null) {
            Log.d("GoogleCertificatesRslt", a(), th2);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    /* synthetic */ A(boolean z10, int i10, int i11, String str, Throwable th2, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
