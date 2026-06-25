package androidx.compose.ui.draw;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1797k0;
import K0.AbstractC1807u;
import K0.InterfaceC1795j0;
import Td.C2160k;
import Td.L;
import androidx.compose.ui.e;
import i1.AbstractC5026s;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.C5911f;
import p0.InterfaceC5909d;
import p0.InterfaceC5910e;
import p0.j;
import s0.Z0;
import u0.InterfaceC6708c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class a extends e.c implements InterfaceC5910e, InterfaceC1795j0, InterfaceC5909d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5911f f26603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f26605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function1 f26606d;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0464a extends AbstractC5506u implements InterfaceC5082a {
        C0464a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0 invoke() {
            return a.this.F1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5911f f26609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5911f c5911f) {
            super(0);
            this.f26609b = c5911f;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m72invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m72invoke() {
            a.this.E1().invoke(this.f26609b);
        }
    }

    public a(C5911f c5911f, Function1 function1) {
        this.f26603a = c5911f;
        this.f26606d = function1;
        c5911f.q(this);
        c5911f.I(new C0464a());
    }

    private final j G1(InterfaceC6708c interfaceC6708c) {
        if (!this.f26604b) {
            C5911f c5911f = this.f26603a;
            c5911f.B(null);
            c5911f.z(interfaceC6708c);
            AbstractC1797k0.a(this, new b(c5911f));
            if (c5911f.b() == null) {
                H0.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new C2160k();
            }
            this.f26604b = true;
        }
        j jVarB = this.f26603a.b();
        AbstractC5504s.e(jVarB);
        return jVarB;
    }

    public final Function1 E1() {
        return this.f26606d;
    }

    public final Z0 F1() {
        e eVar = this.f26605c;
        if (eVar == null) {
            eVar = new e();
            this.f26605c = eVar;
        }
        if (eVar.c() == null) {
            eVar.e(AbstractC1796k.k(this));
        }
        return eVar;
    }

    @Override // p0.InterfaceC5910e
    public void H0() {
        e eVar = this.f26605c;
        if (eVar != null) {
            eVar.d();
        }
        this.f26604b = false;
        this.f26603a.B(null);
        AbstractC1807u.a(this);
    }

    public final void H1(Function1 function1) {
        this.f26606d = function1;
        H0();
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        G1(interfaceC6708c).a().invoke(interfaceC6708c);
    }

    @Override // p0.InterfaceC5909d
    public long f() {
        return AbstractC5026s.d(AbstractC1796k.i(this, AbstractC1789g0.a(128)).a());
    }

    @Override // p0.InterfaceC5909d
    public InterfaceC5011d getDensity() {
        return AbstractC1796k.j(this);
    }

    @Override // p0.InterfaceC5909d
    public EnumC5027t getLayoutDirection() {
        return AbstractC1796k.m(this);
    }

    @Override // K0.InterfaceC1794j, K0.v0
    public void onDensityChange() {
        H0();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        super.onDetach();
        e eVar = this.f26605c;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // K0.InterfaceC1794j
    public void onLayoutDirectionChange() {
        H0();
    }

    @Override // K0.InterfaceC1806t
    public void onMeasureResultChanged() {
        H0();
    }

    @Override // androidx.compose.ui.e.c
    public void onReset() {
        super.onReset();
        H0();
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        H0();
    }
}
