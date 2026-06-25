package com.revenuecat.purchases.ui.revenuecatui.data;

import Cf.l;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import Y.A0;
import Y.C0;
import Y.J1;
import Y.U1;
import Y.b2;
import Y.h2;
import android.os.LocaleList;
import c1.d;
import c1.e;
import com.amazon.a.a.o.b;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.LocaleHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptySet;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import i0.C4963G;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "", "Error", "Loaded", "Loading", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loading;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaywallState {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", b.f34648f, "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error implements PaywallState {
        public static final int $stable = 0;
        private final String errorMessage;

        public Error(String errorMessage) {
            AbstractC5504s.h(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            Logger.INSTANCE.e("Paywall transitioned to error state: " + errorMessage);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.errorMessage;
            }
            return error.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Error copy(String str) {
            AbstractC5504s.h(str, "errorMessage");
            return new Error(str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && AbstractC5504s.c(this.errorMessage, ((Error) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loading;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "()V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loading implements PaywallState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "offering", "Lcom/revenuecat/purchases/Offering;", "getOffering", "()Lcom/revenuecat/purchases/Offering;", "Components", "Legacy", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Loaded extends PaywallState {
        Offering getOffering();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0004\u009a\u0001\u009b\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\u0010*\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u0004\u0018\u00010/*\b\u0012\u0004\u0012\u00020(0.H\u0002¢\u0006\u0004\b0\u00101J1\u00107\u001a\u0002062\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b7\u00108J\u0015\u00107\u001a\u0002062\u0006\u00109\u001a\u00020\u0012¢\u0006\u0004\b7\u0010:J\r\u0010;\u001a\u000206¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b@\u0010?R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010QR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010RR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010SR#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010T\u001a\u0004\bU\u0010VR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bW\u0010VR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010XR#\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u0016\u0010[\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010QR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00120\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R&\u0010_\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\\0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010TR1\u0010f\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00108B@BX\u0082\u008e\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010:R'\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020g0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010VR\u001b\u0010q\u001a\u00020l8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001b\u0010t\u001a\u00020l8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010n\u001a\u0004\bs\u0010pR\"\u0010v\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00120u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR+\u00104\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0016\u0010~\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010QR1\u00109\u001a\u0004\u0018\u00010\u00122\b\u0010`\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0014\n\u0004\b\u007f\u0010b\u001a\u0005\b\u0080\u0001\u0010d\"\u0005\b\u0081\u0001\u0010:R\"\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0082\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010n\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u008b\u0001\u001a\u00030\u0087\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010n\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u00100\u001a\u0004\u0018\u00010/8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010n\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R/\u00105\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u008f\u0001\u0010b\u001a\u0005\b\u0090\u0001\u0010F\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0093\u0001\u001a\u00020!8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "stack", "stickyFooter", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", AppStateModule.APP_STATE_BACKGROUND, "", "showPricesWithDecimals", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableConfig", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "variableDataProvider", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "locales", "", "storefrontCountryCode", "Lkotlin/Function0;", "Ljava/util/Date;", "dateProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "packages", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "defaultCustomVariables", "Lc1/e;", "initialLocaleList", "", "initialSelectedTabIndex", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;", "initialSheetState", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;ZLcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;Ljava/util/Map;Ljava/util/Map;Lc1/e;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;)V", "uniqueId", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "findPackageInfoByUniqueId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "toLocaleId-8pYHj4M", "(Lc1/e;)Ljava/lang/String;", "toLocaleId", "", "", "mostExpensivePricePerMonthMicros", "(Ljava/util/List;)Ljava/lang/Long;", "Landroid/os/LocaleList;", "localeList", "selectedTabIndex", "actionInProgress", "LTd/L;", "update", "(Landroid/os/LocaleList;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "selectedPackageUniqueId", "(Ljava/lang/String;)V", "resetToDefaultPackage", "()V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "getStack", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "getStickyFooter", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "getBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "Z", "getShowPricesWithDecimals", "()Z", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig", "()Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "getVariableDataProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "Lcom/revenuecat/purchases/Offering;", "getOffering", "()Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "Ljava/lang/String;", "Lie/a;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "Ljava/util/Map;", "getCustomVariables", "()Ljava/util/Map;", "getDefaultCustomVariables", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "mergedCustomVariables", "getMergedCustomVariables", "initialSelectedPackageOutsideTabs", "", "packagesOutsideTabsUniqueIds", "Ljava/util/Set;", "tabsByUniqueId", "<set-?>", "localeId$delegate", "LY/C0;", "getLocaleId-uqtKvyA", "()Ljava/lang/String;", "setLocaleId-_KYeFs0", "localeId", "Ljava/util/Locale;", "availableStorefrontCountryLocalesByLanguage$delegate", "Lkotlin/Lazy;", "getAvailableStorefrontCountryLocalesByLanguage", "availableStorefrontCountryLocalesByLanguage", "Lc1/d;", "locale$delegate", "LY/h2;", "getLocale", "()Lc1/d;", "locale", "currencyLocale$delegate", "getCurrencyLocale", "currencyLocale", "Li0/G;", "selectedPackageByTab", "Li0/G;", "selectedTabIndex$delegate", "LY/A0;", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "initialSelectedPackageUniqueId", "selectedPackageUniqueId$delegate", "getSelectedPackageUniqueId", "setSelectedPackageUniqueId", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfo$delegate", "getSelectedPackageInfo", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibility$delegate", "getSelectedOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibility", "mostExpensivePricePerMonthMicros$delegate", "getMostExpensivePricePerMonthMicros", "()Ljava/lang/Long;", "actionInProgress$delegate", "getActionInProgress", "setActionInProgress", "(Z)V", "sheet", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;", "getSheet", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;", "getCurrentDate", "()Ljava/util/Date;", "currentDate", "AvailablePackages", "SelectedPackageInfo", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Components implements Loaded {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: actionInProgress$delegate, reason: from kotlin metadata */
            private final C0 actionInProgress;

            /* JADX INFO: renamed from: availableStorefrontCountryLocalesByLanguage$delegate, reason: from kotlin metadata */
            private final Lazy availableStorefrontCountryLocalesByLanguage;
            private final BackgroundStyles background;

            /* JADX INFO: renamed from: currencyLocale$delegate, reason: from kotlin metadata */
            private final h2 currencyLocale;
            private final Map<String, CustomVariableValue> customVariables;
            private final InterfaceC5082a dateProvider;
            private final Map<String, CustomVariableValue> defaultCustomVariables;
            private final String initialSelectedPackageOutsideTabs;
            private final String initialSelectedPackageUniqueId;

            /* JADX INFO: renamed from: locale$delegate, reason: from kotlin metadata */
            private final h2 locale;

            /* JADX INFO: renamed from: localeId$delegate, reason: from kotlin metadata */
            private final C0 localeId;
            private final NonEmptySet<LocaleId> locales;
            private final Map<String, CustomVariableValue> mergedCustomVariables;

            /* JADX INFO: renamed from: mostExpensivePricePerMonthMicros$delegate, reason: from kotlin metadata */
            private final h2 mostExpensivePricePerMonthMicros;
            private final Offering offering;
            private final AvailablePackages packages;
            private final Set<String> packagesOutsideTabsUniqueIds;
            private final PurchasesType purchases;

            /* JADX INFO: renamed from: selectedOfferEligibility$delegate, reason: from kotlin metadata */
            private final h2 selectedOfferEligibility;
            private final C4963G selectedPackageByTab;

            /* JADX INFO: renamed from: selectedPackageInfo$delegate, reason: from kotlin metadata */
            private final h2 selectedPackageInfo;

            /* JADX INFO: renamed from: selectedPackageUniqueId$delegate, reason: from kotlin metadata */
            private final C0 selectedPackageUniqueId;

            /* JADX INFO: renamed from: selectedTabIndex$delegate, reason: from kotlin metadata */
            private final A0 selectedTabIndex;
            private final SimpleSheetState sheet;
            private final boolean showPricesWithDecimals;
            private final ComponentStyle stack;
            private final ComponentStyle stickyFooter;
            private final String storefrontCountryCode;
            private final Map<String, Set<Integer>> tabsByUniqueId;
            private final UiConfig.VariableConfig variableConfig;
            private final VariableDataProvider variableDataProvider;

            /* JADX WARN: Multi-variable type inference failed */
            public Components(ComponentStyle stack, ComponentStyle componentStyle, BackgroundStyles background, boolean z10, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, Offering offering, NonEmptySet<LocaleId> locales, String str, InterfaceC5082a dateProvider, AvailablePackages packages, Map<String, ? extends CustomVariableValue> customVariables, Map<String, ? extends CustomVariableValue> defaultCustomVariables, e initialLocaleList, Integer num, SimpleSheetState initialSheetState, PurchasesType purchases) {
                Object next;
                AvailablePackages.Info info;
                Object next2;
                AbstractC5504s.h(stack, "stack");
                AbstractC5504s.h(background, "background");
                AbstractC5504s.h(variableConfig, "variableConfig");
                AbstractC5504s.h(variableDataProvider, "variableDataProvider");
                AbstractC5504s.h(offering, "offering");
                AbstractC5504s.h(locales, "locales");
                AbstractC5504s.h(dateProvider, "dateProvider");
                AbstractC5504s.h(packages, "packages");
                AbstractC5504s.h(customVariables, "customVariables");
                AbstractC5504s.h(defaultCustomVariables, "defaultCustomVariables");
                AbstractC5504s.h(initialLocaleList, "initialLocaleList");
                AbstractC5504s.h(initialSheetState, "initialSheetState");
                AbstractC5504s.h(purchases, "purchases");
                this.stack = stack;
                this.stickyFooter = componentStyle;
                this.background = background;
                this.showPricesWithDecimals = z10;
                this.variableConfig = variableConfig;
                this.variableDataProvider = variableDataProvider;
                this.offering = offering;
                this.locales = locales;
                this.storefrontCountryCode = str;
                this.dateProvider = dateProvider;
                this.packages = packages;
                this.customVariables = customVariables;
                this.defaultCustomVariables = defaultCustomVariables;
                this.purchases = purchases;
                this.mergedCustomVariables = S.p(defaultCustomVariables, customVariables);
                Iterator<T> it = packages.getPackagesOutsideTabs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((AvailablePackages.Info) next).isSelectedByDefault()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AvailablePackages.Info info2 = (AvailablePackages.Info) next;
                this.initialSelectedPackageOutsideTabs = info2 != null ? info2.getUniqueId() : null;
                List<AvailablePackages.Info> packagesOutsideTabs = this.packages.getPackagesOutsideTabs();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it2 = packagesOutsideTabs.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(((AvailablePackages.Info) it2.next()).getUniqueId());
                }
                this.packagesOutsideTabsUniqueIds = linkedHashSet;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, List<AvailablePackages.Info>> entry : this.packages.getPackagesByTab().entrySet()) {
                    int iIntValue = entry.getKey().intValue();
                    Iterator<T> it3 = entry.getValue().iterator();
                    while (it3.hasNext()) {
                        String uniqueId = ((AvailablePackages.Info) it3.next()).getUniqueId();
                        linkedHashMap.put(uniqueId, a0.m((Set) linkedHashMap.getOrDefault(uniqueId, a0.d()), Integer.valueOf(iIntValue)));
                    }
                }
                this.tabsByUniqueId = linkedHashMap;
                this.localeId = b2.e(LocaleId.m307boximpl(m756toLocaleId8pYHj4M(initialLocaleList)), null, 2, null);
                this.availableStorefrontCountryLocalesByLanguage = AbstractC2163n.b(new PaywallState$Loaded$Components$availableStorefrontCountryLocalesByLanguage$2(this));
                this.locale = U1.d(new PaywallState$Loaded$Components$locale$2(this));
                this.currencyLocale = U1.d(new PaywallState$Loaded$Components$currencyLocale$2(this));
                C4963G c4963gG = U1.g();
                Map<Integer, List<AvailablePackages.Info>> packagesByTab = this.packages.getPackagesByTab();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(packagesByTab.size()));
                Iterator<T> it4 = packagesByTab.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Object key = entry2.getKey();
                    Iterator it5 = ((List) entry2.getValue()).iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            if (((AvailablePackages.Info) next2).isSelectedByDefault()) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    AvailablePackages.Info info3 = (AvailablePackages.Info) next2;
                    linkedHashMap2.put(key, info3 != null ? info3.getUniqueId() : null);
                }
                c4963gG.putAll(linkedHashMap2);
                this.selectedPackageByTab = c4963gG;
                this.selectedTabIndex = J1.a(num != null ? num.intValue() : 0);
                String uniqueId2 = this.initialSelectedPackageOutsideTabs;
                if (uniqueId2 == null && (uniqueId2 = (String) c4963gG.get(Integer.valueOf(getSelectedTabIndex()))) == null) {
                    List<AvailablePackages.Info> list = this.packages.getPackagesByTab().get(Integer.valueOf(getSelectedTabIndex()));
                    uniqueId2 = (list == null || (info = (AvailablePackages.Info) AbstractC2279u.o0(list)) == null) ? null : info.getUniqueId();
                }
                this.initialSelectedPackageUniqueId = uniqueId2;
                this.selectedPackageUniqueId = b2.e(uniqueId2, null, 2, null);
                this.selectedPackageInfo = U1.d(new PaywallState$Loaded$Components$selectedPackageInfo$2(this));
                this.selectedOfferEligibility = U1.d(new PaywallState$Loaded$Components$selectedOfferEligibility$2(this));
                this.mostExpensivePricePerMonthMicros = U1.d(new PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$2(this));
                this.actionInProgress = b2.e(Boolean.FALSE, null, 2, null);
                this.sheet = initialSheetState;
            }

            public final AvailablePackages.Info findPackageInfoByUniqueId(String uniqueId) {
                Object obj;
                Object next;
                Iterator<T> it = this.packages.getPackagesOutsideTabs().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC5504s.c(((AvailablePackages.Info) next).getUniqueId(), uniqueId)) {
                        break;
                    }
                }
                AvailablePackages.Info info = (AvailablePackages.Info) next;
                if (info != null) {
                    return info;
                }
                Iterator it2 = AbstractC2279u.z(this.packages.getPackagesByTab().values()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (AbstractC5504s.c(((AvailablePackages.Info) next2).getUniqueId(), uniqueId)) {
                        obj = next2;
                        break;
                    }
                }
                return (AvailablePackages.Info) obj;
            }

            public final Map<String, Locale> getAvailableStorefrontCountryLocalesByLanguage() {
                return (Map) this.availableStorefrontCountryLocalesByLanguage.getValue();
            }

            /* JADX INFO: renamed from: getLocaleId-uqtKvyA */
            public final String m754getLocaleIduqtKvyA() {
                return ((LocaleId) this.localeId.getValue()).m313unboximpl();
            }

            public final String getSelectedPackageUniqueId() {
                return (String) this.selectedPackageUniqueId.getValue();
            }

            public final Long mostExpensivePricePerMonthMicros(List<AvailablePackages.Info> list) {
                Object next;
                Iterator it = l.L(l.K(AbstractC2279u.c0(list), PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$4.INSTANCE), PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5.INSTANCE).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long amountMicros = ((Price) next).getAmountMicros();
                        do {
                            Object next2 = it.next();
                            long amountMicros2 = ((Price) next2).getAmountMicros();
                            if (amountMicros < amountMicros2) {
                                next = next2;
                                amountMicros = amountMicros2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Price price = (Price) next;
                if (price != null) {
                    return Long.valueOf(price.getAmountMicros());
                }
                return null;
            }

            private final void setActionInProgress(boolean z10) {
                this.actionInProgress.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: renamed from: setLocaleId-_KYeFs0 */
            private final void m755setLocaleId_KYeFs0(String str) {
                this.localeId.setValue(LocaleId.m307boximpl(str));
            }

            private final void setSelectedPackageUniqueId(String str) {
                this.selectedPackageUniqueId.setValue(str);
            }

            private final void setSelectedTabIndex(int i10) {
                this.selectedTabIndex.f(i10);
            }

            /* JADX INFO: renamed from: toLocaleId-8pYHj4M */
            private final String m756toLocaleId8pYHj4M(e eVar) {
                String localeId;
                String preferredUILocaleOverride = this.purchases.getPreferredUILocaleOverride();
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(eVar, 10));
                Iterator<E> it = eVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(LocaleId.m307boximpl(LocalizationKt.toLocaleId((d) it.next())));
                }
                List listJ0 = AbstractC2279u.J0(arrayList, this.locales.getHead());
                LocaleId localeId2 = null;
                if (preferredUILocaleOverride != null) {
                    try {
                        localeId = LocalizationKt.toLocaleId(LocalizationKt.toComposeLocale(LocaleHelpersKt.createLocaleFromString(preferredUILocaleOverride)));
                    } catch (Exception unused) {
                        localeId = null;
                    }
                    if (localeId != null) {
                        listJ0 = AbstractC2279u.I0(AbstractC2279u.e(LocaleId.m307boximpl(localeId)), listJ0);
                    }
                }
                Iterator it2 = listJ0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String strM421getBestMatch64pKzr8 = LocalizationKt.m421getBestMatch64pKzr8(this.locales, ((LocaleId) it2.next()).m313unboximpl());
                    LocaleId localeIdM307boximpl = strM421getBestMatch64pKzr8 != null ? LocaleId.m307boximpl(strM421getBestMatch64pKzr8) : null;
                    if (localeIdM307boximpl != null) {
                        localeId2 = localeIdM307boximpl;
                        break;
                    }
                }
                if (localeId2 != null) {
                    return localeId2.m313unboximpl();
                }
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }

            public static /* synthetic */ void update$default(Components components, LocaleList localeList, Integer num, Boolean bool, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    localeList = null;
                }
                if ((i10 & 2) != 0) {
                    num = null;
                }
                if ((i10 & 4) != 0) {
                    bool = null;
                }
                components.update(localeList, num, bool);
            }

            public final boolean getActionInProgress() {
                return ((Boolean) this.actionInProgress.getValue()).booleanValue();
            }

            public final BackgroundStyles getBackground() {
                return this.background;
            }

            public final d getCurrencyLocale() {
                return (d) this.currencyLocale.getValue();
            }

            public final Date getCurrentDate() {
                return (Date) this.dateProvider.invoke();
            }

            public final Map<String, CustomVariableValue> getCustomVariables() {
                return this.customVariables;
            }

            public final Map<String, CustomVariableValue> getDefaultCustomVariables() {
                return this.defaultCustomVariables;
            }

            public final d getLocale() {
                return (d) this.locale.getValue();
            }

            public final Map<String, CustomVariableValue> getMergedCustomVariables() {
                return this.mergedCustomVariables;
            }

            public final Long getMostExpensivePricePerMonthMicros() {
                return (Long) this.mostExpensivePricePerMonthMicros.getValue();
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded
            public Offering getOffering() {
                return this.offering;
            }

            public final OfferEligibility getSelectedOfferEligibility() {
                return (OfferEligibility) this.selectedOfferEligibility.getValue();
            }

            public final SelectedPackageInfo getSelectedPackageInfo() {
                return (SelectedPackageInfo) this.selectedPackageInfo.getValue();
            }

            public final int getSelectedTabIndex() {
                return this.selectedTabIndex.b();
            }

            public final SimpleSheetState getSheet() {
                return this.sheet;
            }

            public final boolean getShowPricesWithDecimals() {
                return this.showPricesWithDecimals;
            }

            public final ComponentStyle getStack() {
                return this.stack;
            }

            public final ComponentStyle getStickyFooter() {
                return this.stickyFooter;
            }

            public final UiConfig.VariableConfig getVariableConfig() {
                return this.variableConfig;
            }

            public final VariableDataProvider getVariableDataProvider() {
                return this.variableDataProvider;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void resetToDefaultPackage() {
                /*
                    r3 = this;
                    com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components$AvailablePackages r0 = r3.packages
                    java.util.Map r0 = r0.getPackagesByTab()
                    int r1 = r3.getSelectedTabIndex()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r0 = r0.get(r1)
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L39
                    java.util.Iterator r0 = r0.iterator()
                L1a:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2e
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components$AvailablePackages$Info r2 = (com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components.AvailablePackages.Info) r2
                    boolean r2 = r2.isSelectedByDefault()
                    if (r2 == 0) goto L1a
                    goto L2f
                L2e:
                    r1 = 0
                L2f:
                    com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components$AvailablePackages$Info r1 = (com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components.AvailablePackages.Info) r1
                    if (r1 == 0) goto L39
                    java.lang.String r0 = r1.getUniqueId()
                    if (r0 != 0) goto L4d
                L39:
                    java.lang.String r0 = r3.initialSelectedPackageOutsideTabs
                    if (r0 != 0) goto L4d
                    i0.G r0 = r3.selectedPackageByTab
                    int r1 = r3.getSelectedTabIndex()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.String r0 = (java.lang.String) r0
                L4d:
                    r3.setSelectedPackageUniqueId(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components.resetToDefaultPackage():void");
            }

            public final void update(LocaleList localeList, Integer selectedTabIndex, Boolean actionInProgress) {
                AvailablePackages.Info info;
                if (localeList != null) {
                    String languageTags = localeList.toLanguageTags();
                    AbstractC5504s.g(languageTags, "localeList.toLanguageTags()");
                    m755setLocaleId_KYeFs0(m756toLocaleId8pYHj4M(new e(languageTags)));
                }
                if (selectedTabIndex != null) {
                    setSelectedTabIndex(selectedTabIndex.intValue());
                    if (getSelectedPackageUniqueId() != null && AbstractC2279u.e0(this.packagesOutsideTabsUniqueIds, getSelectedPackageUniqueId())) {
                        return;
                    }
                    String uniqueId = (String) this.selectedPackageByTab.get(selectedTabIndex);
                    if (uniqueId == null && (uniqueId = this.initialSelectedPackageOutsideTabs) == null) {
                        List<AvailablePackages.Info> list = this.packages.getPackagesByTab().get(selectedTabIndex);
                        if (list == null || (info = (AvailablePackages.Info) AbstractC2279u.o0(list)) == null || (uniqueId = info.getUniqueId()) == null) {
                            uniqueId = null;
                        } else {
                            Logger.INSTANCE.w("Could not find default package for tab " + selectedTabIndex + ". Using first package instead. This could be caused by not having any package marked as selected by default.");
                        }
                    }
                    setSelectedPackageUniqueId(uniqueId);
                }
                if (actionInProgress != null) {
                    setActionInProgress(actionInProgress.booleanValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "", "rcPackage", "Lcom/revenuecat/purchases/Package;", "resolvedOffer", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "uniqueId", "", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;)V", "getOfferEligibility", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "getRcPackage", "()Lcom/revenuecat/purchases/Package;", "getResolvedOffer", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "getUniqueId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class SelectedPackageInfo {
                public static final int $stable = 8;
                private final OfferEligibility offerEligibility;
                private final Package rcPackage;
                private final ResolvedOffer resolvedOffer;
                private final String uniqueId;

                public SelectedPackageInfo(Package rcPackage, ResolvedOffer resolvedOffer, String uniqueId, OfferEligibility offerEligibility) {
                    AbstractC5504s.h(rcPackage, "rcPackage");
                    AbstractC5504s.h(uniqueId, "uniqueId");
                    AbstractC5504s.h(offerEligibility, "offerEligibility");
                    this.rcPackage = rcPackage;
                    this.resolvedOffer = resolvedOffer;
                    this.uniqueId = uniqueId;
                    this.offerEligibility = offerEligibility;
                }

                public static /* synthetic */ SelectedPackageInfo copy$default(SelectedPackageInfo selectedPackageInfo, Package r12, ResolvedOffer resolvedOffer, String str, OfferEligibility offerEligibility, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        r12 = selectedPackageInfo.rcPackage;
                    }
                    if ((i10 & 2) != 0) {
                        resolvedOffer = selectedPackageInfo.resolvedOffer;
                    }
                    if ((i10 & 4) != 0) {
                        str = selectedPackageInfo.uniqueId;
                    }
                    if ((i10 & 8) != 0) {
                        offerEligibility = selectedPackageInfo.offerEligibility;
                    }
                    return selectedPackageInfo.copy(r12, resolvedOffer, str, offerEligibility);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Package getRcPackage() {
                    return this.rcPackage;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final ResolvedOffer getResolvedOffer() {
                    return this.resolvedOffer;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getUniqueId() {
                    return this.uniqueId;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final OfferEligibility getOfferEligibility() {
                    return this.offerEligibility;
                }

                public final SelectedPackageInfo copy(Package rcPackage, ResolvedOffer resolvedOffer, String uniqueId, OfferEligibility offerEligibility) {
                    AbstractC5504s.h(rcPackage, "rcPackage");
                    AbstractC5504s.h(uniqueId, "uniqueId");
                    AbstractC5504s.h(offerEligibility, "offerEligibility");
                    return new SelectedPackageInfo(rcPackage, resolvedOffer, uniqueId, offerEligibility);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SelectedPackageInfo)) {
                        return false;
                    }
                    SelectedPackageInfo selectedPackageInfo = (SelectedPackageInfo) other;
                    return AbstractC5504s.c(this.rcPackage, selectedPackageInfo.rcPackage) && AbstractC5504s.c(this.resolvedOffer, selectedPackageInfo.resolvedOffer) && AbstractC5504s.c(this.uniqueId, selectedPackageInfo.uniqueId) && AbstractC5504s.c(this.offerEligibility, selectedPackageInfo.offerEligibility);
                }

                public final OfferEligibility getOfferEligibility() {
                    return this.offerEligibility;
                }

                public final Package getRcPackage() {
                    return this.rcPackage;
                }

                public final ResolvedOffer getResolvedOffer() {
                    return this.resolvedOffer;
                }

                public final String getUniqueId() {
                    return this.uniqueId;
                }

                public int hashCode() {
                    int iHashCode = this.rcPackage.hashCode() * 31;
                    ResolvedOffer resolvedOffer = this.resolvedOffer;
                    return ((((iHashCode + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31) + this.uniqueId.hashCode()) * 31) + this.offerEligibility.hashCode();
                }

                public String toString() {
                    return "SelectedPackageInfo(rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", uniqueId=" + this.uniqueId + ", offerEligibility=" + this.offerEligibility + ')';
                }

                public /* synthetic */ SelectedPackageInfo(Package r12, ResolvedOffer resolvedOffer, String str, OfferEligibility offerEligibility, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(r12, (i10 & 2) != 0 ? null : resolvedOffer, str, offerEligibility);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "", "packagesOutsideTabs", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "packagesByTab", "", "", "(Ljava/util/List;Ljava/util/Map;)V", "hasAnyPackages", "", "getHasAnyPackages", "()Z", "getPackagesByTab", "()Ljava/util/Map;", "getPackagesOutsideTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "merge", "with", "toString", "", "Info", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class AvailablePackages {
                public static final int $stable = 8;
                private final Map<Integer, List<Info>> packagesByTab;
                private final List<Info> packagesOutsideTabs;

                /* JADX WARN: Multi-variable type inference failed */
                public AvailablePackages(List<Info> packagesOutsideTabs, Map<Integer, ? extends List<Info>> packagesByTab) {
                    AbstractC5504s.h(packagesOutsideTabs, "packagesOutsideTabs");
                    AbstractC5504s.h(packagesByTab, "packagesByTab");
                    this.packagesOutsideTabs = packagesOutsideTabs;
                    this.packagesByTab = packagesByTab;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ AvailablePackages copy$default(AvailablePackages availablePackages, List list, Map map, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        list = availablePackages.packagesOutsideTabs;
                    }
                    if ((i10 & 2) != 0) {
                        map = availablePackages.packagesByTab;
                    }
                    return availablePackages.copy(list, map);
                }

                public final List<Info> component1() {
                    return this.packagesOutsideTabs;
                }

                public final Map<Integer, List<Info>> component2() {
                    return this.packagesByTab;
                }

                public final AvailablePackages copy(List<Info> packagesOutsideTabs, Map<Integer, ? extends List<Info>> packagesByTab) {
                    AbstractC5504s.h(packagesOutsideTabs, "packagesOutsideTabs");
                    AbstractC5504s.h(packagesByTab, "packagesByTab");
                    return new AvailablePackages(packagesOutsideTabs, packagesByTab);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AvailablePackages)) {
                        return false;
                    }
                    AvailablePackages availablePackages = (AvailablePackages) other;
                    return AbstractC5504s.c(this.packagesOutsideTabs, availablePackages.packagesOutsideTabs) && AbstractC5504s.c(this.packagesByTab, availablePackages.packagesByTab);
                }

                public final boolean getHasAnyPackages() {
                    return (this.packagesOutsideTabs.isEmpty() && this.packagesByTab.isEmpty()) ? false : true;
                }

                public final Map<Integer, List<Info>> getPackagesByTab() {
                    return this.packagesByTab;
                }

                public final List<Info> getPackagesOutsideTabs() {
                    return this.packagesOutsideTabs;
                }

                public int hashCode() {
                    return (this.packagesOutsideTabs.hashCode() * 31) + this.packagesByTab.hashCode();
                }

                public final AvailablePackages merge(AvailablePackages with) {
                    List<Info> list = this.packagesOutsideTabs;
                    List<Info> listM = with != null ? with.packagesOutsideTabs : null;
                    if (listM == null) {
                        listM = AbstractC2279u.m();
                    }
                    List listI0 = AbstractC2279u.I0(list, listM);
                    Map<Integer, List<Info>> mapI = this.packagesByTab;
                    if (mapI.isEmpty()) {
                        Map<Integer, List<Info>> map = with != null ? with.packagesByTab : null;
                        mapI = map == null ? S.i() : map;
                    }
                    return new AvailablePackages(listI0, mapI);
                }

                public String toString() {
                    return "AvailablePackages(packagesOutsideTabs=" + this.packagesOutsideTabs + ", packagesByTab=" + this.packagesByTab + ')';
                }

                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages$Info;", "", "pkg", "Lcom/revenuecat/purchases/Package;", "isSelectedByDefault", "", "resolvedOffer", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "(Lcom/revenuecat/purchases/Package;ZLcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;)V", "()Z", "getPkg", "()Lcom/revenuecat/purchases/Package;", "getResolvedOffer", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "uniqueId", "", "getUniqueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Info {
                    public static final int $stable = 8;
                    private final boolean isSelectedByDefault;
                    private final Package pkg;
                    private final ResolvedOffer resolvedOffer;
                    private final String uniqueId;

                    public Info(Package pkg, boolean z10, ResolvedOffer resolvedOffer) {
                        String identifier;
                        SubscriptionOption option;
                        AbstractC5504s.h(pkg, "pkg");
                        this.pkg = pkg;
                        this.isSelectedByDefault = z10;
                        this.resolvedOffer = resolvedOffer;
                        String str = null;
                        ResolvedOffer.ConfiguredOffer configuredOffer = resolvedOffer instanceof ResolvedOffer.ConfiguredOffer ? (ResolvedOffer.ConfiguredOffer) resolvedOffer : null;
                        if (configuredOffer != null && (option = configuredOffer.getOption()) != null) {
                            str = option.get$id();
                        }
                        if (str != null) {
                            identifier = pkg.getIdentifier() + ':' + str;
                        } else {
                            identifier = pkg.getIdentifier();
                        }
                        this.uniqueId = identifier;
                    }

                    public static /* synthetic */ Info copy$default(Info info, Package r12, boolean z10, ResolvedOffer resolvedOffer, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            r12 = info.pkg;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = info.isSelectedByDefault;
                        }
                        if ((i10 & 4) != 0) {
                            resolvedOffer = info.resolvedOffer;
                        }
                        return info.copy(r12, z10, resolvedOffer);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final Package getPkg() {
                        return this.pkg;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final boolean getIsSelectedByDefault() {
                        return this.isSelectedByDefault;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final ResolvedOffer getResolvedOffer() {
                        return this.resolvedOffer;
                    }

                    public final Info copy(Package pkg, boolean isSelectedByDefault, ResolvedOffer resolvedOffer) {
                        AbstractC5504s.h(pkg, "pkg");
                        return new Info(pkg, isSelectedByDefault, resolvedOffer);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Info)) {
                            return false;
                        }
                        Info info = (Info) other;
                        return AbstractC5504s.c(this.pkg, info.pkg) && this.isSelectedByDefault == info.isSelectedByDefault && AbstractC5504s.c(this.resolvedOffer, info.resolvedOffer);
                    }

                    public final Package getPkg() {
                        return this.pkg;
                    }

                    public final ResolvedOffer getResolvedOffer() {
                        return this.resolvedOffer;
                    }

                    public final String getUniqueId() {
                        return this.uniqueId;
                    }

                    public int hashCode() {
                        int iHashCode = ((this.pkg.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31;
                        ResolvedOffer resolvedOffer = this.resolvedOffer;
                        return iHashCode + (resolvedOffer == null ? 0 : resolvedOffer.hashCode());
                    }

                    public final boolean isSelectedByDefault() {
                        return this.isSelectedByDefault;
                    }

                    public String toString() {
                        return "Info(pkg=" + this.pkg + ", isSelectedByDefault=" + this.isSelectedByDefault + ", resolvedOffer=" + this.resolvedOffer + ')';
                    }

                    public /* synthetic */ Info(Package r12, boolean z10, ResolvedOffer resolvedOffer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(r12, z10, (i10 & 4) != 0 ? null : resolvedOffer);
                    }
                }
            }

            public final void update(String selectedPackageUniqueId) {
                AbstractC5504s.h(selectedPackageUniqueId, "selectedPackageUniqueId");
                setSelectedPackageUniqueId(selectedPackageUniqueId);
                int selectedTabIndex = getSelectedTabIndex();
                Set<Integer> set = this.tabsByUniqueId.get(selectedPackageUniqueId);
                if (set == null || !set.contains(Integer.valueOf(selectedTabIndex))) {
                    return;
                }
                this.selectedPackageByTab.put(Integer.valueOf(selectedTabIndex), selectedPackageUniqueId);
            }

            public /* synthetic */ Components(ComponentStyle componentStyle, ComponentStyle componentStyle2, BackgroundStyles backgroundStyles, boolean z10, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, Offering offering, NonEmptySet nonEmptySet, String str, InterfaceC5082a interfaceC5082a, AvailablePackages availablePackages, Map map, Map map2, e eVar, Integer num, SimpleSheetState simpleSheetState, PurchasesType purchasesType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(componentStyle, componentStyle2, backgroundStyles, z10, variableConfig, variableDataProvider, offering, nonEmptySet, str, interfaceC5082a, availablePackages, (i10 & 2048) != 0 ? S.i() : map, (i10 & 4096) != 0 ? S.i() : map2, (i10 & 8192) != 0 ? e.f33423c.a() : eVar, (i10 & 16384) != 0 ? null : num, (i10 & 32768) != 0 ? new SimpleSheetState() : simpleSheetState, purchasesType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJJ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001d¨\u00064"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded;", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;", "templateConfiguration", "LY/C0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "selectedPackage", "", "shouldDisplayDismissButton", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "validationWarning", "<init>", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;LY/C0;ZLcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;)V", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;ZLcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;)V", "packageInfo", "LTd/L;", "selectPackage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", "component1", "()Lcom/revenuecat/purchases/Offering;", "component2", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;", "component3", "()LY/C0;", "component4", "()Z", "component5", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "copy", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;LY/C0;ZLcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/Offering;", "getOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;", "getTemplateConfiguration", "LY/C0;", "getSelectedPackage", "Z", "getShouldDisplayDismissButton", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "getValidationWarning", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Legacy implements Loaded {
            public static final int $stable = 0;
            private final Offering offering;
            private final C0 selectedPackage;
            private final boolean shouldDisplayDismissButton;
            private final TemplateConfiguration templateConfiguration;
            private final PaywallWarning validationWarning;

            public Legacy(Offering offering, TemplateConfiguration templateConfiguration, C0 selectedPackage, boolean z10, PaywallWarning paywallWarning) {
                AbstractC5504s.h(offering, "offering");
                AbstractC5504s.h(templateConfiguration, "templateConfiguration");
                AbstractC5504s.h(selectedPackage, "selectedPackage");
                this.offering = offering;
                this.templateConfiguration = templateConfiguration;
                this.selectedPackage = selectedPackage;
                this.shouldDisplayDismissButton = z10;
                this.validationWarning = paywallWarning;
            }

            public static /* synthetic */ Legacy copy$default(Legacy legacy, Offering offering, TemplateConfiguration templateConfiguration, C0 c02, boolean z10, PaywallWarning paywallWarning, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    offering = legacy.offering;
                }
                if ((i10 & 2) != 0) {
                    templateConfiguration = legacy.templateConfiguration;
                }
                if ((i10 & 4) != 0) {
                    c02 = legacy.selectedPackage;
                }
                if ((i10 & 8) != 0) {
                    z10 = legacy.shouldDisplayDismissButton;
                }
                if ((i10 & 16) != 0) {
                    paywallWarning = legacy.validationWarning;
                }
                PaywallWarning paywallWarning2 = paywallWarning;
                C0 c03 = c02;
                return legacy.copy(offering, templateConfiguration, c03, z10, paywallWarning2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Offering getOffering() {
                return this.offering;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final TemplateConfiguration getTemplateConfiguration() {
                return this.templateConfiguration;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final C0 getSelectedPackage() {
                return this.selectedPackage;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final boolean getShouldDisplayDismissButton() {
                return this.shouldDisplayDismissButton;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final PaywallWarning getValidationWarning() {
                return this.validationWarning;
            }

            public final Legacy copy(Offering offering, TemplateConfiguration templateConfiguration, C0 selectedPackage, boolean shouldDisplayDismissButton, PaywallWarning validationWarning) {
                AbstractC5504s.h(offering, "offering");
                AbstractC5504s.h(templateConfiguration, "templateConfiguration");
                AbstractC5504s.h(selectedPackage, "selectedPackage");
                return new Legacy(offering, templateConfiguration, selectedPackage, shouldDisplayDismissButton, validationWarning);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) other;
                return AbstractC5504s.c(this.offering, legacy.offering) && AbstractC5504s.c(this.templateConfiguration, legacy.templateConfiguration) && AbstractC5504s.c(this.selectedPackage, legacy.selectedPackage) && this.shouldDisplayDismissButton == legacy.shouldDisplayDismissButton && AbstractC5504s.c(this.validationWarning, legacy.validationWarning);
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded
            public Offering getOffering() {
                return this.offering;
            }

            public final C0 getSelectedPackage() {
                return this.selectedPackage;
            }

            public final boolean getShouldDisplayDismissButton() {
                return this.shouldDisplayDismissButton;
            }

            public final TemplateConfiguration getTemplateConfiguration() {
                return this.templateConfiguration;
            }

            public final PaywallWarning getValidationWarning() {
                return this.validationWarning;
            }

            public int hashCode() {
                int iHashCode = ((((((this.offering.hashCode() * 31) + this.templateConfiguration.hashCode()) * 31) + this.selectedPackage.hashCode()) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31;
                PaywallWarning paywallWarning = this.validationWarning;
                return iHashCode + (paywallWarning == null ? 0 : paywallWarning.hashCode());
            }

            public final void selectPackage(TemplateConfiguration.PackageInfo packageInfo) {
                AbstractC5504s.h(packageInfo, "packageInfo");
                this.selectedPackage.setValue(packageInfo);
            }

            public String toString() {
                return "Legacy(offering=" + this.offering + ", templateConfiguration=" + this.templateConfiguration + ", selectedPackage=" + this.selectedPackage + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", validationWarning=" + this.validationWarning + ')';
            }

            public /* synthetic */ Legacy(Offering offering, TemplateConfiguration templateConfiguration, C0 c02, boolean z10, PaywallWarning paywallWarning, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(offering, templateConfiguration, c02, z10, (i10 & 16) != 0 ? null : paywallWarning);
            }

            public /* synthetic */ Legacy(Offering offering, TemplateConfiguration templateConfiguration, TemplateConfiguration.PackageInfo packageInfo, boolean z10, PaywallWarning paywallWarning, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(offering, templateConfiguration, packageInfo, z10, (i10 & 16) != 0 ? null : paywallWarning);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Legacy(Offering offering, TemplateConfiguration templateConfiguration, TemplateConfiguration.PackageInfo selectedPackage, boolean z10, PaywallWarning paywallWarning) {
                this(offering, templateConfiguration, b2.e(selectedPackage, null, 2, null), z10, paywallWarning);
                AbstractC5504s.h(offering, "offering");
                AbstractC5504s.h(templateConfiguration, "templateConfiguration");
                AbstractC5504s.h(selectedPackage, "selectedPackage");
            }
        }
    }
}
