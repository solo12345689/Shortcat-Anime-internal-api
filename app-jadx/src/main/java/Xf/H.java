package Xf;

import Wf.AbstractC2358b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class H extends AbstractC2368e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Wf.i f21908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC2358b json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(nodeConsumer, "nodeConsumer");
        Y("primitive");
    }

    @Override // Xf.AbstractC2368e
    public Wf.i r0() {
        Wf.i iVar = this.f21908g;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // Xf.AbstractC2368e
    public void v0(String key, Wf.i element) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f21908g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f21908g = element;
        s0().invoke(element);
    }
}
