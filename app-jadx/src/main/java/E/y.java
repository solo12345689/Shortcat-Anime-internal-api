package E;

import E.H;
import Td.L;
import i1.C5009b;
import java.util.List;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f4019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f4022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H f4023f;

    public y(boolean z10, E e10, int i10, int i11, w wVar, H h10) {
        this.f4018a = z10;
        this.f4019b = e10;
        this.f4020c = i10;
        this.f4021d = i11;
        this.f4022e = wVar;
        this.f4023f = h10;
    }

    public final long a(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.f4019b.b()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (this.f4019b.a()[i13] + this.f4019b.b()[i13]) - this.f4019b.a()[i10];
        }
        int iE = AbstractC5874j.e(i12, 0);
        return this.f4018a ? C5009b.f48540b.e(iE) : C5009b.f48540b.d(iE);
    }

    public abstract x b(int i10, v[] vVarArr, List list, int i11);

    public final x c(int i10) {
        H.c cVarC = this.f4023f.c(i10);
        int size = cVarC.b().size();
        int i11 = (size == 0 || cVarC.a() + size == this.f4020c) ? 0 : this.f4021d;
        v[] vVarArr = new v[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iD = C1282c.d(((C1282c) cVarC.b().get(i13)).g());
            v vVarD = this.f4022e.d(cVarC.a() + i13, a(i12, iD), i12, iD, i11);
            i12 += iD;
            L l10 = L.f17438a;
            vVarArr[i13] = vVarD;
        }
        return b(i10, vVarArr, cVarC.b(), i11);
    }

    public final int d(int i10) {
        H h10 = this.f4023f;
        return h10.i(i10, h10.e());
    }
}
