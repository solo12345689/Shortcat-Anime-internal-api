package Xf;

import Tf.l;
import Tf.m;
import Wf.AbstractC2358b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f0 {
    public static final Tf.e a(Tf.e eVar, Yf.e module) {
        Tf.e eVarA;
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(module, "module");
        if (!AbstractC5504s.c(eVar.h(), l.a.f17532a)) {
            return eVar.isInline() ? a(eVar.n(0), module) : eVar;
        }
        Tf.e eVarB = Tf.b.b(module, eVar);
        return (eVarB == null || (eVarA = a(eVarB, module)) == null) ? eVar : eVarA;
    }

    public static final e0 b(AbstractC2358b abstractC2358b, Tf.e desc) {
        AbstractC5504s.h(abstractC2358b, "<this>");
        AbstractC5504s.h(desc, "desc");
        Tf.l lVarH = desc.h();
        if (lVarH instanceof Tf.c) {
            return e0.f21991f;
        }
        if (AbstractC5504s.c(lVarH, m.b.f17535a)) {
            return e0.f21989d;
        }
        if (!AbstractC5504s.c(lVarH, m.c.f17536a)) {
            return e0.f21988c;
        }
        Tf.e eVarA = a(desc.n(0), abstractC2358b.a());
        Tf.l lVarH2 = eVarA.h();
        if ((lVarH2 instanceof Tf.d) || AbstractC5504s.c(lVarH2, l.b.f17533a)) {
            return e0.f21990e;
        }
        if (abstractC2358b.f().c()) {
            return e0.f21989d;
        }
        throw C.d(eVarA);
    }
}
