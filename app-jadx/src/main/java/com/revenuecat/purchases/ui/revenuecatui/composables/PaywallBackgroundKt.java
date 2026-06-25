package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.InterfaceC1132c;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import defpackage.a;
import i1.InterfaceC5011d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"LC/c;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;", "templateConfiguration", "LTd/L;", "PaywallBackground", "(LC/c;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;LY/m;I)V", "Li1/h;", "", "toFloatPx-8Feqmps", "(FLY/m;I)F", "toFloatPx", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallBackgroundKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackgroundKt$PaywallBackground$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration $templateConfiguration;
        final /* synthetic */ InterfaceC1132c $this_PaywallBackground;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC1132c interfaceC1132c, TemplateConfiguration templateConfiguration, int i10) {
            super(2);
            this.$this_PaywallBackground = interfaceC1132c;
            this.$templateConfiguration = templateConfiguration;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallBackgroundKt.PaywallBackground(this.$this_PaywallBackground, this.$templateConfiguration, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallBackground(InterfaceC1132c interfaceC1132c, TemplateConfiguration templateConfiguration, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(interfaceC1132c, "<this>");
        AbstractC5504s.h(templateConfiguration, "templateConfiguration");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1106841354);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1132c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(templateConfiguration) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1106841354, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackground (PaywallBackground.kt:23)");
            }
            boolean z10 = false;
            boolean z11 = Build.VERSION.SDK_INT >= 31;
            boolean blurredBackgroundImage = templateConfiguration.getConfiguration().getBlurredBackgroundImage();
            float f10 = blurredBackgroundImage ? 0.7f : 1.0f;
            interfaceC2425mG.V(1963318254);
            a aVar = (!blurredBackgroundImage || z11) ? null : new a((Context) interfaceC2425mG.n(AndroidCompositionLocals_androidKt.g()), m606toFloatPx8Feqmps(BackgroundUIConstants.INSTANCE.m565getBlurSizeD9Ej5fM(), interfaceC2425mG, 6));
            interfaceC2425mG.O();
            e eVarC = interfaceC1132c.c(e.f26613a);
            if (blurredBackgroundImage && z11) {
                z10 = true;
            }
            e eVarConditional = ModifierExtensionsKt.conditional(eVarC, z10, PaywallBackgroundKt$PaywallBackground$modifier$1.INSTANCE);
            if (AbstractC5504s.c(templateConfiguration.getConfiguration().getImages().getBackground(), PaywallDataExtensionsKt.getDefaultBackgroundPlaceholder(PaywallData.INSTANCE))) {
                interfaceC2425mG.V(733877144);
                RemoteImageKt.LocalImage(R.drawable.default_background, eVarConditional, BackgroundUIConstants.INSTANCE.getContentScale(), null, aVar, f10, null, interfaceC2425mG, 384, 72);
                interfaceC2425mG.O();
            } else if (templateConfiguration.getImages().getBackgroundUri() != null) {
                interfaceC2425mG.V(734225770);
                if (blurredBackgroundImage || PaywallModeKt.isFullScreen(templateConfiguration.getMode())) {
                    String string = templateConfiguration.getImages().getBackgroundUri().toString();
                    AbstractC5504s.g(string, "templateConfiguration.im….backgroundUri.toString()");
                    RemoteImageKt.RemoteImage(string, eVarConditional, null, BackgroundUIConstants.INSTANCE.getContentScale(), null, aVar, f10, null, interfaceC2425mG, 3072, 148);
                    interfaceC2425mG = interfaceC2425mG;
                }
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(734695699);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(interfaceC1132c, templateConfiguration, i10));
        }
    }

    /* JADX INFO: renamed from: toFloatPx-8Feqmps */
    private static final float m606toFloatPx8Feqmps(float f10, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(452796480);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(452796480, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.toFloatPx (PaywallBackground.kt:73)");
        }
        float density = f10 * ((InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())).getDensity();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return density;
    }
}
