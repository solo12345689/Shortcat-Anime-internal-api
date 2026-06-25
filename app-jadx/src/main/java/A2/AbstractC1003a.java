package A2;

import M2.e0;
import android.util.Pair;
import q2.Y;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: A2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1003a extends Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f180g;

    public AbstractC1003a(boolean z10, e0 e0Var) {
        this.f180g = z10;
        this.f179f = e0Var;
        this.f178e = e0Var.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f179f.c(i10);
        }
        if (i10 < this.f178e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int H(int i10, boolean z10) {
        if (z10) {
            return this.f179f.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    protected abstract Object C(int i10);

    protected abstract int E(int i10);

    protected abstract int F(int i10);

    protected abstract Y I(int i10);

    @Override // q2.Y
    public int e(boolean z10) {
        if (this.f178e == 0) {
            return -1;
        }
        if (this.f180g) {
            z10 = false;
        }
        int iF = z10 ? this.f179f.f() : 0;
        while (I(iF).u()) {
            iF = G(iF, z10);
            if (iF == -1) {
                return -1;
            }
        }
        return F(iF) + I(iF).e(z10);
    }

    @Override // q2.Y
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objB = B(obj);
        Object objA = A(obj);
        int iX = x(objB);
        if (iX == -1 || (iF = I(iX).f(objA)) == -1) {
            return -1;
        }
        return E(iX) + iF;
    }

    @Override // q2.Y
    public int g(boolean z10) {
        int i10 = this.f178e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f180g) {
            z10 = false;
        }
        int iD = z10 ? this.f179f.d() : i10 - 1;
        while (I(iD).u()) {
            iD = H(iD, z10);
            if (iD == -1) {
                return -1;
            }
        }
        return F(iD) + I(iD).g(z10);
    }

    @Override // q2.Y
    public int i(int i10, int i11, boolean z10) {
        if (this.f180g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iZ = z(i10);
        int iF = F(iZ);
        int i12 = I(iZ).i(i10 - iF, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return iF + i12;
        }
        int iG = G(iZ, z10);
        while (iG != -1 && I(iG).u()) {
            iG = G(iG, z10);
        }
        if (iG != -1) {
            return F(iG) + I(iG).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // q2.Y
    public final Y.b k(int i10, Y.b bVar, boolean z10) {
        int iY = y(i10);
        int iF = F(iY);
        I(iY).k(i10 - E(iY), bVar, z10);
        bVar.f56653c += iF;
        if (z10) {
            bVar.f56652b = D(C(iY), AbstractC6614a.e(bVar.f56652b));
        }
        return bVar;
    }

    @Override // q2.Y
    public final Y.b l(Object obj, Y.b bVar) {
        Object objB = B(obj);
        Object objA = A(obj);
        int iX = x(objB);
        int iF = F(iX);
        I(iX).l(objA, bVar);
        bVar.f56653c += iF;
        bVar.f56652b = obj;
        return bVar;
    }

    @Override // q2.Y
    public int p(int i10, int i11, boolean z10) {
        if (this.f180g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iZ = z(i10);
        int iF = F(iZ);
        int iP = I(iZ).p(i10 - iF, i11 != 2 ? i11 : 0, z10);
        if (iP != -1) {
            return iF + iP;
        }
        int iH = H(iZ, z10);
        while (iH != -1 && I(iH).u()) {
            iH = H(iH, z10);
        }
        if (iH != -1) {
            return F(iH) + I(iH).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // q2.Y
    public final Object q(int i10) {
        int iY = y(i10);
        return D(C(iY), I(iY).q(i10 - E(iY)));
    }

    @Override // q2.Y
    public final Y.d s(int i10, Y.d dVar, long j10) {
        int iZ = z(i10);
        int iF = F(iZ);
        int iE = E(iZ);
        I(iZ).s(i10 - iF, dVar, j10);
        Object objC = C(iZ);
        if (!Y.d.f56668q.equals(dVar.f56678a)) {
            objC = D(objC, dVar.f56678a);
        }
        dVar.f56678a = objC;
        dVar.f56691n += iE;
        dVar.f56692o += iE;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i10);

    protected abstract int z(int i10);
}
