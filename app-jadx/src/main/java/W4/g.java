package W4;

import U4.v;
import W4.h;
import o5.C5831h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends C5831h implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f20714e;

    public g(long j10) {
        super(j10);
    }

    @Override // W4.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // W4.h
    public /* bridge */ /* synthetic */ v c(S4.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // W4.h
    public /* bridge */ /* synthetic */ v d(S4.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // W4.h
    public void e(h.a aVar) {
        this.f20714e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o5.C5831h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o5.C5831h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(S4.f fVar, v vVar) {
        h.a aVar = this.f20714e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.b(vVar);
    }
}
