package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/os/Bundle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;", "getSdkConfigurationState", "(Landroid/os/Bundle;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;", "outState", "LTd/L;", "saveSdkConfiguration", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "savedInstanceState", "restoreSdkConfigurationIfNeeded", "(Landroid/content/Context;Landroid/os/Bundle;)V", "", "SDK_CONFIG_EXTRA", "Ljava/lang/String;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SdkConfigurationStateKt {
    private static final String SDK_CONFIG_EXTRA = "sdk_config_args";

    private static final SdkConfigurationState getSdkConfigurationState(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? (SdkConfigurationState) bundle.getParcelable(SDK_CONFIG_EXTRA, SdkConfigurationState.class) : (SdkConfigurationState) bundle.getParcelable(SDK_CONFIG_EXTRA);
    }

    public static final void restoreSdkConfigurationIfNeeded(Context context, Bundle bundle) {
        SdkConfigurationState sdkConfigurationState;
        AbstractC5504s.h(context, "context");
        if (bundle == null || (sdkConfigurationState = getSdkConfigurationState(bundle)) == null) {
            return;
        }
        PurchasesConfiguration configuration = sdkConfigurationState.toConfiguration(context);
        Purchases.Companion companion = Purchases.INSTANCE;
        if (!companion.isConfigured()) {
            companion.configure(configuration);
        } else if (AbstractC5504s.c(companion.getSharedInstance().getCurrentConfiguration(), configuration)) {
            Logger.INSTANCE.i("Skipping Purchases reconfiguration, configuration is unchanged.");
        } else {
            Logger.INSTANCE.i("Purchases already configured with different parameters; not reconfiguring.");
        }
    }

    public static final void saveSdkConfiguration(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        Purchases.Companion companion = Purchases.INSTANCE;
        if (companion.isConfigured()) {
            outState.putParcelable(SDK_CONFIG_EXTRA, SdkConfigurationState.INSTANCE.from(companion.getSharedInstance().getCurrentConfiguration()));
        }
    }
}
