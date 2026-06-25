package B3;

import B3.L;
import java.util.Collections;
import q2.C6097l;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6624k;
import t2.C6609I;
import t2.a0;
import u2.AbstractC6726h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f1355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private U2.O f1358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f1359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1360f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f1367m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f1361g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f1362h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f1363i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f1364j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f1365k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f1366l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1368n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C6609I f1369o = new C6609I();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U2.O f1370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f1371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f1374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f1377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f1378i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f1379j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f1380k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f1381l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f1382m;

        public a(U2.O o10) {
            this.f1370a = o10;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
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
            long j10 = this.f1381l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f1371b;
                long j12 = this.f1380k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f1370a.a(j10, this.f1382m ? 1 : 0, i11, i10, null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f1379j && this.f1376g) {
                this.f1382m = this.f1372c;
                this.f1379j = false;
            } else if (this.f1377h || this.f1376g) {
                if (z10 && this.f1378i) {
                    d(i10 + ((int) (j10 - this.f1371b)));
                }
                this.f1380k = this.f1371b;
                this.f1381l = this.f1374e;
                this.f1382m = this.f1372c;
                this.f1378i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f1375f) {
                int i12 = this.f1373d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f1373d = i12 + (i11 - i10);
                } else {
                    this.f1376g = (bArr[i13] & 128) != 0;
                    this.f1375f = false;
                }
            }
        }

        public void f() {
            this.f1375f = false;
            this.f1376g = false;
            this.f1377h = false;
            this.f1378i = false;
            this.f1379j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f1376g = false;
            this.f1377h = false;
            this.f1374e = j11;
            this.f1373d = 0;
            this.f1371b = j10;
            if (!c(i11)) {
                if (this.f1378i && !this.f1379j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f1378i = false;
                }
                if (b(i11)) {
                    this.f1377h = !this.f1379j;
                    this.f1379j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f1372c = z11;
            this.f1375f = z11 || i11 <= 9;
        }
    }

    public q(G g10, String str) {
        this.f1355a = g10;
        this.f1356b = str;
    }

    private void a() {
        AbstractC6614a.i(this.f1358d);
        a0.l(this.f1359e);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f1359e.a(j10, i10, this.f1360f);
        if (!this.f1360f) {
            this.f1362h.b(i11);
            this.f1363i.b(i11);
            this.f1364j.b(i11);
            if (this.f1362h.c() && this.f1363i.c() && this.f1364j.c()) {
                C6109x c6109xI = i(this.f1357c, this.f1362h, this.f1363i, this.f1364j, this.f1356b);
                this.f1358d.c(c6109xI);
                O9.n.p(c6109xI.f57024q != -1);
                this.f1355a.f(c6109xI.f57024q);
                this.f1360f = true;
            }
        }
        if (this.f1365k.b(i11)) {
            w wVar = this.f1365k;
            this.f1369o.Z(this.f1365k.f1459d, AbstractC6726h.L(wVar.f1459d, wVar.f1460e));
            this.f1369o.c0(5);
            this.f1355a.c(j11, this.f1369o);
        }
        if (this.f1366l.b(i11)) {
            w wVar2 = this.f1366l;
            this.f1369o.Z(this.f1366l.f1459d, AbstractC6726h.L(wVar2.f1459d, wVar2.f1460e));
            this.f1369o.c0(5);
            this.f1355a.c(j11, this.f1369o);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f1359e.e(bArr, i10, i11);
        if (!this.f1360f) {
            this.f1362h.a(bArr, i10, i11);
            this.f1363i.a(bArr, i10, i11);
            this.f1364j.a(bArr, i10, i11);
        }
        this.f1365k.a(bArr, i10, i11);
        this.f1366l.a(bArr, i10, i11);
    }

    private static C6109x i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f1460e;
        byte[] bArr = new byte[wVar2.f1460e + i10 + wVar3.f1460e];
        System.arraycopy(wVar.f1459d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f1459d, 0, bArr, wVar.f1460e, wVar2.f1460e);
        System.arraycopy(wVar3.f1459d, 0, bArr, wVar.f1460e + wVar2.f1460e, wVar3.f1460e);
        AbstractC6726h.C0914h c0914hU = AbstractC6726h.u(wVar2.f1459d, 3, wVar2.f1460e, null);
        AbstractC6726h.c cVar = c0914hU.f61271c;
        return new C6109x.b().j0(str).W(str2).y0("video/hevc").U(cVar != null ? AbstractC6624k.h(cVar.f61245a, cVar.f61246b, cVar.f61247c, cVar.f61248d, cVar.f61249e, cVar.f61250f) : null).F0(c0914hU.f61276h).h0(c0914hU.f61277i).b0(c0914hU.f61278j).a0(c0914hU.f61279k).V(new C6097l.b().d(c0914hU.f61282n).c(c0914hU.f61283o).e(c0914hU.f61284p).g(c0914hU.f61273e + 8).b(c0914hU.f61274f + 8).a()).u0(c0914hU.f61280l).p0(c0914hU.f61281m).q0(c0914hU.f61270b + 1).k0(Collections.singletonList(bArr)).P();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f1359e.g(j10, i10, i11, j11, this.f1360f);
        if (!this.f1360f) {
            this.f1362h.e(i11);
            this.f1363i.e(i11);
            this.f1364j.e(i11);
        }
        this.f1365k.e(i11);
        this.f1366l.e(i11);
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        int i10;
        a();
        while (c6609i.a() > 0) {
            int iG = c6609i.g();
            int iJ = c6609i.j();
            byte[] bArrF = c6609i.f();
            this.f1367m += (long) c6609i.a();
            this.f1358d.f(c6609i, c6609i.a());
            while (iG < iJ) {
                int iE = AbstractC6726h.e(bArrF, iG, iJ, this.f1361g);
                if (iE == iJ) {
                    h(bArrF, iG, iJ);
                    return;
                }
                int i11 = AbstractC6726h.i(bArrF, iE);
                if (iE <= 0 || bArrF[iE - 1] != 0) {
                    i10 = 3;
                } else {
                    iE--;
                    i10 = 4;
                }
                int i12 = iE;
                int i13 = i10;
                int i14 = i12 - iG;
                if (i14 > 0) {
                    h(bArrF, iG, i12);
                }
                int i15 = iJ - i12;
                long j10 = this.f1367m - ((long) i15);
                g(j10, i15, i14 < 0 ? -i14 : 0, this.f1368n);
                j(j10, i15, i11, this.f1368n);
                iG = i12 + i13;
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1367m = 0L;
        this.f1368n = -9223372036854775807L;
        AbstractC6726h.c(this.f1361g);
        this.f1362h.d();
        this.f1363i.d();
        this.f1364j.d();
        this.f1365k.d();
        this.f1366l.d();
        this.f1355a.b();
        a aVar = this.f1359e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
        a();
        if (z10) {
            this.f1355a.e();
            g(this.f1367m, 0, 0, this.f1368n);
            j(this.f1367m, 0, 48, this.f1368n);
        }
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1357c = dVar.b();
        U2.O oE = rVar.e(dVar.c(), 2);
        this.f1358d = oE;
        this.f1359e = new a(oE);
        this.f1355a.d(rVar, dVar);
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1368n = j10;
    }
}
