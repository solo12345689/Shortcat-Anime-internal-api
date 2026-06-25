package qf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class F {
    public static /* synthetic */ B0 b(F f10, ye.m0 m0Var, G g10, A0 a02, S s10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            s10 = a02.e(m0Var, g10);
        }
        return f10.a(m0Var, g10, a02, s10);
    }

    public B0 a(ye.m0 parameter, G typeAttr, A0 typeParameterUpperBoundEraser, S erasedUpperBound) {
        AbstractC5504s.h(parameter, "parameter");
        AbstractC5504s.h(typeAttr, "typeAttr");
        AbstractC5504s.h(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC5504s.h(erasedUpperBound, "erasedUpperBound");
        return new D0(N0.f58001g, erasedUpperBound);
    }
}
