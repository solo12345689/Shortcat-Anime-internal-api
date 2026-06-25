package com.google.android.gms.measurement.internal;

import j9.AbstractBinderC5352i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P4 extends AbstractBinderC5352i {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f40910a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3931w5 f40911b;

    P4(C3931w5 c3931w5, AtomicReference atomicReference) {
        this.f40910a = atomicReference;
        Objects.requireNonNull(c3931w5);
        this.f40911b = c3931w5;
    }

    @Override // j9.InterfaceC5353j
    public final void Z2(Z5 z52) {
        AtomicReference atomicReference = this.f40910a;
        synchronized (atomicReference) {
            this.f40911b.f40611a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(z52.f41084a.size()));
            atomicReference.set(z52);
            atomicReference.notifyAll();
        }
    }
}
