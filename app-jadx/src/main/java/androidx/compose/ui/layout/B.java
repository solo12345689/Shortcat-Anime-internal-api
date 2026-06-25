package androidx.compose.ui.layout;

import K0.InterfaceC1788g;
import K0.J;
import Td.L;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a */
    private static final a f26860a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f26861a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f26862b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f26863c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f26864d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f26861a = eVar;
            this.f26862b = function2;
            this.f26863c = i10;
            this.f26864d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            B.a(this.f26861a, this.f26862b, interfaceC2425m, AbstractC2409g1.a(this.f26863c | 1), this.f26864d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C f26865a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c10) {
            super(0);
            this.f26865a = c10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m77invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m77invoke() {
            this.f26865a.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C f26866a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f26867b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f26868c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f26869d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f26870e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C c10, androidx.compose.ui.e eVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f26866a = c10;
            this.f26867b = eVar;
            this.f26868c = function2;
            this.f26869d = i10;
            this.f26870e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            B.b(this.f26866a, this.f26867b, this.f26868c, interfaceC2425m, AbstractC2409g1.a(this.f26869d | 1), this.f26870e);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        Function2 function22;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if (interfaceC2425mG.p((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            androidx.compose.ui.e eVar2 = eVar;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:92)");
            }
            Object objD = interfaceC2425mG.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = new C();
                interfaceC2425mG.u(objD);
            }
            function22 = function2;
            b((C) objD, eVar2, function22, interfaceC2425mG, (i12 << 3) & 1008, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            eVar = eVar2;
        } else {
            function22 = function2;
            interfaceC2425mG.K();
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(eVar, function22, i10, i11));
        }
    }

    public static final void b(C c10, androidx.compose.ui.e eVar, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.F(c10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if (interfaceC2425mG.p((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:125)");
            }
            int iHashCode = Long.hashCode(AbstractC2410h.b(interfaceC2425mG, 0));
            AbstractC2460y abstractC2460yE = AbstractC2410h.e(interfaceC2425mG, 0);
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVar);
            I iR = interfaceC2425mG.r();
            InterfaceC5082a interfaceC5082aA = J.f10425r0.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, c10, c10.g());
            m2.e(interfaceC2425mB, abstractC2460yE, c10.e());
            m2.e(interfaceC2425mB, function2, c10.f());
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            m2.e(interfaceC2425mB, iR, aVar.g());
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iHashCode))) {
                interfaceC2425mB.u(Integer.valueOf(iHashCode));
                interfaceC2425mB.m(Integer.valueOf(iHashCode), function2B);
            }
            interfaceC2425mG.x();
            if (interfaceC2425mG.i()) {
                interfaceC2425mG.V(-1259216055);
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(-1259274676);
                boolean zF = interfaceC2425mG.F(c10);
                Object objD = interfaceC2425mG.D();
                if (zF || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new c(c10);
                    interfaceC2425mG.u(objD);
                }
                AbstractC2393b0.g((InterfaceC5082a) objD, interfaceC2425mG, 0);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        androidx.compose.ui.e eVar2 = eVar;
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new d(c10, eVar2, function2, i10, i11));
        }
    }
}
