package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3817g6 implements InterfaceC3900s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t6 f41333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q6 f41334c;

    C3817g6(q6 q6Var, String str, t6 t6Var) {
        this.f41332a = str;
        this.f41333b = t6Var;
        Objects.requireNonNull(q6Var);
        this.f41334c = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3900s2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f41334c.v(this.f41332a, i10, th2, bArr, this.f41333b);
    }
}
