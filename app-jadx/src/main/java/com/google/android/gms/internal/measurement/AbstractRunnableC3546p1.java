package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractRunnableC3546p1 implements Runnable {

    /* JADX INFO: renamed from: a */
    final long f39921a;

    /* JADX INFO: renamed from: b */
    final long f39922b;

    /* JADX INFO: renamed from: c */
    final boolean f39923c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C3632z1 f39924d;

    AbstractRunnableC3546p1(C3632z1 c3632z1, boolean z10) {
        Objects.requireNonNull(c3632z1);
        this.f39924d = c3632z1;
        this.f39921a = c3632z1.f40120b.a();
        this.f39922b = c3632z1.f40120b.c();
        this.f39923c = z10;
    }

    abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f39924d.m()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f39924d.k(e10, false, this.f39923c);
            b();
        }
    }

    protected void b() {
    }
}
