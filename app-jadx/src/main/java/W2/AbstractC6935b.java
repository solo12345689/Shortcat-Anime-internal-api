package w2;

import java.util.ArrayList;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: w2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6935b implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f62795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f62796b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f62798d;

    protected AbstractC6935b(boolean z10) {
        this.f62795a = z10;
    }

    @Override // w2.InterfaceC6940g
    public final void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        if (this.f62796b.contains(interfaceC6932F)) {
            return;
        }
        this.f62796b.add(interfaceC6932F);
        this.f62797c++;
    }

    protected final void p(int i10) {
        o oVar = (o) a0.l(this.f62798d);
        for (int i11 = 0; i11 < this.f62797c; i11++) {
            ((InterfaceC6932F) this.f62796b.get(i11)).b(this, oVar, this.f62795a, i10);
        }
    }

    protected final void q() {
        o oVar = (o) a0.l(this.f62798d);
        for (int i10 = 0; i10 < this.f62797c; i10++) {
            ((InterfaceC6932F) this.f62796b.get(i10)).e(this, oVar, this.f62795a);
        }
        this.f62798d = null;
    }

    protected final void r(o oVar) {
        for (int i10 = 0; i10 < this.f62797c; i10++) {
            ((InterfaceC6932F) this.f62796b.get(i10)).g(this, oVar, this.f62795a);
        }
    }

    protected final void s(o oVar) {
        this.f62798d = oVar;
        for (int i10 = 0; i10 < this.f62797c; i10++) {
            ((InterfaceC6932F) this.f62796b.get(i10)).h(this, oVar, this.f62795a);
        }
    }
}
