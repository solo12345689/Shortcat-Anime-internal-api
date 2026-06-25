package Y;

import g0.m;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static final boolean a(U0 u02, D d10) {
        AbstractC5504s.f(d10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return u02.containsKey(d10);
    }

    public static final Object b(U0 u02, D d10) {
        AbstractC5504s.f(d10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objA = u02.get(d10);
        if (objA == null) {
            objA = d10.a();
        }
        return ((n2) objA).a(u02);
    }

    public static final U0 c(C2397c1[] c2397c1Arr, U0 u02, U0 u03) {
        m.a aVarBuilder = g0.n.a().builder();
        for (C2397c1 c2397c1 : c2397c1Arr) {
            D dB = c2397c1.b();
            AbstractC5504s.f(dB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            AbstractC2394b1 abstractC2394b1 = (AbstractC2394b1) dB;
            if (c2397c1.a() || !a(u02, abstractC2394b1)) {
                n2 n2Var = (n2) u03.get(abstractC2394b1);
                AbstractC5504s.f(c2397c1, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarBuilder.put(abstractC2394b1, abstractC2394b1.b(c2397c1, n2Var));
            }
        }
        return aVarBuilder.build();
    }

    public static /* synthetic */ U0 d(C2397c1[] c2397c1Arr, U0 u02, U0 u03, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            u03 = g0.n.a();
        }
        return c(c2397c1Arr, u02, u03);
    }
}
