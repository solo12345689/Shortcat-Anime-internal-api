package Y;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.InterfaceC2425m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6539E;
import t.C6540F;
import t.C6541G;
import t.C6546L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H1 {

    /* JADX INFO: renamed from: y */
    public static final a f22130y = new a(null);

    /* JADX INFO: renamed from: z */
    public static final int f22131z = 8;

    /* JADX INFO: renamed from: a */
    private final E1 f22132a;

    /* JADX INFO: renamed from: b */
    private int[] f22133b;

    /* JADX INFO: renamed from: c */
    private Object[] f22134c;

    /* JADX INFO: renamed from: d */
    private ArrayList f22135d;

    /* JADX INFO: renamed from: e */
    private HashMap f22136e;

    /* JADX INFO: renamed from: f */
    private C6540F f22137f;

    /* JADX INFO: renamed from: g */
    private int f22138g;

    /* JADX INFO: renamed from: h */
    private int f22139h;

    /* JADX INFO: renamed from: i */
    private int f22140i;

    /* JADX INFO: renamed from: j */
    private int f22141j;

    /* JADX INFO: renamed from: k */
    private int f22142k;

    /* JADX INFO: renamed from: l */
    private int f22143l;

    /* JADX INFO: renamed from: m */
    private int f22144m;

    /* JADX INFO: renamed from: n */
    private int f22145n;

    /* JADX INFO: renamed from: o */
    private int f22146o;

    /* JADX INFO: renamed from: s */
    private C6540F f22150s;

    /* JADX INFO: renamed from: t */
    private int f22151t;

    /* JADX INFO: renamed from: u */
    private int f22152u;

    /* JADX INFO: renamed from: w */
    private boolean f22154w;

    /* JADX INFO: renamed from: x */
    private C6539E f22155x;

    /* JADX INFO: renamed from: p */
    private final C2414i0 f22147p = new C2414i0();

    /* JADX INFO: renamed from: q */
    private final C2414i0 f22148q = new C2414i0();

    /* JADX INFO: renamed from: r */
    private final C2414i0 f22149r = new C2414i0();

    /* JADX INFO: renamed from: v */
    private int f22153v = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List b(H1 h12, int i10, H1 h13, boolean z10, boolean z11, boolean z12) {
            boolean zK0;
            List listM;
            int iH0 = h12.h0(i10);
            int i11 = i10 + iH0;
            int iN = h12.N(i10);
            int iN2 = h12.N(i11);
            int i12 = iN2 - iN;
            boolean zK = h12.K(i10);
            h13.m0(iH0);
            h13.n0(i12, h13.Z());
            if (h12.f22138g < i11) {
                h12.v0(i11);
            }
            if (h12.f22142k < iN2) {
                h12.x0(iN2, i11);
            }
            int[] iArr = h13.f22133b;
            int iZ = h13.Z();
            int i13 = iZ * 5;
            AbstractC2273n.k(h12.f22133b, iArr, i13, i10 * 5, i11 * 5);
            Object[] objArr = h13.f22134c;
            int i14 = h13.f22140i;
            System.arraycopy(h12.f22134c, iN, objArr, i14, i12);
            int iA0 = h13.a0();
            iArr[i13 + 2] = iA0;
            int i15 = iZ - i10;
            int i16 = iZ + iH0;
            int iO = i14 - h13.O(iArr, iZ);
            int i17 = h13.f22144m;
            int i18 = h13.f22143l;
            int length = objArr.length;
            int i19 = i17;
            int i20 = iZ;
            while (true) {
                zK0 = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != iZ) {
                    int i21 = (i20 * 5) + 2;
                    iArr[i21] = iArr[i21] + i15;
                }
                int[] iArr2 = iArr;
                int i22 = iZ;
                iArr2[(i20 * 5) + 4] = h13.Q(h13.O(iArr, i20) + iO, i19 >= i20 ? h13.f22142k : 0, i18, length);
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                iZ = i22;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            h13.f22144m = i19;
            int iQ = G1.q(h12.f22135d, i10, h12.b0());
            int iQ2 = G1.q(h12.f22135d, i11, h12.b0());
            if (iQ < iQ2) {
                ArrayList arrayList = h12.f22135d;
                ArrayList arrayList2 = new ArrayList(iQ2 - iQ);
                for (int i23 = iQ; i23 < iQ2; i23++) {
                    C2392b c2392b = (C2392b) arrayList.get(i23);
                    c2392b.c(c2392b.a() + i15);
                    arrayList2.add(c2392b);
                }
                h13.f22135d.addAll(G1.q(h13.f22135d, h13.Z(), h13.b0()), arrayList2);
                arrayList.subList(iQ, iQ2).clear();
                listM = arrayList2;
            } else {
                listM = AbstractC2279u.m();
            }
            if (!listM.isEmpty()) {
                HashMap map = h12.f22136e;
                HashMap map2 = h13.f22136e;
                if (map != null && map2 != null) {
                    int size = listM.size();
                    for (int i24 = 0; i24 < size; i24++) {
                    }
                }
            }
            h13.a0();
            h13.b1(iA0);
            int iC0 = h12.C0(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iC0 >= 0;
                    if (z13) {
                        h12.d1();
                        h12.A(iC0 - h12.Z());
                        h12.d1();
                    }
                    h12.A(i10 - h12.Z());
                    boolean zJ0 = h12.J0();
                    if (z13) {
                        h12.U0();
                        h12.R();
                        h12.U0();
                        h12.R();
                    }
                    zK0 = zJ0;
                } else {
                    zK0 = h12.K0(i10, iH0);
                    h12.L0(iN, i12, i10 - 1);
                }
            }
            if (zK0) {
                AbstractC2454w.t("Unexpectedly removed anchors");
            }
            int i25 = h13.f22146o;
            int i26 = iArr3[i13 + 1];
            h13.f22146o = i25 + ((1073741824 & i26) == 0 ? i26 & 67108863 : 1);
            if (z11) {
                h13.f22151t = i16;
                h13.f22140i = i14 + i12;
            }
            if (zK) {
                h13.m1(iA0);
            }
            return listM;
        }

        static /* synthetic */ List c(a aVar, H1 h12, int i10, H1 h13, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(h12, i10, h13, z10, z11, z12);
        }

        private a() {
        }
    }

    public H1(E1 e12) {
        this.f22132a = e12;
        this.f22133b = e12.t();
        this.f22134c = e12.v();
        this.f22135d = e12.p();
        this.f22136e = e12.y();
        this.f22137f = e12.r();
        this.f22138g = e12.u();
        this.f22139h = (this.f22133b.length / 5) - e12.u();
        this.f22142k = e12.w();
        this.f22143l = this.f22134c.length - e12.w();
        this.f22144m = e12.u();
        this.f22152u = e12.u();
    }

    private final int B0(int[] iArr, int i10) {
        return O(iArr, i10);
    }

    private final int D0(int[] iArr, int i10) {
        return E0(iArr[(e0(i10) * 5) + 2]);
    }

    private final int E(int[] iArr, int i10) {
        return O(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    private final int E0(int i10) {
        return i10 > -2 ? i10 : (b0() + i10) - (-2);
    }

    private final int F0(int i10, int i11) {
        return i10 < i11 ? i10 : -((b0() - i10) + 2);
    }

    private final boolean G(int i10) {
        int iH0 = i10 + 1;
        int iH02 = i10 + h0(i10);
        while (iH0 < iH02) {
            if ((this.f22133b[(e0(iH0) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iH0 += h0(iH0);
        }
        return false;
    }

    private final Object G0(Object obj) {
        Object objS0 = S0();
        R0(obj);
        return objS0;
    }

    private final void H0() {
        C6539E c6539e = this.f22155x;
        if (c6539e != null) {
            while (Y0.d(c6539e)) {
                n1(Y0.f(c6539e), c6539e);
            }
        }
    }

    private final void I() {
        int i10 = this.f22142k;
        AbstractC2273n.w(this.f22134c, null, i10, this.f22143l + i10);
    }

    private final boolean I0(int i10, int i11, HashMap map) {
        int i12 = i11 + i10;
        int iQ = G1.q(this.f22135d, i12, X() - this.f22139h);
        if (iQ >= this.f22135d.size()) {
            iQ--;
        }
        int i13 = iQ + 1;
        int i14 = 0;
        while (iQ >= 0) {
            C2392b c2392b = (C2392b) this.f22135d.get(iQ);
            int iC = C(c2392b);
            if (iC < i10) {
                break;
            }
            if (iC < i12) {
                c2392b.c(Integer.MIN_VALUE);
                if (map != null) {
                }
                if (i14 == 0) {
                    i14 = iQ + 1;
                }
                i13 = iQ;
            }
            iQ--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f22135d.subList(i13, i14).clear();
        }
        return z10;
    }

    public final boolean K(int i10) {
        return i10 >= 0 && (this.f22133b[(e0(i10) * 5) + 1] & 201326592) != 0;
    }

    public final boolean K0(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f22135d;
            v0(i10);
            zI0 = arrayList.isEmpty() ? false : I0(i10, i11, this.f22136e);
            this.f22138g = i10;
            this.f22139h += i11;
            int i12 = this.f22144m;
            if (i12 > i10) {
                this.f22144m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f22152u;
            if (i13 >= this.f22138g) {
                this.f22152u = i13 - i11;
            }
            int i14 = this.f22153v;
            if (L(i14)) {
                m1(i14);
            }
        }
        return zI0;
    }

    private final boolean L(int i10) {
        return i10 >= 0 && (this.f22133b[(e0(i10) * 5) + 1] & 67108864) != 0;
    }

    public final void L0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f22143l;
            int i14 = i10 + i11;
            x0(i14, i12);
            this.f22142k = i10;
            this.f22143l = i13 + i11;
            AbstractC2273n.w(this.f22134c, null, i10, i14);
            int i15 = this.f22141j;
            if (i15 >= i10) {
                this.f22141j = i15 - i11;
            }
        }
    }

    private final int M(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    public final int N(int i10) {
        return O(this.f22133b, e0(i10));
    }

    private final int N0() {
        int iX = (X() - this.f22139h) - this.f22148q.g();
        this.f22152u = iX;
        return iX;
    }

    public final int O(int[] iArr, int i10) {
        return i10 >= X() ? this.f22134c.length - this.f22143l : M(iArr[(i10 * 5) + 4], this.f22143l, this.f22134c.length);
    }

    private final void O0() {
        this.f22148q.h((X() - this.f22139h) - this.f22152u);
    }

    public final int P(int i10) {
        return i10 + (this.f22143l * (i10 < this.f22142k ? 0 : 1));
    }

    public final int Q(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final void V(int i10, int i11, int i12) {
        int iF0 = F0(i10, this.f22138g);
        while (i12 < i11) {
            this.f22133b[(e0(i12) * 5) + 2] = iF0;
            int iO = G1.o(this.f22133b, e0(i12)) + i12;
            V(i12, iO, i12 + 1);
            i12 = iO;
        }
    }

    private final int X() {
        return this.f22133b.length / 5;
    }

    private final int X0(int[] iArr, int i10) {
        return i10 >= X() ? this.f22134c.length - this.f22143l : M(G1.t(iArr, i10), this.f22143l, this.f22134c.length);
    }

    private final int e0(int i10) {
        return i10 + (this.f22139h * (i10 < this.f22138g ? 0 : 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void f1(int i10, Object obj, boolean z10, Object obj2) {
        int iO;
        int i11 = this.f22153v;
        byte b10 = this.f22145n > 0;
        this.f22149r.h(this.f22146o);
        if (b10 == true) {
            int i12 = this.f22151t;
            int iO2 = O(this.f22133b, e0(i12));
            m0(1);
            this.f22140i = iO2;
            this.f22141j = iO2;
            int iE0 = e0(i12);
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            ?? r12 = obj != aVar.a() ? 1 : 0;
            ?? r13 = (z10 || obj2 == aVar.a()) ? 0 : 1;
            int iQ = Q(iO2, this.f22142k, this.f22143l, this.f22134c.length);
            if (iQ >= 0 && this.f22144m < i12) {
                iQ = -(((this.f22134c.length - this.f22143l) - iQ) + 1);
            }
            G1.p(this.f22133b, iE0, i10, z10, r12, r13, this.f22153v, iQ);
            int i13 = (z10 ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                n0(i13, i12);
                Object[] objArr = this.f22134c;
                int i14 = this.f22140i;
                if (z10) {
                    objArr[i14] = obj2;
                    i14++;
                }
                if (r12 != 0) {
                    objArr[i14] = obj;
                    i14++;
                }
                if (r13 != 0) {
                    objArr[i14] = obj2;
                    i14++;
                }
                this.f22140i = i14;
            }
            this.f22146o = 0;
            iO = i12 + 1;
            this.f22153v = i12;
            this.f22151t = iO;
            if (i11 >= 0) {
                b1(i11);
            }
        } else {
            this.f22147p.h(i11);
            O0();
            int i15 = this.f22151t;
            int iE02 = e0(i15);
            if (!AbstractC5504s.c(obj2, InterfaceC2425m.f22370a.a())) {
                if (z10) {
                    q1(obj2);
                } else {
                    l1(obj2);
                }
            }
            this.f22140i = X0(this.f22133b, iE02);
            this.f22141j = O(this.f22133b, e0(this.f22151t + 1));
            int[] iArr = this.f22133b;
            this.f22146o = iArr[(iE02 * 5) + 1] & 67108863;
            this.f22153v = i15;
            this.f22151t = i15 + 1;
            iO = i15 + G1.o(iArr, iE02);
        }
        this.f22152u = iO;
    }

    private final void k1(int i10, int i11) {
        C2392b c2392b;
        int iA;
        C2392b c2392b2;
        int iA2;
        int i12;
        int iX = X() - this.f22139h;
        if (i10 >= i11) {
            for (int iQ = G1.q(this.f22135d, i11, iX); iQ < this.f22135d.size() && (iA = (c2392b = (C2392b) this.f22135d.get(iQ)).a()) >= 0; iQ++) {
                c2392b.c(-(iX - iA));
            }
            return;
        }
        for (int iQ2 = G1.q(this.f22135d, i10, iX); iQ2 < this.f22135d.size() && (iA2 = (c2392b2 = (C2392b) this.f22135d.get(iQ2)).a()) < 0 && (i12 = iA2 + iX) < i11; iQ2++) {
            c2392b2.c(i12);
        }
    }

    public final void m0(int i10) {
        if (i10 > 0) {
            int i11 = this.f22151t;
            v0(i11);
            int i12 = this.f22138g;
            int i13 = this.f22139h;
            int[] iArr = this.f22133b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC2273n.k(iArr, iArr2, 0, 0, i12 * 5);
                AbstractC2273n.k(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f22133b = iArr2;
                i13 = i15;
            }
            int i16 = this.f22152u;
            if (i16 >= i12) {
                this.f22152u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f22138g = i17;
            this.f22139h = i13 - i10;
            int iQ = Q(i14 > 0 ? N(i11 + i10) : 0, this.f22144m >= i12 ? this.f22142k : 0, this.f22143l, this.f22134c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f22133b[(i18 * 5) + 4] = iQ;
            }
            int i19 = this.f22144m;
            if (i19 >= i12) {
                this.f22144m = i19 + i10;
            }
        }
    }

    public final void m1(int i10) {
        if (i10 >= 0) {
            C6539E c6539eC = this.f22155x;
            if (c6539eC == null) {
                c6539eC = Y0.c(null, 1, null);
                this.f22155x = c6539eC;
            }
            Y0.a(c6539eC, i10);
        }
    }

    public final void n0(int i10, int i11) {
        if (i10 > 0) {
            x0(this.f22140i, i11);
            int i12 = this.f22142k;
            int i13 = this.f22143l;
            if (i13 < i10) {
                Object[] objArr = this.f22134c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f22134c = objArr2;
                i13 = i16;
            }
            int i18 = this.f22141j;
            if (i18 >= i12) {
                this.f22141j = i18 + i10;
            }
            this.f22142k = i12 + i10;
            this.f22143l = i13 - i10;
        }
    }

    private final void n1(int i10, C6539E c6539e) {
        int iE0 = e0(i10);
        boolean zG = G(i10);
        int[] iArr = this.f22133b;
        if (((iArr[(iE0 * 5) + 1] & 67108864) != 0) != zG) {
            G1.v(iArr, iE0, zG);
            int iC0 = C0(i10);
            if (iC0 >= 0) {
                Y0.a(c6539e, iC0);
            }
        }
    }

    private final void o1(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = Q(i11, this.f22142k, this.f22143l, this.f22134c.length);
    }

    public static /* synthetic */ void r0(H1 h12, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = h12.f22153v;
        }
        h12.q0(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r1(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.e0(r5)
            int[] r1 = r4.f22133b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating the node of a group at "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            Y.AbstractC2454w.t(r5)
        L31:
            java.lang.Object[] r5 = r4.f22134c
            int[] r1 = r4.f22133b
            int r0 = r4.B0(r1, r0)
            int r0 = r4.P(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.H1.r1(int, java.lang.Object):void");
    }

    private final void s0(int i10, int i11, int i12) {
        C2392b c2392b;
        int iC;
        int i13 = i12 + i10;
        int iB0 = b0();
        int iQ = G1.q(this.f22135d, i10, iB0);
        ArrayList arrayList = new ArrayList();
        if (iQ >= 0) {
            while (iQ < this.f22135d.size() && (iC = C((c2392b = (C2392b) this.f22135d.get(iQ)))) >= i10 && iC < i13) {
                arrayList.add(c2392b);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            C2392b c2392b2 = (C2392b) arrayList.get(i15);
            int iC2 = C(c2392b2) + i14;
            if (iC2 >= this.f22138g) {
                c2392b2.c(-(iB0 - iC2));
            } else {
                c2392b2.c(iC2);
            }
            this.f22135d.add(G1.q(this.f22135d, iC2, iB0), c2392b2);
        }
    }

    public final void v0(int i10) {
        int i11 = this.f22139h;
        int i12 = this.f22138g;
        if (i12 != i10) {
            if (!this.f22135d.isEmpty()) {
                k1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f22133b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    AbstractC2273n.k(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    AbstractC2273n.k(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iX = X();
            if (!(i12 < iX)) {
                AbstractC2454w.t("Check failed");
            }
            while (i12 < iX) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.f22133b[i16];
                int iF0 = F0(E0(i17), i10);
                if (iF0 != i17) {
                    this.f22133b[i16] = iF0;
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f22138g = i10;
    }

    public final void x0(int i10, int i11) {
        int i12 = this.f22143l;
        int i13 = this.f22142k;
        int i14 = this.f22144m;
        if (i13 != i10) {
            Object[] objArr = this.f22134c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, b0());
        if (i14 != iMin) {
            int length = this.f22134c.length - i12;
            if (iMin < i14) {
                int iE0 = e0(iMin);
                int iE02 = e0(i14);
                int i16 = this.f22138g;
                while (iE0 < iE02) {
                    int i17 = (iE0 * 5) + 4;
                    int i18 = this.f22133b[i17];
                    if (!(i18 >= 0)) {
                        AbstractC2454w.t("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f22133b[i17] = -((length - i18) + 1);
                    iE0++;
                    if (iE0 == i16) {
                        iE0 += this.f22139h;
                    }
                }
            } else {
                int iE03 = e0(i14);
                int iE04 = e0(iMin);
                while (iE03 < iE04) {
                    int i19 = (iE03 * 5) + 4;
                    int i20 = this.f22133b[i19];
                    if (!(i20 < 0)) {
                        AbstractC2454w.t("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f22133b[i19] = i20 + length + 1;
                    iE03++;
                    if (iE03 == this.f22138g) {
                        iE03 += this.f22139h;
                    }
                }
            }
            this.f22144m = iMin;
        }
        this.f22142k = i10;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            AbstractC2454w.t("Cannot seek backwards");
        }
        if (!(this.f22145n <= 0)) {
            V0.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f22151t + i10;
        if (i11 >= this.f22153v && i11 <= this.f22152u) {
            z10 = true;
        }
        if (!z10) {
            AbstractC2454w.t("Cannot seek outside the current group (" + this.f22153v + '-' + this.f22152u + ')');
        }
        this.f22151t = i11;
        int iO = O(this.f22133b, e0(i11));
        this.f22140i = iO;
        this.f22141j = iO;
    }

    public final int A0(int i10) {
        return this.f22133b[(e0(i10) * 5) + 1] & 67108863;
    }

    public final C2392b B(int i10) {
        ArrayList arrayList = this.f22135d;
        int iS = G1.s(arrayList, i10, b0());
        if (iS >= 0) {
            return (C2392b) arrayList.get(iS);
        }
        if (i10 > this.f22138g) {
            i10 = -(b0() - i10);
        }
        C2392b c2392b = new C2392b(i10);
        arrayList.add(-(iS + 1), c2392b);
        return c2392b;
    }

    public final int C(C2392b c2392b) {
        int iA = c2392b.a();
        return iA < 0 ? b0() + iA : iA;
    }

    public final int C0(int i10) {
        return D0(this.f22133b, i10);
    }

    public final void D(C2392b c2392b, Object obj) {
        if (!(this.f22145n == 0)) {
            AbstractC2454w.t("Can only append a slot if not current inserting");
        }
        int i10 = this.f22140i;
        int i11 = this.f22141j;
        int iC = C(c2392b);
        int iO = O(this.f22133b, e0(iC + 1));
        this.f22140i = iO;
        this.f22141j = iO;
        n0(1, iC);
        if (i10 >= iO) {
            i10++;
            i11++;
        }
        this.f22134c[iO] = obj;
        this.f22140i = i10;
        this.f22141j = i11;
    }

    public final void F() {
        int i10 = this.f22145n;
        this.f22145n = i10 + 1;
        if (i10 == 0) {
            O0();
        }
    }

    public final Object H(int i10) {
        int iP = P(i10);
        Object[] objArr = this.f22134c;
        Object obj = objArr[iP];
        objArr[iP] = InterfaceC2425m.f22370a.a();
        return obj;
    }

    public final void J(boolean z10) {
        this.f22154w = true;
        if (z10 && this.f22147p.f22338b == 0) {
            v0(b0());
            x0(this.f22134c.length - this.f22143l, this.f22138g);
            I();
            H0();
        }
        this.f22132a.f(this, this.f22133b, this.f22138g, this.f22134c, this.f22142k, this.f22135d, this.f22136e, this.f22137f);
    }

    public final boolean J0() {
        if (!(this.f22145n == 0)) {
            AbstractC2454w.t("Cannot remove group while inserting");
        }
        int i10 = this.f22151t;
        int i11 = this.f22140i;
        int iO = O(this.f22133b, e0(i10));
        int iT0 = T0();
        b1(this.f22153v);
        C6539E c6539e = this.f22155x;
        if (c6539e != null) {
            while (Y0.d(c6539e) && Y0.e(c6539e) >= i10) {
                Y0.f(c6539e);
            }
        }
        boolean zK0 = K0(i10, this.f22151t - i10);
        L0(iO, this.f22140i - iO, i10 - 1);
        this.f22151t = i10;
        this.f22140i = i11;
        this.f22146o -= iT0;
        return zK0;
    }

    public final void M0() {
        if (!(this.f22145n == 0)) {
            AbstractC2454w.t("Cannot reset when inserting");
        }
        H0();
        this.f22151t = 0;
        this.f22152u = X() - this.f22139h;
        this.f22140i = 0;
        this.f22141j = 0;
        this.f22146o = 0;
    }

    public final void P0(C2392b c2392b) {
        A(c2392b.e(this) - this.f22151t);
    }

    public final Object Q0(int i10, int i11, Object obj) {
        int iP = P(Y0(i10, i11));
        Object[] objArr = this.f22134c;
        Object obj2 = objArr[iP];
        objArr[iP] = obj;
        return obj2;
    }

    public final int R() {
        C6546L c6546l;
        boolean z10 = this.f22145n > 0;
        int i10 = this.f22151t;
        int i11 = this.f22152u;
        int i12 = this.f22153v;
        int iE0 = e0(i12);
        int i13 = this.f22146o;
        int i14 = i10 - i12;
        int i15 = (iE0 * 5) + 1;
        boolean z11 = (this.f22133b[i15] & 1073741824) != 0;
        if (z10) {
            C6540F c6540f = this.f22150s;
            if (c6540f != null && (c6546l = (C6546L) c6540f.c(i12)) != null) {
                Object[] objArr = c6546l.f60006a;
                int i16 = c6546l.f60007b;
                for (int i17 = 0; i17 < i16; i17++) {
                    G0(objArr[i17]);
                }
            }
            G1.w(this.f22133b, iE0, i14);
            G1.y(this.f22133b, iE0, i13);
            this.f22146o = this.f22149r.g() + (z11 ? 1 : i13);
            int iD0 = D0(this.f22133b, i12);
            this.f22153v = iD0;
            int iB0 = iD0 < 0 ? b0() : e0(iD0 + 1);
            int iO = iB0 >= 0 ? O(this.f22133b, iB0) : 0;
            this.f22140i = iO;
            this.f22141j = iO;
            return i13;
        }
        if (!(i10 == i11)) {
            AbstractC2454w.t("Expected to be at the end of a group");
        }
        int iO2 = G1.o(this.f22133b, iE0);
        int[] iArr = this.f22133b;
        int i18 = iArr[i15] & 67108863;
        G1.w(iArr, iE0, i14);
        G1.y(this.f22133b, iE0, i13);
        int iG = this.f22147p.g();
        N0();
        this.f22153v = iG;
        int iD02 = D0(this.f22133b, i12);
        int iG2 = this.f22149r.g();
        this.f22146o = iG2;
        if (iD02 == iG) {
            this.f22146o = iG2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iO2;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iD02 != 0 && iD02 != iG && (i20 != 0 || i19 != 0)) {
                int iE02 = e0(iD02);
                if (i19 != 0) {
                    G1.w(this.f22133b, iE02, G1.o(this.f22133b, iE02) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.f22133b;
                    G1.y(iArr2, iE02, (iArr2[(iE02 * 5) + 1] & 67108863) + i20);
                }
                int[] iArr3 = this.f22133b;
                if ((iArr3[(iE02 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iD02 = D0(iArr3, iD02);
            }
        }
        this.f22146o += i20;
        return i13;
    }

    public final void R0(Object obj) {
        if (!(this.f22140i <= this.f22141j)) {
            AbstractC2454w.t("Writing to an invalid slot");
        }
        this.f22134c[P(this.f22140i - 1)] = obj;
    }

    public final void S() {
        if (!(this.f22145n > 0)) {
            V0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f22145n - 1;
        this.f22145n = i10;
        if (i10 == 0) {
            if (!(this.f22149r.f22338b == this.f22147p.f22338b)) {
                AbstractC2454w.t("startGroup/endGroup mismatch while inserting");
            }
            N0();
        }
    }

    public final Object S0() {
        if (this.f22145n > 0) {
            n0(1, this.f22153v);
        }
        Object[] objArr = this.f22134c;
        int i10 = this.f22140i;
        this.f22140i = i10 + 1;
        return objArr[P(i10)];
    }

    public final void T(int i10) {
        boolean z10 = false;
        if (!(this.f22145n <= 0)) {
            AbstractC2454w.t("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f22153v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f22152u) {
                z10 = true;
            }
            if (!z10) {
                AbstractC2454w.t("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f22151t;
            int i13 = this.f22140i;
            int i14 = this.f22141j;
            this.f22151t = i10;
            d1();
            this.f22151t = i12;
            this.f22140i = i13;
            this.f22141j = i14;
        }
    }

    public final int T0() {
        int iE0 = e0(this.f22151t);
        int iO = this.f22151t + G1.o(this.f22133b, iE0);
        this.f22151t = iO;
        this.f22140i = O(this.f22133b, e0(iO));
        int i10 = this.f22133b[(iE0 * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void U(C2392b c2392b) {
        T(c2392b.e(this));
    }

    public final void U0() {
        int i10 = this.f22152u;
        this.f22151t = i10;
        this.f22140i = O(this.f22133b, e0(i10));
    }

    public final Object V0(int i10, int i11) {
        int iX0 = X0(this.f22133b, e0(i10));
        int iO = O(this.f22133b, e0(i10 + 1));
        int i12 = i11 + iX0;
        if (iX0 > i12 || i12 >= iO) {
            return InterfaceC2425m.f22370a.a();
        }
        return this.f22134c[P(i12)];
    }

    public final void W(int i10, Function2 function2) {
        int i11;
        int i12;
        C2392b c2392bA;
        Function2 function22 = function2;
        int iC0 = C0(i10);
        int iB0 = b0();
        int iH0 = h0(i10) + i10;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i13 = i10;
        C6541G c6541gB = null;
        C6539E c6539e = null;
        while (i13 < iH0) {
            int iN = N(i13);
            int i14 = i13 + 1;
            int iN2 = N(i14);
            while (true) {
                i11 = 0;
                if (iN >= iN2) {
                    break;
                }
                Object obj = this.f22134c[P(iN)];
                if ((obj instanceof C2456w1) && (c2392bA = ((C2456w1) obj).a()) != null && c2392bA.b()) {
                    int iC = C(c2392bA);
                    if (c6541gB == null) {
                        c6541gB = t.r.b();
                    }
                    if (c6539e == null) {
                        c6539e = new C6539E(0, 1, defaultConstructorMarker);
                    }
                    c6541gB.g(iC);
                    c6539e.h(iC);
                    c6539e.h(iN);
                } else {
                    function22.invoke(Integer.valueOf(iN), obj);
                }
                iN++;
            }
            int iC02 = i14 < iB0 ? C0(i14) : -1;
            if (iC02 != i13) {
                while (true) {
                    if (c6539e == null || c6541gB == null || !c6541gB.r(i13)) {
                        i12 = iB0;
                    } else {
                        int i15 = c6539e.f60103b;
                        int i16 = i15 / 2;
                        int i17 = i11;
                        int i18 = i17;
                        while (i18 < i16) {
                            int i19 = i18 * 2;
                            int i20 = iB0;
                            int iB = c6539e.b(i19);
                            if (iB == i13) {
                                int iB2 = c6539e.b(i19 + 1);
                                function22.invoke(Integer.valueOf(iB2), this.f22134c[P(iB2)]);
                            } else if (i19 != i17) {
                                int i21 = i17 + 1;
                                c6539e.n(i17, iB);
                                i17 += 2;
                                c6539e.n(i21, c6539e.b(i19 + 1));
                            } else {
                                i17 += 2;
                            }
                            i18++;
                            function22 = function2;
                            iB0 = i20;
                        }
                        i12 = iB0;
                        if (i17 != i15) {
                            c6539e.m(i17, i15);
                        }
                    }
                    if (i13 == i10 || iC0 == iC02) {
                        break;
                    }
                    i13 = iC0;
                    iB0 = i12;
                    i11 = 0;
                    iC0 = C0(iC0);
                    function22 = function2;
                }
            } else {
                i12 = iB0;
            }
            function22 = function2;
            iC0 = iC02;
            i13 = i14;
            iB0 = i12;
            defaultConstructorMarker = null;
        }
    }

    public final Object W0(C2392b c2392b, int i10) {
        return V0(C(c2392b), i10);
    }

    public final boolean Y() {
        return this.f22154w;
    }

    public final int Y0(int i10, int i11) {
        int iX0 = X0(this.f22133b, e0(i10));
        int i12 = iX0 + i11;
        if (!(i12 >= iX0 && i12 < O(this.f22133b, e0(i10 + 1)))) {
            AbstractC2454w.t("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int Z() {
        return this.f22151t;
    }

    public final int Z0(int i10) {
        return O(this.f22133b, e0(i10 + 1));
    }

    public final int a0() {
        return this.f22153v;
    }

    public final int a1(int i10) {
        return X0(this.f22133b, e0(i10));
    }

    public final int b0() {
        return X() - this.f22139h;
    }

    public final AbstractC2411h0 b1(int i10) {
        C2392b c2392bI1;
        HashMap map = this.f22136e;
        if (map == null || (c2392bI1 = i1(i10)) == null) {
            return null;
        }
        return (AbstractC2411h0) map.get(c2392bI1);
    }

    public final E1 c0() {
        return this.f22132a;
    }

    public final void c1(int i10, Object obj, Object obj2) {
        f1(i10, obj, false, obj2);
    }

    public final Object d0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f22133b;
        return (iArr[(iE0 * 5) + 1] & 268435456) != 0 ? this.f22134c[E(iArr, iE0)] : InterfaceC2425m.f22370a.a();
    }

    public final void d1() {
        if (!(this.f22145n == 0)) {
            AbstractC2454w.t("Key must be supplied when inserting");
        }
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        f1(0, aVar.a(), false, aVar.a());
    }

    public final void e1(int i10, Object obj) {
        f1(i10, obj, false, InterfaceC2425m.f22370a.a());
    }

    public final int f0(int i10) {
        return this.f22133b[e0(i10) * 5];
    }

    public final Object g0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f22133b;
        if ((iArr[(iE0 * 5) + 1] & 536870912) != 0) {
            return this.f22134c[G1.r(iArr, iE0)];
        }
        return null;
    }

    public final void g1(int i10, Object obj) {
        f1(i10, obj, true, InterfaceC2425m.f22370a.a());
    }

    public final int h0(int i10) {
        return G1.o(this.f22133b, e0(i10));
    }

    public final void h1(int i10) {
        if (!(i10 > 0)) {
            AbstractC2454w.t("Check failed");
        }
        int i11 = this.f22153v;
        int iX0 = X0(this.f22133b, e0(i11));
        int iO = O(this.f22133b, e0(i11 + 1)) - i10;
        if (!(iO >= iX0)) {
            AbstractC2454w.t("Check failed");
        }
        L0(iO, i10, i11);
        int i12 = this.f22140i;
        if (i12 >= iX0) {
            this.f22140i = i12 - i10;
        }
    }

    public final int i0(int i10) {
        C6546L c6546l;
        int iA1 = this.f22140i - a1(i10);
        C6540F c6540f = this.f22150s;
        return iA1 + ((c6540f == null || (c6546l = (C6546L) c6540f.c(i10)) == null) ? 0 : c6546l.d());
    }

    public final C2392b i1(int i10) {
        if (i10 < 0 || i10 >= b0()) {
            return null;
        }
        return G1.n(this.f22135d, i10, b0());
    }

    public final boolean j0(int i10) {
        return k0(i10, this.f22151t);
    }

    public final Object j1(Object obj) {
        if (this.f22145n <= 0 || this.f22140i == this.f22142k) {
            return G0(obj);
        }
        C6540F c6540f = this.f22150s;
        if (c6540f == null) {
            c6540f = new C6540F(0, 1, null);
        }
        this.f22150s = c6540f;
        int i10 = this.f22153v;
        Object objC = c6540f.c(i10);
        if (objC == null) {
            objC = new C6546L(0, 1, null);
            c6540f.s(i10, objC);
        }
        ((C6546L) objC).k(obj);
        return InterfaceC2425m.f22370a.a();
    }

    public final boolean k0(int i10, int i11) {
        int iB;
        int iX;
        if (i11 == this.f22153v) {
            iX = this.f22152u;
        } else if (i11 <= this.f22147p.f(0) && (iB = this.f22147p.b(i11)) >= 0) {
            iX = (X() - this.f22139h) - this.f22148q.d(iB);
        } else {
            int iH0 = h0(i11);
            iX = iH0 + i11;
        }
        return i10 > i11 && i10 < iX;
    }

    public final boolean l0(int i10) {
        int i11 = this.f22153v;
        if (i10 <= i11 || i10 >= this.f22152u) {
            return i11 == 0 && i10 == 0;
        }
        return true;
    }

    public final void l1(Object obj) {
        int iE0 = e0(this.f22151t);
        if (!((this.f22133b[(iE0 * 5) + 1] & 268435456) != 0)) {
            AbstractC2454w.t("Updating the data of a group that was not created with a data slot");
        }
        this.f22134c[P(E(this.f22133b, iE0))] = obj;
    }

    public final boolean o0() {
        int i10 = this.f22151t;
        return i10 < this.f22152u && (this.f22133b[(e0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean p0(int i10) {
        return (this.f22133b[(e0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void p1(C2392b c2392b, Object obj) {
        r1(c2392b.e(this), obj);
    }

    public final void q0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f22133b;
        int i11 = (iE0 * 5) + 1;
        if ((iArr[i11] & 134217728) != 0) {
            return;
        }
        G1.x(iArr, iE0, true);
        if ((this.f22133b[i11] & 67108864) != 0) {
            return;
        }
        m1(C0(i10));
    }

    public final void q1(Object obj) {
        r1(this.f22151t, obj);
    }

    public final void s1() {
        this.f22136e = this.f22132a.y();
        this.f22137f = this.f22132a.r();
    }

    public final List t0(E1 e12, int i10, boolean z10) {
        if (!(this.f22145n > 0)) {
            AbstractC2454w.t("Check failed");
        }
        if (i10 != 0 || this.f22151t != 0 || this.f22132a.u() != 0 || G1.o(e12.t(), i10) != e12.u()) {
            H1 h1G = e12.G();
            try {
                List listB = f22130y.b(h1G, i10, this, true, true, z10);
                h1G.J(true);
                return listB;
            } catch (Throwable th2) {
                h1G.J(false);
                throw th2;
            }
        }
        int[] iArr = this.f22133b;
        Object[] objArr = this.f22134c;
        ArrayList arrayList = this.f22135d;
        HashMap map = this.f22136e;
        C6540F c6540f = this.f22137f;
        int[] iArrT = e12.t();
        int iU = e12.u();
        Object[] objArrV = e12.v();
        int iW = e12.w();
        HashMap mapY = e12.y();
        C6540F c6540fR = e12.r();
        this.f22133b = iArrT;
        this.f22134c = objArrV;
        this.f22135d = e12.p();
        this.f22138g = iU;
        this.f22139h = (iArrT.length / 5) - iU;
        this.f22142k = iW;
        this.f22143l = objArrV.length - iW;
        this.f22144m = iU;
        this.f22136e = mapY;
        this.f22137f = c6540fR;
        e12.K(iArr, 0, objArr, 0, arrayList, map, c6540f);
        return this.f22135d;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f22151t + " end=" + this.f22152u + " size = " + b0() + " gap=" + this.f22138g + '-' + (this.f22138g + this.f22139h) + ')';
    }

    public final void u0(int i10) {
        boolean z10 = true;
        if (!(this.f22145n == 0)) {
            AbstractC2454w.t("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            AbstractC2454w.t("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f22151t;
        int i12 = this.f22153v;
        int i13 = this.f22152u;
        int iO = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iO += G1.o(this.f22133b, e0(iO));
            if (!(iO <= i13)) {
                AbstractC2454w.t("Parameter offset is out of bounds");
            }
        }
        int iO2 = G1.o(this.f22133b, e0(iO));
        int iO3 = O(this.f22133b, e0(this.f22151t));
        int iO4 = O(this.f22133b, e0(iO));
        int i15 = iO + iO2;
        int iO5 = O(this.f22133b, e0(i15));
        int i16 = iO5 - iO4;
        n0(i16, Math.max(this.f22151t - 1, 0));
        m0(iO2);
        int[] iArr = this.f22133b;
        int iE0 = e0(i15) * 5;
        AbstractC2273n.k(iArr, iArr, e0(i11) * 5, iE0, (iO2 * 5) + iE0);
        if (i16 > 0) {
            Object[] objArr = this.f22134c;
            int iP = P(iO4 + i16);
            System.arraycopy(objArr, iP, objArr, iO3, P(iO5 + i16) - iP);
        }
        int i17 = iO4 + i16;
        int i18 = i17 - iO3;
        int i19 = this.f22142k;
        int i20 = this.f22143l;
        int length = this.f22134c.length;
        int i21 = this.f22144m;
        int i22 = i11 + iO2;
        int i23 = i11;
        while (i23 < i22) {
            boolean z11 = z10;
            int iE02 = e0(i23);
            int i24 = i23;
            int i25 = i18;
            o1(iArr, iE02, Q(O(iArr, iE02) - i18, i21 < iE02 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z10 = z11;
            i18 = i25;
        }
        s0(i15, i11, iO2);
        if (K0(i15, iO2)) {
            AbstractC2454w.t("Unexpectedly removed anchors");
        }
        V(i12, this.f22152u, i11);
        if (i16 > 0) {
            L0(i17, i16, i15 - 1);
        }
    }

    public final List w0(int i10, E1 e12, int i11) {
        if (!(this.f22145n <= 0 && h0(this.f22151t + i10) == 1)) {
            AbstractC2454w.t("Check failed");
        }
        int i12 = this.f22151t;
        int i13 = this.f22140i;
        int i14 = this.f22141j;
        A(i10);
        d1();
        F();
        H1 h1G = e12.G();
        try {
            List listC = a.c(f22130y, h1G, i11, this, false, true, false, 32, null);
            h1G.J(true);
            S();
            R();
            this.f22151t = i12;
            this.f22140i = i13;
            this.f22141j = i14;
            return listC;
        } catch (Throwable th2) {
            h1G.J(false);
            throw th2;
        }
    }

    public final Object y0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f22133b;
        if ((iArr[(iE0 * 5) + 1] & 1073741824) != 0) {
            return this.f22134c[P(B0(iArr, iE0))];
        }
        return null;
    }

    public final Object z0(C2392b c2392b) {
        return y0(c2392b.e(this));
    }
}
