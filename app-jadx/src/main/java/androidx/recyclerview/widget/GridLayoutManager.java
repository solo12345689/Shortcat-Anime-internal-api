package androidx.recyclerview.widget;

import L1.B;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f31672I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f31673J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int[] f31674K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    View[] f31675L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final SparseIntArray f31676M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final SparseIntArray f31677N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    c f31678O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final Rect f31679P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f31680Q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f31683a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f31684b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31685c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f31686d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f31686d) {
                return d(i10, i11);
            }
            int i12 = this.f31684b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f31684b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f31685c) {
                return e(i10, i11);
            }
            int i12 = this.f31683a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f31683a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f31686d || (iA = a(this.f31684b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f31684b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f31684b.clear();
        }

        public void h() {
            this.f31683a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f31672I = false;
        this.f31673J = -1;
        this.f31676M = new SparseIntArray();
        this.f31677N = new SparseIntArray();
        this.f31678O = new a();
        this.f31679P = new Rect();
        d3(RecyclerView.p.m0(context, attributeSet, i10, i11).f31904b);
    }

    private void N2(RecyclerView.v vVar, RecyclerView.A a10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f31675L[i11];
            b bVar = (b) view.getLayoutParams();
            int iZ2 = Z2(vVar, a10, l0(view));
            bVar.f31682f = iZ2;
            bVar.f31681e = i14;
            i14 += iZ2;
            i11 += i13;
        }
    }

    private void O2() {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            b bVar = (b) N(i10).getLayoutParams();
            int iA = bVar.a();
            this.f31676M.put(iA, bVar.f());
            this.f31677N.put(iA, bVar.e());
        }
    }

    private void P2(int i10) {
        this.f31674K = Q2(this.f31674K, this.f31673J, i10);
    }

    static int[] Q2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void R2() {
        this.f31676M.clear();
        this.f31677N.clear();
    }

    private int S2(RecyclerView.A a10) {
        if (O() != 0 && a10.b() != 0) {
            X1();
            boolean zR2 = r2();
            View viewB2 = b2(!zR2, true);
            View viewA2 = a2(!zR2, true);
            if (viewB2 != null && viewA2 != null) {
                int iB = this.f31678O.b(l0(viewB2), this.f31673J);
                int iB2 = this.f31678O.b(l0(viewA2), this.f31673J);
                int iMax = this.f31700x ? Math.max(0, ((this.f31678O.b(a10.b() - 1, this.f31673J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.f31697u.d(viewA2) - this.f31697u.g(viewB2)) / ((this.f31678O.b(l0(viewA2), this.f31673J) - this.f31678O.b(l0(viewB2), this.f31673J)) + 1))) + (this.f31697u.m() - this.f31697u.g(viewB2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.A a10) {
        if (O() != 0 && a10.b() != 0) {
            X1();
            View viewB2 = b2(!r2(), true);
            View viewA2 = a2(!r2(), true);
            if (viewB2 != null && viewA2 != null) {
                if (!r2()) {
                    return this.f31678O.b(a10.b() - 1, this.f31673J) + 1;
                }
                int iD = this.f31697u.d(viewA2) - this.f31697u.g(viewB2);
                int iB = this.f31678O.b(l0(viewB2), this.f31673J);
                return (int) ((iD / ((this.f31678O.b(l0(viewA2), this.f31673J) - iB) + 1)) * (this.f31678O.b(a10.b() - 1, this.f31673J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.v vVar, RecyclerView.A a10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iY2 = Y2(vVar, a10, aVar.f31704b);
        if (z10) {
            while (iY2 > 0) {
                int i11 = aVar.f31704b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f31704b = i12;
                iY2 = Y2(vVar, a10, i12);
            }
            return;
        }
        int iB = a10.b() - 1;
        int i13 = aVar.f31704b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iY22 = Y2(vVar, a10, i14);
            if (iY22 <= iY2) {
                break;
            }
            i13 = i14;
            iY2 = iY22;
        }
        aVar.f31704b = i13;
    }

    private void V2() {
        View[] viewArr = this.f31675L;
        if (viewArr == null || viewArr.length != this.f31673J) {
            this.f31675L = new View[this.f31673J];
        }
    }

    private int X2(RecyclerView.v vVar, RecyclerView.A a10, int i10) {
        if (!a10.e()) {
            return this.f31678O.b(i10, this.f31673J);
        }
        int iF = vVar.f(i10);
        if (iF != -1) {
            return this.f31678O.b(iF, this.f31673J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int Y2(RecyclerView.v vVar, RecyclerView.A a10, int i10) {
        if (!a10.e()) {
            return this.f31678O.c(i10, this.f31673J);
        }
        int i11 = this.f31677N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = vVar.f(i10);
        if (iF != -1) {
            return this.f31678O.c(iF, this.f31673J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int Z2(RecyclerView.v vVar, RecyclerView.A a10, int i10) {
        if (!a10.e()) {
            return this.f31678O.f(i10);
        }
        int i11 = this.f31676M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = vVar.f(i10);
        if (iF != -1) {
            return this.f31678O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void a3(float f10, int i10) {
        P2(Math.max(Math.round(f10 * this.f31673J), i10));
    }

    private void b3(View view, int i10, boolean z10) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f31908b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f31681e, bVar.f31682f);
        if (this.f31695s == 1) {
            iP2 = RecyclerView.p.P(iW2, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = RecyclerView.p.P(this.f31697u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = RecyclerView.p.P(iW2, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = RecyclerView.p.P(this.f31697u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        c3(view, iP2, iP, z10);
    }

    private void c3(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? L1(view, i10, i11, qVar) : J1(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    private void e3() {
        int iB0;
        int iK0;
        if (p2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        P2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.A a10) {
        return this.f31680Q ? T2(a10) : super.A(a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        e3();
        V2();
        return super.A1(i10, vVar, a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        e3();
        V2();
        return super.C1(i10, vVar, a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        if (this.f31674K == null) {
            super.G1(rect, i10, i11);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f31695s == 1) {
            iS2 = RecyclerView.p.s(i11, rect.height() + iK0, f0());
            int[] iArr = this.f31674K;
            iS = RecyclerView.p.s(i10, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i10, rect.width() + iI0, g0());
            int[] iArr2 = this.f31674K;
            iS2 = RecyclerView.p.s(i11, iArr2[iArr2.length - 1] + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f31695s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.A r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f31690D == null && !this.f31672I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView.v vVar, RecyclerView.A a10, B b10) {
        super.R0(vVar, a10, b10);
        b10.z0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void R1(RecyclerView.A a10, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.f31673J;
        for (int i10 = 0; i10 < this.f31673J && cVar.c(a10) && iF > 0; i10++) {
            int i11 = cVar.f31715d;
            cVar2.a(i11, Math.max(0, cVar.f31718g));
            iF -= this.f31678O.f(i11);
            cVar.f31715d += cVar.f31716e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(RecyclerView.v vVar, RecyclerView.A a10) {
        if (this.f31695s == 1) {
            return this.f31673J;
        }
        if (a10.b() < 1) {
            return 0;
        }
        return X2(vVar, a10, a10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView.v vVar, RecyclerView.A a10, View view, B b10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, b10);
            return;
        }
        b bVar = (b) layoutParams;
        int iX2 = X2(vVar, a10, bVar.a());
        if (this.f31695s == 0) {
            b10.C0(B.g.b(bVar.e(), bVar.f(), iX2, 1, false, false));
        } else {
            b10.C0(B.g.b(iX2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        this.f31678O.h();
        this.f31678O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.f31678O.h();
        this.f31678O.g();
    }

    int W2(int i10, int i11) {
        if (this.f31695s != 1 || !q2()) {
            int[] iArr = this.f31674K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f31674K;
        int i12 = this.f31673J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f31678O.h();
        this.f31678O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        this.f31678O.h();
        this.f31678O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f31678O.h();
        this.f31678O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.v vVar, RecyclerView.A a10) {
        if (a10.e()) {
            O2();
        }
        super.b1(vVar, a10);
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.A a10) {
        super.c1(a10);
        this.f31672I = false;
    }

    public void d3(int i10) {
        if (i10 == this.f31673J) {
            return;
        }
        this.f31672I = true;
        if (i10 >= 1) {
            this.f31673J = i10;
            this.f31678O.h();
            x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View j2(RecyclerView.v vVar, RecyclerView.A a10, boolean z10, boolean z11) {
        int i10;
        int iO;
        int iO2 = O();
        int i11 = 1;
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
        }
        int iB = a10.b();
        X1();
        int iM = this.f31697u.m();
        int i12 = this.f31697u.i();
        View view = null;
        View view2 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && Y2(vVar, a10, iL0) == 0) {
                if (((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f31697u.g(viewN) < i12 && this.f31697u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int o0(RecyclerView.v vVar, RecyclerView.A a10) {
        if (this.f31695s == 0) {
            return this.f31673J;
        }
        if (a10.b() < 1) {
            return 0;
        }
        return X2(vVar, a10, a10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void s2(RecyclerView.v vVar, RecyclerView.A a10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int iI0;
        int iK0;
        int iF;
        int iF2;
        int i12;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f31697u.l();
        boolean z10 = iL != 1073741824;
        int i13 = O() > 0 ? this.f31674K[this.f31673J] : 0;
        if (z10) {
            e3();
        }
        boolean z11 = cVar.f31716e == 1;
        int iY2 = this.f31673J;
        if (!z11) {
            iY2 = Y2(vVar, a10, cVar.f31715d) + Z2(vVar, a10, cVar.f31715d);
        }
        int i14 = 0;
        while (i14 < this.f31673J && cVar.c(a10) && iY2 > 0) {
            int i15 = cVar.f31715d;
            int iZ2 = Z2(vVar, a10, i15);
            if (iZ2 > this.f31673J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iZ2 + " spans but GridLayoutManager has only " + this.f31673J + " spans.");
            }
            iY2 -= iZ2;
            if (iY2 < 0 || (viewD = cVar.d(vVar)) == null) {
                break;
            }
            this.f31675L[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f31709b = true;
            return;
        }
        N2(vVar, a10, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f31675L[i17];
            if (cVar.f31723l == null) {
                if (z11) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z11) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.f31679P);
            b3(view, iL, false);
            int iE = this.f31697u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f31697u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f31682f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            a3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f31675L[i18];
                b3(view2, 1073741824, true);
                int iE2 = this.f31697u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f31675L[i19];
            if (this.f31697u.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f31908b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f31681e, bVar2.f31682f);
                if (this.f31695s == 1) {
                    iP2 = RecyclerView.p.P(iW2, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iP = RecyclerView.p.P(iW2, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                c3(view3, iP2, iP, true);
            }
        }
        bVar.f31708a = i16;
        if (this.f31695s == 1) {
            if (cVar.f31717f == -1) {
                iF2 = cVar.f31713b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f31713b;
                iF2 = i12 + i16;
            }
            iK0 = i12;
            iF = 0;
            iI0 = 0;
        } else {
            if (cVar.f31717f == -1) {
                i11 = cVar.f31713b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f31713b;
                i11 = i10 + i16;
            }
            iI0 = i10;
            iK0 = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f31675L[i22];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f31695s != 1) {
                iK0 = this.f31674K[bVar3.f31681e] + k0();
                iF2 = this.f31697u.f(view4) + iK0;
            } else if (q2()) {
                iF = i0() + this.f31674K[this.f31673J - bVar3.f31681e];
                iI0 = iF - this.f31697u.f(view4);
            } else {
                iI0 = this.f31674K[bVar3.f31681e] + i0();
                iF = this.f31697u.f(view4) + iI0;
            }
            int i23 = iF2;
            int i24 = iK0;
            int i25 = iF;
            int i26 = iI0;
            D0(view4, i26, i24, i25, i23);
            iF2 = i23;
            iI0 = i26;
            iF = i25;
            iK0 = i24;
            if (bVar3.c() || bVar3.b()) {
                bVar.f31710c = true;
            }
            bVar.f31711d = view4.hasFocusable() | bVar.f31711d;
        }
        Arrays.fill(this.f31675L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.v vVar, RecyclerView.A a10, LinearLayoutManager.a aVar, int i10) {
        super.u2(vVar, a10, aVar, i10);
        e3();
        if (a10.b() > 0 && !a10.e()) {
            U2(vVar, a10, aVar, i10);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.A a10) {
        return this.f31680Q ? S2(a10) : super.w(a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.A a10) {
        return this.f31680Q ? T2(a10) : super.x(a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.A a10) {
        return this.f31680Q ? S2(a10) : super.z(a10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f31681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f31682f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31681e = -1;
            this.f31682f = 0;
        }

        public int e() {
            return this.f31681e;
        }

        public int f() {
            return this.f31682f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f31681e = -1;
            this.f31682f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31681e = -1;
            this.f31682f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31681e = -1;
            this.f31682f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f31672I = false;
        this.f31673J = -1;
        this.f31676M = new SparseIntArray();
        this.f31677N = new SparseIntArray();
        this.f31678O = new a();
        this.f31679P = new Rect();
        d3(i10);
    }
}
