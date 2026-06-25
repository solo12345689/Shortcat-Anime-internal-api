package androidx.compose.foundation;

import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import h0.v;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import x.a0;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f26330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f26330a = i10;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final o invoke() {
            return new o(this.f26330a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o f26331a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f26332b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ z.n f26333c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f26334d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f26335e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, boolean z10, z.n nVar, boolean z11, boolean z12) {
            super(1);
            this.f26331a = oVar;
            this.f26332b = z10;
            this.f26333c = nVar;
            this.f26334d = z11;
            this.f26335e = z12;
        }

        public final void a(V0 v02) {
            v02.d("scroll");
            v02.b().c("state", this.f26331a);
            v02.b().c("reverseScrolling", Boolean.valueOf(this.f26332b));
            v02.b().c("flingBehavior", this.f26333c);
            v02.b().c("isScrollable", Boolean.valueOf(this.f26334d));
            v02.b().c("isVertical", Boolean.valueOf(this.f26335e));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o f26336a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f26337b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ z.n f26338c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f26339d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f26340e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, boolean z10, z.n nVar, boolean z11, boolean z12) {
            super(3);
            this.f26336a = oVar;
            this.f26337b = z10;
            this.f26338c = nVar;
            this.f26339d = z11;
            this.f26340e = z12;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(1478351300);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            androidx.compose.ui.e eVarThen = androidx.compose.ui.e.f26613a.then(new ScrollSemanticsElement(this.f26336a, this.f26337b, this.f26338c, this.f26339d, this.f26340e));
            o oVar = this.f26336a;
            androidx.compose.ui.e eVarThen2 = a0.a(eVarThen, oVar, this.f26340e ? q.Vertical : q.Horizontal, this.f26339d, this.f26337b, this.f26338c, oVar.k(), null, interfaceC2425m, 0, 64).then(new ScrollingLayoutElement(this.f26336a, this.f26337b, this.f26340e));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarThen2;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, o oVar, boolean z10, z.n nVar, boolean z11) {
        return d(eVar, oVar, z11, nVar, z10, false);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, o oVar, boolean z10, z.n nVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            nVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return a(eVar, oVar, z10, nVar, z11);
    }

    public static final o c(int i10, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        v vVarA = o.f26348i.a();
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC2425m.c(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new a(i10);
            interfaceC2425m.u(objD);
        }
        o oVar = (o) h0.d.e(objArr, vVarA, null, (InterfaceC5082a) objD, interfaceC2425m, 0, 4);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return oVar;
    }

    private static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, o oVar, boolean z10, z.n nVar, boolean z11, boolean z12) {
        o oVar2;
        boolean z13;
        z.n nVar2;
        boolean z14;
        boolean z15;
        Function1 function1A;
        if (T0.b()) {
            oVar2 = oVar;
            z13 = z10;
            nVar2 = nVar;
            z14 = z11;
            z15 = z12;
            function1A = new b(oVar2, z13, nVar2, z14, z15);
        } else {
            oVar2 = oVar;
            z13 = z10;
            nVar2 = nVar;
            z14 = z11;
            z15 = z12;
            function1A = T0.a();
        }
        boolean z16 = z15;
        boolean z17 = z14;
        z.n nVar3 = nVar2;
        return androidx.compose.ui.c.b(eVar, function1A, new c(oVar2, z13, nVar3, z17, z16));
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, o oVar, boolean z10, z.n nVar, boolean z11) {
        return d(eVar, oVar, z11, nVar, z10, true);
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, o oVar, boolean z10, z.n nVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            nVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return e(eVar, oVar, z10, nVar, z11);
    }
}
