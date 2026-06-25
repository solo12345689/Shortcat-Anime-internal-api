package androidx.compose.foundation;

import K0.AbstractC1797k0;
import K0.AbstractC1807u;
import K0.InterfaceC1795j0;
import K0.InterfaceC1806t;
import Td.L;
import androidx.compose.ui.e;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import r0.C6230l;
import s0.AbstractC6358h0;
import s0.AbstractC6362i1;
import s0.AbstractC6365j1;
import s0.C6385r0;
import s0.E1;
import s0.t1;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c extends e.c implements InterfaceC1806t, InterfaceC1795j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC6358h0 f25819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f25820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E1 f25821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EnumC5027t f25823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AbstractC6362i1 f25824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private E1 f25825h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f25826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f25827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6708c f25828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n10, c cVar, InterfaceC6708c interfaceC6708c) {
            super(0);
            this.f25826a = n10;
            this.f25827b = cVar;
            this.f25828c = interfaceC6708c;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            this.f25826a.f52259a = this.f25827b.H1().mo6createOutlinePq9zytI(this.f25828c.f(), this.f25828c.getLayoutDirection(), this.f25828c);
        }
    }

    public /* synthetic */ c(long j10, AbstractC6358h0 abstractC6358h0, float f10, E1 e12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, abstractC6358h0, f10, e12);
    }

    private final void E1(InterfaceC6708c interfaceC6708c) {
        InterfaceC6708c interfaceC6708c2;
        AbstractC6362i1 abstractC6362i1G1 = G1(interfaceC6708c);
        if (C6385r0.s(this.f25818a, C6385r0.f58985b.j())) {
            interfaceC6708c2 = interfaceC6708c;
        } else {
            interfaceC6708c2 = interfaceC6708c;
            AbstractC6365j1.e(interfaceC6708c2, abstractC6362i1G1, this.f25818a, 0.0f, null, null, 0, 60, null);
        }
        AbstractC6358h0 abstractC6358h0 = this.f25819b;
        if (abstractC6358h0 != null) {
            AbstractC6365j1.c(interfaceC6708c2, abstractC6362i1G1, abstractC6358h0, this.f25820c, null, null, 0, 56, null);
        }
    }

    private final void F1(InterfaceC6708c interfaceC6708c) {
        if (!C6385r0.s(this.f25818a, C6385r0.f58985b.j())) {
            InterfaceC6711f.B0(interfaceC6708c, this.f25818a, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        AbstractC6358h0 abstractC6358h0 = this.f25819b;
        if (abstractC6358h0 != null) {
            InterfaceC6711f.P(interfaceC6708c, abstractC6358h0, 0L, 0L, this.f25820c, null, null, 0, 118, null);
        }
    }

    private final AbstractC6362i1 G1(InterfaceC6708c interfaceC6708c) {
        N n10 = new N();
        if (C6230l.f(interfaceC6708c.f(), this.f25822e) && interfaceC6708c.getLayoutDirection() == this.f25823f && AbstractC5504s.c(this.f25825h, this.f25821d)) {
            AbstractC6362i1 abstractC6362i1 = this.f25824g;
            AbstractC5504s.e(abstractC6362i1);
            n10.f52259a = abstractC6362i1;
        } else {
            AbstractC1797k0.a(this, new a(n10, this, interfaceC6708c));
        }
        this.f25824g = (AbstractC6362i1) n10.f52259a;
        this.f25822e = interfaceC6708c.f();
        this.f25823f = interfaceC6708c.getLayoutDirection();
        this.f25825h = this.f25821d;
        Object obj = n10.f52259a;
        AbstractC5504s.e(obj);
        return (AbstractC6362i1) obj;
    }

    public final E1 H1() {
        return this.f25821d;
    }

    public final void I1(AbstractC6358h0 abstractC6358h0) {
        this.f25819b = abstractC6358h0;
    }

    public final void J1(long j10) {
        this.f25818a = j10;
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        if (this.f25821d == t1.a()) {
            F1(interfaceC6708c);
        } else {
            E1(interfaceC6708c);
        }
        interfaceC6708c.B1();
    }

    public final void e(float f10) {
        this.f25820c = f10;
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        this.f25822e = C6230l.f58350b.a();
        this.f25823f = null;
        this.f25824g = null;
        this.f25825h = null;
        AbstractC1807u.a(this);
    }

    public final void s1(E1 e12) {
        this.f25821d = e12;
    }

    private c(long j10, AbstractC6358h0 abstractC6358h0, float f10, E1 e12) {
        this.f25818a = j10;
        this.f25819b = abstractC6358h0;
        this.f25820c = f10;
        this.f25821d = e12;
        this.f25822e = C6230l.f58350b.a();
    }
}
