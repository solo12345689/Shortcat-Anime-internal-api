package com.revenuecat.purchases.ui.revenuecatui.activity;

import Td.InterfaceC2154e;
import Td.L;
import Ud.AbstractC2279u;
import Ud.S;
import android.app.Activity;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchIfNeededOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchOptions;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import g.AbstractC4814d;
import g.InterfaceC4813c;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JQ\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0007¢\u0006\u0004\b!\u0010\"J7\u0010!\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u0014H\u0007¢\u0006\u0004\b!\u0010$JU\u0010!\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0007¢\u0006\u0004\b'\u0010(JO\u0010,\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b,\u0010-JK\u0010,\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b,\u0010.JS\u0010,\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b/\u00100JO\u0010,\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001401H\u0007¢\u0006\u0004\b,\u00104J\u0015\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00112\u0006\u00106\u001a\u000209¢\u0006\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLauncher;", "", "Lg/c;", "resultCaller", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResultHandler;", "resultHandler", "<init>", "(Lg/c;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResultHandler;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "", "storeNonSerializableArgsIfNeeded", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Ljava/lang/Integer;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;", "args", "LTd/L;", "launchPaywallWithArgs", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;)V", "", "isActivityFinishing", "()Z", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;", "fontProvider", "shouldDisplayDismissButton", "edgeToEdge", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "launch", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZLjava/util/Map;)V", "offeringIdentifier", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZ)V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "launchWithOfferingId", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZLjava/util/Map;)V", "requiredEntitlementIdentifier", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallDisplayCallback;", "paywallDisplayCallback", "launchIfNeeded", "(Ljava/lang/String;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZLcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallDisplayCallback;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZLcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallDisplayCallback;)V", "launchIfNeededWithOfferingId", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZLcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallDisplayCallback;)V", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "shouldDisplayBlock", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/ParcelizableFontProvider;ZZLkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLaunchOptions;", "options", "launchWithOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLaunchOptions;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLaunchIfNeededOptions;", "launchIfNeededWithOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLaunchIfNeededOptions;)V", "Lg/d;", "activityResultLauncher", "Lg/d;", "currentNonSerializableArgsKey", "Ljava/lang/Integer;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroidx/fragment/app/q;", "weakFragment", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallActivityLauncher {
    public static final int $stable = 8;
    private final AbstractC4814d activityResultLauncher;
    private Integer currentNonSerializableArgsKey;
    private final WeakReference<Activity> weakActivity;
    private final WeakReference<AbstractComponentCallbacksC2838q> weakFragment;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeeded$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldDisplay", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $edgeToEdge;
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ PaywallDisplayCallback $paywallDisplayCallback;
        final /* synthetic */ String $requiredEntitlementIdentifier;
        final /* synthetic */ boolean $shouldDisplayDismissButton;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallDisplayCallback paywallDisplayCallback, PaywallActivityLauncher paywallActivityLauncher, String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
            super(1);
            this.$paywallDisplayCallback = paywallDisplayCallback;
            this.this$0 = paywallActivityLauncher;
            this.$requiredEntitlementIdentifier = str;
            this.$offering = offering;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z10;
            this.$edgeToEdge = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L.f17438a;
        }

        public final void invoke(boolean z10) {
            PaywallDisplayCallback paywallDisplayCallback = this.$paywallDisplayCallback;
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z10);
            }
            if (z10) {
                PaywallActivityLauncher paywallActivityLauncher = this.this$0;
                String str = this.$requiredEntitlementIdentifier;
                Offering offering = this.$offering;
                OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = null;
                if (offering != null) {
                    String identifier = offering.getIdentifier();
                    Package r02 = (Package) AbstractC2279u.o0(offering.getAvailablePackages());
                    idAndPresentedOfferingContext = new OfferingSelection.IdAndPresentedOfferingContext(identifier, r02 != null ? r02.getPresentedOfferingContext() : null);
                }
                paywallActivityLauncher.launchPaywallWithArgs(new PaywallActivityArgs(str, idAndPresentedOfferingContext, this.$fontProvider, this.$shouldDisplayDismissButton, this.$edgeToEdge, false, (Map) null, (Integer) null, 224, (DefaultConstructorMarker) null));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeeded$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldDisplay", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $edgeToEdge;
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ String $offeringIdentifier;
        final /* synthetic */ PaywallDisplayCallback $paywallDisplayCallback;
        final /* synthetic */ String $requiredEntitlementIdentifier;
        final /* synthetic */ boolean $shouldDisplayDismissButton;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallDisplayCallback paywallDisplayCallback, PaywallActivityLauncher paywallActivityLauncher, String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
            super(1);
            this.$paywallDisplayCallback = paywallDisplayCallback;
            this.this$0 = paywallActivityLauncher;
            this.$requiredEntitlementIdentifier = str;
            this.$offeringIdentifier = str2;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z10;
            this.$edgeToEdge = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L.f17438a;
        }

        public final void invoke(boolean z10) {
            PaywallDisplayCallback paywallDisplayCallback = this.$paywallDisplayCallback;
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z10);
            }
            if (z10) {
                this.this$0.launchPaywallWithArgs(new PaywallActivityArgs(this.$requiredEntitlementIdentifier, new OfferingSelection.IdAndPresentedOfferingContext(this.$offeringIdentifier, null), this.$fontProvider, this.$shouldDisplayDismissButton, this.$edgeToEdge, false, (Map) null, (Integer) null, 224, (DefaultConstructorMarker) null));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeeded$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldDisplay", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function1 {
        final /* synthetic */ boolean $edgeToEdge;
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ boolean $shouldDisplayDismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
            super(1);
            this.$offering = offering;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z10;
            this.$edgeToEdge = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L.f17438a;
        }

        public final void invoke(boolean z10) {
            OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext;
            if (z10) {
                PaywallActivityLauncher paywallActivityLauncher = PaywallActivityLauncher.this;
                Offering offering = this.$offering;
                if (offering != null) {
                    String identifier = offering.getIdentifier();
                    Package r22 = (Package) AbstractC2279u.o0(offering.getAvailablePackages());
                    idAndPresentedOfferingContext = new OfferingSelection.IdAndPresentedOfferingContext(identifier, r22 != null ? r22.getPresentedOfferingContext() : null);
                } else {
                    idAndPresentedOfferingContext = null;
                }
                paywallActivityLauncher.launchPaywallWithArgs(new PaywallActivityArgs((String) null, idAndPresentedOfferingContext, this.$fontProvider, this.$shouldDisplayDismissButton, this.$edgeToEdge, false, (Map) null, (Integer) null, JfifUtil.MARKER_APP1, (DefaultConstructorMarker) null));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$launchIfNeededWithOptions$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldDisplay", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41551 extends AbstractC5506u implements Function1 {
        final /* synthetic */ PaywallActivityLaunchIfNeededOptions $options;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41551(PaywallActivityLaunchIfNeededOptions paywallActivityLaunchIfNeededOptions, PaywallActivityLauncher paywallActivityLauncher) {
            super(1);
            this.$options = paywallActivityLaunchIfNeededOptions;
            this.this$0 = paywallActivityLauncher;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L.f17438a;
        }

        public final void invoke(boolean z10) {
            PaywallDisplayCallback paywallDisplayCallback = this.$options.getPaywallDisplayCallback();
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z10);
            }
            if (z10) {
                this.this$0.launchPaywallWithArgs(new PaywallActivityArgs(this.$options.getRequiredEntitlementIdentifier(), this.$options.toOfferingSelection$revenuecatui_defaultsBc8Release(), this.$options.getFontProvider(), this.$options.getShouldDisplayDismissButton(), this.$options.getEdgeToEdge(), false, (Map) this.$options.getCustomVariables$revenuecatui_defaultsBc8Release(), this.this$0.storeNonSerializableArgsIfNeeded(this.$options.getPurchaseLogic(), this.$options.getListener()), 32, (DefaultConstructorMarker) null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallActivityLauncher(InterfaceC4813c resultCaller, final PaywallResultHandler resultHandler) {
        AbstractC5504s.h(resultCaller, "resultCaller");
        AbstractC5504s.h(resultHandler, "resultHandler");
        this.weakActivity = new WeakReference<>(resultCaller instanceof Activity ? (Activity) resultCaller : null);
        this.weakFragment = new WeakReference<>(resultCaller instanceof AbstractComponentCallbacksC2838q ? (AbstractComponentCallbacksC2838q) resultCaller : null);
        this.activityResultLauncher = resultCaller.registerForActivityResult(new PaywallContract(), new PaywallResultHandler() { // from class: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher$wrappedHandler$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResultHandler, g.InterfaceC4812b
            public void onActivityResult(PaywallResult result) {
                AbstractC5504s.h(result, "result");
                Integer num = this.this$0.currentNonSerializableArgsKey;
                if (num != null) {
                    PaywallActivityLauncher paywallActivityLauncher = this.this$0;
                    PaywallActivityNonSerializableArgsStore.INSTANCE.remove(num.intValue());
                    paywallActivityLauncher.currentNonSerializableArgsKey = null;
                }
                resultHandler.onActivityResult(result);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isActivityFinishing() {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.weakActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.ref.WeakReference<androidx.fragment.app.q> r1 = r4.weakFragment
            java.lang.Object r1 = r1.get()
            androidx.fragment.app.q r1 = (androidx.fragment.app.AbstractComponentCallbacksC2838q) r1
            r2 = 1
            if (r0 != 0) goto L1d
            if (r1 == 0) goto L1a
            androidx.fragment.app.v r3 = r1.getActivity()
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L34
        L1d:
            if (r0 == 0) goto L26
            boolean r0 = r0.isFinishing()
            if (r0 != r2) goto L26
            goto L34
        L26:
            if (r1 == 0) goto L35
            androidx.fragment.app.v r0 = r1.getActivity()
            if (r0 == 0) goto L35
            boolean r0 = r0.isFinishing()
            if (r0 != r2) goto L35
        L34:
            return r2
        L35:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher.isActivityFinishing():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void launch$default(PaywallActivityLauncher paywallActivityLauncher, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offering = null;
        }
        if ((i10 & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        if ((i10 & 16) != 0) {
            map = S.i();
        }
        paywallActivityLauncher.launch(offering, parcelizableFontProvider, z10, z11, map);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, PaywallDisplayCallback paywallDisplayCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            offering = null;
        }
        if ((i10 & 4) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        if ((i10 & 32) != 0) {
            paywallDisplayCallback = null;
        }
        paywallActivityLauncher.launchIfNeeded(str, offering, parcelizableFontProvider, z10, z11, paywallDisplayCallback);
    }

    public static /* synthetic */ void launchIfNeededWithOfferingId$default(PaywallActivityLauncher paywallActivityLauncher, String str, String str2, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, PaywallDisplayCallback paywallDisplayCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        if ((i10 & 32) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        if ((i10 & 64) != 0) {
            paywallDisplayCallback = null;
        }
        paywallActivityLauncher.launchIfNeededWithOfferingId(str, str2, presentedOfferingContext, parcelizableFontProvider, z10, z11, paywallDisplayCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchPaywallWithArgs(PaywallActivityArgs args) {
        if (isActivityFinishing()) {
            Logger.INSTANCE.e("Not displaying paywall because activity/fragment is finishing or has finished.");
        } else {
            this.activityResultLauncher.a(args);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void launchWithOfferingId$default(PaywallActivityLauncher paywallActivityLauncher, String str, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            parcelizableFontProvider = null;
        }
        ParcelizableFontProvider parcelizableFontProvider2 = parcelizableFontProvider;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        boolean z13 = z11;
        if ((i10 & 32) != 0) {
            map = S.i();
        }
        paywallActivityLauncher.launchWithOfferingId(str, presentedOfferingContext, parcelizableFontProvider2, z12, z13, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer storeNonSerializableArgsIfNeeded(PaywallPurchaseLogic purchaseLogic, PaywallListener listener) {
        if (purchaseLogic == null && listener == null) {
            return null;
        }
        int iStore = PaywallActivityNonSerializableArgsStore.INSTANCE.store(new PaywallActivityNonSerializableArgs(purchaseLogic, listener));
        this.currentNonSerializableArgsKey = Integer.valueOf(iStore);
        return Integer.valueOf(iStore);
    }

    public final void launch() {
        launch$default(this, null, null, false, false, null, 31, null);
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, Function1 shouldDisplayBlock) {
        AbstractC5504s.h(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, parcelizableFontProvider, false, false, shouldDisplayBlock, 12, null);
    }

    @InterfaceC2154e
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, null, false, false, null, 120, null);
    }

    public final void launchIfNeededWithOptions(PaywallActivityLaunchIfNeededOptions options) {
        Function1 shouldDisplayBlock;
        AbstractC5504s.h(options, "options");
        if (options.getRequiredEntitlementIdentifier() != null) {
            shouldDisplayBlock = HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(options.getRequiredEntitlementIdentifier());
        } else {
            shouldDisplayBlock = options.getShouldDisplayBlock();
            AbstractC5504s.e(shouldDisplayBlock);
        }
        HelperFunctionsKt.shouldDisplayPaywall(shouldDisplayBlock, new C41551(options, this));
    }

    @InterfaceC2154e
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext) {
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, null, false, false, null, 60, null);
    }

    public final void launchWithOptions(PaywallActivityLaunchOptions options) {
        AbstractC5504s.h(options, "options");
        this.activityResultLauncher.a(new PaywallActivityArgs((String) null, options.toOfferingSelection$revenuecatui_defaultsBc8Release(), options.getFontProvider(), options.getShouldDisplayDismissButton(), options.getEdgeToEdge(), false, (Map) options.getCustomVariables$revenuecatui_defaultsBc8Release(), storeNonSerializableArgsIfNeeded(options.getPurchaseLogic(), options.getListener()), 33, (DefaultConstructorMarker) null));
    }

    public final void launch(Offering offering) {
        launch$default(this, offering, null, false, false, null, 30, null);
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, Function1 shouldDisplayBlock) {
        AbstractC5504s.h(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, parcelizableFontProvider, z10, false, shouldDisplayBlock, 8, null);
    }

    @InterfaceC2154e
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, false, false, null, 112, null);
    }

    @InterfaceC2154e
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider) {
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, false, false, null, 56, null);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, PaywallDisplayCallback paywallDisplayCallback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        if ((i10 & 32) != 0) {
            paywallDisplayCallback = null;
        }
        paywallActivityLauncher.launchIfNeeded(str, str2, parcelizableFontProvider, z10, z11, paywallDisplayCallback);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider) {
        launch$default(this, offering, parcelizableFontProvider, false, false, null, 28, null);
    }

    public final void launchIfNeeded(Offering offering, Function1 shouldDisplayBlock) {
        AbstractC5504s.h(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, null, false, false, shouldDisplayBlock, 14, null);
    }

    @InterfaceC2154e
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z10, false, null, 96, null);
    }

    @InterfaceC2154e
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z10, false, null, 48, null);
    }

    public static /* synthetic */ void launch$default(PaywallActivityLauncher paywallActivityLauncher, String str, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        paywallActivityLauncher.launch(str, parcelizableFontProvider, z10, z11);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        launch$default(this, offering, parcelizableFontProvider, z10, false, null, 24, null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, (Offering) null, (ParcelizableFontProvider) null, false, false, (PaywallDisplayCallback) null, 62, (Object) null);
    }

    @InterfaceC2154e
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z10, z11, null, 64, null);
    }

    @InterfaceC2154e
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z10, z11, null, 32, null);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offering = null;
        }
        if ((i10 & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        paywallActivityLauncher.launchIfNeeded(offering, parcelizableFontProvider, z10, z11, function1);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
        launch$default(this, offering, parcelizableFontProvider, z10, z11, null, 16, null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, (ParcelizableFontProvider) null, false, false, (PaywallDisplayCallback) null, 60, (Object) null);
    }

    @InterfaceC2154e
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge, PaywallDisplayCallback paywallDisplayCallback) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOptions(new PaywallActivityLaunchIfNeededOptions.Builder().setRequiredEntitlementIdentifier(requiredEntitlementIdentifier).setOfferingIdentifier(offeringIdentifier, presentedOfferingContext).setFontProvider(fontProvider).setShouldDisplayDismissButton(shouldDisplayDismissButton).setEdgeToEdge(edgeToEdge).setPaywallDisplayCallback(paywallDisplayCallback).build());
    }

    @InterfaceC2154e
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge, Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
        AbstractC5504s.h(customVariables, "customVariables");
        launchWithOptions(new PaywallActivityLaunchOptions.Builder().setOfferingIdentifier(offeringIdentifier, presentedOfferingContext).setFontProvider(fontProvider).setShouldDisplayDismissButton(shouldDisplayDismissButton).setEdgeToEdge(edgeToEdge).setCustomVariables(customVariables).build());
    }

    public final void launch(Offering offering, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge, Map<String, ? extends CustomVariableValue> customVariables) {
        OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext;
        AbstractC5504s.h(customVariables, "customVariables");
        AbstractC4814d abstractC4814d = this.activityResultLauncher;
        if (offering != null) {
            String identifier = offering.getIdentifier();
            Package r13 = (Package) AbstractC2279u.o0(offering.getAvailablePackages());
            idAndPresentedOfferingContext = new OfferingSelection.IdAndPresentedOfferingContext(identifier, r13 != null ? r13.getPresentedOfferingContext() : null);
        } else {
            idAndPresentedOfferingContext = null;
        }
        abstractC4814d.a(new PaywallActivityArgs((String) null, idAndPresentedOfferingContext, fontProvider, shouldDisplayDismissButton, edgeToEdge, false, (Map) customVariables, (Integer) null, 161, (DefaultConstructorMarker) null));
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, false, false, (PaywallDisplayCallback) null, 56, (Object) null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, z10, false, (PaywallDisplayCallback) null, 48, (Object) null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z10, boolean z11) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, z10, z11, (PaywallDisplayCallback) null, 32, (Object) null);
    }

    public final void launchIfNeeded(Function1 shouldDisplayBlock) {
        AbstractC5504s.h(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, null, null, false, false, shouldDisplayBlock, 15, null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge, PaywallDisplayCallback paywallDisplayCallback) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        HelperFunctionsKt.shouldDisplayPaywall(HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(requiredEntitlementIdentifier), new AnonymousClass1(paywallDisplayCallback, this, requiredEntitlementIdentifier, offering, fontProvider, shouldDisplayDismissButton, edgeToEdge));
    }

    @InterfaceC2154e
    public final /* synthetic */ void launchIfNeeded(String requiredEntitlementIdentifier, String offeringIdentifier, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge, PaywallDisplayCallback paywallDisplayCallback) {
        AbstractC5504s.h(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        HelperFunctionsKt.shouldDisplayPaywall(HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(requiredEntitlementIdentifier), new AnonymousClass2(paywallDisplayCallback, this, requiredEntitlementIdentifier, offeringIdentifier, fontProvider, shouldDisplayDismissButton, edgeToEdge));
    }

    @InterfaceC2154e
    public final /* synthetic */ void launch(String offeringIdentifier, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge) {
        AbstractC5504s.h(offeringIdentifier, "offeringIdentifier");
        this.activityResultLauncher.a(new PaywallActivityArgs((String) null, new OfferingSelection.IdAndPresentedOfferingContext(offeringIdentifier, null), fontProvider, shouldDisplayDismissButton, edgeToEdge, false, (Map) null, (Integer) null, JfifUtil.MARKER_APP1, (DefaultConstructorMarker) null));
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider fontProvider, boolean shouldDisplayDismissButton, boolean edgeToEdge, Function1 shouldDisplayBlock) {
        AbstractC5504s.h(shouldDisplayBlock, "shouldDisplayBlock");
        HelperFunctionsKt.shouldDisplayPaywall(shouldDisplayBlock, new AnonymousClass3(offering, fontProvider, shouldDisplayDismissButton, edgeToEdge));
    }
}
