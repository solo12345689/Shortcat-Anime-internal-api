package com.revenuecat.purchases.ui.revenuecatui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import h.AbstractC4888a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;", "Lh/a;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "<init>", "()V", "Landroid/content/Context;", "context", "args", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallContract extends AbstractC4888a {
    public static final int $stable = 0;

    @Override // h.AbstractC4888a
    public Intent createIntent(Context context, PaywallActivityArgs args) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(args, "args");
        Intent intent = new Intent(context, (Class<?>) PaywallActivity.class);
        intent.putExtra(PaywallActivity.ARGS_EXTRA, args);
        return intent;
    }

    @Override // h.AbstractC4888a
    public PaywallResult parseResult(int resultCode, Intent intent) {
        PaywallResult paywallResult;
        if (resultCode != -1 || intent == null) {
            return PaywallResult.Cancelled.INSTANCE;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            paywallResult = (PaywallResult) intent.getParcelableExtra(PaywallActivity.RESULT_EXTRA, PaywallResult.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra(PaywallActivity.RESULT_EXTRA);
            paywallResult = parcelableExtra instanceof PaywallResult ? (PaywallResult) parcelableExtra : null;
        }
        return paywallResult == null ? new PaywallResult.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "PaywallActivity returned null result")) : paywallResult;
    }
}
