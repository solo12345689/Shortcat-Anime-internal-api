package Nf;

import Gf.K;
import Lf.AbstractC1906m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f12860i = new c();

    private c() {
        super(j.f12872c, j.f12873d, j.f12874e, j.f12870a);
    }

    @Override // Gf.K
    public K Z1(int i10, String str) {
        AbstractC1906m.a(i10);
        return i10 >= j.f12872c ? AbstractC1906m.b(this, str) : super.Z1(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Gf.K
    public String toString() {
        return "Dispatchers.Default";
    }
}
