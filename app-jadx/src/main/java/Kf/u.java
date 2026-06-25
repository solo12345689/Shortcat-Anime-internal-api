package Kf;

import Gf.C0;
import Lf.A;
import Zd.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u {
    public static final void b(final r rVar, Zd.i iVar) {
        if (((Number) iVar.y1(0, new Function2() { // from class: Kf.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(u.c(rVar, ((Integer) obj).intValue(), (i.b) obj2));
            }
        })).intValue() == rVar.f11127c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + rVar.f11126b + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(r rVar, int i10, i.b bVar) {
        i.c key = bVar.getKey();
        i.b bVarL = rVar.f11126b.l(key);
        if (key != C0.f7490K) {
            if (bVar != bVarL) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        C0 c02 = (C0) bVarL;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        C0 c0D = d((C0) bVar, c02);
        if (c0D == c02) {
            return c02 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + c0D + ", expected child of " + c02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final C0 d(C0 c02, C0 c03) {
        while (c02 != null) {
            if (c02 == c03 || !(c02 instanceof A)) {
                return c02;
            }
            c02 = ((A) c02).c0();
        }
        return null;
    }
}
