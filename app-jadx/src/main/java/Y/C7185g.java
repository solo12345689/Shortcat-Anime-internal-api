package y;

import Df.r;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.U1;
import i0.C4961E;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: y.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7185g {

    /* JADX INFO: renamed from: a */
    private final C4961E f64623a = U1.e();

    /* JADX INFO: renamed from: y.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7180b f64625b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f64626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7180b c7180b, int i10) {
            super(2);
            this.f64625b = c7180b;
            this.f64626c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            C7185g.this.a(this.f64625b, interfaceC2425m, AbstractC2409g1.a(this.f64626c | 1));
        }
    }

    /* JADX INFO: renamed from: y.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f64627a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f64628b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f64629c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5096o f64630d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5082a f64631e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function2 function2, boolean z10, androidx.compose.ui.e eVar, InterfaceC5096o interfaceC5096o, InterfaceC5082a interfaceC5082a) {
            super(3);
            this.f64627a = function2;
            this.f64628b = z10;
            this.f64629c = eVar;
            this.f64630d = interfaceC5096o;
            this.f64631e = interfaceC5082a;
        }

        public final void a(C7180b c7180b, InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC2425m.U(c7180b) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(262103052, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            String str = (String) this.f64627a.invoke(interfaceC2425m, 0);
            if (r.l0(str)) {
                throw new IllegalStateException("Label must not be blank");
            }
            AbstractC7189k.b(str, this.f64628b, c7180b, this.f64629c, this.f64630d, this.f64631e, interfaceC2425m, (i10 << 6) & 896, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C7180b) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }
    }

    public static /* synthetic */ void d(C7185g c7185g, Function2 function2, androidx.compose.ui.e eVar, boolean z10, InterfaceC5096o interfaceC5096o, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f26613a;
        }
        androidx.compose.ui.e eVar2 = eVar;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            interfaceC5096o = null;
        }
        c7185g.c(function2, eVar2, z11, interfaceC5096o, interfaceC5082a);
    }

    public final void a(C7180b c7180b, InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1320309496);
        int i11 = (i10 & 6) == 0 ? (interfaceC2425mG.U(c7180b) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1320309496, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            C4961E c4961e = this.f64623a;
            int size = c4961e.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((InterfaceC5096o) c4961e.get(i12)).invoke(c7180b, interfaceC2425mG, Integer.valueOf(i11 & 14));
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new a(c7180b, i10));
        }
    }

    public final void b() {
        this.f64623a.clear();
    }

    public final void c(Function2 function2, androidx.compose.ui.e eVar, boolean z10, InterfaceC5096o interfaceC5096o, InterfaceC5082a interfaceC5082a) {
        this.f64623a.add(g0.i.b(262103052, true, new b(function2, z10, eVar, interfaceC5096o, interfaceC5082a)));
    }
}
