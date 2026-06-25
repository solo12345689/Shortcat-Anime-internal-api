package F;

import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: F.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1545p {

    /* JADX INFO: renamed from: F.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ q f6075a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f6076b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f6077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, int i10, Object obj) {
            super(2);
            this.f6075a = qVar;
            this.f6076b = i10;
            this.f6077c = obj;
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
                AbstractC2454w.U(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
            }
            this.f6075a.e(this.f6076b, this.f6077c, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: F.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ q f6078a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f6079b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f6080c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f6081d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f6082e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f6078a = qVar;
            this.f6079b = obj;
            this.f6080c = i10;
            this.f6081d = obj2;
            this.f6082e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1545p.a(this.f6078a, this.f6079b, this.f6080c, this.f6081d, interfaceC2425m, AbstractC2409g1.a(this.f6082e | 1));
        }
    }

    public static final void a(q qVar, Object obj, int i10, Object obj2, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.U(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.U(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.c(i10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC2425mG.U(obj2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((h0.g) obj).c(obj2, g0.i.d(980966366, true, new a(qVar, i10, obj2), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(qVar, obj, i10, obj2, i11));
        }
    }
}
