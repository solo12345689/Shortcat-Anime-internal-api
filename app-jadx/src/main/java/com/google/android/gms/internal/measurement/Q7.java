package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q7 extends AbstractC3499k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f39556c;

    public Q7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f39556c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        try {
            return AbstractC3413a3.a(this.f39556c.call());
        } catch (Exception unused) {
            return InterfaceC3553q.f39929W;
        }
    }
}
