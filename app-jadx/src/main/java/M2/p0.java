package M2;

import M2.D;
import q2.C6071C;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends AbstractC1918h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f12011l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final D f12012k;

    protected p0(D d10) {
        this.f12012k = d10;
    }

    @Override // M2.AbstractC1918h, M2.AbstractC1911a
    protected final void A(InterfaceC6932F interfaceC6932F) {
        super.A(interfaceC6932F);
        S();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M2.AbstractC1918h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final D.b E(Void r12, D.b bVar) {
        return J(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M2.AbstractC1918h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final long F(Void r12, long j10, D.b bVar) {
        return L(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M2.AbstractC1918h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int G(Void r12, int i10) {
        return N(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M2.AbstractC1918h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void H(Void r12, D d10, q2.Y y10) {
        Q(y10);
    }

    protected abstract void Q(q2.Y y10);

    protected final void R() {
        I(f12011l, this.f12012k);
    }

    protected void S() {
        R();
    }

    @Override // M2.D
    public C6071C a() {
        return this.f12012k.a();
    }

    @Override // M2.D
    public void j(C6071C c6071c) {
        this.f12012k.j(c6071c);
    }

    @Override // M2.D
    public boolean n() {
        return this.f12012k.n();
    }

    @Override // M2.D
    public q2.Y o() {
        return this.f12012k.o();
    }

    protected D.b J(D.b bVar) {
        return bVar;
    }

    protected int N(int i10) {
        return i10;
    }

    protected long L(long j10, D.b bVar) {
        return j10;
    }
}
