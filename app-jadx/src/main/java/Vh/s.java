package Vh;

import Yh.AbstractC2491a;
import Yh.v;
import Yh.x;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class s extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f20488a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f20489b = new o();

    @Override // ai.a, ai.d
    public void b(Zh.b bVar) {
        Zh.g gVarE = this.f20489b.e();
        if (gVarE.f()) {
            return;
        }
        bVar.b(gVarE, this.f20488a);
    }

    @Override // ai.a, ai.d
    public boolean d() {
        return true;
    }

    @Override // ai.a, ai.d
    public void e(Zh.f fVar) {
        this.f20489b.h(fVar);
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20488a;
    }

    @Override // ai.a, ai.d
    public void g(x xVar) {
        this.f20489b.a(xVar);
    }

    @Override // ai.a, ai.d
    public void h() {
        if (this.f20489b.e().f()) {
            this.f20488a.m();
        } else {
            this.f20488a.k(this.f20489b.f());
        }
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        return !hVar.c() ? ai.c.b(hVar.getIndex()) : ai.c.d();
    }

    public List j() {
        return this.f20489b.d();
    }

    public Zh.g k() {
        return this.f20489b.e();
    }
}
