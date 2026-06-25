package Q0;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import K0.AbstractC1785e0;
import R0.s;
import R0.w;
import R0.x;
import Td.C2160k;
import a0.C2507c;
import i1.AbstractC5024q;
import i1.C5023p;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    private static final boolean a(s sVar) {
        Function2 function2C = c(sVar);
        R0.j jVar = (R0.j) R0.m.a(sVar.y(), x.f15043a.O());
        return (function2C == null || jVar == null || ((Number) jVar.a().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    private static final List b(s sVar) {
        return sVar.n(false, false, false);
    }

    public static final Function2 c(s sVar) {
        return (Function2) R0.m.a(sVar.y(), R0.l.f14981a.v());
    }

    private static final void d(s sVar, int i10, Function1 function1) {
        s sVar2;
        C2507c c2507c = new C2507c(new s[16], 0);
        List listB = b(sVar);
        while (true) {
            c2507c.f(c2507c.p(), listB);
            while (c2507c.p() != 0) {
                sVar2 = (s) c2507c.y(c2507c.p() - 1);
                if (!w.c(sVar2) && !sVar2.y().e(x.f15043a.f())) {
                    AbstractC1785e0 abstractC1785e0F = sVar2.f();
                    if (abstractC1785e0F == null) {
                        H0.a.c("Expected semantics node to have a coordinator.");
                        throw new C2160k();
                    }
                    InterfaceC1690p interfaceC1690pX = abstractC1785e0F.x();
                    C5023p c5023pB = AbstractC5024q.b(AbstractC1691q.c(interfaceC1690pX));
                    if (c5023pB.k()) {
                        continue;
                    } else {
                        if (!a(sVar2)) {
                            break;
                        }
                        int i11 = i10 + 1;
                        function1.invoke(new l(sVar2, i11, c5023pB, interfaceC1690pX));
                        d(sVar2, i11, function1);
                    }
                }
            }
            return;
            listB = b(sVar2);
        }
    }

    static /* synthetic */ void e(s sVar, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(sVar, i10, function1);
    }
}
