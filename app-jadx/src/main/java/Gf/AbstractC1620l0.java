package Gf;

import Lf.AbstractC1906m;
import Ud.C2272m;

/* JADX INFO: renamed from: Gf.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1620l0 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2272m f7588e;

    public static /* synthetic */ void c2(AbstractC1620l0 abstractC1620l0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1620l0.b2(z10);
    }

    private final long d2(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void h2(AbstractC1620l0 abstractC1620l0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1620l0.g2(z10);
    }

    @Override // Gf.K
    public final K Z1(int i10, String str) {
        AbstractC1906m.a(i10);
        return AbstractC1906m.b(this, str);
    }

    public final void b2(boolean z10) {
        long jD2 = this.f7586c - d2(z10);
        this.f7586c = jD2;
        if (jD2 <= 0 && this.f7587d) {
            shutdown();
        }
    }

    public final void e2(AbstractC1602c0 abstractC1602c0) {
        C2272m c2272m = this.f7588e;
        if (c2272m == null) {
            c2272m = new C2272m();
            this.f7588e = c2272m;
        }
        c2272m.addLast(abstractC1602c0);
    }

    protected long f2() {
        C2272m c2272m = this.f7588e;
        return (c2272m == null || c2272m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void g2(boolean z10) {
        this.f7586c += d2(z10);
        if (z10) {
            return;
        }
        this.f7587d = true;
    }

    public final boolean i2() {
        return this.f7586c >= d2(true);
    }

    public final boolean j2() {
        C2272m c2272m = this.f7588e;
        if (c2272m != null) {
            return c2272m.isEmpty();
        }
        return true;
    }

    public abstract long k2();

    public final boolean l2() {
        AbstractC1602c0 abstractC1602c0;
        C2272m c2272m = this.f7588e;
        if (c2272m == null || (abstractC1602c0 = (AbstractC1602c0) c2272m.z()) == null) {
            return false;
        }
        abstractC1602c0.run();
        return true;
    }

    public boolean m2() {
        return false;
    }

    public abstract void shutdown();
}
