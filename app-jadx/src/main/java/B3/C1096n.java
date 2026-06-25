package B3;

import B3.L;
import java.util.Arrays;
import t2.AbstractC6614a;
import t2.C6609I;
import u2.AbstractC6726h;

/* JADX INFO: renamed from: B3.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1096n implements InterfaceC1095m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f1254r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private U2.O f1256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f1257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6609I f1259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f1260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f1261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f1262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f1263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f1267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f1269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1271q;

    /* JADX INFO: renamed from: B3.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f1272e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f1276d;

        public a(int i10) {
            this.f1276d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f1273a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f1276d;
                int length = bArr2.length;
                int i13 = this.f1274b;
                if (length < i13 + i12) {
                    this.f1276d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f1276d, this.f1274b, i12);
                this.f1274b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f1273a) {
                int i12 = this.f1274b - i11;
                this.f1274b = i12;
                if (this.f1275c != 0 || i10 != 181) {
                    this.f1273a = false;
                    return true;
                }
                this.f1275c = i12;
            } else if (i10 == 179) {
                this.f1273a = true;
            }
            byte[] bArr = f1272e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f1273a = false;
            this.f1274b = 0;
            this.f1275c = 0;
        }
    }

    public C1096n(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair a(B3.C1096n.a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f1276d
            int r1 = r8.f1274b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            q2.x$b r6 = new q2.x$b
            r6.<init>()
            q2.x$b r9 = r6.j0(r9)
            q2.x$b r9 = r9.W(r10)
            java.lang.String r10 = "video/mpeg2"
            q2.x$b r9 = r9.y0(r10)
            q2.x$b r9 = r9.F0(r2)
            q2.x$b r9 = r9.h0(r4)
            q2.x$b r9 = r9.u0(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            q2.x$b r9 = r9.k0(r10)
            q2.x r9 = r9.P()
            r10 = r0[r5]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            if (r10 < 0) goto L9c
            double[] r1 = B3.C1096n.f1254r
            int r2 = r1.length
            if (r10 >= r2) goto L9c
            r4 = r1[r10]
            int r8 = r8.f1275c
            int r8 = r8 + 9
            r8 = r0[r8]
            r10 = r8 & 96
            int r10 = r10 >> r3
            r8 = r8 & 31
            if (r10 == r8) goto L94
            double r0 = (double) r10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r8 = r8 + 1
            double r2 = (double) r8
            double r0 = r0 / r2
            double r4 = r4 * r0
        L94:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r4
            long r0 = (long) r0
            goto L9e
        L9c:
            r0 = 0
        L9e:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C1096n.a(B3.n$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
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
    @Override // B3.InterfaceC1095m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(t2.C6609I r20) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C1096n.b(t2.I):void");
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        AbstractC6726h.c(this.f1261g);
        this.f1262h.c();
        w wVar = this.f1260f;
        if (wVar != null) {
            wVar.d();
        }
        this.f1263i = 0L;
        this.f1264j = false;
        this.f1267m = -9223372036854775807L;
        this.f1269o = -9223372036854775807L;
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
    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
        AbstractC6614a.i(this.f1256b);
        if (z10) {
            boolean z11 = this.f1270p;
            this.f1256b.a(this.f1269o, z11 ? 1 : 0, (int) (this.f1263i - this.f1268n), 0, null);
        }
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1255a = dVar.b();
        this.f1256b = rVar.e(dVar.c(), 2);
        O o10 = this.f1257c;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1267m = j10;
    }

    C1096n(O o10, String str) {
        this.f1257c = o10;
        this.f1258d = str;
        this.f1261g = new boolean[4];
        this.f1262h = new a(128);
        if (o10 != null) {
            this.f1260f = new w(178, 128);
            this.f1259e = new C6609I();
        } else {
            this.f1260f = null;
            this.f1259e = null;
        }
        this.f1267m = -9223372036854775807L;
        this.f1269o = -9223372036854775807L;
    }
}
