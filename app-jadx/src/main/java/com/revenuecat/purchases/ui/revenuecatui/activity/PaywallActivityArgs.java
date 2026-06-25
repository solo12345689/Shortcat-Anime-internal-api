package com.revenuecat.purchases.ui.revenuecatui.activity;

import Ud.S;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0082\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001aR'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001eR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b<\u0010\u001eR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b=\u0010\u001eR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b>\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010#¨\u0006A"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;", "Landroid/os/Parcelable;", "", "requiredEntitlementIdentifier", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "offeringIdAndPresentedOfferingContext", "", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/TypographyType;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "fonts", "", "shouldDisplayDismissButton", "edgeToEdge", "wasLaunchedThroughSDK", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "", "nonSerializableArgsKey", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Ljava/util/Map;ZZZLjava/util/Map;Ljava/lang/Integer;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;", "fontProvider", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZZLjava/util/Map;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "component3", "()Ljava/util/Map;", "component4", "()Z", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Ljava/util/Map;ZZZLjava/util/Map;Ljava/lang/Integer;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRequiredEntitlementIdentifier", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "getOfferingIdAndPresentedOfferingContext", "Ljava/util/Map;", "getFonts", "Z", "getShouldDisplayDismissButton", "getEdgeToEdge", "getWasLaunchedThroughSDK", "getCustomVariables", "Ljava/lang/Integer;", "getNonSerializableArgsKey", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaywallActivityArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaywallActivityArgs> CREATOR = new Creator();
    private final Map<String, CustomVariableValue> customVariables;
    private final boolean edgeToEdge;
    private final Map<TypographyType, PaywallFontFamily> fonts;
    private final Integer nonSerializableArgsKey;
    private final OfferingSelection.IdAndPresentedOfferingContext offeringIdAndPresentedOfferingContext;
    private final String requiredEntitlementIdentifier;
    private final boolean shouldDisplayDismissButton;
    private final boolean wasLaunchedThroughSDK;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaywallActivityArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final PaywallActivityArgs createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i10;
            LinkedHashMap linkedHashMap2;
            boolean z10;
            boolean z11;
            AbstractC5504s.h(parcel, "parcel");
            String string = parcel.readString();
            OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContextCreateFromParcel = parcel.readInt() == 0 ? null : OfferingSelection.IdAndPresentedOfferingContext.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(TypographyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaywallFontFamily.CREATOR.createFromParcel(parcel));
                }
            }
            boolean z12 = 1;
            if (parcel.readInt() != 0) {
                i10 = 0;
                linkedHashMap2 = linkedHashMap;
                z10 = true;
            } else {
                i10 = 0;
                linkedHashMap2 = linkedHashMap;
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z12 = i10;
            }
            boolean z13 = z11;
            if (parcel.readInt() == 0) {
                z13 = i10;
            }
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i13);
            while (i10 != i13) {
                linkedHashMap3.put(parcel.readString(), parcel.readParcelable(PaywallActivityArgs.class.getClassLoader()));
                i10++;
            }
            return new PaywallActivityArgs(string, idAndPresentedOfferingContextCreateFromParcel, linkedHashMap2, z10, z12, z13, linkedHashMap3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallActivityArgs[] newArray(int i10) {
            return new PaywallActivityArgs[i10];
        }
    }

    public PaywallActivityArgs() {
        this((String) null, (OfferingSelection.IdAndPresentedOfferingContext) null, (Map) null, false, false, false, (Map) null, (Integer) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallActivityArgs copy$default(PaywallActivityArgs paywallActivityArgs, String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map map, boolean z10, boolean z11, boolean z12, Map map2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallActivityArgs.requiredEntitlementIdentifier;
        }
        if ((i10 & 2) != 0) {
            idAndPresentedOfferingContext = paywallActivityArgs.offeringIdAndPresentedOfferingContext;
        }
        if ((i10 & 4) != 0) {
            map = paywallActivityArgs.fonts;
        }
        if ((i10 & 8) != 0) {
            z10 = paywallActivityArgs.shouldDisplayDismissButton;
        }
        if ((i10 & 16) != 0) {
            z11 = paywallActivityArgs.edgeToEdge;
        }
        if ((i10 & 32) != 0) {
            z12 = paywallActivityArgs.wasLaunchedThroughSDK;
        }
        if ((i10 & 64) != 0) {
            map2 = paywallActivityArgs.customVariables;
        }
        if ((i10 & 128) != 0) {
            num = paywallActivityArgs.nonSerializableArgsKey;
        }
        Map map3 = map2;
        Integer num2 = num;
        boolean z13 = z11;
        boolean z14 = z12;
        return paywallActivityArgs.copy(str, idAndPresentedOfferingContext, map, z10, z13, z14, map3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequiredEntitlementIdentifier() {
        return this.requiredEntitlementIdentifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OfferingSelection.IdAndPresentedOfferingContext getOfferingIdAndPresentedOfferingContext() {
        return this.offeringIdAndPresentedOfferingContext;
    }

    public final Map<TypographyType, PaywallFontFamily> component3() {
        return this.fonts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEdgeToEdge() {
        return this.edgeToEdge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getWasLaunchedThroughSDK() {
        return this.wasLaunchedThroughSDK;
    }

    public final Map<String, CustomVariableValue> component7() {
        return this.customVariables;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getNonSerializableArgsKey() {
        return this.nonSerializableArgsKey;
    }

    public final PaywallActivityArgs copy(String requiredEntitlementIdentifier, OfferingSelection.IdAndPresentedOfferingContext offeringIdAndPresentedOfferingContext, Map<TypographyType, PaywallFontFamily> fonts, boolean shouldDisplayDismissButton, boolean edgeToEdge, boolean wasLaunchedThroughSDK, Map<String, ? extends CustomVariableValue> customVariables, Integer nonSerializableArgsKey) {
        AbstractC5504s.h(customVariables, "customVariables");
        return new PaywallActivityArgs(requiredEntitlementIdentifier, offeringIdAndPresentedOfferingContext, fonts, shouldDisplayDismissButton, edgeToEdge, wasLaunchedThroughSDK, customVariables, nonSerializableArgsKey);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallActivityArgs)) {
            return false;
        }
        PaywallActivityArgs paywallActivityArgs = (PaywallActivityArgs) other;
        return AbstractC5504s.c(this.requiredEntitlementIdentifier, paywallActivityArgs.requiredEntitlementIdentifier) && AbstractC5504s.c(this.offeringIdAndPresentedOfferingContext, paywallActivityArgs.offeringIdAndPresentedOfferingContext) && AbstractC5504s.c(this.fonts, paywallActivityArgs.fonts) && this.shouldDisplayDismissButton == paywallActivityArgs.shouldDisplayDismissButton && this.edgeToEdge == paywallActivityArgs.edgeToEdge && this.wasLaunchedThroughSDK == paywallActivityArgs.wasLaunchedThroughSDK && AbstractC5504s.c(this.customVariables, paywallActivityArgs.customVariables) && AbstractC5504s.c(this.nonSerializableArgsKey, paywallActivityArgs.nonSerializableArgsKey);
    }

    public final Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    public final boolean getEdgeToEdge() {
        return this.edgeToEdge;
    }

    public final Map<TypographyType, PaywallFontFamily> getFonts() {
        return this.fonts;
    }

    public final Integer getNonSerializableArgsKey() {
        return this.nonSerializableArgsKey;
    }

    public final OfferingSelection.IdAndPresentedOfferingContext getOfferingIdAndPresentedOfferingContext() {
        return this.offeringIdAndPresentedOfferingContext;
    }

    public final String getRequiredEntitlementIdentifier() {
        return this.requiredEntitlementIdentifier;
    }

    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public final boolean getWasLaunchedThroughSDK() {
        return this.wasLaunchedThroughSDK;
    }

    public int hashCode() {
        String str = this.requiredEntitlementIdentifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = this.offeringIdAndPresentedOfferingContext;
        int iHashCode2 = (iHashCode + (idAndPresentedOfferingContext == null ? 0 : idAndPresentedOfferingContext.hashCode())) * 31;
        Map<TypographyType, PaywallFontFamily> map = this.fonts;
        int iHashCode3 = (((((((((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31) + Boolean.hashCode(this.edgeToEdge)) * 31) + Boolean.hashCode(this.wasLaunchedThroughSDK)) * 31) + this.customVariables.hashCode()) * 31;
        Integer num = this.nonSerializableArgsKey;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PaywallActivityArgs(requiredEntitlementIdentifier=" + this.requiredEntitlementIdentifier + ", offeringIdAndPresentedOfferingContext=" + this.offeringIdAndPresentedOfferingContext + ", fonts=" + this.fonts + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", edgeToEdge=" + this.edgeToEdge + ", wasLaunchedThroughSDK=" + this.wasLaunchedThroughSDK + ", customVariables=" + this.customVariables + ", nonSerializableArgsKey=" + this.nonSerializableArgsKey + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        parcel.writeString(this.requiredEntitlementIdentifier);
        OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = this.offeringIdAndPresentedOfferingContext;
        if (idAndPresentedOfferingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            idAndPresentedOfferingContext.writeToParcel(parcel, flags);
        }
        Map<TypographyType, PaywallFontFamily> map = this.fonts;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<TypographyType, PaywallFontFamily> entry : map.entrySet()) {
                parcel.writeString(entry.getKey().name());
                PaywallFontFamily value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, flags);
                }
            }
        }
        parcel.writeInt(this.shouldDisplayDismissButton ? 1 : 0);
        parcel.writeInt(this.edgeToEdge ? 1 : 0);
        parcel.writeInt(this.wasLaunchedThroughSDK ? 1 : 0);
        Map<String, CustomVariableValue> map2 = this.customVariables;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, CustomVariableValue> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeParcelable(entry2.getValue(), flags);
        }
        Integer num = this.nonSerializableArgsKey;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map<TypographyType, PaywallFontFamily> map, boolean z10, boolean z11, boolean z12, Map<String, ? extends CustomVariableValue> customVariables, Integer num) {
        AbstractC5504s.h(customVariables, "customVariables");
        this.requiredEntitlementIdentifier = str;
        this.offeringIdAndPresentedOfferingContext = idAndPresentedOfferingContext;
        this.fonts = map;
        this.shouldDisplayDismissButton = z10;
        this.edgeToEdge = z11;
        this.wasLaunchedThroughSDK = z12;
        this.customVariables = customVariables;
        this.nonSerializableArgsKey = num;
    }

    public /* synthetic */ PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map map, boolean z10, boolean z11, boolean z12, Map map2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : idAndPresentedOfferingContext, (Map<TypographyType, PaywallFontFamily>) ((i10 & 4) != 0 ? null : map), (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z11, (i10 & 32) != 0 ? true : z12, (Map<String, ? extends CustomVariableValue>) ((i10 & 64) != 0 ? S.i() : map2), (i10 & 128) != 0 ? null : num);
    }

    public /* synthetic */ PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, boolean z12, Map map, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : idAndPresentedOfferingContext, parcelizableFontProvider, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z11, (i10 & 32) != 0 ? true : z12, (Map<String, ? extends CustomVariableValue>) ((i10 & 64) != 0 ? S.i() : map), (i10 & 128) != 0 ? null : num);
    }

    public PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, boolean z12, Map<String, ? extends CustomVariableValue> customVariables, Integer num) {
        LinkedHashMap linkedHashMap;
        AbstractC5504s.h(customVariables, "customVariables");
        if (parcelizableFontProvider != null) {
            TypographyType[] typographyTypeArrValues = TypographyType.values();
            linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(typographyTypeArrValues.length), 16));
            for (TypographyType typographyType : typographyTypeArrValues) {
                linkedHashMap.put(typographyType, parcelizableFontProvider.getFont(typographyType));
            }
        } else {
            linkedHashMap = null;
        }
        this(str, idAndPresentedOfferingContext, linkedHashMap, z10, z11, z12, customVariables, num);
    }
}
