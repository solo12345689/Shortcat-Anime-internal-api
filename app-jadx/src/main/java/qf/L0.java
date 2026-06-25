package qf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class L0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final S a(S s10) {
        AbstractC5504s.h(s10, "<this>");
        if (s10 instanceof K0) {
            return ((K0) s10).j0();
        }
        return null;
    }

    public static final M0 b(M0 m02, S origin) {
        AbstractC5504s.h(m02, "<this>");
        AbstractC5504s.h(origin, "origin");
        return d(m02, a(origin));
    }

    public static final M0 c(M0 m02, S origin, Function1 transform) {
        AbstractC5504s.h(m02, "<this>");
        AbstractC5504s.h(origin, "origin");
        AbstractC5504s.h(transform, "transform");
        S sA = a(origin);
        return d(m02, sA != null ? (S) transform.invoke(sA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final M0 d(M0 m02, S s10) {
        AbstractC5504s.h(m02, "<this>");
        if (m02 instanceof K0) {
            return d(((K0) m02).H0(), s10);
        }
        if (s10 == null || AbstractC5504s.c(s10, m02)) {
            return m02;
        }
        if (m02 instanceof AbstractC6183d0) {
            return new C6189g0((AbstractC6183d0) m02, s10);
        }
        if (m02 instanceof I) {
            return new K((I) m02, s10);
        }
        throw new Td.r();
    }
}
