package i0;

import Td.C2160k;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.V0;
import i0.AbstractC4994m;
import j0.AbstractC5325b;
import j0.C5324a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.f0;

/* JADX INFO: renamed from: i0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C4985d extends AbstractC4993l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f48474p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48475q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f48476r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f48477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function1 f48478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t.Q f48480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f48481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4997p f48482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f48483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f48484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48485o;

    /* JADX INFO: renamed from: i0.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4985d(long j10, C4997p c4997p, Function1 function1, Function1 function12) {
        super(j10, c4997p, null);
        this.f48477g = function1;
        this.f48478h = function12;
        this.f48482l = C4997p.f48509e.a();
        this.f48483m = f48476r;
        this.f48484n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A() {
        /*
            r17 = this;
            r0 = r17
            t.Q r1 = r0.E()
            if (r1 == 0) goto L7f
            r0.S()
            r2 = 0
            r0.Q(r2)
            long r2 = r0.i()
            java.lang.Object[] r4 = r1.f60055b
            long[] r1 = r1.f60054a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7f
            r6 = 0
            r7 = r6
        L1e:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L38:
            if (r12 >= r10) goto L78
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L74
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            i0.U r13 = (i0.InterfaceC4976U) r13
            i0.W r13 = r13.l()
        L4e:
            if (r13 == 0) goto L74
            long r14 = r13.f()
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L68
            i0.p r14 = r0.f48482l
            long r15 = r13.f()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = Ud.AbstractC2279u.e0(r14, r15)
            if (r14 == 0) goto L6f
        L68:
            long r14 = i0.AbstractC5003v.m()
            r13.h(r14)
        L6f:
            i0.W r13 = r13.e()
            goto L4e
        L74:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L38
        L78:
            if (r10 != r11) goto L7f
        L7a:
            if (r7 == r5) goto L7f
            int r7 = r7 + 1
            goto L1e
        L7f:
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C4985d.A():void");
    }

    private final void O() {
        int length = this.f48483m.length;
        for (int i10 = 0; i10 < length; i10++) {
            AbstractC5003v.f0(this.f48483m[i10]);
        }
    }

    private final void S() {
        if (this.f48485o) {
            V0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void T() {
        if (!this.f48485o || ((AbstractC4993l) this).f48500d >= 0) {
            return;
        }
        V0.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        long j10;
        K(i());
        Td.L l10 = Td.L.f17438a;
        if (D() || e()) {
            return;
        }
        long jI = i();
        synchronized (AbstractC5003v.O()) {
            long j11 = AbstractC5003v.f48531f;
            j10 = 1;
            AbstractC5003v.f48531f += j10;
            v(j11);
            AbstractC5003v.f48530e = AbstractC5003v.f48530e.u(i());
        }
        u(AbstractC5003v.E(f(), jI + j10, i()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0.AbstractC4994m C() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C4985d.C():i0.m");
    }

    public final boolean D() {
        return this.f48485o;
    }

    public t.Q E() {
        return this.f48480j;
    }

    public final C4997p F() {
        return this.f48482l;
    }

    public final int[] G() {
        return this.f48483m;
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Function1 g() {
        return this.f48477g;
    }

    public boolean I() {
        t.Q qE = E();
        return qE != null && qE.e();
    }

    public final AbstractC4994m J(long j10, t.Q q10, Map map, C4997p c4997p) {
        C4997p c4997p2;
        Object[] objArr;
        long[] jArr;
        C4997p c4997p3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j11;
        int i11;
        AbstractC4978W abstractC4978WI;
        C4997p c4997pT = f().u(i()).t(this.f48482l);
        Object[] objArr3 = q10.f60055b;
        long[] jArr3 = q10.f60054a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List listI0 = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j12 = jArr3[i12];
                List arrayList2 = listI0;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            i10 = i13;
                            InterfaceC4976U interfaceC4976U = (InterfaceC4976U) objArr3[(i12 << 3) + i15];
                            objArr2 = objArr3;
                            AbstractC4978W abstractC4978WL = interfaceC4976U.l();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            AbstractC4978W abstractC4978WD0 = AbstractC5003v.d0(abstractC4978WL, j10, c4997p);
                            if (abstractC4978WD0 == null) {
                                j11 = j12;
                            } else {
                                j11 = j12;
                                AbstractC4978W abstractC4978WD02 = AbstractC5003v.d0(abstractC4978WL, i(), c4997pT);
                                if (abstractC4978WD02 != null && abstractC4978WD02.f() != AbstractC4998q.c(1) && !AbstractC5504s.c(abstractC4978WD0, abstractC4978WD02)) {
                                    i11 = i15;
                                    c4997p3 = c4997pT;
                                    AbstractC4978W abstractC4978WD03 = AbstractC5003v.d0(abstractC4978WL, i(), f());
                                    if (abstractC4978WD03 == null) {
                                        AbstractC5003v.c0();
                                        throw new C2160k();
                                    }
                                    if (map == null || (abstractC4978WI = (AbstractC4978W) map.get(abstractC4978WD0)) == null) {
                                        abstractC4978WI = interfaceC4976U.i(abstractC4978WD02, abstractC4978WD0, abstractC4978WD03);
                                    }
                                    if (abstractC4978WI == null) {
                                        return new AbstractC4994m.a(this);
                                    }
                                    if (!AbstractC5504s.c(abstractC4978WI, abstractC4978WD03)) {
                                        if (AbstractC5504s.c(abstractC4978WI, abstractC4978WD0)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(Td.z.a(interfaceC4976U, abstractC4978WD0.d(i())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            List list = arrayList2;
                                            list.add(interfaceC4976U);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!AbstractC5504s.c(abstractC4978WI, abstractC4978WD02) ? Td.z.a(interfaceC4976U, abstractC4978WI) : Td.z.a(interfaceC4976U, abstractC4978WD02.d(i())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            c4997p3 = c4997pT;
                            i11 = i15;
                            arrayList = arrayList3;
                        } else {
                            c4997p3 = c4997pT;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j11 = j12;
                            i11 = i15;
                        }
                        j12 = j11 >> i10;
                        i15 = i11 + 1;
                        objArr3 = objArr2;
                        i13 = i10;
                        jArr3 = jArr2;
                        c4997pT = c4997p3;
                    }
                    c4997p2 = c4997pT;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i14 != i13) {
                        listI0 = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    c4997p2 = c4997pT;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listI0 = arrayList2;
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                c4997pT = c4997p2;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Pair pair = (Pair) arrayList.get(i16);
                InterfaceC4976U interfaceC4976U2 = (InterfaceC4976U) pair.getFirst();
                AbstractC4978W abstractC4978W = (AbstractC4978W) pair.getSecond();
                abstractC4978W.h(j10);
                synchronized (AbstractC5003v.O()) {
                    abstractC4978W.g(interfaceC4976U2.l());
                    interfaceC4976U2.r(abstractC4978W);
                    Td.L l10 = Td.L.f17438a;
                }
            }
        }
        if (listI0 != null) {
            int size2 = listI0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                q10.y((InterfaceC4976U) listI0.get(i17));
            }
            List list2 = this.f48481k;
            if (list2 != null) {
                listI0 = AbstractC2279u.I0(list2, listI0);
            }
            this.f48481k = listI0;
        }
        return AbstractC4994m.b.f48502a;
    }

    public final void K(long j10) {
        synchronized (AbstractC5003v.O()) {
            this.f48482l = this.f48482l.u(j10);
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final void L(C4997p c4997p) {
        synchronized (AbstractC5003v.O()) {
            this.f48482l = this.f48482l.t(c4997p);
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final void M(int i10) {
        if (i10 >= 0) {
            this.f48483m = AbstractC2273n.B(this.f48483m, i10);
        }
    }

    public final void N(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f48483m;
        if (iArr2.length != 0) {
            iArr = AbstractC2273n.C(iArr2, iArr);
        }
        this.f48483m = iArr;
    }

    public final void P(boolean z10) {
        this.f48485o = z10;
    }

    public void Q(t.Q q10) {
        this.f48480j = q10;
    }

    public C4985d R(Function1 function1, Function1 function12) {
        Map map;
        long j10;
        C4986e c4986e;
        z();
        T();
        b0.e eVar = AbstractC5325b.f51587a;
        Function1 function13 = function1;
        Function1 function1B = function12;
        if (eVar != null) {
            Pair pairE = AbstractC5325b.e(eVar, this, false, function13, function1B);
            C5324a c5324a = (C5324a) pairE.c();
            Function1 function1A = c5324a.a();
            function1B = c5324a.b();
            map = (Map) pairE.d();
            function13 = function1A;
        } else {
            map = null;
        }
        K(i());
        synchronized (AbstractC5003v.O()) {
            long j11 = AbstractC5003v.f48531f;
            j10 = 1;
            AbstractC5003v.f48531f += j10;
            AbstractC5003v.f48530e = AbstractC5003v.f48530e.u(j11);
            C4997p c4997pF = f();
            u(c4997pF.u(j11));
            c4986e = new C4986e(j11, AbstractC5003v.E(c4997pF, i() + j10, j11), AbstractC5003v.Q(function13, g(), false, 4, null), AbstractC5003v.S(function1B, k()), this);
        }
        if (!D() && !e()) {
            long jI = i();
            synchronized (AbstractC5003v.O()) {
                long j12 = AbstractC5003v.f48531f;
                AbstractC5003v.f48531f += j10;
                v(j12);
                AbstractC5003v.f48530e = AbstractC5003v.f48530e.u(i());
                Td.L l10 = Td.L.f17438a;
            }
            u(AbstractC5003v.E(f(), jI + j10, i()));
        }
        if (eVar != null) {
            AbstractC5325b.b(eVar, this, c4986e, map);
        }
        return c4986e;
    }

    @Override // i0.AbstractC4993l
    public void c() {
        AbstractC5003v.f48530e = AbstractC5003v.f48530e.n(i()).l(this.f48482l);
    }

    @Override // i0.AbstractC4993l
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
        AbstractC5325b.d(this);
    }

    @Override // i0.AbstractC4993l
    public boolean h() {
        return false;
    }

    @Override // i0.AbstractC4993l
    public int j() {
        return this.f48479i;
    }

    @Override // i0.AbstractC4993l
    public Function1 k() {
        return this.f48478h;
    }

    @Override // i0.AbstractC4993l
    public void m(AbstractC4993l abstractC4993l) {
        this.f48484n++;
    }

    @Override // i0.AbstractC4993l
    public void n(AbstractC4993l abstractC4993l) {
        if (!(this.f48484n > 0)) {
            V0.a("no pending nested snapshots");
        }
        int i10 = this.f48484n - 1;
        this.f48484n = i10;
        if (i10 != 0 || this.f48485o) {
            return;
        }
        A();
    }

    @Override // i0.AbstractC4993l
    public void o() {
        if (this.f48485o || e()) {
            return;
        }
        B();
    }

    @Override // i0.AbstractC4993l
    public void p(InterfaceC4976U interfaceC4976U) {
        t.Q qE = E();
        if (qE == null) {
            qE = f0.b();
            Q(qE);
        }
        qE.h(interfaceC4976U);
    }

    @Override // i0.AbstractC4993l
    public void r() {
        O();
        super.r();
    }

    @Override // i0.AbstractC4993l
    public void w(int i10) {
        this.f48479i = i10;
    }

    @Override // i0.AbstractC4993l
    public AbstractC4993l x(Function1 function1) {
        Map map;
        long j10;
        C4987f c4987f;
        z();
        T();
        long jI = i();
        C4985d c4985d = this instanceof C4983b ? null : this;
        b0.e eVar = AbstractC5325b.f51587a;
        Function1 function12 = function1;
        if (eVar != null) {
            Pair pairE = AbstractC5325b.e(eVar, c4985d, true, function12, null);
            C5324a c5324a = (C5324a) pairE.c();
            Function1 function1A = c5324a.a();
            c5324a.b();
            map = (Map) pairE.d();
            function12 = function1A;
        } else {
            map = null;
        }
        K(i());
        synchronized (AbstractC5003v.O()) {
            long j11 = AbstractC5003v.f48531f;
            j10 = 1;
            AbstractC5003v.f48531f += j10;
            AbstractC5003v.f48530e = AbstractC5003v.f48530e.u(j11);
            c4987f = new C4987f(j11, AbstractC5003v.E(f(), jI + j10, j11), AbstractC5003v.Q(function12, g(), false, 4, null), this);
        }
        if (!D() && !e()) {
            long jI2 = i();
            synchronized (AbstractC5003v.O()) {
                long j12 = AbstractC5003v.f48531f;
                AbstractC5003v.f48531f += j10;
                v(j12);
                AbstractC5003v.f48530e = AbstractC5003v.f48530e.u(i());
                Td.L l10 = Td.L.f17438a;
            }
            u(AbstractC5003v.E(f(), jI2 + j10, i()));
        }
        if (eVar != null) {
            AbstractC5325b.b(eVar, c4985d, c4987f, map);
        }
        return c4987f;
    }
}
