package W2;

import P9.AbstractC2011u;
import P9.X;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2011u f20689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20690b;

    private f(int i10, AbstractC2011u abstractC2011u) {
        this.f20690b = i10;
        this.f20689a = abstractC2011u;
    }

    private static a a(int i10, int i11, C6609I c6609i) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, c6609i);
            case 1751742049:
                return c.b(c6609i);
            case 1752331379:
                return d.c(c6609i);
            case 1852994675:
                return h.a(c6609i);
            default:
                return null;
        }
    }

    public static f c(int i10, C6609I c6609i) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        int iJ = c6609i.j();
        int iB = -2;
        while (c6609i.a() > 8) {
            int iZ = c6609i.z();
            int iG = c6609i.g() + c6609i.z();
            c6609i.a0(iG);
            a aVarC = iZ == 1414744396 ? c(c6609i.z(), c6609i) : a(iZ, iB, c6609i);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            c6609i.b0(iG);
            c6609i.a0(iJ);
        }
        return new f(i10, aVar.k());
    }

    public a b(Class cls) {
        X it = this.f20689a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // W2.a
    public int getType() {
        return this.f20690b;
    }
}
