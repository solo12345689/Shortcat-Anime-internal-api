package Lf;

import Td.AbstractC2156g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x {
    public static final void a(Function1 function1, Object obj, Zd.i iVar) {
        Q qB = b(function1, obj, null);
        if (qB != null) {
            Gf.M.a(iVar, qB);
        }
    }

    public static final Q b(Function1 function1, Object obj, Q q10) {
        try {
            function1.invoke(obj);
            return q10;
        } catch (Throwable th2) {
            if (q10 != null && q10.getCause() != th2) {
                AbstractC2156g.a(q10, th2);
                return q10;
            }
            return new Q("Exception in undelivered element handler for " + obj, th2);
        }
    }

    public static /* synthetic */ Q c(Function1 function1, Object obj, Q q10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q10 = null;
        }
        return b(function1, obj, q10);
    }
}
