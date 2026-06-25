package qf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class L {
    public static final I a(S s10) {
        AbstractC5504s.h(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        AbstractC5504s.f(m0Q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (I) m0Q0;
    }

    public static final boolean b(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return s10.Q0() instanceof I;
    }

    public static final AbstractC6183d0 c(S s10) {
        AbstractC5504s.h(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            return ((I) m0Q0).V0();
        }
        if (m0Q0 instanceof AbstractC6183d0) {
            return (AbstractC6183d0) m0Q0;
        }
        throw new Td.r();
    }

    public static final AbstractC6183d0 d(S s10) {
        AbstractC5504s.h(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            return ((I) m0Q0).W0();
        }
        if (m0Q0 instanceof AbstractC6183d0) {
            return (AbstractC6183d0) m0Q0;
        }
        throw new Td.r();
    }
}
