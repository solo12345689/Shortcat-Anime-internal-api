package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.z;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b4.C2984a;
import b4.C2985b;
import b4.C2986c;
import c4.k;
import c4.l;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\n\u0010\u000e\u001a\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb4/c;", "computeWindowWidthSizeClass", "(LY/m;I)Lb4/c;", "Lb4/a;", "computeWindowHeightSizeClass", "(LY/m;I)Lb4/a;", "", "hasCompactDimension", "(LY/m;I)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "shouldUseLandscapeLayout", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;LY/m;I)Z", "sizeClass", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lb4/a;)Z", "Lb4/b;", "windowSizeClass", "(LY/m;I)Lb4/b;", "Lkotlin/Pair;", "", "getScreenSize", "(LY/m;I)Lkotlin/Pair;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WindowHelperKt {
    public static final C2984a computeWindowHeightSizeClass(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1980265325, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowHeightSizeClass (WindowHelper.kt:22)");
        }
        C2984a c2984aA = windowSizeClass(interfaceC2425m, 0).a();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2984aA;
    }

    public static final C2986c computeWindowWidthSizeClass(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(173434359, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowWidthSizeClass (WindowHelper.kt:16)");
        }
        C2986c c2986cB = windowSizeClass(interfaceC2425m, 0).b();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2986cB;
    }

    private static final Pair<Float, Float> getScreenSize(InterfaceC2425m interfaceC2425m, int i10) {
        Pair<Float, Float> pairA;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(392213243, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.getScreenSize (WindowHelper.kt:59)");
        }
        Activity activity = (Activity) interfaceC2425m.n(HelperFunctionsKt.getLocalActivity());
        if (HelperFunctionsKt.isInPreviewMode(interfaceC2425m, 0) || activity == null) {
            Configuration configuration = (Configuration) interfaceC2425m.n(AndroidCompositionLocals_androidKt.f());
            pairA = z.a(Float.valueOf(configuration.screenWidthDp), Float.valueOf(configuration.screenHeightDp));
        } else {
            float f10 = activity.getResources().getDisplayMetrics().density;
            k kVarB = l.f33506a.a().b(activity);
            pairA = new Pair<>(Float.valueOf(kVarB.a().width() / f10), Float.valueOf(kVarB.a().height() / f10));
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return pairA;
    }

    public static final boolean hasCompactDimension(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(667952227, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.hasCompactDimension (WindowHelper.kt:28)");
        }
        boolean z10 = AbstractC5504s.c(computeWindowHeightSizeClass(interfaceC2425m, 0), C2984a.f33091c) || AbstractC5504s.c(computeWindowWidthSizeClass(interfaceC2425m, 0), C2986c.f33099c);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return z10;
    }

    public static final boolean shouldUseLandscapeLayout(PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(legacy, "<this>");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(405801034, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:35)");
        }
        boolean zShouldUseLandscapeLayout = shouldUseLandscapeLayout(legacy.getTemplateConfiguration().getMode(), interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return zShouldUseLandscapeLayout;
    }

    private static final C2985b windowSizeClass(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1719780984, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowSizeClass (WindowHelper.kt:52)");
        }
        Pair<Float, Float> screenSize = getScreenSize(interfaceC2425m, 0);
        C2985b c2985bA = C2985b.f33095c.a(((Number) screenSize.getFirst()).floatValue(), ((Number) screenSize.getSecond()).floatValue());
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2985bA;
    }

    private static final boolean shouldUseLandscapeLayout(PaywallMode paywallMode, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1400525098, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:41)");
        }
        boolean zShouldUseLandscapeLayout = shouldUseLandscapeLayout(paywallMode, computeWindowHeightSizeClass(interfaceC2425m, 0));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return zShouldUseLandscapeLayout;
    }

    public static final boolean shouldUseLandscapeLayout(PaywallMode mode, C2984a sizeClass) {
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(sizeClass, "sizeClass");
        return PaywallModeKt.isFullScreen(mode) && AbstractC5504s.c(sizeClass, C2984a.f33091c);
    }
}
