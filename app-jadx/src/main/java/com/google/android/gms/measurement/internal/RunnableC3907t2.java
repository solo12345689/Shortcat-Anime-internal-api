package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3907t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3900s2 f41604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f41606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f41607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f41609f;

    /* synthetic */ RunnableC3907t2(String str, InterfaceC3900s2 interfaceC3900s2, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        AbstractC2115p.l(interfaceC3900s2);
        this.f41604a = interfaceC3900s2;
        this.f41605b = i10;
        this.f41606c = th2;
        this.f41607d = bArr;
        this.f41608e = str;
        this.f41609f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41604a.a(this.f41608e, this.f41605b, this.f41606c, this.f41607d, this.f41609f);
    }
}
