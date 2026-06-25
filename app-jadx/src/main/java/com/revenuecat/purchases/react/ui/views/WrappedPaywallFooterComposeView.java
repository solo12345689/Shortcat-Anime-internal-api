package com.revenuecat.purchases.react.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;", "Lcom/revenuecat/purchases/react/ui/views/ComposeViewWrapper;", "Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "createWrappedView", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;", "", "offeringId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "LTd/L;", "setOfferingId", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;", "customFontProvider", "setFontProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "setPaywallListener", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V", "Lkotlin/Function0;", "handler", "setDismissHandler", "(Lie/a;)V", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class WrappedPaywallFooterComposeView extends ComposeViewWrapper<OriginalTemplatePaywallFooterView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedPaywallFooterComposeView(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
    }

    public static /* synthetic */ void setOfferingId$default(WrappedPaywallFooterComposeView wrappedPaywallFooterComposeView, String str, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOfferingId");
        }
        if ((i10 & 2) != 0) {
            presentedOfferingContext = null;
        }
        wrappedPaywallFooterComposeView.setOfferingId(str, presentedOfferingContext);
    }

    public final void setDismissHandler(InterfaceC5082a handler) {
        AbstractC5504s.h(handler, "handler");
        OriginalTemplatePaywallFooterView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setDismissHandler(handler);
        }
    }

    public final void setFontProvider(CustomFontProvider customFontProvider) {
        AbstractC5504s.h(customFontProvider, "customFontProvider");
        OriginalTemplatePaywallFooterView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setFontProvider(customFontProvider);
        }
    }

    public final void setOfferingId(String offeringId, PresentedOfferingContext presentedOfferingContext) {
        if (offeringId == null) {
            OriginalTemplatePaywallFooterView wrappedView = getWrappedView();
            if (wrappedView != null) {
                wrappedView.setOfferingId(null);
                return;
            }
            return;
        }
        if (presentedOfferingContext == null) {
            presentedOfferingContext = new PresentedOfferingContext(offeringId);
        }
        OriginalTemplatePaywallFooterView wrappedView2 = getWrappedView();
        if (wrappedView2 != null) {
            wrappedView2.setOfferingIdAndPresentedOfferingContext(offeringId, presentedOfferingContext);
        }
    }

    public final void setPaywallListener(PaywallListener listener) {
        AbstractC5504s.h(listener, "listener");
        OriginalTemplatePaywallFooterView wrappedView = getWrappedView();
        if (wrappedView != null) {
            wrappedView.setPaywallListener(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.revenuecat.purchases.react.ui.views.ComposeViewWrapper
    public OriginalTemplatePaywallFooterView createWrappedView(Context context, AttributeSet attrs) {
        AbstractC5504s.h(context, "context");
        return new OriginalTemplatePaywallFooterView(context, attrs);
    }
}
