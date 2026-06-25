package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Td.L;
import android.content.Context;
import android.content.Intent;
import h.AbstractC4888a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ShowCustomerCenter;", "Lh/a;", "LTd/L;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;LTd/L;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShowCustomerCenter extends AbstractC4888a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: parseResult, reason: collision with other method in class */
    public void m679parseResult(int resultCode, Intent intent) {
    }

    @Override // h.AbstractC4888a
    public Intent createIntent(Context context, L input) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(input, "input");
        return CustomerCenterActivity.INSTANCE.createIntent$revenuecatui_defaultsBc8Release(context);
    }

    @Override // h.AbstractC4888a
    public /* bridge */ /* synthetic */ Object parseResult(int i10, Intent intent) {
        m679parseResult(i10, intent);
        return L.f17438a;
    }
}
