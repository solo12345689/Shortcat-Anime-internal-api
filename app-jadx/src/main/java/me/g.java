package Me;

import Td.r;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.A0;
import qf.B0;
import qf.D0;
import qf.F;
import qf.G;
import qf.J0;
import qf.N0;
import qf.S;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends F {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12419a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f12406c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f12405b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f12404a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12419a = iArr;
        }
    }

    @Override // qf.F
    public B0 a(m0 parameter, G typeAttr, A0 typeParameterUpperBoundEraser, S erasedUpperBound) {
        AbstractC5504s.h(parameter, "parameter");
        AbstractC5504s.h(typeAttr, "typeAttr");
        AbstractC5504s.h(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC5504s.h(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof Me.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        Me.a aVarL = (Me.a) typeAttr;
        if (!aVarL.i()) {
            aVarL = aVarL.l(c.f12404a);
        }
        int i10 = a.f12419a[aVarL.g().ordinal()];
        if (i10 == 1) {
            return new D0(N0.f57999e, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new r();
        }
        if (!parameter.m().b()) {
            return new D0(N0.f57999e, ff.e.m(parameter).I());
        }
        List parameters = erasedUpperBound.N0().getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new D0(N0.f58001g, erasedUpperBound);
        }
        B0 b0T = J0.t(parameter, aVarL);
        AbstractC5504s.e(b0T);
        return b0T;
    }
}
