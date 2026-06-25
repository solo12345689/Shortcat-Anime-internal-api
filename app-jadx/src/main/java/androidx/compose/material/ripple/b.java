package androidx.compose.material.ripple;

import B.o;
import K0.AbstractC1792i;
import K0.AbstractC1807u;
import T.g;
import T.h;
import T.k;
import T.o;
import Td.L;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ie.InterfaceC5082a;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E;
import s0.InterfaceC6364j0;
import s0.InterfaceC6389t0;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends RippleNode implements h {

    /* JADX INFO: renamed from: k */
    private g f26527k;

    /* JADX INFO: renamed from: l */
    private k f26528l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m70invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m70invoke() {
            AbstractC1807u.a(b.this);
        }
    }

    public /* synthetic */ b(B.k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, z10, f10, interfaceC6389t0, interfaceC5082a);
    }

    private final g S1() {
        g gVar = this.f26527k;
        if (gVar != null) {
            AbstractC5504s.e(gVar);
            return gVar;
        }
        g gVarC = o.c(o.e((View) AbstractC1792i.a(this, AndroidCompositionLocals_androidKt.k())));
        this.f26527k = gVarC;
        AbstractC5504s.e(gVarC);
        return gVarC;
    }

    private final void T1(k kVar) {
        this.f26528l = kVar;
        AbstractC1807u.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void J1(o.b bVar, long j10, float f10) {
        k kVarB = S1().b(this);
        kVarB.b(bVar, getBounded(), j10, AbstractC5466a.d(f10), N1(), ((T.d) getRippleAlpha().invoke()).d(), new a());
        T1(kVarB);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void K1(InterfaceC6711f interfaceC6711f) {
        InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
        k kVar = this.f26528l;
        if (kVar != null) {
            kVar.f(getRippleSize(), N1(), ((T.d) getRippleAlpha().invoke()).d());
            kVar.draw(E.d(interfaceC6364j0B));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void Q1(o.b bVar) {
        k kVar = this.f26528l;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // T.h
    public void b1() {
        T1(null);
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        g gVar = this.f26527k;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    private b(B.k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a) {
        super(kVar, z10, f10, interfaceC6389t0, interfaceC5082a, null);
    }
}
