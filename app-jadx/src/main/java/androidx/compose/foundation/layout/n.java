package androidx.compose.foundation.layout;

import Td.L;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f26174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11) {
            super(1);
            this.f26173a = f10;
            this.f26174b = f11;
        }

        public final void a(V0 v02) {
            v02.d(com.amazon.device.iap.internal.c.b.as);
            v02.b().c("x", C5015h.h(this.f26173a));
            v02.b().c("y", C5015h.h(this.f26174b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.then(new OffsetModifierElement(f10, f11, true, new a(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.n(0);
        }
        return a(eVar, f10, f11);
    }
}
