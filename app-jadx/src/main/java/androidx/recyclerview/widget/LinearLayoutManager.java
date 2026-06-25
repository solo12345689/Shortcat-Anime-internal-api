package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f31687A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f31688B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f31689C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    d f31690D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final a f31691E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final b f31692F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f31693G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int[] f31694H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f31695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f31696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f31697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f31698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f31699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f31700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f31701y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f31702z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f31703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f31706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f31707e;

        a() {
            e();
        }

        void a() {
            this.f31705c = this.f31706d ? this.f31703a.i() : this.f31703a.m();
        }

        public void b(View view, int i10) {
            if (this.f31706d) {
                this.f31705c = this.f31703a.d(view) + this.f31703a.o();
            } else {
                this.f31705c = this.f31703a.g(view);
            }
            this.f31704b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f31703a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f31704b = i10;
            if (this.f31706d) {
                int i11 = (this.f31703a.i() - iO) - this.f31703a.d(view);
                this.f31705c = this.f31703a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f31705c - this.f31703a.e(view);
                    int iM = this.f31703a.m();
                    int iMin = iE - (iM + Math.min(this.f31703a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f31705c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f31703a.g(view);
            int iM2 = iG - this.f31703a.m();
            this.f31705c = iG;
            if (iM2 > 0) {
                int i12 = (this.f31703a.i() - Math.min(0, (this.f31703a.i() - iO) - this.f31703a.d(view))) - (iG + this.f31703a.e(view));
                if (i12 < 0) {
                    this.f31705c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.A a10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a10.b();
        }

        void e() {
            this.f31704b = -1;
            this.f31705c = Integer.MIN_VALUE;
            this.f31706d = false;
            this.f31707e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f31704b + ", mCoordinate=" + this.f31705c + ", mLayoutFromEnd=" + this.f31706d + ", mValid=" + this.f31707e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f31710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f31711d;

        protected b() {
        }

        void a() {
            this.f31708a = 0;
            this.f31709b = false;
            this.f31710c = false;
            this.f31711d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f31716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f31717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31718g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f31722k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f31724m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f31712a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f31719h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f31720i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f31721j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f31723l = null;

        c() {
        }

        private View e() {
            int size = this.f31723l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.E) this.f31723l.get(i10)).f31840a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f31715d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f31715d = -1;
            } else {
                this.f31715d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.A a10) {
            int i10 = this.f31715d;
            return i10 >= 0 && i10 < a10.b();
        }

        View d(RecyclerView.v vVar) {
            if (this.f31723l != null) {
                return e();
            }
            View viewO = vVar.o(this.f31715d);
            this.f31715d += this.f31716e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f31723l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.E) this.f31723l.get(i11)).f31840a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f31715d) * this.f31716e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f31727c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f31725a >= 0;
        }

        void b() {
            this.f31725a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f31725a);
            parcel.writeInt(this.f31726b);
            parcel.writeInt(this.f31727c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f31725a = parcel.readInt();
            this.f31726b = parcel.readInt();
            this.f31727c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f31725a = dVar.f31725a;
            this.f31726b = dVar.f31726b;
            this.f31727c = dVar.f31727c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2() {
        if (this.f31695s == 1 || !q2()) {
            this.f31700x = this.f31699w;
        } else {
            this.f31700x = !this.f31699w;
        }
    }

    private boolean F2(RecyclerView.v vVar, RecyclerView.A a10, a aVar) {
        View viewJ2;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, a10)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z11 = this.f31698v;
        boolean z12 = this.f31701y;
        if (z11 != z12 || (viewJ2 = j2(vVar, a10, aVar.f31706d, z12)) == null) {
            return false;
        }
        aVar.b(viewJ2, l0(viewJ2));
        if (!a10.e() && P1()) {
            int iG = this.f31697u.g(viewJ2);
            int iD = this.f31697u.d(viewJ2);
            int iM = this.f31697u.m();
            int i10 = this.f31697u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f31706d) {
                    iM = i10;
                }
                aVar.f31705c = iM;
            }
        }
        return true;
    }

    private boolean G2(RecyclerView.A a10, a aVar) {
        int i10;
        if (!a10.e() && (i10 = this.f31687A) != -1) {
            if (i10 >= 0 && i10 < a10.b()) {
                aVar.f31704b = this.f31687A;
                d dVar = this.f31690D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.f31690D.f31727c;
                    aVar.f31706d = z10;
                    if (z10) {
                        aVar.f31705c = this.f31697u.i() - this.f31690D.f31726b;
                    } else {
                        aVar.f31705c = this.f31697u.m() + this.f31690D.f31726b;
                    }
                    return true;
                }
                if (this.f31688B != Integer.MIN_VALUE) {
                    boolean z11 = this.f31700x;
                    aVar.f31706d = z11;
                    if (z11) {
                        aVar.f31705c = this.f31697u.i() - this.f31688B;
                    } else {
                        aVar.f31705c = this.f31697u.m() + this.f31688B;
                    }
                    return true;
                }
                View viewH = H(this.f31687A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f31706d = (this.f31687A < l0(N(0))) == this.f31700x;
                    }
                    aVar.a();
                } else {
                    if (this.f31697u.e(viewH) > this.f31697u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f31697u.g(viewH) - this.f31697u.m() < 0) {
                        aVar.f31705c = this.f31697u.m();
                        aVar.f31706d = false;
                        return true;
                    }
                    if (this.f31697u.i() - this.f31697u.d(viewH) < 0) {
                        aVar.f31705c = this.f31697u.i();
                        aVar.f31706d = true;
                        return true;
                    }
                    aVar.f31705c = aVar.f31706d ? this.f31697u.d(viewH) + this.f31697u.o() : this.f31697u.g(viewH);
                }
                return true;
            }
            this.f31687A = -1;
            this.f31688B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(RecyclerView.v vVar, RecyclerView.A a10, a aVar) {
        if (G2(a10, aVar) || F2(vVar, a10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f31704b = this.f31701y ? a10.b() - 1 : 0;
    }

    private void I2(int i10, int i11, boolean z10, RecyclerView.A a10) {
        int iM;
        this.f31696t.f31724m = z2();
        this.f31696t.f31717f = i10;
        int[] iArr = this.f31694H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a10, iArr);
        int iMax = Math.max(0, this.f31694H[0]);
        int iMax2 = Math.max(0, this.f31694H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f31696t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f31719h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f31720i = iMax;
        if (z11) {
            cVar.f31719h = i12 + this.f31697u.j();
            View viewM2 = m2();
            c cVar2 = this.f31696t;
            cVar2.f31716e = this.f31700x ? -1 : 1;
            int iL0 = l0(viewM2);
            c cVar3 = this.f31696t;
            cVar2.f31715d = iL0 + cVar3.f31716e;
            cVar3.f31713b = this.f31697u.d(viewM2);
            iM = this.f31697u.d(viewM2) - this.f31697u.i();
        } else {
            View viewN2 = n2();
            this.f31696t.f31719h += this.f31697u.m();
            c cVar4 = this.f31696t;
            cVar4.f31716e = this.f31700x ? 1 : -1;
            int iL02 = l0(viewN2);
            c cVar5 = this.f31696t;
            cVar4.f31715d = iL02 + cVar5.f31716e;
            cVar5.f31713b = this.f31697u.g(viewN2);
            iM = (-this.f31697u.g(viewN2)) + this.f31697u.m();
        }
        c cVar6 = this.f31696t;
        cVar6.f31714c = i11;
        if (z10) {
            cVar6.f31714c = i11 - iM;
        }
        cVar6.f31718g = iM;
    }

    private void J2(int i10, int i11) {
        this.f31696t.f31714c = this.f31697u.i() - i11;
        c cVar = this.f31696t;
        cVar.f31716e = this.f31700x ? -1 : 1;
        cVar.f31715d = i10;
        cVar.f31717f = 1;
        cVar.f31713b = i11;
        cVar.f31718g = Integer.MIN_VALUE;
    }

    private void K2(a aVar) {
        J2(aVar.f31704b, aVar.f31705c);
    }

    private void L2(int i10, int i11) {
        this.f31696t.f31714c = i11 - this.f31697u.m();
        c cVar = this.f31696t;
        cVar.f31715d = i10;
        cVar.f31716e = this.f31700x ? 1 : -1;
        cVar.f31717f = -1;
        cVar.f31713b = i11;
        cVar.f31718g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f31704b, aVar.f31705c);
    }

    private int S1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.a(a10, this.f31697u, b2(!this.f31702z, true), a2(!this.f31702z, true), this, this.f31702z);
    }

    private int T1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.b(a10, this.f31697u, b2(!this.f31702z, true), a2(!this.f31702z, true), this, this.f31702z, this.f31700x);
    }

    private int U1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.c(a10, this.f31697u, b2(!this.f31702z, true), a2(!this.f31702z, true), this, this.f31702z);
    }

    private View Z1() {
        return f2(0, O());
    }

    private View d2() {
        return f2(O() - 1, -1);
    }

    private View h2() {
        return this.f31700x ? Z1() : d2();
    }

    private View i2() {
        return this.f31700x ? d2() : Z1();
    }

    private int k2(int i10, RecyclerView.v vVar, RecyclerView.A a10, boolean z10) {
        int i11;
        int i12 = this.f31697u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -B2(-i12, vVar, a10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f31697u.i() - i14) <= 0) {
            return i13;
        }
        this.f31697u.r(i11);
        return i11 + i13;
    }

    private int l2(int i10, RecyclerView.v vVar, RecyclerView.A a10, boolean z10) {
        int iM;
        int iM2 = i10 - this.f31697u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -B2(iM2, vVar, a10);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f31697u.m()) <= 0) {
            return i11;
        }
        this.f31697u.r(-iM);
        return i11 - iM;
    }

    private View m2() {
        return N(this.f31700x ? 0 : O() - 1);
    }

    private View n2() {
        return N(this.f31700x ? O() - 1 : 0);
    }

    private void t2(RecyclerView.v vVar, RecyclerView.A a10, int i10, int i11) {
        if (!a10.g() || O() == 0 || a10.e() || !P1()) {
            return;
        }
        List listK = vVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.E e10 = (RecyclerView.E) listK.get(i12);
            if (!e10.w()) {
                if ((e10.n() < iL0) != this.f31700x) {
                    iE += this.f31697u.e(e10.f31840a);
                } else {
                    iE2 += this.f31697u.e(e10.f31840a);
                }
            }
        }
        this.f31696t.f31723l = listK;
        if (iE > 0) {
            L2(l0(n2()), i10);
            c cVar = this.f31696t;
            cVar.f31719h = iE;
            cVar.f31714c = 0;
            cVar.a();
            Y1(vVar, this.f31696t, a10, false);
        }
        if (iE2 > 0) {
            J2(l0(m2()), i11);
            c cVar2 = this.f31696t;
            cVar2.f31719h = iE2;
            cVar2.f31714c = 0;
            cVar2.a();
            Y1(vVar, this.f31696t, a10, false);
        }
        this.f31696t.f31723l = null;
    }

    private void v2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f31712a || cVar.f31724m) {
            return;
        }
        int i10 = cVar.f31718g;
        int i11 = cVar.f31720i;
        if (cVar.f31717f == -1) {
            x2(vVar, i10, i11);
        } else {
            y2(vVar, i10, i11);
        }
    }

    private void w2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                r1(i10, vVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                r1(i12, vVar);
            }
        }
    }

    private void x2(RecyclerView.v vVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f31697u.h() - i10) + i11;
        if (this.f31700x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f31697u.g(viewN) < iH || this.f31697u.q(viewN) < iH) {
                    w2(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f31697u.g(viewN2) < iH || this.f31697u.q(viewN2) < iH) {
                w2(vVar, i13, i14);
                return;
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f31700x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f31697u.d(viewN) > i12 || this.f31697u.p(viewN) > i12) {
                    w2(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f31697u.d(viewN2) > i12 || this.f31697u.p(viewN2) > i12) {
                w2(vVar, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.A a10) {
        return U1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (this.f31695s == 1) {
            return 0;
        }
        return B2(i10, vVar, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i10) {
        this.f31687A = i10;
        this.f31688B = Integer.MIN_VALUE;
        d dVar = this.f31690D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    int B2(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        X1();
        this.f31696t.f31712a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        I2(i11, iAbs, true, a10);
        c cVar = this.f31696t;
        int iY1 = cVar.f31718g + Y1(vVar, cVar, a10, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i10 = i11 * iY1;
        }
        this.f31697u.r(-i10);
        this.f31696t.f31722k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (this.f31695s == 0) {
            return 0;
        }
        return B2(i10, vVar, a10);
    }

    public void C2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f31695s || this.f31697u == null) {
            i iVarB = i.b(this, i10);
            this.f31697u = iVarB;
            this.f31691E.f31703a = iVarB;
            this.f31695s = i10;
            x1();
        }
    }

    public void D2(boolean z10) {
        l(null);
        if (z10 == this.f31699w) {
            return;
        }
        this.f31699w = z10;
        x1();
    }

    public void E2(boolean z10) {
        l(null);
        if (this.f31701y == z10) {
            return;
        }
        this.f31701y = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.M0(recyclerView, vVar);
        if (this.f31689C) {
            o1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.A a10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        N1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        int iV1;
        A2();
        if (O() == 0 || (iV1 = V1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        I2(iV1, (int) (this.f31697u.n() * 0.33333334f), false, a10);
        c cVar = this.f31696t;
        cVar.f31718g = Integer.MIN_VALUE;
        cVar.f31712a = false;
        Y1(vVar, cVar, a10, true);
        View viewI2 = iV1 == -1 ? i2() : h2();
        View viewN2 = iV1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(c2());
            accessibilityEvent.setToIndex(e2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f31690D == null && this.f31698v == this.f31701y;
    }

    protected void Q1(RecyclerView.A a10, int[] iArr) {
        int i10;
        int iO2 = o2(a10);
        if (this.f31696t.f31717f == -1) {
            i10 = 0;
        } else {
            i10 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i10;
    }

    void R1(RecyclerView.A a10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f31715d;
        if (i10 < 0 || i10 >= a10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f31718g));
    }

    int V1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f31695s == 1) ? 1 : Integer.MIN_VALUE : this.f31695s == 0 ? 1 : Integer.MIN_VALUE : this.f31695s == 1 ? -1 : Integer.MIN_VALUE : this.f31695s == 0 ? -1 : Integer.MIN_VALUE : (this.f31695s != 1 && q2()) ? -1 : 1 : (this.f31695s != 1 && q2()) ? 1 : -1;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f31696t == null) {
            this.f31696t = W1();
        }
    }

    int Y1(RecyclerView.v vVar, c cVar, RecyclerView.A a10, boolean z10) {
        int i10 = cVar.f31714c;
        int i11 = cVar.f31718g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f31718g = i11 + i10;
            }
            v2(vVar, cVar);
        }
        int i12 = cVar.f31714c + cVar.f31719h;
        b bVar = this.f31692F;
        while (true) {
            if ((!cVar.f31724m && i12 <= 0) || !cVar.c(a10)) {
                break;
            }
            bVar.a();
            s2(vVar, a10, cVar, bVar);
            if (!bVar.f31709b) {
                cVar.f31713b += bVar.f31708a * cVar.f31717f;
                if (!bVar.f31710c || cVar.f31723l != null || !a10.e()) {
                    int i13 = cVar.f31714c;
                    int i14 = bVar.f31708a;
                    cVar.f31714c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f31718g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f31708a;
                    cVar.f31718g = i16;
                    int i17 = cVar.f31714c;
                    if (i17 < 0) {
                        cVar.f31718g = i16 + i17;
                    }
                    v2(vVar, cVar);
                }
                if (z10 && bVar.f31711d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f31714c;
    }

    View a2(boolean z10, boolean z11) {
        return this.f31700x ? g2(0, O(), z10, z11) : g2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.v vVar, RecyclerView.A a10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iK2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f31690D == null && this.f31687A == -1) && a10.b() == 0) {
            o1(vVar);
            return;
        }
        d dVar = this.f31690D;
        if (dVar != null && dVar.a()) {
            this.f31687A = this.f31690D.f31725a;
        }
        X1();
        this.f31696t.f31712a = false;
        A2();
        View viewA0 = a0();
        a aVar = this.f31691E;
        if (!aVar.f31707e || this.f31687A != -1 || this.f31690D != null) {
            aVar.e();
            a aVar2 = this.f31691E;
            aVar2.f31706d = this.f31700x ^ this.f31701y;
            H2(vVar, a10, aVar2);
            this.f31691E.f31707e = true;
        } else if (viewA0 != null && (this.f31697u.g(viewA0) >= this.f31697u.i() || this.f31697u.d(viewA0) <= this.f31697u.m())) {
            this.f31691E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f31696t;
        cVar.f31717f = cVar.f31722k >= 0 ? 1 : -1;
        int[] iArr = this.f31694H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a10, iArr);
        int iMax = Math.max(0, this.f31694H[0]) + this.f31697u.m();
        int iMax2 = Math.max(0, this.f31694H[1]) + this.f31697u.j();
        if (a10.e() && (i14 = this.f31687A) != -1 && this.f31688B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f31700x) {
                i15 = this.f31697u.i() - this.f31697u.d(viewH);
                iG = this.f31688B;
            } else {
                iG = this.f31697u.g(viewH) - this.f31697u.m();
                i15 = this.f31688B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f31691E;
        if (!aVar3.f31706d ? !this.f31700x : this.f31700x) {
            i16 = 1;
        }
        u2(vVar, a10, aVar3, i16);
        B(vVar);
        this.f31696t.f31724m = z2();
        this.f31696t.f31721j = a10.e();
        this.f31696t.f31720i = 0;
        a aVar4 = this.f31691E;
        if (aVar4.f31706d) {
            M2(aVar4);
            c cVar2 = this.f31696t;
            cVar2.f31719h = iMax;
            Y1(vVar, cVar2, a10, false);
            c cVar3 = this.f31696t;
            i11 = cVar3.f31713b;
            int i18 = cVar3.f31715d;
            int i19 = cVar3.f31714c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            K2(this.f31691E);
            c cVar4 = this.f31696t;
            cVar4.f31719h = iMax2;
            cVar4.f31715d += cVar4.f31716e;
            Y1(vVar, cVar4, a10, false);
            c cVar5 = this.f31696t;
            i10 = cVar5.f31713b;
            int i20 = cVar5.f31714c;
            if (i20 > 0) {
                L2(i18, i11);
                c cVar6 = this.f31696t;
                cVar6.f31719h = i20;
                Y1(vVar, cVar6, a10, false);
                i11 = this.f31696t.f31713b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f31696t;
            cVar7.f31719h = iMax2;
            Y1(vVar, cVar7, a10, false);
            c cVar8 = this.f31696t;
            i10 = cVar8.f31713b;
            int i21 = cVar8.f31715d;
            int i22 = cVar8.f31714c;
            if (i22 > 0) {
                iMax += i22;
            }
            M2(this.f31691E);
            c cVar9 = this.f31696t;
            cVar9.f31719h = iMax;
            cVar9.f31715d += cVar9.f31716e;
            Y1(vVar, cVar9, a10, false);
            c cVar10 = this.f31696t;
            i11 = cVar10.f31713b;
            int i23 = cVar10.f31714c;
            if (i23 > 0) {
                J2(i21, i10);
                c cVar11 = this.f31696t;
                cVar11.f31719h = i23;
                Y1(vVar, cVar11, a10, false);
                i10 = this.f31696t.f31713b;
            }
        }
        if (O() > 0) {
            if (this.f31700x ^ this.f31701y) {
                int iK22 = k2(i10, vVar, a10, true);
                i12 = i11 + iK22;
                i13 = i10 + iK22;
                iK2 = l2(i12, vVar, a10, false);
            } else {
                int iL2 = l2(i11, vVar, a10, true);
                i12 = i11 + iL2;
                i13 = i10 + iL2;
                iK2 = k2(i13, vVar, a10, false);
            }
            i11 = i12 + iK2;
            i10 = i13 + iK2;
        }
        t2(vVar, a10, i11, i10);
        if (a10.e()) {
            this.f31691E.e();
        } else {
            this.f31697u.s();
        }
        this.f31698v = this.f31701y;
    }

    View b2(boolean z10, boolean z11) {
        return this.f31700x ? g2(O() - 1, -1, z10, z11) : g2(0, O(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.A a10) {
        super.c1(a10);
        this.f31690D = null;
        this.f31687A = -1;
        this.f31688B = Integer.MIN_VALUE;
        this.f31691E.e();
    }

    public int c2() {
        View viewG2 = g2(0, O(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF d(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f31700x ? -1 : 1;
        return this.f31695s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public int e2() {
        View viewG2 = g2(O() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    View f2(int i10, int i11) {
        int i12;
        int i13;
        X1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f31697u.g(N(i10)) < this.f31697u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f31695s == 0 ? this.f31887e.a(i10, i11, i12, i13) : this.f31888f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f31690D = dVar;
            if (this.f31687A != -1) {
                dVar.b();
            }
            x1();
        }
    }

    View g2(int i10, int i11, boolean z10, boolean z11) {
        X1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f31695s == 0 ? this.f31887e.a(i10, i11, i12, i13) : this.f31888f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable h1() {
        if (this.f31690D != null) {
            return new d(this.f31690D);
        }
        d dVar = new d();
        if (O() <= 0) {
            dVar.b();
            return dVar;
        }
        X1();
        boolean z10 = this.f31698v ^ this.f31700x;
        dVar.f31727c = z10;
        if (z10) {
            View viewM2 = m2();
            dVar.f31726b = this.f31697u.i() - this.f31697u.d(viewM2);
            dVar.f31725a = l0(viewM2);
            return dVar;
        }
        View viewN2 = n2();
        dVar.f31725a = l0(viewN2);
        dVar.f31726b = this.f31697u.g(viewN2) - this.f31697u.m();
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View j2(androidx.recyclerview.widget.RecyclerView.v r17, androidx.recyclerview.widget.RecyclerView.A r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.X1()
            int r1 = r0.O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.O()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.i r7 = r0.f31697u
            int r7 = r7.m()
            androidx.recyclerview.widget.i r8 = r0.f31697u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.N(r1)
            int r13 = r0.l0(r12)
            androidx.recyclerview.widget.i r14 = r0.f31697u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.i r15 = r0.f31697u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.f31690D == null) {
            super.l(str);
        }
    }

    protected int o2(RecyclerView.A a10) {
        if (a10.d()) {
            return this.f31697u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f31695s == 0;
    }

    public int p2() {
        return this.f31695s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f31695s == 1;
    }

    protected boolean q2() {
        return d0() == 1;
    }

    public boolean r2() {
        return this.f31702z;
    }

    void s2(RecyclerView.v vVar, RecyclerView.A a10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iI0;
        int iF;
        int i14;
        int i15;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f31709b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f31723l == null) {
            if (this.f31700x == (cVar.f31717f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f31700x == (cVar.f31717f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f31708a = this.f31697u.e(viewD);
        if (this.f31695s == 1) {
            if (q2()) {
                iF = s0() - j0();
                iI0 = iF - this.f31697u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f31697u.f(viewD) + iI0;
            }
            if (cVar.f31717f == -1) {
                i15 = cVar.f31713b;
                i14 = i15 - bVar.f31708a;
            } else {
                i14 = cVar.f31713b;
                i15 = bVar.f31708a + i14;
            }
            int i16 = iI0;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int iK0 = k0();
            int iF2 = this.f31697u.f(viewD) + iK0;
            if (cVar.f31717f == -1) {
                int i17 = cVar.f31713b;
                i12 = i17 - bVar.f31708a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f31713b;
                i10 = bVar.f31708a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = iK0;
        }
        D0(viewD, i12, i13, i10, i11);
        if (qVar.c() || qVar.b()) {
            bVar.f31710c = true;
        }
        bVar.f31711d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i10, int i11, RecyclerView.A a10, RecyclerView.p.c cVar) {
        if (this.f31695s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        X1();
        I2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a10);
        R1(a10, this.f31696t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f31690D;
        if (dVar == null || !dVar.a()) {
            A2();
            z10 = this.f31700x;
            i11 = this.f31687A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f31690D;
            z10 = dVar2.f31727c;
            i11 = dVar2.f31725a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f31693G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.A a10) {
        return S1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.A a10) {
        return T1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.A a10) {
        return U1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.A a10) {
        return S1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.A a10) {
        return T1(a10);
    }

    boolean z2() {
        return this.f31697u.k() == 0 && this.f31697u.h() == 0;
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f31695s = 1;
        this.f31699w = false;
        this.f31700x = false;
        this.f31701y = false;
        this.f31702z = true;
        this.f31687A = -1;
        this.f31688B = Integer.MIN_VALUE;
        this.f31690D = null;
        this.f31691E = new a();
        this.f31692F = new b();
        this.f31693G = 2;
        this.f31694H = new int[2];
        C2(i10);
        D2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f31695s = 1;
        this.f31699w = false;
        this.f31700x = false;
        this.f31701y = false;
        this.f31702z = true;
        this.f31687A = -1;
        this.f31688B = Integer.MIN_VALUE;
        this.f31690D = null;
        this.f31691E = new a();
        this.f31692F = new b();
        this.f31693G = 2;
        this.f31694H = new int[2];
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i10, i11);
        C2(dVarM0.f31903a);
        D2(dVarM0.f31905c);
        E2(dVarM0.f31906d);
    }

    void u2(RecyclerView.v vVar, RecyclerView.A a10, a aVar, int i10) {
    }
}
