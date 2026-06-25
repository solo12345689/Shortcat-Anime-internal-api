package dc;

import Ub.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String name, C5972b[] desiredArgsTypes, Function1 body) {
        super(name, desiredArgsTypes, body);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desiredArgsTypes, "desiredArgsTypes");
        AbstractC5504s.h(body, "body");
    }

    @Override // dc.s, dc.AbstractC4584e
    public void s(Object[] args, u promise, Ub.d appContext) {
        AbstractC5504s.h(args, "args");
        AbstractC5504s.h(promise, "promise");
        AbstractC5504s.h(appContext, "appContext");
        promise.resolve((String) u().invoke(AbstractC4580a.c(this, args, appContext, false, 4, null)));
    }
}
