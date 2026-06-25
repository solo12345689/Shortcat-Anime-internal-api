package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k6 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f41405a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f41406b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Bundle f41407c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ l6 f41408d;

    k6(l6 l6Var, String str, String str2, Bundle bundle) {
        this.f41405a = str;
        this.f41406b = str2;
        this.f41407c = bundle;
        Objects.requireNonNull(l6Var);
        this.f41408d = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6 q6Var = this.f41408d.f41418a;
        z6 z6VarN0 = q6Var.N0();
        long jA = q6Var.e().a();
        String str = this.f41405a;
        q6Var.i((G) AbstractC2115p.l(z6VarN0.R(str, this.f41406b, this.f41407c, "auto", jA, false, true)), str);
    }
}
