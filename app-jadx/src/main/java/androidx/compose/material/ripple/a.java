package androidx.compose.material.ripple;

import B.o;
import Gf.O;
import T.f;
import T.g;
import T.h;
import T.k;
import T.o;
import Td.L;
import Y.C0;
import Y.InterfaceC2453v1;
import Y.b2;
import Y.h2;
import android.view.ViewGroup;
import ie.InterfaceC5082a;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6230l;
import s0.C6385r0;
import s0.E;
import s0.InterfaceC6364j0;
import u0.InterfaceC6708c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d implements InterfaceC2453v1, h {

    /* JADX INFO: renamed from: c */
    private final boolean f26515c;

    /* JADX INFO: renamed from: d */
    private final float f26516d;

    /* JADX INFO: renamed from: e */
    private final h2 f26517e;

    /* JADX INFO: renamed from: f */
    private final h2 f26518f;

    /* JADX INFO: renamed from: g */
    private final ViewGroup f26519g;

    /* JADX INFO: renamed from: h */
    private g f26520h;

    /* JADX INFO: renamed from: i */
    private final C0 f26521i;

    /* JADX INFO: renamed from: j */
    private final C0 f26522j;

    /* JADX INFO: renamed from: k */
    private long f26523k;

    /* JADX INFO: renamed from: l */
    private int f26524l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC5082a f26525m;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0461a extends AbstractC5506u implements InterfaceC5082a {
        C0461a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m69invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m69invoke() {
            a.this.o(!r0.l());
        }
    }

    public /* synthetic */ a(boolean z10, float f10, h2 h2Var, h2 h2Var2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, h2Var, h2Var2, viewGroup);
    }

    private final void k() {
        g gVar = this.f26520h;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final boolean l() {
        return ((Boolean) this.f26522j.getValue()).booleanValue();
    }

    private final g m() {
        g gVar = this.f26520h;
        if (gVar != null) {
            AbstractC5504s.e(gVar);
            return gVar;
        }
        g gVarC = o.c(this.f26519g);
        this.f26520h = gVarC;
        AbstractC5504s.e(gVarC);
        return gVarC;
    }

    private final k n() {
        return (k) this.f26521i.getValue();
    }

    public final void o(boolean z10) {
        this.f26522j.setValue(Boolean.valueOf(z10));
    }

    private final void p(k kVar) {
        this.f26521i.setValue(kVar);
    }

    @Override // x.InterfaceC6988H
    public void a(InterfaceC6708c interfaceC6708c) {
        this.f26523k = interfaceC6708c.f();
        this.f26524l = Float.isNaN(this.f26516d) ? AbstractC5466a.d(f.a(interfaceC6708c, this.f26515c, interfaceC6708c.f())) : interfaceC6708c.s0(this.f26516d);
        long jA = ((C6385r0) this.f26517e.getValue()).A();
        float fD = ((T.d) this.f26518f.getValue()).d();
        interfaceC6708c.B1();
        f(interfaceC6708c, this.f26516d, jA);
        InterfaceC6364j0 interfaceC6364j0B = interfaceC6708c.n1().b();
        l();
        k kVarN = n();
        if (kVarN != null) {
            kVarN.f(interfaceC6708c.f(), jA, fD);
            kVarN.draw(E.d(interfaceC6364j0B));
        }
    }

    @Override // androidx.compose.material.ripple.d
    public void b(o.b bVar, O o10) {
        k kVarB = m().b(this);
        kVarB.b(bVar, this.f26515c, this.f26523k, this.f26524l, ((C6385r0) this.f26517e.getValue()).A(), ((T.d) this.f26518f.getValue()).d(), this.f26525m);
        p(kVarB);
    }

    @Override // T.h
    public void b1() {
        p(null);
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
        k();
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        k();
    }

    @Override // androidx.compose.material.ripple.d
    public void g(o.b bVar) {
        k kVarN = n();
        if (kVarN != null) {
            kVarN.e();
        }
    }

    private a(boolean z10, float f10, h2 h2Var, h2 h2Var2, ViewGroup viewGroup) {
        super(z10, h2Var2);
        this.f26515c = z10;
        this.f26516d = f10;
        this.f26517e = h2Var;
        this.f26518f = h2Var2;
        this.f26519g = viewGroup;
        this.f26521i = b2.e(null, null, 2, null);
        this.f26522j = b2.e(Boolean.TRUE, null, 2, null);
        this.f26523k = C6230l.f58350b.b();
        this.f26524l = -1;
        this.f26525m = new C0461a();
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
    }
}
