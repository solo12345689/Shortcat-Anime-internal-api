package t1;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m1.C5625d;
import t1.C6592e;
import u1.C6718b;

/* JADX INFO: renamed from: t1.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6593f extends AbstractC6600m {

    /* JADX INFO: renamed from: M0 */
    C6718b f60411M0;

    /* JADX INFO: renamed from: N0 */
    public u1.e f60412N0;

    /* JADX INFO: renamed from: O0 */
    private int f60413O0;

    /* JADX INFO: renamed from: P0 */
    protected C6718b.InterfaceC0913b f60414P0;

    /* JADX INFO: renamed from: Q0 */
    private boolean f60415Q0;

    /* JADX INFO: renamed from: R0 */
    protected C5625d f60416R0;

    /* JADX INFO: renamed from: S0 */
    int f60417S0;

    /* JADX INFO: renamed from: T0 */
    int f60418T0;

    /* JADX INFO: renamed from: U0 */
    int f60419U0;

    /* JADX INFO: renamed from: V0 */
    int f60420V0;

    /* JADX INFO: renamed from: W0 */
    public int f60421W0;

    /* JADX INFO: renamed from: X0 */
    public int f60422X0;

    /* JADX INFO: renamed from: Y0 */
    C6590c[] f60423Y0;

    /* JADX INFO: renamed from: Z0 */
    C6590c[] f60424Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f60425a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f60426b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f60427c1;

    /* JADX INFO: renamed from: d1 */
    public int f60428d1;

    /* JADX INFO: renamed from: e1 */
    public int f60429e1;

    /* JADX INFO: renamed from: f1 */
    private int f60430f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f60431g1;

    /* JADX INFO: renamed from: h1 */
    private boolean f60432h1;

    /* JADX INFO: renamed from: i1 */
    private boolean f60433i1;

    /* JADX INFO: renamed from: j1 */
    int f60434j1;

    /* JADX INFO: renamed from: k1 */
    private WeakReference f60435k1;

    /* JADX INFO: renamed from: l1 */
    private WeakReference f60436l1;

    /* JADX INFO: renamed from: m1 */
    private WeakReference f60437m1;

    /* JADX INFO: renamed from: n1 */
    private WeakReference f60438n1;

    /* JADX INFO: renamed from: o1 */
    HashSet f60439o1;

    /* JADX INFO: renamed from: p1 */
    public C6718b.a f60440p1;

    public C6593f() {
        this.f60411M0 = new C6718b(this);
        this.f60412N0 = new u1.e(this);
        this.f60414P0 = null;
        this.f60415Q0 = false;
        this.f60416R0 = new C5625d();
        this.f60421W0 = 0;
        this.f60422X0 = 0;
        this.f60423Y0 = new C6590c[4];
        this.f60424Z0 = new C6590c[4];
        this.f60425a1 = false;
        this.f60426b1 = false;
        this.f60427c1 = false;
        this.f60428d1 = 0;
        this.f60429e1 = 0;
        this.f60430f1 = 257;
        this.f60431g1 = false;
        this.f60432h1 = false;
        this.f60433i1 = false;
        this.f60434j1 = 0;
        this.f60435k1 = null;
        this.f60436l1 = null;
        this.f60437m1 = null;
        this.f60438n1 = null;
        this.f60439o1 = new HashSet();
        this.f60440p1 = new C6718b.a();
    }

    public static boolean P1(int i10, C6592e c6592e, C6718b.InterfaceC0913b interfaceC0913b, C6718b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0913b == null) {
            return false;
        }
        if (c6592e.U() == 8 || (c6592e instanceof C6595h) || (c6592e instanceof C6588a)) {
            aVar.f61133e = 0;
            aVar.f61134f = 0;
            return false;
        }
        aVar.f61129a = c6592e.A();
        aVar.f61130b = c6592e.S();
        aVar.f61131c = c6592e.V();
        aVar.f61132d = c6592e.x();
        aVar.f61137i = false;
        aVar.f61138j = i11;
        C6592e.b bVar = aVar.f61129a;
        C6592e.b bVar2 = C6592e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f61130b == bVar2;
        boolean z12 = z10 && c6592e.f60360d0 > 0.0f;
        boolean z13 = z11 && c6592e.f60360d0 > 0.0f;
        if (z10 && c6592e.Z(0) && c6592e.f60397w == 0 && !z12) {
            aVar.f61129a = C6592e.b.WRAP_CONTENT;
            if (z11 && c6592e.f60399x == 0) {
                aVar.f61129a = C6592e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && c6592e.Z(1) && c6592e.f60399x == 0 && !z13) {
            aVar.f61130b = C6592e.b.WRAP_CONTENT;
            if (z10 && c6592e.f60397w == 0) {
                aVar.f61130b = C6592e.b.FIXED;
            }
            z11 = false;
        }
        if (c6592e.m0()) {
            aVar.f61129a = C6592e.b.FIXED;
            z10 = false;
        }
        if (c6592e.n0()) {
            aVar.f61130b = C6592e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (c6592e.f60401y[0] == 4) {
                aVar.f61129a = C6592e.b.FIXED;
            } else if (!z11) {
                C6592e.b bVar3 = aVar.f61130b;
                C6592e.b bVar4 = C6592e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f61132d;
                } else {
                    aVar.f61129a = C6592e.b.WRAP_CONTENT;
                    interfaceC0913b.b(c6592e, aVar);
                    i13 = aVar.f61134f;
                }
                aVar.f61129a = bVar4;
                aVar.f61131c = (int) (c6592e.v() * i13);
            }
        }
        if (z13) {
            if (c6592e.f60401y[1] == 4) {
                aVar.f61130b = C6592e.b.FIXED;
            } else if (!z10) {
                C6592e.b bVar5 = aVar.f61129a;
                C6592e.b bVar6 = C6592e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f61131c;
                } else {
                    aVar.f61130b = C6592e.b.WRAP_CONTENT;
                    interfaceC0913b.b(c6592e, aVar);
                    i12 = aVar.f61133e;
                }
                aVar.f61130b = bVar6;
                if (c6592e.w() == -1) {
                    aVar.f61132d = (int) (i12 / c6592e.v());
                } else {
                    aVar.f61132d = (int) (c6592e.v() * i12);
                }
            }
        }
        interfaceC0913b.b(c6592e, aVar);
        c6592e.g1(aVar.f61133e);
        c6592e.H0(aVar.f61134f);
        c6592e.G0(aVar.f61136h);
        c6592e.w0(aVar.f61135g);
        aVar.f61138j = C6718b.a.f61126k;
        return aVar.f61137i;
    }

    private void R1() {
        this.f60421W0 = 0;
        this.f60422X0 = 0;
    }

    private void u1(C6592e c6592e) {
        int i10 = this.f60421W0 + 1;
        C6590c[] c6590cArr = this.f60424Z0;
        if (i10 >= c6590cArr.length) {
            this.f60424Z0 = (C6590c[]) Arrays.copyOf(c6590cArr, c6590cArr.length * 2);
        }
        this.f60424Z0[this.f60421W0] = new C6590c(c6592e, 0, M1());
        this.f60421W0++;
    }

    private void x1(C6591d c6591d, m1.i iVar) {
        this.f60416R0.h(iVar, this.f60416R0.q(c6591d), 0, 5);
    }

    private void y1(C6591d c6591d, m1.i iVar) {
        this.f60416R0.h(this.f60416R0.q(c6591d), iVar, 0, 5);
    }

    private void z1(C6592e c6592e) {
        int i10 = this.f60422X0 + 1;
        C6590c[] c6590cArr = this.f60423Y0;
        if (i10 >= c6590cArr.length) {
            this.f60423Y0 = (C6590c[]) Arrays.copyOf(c6590cArr, c6590cArr.length * 2);
        }
        this.f60423Y0[this.f60422X0] = new C6590c(c6592e, 1, M1());
        this.f60422X0++;
    }

    void A1(C6591d c6591d) {
        WeakReference weakReference = this.f60437m1;
        if (weakReference == null || weakReference.get() == null || c6591d.e() > ((C6591d) this.f60437m1.get()).e()) {
            this.f60437m1 = new WeakReference(c6591d);
        }
    }

    void B1(C6591d c6591d) {
        WeakReference weakReference = this.f60435k1;
        if (weakReference == null || weakReference.get() == null || c6591d.e() > ((C6591d) this.f60435k1.get()).e()) {
            this.f60435k1 = new WeakReference(c6591d);
        }
    }

    public boolean C1(boolean z10) {
        return this.f60412N0.f(z10);
    }

    public boolean D1(boolean z10) {
        return this.f60412N0.g(z10);
    }

    public boolean E1(boolean z10, int i10) {
        return this.f60412N0.h(z10, i10);
    }

    public C6718b.InterfaceC0913b F1() {
        return this.f60414P0;
    }

    public int G1() {
        return this.f60430f1;
    }

    public C5625d H1() {
        return this.f60416R0;
    }

    public boolean I1() {
        return false;
    }

    public void J1() {
        this.f60412N0.j();
    }

    public void K1() {
        this.f60412N0.k();
    }

    public boolean L1() {
        return this.f60433i1;
    }

    public boolean M1() {
        return this.f60415Q0;
    }

    public boolean N1() {
        return this.f60432h1;
    }

    public long O1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f60417S0 = i17;
        this.f60418T0 = i18;
        return this.f60411M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean Q1(int i10) {
        return (this.f60430f1 & i10) == i10;
    }

    public void S1(C6718b.InterfaceC0913b interfaceC0913b) {
        this.f60414P0 = interfaceC0913b;
        this.f60412N0.n(interfaceC0913b);
    }

    public void T1(int i10) {
        this.f60430f1 = i10;
        C5625d.f52972s = Q1(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    public void U1(int i10) {
        this.f60413O0 = i10;
    }

    public void V1(boolean z10) {
        this.f60415Q0 = z10;
    }

    public boolean W1(C5625d c5625d, boolean[] zArr) {
        zArr[2] = false;
        boolean zQ1 = Q1(64);
        m1(c5625d, zQ1);
        int size = this.f60509L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C6592e c6592e = (C6592e) this.f60509L0.get(i10);
            c6592e.m1(c5625d, zQ1);
            if (c6592e.b0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void X1() {
        this.f60411M0.e(this);
    }

    @Override // t1.C6592e
    public void l1(boolean z10, boolean z11) {
        super.l1(z10, z11);
        int size = this.f60509L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C6592e) this.f60509L0.get(i10)).l1(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0329 A[PHI: r13 r19
  0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:350:0x02e5, B:359:0x030e, B:360:0x0310, B:362:0x0316] A[DONT_GENERATE, DONT_INLINE]
  0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:350:0x02e5, B:359:0x030e, B:360:0x0310, B:362:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0330  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // t1.AbstractC6600m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p1() {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C6593f.p1():void");
    }

    @Override // t1.AbstractC6600m, t1.C6592e
    public void s0() {
        this.f60416R0.D();
        this.f60417S0 = 0;
        this.f60419U0 = 0;
        this.f60418T0 = 0;
        this.f60420V0 = 0;
        this.f60431g1 = false;
        super.s0();
    }

    void s1(C6592e c6592e, int i10) {
        if (i10 == 0) {
            u1(c6592e);
        } else if (i10 == 1) {
            z1(c6592e);
        }
    }

    public boolean t1(C5625d c5625d) {
        C6593f c6593f;
        C5625d c5625d2;
        boolean zQ1 = Q1(64);
        g(c5625d, zQ1);
        int size = this.f60509L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C6592e c6592e = (C6592e) this.f60509L0.get(i10);
            c6592e.O0(0, false);
            c6592e.O0(1, false);
            if (c6592e instanceof C6588a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C6592e c6592e2 = (C6592e) this.f60509L0.get(i11);
                if (c6592e2 instanceof C6588a) {
                    ((C6588a) c6592e2).u1();
                }
            }
        }
        this.f60439o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            C6592e c6592e3 = (C6592e) this.f60509L0.get(i12);
            if (c6592e3.f()) {
                if (c6592e3 instanceof AbstractC6599l) {
                    this.f60439o1.add(c6592e3);
                } else {
                    c6592e3.g(c5625d, zQ1);
                }
            }
        }
        while (this.f60439o1.size() > 0) {
            int size2 = this.f60439o1.size();
            Iterator it = this.f60439o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC6599l abstractC6599l = (AbstractC6599l) ((C6592e) it.next());
                if (abstractC6599l.r1(this.f60439o1)) {
                    abstractC6599l.g(c5625d, zQ1);
                    this.f60439o1.remove(abstractC6599l);
                    break;
                }
            }
            if (size2 == this.f60439o1.size()) {
                Iterator it2 = this.f60439o1.iterator();
                while (it2.hasNext()) {
                    ((C6592e) it2.next()).g(c5625d, zQ1);
                }
                this.f60439o1.clear();
            }
        }
        if (C5625d.f52972s) {
            HashSet<C6592e> hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                C6592e c6592e4 = (C6592e) this.f60509L0.get(i13);
                if (!c6592e4.f()) {
                    hashSet.add(c6592e4);
                }
            }
            c6593f = this;
            c5625d2 = c5625d;
            c6593f.e(this, c5625d2, hashSet, A() == C6592e.b.WRAP_CONTENT ? 0 : 1, false);
            for (C6592e c6592e5 : hashSet) {
                AbstractC6598k.a(this, c5625d2, c6592e5);
                c6592e5.g(c5625d2, zQ1);
            }
        } else {
            c6593f = this;
            c5625d2 = c5625d;
            for (int i14 = 0; i14 < size; i14++) {
                C6592e c6592e6 = (C6592e) c6593f.f60509L0.get(i14);
                if (c6592e6 instanceof C6593f) {
                    C6592e.b[] bVarArr = c6592e6.f60352Z;
                    C6592e.b bVar = bVarArr[0];
                    C6592e.b bVar2 = bVarArr[1];
                    C6592e.b bVar3 = C6592e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c6592e6.L0(C6592e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c6592e6.c1(C6592e.b.FIXED);
                    }
                    c6592e6.g(c5625d2, zQ1);
                    if (bVar == bVar3) {
                        c6592e6.L0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c6592e6.c1(bVar2);
                    }
                } else {
                    AbstractC6598k.a(this, c5625d2, c6592e6);
                    if (!c6592e6.f()) {
                        c6592e6.g(c5625d2, zQ1);
                    }
                }
            }
        }
        if (c6593f.f60421W0 > 0) {
            AbstractC6589b.b(this, c5625d2, null, 0);
        }
        if (c6593f.f60422X0 > 0) {
            AbstractC6589b.b(this, c5625d2, null, 1);
        }
        return true;
    }

    public void v1(C6591d c6591d) {
        WeakReference weakReference = this.f60438n1;
        if (weakReference == null || weakReference.get() == null || c6591d.e() > ((C6591d) this.f60438n1.get()).e()) {
            this.f60438n1 = new WeakReference(c6591d);
        }
    }

    public void w1(C6591d c6591d) {
        WeakReference weakReference = this.f60436l1;
        if (weakReference == null || weakReference.get() == null || c6591d.e() > ((C6591d) this.f60436l1.get()).e()) {
            this.f60436l1 = new WeakReference(c6591d);
        }
    }

    public C6593f(int i10, int i11) {
        super(i10, i11);
        this.f60411M0 = new C6718b(this);
        this.f60412N0 = new u1.e(this);
        this.f60414P0 = null;
        this.f60415Q0 = false;
        this.f60416R0 = new C5625d();
        this.f60421W0 = 0;
        this.f60422X0 = 0;
        this.f60423Y0 = new C6590c[4];
        this.f60424Z0 = new C6590c[4];
        this.f60425a1 = false;
        this.f60426b1 = false;
        this.f60427c1 = false;
        this.f60428d1 = 0;
        this.f60429e1 = 0;
        this.f60430f1 = 257;
        this.f60431g1 = false;
        this.f60432h1 = false;
        this.f60433i1 = false;
        this.f60434j1 = 0;
        this.f60435k1 = null;
        this.f60436l1 = null;
        this.f60437m1 = null;
        this.f60438n1 = null;
        this.f60439o1 = new HashSet();
        this.f60440p1 = new C6718b.a();
    }
}
