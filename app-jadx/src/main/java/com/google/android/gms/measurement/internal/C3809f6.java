package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3809f6 implements InterfaceC3900s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f41299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q6 f41300c;

    C3809f6(q6 q6Var, String str, List list) {
        this.f41298a = str;
        this.f41299b = list;
        Objects.requireNonNull(q6Var);
        this.f41300c = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3900s2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f41300c.A(true, i10, th2, bArr, this.f41298a, this.f41299b);
    }
}
