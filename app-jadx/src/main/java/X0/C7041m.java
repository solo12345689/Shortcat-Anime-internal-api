package x0;

import Td.L;
import Y.C0;
import Y.b2;
import androidx.compose.ui.graphics.d;
import i1.C5025r;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import r0.C6230l;
import s0.C6344c1;
import s0.InterfaceC6341b1;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: x0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7041m extends AbstractC7040l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7031c f63556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C7029a f63559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC5082a f63560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0 f63561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.compose.ui.graphics.d f63562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0 f63563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f63564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f63565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f63566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Function1 f63567m;

    /* JADX INFO: renamed from: x0.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(AbstractC7040l abstractC7040l) {
            C7041m.this.h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC7040l) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: x0.m$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
            C7031c c7031cL = C7041m.this.l();
            C7041m c7041m = C7041m.this;
            float f10 = c7041m.f63565k;
            float f11 = c7041m.f63566l;
            long jC = C6224f.f58329b.c();
            InterfaceC6709d interfaceC6709dN1 = interfaceC6711f.n1();
            long jF = interfaceC6709dN1.f();
            interfaceC6709dN1.b().p();
            try {
                interfaceC6709dN1.a().f(f10, f11, jC);
                c7031cL.a(interfaceC6711f);
            } finally {
                interfaceC6709dN1.b().k();
                interfaceC6709dN1.e(jF);
            }
        }
    }

    /* JADX INFO: renamed from: x0.m$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f63570a = new c();

        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m977invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m977invoke() {
        }
    }

    public C7041m(C7031c c7031c) {
        super(null);
        this.f63556b = c7031c;
        c7031c.d(new a());
        this.f63557c = "";
        this.f63558d = true;
        this.f63559e = new C7029a();
        this.f63560f = c.f63570a;
        this.f63561g = b2.e(null, null, 2, null);
        C6230l.a aVar = C6230l.f58350b;
        this.f63563i = b2.e(C6230l.c(aVar.b()), null, 2, null);
        this.f63564j = aVar.a();
        this.f63565k = 1.0f;
        this.f63566l = 1.0f;
        this.f63567m = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f63558d = true;
        this.f63560f.invoke();
    }

    @Override // x0.AbstractC7040l
    public void a(InterfaceC6711f interfaceC6711f) {
        i(interfaceC6711f, 1.0f, null);
    }

    public final void i(InterfaceC6711f interfaceC6711f, float f10, androidx.compose.ui.graphics.d dVar) {
        InterfaceC6711f interfaceC6711f2;
        int iA = (this.f63556b.j() && this.f63556b.g() != 16 && AbstractC7043o.f(k()) && AbstractC7043o.f(dVar)) ? C6344c1.f58930b.a() : C6344c1.f58930b.b();
        if (!this.f63558d && C6230l.f(this.f63564j, interfaceC6711f.f()) && C6344c1.i(iA, j())) {
            interfaceC6711f2 = interfaceC6711f;
        } else {
            this.f63562h = C6344c1.i(iA, C6344c1.f58930b.a()) ? d.a.b(androidx.compose.ui.graphics.d.f26763b, this.f63556b.g(), 0, 2, null) : null;
            this.f63565k = Float.intBitsToFloat((int) (interfaceC6711f.f() >> 32)) / Float.intBitsToFloat((int) (m() >> 32));
            this.f63566l = Float.intBitsToFloat((int) (interfaceC6711f.f() & 4294967295L)) / Float.intBitsToFloat((int) (m() & 4294967295L));
            interfaceC6711f2 = interfaceC6711f;
            this.f63559e.b(iA, C5025r.c((((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC6711f.f() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC6711f.f() >> 32))))) << 32)), interfaceC6711f2, interfaceC6711f.getLayoutDirection(), this.f63567m);
            this.f63558d = false;
            this.f63564j = interfaceC6711f2.f();
        }
        if (dVar == null) {
            dVar = k() != null ? k() : this.f63562h;
        }
        this.f63559e.c(interfaceC6711f2, f10, dVar);
    }

    public final int j() {
        InterfaceC6341b1 interfaceC6341b1D = this.f63559e.d();
        return interfaceC6341b1D != null ? interfaceC6341b1D.b() : C6344c1.f58930b.b();
    }

    public final androidx.compose.ui.graphics.d k() {
        return (androidx.compose.ui.graphics.d) this.f63561g.getValue();
    }

    public final C7031c l() {
        return this.f63556b;
    }

    public final long m() {
        return ((C6230l) this.f63563i.getValue()).m();
    }

    public final void n(androidx.compose.ui.graphics.d dVar) {
        this.f63561g.setValue(dVar);
    }

    public final void o(InterfaceC5082a interfaceC5082a) {
        this.f63560f = interfaceC5082a;
    }

    public final void p(String str) {
        this.f63557c = str;
    }

    public final void q(long j10) {
        this.f63563i.setValue(C6230l.c(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.f63557c + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m() & 4294967295L)) + "\n";
        AbstractC5504s.g(str, "toString(...)");
        return str;
    }
}
