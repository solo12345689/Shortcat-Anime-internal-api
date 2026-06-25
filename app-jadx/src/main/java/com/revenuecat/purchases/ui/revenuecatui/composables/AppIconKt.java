package com.revenuecat.purchases.ui.revenuecatui.composables;

import B1.b;
import I0.InterfaceC1680f;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.O;
import x.AbstractC6986F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "LTd/L;", "AppIcon", "(Landroidx/compose/ui/e;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AppIconKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.AppIconKt$AppIcon$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, int i10, int i11) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AppIconKt.AppIcon(this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final void AppIcon(e eVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        e eVar2;
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-960707246);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC2425mG.U(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                eVar2 = e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-960707246, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.AppIcon (AppIcon.kt:14)");
            }
            Context context = (Context) interfaceC2425mG.n(AndroidCompositionLocals_androidKt.g());
            interfaceC2425mG.V(831081126);
            Object objD = interfaceC2425mG.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = context.getApplicationInfo().loadIcon(context.getPackageManager());
                interfaceC2425mG.u(objD);
            }
            Drawable appIconResId = (Drawable) objD;
            interfaceC2425mG.O();
            AbstractC5504s.g(appIconResId, "appIconResId");
            AbstractC6986F.b(O.c(b.b(appIconResId, 0, 0, Bitmap.Config.ARGB_8888, 3, null)), null, eVar2, null, InterfaceC1680f.f8703a.a(), 0.0f, null, 0, interfaceC2425mG, ((i12 << 6) & 896) | 24624, 232);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(eVar2, i10, i11));
        }
    }
}
