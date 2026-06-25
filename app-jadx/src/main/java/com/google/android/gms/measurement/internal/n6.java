package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f41467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f41468b;

    /* synthetic */ n6(q6 q6Var, String str, byte[] bArr) {
        this(q6Var, str);
    }

    private n6(q6 q6Var, String str) {
        Objects.requireNonNull(q6Var);
        this.f41467a = str;
        this.f41468b = q6Var.e().c();
    }

    /* synthetic */ n6(q6 q6Var, byte[] bArr) {
        this(q6Var, q6Var.N0().l0());
    }
}
