package Zd;

import Td.L;
import Td.u;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final e a(Function2 function2, Object obj, e completion) {
        AbstractC5504s.h(function2, "<this>");
        AbstractC5504s.h(completion, "completion");
        return new k(AbstractC2605b.c(AbstractC2605b.a(function2, obj, completion)), AbstractC2605b.f());
    }

    public static final void b(Function2 function2, Object obj, e completion) {
        AbstractC5504s.h(function2, "<this>");
        AbstractC5504s.h(completion, "completion");
        e eVarC = AbstractC2605b.c(AbstractC2605b.a(function2, obj, completion));
        u.a aVar = u.f17466b;
        eVarC.resumeWith(u.b(L.f17438a));
    }
}
