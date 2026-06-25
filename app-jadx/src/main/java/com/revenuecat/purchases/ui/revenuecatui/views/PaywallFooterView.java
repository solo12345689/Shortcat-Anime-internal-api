package com.revenuecat.purchases.ui.revenuecatui.views;

import Td.InterfaceC2154e;
import android.content.Context;
import android.util.AttributeSet;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nBQ\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallFooterView;", "Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "", "condensed", "Lkotlin/Function0;", "LTd/L;", "dismissHandler", "(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;ZLie/a;)V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public class PaywallFooterView extends OriginalTemplatePaywallFooterView {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context) {
        this(context, null, null, null, false, null, 62, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering) {
        this(context, offering, null, null, false, null, 60, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, false, null, 56, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, false, null, 48, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10) {
        this(context, offering, paywallListener, fontProvider, z10, null, 32, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC5504s.h(context, "context");
    }

    public /* synthetic */ PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : offering, (i10 & 4) != 0 ? null : paywallListener, (i10 & 8) != 0 ? null : fontProvider, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : interfaceC5082a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10, InterfaceC5082a interfaceC5082a) {
        this(context, (AttributeSet) null);
        AbstractC5504s.h(context, "context");
    }
}
