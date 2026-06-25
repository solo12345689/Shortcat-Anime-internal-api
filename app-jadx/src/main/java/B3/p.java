package B3;

import B3.L;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import q2.C6097l;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6624k;
import t2.C6609I;
import t2.a0;
import u2.AbstractC6726h;
import u2.C6728j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1307d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1311h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private U2.O f1314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f1315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1316m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1318o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f1312i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f1308e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f1309f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f1310g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1317n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6609I f1319p = new C6609I();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U2.O f1320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f1322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray f1323d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray f1324e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C6728j f1325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f1326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1327h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f1328i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f1329j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f1330k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f1331l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f1332m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f1333n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f1334o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f1335p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f1336q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f1337r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f1338s;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f1339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f1340b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private AbstractC6726h.m f1341c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f1342d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f1343e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f1344f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f1345g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f1346h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f1347i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f1348j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f1349k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f1350l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f1351m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f1352n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f1353o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f1354p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f1339a) {
                    return false;
                }
                if (!aVar.f1339a) {
                    return true;
                }
                AbstractC6726h.m mVar = (AbstractC6726h.m) AbstractC6614a.i(this.f1341c);
                AbstractC6726h.m mVar2 = (AbstractC6726h.m) AbstractC6614a.i(aVar.f1341c);
                return (this.f1344f == aVar.f1344f && this.f1345g == aVar.f1345g && this.f1346h == aVar.f1346h && (!this.f1347i || !aVar.f1347i || this.f1348j == aVar.f1348j) && (((i10 = this.f1342d) == (i11 = aVar.f1342d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f61311n) != 0 || mVar2.f61311n != 0 || (this.f1351m == aVar.f1351m && this.f1352n == aVar.f1352n)) && ((i12 != 1 || mVar2.f61311n != 1 || (this.f1353o == aVar.f1353o && this.f1354p == aVar.f1354p)) && (z10 = this.f1349k) == aVar.f1349k && (!z10 || this.f1350l == aVar.f1350l))))) ? false : true;
            }

            public void b() {
                this.f1340b = false;
                this.f1339a = false;
            }

            public boolean d() {
                if (!this.f1340b) {
                    return false;
                }
                int i10 = this.f1343e;
                return i10 == 7 || i10 == 2;
            }

            public void e(AbstractC6726h.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f1341c = mVar;
                this.f1342d = i10;
                this.f1343e = i11;
                this.f1344f = i12;
                this.f1345g = i13;
                this.f1346h = z10;
                this.f1347i = z11;
                this.f1348j = z12;
                this.f1349k = z13;
                this.f1350l = i14;
                this.f1351m = i15;
                this.f1352n = i16;
                this.f1353o = i17;
                this.f1354p = i18;
                this.f1339a = true;
                this.f1340b = true;
            }

            public void f(int i10) {
                this.f1343e = i10;
                this.f1340b = true;
            }
        }

        public b(U2.O o10, boolean z10, boolean z11) {
            this.f1320a = o10;
            this.f1321b = z10;
            this.f1322c = z11;
            this.f1332m = new a();
            this.f1333n = new a();
            byte[] bArr = new byte[128];
            this.f1326g = bArr;
            this.f1325f = new C6728j(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void d(int i10) {
            long j10 = this.f1336q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f1329j;
                long j12 = this.f1335p;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f1320a.a(j10, this.f1337r ? 1 : 0, i11, i10, null);
            }
        }

        private void h() {
            boolean zD = this.f1321b ? this.f1333n.d() : this.f1338s;
            boolean z10 = this.f1337r;
            int i10 = this.f1328i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f1337r = z10 | z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B3.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f1328i == 9 || (this.f1322c && this.f1333n.c(this.f1332m))) {
                if (z10 && this.f1334o) {
                    d(i10 + ((int) (j10 - this.f1329j)));
                }
                this.f1335p = this.f1329j;
                this.f1336q = this.f1331l;
                this.f1337r = false;
                this.f1334o = true;
            }
            h();
            this.f1328i = 24;
            return this.f1337r;
        }

        public boolean c() {
            return this.f1322c;
        }

        public void e(AbstractC6726h.l lVar) {
            this.f1324e.append(lVar.f61295a, lVar);
        }

        public void f(AbstractC6726h.m mVar) {
            this.f1323d.append(mVar.f61301d, mVar);
        }

        public void g() {
            this.f1330k = false;
            this.f1334o = false;
            this.f1333n.b();
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f1328i = i10;
            this.f1331l = j11;
            this.f1329j = j10;
            this.f1338s = z10;
            if (!this.f1321b || i10 != 1) {
                if (!this.f1322c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f1332m;
            this.f1332m = this.f1333n;
            this.f1333n = aVar;
            aVar.b();
            this.f1327h = 0;
            this.f1330k = true;
        }
    }

    public p(G g10, boolean z10, boolean z11, String str) {
        this.f1304a = g10;
        this.f1305b = z10;
        this.f1306c = z11;
        this.f1307d = str;
    }

    private void a() {
        AbstractC6614a.i(this.f1314k);
        a0.l(this.f1315l);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f1316m || this.f1315l.c()) {
            this.f1308e.b(i11);
            this.f1309f.b(i11);
            if (this.f1316m) {
                if (this.f1308e.c()) {
                    w wVar = this.f1308e;
                    AbstractC6726h.m mVarC = AbstractC6726h.C(wVar.f1459d, 3, wVar.f1460e);
                    this.f1304a.f(mVarC.f61317t);
                    this.f1315l.f(mVarC);
                    this.f1308e.d();
                } else if (this.f1309f.c()) {
                    w wVar2 = this.f1309f;
                    this.f1315l.e(AbstractC6726h.A(wVar2.f1459d, 3, wVar2.f1460e));
                    this.f1309f.d();
                }
            } else if (this.f1308e.c() && this.f1309f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f1308e;
                arrayList.add(Arrays.copyOf(wVar3.f1459d, wVar3.f1460e));
                w wVar4 = this.f1309f;
                arrayList.add(Arrays.copyOf(wVar4.f1459d, wVar4.f1460e));
                w wVar5 = this.f1308e;
                AbstractC6726h.m mVarC2 = AbstractC6726h.C(wVar5.f1459d, 3, wVar5.f1460e);
                w wVar6 = this.f1309f;
                AbstractC6726h.l lVarA = AbstractC6726h.A(wVar6.f1459d, 3, wVar6.f1460e);
                this.f1314k.c(new C6109x.b().j0(this.f1313j).W(this.f1307d).y0("video/avc").U(AbstractC6624k.f(mVarC2.f61298a, mVarC2.f61299b, mVarC2.f61300c)).F0(mVarC2.f61303f).h0(mVarC2.f61304g).V(new C6097l.b().d(mVarC2.f61314q).c(mVarC2.f61315r).e(mVarC2.f61316s).g(mVarC2.f61306i + 8).b(mVarC2.f61307j + 8).a()).u0(mVarC2.f61305h).k0(arrayList).p0(mVarC2.f61317t).P());
                this.f1316m = true;
                this.f1304a.f(mVarC2.f61317t);
                this.f1315l.f(mVarC2);
                this.f1315l.e(lVarA);
                this.f1308e.d();
                this.f1309f.d();
            }
        }
        if (this.f1310g.b(i11)) {
            w wVar7 = this.f1310g;
            this.f1319p.Z(this.f1310g.f1459d, AbstractC6726h.L(wVar7.f1459d, wVar7.f1460e));
            this.f1319p.b0(4);
            this.f1304a.c(j11, this.f1319p);
        }
        if (this.f1315l.b(j10, i10, this.f1316m)) {
            this.f1318o = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f1316m || this.f1315l.c()) {
            this.f1308e.a(bArr, i10, i11);
            this.f1309f.a(bArr, i10, i11);
        }
        this.f1310g.a(bArr, i10, i11);
        this.f1315l.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f1316m || this.f1315l.c()) {
            this.f1308e.e(i10);
            this.f1309f.e(i10);
        }
        this.f1310g.e(i10);
        this.f1315l.i(j10, i10, j11, this.f1318o);
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        int i10;
        a();
        int iG = c6609i.g();
        int iJ = c6609i.j();
        byte[] bArrF = c6609i.f();
        this.f1311h += (long) c6609i.a();
        this.f1314k.f(c6609i, c6609i.a());
        while (true) {
            int iE = AbstractC6726h.e(bArrF, iG, iJ, this.f1312i);
            if (iE == iJ) {
                h(bArrF, iG, iJ);
                return;
            }
            int iJ2 = AbstractC6726h.j(bArrF, iE);
            if (iE <= 0 || bArrF[iE - 1] != 0) {
                i10 = 3;
            } else {
                iE--;
                i10 = 4;
            }
            int i11 = iE;
            int i12 = i10;
            int i13 = i11 - iG;
            if (i13 > 0) {
                h(bArrF, iG, i11);
            }
            int i14 = iJ - i11;
            long j10 = this.f1311h - ((long) i14);
            g(j10, i14, i13 < 0 ? -i13 : 0, this.f1317n);
            i(j10, iJ2, this.f1317n);
            iG = i11 + i12;
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1311h = 0L;
        this.f1318o = false;
        this.f1317n = -9223372036854775807L;
        AbstractC6726h.c(this.f1312i);
        this.f1308e.d();
        this.f1309f.d();
        this.f1310g.d();
        this.f1304a.b();
        b bVar = this.f1315l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
        a();
        if (z10) {
            this.f1304a.e();
            g(this.f1311h, 0, 0, this.f1317n);
            i(this.f1311h, 9, this.f1317n);
            g(this.f1311h, 0, 0, this.f1317n);
        }
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1313j = dVar.b();
        U2.O oE = rVar.e(dVar.c(), 2);
        this.f1314k = oE;
        this.f1315l = new b(oE, this.f1305b, this.f1306c);
        this.f1304a.d(rVar, dVar);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1317n = j10;
        this.f1318o |= (i10 & 2) != 0;
    }
}
