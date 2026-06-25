package Se;

import Ze.a;
import Ze.i;
import Ze.j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends i.d implements Ze.q {

    /* JADX INFO: renamed from: Z */
    private static final c f16155Z;

    /* JADX INFO: renamed from: l0 */
    public static Ze.r f16156l0 = new a();

    /* JADX INFO: renamed from: A */
    private List f16157A;

    /* JADX INFO: renamed from: B */
    private int f16158B;

    /* JADX INFO: renamed from: C */
    private List f16159C;

    /* JADX INFO: renamed from: D */
    private List f16160D;

    /* JADX INFO: renamed from: E */
    private int f16161E;

    /* JADX INFO: renamed from: F */
    private u f16162F;

    /* JADX INFO: renamed from: G */
    private List f16163G;

    /* JADX INFO: renamed from: H */
    private x f16164H;

    /* JADX INFO: renamed from: I */
    private List f16165I;

    /* JADX INFO: renamed from: X */
    private byte f16166X;

    /* JADX INFO: renamed from: Y */
    private int f16167Y;

    /* JADX INFO: renamed from: c */
    private final Ze.d f16168c;

    /* JADX INFO: renamed from: d */
    private int f16169d;

    /* JADX INFO: renamed from: e */
    private int f16170e;

    /* JADX INFO: renamed from: f */
    private int f16171f;

    /* JADX INFO: renamed from: g */
    private int f16172g;

    /* JADX INFO: renamed from: h */
    private List f16173h;

    /* JADX INFO: renamed from: i */
    private List f16174i;

    /* JADX INFO: renamed from: j */
    private List f16175j;

    /* JADX INFO: renamed from: k */
    private int f16176k;

    /* JADX INFO: renamed from: l */
    private List f16177l;

    /* JADX INFO: renamed from: m */
    private int f16178m;

    /* JADX INFO: renamed from: n */
    private List f16179n;

    /* JADX INFO: renamed from: o */
    private List f16180o;

    /* JADX INFO: renamed from: p */
    private int f16181p;

    /* JADX INFO: renamed from: q */
    private List f16182q;

    /* JADX INFO: renamed from: r */
    private List f16183r;

    /* JADX INFO: renamed from: s */
    private List f16184s;

    /* JADX INFO: renamed from: t */
    private List f16185t;

    /* JADX INFO: renamed from: u */
    private List f16186u;

    /* JADX INFO: renamed from: v */
    private List f16187v;

    /* JADX INFO: renamed from: w */
    private int f16188w;

    /* JADX INFO: renamed from: x */
    private int f16189x;

    /* JADX INFO: renamed from: y */
    private r f16190y;

    /* JADX INFO: renamed from: z */
    private int f16191z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public c b(Ze.e eVar, Ze.g gVar) {
            return new c(eVar, gVar);
        }
    }

    /* JADX INFO: renamed from: Se.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum EnumC0282c implements j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: i */
        private static j.b f16225i = new a();

        /* JADX INFO: renamed from: a */
        private final int f16227a;

        /* JADX INFO: renamed from: Se.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements j.b {
            a() {
            }

            @Override // Ze.j.b
            /* JADX INFO: renamed from: b */
            public EnumC0282c a(int i10) {
                return EnumC0282c.a(i10);
            }
        }

        EnumC0282c(int i10, int i11) {
            this.f16227a = i11;
        }

        public static EnumC0282c a(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16227a;
        }
    }

    static {
        c cVar = new c(true);
        f16155Z = cVar;
        cVar.x1();
    }

    /* synthetic */ c(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static b A1(c cVar) {
        return z1().j(cVar);
    }

    public static c C1(InputStream inputStream, Ze.g gVar) {
        return (c) f16156l0.c(inputStream, gVar);
    }

    public static c D0() {
        return f16155Z;
    }

    private void x1() {
        this.f16170e = 6;
        this.f16171f = 0;
        this.f16172g = 0;
        List list = Collections.EMPTY_LIST;
        this.f16173h = list;
        this.f16174i = list;
        this.f16175j = list;
        this.f16177l = list;
        this.f16179n = list;
        this.f16180o = list;
        this.f16182q = list;
        this.f16183r = list;
        this.f16184s = list;
        this.f16185t = list;
        this.f16186u = list;
        this.f16187v = list;
        this.f16189x = 0;
        this.f16190y = r.Y();
        this.f16191z = 0;
        this.f16157A = list;
        this.f16159C = list;
        this.f16160D = list;
        this.f16162F = u.x();
        this.f16163G = list;
        this.f16164H = x.v();
        this.f16165I = list;
    }

    public static b z1() {
        return b.v();
    }

    public int A0() {
        return this.f16179n.size();
    }

    public List B0() {
        return this.f16180o;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: B1 */
    public b a() {
        return z1();
    }

    public List C0() {
        return this.f16179n;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: D1 */
    public b f() {
        return A1(this);
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: E0 */
    public c c() {
        return f16155Z;
    }

    public h F0(int i10) {
        return (h) this.f16186u.get(i10);
    }

    public int G0() {
        return this.f16186u.size();
    }

    public List H0() {
        return this.f16186u;
    }

    public int I0() {
        return this.f16170e;
    }

    public int J0() {
        return this.f16171f;
    }

    public j K0(int i10) {
        return (j) this.f16183r.get(i10);
    }

    public int L0() {
        return this.f16183r.size();
    }

    public List M0() {
        return this.f16183r;
    }

    public int N0() {
        return this.f16189x;
    }

    public r O0() {
        return this.f16190y;
    }

    public int P0() {
        return this.f16191z;
    }

    public int Q0() {
        return this.f16157A.size();
    }

    public List R0() {
        return this.f16157A;
    }

    public r S0(int i10) {
        return (r) this.f16159C.get(i10);
    }

    public int T0() {
        return this.f16159C.size();
    }

    public int U0() {
        return this.f16160D.size();
    }

    public List V0() {
        return this.f16160D;
    }

    public List W0() {
        return this.f16159C;
    }

    public List X0() {
        return this.f16177l;
    }

    public o Y0(int i10) {
        return (o) this.f16184s.get(i10);
    }

    public int Z0() {
        return this.f16184s.size();
    }

    public List a1() {
        return this.f16184s;
    }

    public List b1() {
        return this.f16187v;
    }

    public r c1(int i10) {
        return (r) this.f16174i.get(i10);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16167Y;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16169d & 1) == 1 ? Ze.f.o(1, this.f16170e) : 0;
        int iP = 0;
        for (int i11 = 0; i11 < this.f16175j.size(); i11++) {
            iP += Ze.f.p(((Integer) this.f16175j.get(i11)).intValue());
        }
        int iR = iO + iP;
        if (!e1().isEmpty()) {
            iR = iR + 1 + Ze.f.p(iP);
        }
        this.f16176k = iP;
        if ((this.f16169d & 2) == 2) {
            iR += Ze.f.o(3, this.f16171f);
        }
        if ((this.f16169d & 4) == 4) {
            iR += Ze.f.o(4, this.f16172g);
        }
        for (int i12 = 0; i12 < this.f16173h.size(); i12++) {
            iR += Ze.f.r(5, (Ze.p) this.f16173h.get(i12));
        }
        for (int i13 = 0; i13 < this.f16174i.size(); i13++) {
            iR += Ze.f.r(6, (Ze.p) this.f16174i.get(i13));
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f16177l.size(); i14++) {
            iP2 += Ze.f.p(((Integer) this.f16177l.get(i14)).intValue());
        }
        int iR2 = iR + iP2;
        if (!X0().isEmpty()) {
            iR2 = iR2 + 1 + Ze.f.p(iP2);
        }
        this.f16178m = iP2;
        for (int i15 = 0; i15 < this.f16182q.size(); i15++) {
            iR2 += Ze.f.r(8, (Ze.p) this.f16182q.get(i15));
        }
        for (int i16 = 0; i16 < this.f16183r.size(); i16++) {
            iR2 += Ze.f.r(9, (Ze.p) this.f16183r.get(i16));
        }
        for (int i17 = 0; i17 < this.f16184s.size(); i17++) {
            iR2 += Ze.f.r(10, (Ze.p) this.f16184s.get(i17));
        }
        for (int i18 = 0; i18 < this.f16185t.size(); i18++) {
            iR2 += Ze.f.r(11, (Ze.p) this.f16185t.get(i18));
        }
        for (int i19 = 0; i19 < this.f16186u.size(); i19++) {
            iR2 += Ze.f.r(13, (Ze.p) this.f16186u.get(i19));
        }
        int iP3 = 0;
        for (int i20 = 0; i20 < this.f16187v.size(); i20++) {
            iP3 += Ze.f.p(((Integer) this.f16187v.get(i20)).intValue());
        }
        int iR3 = iR2 + iP3;
        if (!b1().isEmpty()) {
            iR3 = iR3 + 2 + Ze.f.p(iP3);
        }
        this.f16188w = iP3;
        if ((this.f16169d & 8) == 8) {
            iR3 += Ze.f.o(17, this.f16189x);
        }
        if ((this.f16169d & 16) == 16) {
            iR3 += Ze.f.r(18, this.f16190y);
        }
        if ((this.f16169d & 32) == 32) {
            iR3 += Ze.f.o(19, this.f16191z);
        }
        for (int i21 = 0; i21 < this.f16179n.size(); i21++) {
            iR3 += Ze.f.r(20, (Ze.p) this.f16179n.get(i21));
        }
        int iP4 = 0;
        for (int i22 = 0; i22 < this.f16180o.size(); i22++) {
            iP4 += Ze.f.p(((Integer) this.f16180o.get(i22)).intValue());
        }
        int iP5 = iR3 + iP4;
        if (!B0().isEmpty()) {
            iP5 = iP5 + 2 + Ze.f.p(iP4);
        }
        this.f16181p = iP4;
        int iP6 = 0;
        for (int i23 = 0; i23 < this.f16157A.size(); i23++) {
            iP6 += Ze.f.p(((Integer) this.f16157A.get(i23)).intValue());
        }
        int iR4 = iP5 + iP6;
        if (!R0().isEmpty()) {
            iR4 = iR4 + 2 + Ze.f.p(iP6);
        }
        this.f16158B = iP6;
        for (int i24 = 0; i24 < this.f16159C.size(); i24++) {
            iR4 += Ze.f.r(23, (Ze.p) this.f16159C.get(i24));
        }
        int iP7 = 0;
        for (int i25 = 0; i25 < this.f16160D.size(); i25++) {
            iP7 += Ze.f.p(((Integer) this.f16160D.get(i25)).intValue());
        }
        int iR5 = iR4 + iP7;
        if (!V0().isEmpty()) {
            iR5 = iR5 + 2 + Ze.f.p(iP7);
        }
        this.f16161E = iP7;
        if ((this.f16169d & 64) == 64) {
            iR5 += Ze.f.r(30, this.f16162F);
        }
        int iP8 = 0;
        for (int i26 = 0; i26 < this.f16163G.size(); i26++) {
            iP8 += Ze.f.p(((Integer) this.f16163G.get(i26)).intValue());
        }
        int size = iR5 + iP8 + (n1().size() * 2);
        if ((this.f16169d & 128) == 128) {
            size += Ze.f.r(32, this.f16164H);
        }
        for (int i27 = 0; i27 < this.f16165I.size(); i27++) {
            size += Ze.f.r(33, (Ze.p) this.f16165I.get(i27));
        }
        int iU = size + u() + this.f16168c.size();
        this.f16167Y = iU;
        return iU;
    }

    public int d1() {
        return this.f16174i.size();
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16166X;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!r1()) {
            this.f16166X = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < k1(); i10++) {
            if (!j1(i10).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < d1(); i11++) {
            if (!c1(i11).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < A0(); i12++) {
            if (!z0(i12).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < x0(); i13++) {
            if (!w0(i13).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < L0(); i14++) {
            if (!K0(i14).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < Z0(); i15++) {
            if (!Y0(i15).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < h1(); i16++) {
            if (!g1(i16).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < G0(); i17++) {
            if (!F0(i17).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        if (t1() && !O0().e()) {
            this.f16166X = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < T0(); i18++) {
            if (!S0(i18).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        if (v1() && !m1().e()) {
            this.f16166X = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < v0(); i19++) {
            if (!u0(i19).e()) {
                this.f16166X = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16166X = (byte) 1;
            return true;
        }
        this.f16166X = (byte) 0;
        return false;
    }

    public List e1() {
        return this.f16175j;
    }

    public List f1() {
        return this.f16174i;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16169d & 1) == 1) {
            fVar.Z(1, this.f16170e);
        }
        if (e1().size() > 0) {
            fVar.n0(18);
            fVar.n0(this.f16176k);
        }
        for (int i10 = 0; i10 < this.f16175j.size(); i10++) {
            fVar.a0(((Integer) this.f16175j.get(i10)).intValue());
        }
        if ((this.f16169d & 2) == 2) {
            fVar.Z(3, this.f16171f);
        }
        if ((this.f16169d & 4) == 4) {
            fVar.Z(4, this.f16172g);
        }
        for (int i11 = 0; i11 < this.f16173h.size(); i11++) {
            fVar.c0(5, (Ze.p) this.f16173h.get(i11));
        }
        for (int i12 = 0; i12 < this.f16174i.size(); i12++) {
            fVar.c0(6, (Ze.p) this.f16174i.get(i12));
        }
        if (X0().size() > 0) {
            fVar.n0(58);
            fVar.n0(this.f16178m);
        }
        for (int i13 = 0; i13 < this.f16177l.size(); i13++) {
            fVar.a0(((Integer) this.f16177l.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f16182q.size(); i14++) {
            fVar.c0(8, (Ze.p) this.f16182q.get(i14));
        }
        for (int i15 = 0; i15 < this.f16183r.size(); i15++) {
            fVar.c0(9, (Ze.p) this.f16183r.get(i15));
        }
        for (int i16 = 0; i16 < this.f16184s.size(); i16++) {
            fVar.c0(10, (Ze.p) this.f16184s.get(i16));
        }
        for (int i17 = 0; i17 < this.f16185t.size(); i17++) {
            fVar.c0(11, (Ze.p) this.f16185t.get(i17));
        }
        for (int i18 = 0; i18 < this.f16186u.size(); i18++) {
            fVar.c0(13, (Ze.p) this.f16186u.get(i18));
        }
        if (b1().size() > 0) {
            fVar.n0(130);
            fVar.n0(this.f16188w);
        }
        for (int i19 = 0; i19 < this.f16187v.size(); i19++) {
            fVar.a0(((Integer) this.f16187v.get(i19)).intValue());
        }
        if ((this.f16169d & 8) == 8) {
            fVar.Z(17, this.f16189x);
        }
        if ((this.f16169d & 16) == 16) {
            fVar.c0(18, this.f16190y);
        }
        if ((this.f16169d & 32) == 32) {
            fVar.Z(19, this.f16191z);
        }
        for (int i20 = 0; i20 < this.f16179n.size(); i20++) {
            fVar.c0(20, (Ze.p) this.f16179n.get(i20));
        }
        if (B0().size() > 0) {
            fVar.n0(170);
            fVar.n0(this.f16181p);
        }
        for (int i21 = 0; i21 < this.f16180o.size(); i21++) {
            fVar.a0(((Integer) this.f16180o.get(i21)).intValue());
        }
        if (R0().size() > 0) {
            fVar.n0(178);
            fVar.n0(this.f16158B);
        }
        for (int i22 = 0; i22 < this.f16157A.size(); i22++) {
            fVar.a0(((Integer) this.f16157A.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f16159C.size(); i23++) {
            fVar.c0(23, (Ze.p) this.f16159C.get(i23));
        }
        if (V0().size() > 0) {
            fVar.n0(194);
            fVar.n0(this.f16161E);
        }
        for (int i24 = 0; i24 < this.f16160D.size(); i24++) {
            fVar.a0(((Integer) this.f16160D.get(i24)).intValue());
        }
        if ((this.f16169d & 64) == 64) {
            fVar.c0(30, this.f16162F);
        }
        for (int i25 = 0; i25 < this.f16163G.size(); i25++) {
            fVar.Z(31, ((Integer) this.f16163G.get(i25)).intValue());
        }
        if ((this.f16169d & 128) == 128) {
            fVar.c0(32, this.f16164H);
        }
        for (int i26 = 0; i26 < this.f16165I.size(); i26++) {
            fVar.c0(33, (Ze.p) this.f16165I.get(i26));
        }
        aVarZ.a(19000, fVar);
        fVar.h0(this.f16168c);
    }

    public s g1(int i10) {
        return (s) this.f16185t.get(i10);
    }

    public int h1() {
        return this.f16185t.size();
    }

    public List i1() {
        return this.f16185t;
    }

    public t j1(int i10) {
        return (t) this.f16173h.get(i10);
    }

    public int k1() {
        return this.f16173h.size();
    }

    public List l1() {
        return this.f16173h;
    }

    public u m1() {
        return this.f16162F;
    }

    public List n1() {
        return this.f16163G;
    }

    public x o1() {
        return this.f16164H;
    }

    public boolean p1() {
        return (this.f16169d & 4) == 4;
    }

    public boolean q1() {
        return (this.f16169d & 1) == 1;
    }

    public boolean r1() {
        return (this.f16169d & 2) == 2;
    }

    public boolean s1() {
        return (this.f16169d & 8) == 8;
    }

    public int t0() {
        return this.f16172g;
    }

    public boolean t1() {
        return (this.f16169d & 16) == 16;
    }

    public d u0(int i10) {
        return (d) this.f16165I.get(i10);
    }

    public boolean u1() {
        return (this.f16169d & 32) == 32;
    }

    public int v0() {
        return this.f16165I.size();
    }

    public boolean v1() {
        return (this.f16169d & 64) == 64;
    }

    public e w0(int i10) {
        return (e) this.f16182q.get(i10);
    }

    public boolean w1() {
        return (this.f16169d & 128) == 128;
    }

    public int x0() {
        return this.f16182q.size();
    }

    public List y0() {
        return this.f16182q;
    }

    public r z0(int i10) {
        return (r) this.f16179n.get(i10);
    }

    /* synthetic */ c(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private c(i.c cVar) {
        super(cVar);
        this.f16176k = -1;
        this.f16178m = -1;
        this.f16181p = -1;
        this.f16188w = -1;
        this.f16158B = -1;
        this.f16161E = -1;
        this.f16166X = (byte) -1;
        this.f16167Y = -1;
        this.f16168c = cVar.i();
    }

    private c(boolean z10) {
        this.f16176k = -1;
        this.f16178m = -1;
        this.f16181p = -1;
        this.f16188w = -1;
        this.f16158B = -1;
        this.f16161E = -1;
        this.f16166X = (byte) -1;
        this.f16167Y = -1;
        this.f16168c = Ze.d.f23287a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0051  */
    /* JADX WARN: Type inference failed for: r12v51, types: [Se.r$c] */
    /* JADX WARN: Type inference failed for: r12v82, types: [Se.u$b] */
    /* JADX WARN: Type inference failed for: r14v98, types: [Se.x$b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c(Ze.e r23, Ze.g r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Se.c.<init>(Ze.e, Ze.g):void");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: A */
        private List f16192A;

        /* JADX INFO: renamed from: B */
        private x f16193B;

        /* JADX INFO: renamed from: C */
        private List f16194C;

        /* JADX INFO: renamed from: d */
        private int f16195d;

        /* JADX INFO: renamed from: e */
        private int f16196e = 6;

        /* JADX INFO: renamed from: f */
        private int f16197f;

        /* JADX INFO: renamed from: g */
        private int f16198g;

        /* JADX INFO: renamed from: h */
        private List f16199h;

        /* JADX INFO: renamed from: i */
        private List f16200i;

        /* JADX INFO: renamed from: j */
        private List f16201j;

        /* JADX INFO: renamed from: k */
        private List f16202k;

        /* JADX INFO: renamed from: l */
        private List f16203l;

        /* JADX INFO: renamed from: m */
        private List f16204m;

        /* JADX INFO: renamed from: n */
        private List f16205n;

        /* JADX INFO: renamed from: o */
        private List f16206o;

        /* JADX INFO: renamed from: p */
        private List f16207p;

        /* JADX INFO: renamed from: q */
        private List f16208q;

        /* JADX INFO: renamed from: r */
        private List f16209r;

        /* JADX INFO: renamed from: s */
        private List f16210s;

        /* JADX INFO: renamed from: t */
        private int f16211t;

        /* JADX INFO: renamed from: u */
        private r f16212u;

        /* JADX INFO: renamed from: v */
        private int f16213v;

        /* JADX INFO: renamed from: w */
        private List f16214w;

        /* JADX INFO: renamed from: x */
        private List f16215x;

        /* JADX INFO: renamed from: y */
        private List f16216y;

        /* JADX INFO: renamed from: z */
        private u f16217z;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16199h = list;
            this.f16200i = list;
            this.f16201j = list;
            this.f16202k = list;
            this.f16203l = list;
            this.f16204m = list;
            this.f16205n = list;
            this.f16206o = list;
            this.f16207p = list;
            this.f16208q = list;
            this.f16209r = list;
            this.f16210s = list;
            this.f16212u = r.Y();
            this.f16214w = list;
            this.f16215x = list;
            this.f16216y = list;
            this.f16217z = u.x();
            this.f16192A = list;
            this.f16193B = x.v();
            this.f16194C = list;
            P();
        }

        private void A() {
            if ((this.f16195d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                this.f16204m = new ArrayList(this.f16204m);
                this.f16195d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
        }

        private void B() {
            if ((this.f16195d & 128) != 128) {
                this.f16203l = new ArrayList(this.f16203l);
                this.f16195d |= 128;
            }
        }

        private void C() {
            if ((this.f16195d & 8192) != 8192) {
                this.f16209r = new ArrayList(this.f16209r);
                this.f16195d |= 8192;
            }
        }

        private void D() {
            if ((this.f16195d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                this.f16206o = new ArrayList(this.f16206o);
                this.f16195d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
        }

        private void E() {
            if ((this.f16195d & 262144) != 262144) {
                this.f16214w = new ArrayList(this.f16214w);
                this.f16195d |= 262144;
            }
        }

        private void F() {
            if ((this.f16195d & 1048576) != 1048576) {
                this.f16216y = new ArrayList(this.f16216y);
                this.f16195d |= 1048576;
            }
        }

        private void G() {
            if ((this.f16195d & 524288) != 524288) {
                this.f16215x = new ArrayList(this.f16215x);
                this.f16195d |= 524288;
            }
        }

        private void H() {
            if ((this.f16195d & 64) != 64) {
                this.f16202k = new ArrayList(this.f16202k);
                this.f16195d |= 64;
            }
        }

        private void I() {
            if ((this.f16195d & 2048) != 2048) {
                this.f16207p = new ArrayList(this.f16207p);
                this.f16195d |= 2048;
            }
        }

        private void J() {
            if ((this.f16195d & 16384) != 16384) {
                this.f16210s = new ArrayList(this.f16210s);
                this.f16195d |= 16384;
            }
        }

        private void K() {
            if ((this.f16195d & 32) != 32) {
                this.f16201j = new ArrayList(this.f16201j);
                this.f16195d |= 32;
            }
        }

        private void L() {
            if ((this.f16195d & 16) != 16) {
                this.f16200i = new ArrayList(this.f16200i);
                this.f16195d |= 16;
            }
        }

        private void M() {
            if ((this.f16195d & 4096) != 4096) {
                this.f16208q = new ArrayList(this.f16208q);
                this.f16195d |= 4096;
            }
        }

        private void N() {
            if ((this.f16195d & 8) != 8) {
                this.f16199h = new ArrayList(this.f16199h);
                this.f16195d |= 8;
            }
        }

        private void O() {
            if ((this.f16195d & 4194304) != 4194304) {
                this.f16192A = new ArrayList(this.f16192A);
                this.f16195d |= 4194304;
            }
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16195d & 16777216) != 16777216) {
                this.f16194C = new ArrayList(this.f16194C);
                this.f16195d |= 16777216;
            }
        }

        private void y() {
            if ((this.f16195d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f16205n = new ArrayList(this.f16205n);
                this.f16195d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: Q */
        public b j(c cVar) {
            if (cVar == c.D0()) {
                return this;
            }
            if (cVar.q1()) {
                W(cVar.I0());
            }
            if (cVar.r1()) {
                X(cVar.J0());
            }
            if (cVar.p1()) {
                V(cVar.t0());
            }
            if (!cVar.f16173h.isEmpty()) {
                if (this.f16199h.isEmpty()) {
                    this.f16199h = cVar.f16173h;
                    this.f16195d &= -9;
                } else {
                    N();
                    this.f16199h.addAll(cVar.f16173h);
                }
            }
            if (!cVar.f16174i.isEmpty()) {
                if (this.f16200i.isEmpty()) {
                    this.f16200i = cVar.f16174i;
                    this.f16195d &= -17;
                } else {
                    L();
                    this.f16200i.addAll(cVar.f16174i);
                }
            }
            if (!cVar.f16175j.isEmpty()) {
                if (this.f16201j.isEmpty()) {
                    this.f16201j = cVar.f16175j;
                    this.f16195d &= -33;
                } else {
                    K();
                    this.f16201j.addAll(cVar.f16175j);
                }
            }
            if (!cVar.f16177l.isEmpty()) {
                if (this.f16202k.isEmpty()) {
                    this.f16202k = cVar.f16177l;
                    this.f16195d &= -65;
                } else {
                    H();
                    this.f16202k.addAll(cVar.f16177l);
                }
            }
            if (!cVar.f16179n.isEmpty()) {
                if (this.f16203l.isEmpty()) {
                    this.f16203l = cVar.f16179n;
                    this.f16195d &= -129;
                } else {
                    B();
                    this.f16203l.addAll(cVar.f16179n);
                }
            }
            if (!cVar.f16180o.isEmpty()) {
                if (this.f16204m.isEmpty()) {
                    this.f16204m = cVar.f16180o;
                    this.f16195d &= -257;
                } else {
                    A();
                    this.f16204m.addAll(cVar.f16180o);
                }
            }
            if (!cVar.f16182q.isEmpty()) {
                if (this.f16205n.isEmpty()) {
                    this.f16205n = cVar.f16182q;
                    this.f16195d &= -513;
                } else {
                    y();
                    this.f16205n.addAll(cVar.f16182q);
                }
            }
            if (!cVar.f16183r.isEmpty()) {
                if (this.f16206o.isEmpty()) {
                    this.f16206o = cVar.f16183r;
                    this.f16195d &= -1025;
                } else {
                    D();
                    this.f16206o.addAll(cVar.f16183r);
                }
            }
            if (!cVar.f16184s.isEmpty()) {
                if (this.f16207p.isEmpty()) {
                    this.f16207p = cVar.f16184s;
                    this.f16195d &= -2049;
                } else {
                    I();
                    this.f16207p.addAll(cVar.f16184s);
                }
            }
            if (!cVar.f16185t.isEmpty()) {
                if (this.f16208q.isEmpty()) {
                    this.f16208q = cVar.f16185t;
                    this.f16195d &= -4097;
                } else {
                    M();
                    this.f16208q.addAll(cVar.f16185t);
                }
            }
            if (!cVar.f16186u.isEmpty()) {
                if (this.f16209r.isEmpty()) {
                    this.f16209r = cVar.f16186u;
                    this.f16195d &= -8193;
                } else {
                    C();
                    this.f16209r.addAll(cVar.f16186u);
                }
            }
            if (!cVar.f16187v.isEmpty()) {
                if (this.f16210s.isEmpty()) {
                    this.f16210s = cVar.f16187v;
                    this.f16195d &= -16385;
                } else {
                    J();
                    this.f16210s.addAll(cVar.f16187v);
                }
            }
            if (cVar.s1()) {
                Y(cVar.N0());
            }
            if (cVar.t1()) {
                S(cVar.O0());
            }
            if (cVar.u1()) {
                Z(cVar.P0());
            }
            if (!cVar.f16157A.isEmpty()) {
                if (this.f16214w.isEmpty()) {
                    this.f16214w = cVar.f16157A;
                    this.f16195d &= -262145;
                } else {
                    E();
                    this.f16214w.addAll(cVar.f16157A);
                }
            }
            if (!cVar.f16159C.isEmpty()) {
                if (this.f16215x.isEmpty()) {
                    this.f16215x = cVar.f16159C;
                    this.f16195d &= -524289;
                } else {
                    G();
                    this.f16215x.addAll(cVar.f16159C);
                }
            }
            if (!cVar.f16160D.isEmpty()) {
                if (this.f16216y.isEmpty()) {
                    this.f16216y = cVar.f16160D;
                    this.f16195d &= -1048577;
                } else {
                    F();
                    this.f16216y.addAll(cVar.f16160D);
                }
            }
            if (cVar.v1()) {
                T(cVar.m1());
            }
            if (!cVar.f16163G.isEmpty()) {
                if (this.f16192A.isEmpty()) {
                    this.f16192A = cVar.f16163G;
                    this.f16195d &= -4194305;
                } else {
                    O();
                    this.f16192A.addAll(cVar.f16163G);
                }
            }
            if (cVar.w1()) {
                U(cVar.o1());
            }
            if (!cVar.f16165I.isEmpty()) {
                if (this.f16194C.isEmpty()) {
                    this.f16194C = cVar.f16165I;
                    this.f16195d &= -16777217;
                } else {
                    x();
                    this.f16194C.addAll(cVar.f16165I);
                }
            }
            q(cVar);
            k(i().c(cVar.f16168c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: R */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.c.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.c.f16156l0     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.c r3 = (Se.c) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                if (r3 == 0) goto Le
                r2.j(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                Ze.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                Se.c r4 = (Se.c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.j(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Se.c.b.y1(Ze.e, Ze.g):Se.c$b");
        }

        public b S(r rVar) {
            if ((this.f16195d & 65536) != 65536 || this.f16212u == r.Y()) {
                this.f16212u = rVar;
            } else {
                this.f16212u = r.z0(this.f16212u).j(rVar).t();
            }
            this.f16195d |= 65536;
            return this;
        }

        public b T(u uVar) {
            if ((this.f16195d & 2097152) != 2097152 || this.f16217z == u.x()) {
                this.f16217z = uVar;
            } else {
                this.f16217z = u.F(this.f16217z).j(uVar).p();
            }
            this.f16195d |= 2097152;
            return this;
        }

        public b U(x xVar) {
            if ((this.f16195d & 8388608) != 8388608 || this.f16193B == x.v()) {
                this.f16193B = xVar;
            } else {
                this.f16193B = x.A(this.f16193B).j(xVar).p();
            }
            this.f16195d |= 8388608;
            return this;
        }

        public b V(int i10) {
            this.f16195d |= 4;
            this.f16198g = i10;
            return this;
        }

        public b W(int i10) {
            this.f16195d |= 1;
            this.f16196e = i10;
            return this;
        }

        public b X(int i10) {
            this.f16195d |= 2;
            this.f16197f = i10;
            return this;
        }

        public b Y(int i10) {
            this.f16195d |= 32768;
            this.f16211t = i10;
            return this;
        }

        public b Z(int i10) {
            this.f16195d |= 131072;
            this.f16213v = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public c build() {
            c cVarT = t();
            if (cVarT.e()) {
                return cVarT;
            }
            throw a.AbstractC0406a.h(cVarT);
        }

        public c t() {
            c cVar = new c(this);
            int i10 = this.f16195d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            cVar.f16170e = this.f16196e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            cVar.f16171f = this.f16197f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            cVar.f16172g = this.f16198g;
            if ((this.f16195d & 8) == 8) {
                this.f16199h = Collections.unmodifiableList(this.f16199h);
                this.f16195d &= -9;
            }
            cVar.f16173h = this.f16199h;
            if ((this.f16195d & 16) == 16) {
                this.f16200i = Collections.unmodifiableList(this.f16200i);
                this.f16195d &= -17;
            }
            cVar.f16174i = this.f16200i;
            if ((this.f16195d & 32) == 32) {
                this.f16201j = Collections.unmodifiableList(this.f16201j);
                this.f16195d &= -33;
            }
            cVar.f16175j = this.f16201j;
            if ((this.f16195d & 64) == 64) {
                this.f16202k = Collections.unmodifiableList(this.f16202k);
                this.f16195d &= -65;
            }
            cVar.f16177l = this.f16202k;
            if ((this.f16195d & 128) == 128) {
                this.f16203l = Collections.unmodifiableList(this.f16203l);
                this.f16195d &= -129;
            }
            cVar.f16179n = this.f16203l;
            if ((this.f16195d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.f16204m = Collections.unmodifiableList(this.f16204m);
                this.f16195d &= -257;
            }
            cVar.f16180o = this.f16204m;
            if ((this.f16195d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f16205n = Collections.unmodifiableList(this.f16205n);
                this.f16195d &= -513;
            }
            cVar.f16182q = this.f16205n;
            if ((this.f16195d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                this.f16206o = Collections.unmodifiableList(this.f16206o);
                this.f16195d &= -1025;
            }
            cVar.f16183r = this.f16206o;
            if ((this.f16195d & 2048) == 2048) {
                this.f16207p = Collections.unmodifiableList(this.f16207p);
                this.f16195d &= -2049;
            }
            cVar.f16184s = this.f16207p;
            if ((this.f16195d & 4096) == 4096) {
                this.f16208q = Collections.unmodifiableList(this.f16208q);
                this.f16195d &= -4097;
            }
            cVar.f16185t = this.f16208q;
            if ((this.f16195d & 8192) == 8192) {
                this.f16209r = Collections.unmodifiableList(this.f16209r);
                this.f16195d &= -8193;
            }
            cVar.f16186u = this.f16209r;
            if ((this.f16195d & 16384) == 16384) {
                this.f16210s = Collections.unmodifiableList(this.f16210s);
                this.f16195d &= -16385;
            }
            cVar.f16187v = this.f16210s;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            cVar.f16189x = this.f16211t;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            cVar.f16190y = this.f16212u;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            cVar.f16191z = this.f16213v;
            if ((this.f16195d & 262144) == 262144) {
                this.f16214w = Collections.unmodifiableList(this.f16214w);
                this.f16195d &= -262145;
            }
            cVar.f16157A = this.f16214w;
            if ((this.f16195d & 524288) == 524288) {
                this.f16215x = Collections.unmodifiableList(this.f16215x);
                this.f16195d &= -524289;
            }
            cVar.f16159C = this.f16215x;
            if ((this.f16195d & 1048576) == 1048576) {
                this.f16216y = Collections.unmodifiableList(this.f16216y);
                this.f16195d &= -1048577;
            }
            cVar.f16160D = this.f16216y;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            cVar.f16162F = this.f16217z;
            if ((this.f16195d & 4194304) == 4194304) {
                this.f16192A = Collections.unmodifiableList(this.f16192A);
                this.f16195d &= -4194305;
            }
            cVar.f16163G = this.f16192A;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            cVar.f16164H = this.f16193B;
            if ((this.f16195d & 16777216) == 16777216) {
                this.f16194C = Collections.unmodifiableList(this.f16194C);
                this.f16195d &= -16777217;
            }
            cVar.f16165I = this.f16194C;
            cVar.f16169d = i11;
            return cVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void P() {
        }
    }
}
