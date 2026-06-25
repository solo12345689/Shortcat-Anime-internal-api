package androidx.compose.foundation;

import Td.L;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6358h0;
import s0.C6385r0;
import s0.E1;
import s0.t1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f25813a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC6358h0 f25814b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ E1 f25815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, AbstractC6358h0 abstractC6358h0, E1 e12) {
            super(1);
            this.f25813a = f10;
            this.f25814b = abstractC6358h0;
            this.f25815c = e12;
        }

        public final void a(V0 v02) {
            v02.d(AppStateModule.APP_STATE_BACKGROUND);
            v02.b().c("alpha", Float.valueOf(this.f25813a));
            v02.b().c("brush", this.f25814b);
            v02.b().c("shape", this.f25815c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0441b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f25816a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E1 f25817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0441b(long j10, E1 e12) {
            super(1);
            this.f25816a = j10;
            this.f25817b = e12;
        }

        public final void a(V0 v02) {
            v02.d(AppStateModule.APP_STATE_BACKGROUND);
            v02.e(C6385r0.m(this.f25816a));
            v02.b().c("color", C6385r0.m(this.f25816a));
            v02.b().c("shape", this.f25817b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, AbstractC6358h0 abstractC6358h0, E1 e12, float f10) {
        return eVar.then(new BackgroundElement(0L, abstractC6358h0, f10, e12, T0.b() ? new a(f10, abstractC6358h0, e12) : T0.a(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, AbstractC6358h0 abstractC6358h0, E1 e12, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(eVar, abstractC6358h0, e12, f10);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, long j10, E1 e12) {
        return eVar.then(new BackgroundElement(j10, null, 1.0f, e12, T0.b() ? new C0441b(j10, e12) : T0.a(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, long j10, E1 e12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        return c(eVar, j10, e12);
    }
}
