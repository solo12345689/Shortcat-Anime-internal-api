package r3;

import U2.J;
import U2.O;
import android.util.SparseArray;
import r3.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements U2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U2.r f58525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f58526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f58527c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f58528d;

    public s(U2.r rVar, r.a aVar) {
        this.f58525a = rVar;
        this.f58526b = aVar;
    }

    @Override // U2.r
    public O e(int i10, int i11) {
        if (i11 != 3) {
            this.f58528d = true;
            return this.f58525a.e(i10, i11);
        }
        u uVar = (u) this.f58527c.get(i10);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f58525a.e(i10, i11), this.f58526b);
        this.f58527c.put(i10, uVar2);
        return uVar2;
    }

    @Override // U2.r
    public void p() {
        this.f58525a.p();
        if (this.f58528d) {
            for (int i10 = 0; i10 < this.f58527c.size(); i10++) {
                ((u) this.f58527c.valueAt(i10)).k(true);
            }
        }
    }

    @Override // U2.r
    public void t(J j10) {
        this.f58525a.t(j10);
    }
}
