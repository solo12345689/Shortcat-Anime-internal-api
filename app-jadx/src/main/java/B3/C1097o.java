package B3;

import B3.L;
import java.util.Arrays;
import java.util.Collections;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;
import t2.a0;
import u2.AbstractC6726h;

/* JADX INFO: renamed from: B3.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1097o implements InterfaceC1095m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f1277m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f1278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f1280c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f1283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f1284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f1286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private U2.O f1287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1288k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f1281d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f1282e = new a(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1289l = -9223372036854775807L;

    /* JADX INFO: renamed from: B3.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f1290f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f1295e;

        public a(int i10) {
            this.f1295e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f1291a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f1295e;
                int length = bArr2.length;
                int i13 = this.f1293c;
                if (length < i13 + i12) {
                    this.f1295e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f1295e, this.f1293c, i12);
                this.f1293c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f1292b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f1293c -= i11;
                                this.f1291a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            AbstractC6635w.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f1294d = this.f1293c;
                            this.f1292b = 4;
                        }
                    } else if (i10 > 31) {
                        AbstractC6635w.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f1292b = 3;
                    }
                } else if (i10 != 181) {
                    AbstractC6635w.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f1292b = 2;
                }
            } else if (i10 == 176) {
                this.f1292b = 1;
                this.f1291a = true;
            }
            byte[] bArr = f1290f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f1291a = false;
            this.f1293c = 0;
            this.f1292b = 0;
        }
    }

    /* JADX INFO: renamed from: B3.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final U2.O f1296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f1301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f1302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f1303h;

        public b(U2.O o10) {
            this.f1296a = o10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f1298c) {
                int i12 = this.f1301f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f1301f = i12 + (i11 - i10);
                } else {
                    this.f1299d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f1298c = false;
                }
            }
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
        public void b(long j10, int i10, boolean z10) {
            AbstractC6614a.g(this.f1303h != -9223372036854775807L);
            if (this.f1300e == 182 && z10 && this.f1297b) {
                this.f1296a.a(this.f1303h, this.f1299d ? 1 : 0, (int) (j10 - this.f1302g), i10, null);
            }
            if (this.f1300e != 179) {
                this.f1302g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f1300e = i10;
            this.f1299d = false;
            this.f1297b = i10 == 182 || i10 == 179;
            this.f1298c = i10 == 182;
            this.f1301f = 0;
            this.f1303h = j10;
        }

        public void d() {
            this.f1297b = false;
            this.f1298c = false;
            this.f1299d = false;
            this.f1300e = -1;
        }
    }

    C1097o(O o10, String str) {
        this.f1278a = o10;
        this.f1279b = str;
        if (o10 != null) {
            this.f1283f = new w(178, 128);
            this.f1280c = new C6609I();
        } else {
            this.f1283f = null;
            this.f1280c = null;
        }
    }

    private static C6109x a(a aVar, int i10, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f1295e, aVar.f1293c);
        C6608H c6608h = new C6608H(bArrCopyOf);
        c6608h.s(i10);
        c6608h.s(4);
        c6608h.q();
        c6608h.r(8);
        if (c6608h.g()) {
            c6608h.r(4);
            c6608h.r(3);
        }
        int iH = c6608h.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = c6608h.h(8);
            int iH3 = c6608h.h(8);
            if (iH3 == 0) {
                AbstractC6635w.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f1277m;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                AbstractC6635w.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c6608h.g()) {
            c6608h.r(2);
            c6608h.r(1);
            if (c6608h.g()) {
                c6608h.r(15);
                c6608h.q();
                c6608h.r(15);
                c6608h.q();
                c6608h.r(15);
                c6608h.q();
                c6608h.r(3);
                c6608h.r(11);
                c6608h.q();
                c6608h.r(15);
                c6608h.q();
            }
        }
        if (c6608h.h(2) != 0) {
            AbstractC6635w.i("H263Reader", "Unhandled video object layer shape");
        }
        c6608h.q();
        int iH4 = c6608h.h(16);
        c6608h.q();
        if (c6608h.g()) {
            if (iH4 == 0) {
                AbstractC6635w.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c6608h.r(i11);
            }
        }
        c6608h.q();
        int iH5 = c6608h.h(13);
        c6608h.q();
        int iH6 = c6608h.h(13);
        c6608h.q();
        c6608h.q();
        return new C6109x.b().j0(str).W(str2).y0("video/mp4v-es").F0(iH5).h0(iH6).u0(f10).k0(Collections.singletonList(bArrCopyOf)).P();
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        AbstractC6614a.i(this.f1284g);
        AbstractC6614a.i(this.f1287j);
        int iG = c6609i.g();
        int iJ = c6609i.j();
        byte[] bArrF = c6609i.f();
        this.f1285h += (long) c6609i.a();
        this.f1287j.f(c6609i, c6609i.a());
        while (true) {
            int iE = AbstractC6726h.e(bArrF, iG, iJ, this.f1281d);
            if (iE == iJ) {
                break;
            }
            int i10 = iE + 3;
            int i11 = c6609i.f()[i10] & 255;
            int i12 = iE - iG;
            int i13 = 0;
            if (!this.f1288k) {
                if (i12 > 0) {
                    this.f1282e.a(bArrF, iG, iE);
                }
                if (this.f1282e.b(i11, i12 < 0 ? -i12 : 0)) {
                    U2.O o10 = this.f1287j;
                    a aVar = this.f1282e;
                    o10.c(a(aVar, aVar.f1294d, (String) AbstractC6614a.e(this.f1286i), this.f1279b));
                    this.f1288k = true;
                }
            }
            this.f1284g.a(bArrF, iG, iE);
            w wVar = this.f1283f;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrF, iG, iE);
                } else {
                    i13 = -i12;
                }
                if (this.f1283f.b(i13)) {
                    w wVar2 = this.f1283f;
                    ((C6609I) a0.l(this.f1280c)).Z(this.f1283f.f1459d, AbstractC6726h.L(wVar2.f1459d, wVar2.f1460e));
                    ((O) a0.l(this.f1278a)).b(this.f1289l, this.f1280c);
                }
                if (i11 == 178 && c6609i.f()[iE + 2] == 1) {
                    this.f1283f.e(i11);
                }
            }
            int i14 = iJ - iE;
            this.f1284g.b(this.f1285h - ((long) i14), i14, this.f1288k);
            this.f1284g.c(i11, this.f1289l);
            iG = i10;
        }
        if (!this.f1288k) {
            this.f1282e.a(bArrF, iG, iJ);
        }
        this.f1284g.a(bArrF, iG, iJ);
        w wVar3 = this.f1283f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        AbstractC6726h.c(this.f1281d);
        this.f1282e.c();
        b bVar = this.f1284g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f1283f;
        if (wVar != null) {
            wVar.d();
        }
        this.f1285h = 0L;
        this.f1289l = -9223372036854775807L;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
        AbstractC6614a.i(this.f1284g);
        if (z10) {
            this.f1284g.b(this.f1285h, 0, this.f1288k);
            this.f1284g.d();
        }
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1286i = dVar.b();
        U2.O oE = rVar.e(dVar.c(), 2);
        this.f1287j = oE;
        this.f1284g = new b(oE);
        O o10 = this.f1278a;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1289l = j10;
    }
}
