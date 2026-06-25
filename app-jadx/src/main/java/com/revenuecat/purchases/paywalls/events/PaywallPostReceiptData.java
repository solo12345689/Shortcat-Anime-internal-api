package com.revenuecat.purchases.paywalls.events;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import Vf.x0;
import Wf.AbstractC2358b;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b(\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002BABA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJX\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\"R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u001fR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010%R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u001fR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b@\u00102\u001a\u0004\b?\u0010\u001f¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "", "", "paywallID", "sessionID", "", "revision", "displayMode", "", "darkMode", "localeIdentifier", "offeringId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;LUf/d;LTf/e;)V", "write$Self", "", "toMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaywallID", "getPaywallID$annotations", "()V", "getSessionID", "getSessionID$annotations", "I", "getRevision", "getRevision$annotations", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getOfferingId", "getOfferingId$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaywallPostReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AbstractC2358b.a json = AbstractC2358b.f20895d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final String paywallID;
    private final int revision;
    private final String sessionID;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "serializer", "()LRf/b;", "LWf/b$a;", "json", "LWf/b$a;", "getJson", "()LWf/b$a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC2358b.a getJson() {
            return PaywallPostReceiptData.json;
        }

        public final b serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ PaywallPostReceiptData(int i10, String str, String str2, int i11, String str3, boolean z10, String str4, String str5, t0 t0Var) {
        if (127 != (i10 & 127)) {
            AbstractC2327f0.a(i10, 127, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
        }
        this.paywallID = str;
        this.sessionID = str2;
        this.revision = i11;
        this.displayMode = str3;
        this.darkMode = z10;
        this.localeIdentifier = str4;
        this.offeringId = str5;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, String str2, int i10, String str3, boolean z10, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallPostReceiptData.paywallID;
        }
        if ((i11 & 2) != 0) {
            str2 = paywallPostReceiptData.sessionID;
        }
        if ((i11 & 4) != 0) {
            i10 = paywallPostReceiptData.revision;
        }
        if ((i11 & 8) != 0) {
            str3 = paywallPostReceiptData.displayMode;
        }
        if ((i11 & 16) != 0) {
            z10 = paywallPostReceiptData.darkMode;
        }
        if ((i11 & 32) != 0) {
            str4 = paywallPostReceiptData.localeIdentifier;
        }
        if ((i11 & 64) != 0) {
            str5 = paywallPostReceiptData.offeringId;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z11 = z10;
        int i12 = i10;
        return paywallPostReceiptData.copy(str, str2, i12, str3, z11, str6, str7);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallPostReceiptData self, d output, e serialDesc) {
        output.f(serialDesc, 0, x0.f20253a, self.paywallID);
        output.k(serialDesc, 1, self.sessionID);
        output.p(serialDesc, 2, self.revision);
        output.k(serialDesc, 3, self.displayMode);
        output.B(serialDesc, 4, self.darkMode);
        output.k(serialDesc, 5, self.localeIdentifier);
        output.k(serialDesc, 6, self.offeringId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaywallID() {
        return this.paywallID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDarkMode() {
        return this.darkMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOfferingId() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String paywallID, String sessionID, int revision, String displayMode, boolean darkMode, String localeIdentifier, String offeringId) {
        AbstractC5504s.h(sessionID, "sessionID");
        AbstractC5504s.h(displayMode, "displayMode");
        AbstractC5504s.h(localeIdentifier, "localeIdentifier");
        AbstractC5504s.h(offeringId, "offeringId");
        return new PaywallPostReceiptData(paywallID, sessionID, revision, displayMode, darkMode, localeIdentifier, offeringId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) other;
        return AbstractC5504s.c(this.paywallID, paywallPostReceiptData.paywallID) && AbstractC5504s.c(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && AbstractC5504s.c(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && AbstractC5504s.c(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && AbstractC5504s.c(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPaywallID() {
        return this.paywallID;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        String str = this.paywallID;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + Integer.hashCode(this.revision)) * 31) + this.displayMode.hashCode()) * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.localeIdentifier.hashCode()) * 31) + this.offeringId.hashCode();
    }

    public final Map<String, Object> toMap() {
        AbstractC2358b.a aVar = json;
        aVar.a();
        Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(aVar.e(INSTANCE.serializer(), this));
        if (mapAsMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(mapAsMap);
    }

    public String toString() {
        return "PaywallPostReceiptData(paywallID=" + this.paywallID + ", sessionID=" + this.sessionID + ", revision=" + this.revision + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", offeringId=" + this.offeringId + ')';
    }

    public PaywallPostReceiptData(String str, String sessionID, int i10, String displayMode, boolean z10, String localeIdentifier, String offeringId) {
        AbstractC5504s.h(sessionID, "sessionID");
        AbstractC5504s.h(displayMode, "displayMode");
        AbstractC5504s.h(localeIdentifier, "localeIdentifier");
        AbstractC5504s.h(offeringId, "offeringId");
        this.paywallID = str;
        this.sessionID = sessionID;
        this.revision = i10;
        this.displayMode = displayMode;
        this.darkMode = z10;
        this.localeIdentifier = localeIdentifier;
        this.offeringId = offeringId;
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getPaywallID$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }
}
