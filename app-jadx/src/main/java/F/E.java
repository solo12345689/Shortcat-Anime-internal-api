package F;

import Ud.S;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.InterfaceC2425m;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f6004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f6005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D d10, InterfaceC5096o interfaceC5096o) {
            super(2);
            this.f6004a = d10;
            this.f6005b = interfaceC5096o;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f6004a.i(h0.o.b(interfaceC2425m, 0));
            this.f6005b.invoke(this.f6004a, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f6006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6007b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5096o interfaceC5096o, int i10) {
            super(2);
            this.f6006a = interfaceC5096o;
            this.f6007b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            E.a(this.f6006a, interfaceC2425m, AbstractC2409g1.a(this.f6007b | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0.p f6008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h0.p pVar) {
            super(0);
            this.f6008a = pVar;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D invoke() {
            return new D(this.f6008a, S.i());
        }
    }

    public static final void a(InterfaceC5096o interfaceC5096o, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(674185128);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(interfaceC5096o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            h0.p pVar = (h0.p) interfaceC2425mG.n(h0.s.g());
            Object[] objArr = {pVar};
            h0.v vVarA = D.f5989d.a(pVar);
            boolean zF = interfaceC2425mG.F(pVar);
            Object objD = interfaceC2425mG.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                objD = new c(pVar);
                interfaceC2425mG.u(objD);
            }
            D d10 = (D) h0.d.e(objArr, vVarA, null, (InterfaceC5082a) objD, interfaceC2425mG, 0, 4);
            Y.H.c(h0.s.g().d(d10), g0.i.d(1863926504, true, new a(d10, interfaceC5096o), interfaceC2425mG, 54), interfaceC2425mG, C2397c1.f22274i | 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(interfaceC5096o, i10));
        }
    }
}
