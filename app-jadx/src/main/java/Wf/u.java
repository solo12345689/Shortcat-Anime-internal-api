package Wf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u {
    public static final AbstractC2358b a(AbstractC2358b from, Function1 builderAction) {
        AbstractC5504s.h(from, "from");
        AbstractC5504s.h(builderAction, "builderAction");
        C2361e c2361e = new C2361e(from);
        builderAction.invoke(c2361e);
        return new t(c2361e.a(), c2361e.b());
    }

    public static /* synthetic */ AbstractC2358b b(AbstractC2358b abstractC2358b, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC2358b = AbstractC2358b.f20895d;
        }
        return a(abstractC2358b, function1);
    }
}
