package F;

import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.InterfaceC2425m;
import Y.X;
import Y.Y;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f5981a;

        /* JADX INFO: renamed from: F.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0061a implements X {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f5982a;

            public C0061a(z zVar) {
                this.f5982a = zVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f5982a.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar) {
            super(1);
            this.f5981a = zVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final X invoke(Y y10) {
            return new C0061a(this.f5981a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f5983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f5985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f5986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5987e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, int i10, B b10, Function2 function2, int i11) {
            super(2);
            this.f5983a = obj;
            this.f5984b = i10;
            this.f5985c = b10;
            this.f5986d = function2;
            this.f5987e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            A.a(this.f5983a, this.f5984b, this.f5985c, this.f5986d, interfaceC2425m, AbstractC2409g1.a(this.f5987e | 1));
        }
    }

    public static final void a(Object obj, int i10, B b10, Function2 function2, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.F(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.c(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.F(b10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean zU = interfaceC2425mG.U(obj) | interfaceC2425mG.U(b10);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new z(obj, b10);
                interfaceC2425mG.u(objD);
            }
            z zVar = (z) objD;
            zVar.h(i10);
            zVar.j((I0.I) interfaceC2425mG.n(I0.J.a()));
            boolean zU2 = interfaceC2425mG.U(zVar);
            Object objD2 = interfaceC2425mG.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new a(zVar);
                interfaceC2425mG.u(objD2);
            }
            AbstractC2393b0.b(zVar, (Function1) objD2, interfaceC2425mG, 0);
            Y.H.c(I0.J.a().d(zVar), function2, interfaceC2425mG, ((i12 >> 6) & 112) | C2397c1.f22274i);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(obj, i10, b10, function2, i11));
        }
    }
}
