package io.sentry;

import io.sentry.protocol.C5251a;
import io.sentry.protocol.C5252b;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5255e;
import io.sentry.protocol.C5257g;
import io.sentry.protocol.C5260j;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: renamed from: io.sentry.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5201g extends C5253c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5253c f50691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5253c f50692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5253c f50693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I1 f50694f;

    /* JADX INFO: renamed from: io.sentry.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50695a;

        static {
            int[] iArr = new int[I1.values().length];
            f50695a = iArr;
            try {
                iArr[I1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50695a[I1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50695a[I1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5201g(C5253c c5253c, C5253c c5253c2, C5253c c5253c3, I1 i12) {
        this.f50691c = c5253c;
        this.f50692d = c5253c2;
        this.f50693e = c5253c3;
        this.f50694f = i12;
    }

    private C5253c B() {
        int i10 = a.f50695a[this.f50694f.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f50693e : this.f50691c : this.f50692d : this.f50693e;
    }

    private C5253c C() {
        C5253c c5253c = new C5253c();
        c5253c.m(this.f50691c);
        c5253c.m(this.f50692d);
        c5253c.m(this.f50693e);
        return c5253c;
    }

    @Override // io.sentry.protocol.C5253c
    public boolean a(Object obj) {
        return this.f50691c.a(obj) || this.f50692d.a(obj) || this.f50693e.a(obj);
    }

    @Override // io.sentry.protocol.C5253c
    public Set b() {
        return C().b();
    }

    @Override // io.sentry.protocol.C5253c
    public Object c(Object obj) {
        Object objC = this.f50693e.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f50692d.c(obj);
        return objC2 != null ? objC2 : this.f50691c.c(obj);
    }

    @Override // io.sentry.protocol.C5253c
    public C5251a d() {
        C5251a c5251aD = this.f50693e.d();
        if (c5251aD != null) {
            return c5251aD;
        }
        C5251a c5251aD2 = this.f50692d.d();
        return c5251aD2 != null ? c5251aD2 : this.f50691c.d();
    }

    @Override // io.sentry.protocol.C5253c
    public C5255e e() {
        C5255e c5255eE = this.f50693e.e();
        if (c5255eE != null) {
            return c5255eE;
        }
        C5255e c5255eE2 = this.f50692d.e();
        return c5255eE2 != null ? c5255eE2 : this.f50691c.e();
    }

    @Override // io.sentry.protocol.C5253c
    public C5257g f() {
        C5257g c5257gF = this.f50693e.f();
        if (c5257gF != null) {
            return c5257gF;
        }
        C5257g c5257gF2 = this.f50692d.f();
        return c5257gF2 != null ? c5257gF2 : this.f50691c.f();
    }

    @Override // io.sentry.protocol.C5253c
    public io.sentry.protocol.n h() {
        io.sentry.protocol.n nVarH = this.f50693e.h();
        if (nVarH != null) {
            return nVarH;
        }
        io.sentry.protocol.n nVarH2 = this.f50692d.h();
        return nVarH2 != null ? nVarH2 : this.f50691c.h();
    }

    @Override // io.sentry.protocol.C5253c
    public io.sentry.protocol.z i() {
        io.sentry.protocol.z zVarI = this.f50693e.i();
        if (zVarI != null) {
            return zVarI;
        }
        io.sentry.protocol.z zVarI2 = this.f50692d.i();
        return zVarI2 != null ? zVarI2 : this.f50691c.i();
    }

    @Override // io.sentry.protocol.C5253c
    public T3 j() {
        T3 t3J = this.f50693e.j();
        if (t3J != null) {
            return t3J;
        }
        T3 t3J2 = this.f50692d.j();
        return t3J2 != null ? t3J2 : this.f50691c.j();
    }

    @Override // io.sentry.protocol.C5253c
    public Enumeration k() {
        return C().k();
    }

    @Override // io.sentry.protocol.C5253c
    public Object l(String str, Object obj) {
        return B().l(str, obj);
    }

    @Override // io.sentry.protocol.C5253c
    public void m(C5253c c5253c) {
        B().m(c5253c);
    }

    @Override // io.sentry.protocol.C5253c
    public Object n(Object obj) {
        return B().n(obj);
    }

    @Override // io.sentry.protocol.C5253c
    public void o(C5251a c5251a) {
        B().o(c5251a);
    }

    @Override // io.sentry.protocol.C5253c
    public void p(C5252b c5252b) {
        B().p(c5252b);
    }

    @Override // io.sentry.protocol.C5253c
    public void q(C5255e c5255e) {
        B().q(c5255e);
    }

    @Override // io.sentry.protocol.C5253c
    public void r(C5257g c5257g) {
        B().r(c5257g);
    }

    @Override // io.sentry.protocol.C5253c, io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        C().serialize(interfaceC5223k1, iLogger);
    }

    @Override // io.sentry.protocol.C5253c
    public void t(C5260j c5260j) {
        B().t(c5260j);
    }

    @Override // io.sentry.protocol.C5253c
    public void u(io.sentry.protocol.n nVar) {
        B().u(nVar);
    }

    @Override // io.sentry.protocol.C5253c
    public void w(io.sentry.protocol.p pVar) {
        B().w(pVar);
    }

    @Override // io.sentry.protocol.C5253c
    public void x(io.sentry.protocol.z zVar) {
        B().x(zVar);
    }

    @Override // io.sentry.protocol.C5253c
    public void y(io.sentry.protocol.F f10) {
        B().y(f10);
    }

    @Override // io.sentry.protocol.C5253c
    public void z(T3 t32) {
        B().z(t32);
    }
}
