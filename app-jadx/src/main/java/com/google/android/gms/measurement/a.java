package com.google.android.gms.measurement;

import R8.AbstractC2115p;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.C3937x4;
import com.google.android.gms.measurement.internal.X2;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2 f40600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3937x4 f40601b;

    public a(X2 x22) {
        super(null);
        AbstractC2115p.l(x22);
        this.f40600a = x22;
        this.f40601b = x22.B();
    }

    @Override // j9.E
    public final String a() {
        return this.f40601b.Q();
    }

    @Override // j9.E
    public final String b() {
        return this.f40601b.R();
    }

    @Override // j9.E
    public final String c() {
        return this.f40601b.D();
    }

    @Override // j9.E
    public final void d(String str, String str2, Bundle bundle) {
        this.f40601b.p(str, str2, bundle);
    }

    @Override // j9.E
    public final long e() {
        return this.f40600a.C().p0();
    }

    @Override // j9.E
    public final void f(Bundle bundle) {
        this.f40601b.M(bundle);
    }

    @Override // j9.E
    public final String g() {
        return this.f40601b.S();
    }

    @Override // j9.E
    public final void h(String str) {
        X2 x22 = this.f40600a;
        x22.M().j(str, x22.e().c());
    }

    @Override // j9.E
    public final void i(String str) {
        X2 x22 = this.f40600a;
        x22.M().i(str, x22.e().c());
    }

    @Override // j9.E
    public final int j(String str) {
        this.f40601b.L(str);
        return 25;
    }

    @Override // j9.E
    public final Map k(String str, String str2, boolean z10) {
        return this.f40601b.C(str, str2, z10);
    }

    @Override // j9.E
    public final void l(String str, String str2, Bundle bundle) {
        this.f40600a.B().O(str, str2, bundle);
    }

    @Override // j9.E
    public final List m(String str, String str2) {
        return this.f40601b.P(str, str2);
    }
}
