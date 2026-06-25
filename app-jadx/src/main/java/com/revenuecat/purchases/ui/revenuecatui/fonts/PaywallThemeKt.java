package com.revenuecat.purchases.ui.revenuecatui.fonts;

import Td.L;
import U.D;
import U.E;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.extensions.TypographyExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "Lkotlin/Function0;", "LTd/L;", "content", "PaywallTheme", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Lkotlin/jvm/functions/Function2;LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallThemeKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallThemeKt$PaywallTheme$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ FontProvider $fontProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FontProvider fontProvider, Function2 function2, int i10) {
            super(2);
            this.$fontProvider = fontProvider;
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallThemeKt.PaywallTheme(this.$fontProvider, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallTheme(FontProvider fontProvider, Function2 content, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        Function2 function2;
        AbstractC5504s.h(content, "content");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1433874321);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC2425mG.U(fontProvider) : interfaceC2425mG.F(fontProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(content) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            function2 = content;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1433874321, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallTheme (PaywallTheme.kt:10)");
            }
            if (fontProvider == null) {
                interfaceC2425mG.V(1090937919);
                content.invoke(interfaceC2425mG, Integer.valueOf((i11 >> 3) & 14));
                interfaceC2425mG.O();
                function2 = content;
            } else {
                interfaceC2425mG.V(1090975739);
                D d10 = D.f17597a;
                int i12 = D.f17598b;
                function2 = content;
                E.a(d10.a(interfaceC2425mG, i12), d10.b(interfaceC2425mG, i12), TypographyExtensionsKt.copyWithFontProvider(d10.c(interfaceC2425mG, i12), fontProvider), function2, interfaceC2425mG, (i11 << 6) & 7168, 0);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(fontProvider, function2, i10));
        }
    }
}
