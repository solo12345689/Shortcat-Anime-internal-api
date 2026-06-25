package androidx.compose.foundation;

import Td.L;
import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.H;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import x.InterfaceC6987G;
import x.InterfaceC6988H;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f26057a = H.j(a.f26058a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f26058a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6987G invoke() {
            return g.f25867a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ B.k f26059a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC6987G f26060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B.k kVar, InterfaceC6987G interfaceC6987G) {
            super(1);
            this.f26059a = kVar;
            this.f26060b = interfaceC6987G;
        }

        public final void a(V0 v02) {
            v02.d("indication");
            v02.b().c("interactionSource", this.f26059a);
            v02.b().c("indication", this.f26060b);
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
        final /* synthetic */ InterfaceC6987G f26061a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ B.k f26062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6987G interfaceC6987G, B.k kVar) {
            super(3);
            this.f26061a = interfaceC6987G;
            this.f26062b = kVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-353972293);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            InterfaceC6988H interfaceC6988HB = this.f26061a.b(this.f26062b, interfaceC2425m, 0);
            boolean zU = interfaceC2425m.U(interfaceC6988HB);
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new k(interfaceC6988HB);
                interfaceC2425m.u(objD);
            }
            k kVar = (k) objD;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return kVar;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final AbstractC2394b1 a() {
        return f26057a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, B.k kVar, InterfaceC6987G interfaceC6987G) {
        if (interfaceC6987G == null) {
            return eVar;
        }
        if (interfaceC6987G instanceof InterfaceC6989I) {
            return eVar.then(new IndicationModifierElement(kVar, (InterfaceC6989I) interfaceC6987G));
        }
        return androidx.compose.ui.c.b(eVar, T0.b() ? new b(kVar, interfaceC6987G) : T0.a(), new c(interfaceC6987G, kVar));
    }
}
