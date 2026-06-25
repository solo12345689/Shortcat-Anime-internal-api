package Xf;

import Tf.l;
import Wf.AbstractC2358b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d0 {
    public static final boolean c(Tf.e eVar) {
        return (eVar.h() instanceof Tf.d) || eVar.h() == l.b.f17533a;
    }

    public static final Wf.i d(AbstractC2358b json, Object obj, Rf.k serializer) {
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(serializer, "serializer");
        final kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        new L(json, new Function1() { // from class: Xf.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return d0.e(n10, (Wf.i) obj2);
            }
        }).t(serializer, obj);
        Object obj2 = n10.f52259a;
        if (obj2 != null) {
            return (Wf.i) obj2;
        }
        AbstractC5504s.u("result");
        return null;
    }

    public static final Td.L e(kotlin.jvm.internal.N n10, Wf.i it) {
        AbstractC5504s.h(it, "it");
        n10.f52259a = it;
        return Td.L.f17438a;
    }
}
