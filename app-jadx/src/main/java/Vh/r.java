package Vh;

import Yh.AbstractC2491a;
import Yh.v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class r extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yh.r f20485a = new Yh.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20487c;

    public r(int i10) {
        this.f20486b = i10;
    }

    @Override // ai.a, ai.d
    public boolean a() {
        return true;
    }

    @Override // ai.a, ai.d
    public boolean c(AbstractC2491a abstractC2491a) {
        if (!this.f20487c) {
            return true;
        }
        AbstractC2491a abstractC2491aN = this.f20485a.n();
        if (!(abstractC2491aN instanceof Yh.q)) {
            return true;
        }
        ((Yh.q) abstractC2491aN).o(false);
        return true;
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20485a;
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        if (!hVar.c()) {
            return hVar.b() >= this.f20486b ? ai.c.a(hVar.getColumn() + this.f20486b) : ai.c.d();
        }
        if (this.f20485a.c() == null) {
            return ai.c.d();
        }
        AbstractC2491a abstractC2491aF = hVar.e().f();
        this.f20487c = (abstractC2491aF instanceof v) || (abstractC2491aF instanceof Yh.r);
        return ai.c.b(hVar.d());
    }
}
