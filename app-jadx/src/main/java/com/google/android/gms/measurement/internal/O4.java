package com.google.android.gms.measurement.internal;

import j9.AbstractBinderC5349f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O4 extends AbstractBinderC5349f {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f40892a;

    O4(C3931w5 c3931w5, AtomicReference atomicReference) {
        this.f40892a = atomicReference;
        Objects.requireNonNull(c3931w5);
    }

    @Override // j9.InterfaceC5350g
    public final void o1(List list) {
        AtomicReference atomicReference = this.f40892a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
