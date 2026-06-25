package com.revenuecat.purchases.ui.revenuecatui;

import Ud.S;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00017Bu\b\u0000\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;", "", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "", "shouldDisplayBlock", "Lkotlin/Function0;", "LTd/L;", "dismissRequest", "Lcom/revenuecat/purchases/Offering;", "offering", "shouldDisplayDismissButton", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "<init>", "(Lkotlin/jvm/functions/Function1;Lie/a;Lcom/revenuecat/purchases/Offering;ZLcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "builder", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;)V", "Lkotlin/jvm/functions/Function1;", "getShouldDisplayBlock", "()Lkotlin/jvm/functions/Function1;", "Lie/a;", "getDismissRequest", "()Lie/a;", "Lcom/revenuecat/purchases/Offering;", "getOffering", "()Lcom/revenuecat/purchases/Offering;", "Z", "getShouldDisplayDismissButton", "()Z", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "getFontProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "getListener", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "getPurchaseLogic", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "Ljava/util/Map;", "getCustomVariables", "()Ljava/util/Map;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "getOfferingSelection$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "offeringSelection", "Builder", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallDialogOptions {
    public static final int $stable = 0;
    private final Map<String, CustomVariableValue> customVariables;
    private final InterfaceC5082a dismissRequest;
    private final FontProvider fontProvider;
    private final PaywallListener listener;
    private final Offering offering;
    private final PaywallPurchaseLogic purchaseLogic;
    private final Function1 shouldDisplayBlock;
    private final boolean shouldDisplayDismissButton;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0017\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR.\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "", "shouldDisplayBlock", "setShouldDisplayBlock", "(Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "", "requiredEntitlementIdentifier", "setRequiredEntitlementIdentifier", "(Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "Lkotlin/Function0;", "LTd/L;", "dismissRequest", "setDismissRequest", "(Lie/a;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "Lcom/revenuecat/purchases/Offering;", "offering", "setOffering", "(Lcom/revenuecat/purchases/Offering;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "shouldDisplayDismissButton", "setShouldDisplayDismissButton", "(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "setFontProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "setListener", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "setCustomPurchaseLogic", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "variables", "setCustomVariables", "(Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;", "build", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;", "Lkotlin/jvm/functions/Function1;", "getShouldDisplayBlock$revenuecatui_defaultsBc8Release", "()Lkotlin/jvm/functions/Function1;", "setShouldDisplayBlock$revenuecatui_defaultsBc8Release", "(Lkotlin/jvm/functions/Function1;)V", "Lie/a;", "getDismissRequest$revenuecatui_defaultsBc8Release", "()Lie/a;", "setDismissRequest$revenuecatui_defaultsBc8Release", "(Lie/a;)V", "Lcom/revenuecat/purchases/Offering;", "getOffering$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/Offering;", "setOffering$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/Offering;)V", "Z", "getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release", "()Z", "setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release", "(Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "getFontProvider$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "setFontProvider$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "getListener$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "setListener$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "getPurchaseLogic$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "setPurchaseLogic$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V", "customVariables", "Ljava/util/Map;", "getCustomVariables$revenuecatui_defaultsBc8Release", "()Ljava/util/Map;", "setCustomVariables$revenuecatui_defaultsBc8Release", "(Ljava/util/Map;)V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private InterfaceC5082a dismissRequest;
        private FontProvider fontProvider;
        private PaywallListener listener;
        private Offering offering;
        private PaywallPurchaseLogic purchaseLogic;
        private Function1 shouldDisplayBlock;
        private boolean shouldDisplayDismissButton = true;
        private Map<String, ? extends CustomVariableValue> customVariables = S.i();

        public final PaywallDialogOptions build() {
            return new PaywallDialogOptions(this);
        }

        public final Map<String, CustomVariableValue> getCustomVariables$revenuecatui_defaultsBc8Release() {
            return this.customVariables;
        }

        /* JADX INFO: renamed from: getDismissRequest$revenuecatui_defaultsBc8Release, reason: from getter */
        public final InterfaceC5082a getDismissRequest() {
            return this.dismissRequest;
        }

        /* JADX INFO: renamed from: getFontProvider$revenuecatui_defaultsBc8Release, reason: from getter */
        public final FontProvider getFontProvider() {
            return this.fontProvider;
        }

        /* JADX INFO: renamed from: getListener$revenuecatui_defaultsBc8Release, reason: from getter */
        public final PaywallListener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: getOffering$revenuecatui_defaultsBc8Release, reason: from getter */
        public final Offering getOffering() {
            return this.offering;
        }

        /* JADX INFO: renamed from: getPurchaseLogic$revenuecatui_defaultsBc8Release, reason: from getter */
        public final PaywallPurchaseLogic getPurchaseLogic() {
            return this.purchaseLogic;
        }

        /* JADX INFO: renamed from: getShouldDisplayBlock$revenuecatui_defaultsBc8Release, reason: from getter */
        public final Function1 getShouldDisplayBlock() {
            return this.shouldDisplayBlock;
        }

        /* JADX INFO: renamed from: getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release, reason: from getter */
        public final boolean getShouldDisplayDismissButton() {
            return this.shouldDisplayDismissButton;
        }

        public final Builder setCustomPurchaseLogic(PaywallPurchaseLogic purchaseLogic) {
            this.purchaseLogic = purchaseLogic;
            return this;
        }

        public final Builder setCustomVariables(Map<String, ? extends CustomVariableValue> variables) {
            AbstractC5504s.h(variables, "variables");
            this.customVariables = variables;
            return this;
        }

        public final void setCustomVariables$revenuecatui_defaultsBc8Release(Map<String, ? extends CustomVariableValue> map) {
            AbstractC5504s.h(map, "<set-?>");
            this.customVariables = map;
        }

        public final Builder setDismissRequest(InterfaceC5082a dismissRequest) {
            AbstractC5504s.h(dismissRequest, "dismissRequest");
            this.dismissRequest = dismissRequest;
            return this;
        }

        public final void setDismissRequest$revenuecatui_defaultsBc8Release(InterfaceC5082a interfaceC5082a) {
            this.dismissRequest = interfaceC5082a;
        }

        public final Builder setFontProvider(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
            return this;
        }

        public final void setFontProvider$revenuecatui_defaultsBc8Release(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
        }

        public final Builder setListener(PaywallListener listener) {
            this.listener = listener;
            return this;
        }

        public final void setListener$revenuecatui_defaultsBc8Release(PaywallListener paywallListener) {
            this.listener = paywallListener;
        }

        public final Builder setOffering(Offering offering) {
            this.offering = offering;
            return this;
        }

        public final void setOffering$revenuecatui_defaultsBc8Release(Offering offering) {
            this.offering = offering;
        }

        public final void setPurchaseLogic$revenuecatui_defaultsBc8Release(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
        }

        public final Builder setRequiredEntitlementIdentifier(String requiredEntitlementIdentifier) {
            if (requiredEntitlementIdentifier != null) {
                this.shouldDisplayBlock = HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(requiredEntitlementIdentifier);
            }
            return this;
        }

        public final Builder setShouldDisplayBlock(Function1 shouldDisplayBlock) {
            this.shouldDisplayBlock = shouldDisplayBlock;
            return this;
        }

        public final void setShouldDisplayBlock$revenuecatui_defaultsBc8Release(Function1 function1) {
            this.shouldDisplayBlock = function1;
        }

        public final Builder setShouldDisplayDismissButton(boolean shouldDisplayDismissButton) {
            this.shouldDisplayDismissButton = shouldDisplayDismissButton;
            return this;
        }

        public final void setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(boolean z10) {
            this.shouldDisplayDismissButton = z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallDialogOptions(Function1 function1, InterfaceC5082a interfaceC5082a, Offering offering, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(customVariables, "customVariables");
        this.shouldDisplayBlock = function1;
        this.dismissRequest = interfaceC5082a;
        this.offering = offering;
        this.shouldDisplayDismissButton = z10;
        this.fontProvider = fontProvider;
        this.listener = paywallListener;
        this.purchaseLogic = paywallPurchaseLogic;
        this.customVariables = customVariables;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallDialogOptions)) {
            return false;
        }
        PaywallDialogOptions paywallDialogOptions = (PaywallDialogOptions) obj;
        return AbstractC5504s.c(this.shouldDisplayBlock, paywallDialogOptions.shouldDisplayBlock) && AbstractC5504s.c(this.dismissRequest, paywallDialogOptions.dismissRequest) && AbstractC5504s.c(this.offering, paywallDialogOptions.offering) && this.shouldDisplayDismissButton == paywallDialogOptions.shouldDisplayDismissButton && AbstractC5504s.c(this.fontProvider, paywallDialogOptions.fontProvider) && AbstractC5504s.c(this.listener, paywallDialogOptions.listener) && AbstractC5504s.c(this.purchaseLogic, paywallDialogOptions.purchaseLogic) && AbstractC5504s.c(this.customVariables, paywallDialogOptions.customVariables);
    }

    public final Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    public final InterfaceC5082a getDismissRequest() {
        return this.dismissRequest;
    }

    public final FontProvider getFontProvider() {
        return this.fontProvider;
    }

    public final PaywallListener getListener() {
        return this.listener;
    }

    public final Offering getOffering() {
        return this.offering;
    }

    public final OfferingSelection getOfferingSelection$revenuecatui_defaultsBc8Release() {
        Offering offering = this.offering;
        return offering != null ? new OfferingSelection.OfferingType(offering) : OfferingSelection.None.INSTANCE;
    }

    public final PaywallPurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final Function1 getShouldDisplayBlock() {
        return this.shouldDisplayBlock;
    }

    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public int hashCode() {
        Function1 function1 = this.shouldDisplayBlock;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        InterfaceC5082a interfaceC5082a = this.dismissRequest;
        int iHashCode2 = (iHashCode + (interfaceC5082a == null ? 0 : interfaceC5082a.hashCode())) * 31;
        Offering offering = this.offering;
        int iHashCode3 = (((iHashCode2 + (offering == null ? 0 : offering.hashCode())) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31;
        FontProvider fontProvider = this.fontProvider;
        int iHashCode4 = (iHashCode3 + (fontProvider == null ? 0 : fontProvider.hashCode())) * 31;
        PaywallListener paywallListener = this.listener;
        int iHashCode5 = (iHashCode4 + (paywallListener == null ? 0 : paywallListener.hashCode())) * 31;
        PaywallPurchaseLogic paywallPurchaseLogic = this.purchaseLogic;
        return ((iHashCode5 + (paywallPurchaseLogic != null ? paywallPurchaseLogic.hashCode() : 0)) * 31) + this.customVariables.hashCode();
    }

    public String toString() {
        return "PaywallDialogOptions(shouldDisplayBlock=" + this.shouldDisplayBlock + ", dismissRequest=" + this.dismissRequest + ", offering=" + this.offering + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontProvider=" + this.fontProvider + ", listener=" + this.listener + ", purchaseLogic=" + this.purchaseLogic + ", customVariables=" + this.customVariables + ')';
    }

    public /* synthetic */ PaywallDialogOptions(Function1 function1, InterfaceC5082a interfaceC5082a, Offering offering, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, interfaceC5082a, offering, z10, fontProvider, paywallListener, paywallPurchaseLogic, (i10 & 128) != 0 ? S.i() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallDialogOptions(Builder builder) {
        this(builder.getShouldDisplayBlock(), builder.getDismissRequest(), builder.getOffering(), builder.getShouldDisplayDismissButton(), builder.getFontProvider(), builder.getListener(), builder.getPurchaseLogic(), builder.getCustomVariables$revenuecatui_defaultsBc8Release());
        AbstractC5504s.h(builder, "builder");
    }
}
