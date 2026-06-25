package Wf;

import Xf.T;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class t extends AbstractC2358b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C2363g configuration, Yf.e module) {
        super(configuration, module, null);
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(module, "module");
        h();
    }

    private final void h() {
        if (AbstractC5504s.c(a(), Yf.g.a())) {
            return;
        }
        a().a(new T(f().p(), f().e()));
    }
}
