package Lf;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Lf.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1895b {

    /* JADX INFO: renamed from: a */
    private static final E f11564a = new E("CLOSED");

    public static final AbstractC1896c b(AbstractC1896c abstractC1896c) {
        while (true) {
            Object objG = abstractC1896c.g();
            if (objG == f11564a) {
                return abstractC1896c;
            }
            AbstractC1896c abstractC1896c2 = (AbstractC1896c) objG;
            if (abstractC1896c2 != null) {
                abstractC1896c = abstractC1896c2;
            } else if (abstractC1896c.m()) {
                return abstractC1896c;
            }
        }
    }

    public static final Object c(B b10, long j10, Function2 function2) {
        while (true) {
            if (b10.f11547c >= j10 && !b10.k()) {
                return C.a(b10);
            }
            Object objG = b10.g();
            if (objG == f11564a) {
                return C.a(f11564a);
            }
            B b11 = (B) ((AbstractC1896c) objG);
            if (b11 == null) {
                b11 = (B) function2.invoke(Long.valueOf(b10.f11547c + 1), b10);
                if (b10.o(b11)) {
                    if (b10.k()) {
                        b10.n();
                    }
                }
            }
            b10 = b11;
        }
    }
}
