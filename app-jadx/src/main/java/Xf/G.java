package Xf;

import Wf.AbstractC2358b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class G extends AbstractC2366c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Wf.i f21907g;

    public /* synthetic */ G(AbstractC2358b abstractC2358b, Wf.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2358b, iVar, (i10 & 4) != 0 ? null : str);
    }

    @Override // Uf.c
    public int i(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xf.AbstractC2366c
    public Wf.i l0(String tag) {
        AbstractC5504s.h(tag, "tag");
        if (tag == "primitive") {
            return z0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // Xf.AbstractC2366c
    public Wf.i z0() {
        return this.f21907g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AbstractC2358b json, Wf.i value, String str) {
        super(json, value, str, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(value, "value");
        this.f21907g = value;
        c0("primitive");
    }
}
