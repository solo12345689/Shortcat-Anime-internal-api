package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3194n f36017a;

    /* JADX INFO: renamed from: b */
    private final e0 f36018b;

    /* JADX INFO: renamed from: c */
    private long f36019c = 0;

    /* JADX INFO: renamed from: d */
    private int f36020d;

    /* JADX INFO: renamed from: e */
    private y6.b f36021e;

    public C(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        this.f36017a = interfaceC3194n;
        this.f36018b = e0Var;
    }

    public InterfaceC3194n a() {
        return this.f36017a;
    }

    public e0 b() {
        return this.f36018b;
    }

    public long c() {
        return this.f36019c;
    }

    public g0 d() {
        return this.f36018b.m();
    }

    public int e() {
        return this.f36020d;
    }

    public y6.b f() {
        return this.f36021e;
    }

    public Uri g() {
        return this.f36018b.q().v();
    }

    public void h(long j10) {
        this.f36019c = j10;
    }

    public void i(int i10) {
        this.f36020d = i10;
    }

    public void j(y6.b bVar) {
        this.f36021e = bVar;
    }
}
