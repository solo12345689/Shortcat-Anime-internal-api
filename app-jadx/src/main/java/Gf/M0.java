package Gf;

import Lf.AbstractC1906m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class M0 extends K {
    @Override // Gf.K
    public K Z1(int i10, String str) {
        AbstractC1906m.a(i10);
        return AbstractC1906m.b(this, str);
    }

    public abstract M0 b2();

    protected final String c2() {
        M0 m0B2;
        M0 m0C = C1608f0.c();
        if (this == m0C) {
            return "Dispatchers.Main";
        }
        try {
            m0B2 = m0C.b2();
        } catch (UnsupportedOperationException unused) {
            m0B2 = null;
        }
        if (this == m0B2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
