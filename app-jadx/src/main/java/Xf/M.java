package Xf;

import Wf.AbstractC2358b;
import Wf.C2359c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class M extends AbstractC2366c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2359c f21916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC2358b json, C2359c value) {
        super(json, value, null, 4, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(value, "value");
        this.f21916g = value;
        this.f21917h = z0().size();
        this.f21918i = -1;
    }

    @Override // Xf.AbstractC2366c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C2359c z0() {
        return this.f21916g;
    }

    @Override // Vf.U
    protected String f0(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // Uf.c
    public int i(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        int i10 = this.f21918i;
        if (i10 >= this.f21917h - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f21918i = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xf.AbstractC2366c
    public Wf.i l0(String tag) {
        AbstractC5504s.h(tag, "tag");
        return z0().get(Integer.parseInt(tag));
    }
}
