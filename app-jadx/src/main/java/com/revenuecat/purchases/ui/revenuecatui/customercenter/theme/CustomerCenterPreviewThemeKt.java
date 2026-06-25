package com.revenuecat.purchases.ui.revenuecatui.customercenter.theme;

import Td.L;
import U.AbstractC2176m;
import U.C2175l;
import U.E;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "LTd/L;", "content", "CustomerCenterPreviewTheme", "(Lkotlin/jvm/functions/Function2;LY/m;I)V", "LU/l;", "LightColorScheme", "LU/l;", "DarkColorScheme", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterPreviewThemeKt {
    private static final C2175l DarkColorScheme;
    private static final C2175l LightColorScheme;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function2 function2, int i10) {
            super(2);
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    static {
        long jD = AbstractC6387s0.d(4279199743L);
        C6385r0.a aVar = C6385r0.f58985b;
        LightColorScheme = AbstractC2176m.j(jD, aVar.k(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, AbstractC6387s0.d(4294967295L), AbstractC6387s0.d(4280229663L), AbstractC6387s0.d(4293981433L), AbstractC6387s0.d(4280229663L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122884, 15, null);
        DarkColorScheme = AbstractC2176m.e(AbstractC6387s0.d(4286695300L), aVar.a(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, AbstractC6387s0.d(4279374354L), AbstractC6387s0.d(4292927712L), AbstractC6387s0.d(4280953386L), AbstractC6387s0.d(4292927712L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122884, 15, null);
    }

    public static final void CustomerCenterPreviewTheme(Function2 content, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        Function2 function2;
        AbstractC5504s.h(content, "content");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(482903071);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            function2 = content;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(482903071, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewTheme (CustomerCenterPreviewTheme.kt:36)");
            }
            boolean zA = AbstractC7015m.a(interfaceC2425mG, 0);
            C2175l c2175l = zA ? DarkColorScheme : LightColorScheme;
            View view = (View) interfaceC2425mG.n(AndroidCompositionLocals_androidKt.k());
            interfaceC2425mG.V(-1492930134);
            if (!view.isInEditMode()) {
                interfaceC2425mG.V(-1492928745);
                boolean zF = interfaceC2425mG.F(view) | interfaceC2425mG.a(zA);
                Object objD = interfaceC2425mG.D();
                if (zF || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$1$1(view, zA);
                    interfaceC2425mG.u(objD);
                }
                interfaceC2425mG.O();
                AbstractC2393b0.g((InterfaceC5082a) objD, interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            function2 = content;
            E.a(c2175l, null, null, function2, interfaceC2425mG, (i11 << 9) & 7168, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(function2, i10));
        }
    }
}
