package Xf;

import Td.C2160k;
import Tf.l;
import Wf.AbstractC2358b;
import Wf.C2363g;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class U extends Uf.a implements Wf.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2358b f21943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f21944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2364a f21945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Yf.e f21946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f21948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2363g f21949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2388z f21950h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21951a;

        public a(String str) {
            this.f21951a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21952a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.f21989d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.f21990e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.f21991f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.f21988c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21952a = iArr;
        }
    }

    public U(AbstractC2358b json, e0 mode, AbstractC2364a lexer, Tf.e descriptor, a aVar) {
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(lexer, "lexer");
        AbstractC5504s.h(descriptor, "descriptor");
        this.f21943a = json;
        this.f21944b = mode;
        this.f21945c = lexer;
        this.f21946d = json.a();
        this.f21947e = -1;
        this.f21948f = aVar;
        C2363g c2363gF = json.f();
        this.f21949g = c2363gF;
        this.f21950h = c2363gF.j() ? null : new C2388z(descriptor);
    }

    private final void K() {
        if (this.f21945c.F() != 4) {
            return;
        }
        AbstractC2364a.x(this.f21945c, "Unexpected leading comma", 0, null, 6, null);
        throw new C2160k();
    }

    private final boolean L(Tf.e eVar, int i10) {
        String strG;
        AbstractC2358b abstractC2358b = this.f21943a;
        boolean zP = eVar.p(i10);
        Tf.e eVarN = eVar.n(i10);
        if (zP && !eVarN.i() && this.f21945c.N(true)) {
            return true;
        }
        if (!AbstractC5504s.c(eVarN.h(), l.b.f17533a) || ((eVarN.i() && this.f21945c.N(false)) || (strG = this.f21945c.G(this.f21949g.q())) == null)) {
            return false;
        }
        int i11 = E.i(eVarN, abstractC2358b, strG);
        boolean z10 = !abstractC2358b.f().j() && eVarN.i();
        if (i11 == -3 && (zP || z10)) {
            this.f21945c.o();
            return true;
        }
        return false;
    }

    private final int M() {
        boolean zM = this.f21945c.M();
        if (!this.f21945c.e()) {
            if (!zM || this.f21943a.f().d()) {
                return -1;
            }
            C.h(this.f21945c, "array");
            throw new C2160k();
        }
        int i10 = this.f21947e;
        if (i10 != -1 && !zM) {
            AbstractC2364a.x(this.f21945c, "Expected end of the array or comma", 0, null, 6, null);
            throw new C2160k();
        }
        int i11 = i10 + 1;
        this.f21947e = i11;
        return i11;
    }

    private final int N() {
        int i10 = this.f21947e;
        boolean zM = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f21945c.l(':');
        } else if (i10 != -1) {
            zM = this.f21945c.M();
        }
        if (!this.f21945c.e()) {
            if (!zM || this.f21943a.f().d()) {
                return -1;
            }
            C.i(this.f21945c, null, 1, null);
            throw new C2160k();
        }
        if (z10) {
            if (this.f21947e == -1) {
                AbstractC2364a abstractC2364a = this.f21945c;
                int i11 = abstractC2364a.f21965a;
                if (zM) {
                    AbstractC2364a.x(abstractC2364a, "Unexpected leading comma", i11, null, 4, null);
                    throw new C2160k();
                }
            } else {
                AbstractC2364a abstractC2364a2 = this.f21945c;
                boolean z11 = zM;
                int i12 = abstractC2364a2.f21965a;
                if (!z11) {
                    AbstractC2364a.x(abstractC2364a2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new C2160k();
                }
            }
        }
        int i13 = this.f21947e + 1;
        this.f21947e = i13;
        return i13;
    }

    private final int O(Tf.e eVar) {
        int i10;
        boolean zM;
        boolean zM2 = this.f21945c.M();
        while (true) {
            boolean z10 = true;
            if (!this.f21945c.e()) {
                if (zM2 && !this.f21943a.f().d()) {
                    C.i(this.f21945c, null, 1, null);
                    throw new C2160k();
                }
                C2388z c2388z = this.f21950h;
                if (c2388z != null) {
                    return c2388z.d();
                }
                return -1;
            }
            String strP = P();
            this.f21945c.l(':');
            i10 = E.i(eVar, this.f21943a, strP);
            if (i10 == -3) {
                zM = false;
            } else {
                if (!this.f21949g.g() || !L(eVar, i10)) {
                    break;
                }
                zM = this.f21945c.M();
                z10 = false;
            }
            zM2 = z10 ? Q(strP) : zM;
        }
        C2388z c2388z2 = this.f21950h;
        if (c2388z2 != null) {
            c2388z2.c(i10);
        }
        return i10;
    }

    private final String P() {
        return this.f21949g.q() ? this.f21945c.r() : this.f21945c.i();
    }

    private final boolean Q(String str) {
        if (this.f21949g.k() || S(this.f21948f, str)) {
            this.f21945c.I(this.f21949g.q());
        } else {
            this.f21945c.A(str);
        }
        return this.f21945c.M();
    }

    private final void R(Tf.e eVar) {
        while (i(eVar) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !AbstractC5504s.c(aVar.f21951a, str)) {
            return false;
        }
        aVar.f21951a = null;
        return true;
    }

    @Override // Uf.a, Uf.e
    public String A() {
        return this.f21949g.q() ? this.f21945c.r() : this.f21945c.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    @Override // Uf.a, Uf.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object C(Rf.a r12) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.U.C(Rf.a):java.lang.Object");
    }

    @Override // Uf.a, Uf.e
    public boolean D() {
        C2388z c2388z = this.f21950h;
        return ((c2388z != null ? c2388z.b() : false) || AbstractC2364a.O(this.f21945c, false, 1, null)) ? false : true;
    }

    @Override // Uf.a, Uf.e
    public byte E() {
        long jM = this.f21945c.m();
        byte b10 = (byte) jM;
        if (jM == b10) {
            return b10;
        }
        AbstractC2364a.x(this.f21945c, "Failed to parse byte for input '" + jM + '\'', 0, null, 6, null);
        throw new C2160k();
    }

    @Override // Uf.c
    public Yf.e a() {
        return this.f21946d;
    }

    @Override // Uf.a, Uf.e
    public Uf.c b(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        e0 e0VarB = f0.b(this.f21943a, descriptor);
        this.f21945c.f21966b.c(descriptor);
        this.f21945c.l(e0VarB.f21994a);
        K();
        int i10 = b.f21952a[e0VarB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new U(this.f21943a, e0VarB, this.f21945c, descriptor, this.f21948f) : (this.f21944b == e0VarB && this.f21943a.f().j()) ? this : new U(this.f21943a, e0VarB, this.f21945c, descriptor, this.f21948f);
    }

    @Override // Uf.a, Uf.c
    public void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (this.f21943a.f().k() && descriptor.k() == 0) {
            R(descriptor);
        }
        if (this.f21945c.M() && !this.f21943a.f().d()) {
            C.h(this.f21945c, "");
            throw new C2160k();
        }
        this.f21945c.l(this.f21944b.f21995b);
        this.f21945c.f21966b.b();
    }

    @Override // Wf.h
    public final AbstractC2358b d() {
        return this.f21943a;
    }

    @Override // Uf.a, Uf.c
    public Object e(Tf.e descriptor, int i10, Rf.a deserializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(deserializer, "deserializer");
        boolean z10 = this.f21944b == e0.f21990e && (i10 & 1) == 0;
        if (z10) {
            this.f21945c.f21966b.d();
        }
        Object objE = super.e(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f21945c.f21966b.f(objE);
        }
        return objE;
    }

    @Override // Wf.h
    public Wf.i g() {
        return new Q(this.f21943a.f(), this.f21945c).e();
    }

    @Override // Uf.a, Uf.e
    public int h() {
        long jM = this.f21945c.m();
        int i10 = (int) jM;
        if (jM == i10) {
            return i10;
        }
        AbstractC2364a.x(this.f21945c, "Failed to parse int for input '" + jM + '\'', 0, null, 6, null);
        throw new C2160k();
    }

    @Override // Uf.c
    public int i(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        int i10 = b.f21952a[this.f21944b.ordinal()];
        int iM = i10 != 2 ? i10 != 4 ? M() : O(descriptor) : N();
        if (this.f21944b != e0.f21990e) {
            this.f21945c.f21966b.g(iM);
        }
        return iM;
    }

    @Override // Uf.a, Uf.e
    public Void j() {
        return null;
    }

    @Override // Uf.a, Uf.e
    public int k(Tf.e enumDescriptor) {
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        return E.j(enumDescriptor, this.f21943a, A(), " at path " + this.f21945c.f21966b.a());
    }

    @Override // Uf.a, Uf.e
    public long n() {
        return this.f21945c.m();
    }

    @Override // Uf.a, Uf.e
    public short q() {
        long jM = this.f21945c.m();
        short s10 = (short) jM;
        if (jM == s10) {
            return s10;
        }
        AbstractC2364a.x(this.f21945c, "Failed to parse short for input '" + jM + '\'', 0, null, 6, null);
        throw new C2160k();
    }

    @Override // Uf.a, Uf.e
    public float r() {
        AbstractC2364a abstractC2364a = this.f21945c;
        String strQ = abstractC2364a.q();
        try {
            float f10 = Float.parseFloat(strQ);
            if (this.f21943a.f().b()) {
                return f10;
            }
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            C.l(this.f21945c, Float.valueOf(f10));
            throw new C2160k();
        } catch (IllegalArgumentException unused) {
            AbstractC2364a.x(abstractC2364a, "Failed to parse type 'float' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C2160k();
        }
    }

    @Override // Uf.a, Uf.e
    public double s() {
        AbstractC2364a abstractC2364a = this.f21945c;
        String strQ = abstractC2364a.q();
        try {
            double d10 = Double.parseDouble(strQ);
            if (this.f21943a.f().b()) {
                return d10;
            }
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            C.l(this.f21945c, Double.valueOf(d10));
            throw new C2160k();
        } catch (IllegalArgumentException unused) {
            AbstractC2364a.x(abstractC2364a, "Failed to parse type 'double' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C2160k();
        }
    }

    @Override // Uf.a, Uf.e
    public boolean u() {
        return this.f21945c.g();
    }

    @Override // Uf.a, Uf.e
    public char v() {
        String strQ = this.f21945c.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        AbstractC2364a.x(this.f21945c, "Expected single char, but got '" + strQ + '\'', 0, null, 6, null);
        throw new C2160k();
    }

    @Override // Uf.a, Uf.e
    public Uf.e z(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return W.b(descriptor) ? new C2386x(this.f21945c, this.f21943a) : super.z(descriptor);
    }
}
