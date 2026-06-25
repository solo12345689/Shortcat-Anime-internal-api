package Xf;

import Ud.AbstractC2279u;
import Wf.AbstractC2358b;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class O extends K {

    /* JADX INFO: renamed from: k */
    private final Wf.C f21920k;

    /* JADX INFO: renamed from: l */
    private final List f21921l;

    /* JADX INFO: renamed from: m */
    private final int f21922m;

    /* JADX INFO: renamed from: n */
    private int f21923n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AbstractC2358b json, Wf.C value) {
        super(json, value, null, null, 12, null);
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(value, "value");
        this.f21920k = value;
        List listB1 = AbstractC2279u.b1(z0().keySet());
        this.f21921l = listB1;
        this.f21922m = listB1.size() * 2;
        this.f21923n = -1;
    }

    @Override // Xf.K, Xf.AbstractC2366c
    /* JADX INFO: renamed from: E0 */
    public Wf.C z0() {
        return this.f21920k;
    }

    @Override // Xf.K, Xf.AbstractC2366c, Uf.c
    public void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
    }

    @Override // Xf.K, Vf.U
    protected String f0(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return (String) this.f21921l.get(i10 / 2);
    }

    @Override // Xf.K, Uf.c
    public int i(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        int i10 = this.f21923n;
        if (i10 >= this.f21922m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f21923n = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xf.K, Xf.AbstractC2366c
    public Wf.i l0(String tag) {
        AbstractC5504s.h(tag, "tag");
        return this.f21923n % 2 == 0 ? Wf.j.c(tag) : (Wf.i) Ud.S.j(z0(), tag);
    }
}
