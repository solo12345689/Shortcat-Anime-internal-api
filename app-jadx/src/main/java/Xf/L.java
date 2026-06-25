package Xf;

import Wf.AbstractC2358b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class L extends AbstractC2368e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f21915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AbstractC2358b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(nodeConsumer, "nodeConsumer");
        this.f21915g = new LinkedHashMap();
    }

    @Override // Vf.B0, Uf.d
    public void f(Tf.e descriptor, int i10, Rf.k serializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(serializer, "serializer");
        if (obj != null || this.f21979d.j()) {
            super.f(descriptor, i10, serializer, obj);
        }
    }

    @Override // Xf.AbstractC2368e
    public Wf.i r0() {
        return new Wf.C(this.f21915g);
    }

    @Override // Xf.AbstractC2368e
    public void v0(String key, Wf.i element) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(element, "element");
        this.f21915g.put(key, element);
    }

    protected final Map w0() {
        return this.f21915g;
    }
}
