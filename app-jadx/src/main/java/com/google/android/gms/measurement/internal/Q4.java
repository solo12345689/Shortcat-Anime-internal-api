package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Q4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ B6 f40923a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f40924b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ v6 f40925c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C3931w5 f40926d;

    Q4(C3931w5 c3931w5, B6 b62, boolean z10, v6 v6Var) {
        this.f40923a = b62;
        this.f40924b = z10;
        this.f40925c = v6Var;
        Objects.requireNonNull(c3931w5);
        this.f40926d = c3931w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f40926d;
        InterfaceC5347d interfaceC5347dN = c3931w5.N();
        if (interfaceC5347dN == null) {
            c3931w5.f40611a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        B6 b62 = this.f40923a;
        AbstractC2115p.l(b62);
        c3931w5.b0(interfaceC5347dN, this.f40924b ? null : this.f40925c, b62);
        c3931w5.J();
    }
}
