package B3;

import B3.L;
import U2.AbstractC2245f;
import java.util.List;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;
import u2.C6729k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class O {

    /* JADX INFO: renamed from: a */
    private final List f1150a;

    /* JADX INFO: renamed from: b */
    private final String f1151b;

    /* JADX INFO: renamed from: c */
    private final U2.O[] f1152c;

    /* JADX INFO: renamed from: d */
    private final C6729k f1153d;

    public O(List list, String str) {
        this.f1150a = list;
        this.f1151b = str;
        this.f1152c = new U2.O[list.size()];
        C6729k c6729k = new C6729k(new C6729k.b() { // from class: B3.N
            @Override // u2.C6729k.b
            public final void a(long j10, C6609I c6609i) {
                AbstractC2245f.b(j10, c6609i, this.f1149a.f1152c);
            }
        });
        this.f1153d = c6729k;
        c6729k.g(3);
    }

    public void b(long j10, C6609I c6609i) {
        if (c6609i.a() < 9) {
            return;
        }
        int iV = c6609i.v();
        int iV2 = c6609i.v();
        int iM = c6609i.M();
        if (iV == 434 && iV2 == 1195456820 && iM == 3) {
            this.f1153d.a(j10, c6609i);
        }
    }

    public void c(U2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f1152c.length; i10++) {
            dVar.a();
            U2.O oE = rVar.e(dVar.c(), 3);
            C6109x c6109x = (C6109x) this.f1150a.get(i10);
            String str = c6109x.f57022o;
            AbstractC6614a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            oE.c(new C6109x.b().j0(dVar.b()).W(this.f1151b).y0(str).A0(c6109x.f57012e).n0(c6109x.f57011d).Q(c6109x.f57002L).k0(c6109x.f57025r).P());
            this.f1152c[i10] = oE;
        }
    }
}
