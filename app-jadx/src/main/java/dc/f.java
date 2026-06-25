package dc;

import Ub.u;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC4584e {

    /* JADX INFO: renamed from: h */
    private final Function2 f45114h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String name, C5972b[] desiredArgsTypes, Function2 body) {
        super(name, desiredArgsTypes);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desiredArgsTypes, "desiredArgsTypes");
        AbstractC5504s.h(body, "body");
        this.f45114h = body;
    }

    @Override // dc.AbstractC4584e
    public void s(Object[] args, u promise, Ub.d appContext) {
        AbstractC5504s.h(args, "args");
        AbstractC5504s.h(promise, "promise");
        AbstractC5504s.h(appContext, "appContext");
        this.f45114h.invoke(AbstractC4580a.c(this, args, appContext, false, 4, null), promise);
    }
}
