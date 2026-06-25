package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y1 f39350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39351b;

    public G(Y1 y12, String str) {
        this.f39350a = y12;
        this.f39351b = str;
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final Y1 a(InterfaceC3553q interfaceC3553q) {
        Y1 y1C = this.f39350a.c();
        y1C.f(this.f39351b, interfaceC3553q);
        return y1C;
    }
}
