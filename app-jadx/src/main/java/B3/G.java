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
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U2.O[] f1092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6729k f1093d = new C6729k(new C6729k.b() { // from class: B3.F
        @Override // u2.C6729k.b
        public final void a(long j10, C6609I c6609i) {
            AbstractC2245f.a(j10, c6609i, this.f1089a.f1092c);
        }
    });

    public G(List list, String str) {
        this.f1090a = list;
        this.f1091b = str;
        this.f1092c = new U2.O[list.size()];
    }

    public void b() {
        this.f1093d.d();
    }

    public void c(long j10, C6609I c6609i) {
        this.f1093d.a(j10, c6609i);
    }

    public void d(U2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f1092c.length; i10++) {
            dVar.a();
            U2.O oE = rVar.e(dVar.c(), 3);
            C6109x c6109x = (C6109x) this.f1090a.get(i10);
            String str = c6109x.f57022o;
            AbstractC6614a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = c6109x.f57008a;
            if (strB == null) {
                strB = dVar.b();
            }
            oE.c(new C6109x.b().j0(strB).W(this.f1091b).y0(str).A0(c6109x.f57012e).n0(c6109x.f57011d).Q(c6109x.f57002L).k0(c6109x.f57025r).P());
            this.f1092c[i10] = oE;
        }
    }

    public void e() {
        this.f1093d.d();
    }

    public void f(int i10) {
        this.f1093d.g(i10);
    }
}
