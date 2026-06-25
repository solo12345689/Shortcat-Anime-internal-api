package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3699m0 extends AbstractC3694l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40498a = AtomicReferenceFieldUpdater.newUpdater(C3714p0.class, Thread.class, "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40499b = AtomicReferenceFieldUpdater.newUpdater(C3714p0.class, C3714p0.class, "b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40500c = AtomicReferenceFieldUpdater.newUpdater(AbstractC3719q0.class, C3714p0.class, "c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40501d = AtomicReferenceFieldUpdater.newUpdater(AbstractC3719q0.class, C3679i0.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40502e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3719q0.class, Object.class, "a");

    /* synthetic */ C3699m0(AbstractC3743v0 abstractC3743v0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final C3679i0 a(AbstractC3719q0 abstractC3719q0, C3679i0 c3679i0) {
        return (C3679i0) f40501d.getAndSet(abstractC3719q0, c3679i0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final C3714p0 b(AbstractC3719q0 abstractC3719q0, C3714p0 c3714p0) {
        return (C3714p0) f40500c.getAndSet(abstractC3719q0, c3714p0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final void c(C3714p0 c3714p0, C3714p0 c3714p02) {
        f40499b.lazySet(c3714p0, c3714p02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    public final void d(C3714p0 c3714p0, Thread thread) {
        f40498a.lazySet(c3714p0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean e(AbstractC3719q0 abstractC3719q0, C3679i0 c3679i0, C3679i0 c3679i02) {
        return AbstractC3723r0.a(f40501d, abstractC3719q0, c3679i0, c3679i02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean f(AbstractC3719q0 abstractC3719q0, Object obj, Object obj2) {
        return AbstractC3723r0.a(f40502e, abstractC3719q0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3694l0
    final boolean g(AbstractC3719q0 abstractC3719q0, C3714p0 c3714p0, C3714p0 c3714p02) {
        return AbstractC3723r0.a(f40500c, abstractC3719q0, c3714p0, c3714p02);
    }
}
