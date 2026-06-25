package Xf;

import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class W {

    /* JADX INFO: renamed from: a */
    private static final Set f21963a = Ud.a0.h(Sf.a.t(Td.D.f17422b).getDescriptor(), Sf.a.u(Td.F.f17427b).getDescriptor(), Sf.a.s(Td.B.f17417b).getDescriptor(), Sf.a.v(Td.I.f17433b).getDescriptor());

    public static final boolean a(Tf.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        return eVar.isInline() && AbstractC5504s.c(eVar, Wf.j.p());
    }

    public static final boolean b(Tf.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        return eVar.isInline() && f21963a.contains(eVar);
    }
}
