package Y;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E1 f22088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f22089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f22091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f22093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2414i0 f22098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22102o;

    public D1(E1 e12) {
        this.f22088a = e12;
        this.f22089b = e12.t();
        int iU = e12.u();
        this.f22090c = iU;
        this.f22091d = e12.v();
        this.f22092e = e12.w();
        this.f22096i = iU;
        this.f22097j = -1;
        this.f22098k = new C2414i0();
    }

    private final Object N(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return (iArr[i11 + 1] & 1073741824) != 0 ? this.f22091d[iArr[i11 + 4]] : InterfaceC2425m.f22370a.a();
    }

    private final Object P(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.f22091d[G1.r(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.f22091d[G1.m(iArr, i10)] : InterfaceC2425m.f22370a.a();
    }

    public final Object A(int i10) {
        return b(this.f22089b, i10);
    }

    public final Object B(int i10) {
        return C(this.f22095h, i10);
    }

    public final Object C(int i10, int i11) {
        int iT = G1.t(this.f22089b, i10);
        int i12 = i10 + 1;
        int i13 = iT + i11;
        return i13 < (i12 < this.f22090c ? this.f22089b[(i12 * 5) + 4] : this.f22092e) ? this.f22091d[i13] : InterfaceC2425m.f22370a.a();
    }

    public final int D(int i10) {
        return this.f22089b[i10 * 5];
    }

    public final Object E(int i10) {
        return P(this.f22089b, i10);
    }

    public final int F(int i10) {
        return G1.o(this.f22089b, i10);
    }

    public final boolean G(int i10) {
        return (this.f22089b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean H(int i10) {
        return (this.f22089b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean I() {
        return t() || this.f22095h == this.f22096i;
    }

    public final boolean J() {
        return (this.f22089b[(this.f22095h * 5) + 1] & 1073741824) != 0;
    }

    public final boolean K(int i10) {
        return (this.f22089b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object L() {
        int i10;
        if (this.f22099l > 0 || (i10 = this.f22100m) >= this.f22101n) {
            this.f22102o = false;
            return InterfaceC2425m.f22370a.a();
        }
        this.f22102o = true;
        Object[] objArr = this.f22091d;
        this.f22100m = i10 + 1;
        return objArr[i10];
    }

    public final Object M(int i10) {
        int[] iArr = this.f22089b;
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return N(iArr, i10);
        }
        return null;
    }

    public final int O(int i10) {
        return this.f22089b[(i10 * 5) + 1] & 67108863;
    }

    public final int Q(int i10) {
        return this.f22089b[(i10 * 5) + 2];
    }

    public final void R(int i10) {
        if (!(this.f22099l == 0)) {
            AbstractC2454w.t("Cannot reposition while in an empty region");
        }
        this.f22095h = i10;
        int i11 = this.f22090c;
        int i12 = i10 < i11 ? this.f22089b[(i10 * 5) + 2] : -1;
        if (i12 != this.f22097j) {
            this.f22097j = i12;
            if (i12 < 0) {
                this.f22096i = i11;
            } else {
                this.f22096i = i12 + G1.o(this.f22089b, i12);
            }
            this.f22100m = 0;
            this.f22101n = 0;
        }
    }

    public final void S(int i10) {
        int iO = G1.o(this.f22089b, i10) + i10;
        int i11 = this.f22095h;
        if (!(i11 >= i10 && i11 <= iO)) {
            AbstractC2454w.t("Index " + i10 + " is not a parent of " + i11);
        }
        this.f22097j = i10;
        this.f22096i = iO;
        this.f22100m = 0;
        this.f22101n = 0;
    }

    public final int T() {
        if (!(this.f22099l == 0)) {
            AbstractC2454w.t("Cannot skip while in an empty region");
        }
        int[] iArr = this.f22089b;
        int i10 = this.f22095h;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f22095h = i10 + G1.o(iArr, i10);
        return i11;
    }

    public final void U() {
        if (!(this.f22099l == 0)) {
            AbstractC2454w.t("Cannot skip the enclosing group while in an empty region");
        }
        this.f22095h = this.f22096i;
        this.f22100m = 0;
        this.f22101n = 0;
    }

    public final int V(int i10) {
        int iT = G1.t(this.f22089b, i10);
        int i11 = i10 + 1;
        return (i11 < this.f22090c ? this.f22089b[(i11 * 5) + 4] : this.f22092e) - iT;
    }

    public final void W() {
        if (this.f22099l <= 0) {
            int i10 = this.f22097j;
            int i11 = this.f22095h;
            if (!(this.f22089b[(i11 * 5) + 2] == i10)) {
                V0.a("Invalid slot table detected");
            }
            HashMap map = this.f22093f;
            if (map != null) {
            }
            C2414i0 c2414i0 = this.f22098k;
            int i12 = this.f22100m;
            int i13 = this.f22101n;
            if (i12 == 0 && i13 == 0) {
                c2414i0.h(-1);
            } else {
                c2414i0.h(i12);
            }
            this.f22097j = i11;
            this.f22096i = G1.o(this.f22089b, i11) + i11;
            int i14 = i11 + 1;
            this.f22095h = i14;
            this.f22100m = G1.t(this.f22089b, i11);
            this.f22101n = i11 >= this.f22090c - 1 ? this.f22092e : this.f22089b[(i14 * 5) + 4];
        }
    }

    public final void X() {
        if (this.f22099l <= 0) {
            if (!((this.f22089b[(this.f22095h * 5) + 1] & 1073741824) != 0)) {
                V0.a("Expected a node group");
            }
            W();
        }
    }

    public final C2392b a(int i10) {
        ArrayList arrayListP = this.f22088a.p();
        int iS = G1.s(arrayListP, i10, this.f22090c);
        if (iS >= 0) {
            return (C2392b) arrayListP.get(iS);
        }
        C2392b c2392b = new C2392b(i10);
        arrayListP.add(-(iS + 1), c2392b);
        return c2392b;
    }

    public final void c() {
        this.f22099l++;
    }

    public final void d() {
        this.f22094g = true;
        this.f22088a.e(this, this.f22093f);
        this.f22091d = new Object[0];
    }

    public final boolean e(int i10) {
        return (this.f22089b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void f() {
        if (!(this.f22099l > 0)) {
            V0.a("Unbalanced begin/end empty");
        }
        this.f22099l--;
    }

    public final void g() {
        if (this.f22099l == 0) {
            if (!(this.f22095h == this.f22096i)) {
                AbstractC2454w.t("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f22089b;
            int i10 = iArr[(this.f22097j * 5) + 2];
            this.f22097j = i10;
            this.f22096i = i10 < 0 ? this.f22090c : G1.o(iArr, i10) + i10;
            int iG = this.f22098k.g();
            if (iG < 0) {
                this.f22100m = 0;
                this.f22101n = 0;
            } else {
                this.f22100m = iG;
                this.f22101n = i10 >= this.f22090c - 1 ? this.f22092e : this.f22089b[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.f22099l <= 0) {
            int i10 = 0;
            int iO = this.f22095h;
            while (true) {
                int i11 = i10;
                if (iO >= this.f22096i) {
                    break;
                }
                int[] iArr = this.f22089b;
                int i12 = iO * 5;
                int i13 = iArr[i12];
                Object objP = P(iArr, iO);
                int i14 = 1;
                int i15 = this.f22089b[i12 + 1];
                if ((1073741824 & i15) == 0) {
                    i14 = i15 & 67108863;
                }
                i10 = i11 + 1;
                arrayList.add(new C2429n0(i13, objP, iO, i14, i11));
                iO += G1.o(this.f22089b, iO);
            }
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f22094g;
    }

    public final int j() {
        return this.f22096i;
    }

    public final int k() {
        return this.f22095h;
    }

    public final Object l() {
        int i10 = this.f22095h;
        if (i10 < this.f22096i) {
            return b(this.f22089b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f22096i;
    }

    public final int n() {
        int i10 = this.f22095h;
        if (i10 < this.f22096i) {
            return this.f22089b[i10 * 5];
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f22095h;
        if (i10 < this.f22096i) {
            return P(this.f22089b, i10);
        }
        return null;
    }

    public final int p() {
        return G1.o(this.f22089b, this.f22095h);
    }

    public final int q() {
        return this.f22100m - G1.t(this.f22089b, this.f22097j);
    }

    public final boolean r() {
        return this.f22102o;
    }

    public final boolean s() {
        int i10 = this.f22095h;
        return i10 < this.f22096i && (this.f22089b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean t() {
        return this.f22099l > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f22095h + ", key=" + n() + ", parent=" + this.f22097j + ", end=" + this.f22096i + ')';
    }

    public final int u() {
        return this.f22097j;
    }

    public final int v() {
        int i10 = this.f22097j;
        if (i10 >= 0) {
            return this.f22089b[(i10 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int w() {
        return this.f22101n - this.f22100m;
    }

    public final int x() {
        return this.f22090c;
    }

    public final int y() {
        return this.f22100m - G1.t(this.f22089b, this.f22097j);
    }

    public final E1 z() {
        return this.f22088a;
    }
}
