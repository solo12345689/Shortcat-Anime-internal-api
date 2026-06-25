package q1;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.HashMap;
import o1.C5801b;
import q1.g;
import t1.C6591d;
import t1.C6592e;

/* JADX INFO: renamed from: q1.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6068a implements f {

    /* JADX INFO: renamed from: a */
    private Object f56154a;

    /* JADX INFO: renamed from: b */
    final g f56156b;

    /* JADX INFO: renamed from: c0 */
    private float f56159c0;

    /* JADX INFO: renamed from: d0 */
    private float f56161d0;

    /* JADX INFO: renamed from: f0 */
    d f56165f0;

    /* JADX INFO: renamed from: g0 */
    d f56167g0;

    /* JADX INFO: renamed from: h0 */
    private Object f56169h0;

    /* JADX INFO: renamed from: i0 */
    private C6592e f56171i0;

    /* JADX INFO: renamed from: j0 */
    private HashMap f56173j0;

    /* JADX INFO: renamed from: k0 */
    private HashMap f56175k0;

    /* JADX INFO: renamed from: l0 */
    C5801b f56177l0;

    /* JADX INFO: renamed from: c */
    String f56158c = null;

    /* JADX INFO: renamed from: d */
    r1.e f56160d = null;

    /* JADX INFO: renamed from: e */
    int f56162e = 0;

    /* JADX INFO: renamed from: f */
    int f56164f = 0;

    /* JADX INFO: renamed from: g */
    float f56166g = -1.0f;

    /* JADX INFO: renamed from: h */
    float f56168h = -1.0f;

    /* JADX INFO: renamed from: i */
    protected float f56170i = 0.5f;

    /* JADX INFO: renamed from: j */
    protected float f56172j = 0.5f;

    /* JADX INFO: renamed from: k */
    protected int f56174k = 0;

    /* JADX INFO: renamed from: l */
    protected int f56176l = 0;

    /* JADX INFO: renamed from: m */
    protected int f56178m = 0;

    /* JADX INFO: renamed from: n */
    protected int f56179n = 0;

    /* JADX INFO: renamed from: o */
    protected int f56180o = 0;

    /* JADX INFO: renamed from: p */
    protected int f56181p = 0;

    /* JADX INFO: renamed from: q */
    protected int f56182q = 0;

    /* JADX INFO: renamed from: r */
    protected int f56183r = 0;

    /* JADX INFO: renamed from: s */
    protected int f56184s = 0;

    /* JADX INFO: renamed from: t */
    protected int f56185t = 0;

    /* JADX INFO: renamed from: u */
    protected int f56186u = 0;

    /* JADX INFO: renamed from: v */
    protected int f56187v = 0;

    /* JADX INFO: renamed from: w */
    int f56188w = 0;

    /* JADX INFO: renamed from: x */
    int f56189x = 0;

    /* JADX INFO: renamed from: y */
    float f56190y = Float.NaN;

    /* JADX INFO: renamed from: z */
    float f56191z = Float.NaN;

    /* JADX INFO: renamed from: A */
    float f56128A = Float.NaN;

    /* JADX INFO: renamed from: B */
    float f56129B = Float.NaN;

    /* JADX INFO: renamed from: C */
    float f56130C = Float.NaN;

    /* JADX INFO: renamed from: D */
    float f56131D = Float.NaN;

    /* JADX INFO: renamed from: E */
    float f56132E = Float.NaN;

    /* JADX INFO: renamed from: F */
    float f56133F = Float.NaN;

    /* JADX INFO: renamed from: G */
    float f56134G = Float.NaN;

    /* JADX INFO: renamed from: H */
    float f56135H = Float.NaN;

    /* JADX INFO: renamed from: I */
    float f56136I = Float.NaN;

    /* JADX INFO: renamed from: J */
    int f56137J = 0;

    /* JADX INFO: renamed from: K */
    protected Object f56138K = null;

    /* JADX INFO: renamed from: L */
    protected Object f56139L = null;

    /* JADX INFO: renamed from: M */
    protected Object f56140M = null;

    /* JADX INFO: renamed from: N */
    protected Object f56141N = null;

    /* JADX INFO: renamed from: O */
    protected Object f56142O = null;

    /* JADX INFO: renamed from: P */
    protected Object f56143P = null;

    /* JADX INFO: renamed from: Q */
    protected Object f56144Q = null;

    /* JADX INFO: renamed from: R */
    protected Object f56145R = null;

    /* JADX INFO: renamed from: S */
    protected Object f56146S = null;

    /* JADX INFO: renamed from: T */
    protected Object f56147T = null;

    /* JADX INFO: renamed from: U */
    Object f56148U = null;

    /* JADX INFO: renamed from: V */
    protected Object f56149V = null;

    /* JADX INFO: renamed from: W */
    protected Object f56150W = null;

    /* JADX INFO: renamed from: X */
    Object f56151X = null;

    /* JADX INFO: renamed from: Y */
    Object f56152Y = null;

    /* JADX INFO: renamed from: Z */
    Object f56153Z = null;

    /* JADX INFO: renamed from: a0 */
    Object f56155a0 = null;

    /* JADX INFO: renamed from: b0 */
    Object f56157b0 = null;

    /* JADX INFO: renamed from: e0 */
    g.b f56163e0 = null;

    /* JADX INFO: renamed from: q1.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class C0863a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f56192a;

        static {
            int[] iArr = new int[g.b.values().length];
            f56192a = iArr;
            try {
                iArr[g.b.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56192a[g.b.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56192a[g.b.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56192a[g.b.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56192a[g.b.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56192a[g.b.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56192a[g.b.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56192a[g.b.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f56192a[g.b.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f56192a[g.b.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f56192a[g.b.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f56192a[g.b.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f56192a[g.b.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f56192a[g.b.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f56192a[g.b.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f56192a[g.b.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f56192a[g.b.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f56192a[g.b.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f56192a[g.b.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f56192a[g.b.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public C6068a(g gVar) {
        Object obj = d.f56210j;
        this.f56165f0 = d.c(obj);
        this.f56167g0 = d.c(obj);
        this.f56173j0 = new HashMap();
        this.f56175k0 = new HashMap();
        this.f56177l0 = null;
        this.f56156b = gVar;
    }

    private Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof C6068a) ? this.f56156b.t(obj) : obj;
    }

    private C6592e D(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).a();
        }
        return null;
    }

    private void h(C6592e c6592e, Object obj, g.b bVar) {
        C6592e c6592eD = D(obj);
        if (c6592eD == null) {
            return;
        }
        int[] iArr = C0863a.f56192a;
        int i10 = iArr[bVar.ordinal()];
        switch (iArr[bVar.ordinal()]) {
            case 1:
                C6591d.a aVar = C6591d.a.LEFT;
                c6592e.o(aVar).b(c6592eD.o(aVar), this.f56174k, this.f56182q, false);
                break;
            case 2:
                c6592e.o(C6591d.a.LEFT).b(c6592eD.o(C6591d.a.RIGHT), this.f56174k, this.f56182q, false);
                break;
            case 3:
                c6592e.o(C6591d.a.RIGHT).b(c6592eD.o(C6591d.a.LEFT), this.f56176l, this.f56183r, false);
                break;
            case 4:
                C6591d.a aVar2 = C6591d.a.RIGHT;
                c6592e.o(aVar2).b(c6592eD.o(aVar2), this.f56176l, this.f56183r, false);
                break;
            case 5:
                C6591d.a aVar3 = C6591d.a.LEFT;
                c6592e.o(aVar3).b(c6592eD.o(aVar3), this.f56178m, this.f56184s, false);
                break;
            case 6:
                c6592e.o(C6591d.a.LEFT).b(c6592eD.o(C6591d.a.RIGHT), this.f56178m, this.f56184s, false);
                break;
            case 7:
                c6592e.o(C6591d.a.RIGHT).b(c6592eD.o(C6591d.a.LEFT), this.f56179n, this.f56185t, false);
                break;
            case 8:
                C6591d.a aVar4 = C6591d.a.RIGHT;
                c6592e.o(aVar4).b(c6592eD.o(aVar4), this.f56179n, this.f56185t, false);
                break;
            case 9:
                C6591d.a aVar5 = C6591d.a.TOP;
                c6592e.o(aVar5).b(c6592eD.o(aVar5), this.f56180o, this.f56186u, false);
                break;
            case 10:
                c6592e.o(C6591d.a.TOP).b(c6592eD.o(C6591d.a.BOTTOM), this.f56180o, this.f56186u, false);
                break;
            case 11:
                c6592e.d0(C6591d.a.TOP, c6592eD, C6591d.a.BASELINE, this.f56180o, this.f56186u);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                c6592e.o(C6591d.a.BOTTOM).b(c6592eD.o(C6591d.a.TOP), this.f56181p, this.f56187v, false);
                break;
            case 13:
                C6591d.a aVar6 = C6591d.a.BOTTOM;
                c6592e.o(aVar6).b(c6592eD.o(aVar6), this.f56181p, this.f56187v, false);
                break;
            case 14:
                c6592e.d0(C6591d.a.BOTTOM, c6592eD, C6591d.a.BASELINE, this.f56181p, this.f56187v);
                break;
            case 15:
                c6592e.d0(C6591d.a.BASELINE, c6592eD, C6591d.a.BOTTOM, this.f56188w, this.f56189x);
                break;
            case 16:
                c6592e.d0(C6591d.a.BASELINE, c6592eD, C6591d.a.TOP, this.f56188w, this.f56189x);
                break;
            case 17:
                C6591d.a aVar7 = C6591d.a.BASELINE;
                c6592e.d0(aVar7, c6592eD, aVar7, this.f56188w, this.f56189x);
                break;
            case 18:
                c6592e.l(c6592eD, this.f56159c0, (int) this.f56161d0);
                break;
        }
    }

    private void x() {
        this.f56138K = B(this.f56138K);
        this.f56139L = B(this.f56139L);
        this.f56140M = B(this.f56140M);
        this.f56141N = B(this.f56141N);
        this.f56142O = B(this.f56142O);
        this.f56143P = B(this.f56143P);
        this.f56144Q = B(this.f56144Q);
        this.f56145R = B(this.f56145R);
        this.f56146S = B(this.f56146S);
        this.f56147T = B(this.f56147T);
        this.f56149V = B(this.f56149V);
        this.f56150W = B(this.f56150W);
        this.f56152Y = B(this.f56152Y);
        this.f56153Z = B(this.f56153Z);
        this.f56155a0 = B(this.f56155a0);
    }

    public C6068a A(Object obj) {
        this.f56163e0 = g.b.END_TO_START;
        this.f56144Q = obj;
        return this;
    }

    public d C() {
        return this.f56167g0;
    }

    public d E() {
        return this.f56165f0;
    }

    public C6068a F(float f10) {
        this.f56170i = f10;
        return this;
    }

    public C6068a G() {
        if (this.f56138K != null) {
            this.f56163e0 = g.b.LEFT_TO_LEFT;
            return this;
        }
        this.f56163e0 = g.b.LEFT_TO_RIGHT;
        return this;
    }

    public C6068a H(Object obj) {
        this.f56163e0 = g.b.LEFT_TO_LEFT;
        this.f56138K = obj;
        return this;
    }

    public C6068a I(Object obj) {
        this.f56163e0 = g.b.LEFT_TO_RIGHT;
        this.f56139L = obj;
        return this;
    }

    public C6068a J(int i10) {
        g.b bVar = this.f56163e0;
        if (bVar == null) {
            this.f56174k = i10;
            this.f56176l = i10;
            this.f56178m = i10;
            this.f56179n = i10;
            this.f56180o = i10;
            this.f56181p = i10;
            return this;
        }
        switch (C0863a.f56192a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f56174k = i10;
                break;
            case 3:
            case 4:
                this.f56176l = i10;
                break;
            case 5:
            case 6:
                this.f56178m = i10;
                break;
            case 7:
            case 8:
                this.f56179n = i10;
                break;
            case 9:
            case 10:
            case 11:
                this.f56180o = i10;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
                this.f56181p = i10;
                break;
            case 15:
            case 16:
            case 17:
                this.f56188w = i10;
                break;
            case 18:
                this.f56161d0 = i10;
                break;
        }
        return this;
    }

    public C6068a K(Object obj) {
        return J(this.f56156b.e(obj));
    }

    public C6068a L(int i10) {
        g.b bVar = this.f56163e0;
        if (bVar == null) {
            this.f56182q = i10;
            this.f56183r = i10;
            this.f56184s = i10;
            this.f56185t = i10;
            this.f56186u = i10;
            this.f56187v = i10;
            return this;
        }
        switch (C0863a.f56192a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f56182q = i10;
                break;
            case 3:
            case 4:
                this.f56183r = i10;
                break;
            case 5:
            case 6:
                this.f56184s = i10;
                break;
            case 7:
            case 8:
                this.f56185t = i10;
                break;
            case 9:
            case 10:
            case 11:
                this.f56186u = i10;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
                this.f56187v = i10;
                break;
            case 15:
            case 16:
            case 17:
                this.f56189x = i10;
                break;
        }
        return this;
    }

    public C6068a M(Object obj) {
        return L(this.f56156b.e(obj));
    }

    public C6068a N(float f10) {
        this.f56190y = f10;
        return this;
    }

    public C6068a O(float f10) {
        this.f56191z = f10;
        return this;
    }

    public C6068a P() {
        if (this.f56140M != null) {
            this.f56163e0 = g.b.RIGHT_TO_LEFT;
            return this;
        }
        this.f56163e0 = g.b.RIGHT_TO_RIGHT;
        return this;
    }

    public C6068a Q(Object obj) {
        this.f56163e0 = g.b.RIGHT_TO_LEFT;
        this.f56140M = obj;
        return this;
    }

    public C6068a R(Object obj) {
        this.f56163e0 = g.b.RIGHT_TO_RIGHT;
        this.f56141N = obj;
        return this;
    }

    public C6068a S(float f10) {
        this.f56128A = f10;
        return this;
    }

    public C6068a T(float f10) {
        this.f56129B = f10;
        return this;
    }

    public C6068a U(float f10) {
        this.f56130C = f10;
        return this;
    }

    public C6068a V(float f10) {
        this.f56135H = f10;
        return this;
    }

    public C6068a W(float f10) {
        this.f56136I = f10;
        return this;
    }

    public void X(r1.e eVar) {
        this.f56160d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public C6068a Y(d dVar) {
        this.f56167g0 = dVar;
        return this;
    }

    public void Z(int i10) {
        this.f56162e = i10;
    }

    @Override // q1.f
    public C6592e a() {
        if (this.f56171i0 == null) {
            C6592e c6592eW = w();
            this.f56171i0 = c6592eW;
            c6592eW.x0(this.f56169h0);
        }
        return this.f56171i0;
    }

    public void a0(float f10) {
        this.f56166g = f10;
    }

    @Override // q1.f
    public void apply() {
        if (this.f56171i0 == null) {
            return;
        }
        r1.e eVar = this.f56160d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f56165f0.a(this.f56156b, this.f56171i0, 0);
        this.f56167g0.a(this.f56156b, this.f56171i0, 1);
        x();
        i();
        int i10 = this.f56162e;
        if (i10 != 0) {
            this.f56171i0.J0(i10);
        }
        int i11 = this.f56164f;
        if (i11 != 0) {
            this.f56171i0.a1(i11);
        }
        float f10 = this.f56166g;
        if (f10 != -1.0f) {
            this.f56171i0.N0(f10);
        }
        float f11 = this.f56168h;
        if (f11 != -1.0f) {
            this.f56171i0.e1(f11);
        }
        this.f56171i0.I0(this.f56170i);
        this.f56171i0.Z0(this.f56172j);
        C6592e c6592e = this.f56171i0;
        h hVar = c6592e.f60379n;
        hVar.f56297f = this.f56190y;
        hVar.f56298g = this.f56191z;
        hVar.f56299h = this.f56128A;
        hVar.f56300i = this.f56129B;
        hVar.f56301j = this.f56130C;
        hVar.f56302k = this.f56131D;
        hVar.f56303l = this.f56132E;
        hVar.f56304m = this.f56133F;
        hVar.f56305n = this.f56135H;
        hVar.f56306o = this.f56136I;
        hVar.f56307p = this.f56134G;
        int i12 = this.f56137J;
        hVar.f56309r = i12;
        c6592e.f1(i12);
        this.f56171i0.f60379n.i(this.f56177l0);
        HashMap map = this.f56173j0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f56171i0.f60379n.h(str, 902, ((Integer) this.f56173j0.get(str)).intValue());
            }
        }
        HashMap map2 = this.f56175k0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f56171i0.f60379n.g(str2, 901, ((Float) this.f56175k0.get(str2)).floatValue());
            }
        }
    }

    @Override // q1.f
    public void b(C6592e c6592e) {
        if (c6592e == null) {
            return;
        }
        this.f56171i0 = c6592e;
        c6592e.x0(this.f56169h0);
    }

    public void b0(String str) {
        this.f56158c = str;
    }

    @Override // q1.f
    public void c(Object obj) {
        this.f56154a = obj;
    }

    public void c0(int i10) {
        this.f56164f = i10;
    }

    @Override // q1.f
    public r1.e d() {
        return this.f56160d;
    }

    public void d0(float f10) {
        this.f56168h = f10;
    }

    public void e(String str, int i10) {
        this.f56173j0.put(str, Integer.valueOf(i10));
    }

    public void e0(Object obj) {
        this.f56169h0 = obj;
        C6592e c6592e = this.f56171i0;
        if (c6592e != null) {
            c6592e.x0(obj);
        }
    }

    public void f(String str, float f10) {
        if (this.f56175k0 == null) {
            this.f56175k0 = new HashMap();
        }
        this.f56175k0.put(str, Float.valueOf(f10));
    }

    public C6068a f0(d dVar) {
        this.f56165f0 = dVar;
        return this;
    }

    public C6068a g(float f10) {
        this.f56134G = f10;
        return this;
    }

    public C6068a g0() {
        if (this.f56142O != null) {
            this.f56163e0 = g.b.START_TO_START;
            return this;
        }
        this.f56163e0 = g.b.START_TO_END;
        return this;
    }

    @Override // q1.f
    public Object getKey() {
        return this.f56154a;
    }

    public C6068a h0(Object obj) {
        this.f56163e0 = g.b.START_TO_END;
        this.f56143P = obj;
        return this;
    }

    public void i() {
        h(this.f56171i0, this.f56138K, g.b.LEFT_TO_LEFT);
        h(this.f56171i0, this.f56139L, g.b.LEFT_TO_RIGHT);
        h(this.f56171i0, this.f56140M, g.b.RIGHT_TO_LEFT);
        h(this.f56171i0, this.f56141N, g.b.RIGHT_TO_RIGHT);
        h(this.f56171i0, this.f56142O, g.b.START_TO_START);
        h(this.f56171i0, this.f56143P, g.b.START_TO_END);
        h(this.f56171i0, this.f56144Q, g.b.END_TO_START);
        h(this.f56171i0, this.f56145R, g.b.END_TO_END);
        h(this.f56171i0, this.f56146S, g.b.TOP_TO_TOP);
        h(this.f56171i0, this.f56147T, g.b.TOP_TO_BOTTOM);
        h(this.f56171i0, this.f56148U, g.b.TOP_TO_BASELINE);
        h(this.f56171i0, this.f56149V, g.b.BOTTOM_TO_TOP);
        h(this.f56171i0, this.f56150W, g.b.BOTTOM_TO_BOTTOM);
        h(this.f56171i0, this.f56151X, g.b.BOTTOM_TO_BASELINE);
        h(this.f56171i0, this.f56152Y, g.b.BASELINE_TO_BASELINE);
        h(this.f56171i0, this.f56153Z, g.b.BASELINE_TO_TOP);
        h(this.f56171i0, this.f56155a0, g.b.BASELINE_TO_BOTTOM);
        h(this.f56171i0, this.f56157b0, g.b.CIRCULAR_CONSTRAINT);
    }

    public C6068a i0(Object obj) {
        this.f56163e0 = g.b.START_TO_START;
        this.f56142O = obj;
        return this;
    }

    public C6068a j() {
        this.f56163e0 = g.b.BASELINE_TO_BASELINE;
        return this;
    }

    public C6068a j0() {
        if (this.f56146S != null) {
            this.f56163e0 = g.b.TOP_TO_TOP;
            return this;
        }
        this.f56163e0 = g.b.TOP_TO_BOTTOM;
        return this;
    }

    public C6068a k(Object obj) {
        this.f56163e0 = g.b.BASELINE_TO_BASELINE;
        this.f56152Y = obj;
        return this;
    }

    C6068a k0(Object obj) {
        this.f56163e0 = g.b.TOP_TO_BASELINE;
        this.f56148U = obj;
        return this;
    }

    public C6068a l(Object obj) {
        this.f56163e0 = g.b.BASELINE_TO_BOTTOM;
        this.f56155a0 = obj;
        return this;
    }

    public C6068a l0(Object obj) {
        this.f56163e0 = g.b.TOP_TO_BOTTOM;
        this.f56147T = obj;
        return this;
    }

    public C6068a m(Object obj) {
        this.f56163e0 = g.b.BASELINE_TO_TOP;
        this.f56153Z = obj;
        return this;
    }

    public C6068a m0(Object obj) {
        this.f56163e0 = g.b.TOP_TO_TOP;
        this.f56146S = obj;
        return this;
    }

    public C6068a n() {
        if (this.f56149V != null) {
            this.f56163e0 = g.b.BOTTOM_TO_TOP;
            return this;
        }
        this.f56163e0 = g.b.BOTTOM_TO_BOTTOM;
        return this;
    }

    public C6068a n0(float f10) {
        this.f56131D = f10;
        return this;
    }

    C6068a o(Object obj) {
        this.f56163e0 = g.b.BOTTOM_TO_BASELINE;
        this.f56151X = obj;
        return this;
    }

    public C6068a o0(float f10) {
        this.f56132E = f10;
        return this;
    }

    public C6068a p(Object obj) {
        this.f56163e0 = g.b.BOTTOM_TO_BOTTOM;
        this.f56150W = obj;
        return this;
    }

    public C6068a p0(float f10) {
        this.f56133F = f10;
        return this;
    }

    public C6068a q(Object obj) {
        this.f56163e0 = g.b.BOTTOM_TO_TOP;
        this.f56149V = obj;
        return this;
    }

    public C6068a q0(float f10) {
        this.f56172j = f10;
        return this;
    }

    public C6068a r(Object obj, float f10, float f11) {
        this.f56157b0 = B(obj);
        this.f56159c0 = f10;
        this.f56161d0 = f11;
        this.f56163e0 = g.b.CIRCULAR_CONSTRAINT;
        return this;
    }

    public C6068a r0(int i10) {
        this.f56137J = i10;
        return this;
    }

    public C6068a s() {
        g.b bVar = this.f56163e0;
        if (bVar == null) {
            t();
            return this;
        }
        switch (C0863a.f56192a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f56138K = null;
                this.f56139L = null;
                this.f56174k = 0;
                this.f56182q = 0;
                break;
            case 3:
            case 4:
                this.f56140M = null;
                this.f56141N = null;
                this.f56176l = 0;
                this.f56183r = 0;
                break;
            case 5:
            case 6:
                this.f56142O = null;
                this.f56143P = null;
                this.f56178m = 0;
                this.f56184s = 0;
                break;
            case 7:
            case 8:
                this.f56144Q = null;
                this.f56145R = null;
                this.f56179n = 0;
                this.f56185t = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.f56146S = null;
                this.f56147T = null;
                this.f56148U = null;
                this.f56180o = 0;
                this.f56186u = 0;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
                this.f56149V = null;
                this.f56150W = null;
                this.f56151X = null;
                this.f56181p = 0;
                this.f56187v = 0;
                break;
            case 17:
                this.f56152Y = null;
                break;
            case 18:
                this.f56157b0 = null;
                break;
        }
        return this;
    }

    public C6068a t() {
        this.f56138K = null;
        this.f56139L = null;
        this.f56174k = 0;
        this.f56140M = null;
        this.f56141N = null;
        this.f56176l = 0;
        this.f56142O = null;
        this.f56143P = null;
        this.f56178m = 0;
        this.f56144Q = null;
        this.f56145R = null;
        this.f56179n = 0;
        this.f56146S = null;
        this.f56147T = null;
        this.f56180o = 0;
        this.f56149V = null;
        this.f56150W = null;
        this.f56181p = 0;
        this.f56152Y = null;
        this.f56157b0 = null;
        this.f56170i = 0.5f;
        this.f56172j = 0.5f;
        this.f56182q = 0;
        this.f56183r = 0;
        this.f56184s = 0;
        this.f56185t = 0;
        this.f56186u = 0;
        this.f56187v = 0;
        return this;
    }

    public C6068a u() {
        g0().s();
        y().s();
        G().s();
        P().s();
        return this;
    }

    public C6068a v() {
        j0().s();
        j().s();
        n().s();
        return this;
    }

    public C6592e w() {
        return new C6592e(E().k(), C().k());
    }

    public C6068a y() {
        if (this.f56144Q != null) {
            this.f56163e0 = g.b.END_TO_START;
            return this;
        }
        this.f56163e0 = g.b.END_TO_END;
        return this;
    }

    public C6068a z(Object obj) {
        this.f56163e0 = g.b.END_TO_END;
        this.f56145R = obj;
        return this;
    }
}
