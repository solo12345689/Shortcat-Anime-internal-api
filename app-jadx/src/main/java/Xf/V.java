package Xf;

import Wf.AbstractC2358b;
import Wf.C2363g;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class V extends Uf.b implements Wf.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2377n f21953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2358b f21954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f21955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Wf.s[] f21956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Yf.e f21957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2363g f21958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21961i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21962a;

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
            f21962a = iArr;
        }
    }

    public V(C2377n composer, AbstractC2358b json, e0 mode, Wf.s[] sVarArr) {
        AbstractC5504s.h(composer, "composer");
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(mode, "mode");
        this.f21953a = composer;
        this.f21954b = json;
        this.f21955c = mode;
        this.f21956d = sVarArr;
        this.f21957e = d().a();
        this.f21958f = d().f();
        int iOrdinal = mode.ordinal();
        if (sVarArr != null) {
            Wf.s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    private final void J(String str, String str2) {
        this.f21953a.c();
        F(str);
        this.f21953a.f(':');
        this.f21953a.p();
        F(str2);
    }

    @Override // Uf.b, Uf.f
    public Uf.f D(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (W.b(descriptor)) {
            C2377n rVar = this.f21953a;
            if (!(rVar instanceof r)) {
                rVar = new r(rVar.f22003a, this.f21959g);
            }
            return new V(rVar, d(), this.f21955c, (Wf.s[]) null);
        }
        if (W.a(descriptor)) {
            C2377n c2378o = this.f21953a;
            if (!(c2378o instanceof C2378o)) {
                c2378o = new C2378o(c2378o.f22003a, this.f21959g);
            }
            return new V(c2378o, d(), this.f21955c, (Wf.s[]) null);
        }
        if (this.f21960h == null) {
            return super.D(descriptor);
        }
        this.f21961i = descriptor.o();
        return this;
    }

    @Override // Uf.b, Uf.f
    public void E(int i10) {
        if (this.f21959g) {
            F(String.valueOf(i10));
        } else {
            this.f21953a.i(i10);
        }
    }

    @Override // Uf.b, Uf.f
    public void F(String value) {
        AbstractC5504s.h(value, "value");
        this.f21953a.n(value);
    }

    @Override // Uf.b
    public boolean G(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        int i11 = a.f21962a[this.f21955c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f21953a.a()) {
                        this.f21953a.f(',');
                    }
                    this.f21953a.c();
                    F(E.h(descriptor, d(), i10));
                    this.f21953a.f(':');
                    this.f21953a.p();
                } else {
                    if (i10 == 0) {
                        this.f21959g = true;
                    }
                    if (i10 == 1) {
                        this.f21953a.f(',');
                        this.f21953a.p();
                        this.f21959g = false;
                    }
                }
            } else if (this.f21953a.a()) {
                this.f21959g = true;
                this.f21953a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f21953a.f(',');
                    this.f21953a.c();
                    z10 = true;
                } else {
                    this.f21953a.f(':');
                    this.f21953a.p();
                }
                this.f21959g = z10;
            }
        } else {
            if (!this.f21953a.a()) {
                this.f21953a.f(',');
            }
            this.f21953a.c();
        }
        return true;
    }

    @Override // Uf.f
    public Yf.e a() {
        return this.f21957e;
    }

    @Override // Uf.b, Uf.f
    public Uf.d b(Tf.e descriptor) {
        Wf.s sVar;
        AbstractC5504s.h(descriptor, "descriptor");
        e0 e0VarB = f0.b(d(), descriptor);
        char c10 = e0VarB.f21994a;
        if (c10 != 0) {
            this.f21953a.f(c10);
            this.f21953a.b();
        }
        String str = this.f21960h;
        if (str != null) {
            String strO = this.f21961i;
            if (strO == null) {
                strO = descriptor.o();
            }
            J(str, strO);
            this.f21960h = null;
            this.f21961i = null;
        }
        if (this.f21955c == e0VarB) {
            return this;
        }
        Wf.s[] sVarArr = this.f21956d;
        return (sVarArr == null || (sVar = sVarArr[e0VarB.ordinal()]) == null) ? new V(this.f21953a, d(), e0VarB, this.f21956d) : sVar;
    }

    @Override // Uf.b, Uf.d
    public void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (this.f21955c.f21995b != 0) {
            this.f21953a.q();
            this.f21953a.d();
            this.f21953a.f(this.f21955c.f21995b);
        }
    }

    @Override // Wf.s
    public AbstractC2358b d() {
        return this.f21954b;
    }

    @Override // Uf.b, Uf.f
    public void e(Tf.e enumDescriptor, int i10) {
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.l(i10));
    }

    @Override // Uf.b, Uf.d
    public void f(Tf.e descriptor, int i10, Rf.k serializer, Object obj) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(serializer, "serializer");
        if (obj != null || this.f21958f.j()) {
            super.f(descriptor, i10, serializer, obj);
        }
    }

    @Override // Uf.b, Uf.d
    public boolean g(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return this.f21958f.i();
    }

    @Override // Uf.b, Uf.f
    public void i(double d10) {
        if (this.f21959g) {
            F(String.valueOf(d10));
        } else {
            this.f21953a.g(d10);
        }
        if (this.f21958f.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw C.b(Double.valueOf(d10), this.f21953a.f22003a.toString());
        }
    }

    @Override // Uf.b, Uf.f
    public void j(byte b10) {
        if (this.f21959g) {
            F(String.valueOf((int) b10));
        } else {
            this.f21953a.e(b10);
        }
    }

    @Override // Uf.b, Uf.f
    public void s(long j10) {
        if (this.f21959g) {
            F(String.valueOf(j10));
        } else {
            this.f21953a.j(j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // Uf.b, Uf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(Rf.k r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.V.t(Rf.k, java.lang.Object):void");
    }

    @Override // Uf.b, Uf.f
    public void v() {
        this.f21953a.k("null");
    }

    @Override // Uf.b, Uf.f
    public void w(short s10) {
        if (this.f21959g) {
            F(String.valueOf((int) s10));
        } else {
            this.f21953a.l(s10);
        }
    }

    @Override // Uf.b, Uf.f
    public void x(boolean z10) {
        if (this.f21959g) {
            F(String.valueOf(z10));
        } else {
            this.f21953a.m(z10);
        }
    }

    @Override // Uf.b, Uf.f
    public void y(float f10) {
        if (this.f21959g) {
            F(String.valueOf(f10));
        } else {
            this.f21953a.h(f10);
        }
        if (this.f21958f.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw C.b(Float.valueOf(f10), this.f21953a.f22003a.toString());
        }
    }

    @Override // Uf.b, Uf.f
    public void z(char c10) {
        F(String.valueOf(c10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC2385w output, AbstractC2358b json, e0 mode, Wf.s[] modeReuseCache) {
        this(AbstractC2382t.a(output, json), json, mode, modeReuseCache);
        AbstractC5504s.h(output, "output");
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(modeReuseCache, "modeReuseCache");
    }
}
