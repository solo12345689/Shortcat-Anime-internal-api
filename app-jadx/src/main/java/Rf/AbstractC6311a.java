package rf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.u0;
import rf.AbstractC6316f;
import rf.AbstractC6317g;

/* JADX INFO: renamed from: rf.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6311a {
    public static final u0 a(boolean z10, boolean z11, InterfaceC6312b typeSystemContext, AbstractC6316f kotlinTypePreparator, AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(typeSystemContext, "typeSystemContext");
        AbstractC5504s.h(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new u0(z10, z11, false, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ u0 b(boolean z10, boolean z11, InterfaceC6312b interfaceC6312b, AbstractC6316f abstractC6316f, AbstractC6317g abstractC6317g, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC6312b = s.f58800a;
        }
        if ((i10 & 8) != 0) {
            abstractC6316f = AbstractC6316f.a.f58774a;
        }
        if ((i10 & 16) != 0) {
            abstractC6317g = AbstractC6317g.a.f58775a;
        }
        return a(z10, z11, interfaceC6312b, abstractC6316f, abstractC6317g);
    }
}
