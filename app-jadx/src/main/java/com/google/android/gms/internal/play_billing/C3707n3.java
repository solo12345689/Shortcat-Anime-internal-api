package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3707n3 extends H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f40512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f40513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f40514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f40515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f40516e;

    C3707n3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f40512a = atomicReferenceFieldUpdater;
        this.f40513b = atomicReferenceFieldUpdater2;
        this.f40514c = atomicReferenceFieldUpdater3;
        this.f40515d = atomicReferenceFieldUpdater4;
        this.f40516e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final void a(L3 l32, L3 l33) {
        this.f40513b.lazySet(l32, l33);
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final void b(L3 l32, Thread thread) {
        this.f40512a.lazySet(l32, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final boolean c(N3 n32, C3730s2 c3730s2, C3730s2 c3730s22) {
        return M2.a(this.f40515d, n32, c3730s2, c3730s22);
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final boolean d(N3 n32, Object obj, Object obj2) {
        return M2.a(this.f40516e, n32, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.H0
    final boolean e(N3 n32, L3 l32, L3 l33) {
        return M2.a(this.f40514c, n32, l32, l33);
    }
}
