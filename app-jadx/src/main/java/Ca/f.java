package Ca;

import Td.AbstractC2163n;
import Td.L;
import android.os.CancellationSignal;
import android.view.View;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.D0;
import androidx.core.view.K0;
import androidx.core.view.L0;
import androidx.core.view.l1;
import b2.AbstractC2976h;
import b2.AbstractC2977i;
import b2.C2981m;
import b2.C2982n;
import ie.InterfaceC5082a;
import ke.AbstractC5466a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    private K0 f2912a;

    /* JADX INFO: renamed from: b */
    private CancellationSignal f2913b;

    /* JADX INFO: renamed from: c */
    private Function1 f2914c;

    /* JADX INFO: renamed from: d */
    private final Lazy f2915d = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ca.e
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return f.m(this.f2911a);
        }
    });

    /* JADX INFO: renamed from: e */
    private boolean f2916e;

    /* JADX INFO: renamed from: f */
    private C2981m f2917f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements D0 {
        a() {
        }

        @Override // androidx.core.view.D0
        public void a(K0 k02) {
            f.this.w();
        }

        @Override // androidx.core.view.D0
        public void b(K0 controller, int i10) {
            AbstractC5504s.h(controller, "controller");
            f.this.v(controller);
        }

        @Override // androidx.core.view.D0
        public void c(K0 controller) {
            AbstractC5504s.h(controller, "controller");
            f.this.w();
        }
    }

    private final void g(boolean z10, Float f10) {
        final K0 k02 = this.f2912a;
        if (k02 == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        C2981m c2981mB = AbstractC2977i.b(new Function1() { // from class: Ca.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.i(this.f2908a, ((Float) obj).floatValue());
            }
        }, new InterfaceC5082a() { // from class: Ca.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Float.valueOf(f.j(k02));
            }
        }, z10 ? k02.e().f107d : k02.d().f107d);
        if (c2981mB.w() == null) {
            c2981mB.z(new C2982n());
        }
        C2982n spring = c2981mB.w();
        AbstractC5504s.d(spring, "spring");
        spring.f(1.0f);
        spring.h(1500.0f);
        if (f10 != null) {
            c2981mB.p(f10.floatValue());
        }
        c2981mB.b(new AbstractC2976h.q() { // from class: Ca.d
            @Override // b2.AbstractC2976h.q
            public final void a(AbstractC2976h abstractC2976h, boolean z11, float f11, float f12) {
                f.k(this.f2910a, abstractC2976h, z11, f11, f12);
            }
        });
        c2981mB.r();
        this.f2917f = c2981mB;
    }

    static /* synthetic */ void h(f fVar, boolean z10, Float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        fVar.g(z10, f10);
    }

    public static final L i(f fVar, float f10) {
        fVar.s(AbstractC5466a.d(f10));
        return L.f17438a;
    }

    public static final float j(K0 k02) {
        return k02.c().f107d;
    }

    public static final void k(f fVar, AbstractC2976h abstractC2976h, boolean z10, float f10, float f11) {
        if (AbstractC5504s.c(abstractC2976h, fVar.f2917f)) {
            fVar.f2917f = null;
        }
        fVar.o();
    }

    public static final a m(f fVar) {
        return fVar.new a();
    }

    private final a p() {
        return (a) this.f2915d.getValue();
    }

    public final void v(K0 k02) {
        this.f2913b = null;
        this.f2912a = k02;
        Function1 function1 = this.f2914c;
        if (function1 != null) {
            function1.invoke(k02);
        }
        this.f2914c = null;
    }

    public final void w() {
        this.f2912a = null;
        this.f2913b = null;
        this.f2916e = false;
        C2981m c2981m = this.f2917f;
        if (c2981m != null) {
            c2981m.d();
        }
        this.f2917f = null;
        this.f2914c = null;
    }

    public static /* synthetic */ void y(f fVar, View view, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        fVar.x(view, function1);
    }

    public final void l(Float f10) {
        K0 k02 = this.f2912a;
        if (k02 == null) {
            CancellationSignal cancellationSignal = this.f2913b;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        Ca.a.f2906a.b(false);
        int i10 = k02.c().f107d;
        int i11 = k02.e().f107d;
        int i12 = k02.d().f107d;
        if (f10 != null) {
            g(f10.floatValue() < 0.0f, f10);
            return;
        }
        if (i10 == i11) {
            k02.a(true);
            return;
        }
        if (i10 == i12) {
            k02.a(false);
        } else if (k02.b() >= 0.15f) {
            h(this, !this.f2916e, null, 2, null);
        } else {
            h(this, this.f2916e, null, 2, null);
        }
    }

    public final void n() {
        K0 k02 = this.f2912a;
        if (k02 != null) {
            k02.a(this.f2916e);
        }
        CancellationSignal cancellationSignal = this.f2913b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        C2981m c2981m = this.f2917f;
        if (c2981m != null) {
            c2981m.d();
        }
        w();
    }

    public final void o() {
        K0 k02 = this.f2912a;
        if (k02 == null) {
            CancellationSignal cancellationSignal = this.f2913b;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int i10 = k02.c().f107d;
        int i11 = k02.e().f107d;
        int i12 = k02.d().f107d;
        if (i10 == i11) {
            k02.a(true);
            return;
        }
        if (i10 == i12) {
            k02.a(false);
        } else if (k02.b() >= 0.15f) {
            k02.a(!this.f2916e);
        } else {
            k02.a(this.f2916e);
        }
    }

    public final int q() {
        K0 k02 = this.f2912a;
        if (k02 != null) {
            return k02.c().f107d;
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public final int r(int i10) {
        K0 k02 = this.f2912a;
        if (k02 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        Ca.a.f2906a.b(true);
        return s(k02.c().f107d - i10);
    }

    public final int s(int i10) {
        K0 k02 = this.f2912a;
        if (k02 == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        int i11 = k02.d().f107d;
        int i12 = k02.e().f107d;
        boolean z10 = this.f2916e;
        int i13 = z10 ? i12 : i11;
        int i14 = z10 ? i11 : i12;
        int iM = AbstractC5874j.m(i10, i11, i12);
        int i15 = k02.c().f107d - iM;
        k02.f(A1.b.c(0, 0, 0, iM), 1.0f, (iM - i13) / (i14 - i13));
        return i15;
    }

    public final boolean t() {
        return this.f2912a != null;
    }

    public final boolean u() {
        return this.f2913b != null;
    }

    public final void x(View view, Function1 function1) {
        AbstractC5504s.h(view, "view");
        if (t()) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
        }
        L0 l0F = AbstractC2747a0.F(view);
        boolean z10 = false;
        if (l0F != null && l0F.r(L0.p.d())) {
            z10 = true;
        }
        this.f2916e = z10;
        this.f2913b = new CancellationSignal();
        this.f2914c = function1;
        Ca.a.f2906a.b(true);
        l1 l1VarJ = AbstractC2747a0.J(view);
        if (l1VarJ != null) {
            l1VarJ.a(L0.p.d(), -1L, g.f2919a, this.f2913b, p());
        }
    }
}
