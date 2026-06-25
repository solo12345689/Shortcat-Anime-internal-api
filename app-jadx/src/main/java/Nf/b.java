package Nf;

import Gf.AbstractC1633s0;
import Gf.K;
import Lf.F;
import Lf.H;
import java.util.concurrent.Executor;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends AbstractC1633s0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f12858d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K f12859e = K.a2(k.f12876c, H.e("kotlinx.coroutines.io.parallelism", AbstractC5874j.e(64, F.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        f12859e.D1(iVar, runnable);
    }

    @Override // Gf.K
    public void O1(Zd.i iVar, Runnable runnable) {
        f12859e.O1(iVar, runnable);
    }

    @Override // Gf.K
    public K Z1(int i10, String str) {
        return k.f12876c.Z1(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        D1(Zd.j.f23275a, runnable);
    }

    @Override // Gf.K
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // Gf.AbstractC1633s0
    public Executor b2() {
        return this;
    }
}
