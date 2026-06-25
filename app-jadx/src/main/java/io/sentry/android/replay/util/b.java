package io.sentry.android.replay.util;

import U0.T0;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50415c = T0.f18773g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T0 f50416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50417b;

    public b(T0 layout, boolean z10) {
        AbstractC5504s.h(layout, "layout");
        this.f50416a = layout;
        this.f50417b = z10;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return AbstractC5466a.d(this.f50416a.v(i10));
    }

    @Override // io.sentry.android.replay.util.q
    public int b(int i10) {
        return this.f50416a.u(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int c() {
        return this.f50416a.n();
    }

    @Override // io.sentry.android.replay.util.q
    public float d(int i10, int i11) {
        float fJ = this.f50416a.j(i11, true);
        return (this.f50417b || c() != 1) ? fJ : fJ - this.f50416a.s(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int e(int i10) {
        return AbstractC5466a.d(this.f50416a.m(i10));
    }

    @Override // io.sentry.android.replay.util.q
    public Integer f() {
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public int g(int i10) {
        return this.f50416a.o(i10, true);
    }

    @Override // io.sentry.android.replay.util.q
    public int h(int i10) {
        return this.f50416a.D(i10) ? 1 : 0;
    }
}
