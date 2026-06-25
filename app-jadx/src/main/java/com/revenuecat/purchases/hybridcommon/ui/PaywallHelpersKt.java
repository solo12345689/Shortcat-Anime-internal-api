package com.revenuecat.purchases.hybridcommon.ui;

import Td.InterfaceC2154e;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.P;
import androidx.lifecycle.AbstractC2857k;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.hybridcommon.ui.PaywallFragment;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/v;", "activity", "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;", "paywallResultListener", "", "requiredEntitlementIdentifier", "", "shouldDisplayDismissButton", "Lcom/revenuecat/purchases/Offering;", "offering", "LTd/L;", "presentPaywallFromFragment", "(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;)V", "Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;", "options", "(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V", "hybridcommon-ui_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallHelpersKt {
    @InterfaceC2154e
    public static final void presentPaywallFromFragment(AbstractActivityC2842v activity, PaywallResultListener paywallResultListener) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment$default(activity, paywallResultListener, null, null, null, 28, null);
    }

    public static /* synthetic */ void presentPaywallFromFragment$default(AbstractActivityC2842v abstractActivityC2842v, PaywallResultListener paywallResultListener, String str, Boolean bool, Offering offering, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            offering = null;
        }
        presentPaywallFromFragment(abstractActivityC2842v, paywallResultListener, str, bool, offering);
    }

    public static final void presentPaywallFromFragment$lambda$3$lambda$2(final AbstractActivityC2842v abstractActivityC2842v, final String str, final PresentPaywallOptions presentPaywallOptions, PresentPaywallOptions presentPaywallOptions2) {
        abstractActivityC2842v.C().z1(str, abstractActivityC2842v, new P() { // from class: com.revenuecat.purchases.hybridcommon.ui.e
            @Override // androidx.fragment.app.P
            public final void a(String str2, Bundle bundle) {
                PaywallHelpersKt.presentPaywallFromFragment$lambda$3$lambda$2$lambda$1(presentPaywallOptions, abstractActivityC2842v, str, str2, bundle);
            }
        });
        if (abstractActivityC2842v.getLifecycle().getCurrentState().b(AbstractC2857k.b.f30238d)) {
            abstractActivityC2842v.C().s().e(PaywallFragment.INSTANCE.newInstance(str, presentPaywallOptions.getRequiredEntitlementIdentifier(), presentPaywallOptions.getShouldDisplayDismissButton(), presentPaywallOptions.getPaywallSource(), presentPaywallOptions.getFontFamily(), presentPaywallOptions.getCustomVariables()), PaywallFragment.tag).h();
        } else {
            Log.w("Purchases", "Tried to present a paywall while the activity was paused or finished. Not presenting.");
            presentPaywallOptions2.getPaywallResultListener().onPaywallResult(HybridPurchaseLogicBridge.RESULT_ERROR);
        }
    }

    public static final void presentPaywallFromFragment$lambda$3$lambda$2$lambda$1(PresentPaywallOptions presentPaywallOptions, AbstractActivityC2842v abstractActivityC2842v, String str, String str2, Bundle result) {
        AbstractC5504s.h(str2, "<anonymous parameter 0>");
        AbstractC5504s.h(result, "result");
        String string = result.getString(PaywallFragment.ResultKey.PAYWALL_RESULT.getKey());
        if (string == null) {
            throw new IllegalStateException("PaywallResult not found in result bundle.");
        }
        presentPaywallOptions.getPaywallResultListener().onPaywallResult(string);
        abstractActivityC2842v.C().z(str);
    }

    @InterfaceC2154e
    public static final void presentPaywallFromFragment(AbstractActivityC2842v activity, PaywallResultListener paywallResultListener, String str) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment$default(activity, paywallResultListener, str, null, null, 24, null);
    }

    @InterfaceC2154e
    public static final void presentPaywallFromFragment(AbstractActivityC2842v activity, PaywallResultListener paywallResultListener, String str, Boolean bool) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment$default(activity, paywallResultListener, str, bool, null, 16, null);
    }

    @InterfaceC2154e
    public static final void presentPaywallFromFragment(AbstractActivityC2842v activity, PaywallResultListener paywallResultListener, String str, Boolean bool, Offering offering) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment(activity, new PresentPaywallOptions(paywallResultListener, offering != null ? new PaywallSource.Offering(offering) : PaywallSource.DefaultOffering.INSTANCE, str, bool, null, null, null, null, 240, null));
    }

    public static final void presentPaywallFromFragment(final AbstractActivityC2842v activity, final PresentPaywallOptions options) {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(options, "options");
        final String strValueOf = String.valueOf(System.identityHashCode(options.getPaywallResultListener()));
        if (options.getPaywallListener() != null || options.getPurchaseLogic() != null) {
            PaywallFragmentNonSerializableArgsStore.INSTANCE.put(strValueOf, new PaywallFragmentNonSerializableArgs(options.getPaywallListener(), options.getPurchaseLogic()));
        }
        activity.runOnUiThread(new Runnable() { // from class: com.revenuecat.purchases.hybridcommon.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                PaywallHelpersKt.presentPaywallFromFragment$lambda$3$lambda$2(activity, strValueOf, options, options);
            }
        });
    }
}
