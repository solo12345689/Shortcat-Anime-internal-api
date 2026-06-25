package I0;

import K0.InterfaceC1788g;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.m2;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8725a = new a();

        a() {
            super(1);
        }

        public final void a(K0.J j10) {
            j10.N1(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((K0.J) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f8727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f8728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8730e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, Function2 function2, B b10, int i10, int i11) {
            super(2);
            this.f8726a = eVar;
            this.f8727b = function2;
            this.f8728c = b10;
            this.f8729d = i10;
            this.f8730e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            u.a(this.f8726a, this.f8727b, this.f8728c, interfaceC2425m, AbstractC2409g1.a(this.f8729d | 1), this.f8730e);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Function2 function2, B b10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1663319424);
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
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.U(b10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if (interfaceC2425mG.p((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1663319424, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:238)");
            }
            int iHashCode = Integer.hashCode(AbstractC2410h.a(interfaceC2425mG, 0));
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVar);
            Y.I iR = interfaceC2425mG.r();
            InterfaceC5082a interfaceC5082aA = K0.J.f10425r0.a();
            int i14 = ((i12 << 3) & 896) | 6;
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
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            m2.e(interfaceC2425mB, b10, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            m2.c(interfaceC2425mB, a.f8725a);
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iHashCode))) {
                interfaceC2425mB.u(Integer.valueOf(iHashCode));
                interfaceC2425mB.m(Integer.valueOf(iHashCode), function2B);
            }
            function2.invoke(interfaceC2425mG, Integer.valueOf((i14 >> 6) & 14));
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        } else {
            interfaceC2425mG.K();
        }
        androidx.compose.ui.e eVar2 = eVar;
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(eVar2, function2, b10, i10, i11));
        }
    }
}
