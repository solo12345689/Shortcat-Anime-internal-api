package androidx.media3.exoplayer;

import A2.AbstractC1003a;
import M2.AbstractC1932w;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q2.C6087b;
import q2.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class M0 extends AbstractC1003a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f30450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f30451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f30452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q2.Y[] f30453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f30454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f30455n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC1932w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Y.d f30456f;

        a(q2.Y y10) {
            super(y10);
            this.f30456f = new Y.d();
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            Y.b bVarK = super.k(i10, bVar, z10);
            if (super.r(bVarK.f56653c, this.f30456f).g()) {
                bVarK.u(bVar.f56651a, bVar.f56652b, bVar.f56653c, bVar.f56654d, bVar.f56655e, C6087b.f56707g, true);
                return bVarK;
            }
            bVarK.f56656f = true;
            return bVarK;
        }
    }

    public M0(Collection collection, M2.e0 e0Var) {
        this(L(collection), M(collection), e0Var);
    }

    private static q2.Y[] L(Collection collection) {
        q2.Y[] yArr = new q2.Y[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            yArr[i10] = ((InterfaceC2914v0) it.next()).a();
            i10++;
        }
        return yArr;
    }

    private static Object[] M(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((InterfaceC2914v0) it.next()).s();
            i10++;
        }
        return objArr;
    }

    @Override // A2.AbstractC1003a
    protected Object C(int i10) {
        return this.f30454m[i10];
    }

    @Override // A2.AbstractC1003a
    protected int E(int i10) {
        return this.f30451j[i10];
    }

    @Override // A2.AbstractC1003a
    protected int F(int i10) {
        return this.f30452k[i10];
    }

    @Override // A2.AbstractC1003a
    protected q2.Y I(int i10) {
        return this.f30453l[i10];
    }

    public M0 J(M2.e0 e0Var) {
        q2.Y[] yArr = new q2.Y[this.f30453l.length];
        int i10 = 0;
        while (true) {
            q2.Y[] yArr2 = this.f30453l;
            if (i10 >= yArr2.length) {
                return new M0(yArr, this.f30454m, e0Var);
            }
            yArr[i10] = new a(yArr2[i10]);
            i10++;
        }
    }

    List K() {
        return Arrays.asList(this.f30453l);
    }

    @Override // q2.Y
    public int m() {
        return this.f30450i;
    }

    @Override // q2.Y
    public int t() {
        return this.f30449h;
    }

    @Override // A2.AbstractC1003a
    protected int x(Object obj) {
        Integer num = (Integer) this.f30455n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // A2.AbstractC1003a
    protected int y(int i10) {
        return t2.a0.j(this.f30451j, i10 + 1, false, false);
    }

    @Override // A2.AbstractC1003a
    protected int z(int i10) {
        return t2.a0.j(this.f30452k, i10 + 1, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private M0(q2.Y[] yArr, Object[] objArr, M2.e0 e0Var) {
        super(false, e0Var);
        int i10 = 0;
        int length = yArr.length;
        this.f30453l = yArr;
        this.f30451j = new int[length];
        this.f30452k = new int[length];
        this.f30454m = objArr;
        this.f30455n = new HashMap();
        int length2 = yArr.length;
        int iT = 0;
        int iM = 0;
        int i11 = 0;
        while (i10 < length2) {
            q2.Y y10 = yArr[i10];
            this.f30453l[i11] = y10;
            this.f30452k[i11] = iT;
            this.f30451j[i11] = iM;
            iT += y10.t();
            iM += this.f30453l[i11].m();
            this.f30455n.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f30449h = iT;
        this.f30450i = iM;
    }
}
