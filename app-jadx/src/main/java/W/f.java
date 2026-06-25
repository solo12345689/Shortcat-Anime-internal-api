package W;

import Td.L;
import U.AbstractC2181s;
import U.j0;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.H;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f20505a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Y0 f20506b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f20507c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f20508d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, Y0 y02, Function2 function2, int i10) {
            super(2);
            this.f20505a = j10;
            this.f20506b = y02;
            this.f20507c = function2;
            this.f20508d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            f.a(this.f20505a, this.f20506b, this.f20507c, interfaceC2425m, AbstractC2409g1.a(this.f20508d | 1));
        }
    }

    public static final void a(long j10, Y0 y02, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.d(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(y02) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-716124955, i11, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            H.d(new C2397c1[]{AbstractC2181s.a().d(C6385r0.m(j10)), j0.d().d(((Y0) interfaceC2425mG.n(j0.d())).K(y02))}, function2, interfaceC2425mG, ((i11 >> 3) & 112) | C2397c1.f22274i);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new a(j10, y02, function2, i10));
        }
    }
}
