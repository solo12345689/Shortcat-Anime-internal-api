package com.revenuecat.purchases.ui.revenuecatui.customercenter.actions;

import com.revenuecat.purchases.customercenter.CustomActionData;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "", "()V", "ContactSupport", "CustomActionSelected", "DismissPromotionalOffer", "DismissRestoreDialog", "DismissSupportTicketSuccessSnackbar", "NavigationButtonPressed", "OpenURL", "PathButtonPressed", "PerformRestore", "PurchasePromotionalOffer", "SelectPurchase", "ShowPaywall", "ShowSupportTicketCreation", "ShowVirtualCurrencyBalances", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ContactSupport;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$CustomActionSelected;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$DismissPromotionalOffer;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$DismissRestoreDialog;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$DismissSupportTicketSuccessSnackbar;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$NavigationButtonPressed;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$OpenURL;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PathButtonPressed;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PerformRestore;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PurchasePromotionalOffer;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$SelectPurchase;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ShowPaywall;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ShowSupportTicketCreation;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ShowVirtualCurrencyBalances;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomerCenterAction {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ContactSupport;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ContactSupport extends CustomerCenterAction {
        public static final int $stable = 0;
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSupport(String email) {
            super(null);
            AbstractC5504s.h(email, "email");
            this.email = email;
        }

        public static /* synthetic */ ContactSupport copy$default(ContactSupport contactSupport, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = contactSupport.email;
            }
            return contactSupport.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final ContactSupport copy(String email) {
            AbstractC5504s.h(email, "email");
            return new ContactSupport(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContactSupport) && AbstractC5504s.c(this.email, ((ContactSupport) other).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "ContactSupport(email=" + this.email + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$CustomActionSelected;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "customActionData", "Lcom/revenuecat/purchases/customercenter/CustomActionData;", "(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V", "getCustomActionData", "()Lcom/revenuecat/purchases/customercenter/CustomActionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomActionSelected extends CustomerCenterAction {
        public static final int $stable = 8;
        private final CustomActionData customActionData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomActionSelected(CustomActionData customActionData) {
            super(null);
            AbstractC5504s.h(customActionData, "customActionData");
            this.customActionData = customActionData;
        }

        public static /* synthetic */ CustomActionSelected copy$default(CustomActionSelected customActionSelected, CustomActionData customActionData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customActionData = customActionSelected.customActionData;
            }
            return customActionSelected.copy(customActionData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CustomActionData getCustomActionData() {
            return this.customActionData;
        }

        public final CustomActionSelected copy(CustomActionData customActionData) {
            AbstractC5504s.h(customActionData, "customActionData");
            return new CustomActionSelected(customActionData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomActionSelected) && AbstractC5504s.c(this.customActionData, ((CustomActionSelected) other).customActionData);
        }

        public final CustomActionData getCustomActionData() {
            return this.customActionData;
        }

        public int hashCode() {
            return this.customActionData.hashCode();
        }

        public String toString() {
            return "CustomActionSelected(customActionData=" + this.customActionData + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$DismissPromotionalOffer;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "originalPath", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V", "getOriginalPath", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DismissPromotionalOffer extends CustomerCenterAction {
        public static final int $stable = 8;
        private final CustomerCenterConfigData.HelpPath originalPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DismissPromotionalOffer(CustomerCenterConfigData.HelpPath originalPath) {
            super(null);
            AbstractC5504s.h(originalPath, "originalPath");
            this.originalPath = originalPath;
        }

        public static /* synthetic */ DismissPromotionalOffer copy$default(DismissPromotionalOffer dismissPromotionalOffer, CustomerCenterConfigData.HelpPath helpPath, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                helpPath = dismissPromotionalOffer.originalPath;
            }
            return dismissPromotionalOffer.copy(helpPath);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CustomerCenterConfigData.HelpPath getOriginalPath() {
            return this.originalPath;
        }

        public final DismissPromotionalOffer copy(CustomerCenterConfigData.HelpPath originalPath) {
            AbstractC5504s.h(originalPath, "originalPath");
            return new DismissPromotionalOffer(originalPath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissPromotionalOffer) && AbstractC5504s.c(this.originalPath, ((DismissPromotionalOffer) other).originalPath);
        }

        public final CustomerCenterConfigData.HelpPath getOriginalPath() {
            return this.originalPath;
        }

        public int hashCode() {
            return this.originalPath.hashCode();
        }

        public String toString() {
            return "DismissPromotionalOffer(originalPath=" + this.originalPath + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$DismissRestoreDialog;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DismissRestoreDialog extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final DismissRestoreDialog INSTANCE = new DismissRestoreDialog();

        private DismissRestoreDialog() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$DismissSupportTicketSuccessSnackbar;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DismissSupportTicketSuccessSnackbar extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final DismissSupportTicketSuccessSnackbar INSTANCE = new DismissSupportTicketSuccessSnackbar();

        private DismissSupportTicketSuccessSnackbar() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$NavigationButtonPressed;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NavigationButtonPressed extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final NavigationButtonPressed INSTANCE = new NavigationButtonPressed();

        private NavigationButtonPressed() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$OpenURL;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OpenURL extends CustomerCenterAction {
        public static final int $stable = 0;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenURL(String url) {
            super(null);
            AbstractC5504s.h(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenURL copy$default(OpenURL openURL, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = openURL.url;
            }
            return openURL.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final OpenURL copy(String url) {
            AbstractC5504s.h(url, "url");
            return new OpenURL(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenURL) && AbstractC5504s.c(this.url, ((OpenURL) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenURL(url=" + this.url + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PathButtonPressed;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "path", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "purchaseInformation", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "getPath", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "getPurchaseInformation", "()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PathButtonPressed extends CustomerCenterAction {
        public static final int $stable = 8;
        private final CustomerCenterConfigData.HelpPath path;
        private final PurchaseInformation purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PathButtonPressed(CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
            super(null);
            AbstractC5504s.h(path, "path");
            this.path = path;
            this.purchaseInformation = purchaseInformation;
        }

        public static /* synthetic */ PathButtonPressed copy$default(PathButtonPressed pathButtonPressed, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                helpPath = pathButtonPressed.path;
            }
            if ((i10 & 2) != 0) {
                purchaseInformation = pathButtonPressed.purchaseInformation;
            }
            return pathButtonPressed.copy(helpPath, purchaseInformation);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CustomerCenterConfigData.HelpPath getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PurchaseInformation getPurchaseInformation() {
            return this.purchaseInformation;
        }

        public final PathButtonPressed copy(CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
            AbstractC5504s.h(path, "path");
            return new PathButtonPressed(path, purchaseInformation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PathButtonPressed)) {
                return false;
            }
            PathButtonPressed pathButtonPressed = (PathButtonPressed) other;
            return AbstractC5504s.c(this.path, pathButtonPressed.path) && AbstractC5504s.c(this.purchaseInformation, pathButtonPressed.purchaseInformation);
        }

        public final CustomerCenterConfigData.HelpPath getPath() {
            return this.path;
        }

        public final PurchaseInformation getPurchaseInformation() {
            return this.purchaseInformation;
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            PurchaseInformation purchaseInformation = this.purchaseInformation;
            return iHashCode + (purchaseInformation == null ? 0 : purchaseInformation.hashCode());
        }

        public String toString() {
            return "PathButtonPressed(path=" + this.path + ", purchaseInformation=" + this.purchaseInformation + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PerformRestore;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PerformRestore extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final PerformRestore INSTANCE = new PerformRestore();

        private PerformRestore() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PurchasePromotionalOffer;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "subscriptionOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "(Lcom/revenuecat/purchases/models/SubscriptionOption;)V", "getSubscriptionOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PurchasePromotionalOffer extends CustomerCenterAction {
        public static final int $stable = 8;
        private final SubscriptionOption subscriptionOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchasePromotionalOffer(SubscriptionOption subscriptionOption) {
            super(null);
            AbstractC5504s.h(subscriptionOption, "subscriptionOption");
            this.subscriptionOption = subscriptionOption;
        }

        public static /* synthetic */ PurchasePromotionalOffer copy$default(PurchasePromotionalOffer purchasePromotionalOffer, SubscriptionOption subscriptionOption, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                subscriptionOption = purchasePromotionalOffer.subscriptionOption;
            }
            return purchasePromotionalOffer.copy(subscriptionOption);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SubscriptionOption getSubscriptionOption() {
            return this.subscriptionOption;
        }

        public final PurchasePromotionalOffer copy(SubscriptionOption subscriptionOption) {
            AbstractC5504s.h(subscriptionOption, "subscriptionOption");
            return new PurchasePromotionalOffer(subscriptionOption);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PurchasePromotionalOffer) && AbstractC5504s.c(this.subscriptionOption, ((PurchasePromotionalOffer) other).subscriptionOption);
        }

        public final SubscriptionOption getSubscriptionOption() {
            return this.subscriptionOption;
        }

        public int hashCode() {
            return this.subscriptionOption.hashCode();
        }

        public String toString() {
            return "PurchasePromotionalOffer(subscriptionOption=" + this.subscriptionOption + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$SelectPurchase;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "purchase", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "getPurchase", "()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SelectPurchase extends CustomerCenterAction {
        public static final int $stable = 8;
        private final PurchaseInformation purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPurchase(PurchaseInformation purchase) {
            super(null);
            AbstractC5504s.h(purchase, "purchase");
            this.purchase = purchase;
        }

        public static /* synthetic */ SelectPurchase copy$default(SelectPurchase selectPurchase, PurchaseInformation purchaseInformation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                purchaseInformation = selectPurchase.purchase;
            }
            return selectPurchase.copy(purchaseInformation);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PurchaseInformation getPurchase() {
            return this.purchase;
        }

        public final SelectPurchase copy(PurchaseInformation purchase) {
            AbstractC5504s.h(purchase, "purchase");
            return new SelectPurchase(purchase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectPurchase) && AbstractC5504s.c(this.purchase, ((SelectPurchase) other).purchase);
        }

        public final PurchaseInformation getPurchase() {
            return this.purchase;
        }

        public int hashCode() {
            return this.purchase.hashCode();
        }

        public String toString() {
            return "SelectPurchase(purchase=" + this.purchase + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ShowPaywall;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShowPaywall extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final ShowPaywall INSTANCE = new ShowPaywall();

        private ShowPaywall() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ShowSupportTicketCreation;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShowSupportTicketCreation extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final ShowSupportTicketCreation INSTANCE = new ShowSupportTicketCreation();

        private ShowSupportTicketCreation() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$ShowVirtualCurrencyBalances;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShowVirtualCurrencyBalances extends CustomerCenterAction {
        public static final int $stable = 0;
        public static final ShowVirtualCurrencyBalances INSTANCE = new ShowVirtualCurrencyBalances();

        private ShowVirtualCurrencyBalances() {
            super(null);
        }
    }

    public /* synthetic */ CustomerCenterAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CustomerCenterAction() {
    }
}
