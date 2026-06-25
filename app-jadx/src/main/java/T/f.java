package T;

import i1.C5015h;
import i1.InterfaceC5011d;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f16722a = C5015h.n(10);

    public static final float a(InterfaceC5011d interfaceC5011d, boolean z10, long j10) {
        float fK = C6224f.k(AbstractC6225g.a(C6230l.i(j10), C6230l.g(j10))) / 2.0f;
        return z10 ? fK + interfaceC5011d.l1(f16722a) : fK;
    }

    public static final float b(long j10) {
        return Math.max(C6230l.i(j10), C6230l.g(j10)) * 0.3f;
    }
}
