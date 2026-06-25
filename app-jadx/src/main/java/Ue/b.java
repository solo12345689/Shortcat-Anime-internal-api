package Ue;

import Se.c;
import Se.k;
import Se.l;
import Se.y;
import Ze.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0337b f19529A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0337b f19530B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0337b f19531C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0337b f19532D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0337b f19533E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0337b f19534F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0337b f19535G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0337b f19536H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0337b f19537I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C0337b f19538J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0337b f19539K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C0337b f19540L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0337b f19541M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0337b f19542N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0337b f19543O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C0337b f19544P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0337b f19545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0337b f19546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0337b f19547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f19548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f19549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f19550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0337b f19551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0337b f19552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0337b f19553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0337b f19554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0337b f19555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0337b f19556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0337b f19557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0337b f19558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0337b f19559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f19560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0337b f19561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0337b f19562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0337b f19563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0337b f19564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0337b f19565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0337b f19566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0337b f19567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0337b f19568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0337b f19569y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0337b f19570z;

    /* JADX INFO: renamed from: Ue.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0337b extends d {
        public C0337b(int i10) {
            super(i10, 1);
        }

        @Override // Ue.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f19572a)) != 0);
        }

        @Override // Ue.b.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f19572a;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j.a[] f19571c;

        public c(int i10, j.a[] aVarArr) {
            super(i10, g(aVarArr));
            this.f19571c = aVarArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static int g(Object[] objArr) {
            if (objArr == null) {
                f(0);
            }
            int length = objArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + objArr.getClass());
        }

        @Override // Ue.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public j.a d(int i10) {
            int i11 = (1 << this.f19573b) - 1;
            int i12 = this.f19572a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (j.a aVar : this.f19571c) {
                if (aVar.d() == i13) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // Ue.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(j.a aVar) {
            return aVar.d() << this.f19572a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19573b;

        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f19572a + dVar.f19573b, aVarArr);
        }

        public static C0337b b(d dVar) {
            return new C0337b(dVar.f19572a + dVar.f19573b);
        }

        public static C0337b c() {
            return new C0337b(0);
        }

        public abstract Object d(int i10);

        public abstract int e(Object obj);

        private d(int i10, int i11) {
            this.f19572a = i10;
            this.f19573b = i11;
        }
    }

    static {
        C0337b c0337bC = d.c();
        f19545a = c0337bC;
        f19546b = d.b(c0337bC);
        C0337b c0337bC2 = d.c();
        f19547c = c0337bC2;
        d dVarA = d.a(c0337bC2, y.values());
        f19548d = dVarA;
        d dVarA2 = d.a(dVarA, l.values());
        f19549e = dVarA2;
        d dVarA3 = d.a(dVarA2, c.EnumC0282c.values());
        f19550f = dVarA3;
        C0337b c0337bB = d.b(dVarA3);
        f19551g = c0337bB;
        C0337b c0337bB2 = d.b(c0337bB);
        f19552h = c0337bB2;
        C0337b c0337bB3 = d.b(c0337bB2);
        f19553i = c0337bB3;
        C0337b c0337bB4 = d.b(c0337bB3);
        f19554j = c0337bB4;
        C0337b c0337bB5 = d.b(c0337bB4);
        f19555k = c0337bB5;
        C0337b c0337bB6 = d.b(c0337bB5);
        f19556l = c0337bB6;
        f19557m = d.b(c0337bB6);
        C0337b c0337bB7 = d.b(dVarA);
        f19558n = c0337bB7;
        f19559o = d.b(c0337bB7);
        d dVarA4 = d.a(dVarA2, k.values());
        f19560p = dVarA4;
        C0337b c0337bB8 = d.b(dVarA4);
        f19561q = c0337bB8;
        C0337b c0337bB9 = d.b(c0337bB8);
        f19562r = c0337bB9;
        C0337b c0337bB10 = d.b(c0337bB9);
        f19563s = c0337bB10;
        C0337b c0337bB11 = d.b(c0337bB10);
        f19564t = c0337bB11;
        C0337b c0337bB12 = d.b(c0337bB11);
        f19565u = c0337bB12;
        C0337b c0337bB13 = d.b(c0337bB12);
        f19566v = c0337bB13;
        C0337b c0337bB14 = d.b(c0337bB13);
        f19567w = c0337bB14;
        f19568x = d.b(c0337bB14);
        C0337b c0337bB15 = d.b(dVarA4);
        f19569y = c0337bB15;
        C0337b c0337bB16 = d.b(c0337bB15);
        f19570z = c0337bB16;
        C0337b c0337bB17 = d.b(c0337bB16);
        f19529A = c0337bB17;
        C0337b c0337bB18 = d.b(c0337bB17);
        f19530B = c0337bB18;
        C0337b c0337bB19 = d.b(c0337bB18);
        f19531C = c0337bB19;
        C0337b c0337bB20 = d.b(c0337bB19);
        f19532D = c0337bB20;
        C0337b c0337bB21 = d.b(c0337bB20);
        f19533E = c0337bB21;
        C0337b c0337bB22 = d.b(c0337bB21);
        f19534F = c0337bB22;
        f19535G = d.b(c0337bB22);
        C0337b c0337bB23 = d.b(c0337bC2);
        f19536H = c0337bB23;
        C0337b c0337bB24 = d.b(c0337bB23);
        f19537I = c0337bB24;
        f19538J = d.b(c0337bB24);
        C0337b c0337bB25 = d.b(dVarA2);
        f19539K = c0337bB25;
        C0337b c0337bB26 = d.b(c0337bB25);
        f19540L = c0337bB26;
        f19541M = d.b(c0337bB26);
        C0337b c0337bC3 = d.c();
        f19542N = c0337bC3;
        f19543O = d.b(c0337bC3);
        f19544P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ue.b.a(int):void");
    }

    public static int b(boolean z10, y yVar, l lVar, boolean z11, boolean z12, boolean z13) {
        if (yVar == null) {
            a(10);
        }
        if (lVar == null) {
            a(11);
        }
        return f19547c.e(Boolean.valueOf(z10)) | f19549e.e(lVar) | f19548d.e(yVar) | f19539K.e(Boolean.valueOf(z11)) | f19540L.e(Boolean.valueOf(z12)) | f19541M.e(Boolean.valueOf(z13));
    }
}
