package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import s0.C6385r0;
import v.v;
import w.AbstractC6892c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a.\u0010\f\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\f\u0010\r\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "", "packageButtonActionInProgressOpacityAnimation", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)F", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageInfo", "Ls0/r0;", "selectedColor", "unselectedColor", "packageButtonColorAnimation-9z6LAg8", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;JJLY/m;I)J", "packageButtonColorAnimation", "alpha", "result", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimationsKt {
    public static final float packageButtonActionInProgressOpacityAnimation(PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(paywallViewModel, "<this>");
        interfaceC2425m.V(-1704661559);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1704661559, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonActionInProgressOpacityAnimation (Animations.kt:13)");
        }
        float fPackageButtonActionInProgressOpacityAnimation$lambda$0 = packageButtonActionInProgressOpacityAnimation$lambda$0(AbstractC6892c.d(((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue() ? 0.4f : 1.0f, UIConstant.INSTANCE.defaultAnimation(), 0.0f, "Package button action in progress alpha", null, interfaceC2425m, 3072, 20));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return fPackageButtonActionInProgressOpacityAnimation$lambda$0;
    }

    private static final float packageButtonActionInProgressOpacityAnimation$lambda$0(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: packageButtonColorAnimation-9z6LAg8 */
    public static final long m849packageButtonColorAnimation9z6LAg8(PaywallState.Loaded.Legacy packageButtonColorAnimation, TemplateConfiguration.PackageInfo packageInfo, long j10, long j11, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(packageButtonColorAnimation, "$this$packageButtonColorAnimation");
        AbstractC5504s.h(packageInfo, "packageInfo");
        interfaceC2425m.V(792231715);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(792231715, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonColorAnimation (Animations.kt:28)");
        }
        long j12 = AbstractC5504s.c(packageInfo, packageButtonColorAnimation.getSelectedPackage().getValue()) ? j10 : j11;
        long jPackageButtonColorAnimation_9z6LAg8$lambda$1 = packageButtonColorAnimation_9z6LAg8$lambda$1(v.a(j12, UIConstant.INSTANCE.defaultAnimation(), "Package button selected color: " + packageInfo.getRcPackage().getIdentifier(), null, interfaceC2425m, 0, 8));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return jPackageButtonColorAnimation_9z6LAg8$lambda$1;
    }

    private static final long packageButtonColorAnimation_9z6LAg8$lambda$1(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }
}
