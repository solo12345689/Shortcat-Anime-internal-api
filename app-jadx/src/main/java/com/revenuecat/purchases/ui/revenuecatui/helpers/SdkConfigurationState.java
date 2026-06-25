package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u0000 G2\u00020\u0001:\u0001GBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJl\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020*HÖ\u0001¢\u0006\u0004\b1\u0010,J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020*HÖ\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010 R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bA\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010%R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bF\u0010\u001e¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;", "Landroid/os/Parcelable;", "", "apiKey", "appUserId", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "", "showInAppMessagesAutomatically", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "diagnosticsEnabled", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "pendingTransactionsForPrepaidPlansEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLcom/revenuecat/purchases/Store;ZLcom/revenuecat/purchases/EntitlementVerificationMode;Lcom/revenuecat/purchases/DangerousSettings;Z)V", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "toConfiguration", "(Landroid/content/Context;)Lcom/revenuecat/purchases/PurchasesConfiguration;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "component4", "()Z", "component5", "()Lcom/revenuecat/purchases/Store;", "component6", "component7", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "component8", "()Lcom/revenuecat/purchases/DangerousSettings;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLcom/revenuecat/purchases/Store;ZLcom/revenuecat/purchases/EntitlementVerificationMode;Lcom/revenuecat/purchases/DangerousSettings;Z)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getApiKey", "getAppUserId", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "Z", "getShowInAppMessagesAutomatically", "Lcom/revenuecat/purchases/Store;", "getStore", "getDiagnosticsEnabled", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "getPendingTransactionsForPrepaidPlansEnabled", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SdkConfigurationState implements Parcelable {
    private final String apiKey;
    private final String appUserId;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SdkConfigurationState> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState$Companion;", "", "()V", "from", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationState;", "configuration", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SdkConfigurationState from(PurchasesConfiguration configuration) {
            AbstractC5504s.h(configuration, "configuration");
            return new SdkConfigurationState(configuration.getApiKey(), configuration.getAppUserID(), configuration.getPurchasesAreCompletedBy(), configuration.getShowInAppMessagesAutomatically(), configuration.getStore(), configuration.getDiagnosticsEnabled(), configuration.getVerificationMode(), configuration.getDangerousSettings(), configuration.getPendingTransactionsForPrepaidPlansEnabled());
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SdkConfigurationState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdkConfigurationState createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            Store store;
            boolean z12;
            EntitlementVerificationMode entitlementVerificationMode;
            DangerousSettings dangerousSettings;
            boolean z13;
            AbstractC5504s.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            PurchasesAreCompletedBy purchasesAreCompletedByValueOf = PurchasesAreCompletedBy.valueOf(parcel.readString());
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z14 = true;
            } else {
                z10 = false;
            }
            Store storeValueOf = Store.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z11 = true;
                store = storeValueOf;
                z12 = true;
            } else {
                z11 = true;
                store = storeValueOf;
                z12 = z10;
            }
            EntitlementVerificationMode entitlementVerificationModeValueOf = EntitlementVerificationMode.valueOf(parcel.readString());
            DangerousSettings dangerousSettings2 = (DangerousSettings) parcel.readParcelable(SdkConfigurationState.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z13 = z11;
                entitlementVerificationMode = entitlementVerificationModeValueOf;
                dangerousSettings = dangerousSettings2;
            } else {
                entitlementVerificationMode = entitlementVerificationModeValueOf;
                dangerousSettings = dangerousSettings2;
                z13 = z10;
            }
            return new SdkConfigurationState(string, string2, purchasesAreCompletedByValueOf, z14, store, z12, entitlementVerificationMode, dangerousSettings, z13);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdkConfigurationState[] newArray(int i10) {
            return new SdkConfigurationState[i10];
        }
    }

    public SdkConfigurationState(String apiKey, String str, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, Store store, boolean z11, EntitlementVerificationMode verificationMode, DangerousSettings dangerousSettings, boolean z12) {
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(verificationMode, "verificationMode");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        this.apiKey = apiKey;
        this.appUserId = str;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.showInAppMessagesAutomatically = z10;
        this.store = store;
        this.diagnosticsEnabled = z11;
        this.verificationMode = verificationMode;
        this.dangerousSettings = dangerousSettings;
        this.pendingTransactionsForPrepaidPlansEnabled = z12;
    }

    public static /* synthetic */ SdkConfigurationState copy$default(SdkConfigurationState sdkConfigurationState, String str, String str2, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z10, Store store, boolean z11, EntitlementVerificationMode entitlementVerificationMode, DangerousSettings dangerousSettings, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sdkConfigurationState.apiKey;
        }
        if ((i10 & 2) != 0) {
            str2 = sdkConfigurationState.appUserId;
        }
        if ((i10 & 4) != 0) {
            purchasesAreCompletedBy = sdkConfigurationState.purchasesAreCompletedBy;
        }
        if ((i10 & 8) != 0) {
            z10 = sdkConfigurationState.showInAppMessagesAutomatically;
        }
        if ((i10 & 16) != 0) {
            store = sdkConfigurationState.store;
        }
        if ((i10 & 32) != 0) {
            z11 = sdkConfigurationState.diagnosticsEnabled;
        }
        if ((i10 & 64) != 0) {
            entitlementVerificationMode = sdkConfigurationState.verificationMode;
        }
        if ((i10 & 128) != 0) {
            dangerousSettings = sdkConfigurationState.dangerousSettings;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z12 = sdkConfigurationState.pendingTransactionsForPrepaidPlansEnabled;
        }
        DangerousSettings dangerousSettings2 = dangerousSettings;
        boolean z13 = z12;
        boolean z14 = z11;
        EntitlementVerificationMode entitlementVerificationMode2 = entitlementVerificationMode;
        Store store2 = store;
        PurchasesAreCompletedBy purchasesAreCompletedBy2 = purchasesAreCompletedBy;
        return sdkConfigurationState.copy(str, str2, purchasesAreCompletedBy2, z10, store2, z14, entitlementVerificationMode2, dangerousSettings2, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppUserId() {
        return this.appUserId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Store getStore() {
        return this.store;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final SdkConfigurationState copy(String apiKey, String appUserId, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean showInAppMessagesAutomatically, Store store, boolean diagnosticsEnabled, EntitlementVerificationMode verificationMode, DangerousSettings dangerousSettings, boolean pendingTransactionsForPrepaidPlansEnabled) {
        AbstractC5504s.h(apiKey, "apiKey");
        AbstractC5504s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(verificationMode, "verificationMode");
        AbstractC5504s.h(dangerousSettings, "dangerousSettings");
        return new SdkConfigurationState(apiKey, appUserId, purchasesAreCompletedBy, showInAppMessagesAutomatically, store, diagnosticsEnabled, verificationMode, dangerousSettings, pendingTransactionsForPrepaidPlansEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkConfigurationState)) {
            return false;
        }
        SdkConfigurationState sdkConfigurationState = (SdkConfigurationState) other;
        return AbstractC5504s.c(this.apiKey, sdkConfigurationState.apiKey) && AbstractC5504s.c(this.appUserId, sdkConfigurationState.appUserId) && this.purchasesAreCompletedBy == sdkConfigurationState.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == sdkConfigurationState.showInAppMessagesAutomatically && this.store == sdkConfigurationState.store && this.diagnosticsEnabled == sdkConfigurationState.diagnosticsEnabled && this.verificationMode == sdkConfigurationState.verificationMode && AbstractC5504s.c(this.dangerousSettings, sdkConfigurationState.dangerousSettings) && this.pendingTransactionsForPrepaidPlansEnabled == sdkConfigurationState.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserId() {
        return this.appUserId;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        String str = this.appUserId;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.purchasesAreCompletedBy.hashCode()) * 31) + Boolean.hashCode(this.showInAppMessagesAutomatically)) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.diagnosticsEnabled)) * 31) + this.verificationMode.hashCode()) * 31) + this.dangerousSettings.hashCode()) * 31) + Boolean.hashCode(this.pendingTransactionsForPrepaidPlansEnabled);
    }

    public final PurchasesConfiguration toConfiguration(Context context) {
        AbstractC5504s.h(context, "context");
        return new PurchasesConfiguration.Builder(context, this.apiKey).appUserID(this.appUserId).purchasesAreCompletedBy(this.purchasesAreCompletedBy).showInAppMessagesAutomatically(this.showInAppMessagesAutomatically).store(this.store).diagnosticsEnabled(this.diagnosticsEnabled).entitlementVerificationMode(this.verificationMode).dangerousSettings(this.dangerousSettings).pendingTransactionsForPrepaidPlansEnabled(this.pendingTransactionsForPrepaidPlansEnabled).build();
    }

    public String toString() {
        return "SdkConfigurationState(apiKey=" + this.apiKey + ", appUserId=" + this.appUserId + ", purchasesAreCompletedBy=" + this.purchasesAreCompletedBy + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", store=" + this.store + ", diagnosticsEnabled=" + this.diagnosticsEnabled + ", verificationMode=" + this.verificationMode + ", dangerousSettings=" + this.dangerousSettings + ", pendingTransactionsForPrepaidPlansEnabled=" + this.pendingTransactionsForPrepaidPlansEnabled + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        parcel.writeString(this.apiKey);
        parcel.writeString(this.appUserId);
        parcel.writeString(this.purchasesAreCompletedBy.name());
        parcel.writeInt(this.showInAppMessagesAutomatically ? 1 : 0);
        parcel.writeString(this.store.name());
        parcel.writeInt(this.diagnosticsEnabled ? 1 : 0);
        parcel.writeString(this.verificationMode.name());
        parcel.writeParcelable(this.dangerousSettings, flags);
        parcel.writeInt(this.pendingTransactionsForPrepaidPlansEnabled ? 1 : 0);
    }
}
