package Xf;

import Wf.AbstractC2358b;
import Wf.C2359c;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class N extends AbstractC2368e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f21919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC2358b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(nodeConsumer, "nodeConsumer");
        this.f21919g = new ArrayList();
    }

    @Override // Xf.AbstractC2368e, Vf.V
    protected String a0(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // Xf.AbstractC2368e
    public Wf.i r0() {
        return new C2359c(this.f21919g);
    }

    @Override // Xf.AbstractC2368e
    public void v0(String key, Wf.i element) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(element, "element");
        this.f21919g.add(Integer.parseInt(key), element);
    }
}
