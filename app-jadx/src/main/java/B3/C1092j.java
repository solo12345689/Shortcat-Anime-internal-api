package B3;

import B3.L;
import P9.AbstractC2011u;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import q2.C6109x;
import t2.AbstractC6624k;
import t2.C6609I;

/* JADX INFO: renamed from: B3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1092j implements L.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1229b;

    public C1092j(int i10) {
        this(i10, AbstractC2011u.A());
    }

    private G c(L.b bVar) {
        return new G(e(bVar), "video/mp2t");
    }

    private O d(L.b bVar) {
        return new O(e(bVar), "video/mp2t");
    }

    private List e(L.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f1229b;
        }
        C6609I c6609i = new C6609I(bVar.f1143e);
        List arrayList = this.f1229b;
        while (c6609i.a() > 0) {
            int iM = c6609i.M();
            int iG = c6609i.g() + c6609i.M();
            if (iM == 134) {
                arrayList = new ArrayList();
                int iM2 = c6609i.M() & 31;
                for (int i11 = 0; i11 < iM2; i11++) {
                    String strJ = c6609i.J(3);
                    int iM3 = c6609i.M();
                    boolean z10 = (iM3 & 128) != 0;
                    if (z10) {
                        i10 = iM3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bM = (byte) c6609i.M();
                    c6609i.c0(1);
                    arrayList.add(new C6109x.b().y0(str).n0(strJ).Q(i10).k0(z10 ? AbstractC6624k.g((bM & 64) != 0) : null).P());
                }
            }
            c6609i.b0(iG);
        }
        return arrayList;
    }

    private boolean f(int i10) {
        return (i10 & this.f1228a) != 0;
    }

    @Override // B3.L.c
    public SparseArray a() {
        return new SparseArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // B3.L.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B3.L b(int r6, B3.L.b r7) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C1092j.b(int, B3.L$b):B3.L");
    }

    public C1092j(int i10, List list) {
        this.f1228a = i10;
        this.f1229b = list;
    }
}
