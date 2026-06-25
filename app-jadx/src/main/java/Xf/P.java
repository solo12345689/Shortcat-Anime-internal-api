package Xf;

import Wf.AbstractC2358b;
import Wf.C2359c;
import Wf.C2360d;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class P extends L {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21925i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(AbstractC2358b json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(nodeConsumer, "nodeConsumer");
        this.f21925i = true;
    }

    @Override // Xf.L, Xf.AbstractC2368e
    public Wf.i r0() {
        return new Wf.C(w0());
    }

    @Override // Xf.L, Xf.AbstractC2368e
    public void v0(String key, Wf.i element) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(element, "element");
        if (!this.f21925i) {
            Map mapW0 = w0();
            String str = this.f21924h;
            if (str == null) {
                AbstractC5504s.u("tag");
                str = null;
            }
            mapW0.put(str, element);
            this.f21925i = true;
            return;
        }
        if (element instanceof Wf.E) {
            this.f21924h = ((Wf.E) element).b();
            this.f21925i = false;
        } else {
            if (element instanceof Wf.C) {
                throw C.d(Wf.D.f20883a.getDescriptor());
            }
            if (!(element instanceof C2359c)) {
                throw new Td.r();
            }
            throw C.d(C2360d.f20900a.getDescriptor());
        }
    }
}
