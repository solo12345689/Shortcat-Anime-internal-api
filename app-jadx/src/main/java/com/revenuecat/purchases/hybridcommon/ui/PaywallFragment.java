package com.revenuecat.purchases.hybridcommon.ui;

import Td.L;
import Td.z;
import Ud.S;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.B;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchIfNeededOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallDisplayCallback;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResultHandler;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000245B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J5\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010 R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;", "Landroidx/fragment/app/q;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResultHandler;", "<init>", "()V", "LTd/L;", "removeFragment", "", "", "", "customVariables", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "convertToCustomVariableValues", "(Ljava/util/Map;)Ljava/util/Map;", "requiredEntitlementIdentifier", "launchPaywallIfNeeded", "(Ljava/lang/String;)V", "launchPaywall", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "paywallResult", "setFragmentResult", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "result", "onActivityResult", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLauncher;", "launcher", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityLauncher;", "getRequestKey", "()Ljava/lang/String;", "requestKey", "getRequiredEntitlementIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContextArg", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContextArg", "", "getShouldDisplayDismissButtonArg", "()Ljava/lang/Boolean;", "shouldDisplayDismissButtonArg", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "getFontFamily", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "fontFamily", "getOfferingIdentifierArg", "offeringIdentifierArg", "getCustomVariablesArg", "()Ljava/util/Map;", "customVariablesArg", "Companion", "ResultKey", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallFragment extends AbstractComponentCallbacksC2838q implements PaywallResultHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String notPresentedPaywallResult = "NOT_PRESENTED";
    public static final String tag = "revenuecat-paywall-fragment";
    private PaywallActivityLauncher launcher;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J[\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;", "", "()V", "notPresentedPaywallResult", "", "tag", "newInstance", "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;", "requestKey", "requiredEntitlementIdentifier", "shouldDisplayDismissButton", "", "paywallSource", "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;", "fontFamily", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "customVariables", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;", "OptionKey", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion$OptionKey;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "REQUEST_KEY", "REQUIRED_ENTITLEMENT_IDENTIFIER", "SHOULD_DISPLAY_DISMISS_BUTTON", "OFFERING_IDENTIFIER", "PRESENTED_OFFERING_CONTEXT", "FONT_FAMILY", "CUSTOM_VARIABLES", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum OptionKey {
            REQUEST_KEY("requestKey"),
            REQUIRED_ENTITLEMENT_IDENTIFIER("requiredEntitlementIdentifier"),
            SHOULD_DISPLAY_DISMISS_BUTTON("shouldDisplayDismissButton"),
            OFFERING_IDENTIFIER("offeringIdentifier"),
            PRESENTED_OFFERING_CONTEXT("presentedOfferingContext"),
            FONT_FAMILY("fontProvider"),
            CUSTOM_VARIABLES("customVariables");

            private final String key;

            OptionKey(String str) {
                this.key = str;
            }

            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaywallFragment newInstance$default(Companion companion, String str, String str2, Boolean bool, PaywallSource paywallSource, PaywallFontFamily paywallFontFamily, Map map, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                bool = null;
            }
            if ((i10 & 16) != 0) {
                paywallFontFamily = null;
            }
            if ((i10 & 32) != 0) {
                map = null;
            }
            return companion.newInstance(str, str2, bool, paywallSource, paywallFontFamily, map);
        }

        public final PaywallFragment newInstance(String requestKey, String requiredEntitlementIdentifier, Boolean shouldDisplayDismissButton, PaywallSource paywallSource, PaywallFontFamily fontFamily, Map<String, ? extends Object> customVariables) {
            AbstractC5504s.h(requestKey, "requestKey");
            AbstractC5504s.h(paywallSource, "paywallSource");
            PaywallFragment paywallFragment = new PaywallFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OptionKey.REQUEST_KEY.getKey(), requestKey);
            bundle.putString(OptionKey.REQUIRED_ENTITLEMENT_IDENTIFIER.getKey(), requiredEntitlementIdentifier);
            if (shouldDisplayDismissButton != null) {
                bundle.putBoolean(OptionKey.SHOULD_DISPLAY_DISMISS_BUTTON.getKey(), shouldDisplayDismissButton.booleanValue());
            }
            if (paywallSource instanceof PaywallSource.Offering) {
                PaywallSource.Offering offering = (PaywallSource.Offering) paywallSource;
                bundle.putString(OptionKey.OFFERING_IDENTIFIER.getKey(), offering.getValue().getIdentifier());
                PresentedOfferingContext presentedOfferingContext$hybridcommon_ui_bc8Release = offering.getPresentedOfferingContext$hybridcommon_ui_bc8Release();
                if (presentedOfferingContext$hybridcommon_ui_bc8Release != null) {
                    bundle.putParcelable(OptionKey.PRESENTED_OFFERING_CONTEXT.getKey(), presentedOfferingContext$hybridcommon_ui_bc8Release);
                }
            } else if (paywallSource instanceof PaywallSource.OfferingIdentifier) {
                bundle.putString(OptionKey.OFFERING_IDENTIFIER.getKey(), ((PaywallSource.OfferingIdentifier) paywallSource).getValue());
            } else if (paywallSource instanceof PaywallSource.OfferingIdentifierWithPresentedOfferingContext) {
                PaywallSource.OfferingIdentifierWithPresentedOfferingContext offeringIdentifierWithPresentedOfferingContext = (PaywallSource.OfferingIdentifierWithPresentedOfferingContext) paywallSource;
                bundle.putString(OptionKey.OFFERING_IDENTIFIER.getKey(), offeringIdentifierWithPresentedOfferingContext.getOfferingIdentifier());
                bundle.putParcelable(OptionKey.PRESENTED_OFFERING_CONTEXT.getKey(), offeringIdentifierWithPresentedOfferingContext.getPresentedOfferingContext());
            }
            if (fontFamily != null) {
                bundle.putParcelable(OptionKey.FONT_FAMILY.getKey(), fontFamily);
            }
            if (customVariables != null) {
                bundle.putSerializable(OptionKey.CUSTOM_VARIABLES.getKey(), new HashMap(customVariables));
            }
            paywallFragment.setArguments(bundle);
            return paywallFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$ResultKey;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "PAYWALL_RESULT", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ResultKey {
        PAYWALL_RESULT(PaywallActivity.RESULT_EXTRA);

        private final String key;

        ResultKey(String str) {
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }

    private final Map<String, CustomVariableValue> convertToCustomVariableValues(Map<String, ? extends Object> customVariables) {
        Pair pairA;
        if (customVariables != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends Object> entry : customVariables.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    pairA = z.a(key, new CustomVariableValue.String((String) value));
                } else if (value instanceof Boolean) {
                    pairA = z.a(key, new CustomVariableValue.Boolean(((Boolean) value).booleanValue()));
                } else if (value instanceof Number) {
                    pairA = z.a(key, new CustomVariableValue.Number(((Number) value).doubleValue()));
                } else {
                    if (value != null) {
                        Log.w("Purchases", "Custom variable '" + key + "' has unsupported type " + O.b(value.getClass()).v() + ". Only String, Number, and Boolean values are supported. This variable will be ignored.");
                    }
                    pairA = null;
                }
                if (pairA != null) {
                    arrayList.add(pairA);
                }
            }
            Map<String, CustomVariableValue> mapW = S.w(arrayList);
            if (mapW != null && !mapW.isEmpty()) {
                return mapW;
            }
        }
        return null;
    }

    private final Map<String, Object> getCustomVariablesArg() {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            HashMap map = arguments != null ? (HashMap) arguments.getSerializable(Companion.OptionKey.CUSTOM_VARIABLES.getKey(), HashMap.class) : null;
            if (map != null) {
                return map;
            }
            return null;
        }
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable(Companion.OptionKey.CUSTOM_VARIABLES.getKey()) : null;
        if (serializable instanceof Map) {
            return (Map) serializable;
        }
        return null;
    }

    private final PaywallFontFamily getFontFamily() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Companion.OptionKey optionKey = Companion.OptionKey.FONT_FAMILY;
            if (!arguments.containsKey(optionKey.getKey())) {
                arguments = null;
            }
            if (arguments != null) {
                return Build.VERSION.SDK_INT >= 33 ? (PaywallFontFamily) arguments.getParcelable(optionKey.getKey(), PaywallFontFamily.class) : (PaywallFontFamily) arguments.getParcelable(optionKey.getKey());
            }
        }
        return null;
    }

    private final String getOfferingIdentifierArg() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Companion.OptionKey.OFFERING_IDENTIFIER.getKey());
        }
        return null;
    }

    private final PresentedOfferingContext getPresentedOfferingContextArg() {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                return (PresentedOfferingContext) arguments.getParcelable(Companion.OptionKey.PRESENTED_OFFERING_CONTEXT.getKey(), PresentedOfferingContext.class);
            }
            return null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            return (PresentedOfferingContext) arguments2.getParcelable(Companion.OptionKey.PRESENTED_OFFERING_CONTEXT.getKey());
        }
        return null;
    }

    private final String getRequestKey() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(Companion.OptionKey.REQUEST_KEY.getKey()) : null;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("requestKey argument not provided");
    }

    private final String getRequiredEntitlementIdentifier() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Companion.OptionKey.REQUIRED_ENTITLEMENT_IDENTIFIER.getKey());
        }
        return null;
    }

    private final Boolean getShouldDisplayDismissButtonArg() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Companion.OptionKey optionKey = Companion.OptionKey.SHOULD_DISPLAY_DISMISS_BUTTON;
            if (arguments.containsKey(optionKey.getKey())) {
                return Boolean.valueOf(arguments.getBoolean(optionKey.getKey()));
            }
        }
        return null;
    }

    private final void launchPaywall() {
        HybridPurchaseLogicBridge purchaseLogic;
        PaywallListenerWrapper paywallListener;
        String offeringIdentifierArg = getOfferingIdentifierArg();
        PresentedOfferingContext presentedOfferingContextArg = getPresentedOfferingContextArg();
        PaywallActivityLauncher paywallActivityLauncher = null;
        if (presentedOfferingContextArg == null) {
            presentedOfferingContextArg = offeringIdentifierArg != null ? new PresentedOfferingContext(offeringIdentifierArg) : null;
        }
        Boolean shouldDisplayDismissButtonArg = getShouldDisplayDismissButtonArg();
        PaywallFontFamily fontFamily = getFontFamily();
        CustomParcelizableFontProvider customParcelizableFontProvider = fontFamily != null ? new CustomParcelizableFontProvider(fontFamily) : null;
        Map<String, CustomVariableValue> mapConvertToCustomVariableValues = convertToCustomVariableValues(getCustomVariablesArg());
        if (mapConvertToCustomVariableValues == null) {
            mapConvertToCustomVariableValues = S.i();
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = PaywallFragmentNonSerializableArgsStore.INSTANCE.get(getRequestKey());
        PaywallActivityLaunchOptions.Builder customVariables = new PaywallActivityLaunchOptions.Builder().setFontProvider(customParcelizableFontProvider).setCustomVariables(mapConvertToCustomVariableValues);
        if (shouldDisplayDismissButtonArg != null) {
            customVariables.setShouldDisplayDismissButton(shouldDisplayDismissButtonArg.booleanValue());
        }
        if (offeringIdentifierArg != null && presentedOfferingContextArg != null) {
            customVariables.setOfferingIdentifier(offeringIdentifierArg, presentedOfferingContextArg);
        }
        if (paywallFragmentNonSerializableArgs != null && (paywallListener = paywallFragmentNonSerializableArgs.getPaywallListener()) != null) {
            customVariables.setListener(paywallListener);
        }
        if (paywallFragmentNonSerializableArgs != null && (purchaseLogic = paywallFragmentNonSerializableArgs.getPurchaseLogic()) != null) {
            customVariables.setPurchaseLogic(purchaseLogic);
        }
        PaywallActivityLauncher paywallActivityLauncher2 = this.launcher;
        if (paywallActivityLauncher2 == null) {
            AbstractC5504s.u("launcher");
        } else {
            paywallActivityLauncher = paywallActivityLauncher2;
        }
        paywallActivityLauncher.launchWithOptions(customVariables.build());
    }

    private final void launchPaywallIfNeeded(String requiredEntitlementIdentifier) {
        HybridPurchaseLogicBridge purchaseLogic;
        PaywallListenerWrapper paywallListener;
        Boolean shouldDisplayDismissButtonArg = getShouldDisplayDismissButtonArg();
        String offeringIdentifierArg = getOfferingIdentifierArg();
        PresentedOfferingContext presentedOfferingContextArg = getPresentedOfferingContextArg();
        PaywallActivityLauncher paywallActivityLauncher = null;
        if (presentedOfferingContextArg == null) {
            presentedOfferingContextArg = offeringIdentifierArg != null ? new PresentedOfferingContext(offeringIdentifierArg) : null;
        }
        PaywallFontFamily fontFamily = getFontFamily();
        CustomParcelizableFontProvider customParcelizableFontProvider = fontFamily != null ? new CustomParcelizableFontProvider(fontFamily) : null;
        Map<String, CustomVariableValue> mapConvertToCustomVariableValues = convertToCustomVariableValues(getCustomVariablesArg());
        if (mapConvertToCustomVariableValues == null) {
            mapConvertToCustomVariableValues = S.i();
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = PaywallFragmentNonSerializableArgsStore.INSTANCE.get(getRequestKey());
        PaywallActivityLaunchIfNeededOptions.Builder customVariables = new PaywallActivityLaunchIfNeededOptions.Builder().setRequiredEntitlementIdentifier(requiredEntitlementIdentifier).setFontProvider(customParcelizableFontProvider).setPaywallDisplayCallback(new PaywallDisplayCallback() { // from class: com.revenuecat.purchases.hybridcommon.ui.PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.activity.PaywallDisplayCallback
            public void onPaywallDisplayResult(boolean wasDisplayed) {
                if (wasDisplayed) {
                    return;
                }
                this.this$0.setFragmentResult("NOT_PRESENTED");
                this.this$0.removeFragment();
            }
        }).setCustomVariables(mapConvertToCustomVariableValues);
        if (shouldDisplayDismissButtonArg != null) {
            customVariables.setShouldDisplayDismissButton(shouldDisplayDismissButtonArg.booleanValue());
        }
        if (offeringIdentifierArg != null && presentedOfferingContextArg != null) {
            customVariables.setOfferingIdentifier(offeringIdentifierArg, presentedOfferingContextArg);
        }
        if (paywallFragmentNonSerializableArgs != null && (paywallListener = paywallFragmentNonSerializableArgs.getPaywallListener()) != null) {
            customVariables.setListener(paywallListener);
        }
        if (paywallFragmentNonSerializableArgs != null && (purchaseLogic = paywallFragmentNonSerializableArgs.getPurchaseLogic()) != null) {
            customVariables.setPurchaseLogic(purchaseLogic);
        }
        PaywallActivityLauncher paywallActivityLauncher2 = this.launcher;
        if (paywallActivityLauncher2 == null) {
            AbstractC5504s.u("launcher");
        } else {
            paywallActivityLauncher = paywallActivityLauncher2;
        }
        paywallActivityLauncher.launchIfNeededWithOptions(customVariables.build());
    }

    public static final PaywallFragment newInstance(String str, String str2, Boolean bool, PaywallSource paywallSource, PaywallFontFamily paywallFontFamily, Map<String, ? extends Object> map) {
        return INSTANCE.newInstance(str, str2, bool, paywallSource, paywallFontFamily, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeFragment() {
        PaywallFragmentNonSerializableArgsStore.INSTANCE.remove(getRequestKey());
        getParentFragmentManager().s().n(this).h();
    }

    private final void setFragmentResult(PaywallResult paywallResult) {
        setFragmentResult(PaywallResultExtensionsKt.getName(paywallResult));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle savedInstanceState) {
        L l10;
        super.onCreate(savedInstanceState);
        if (!Purchases.INSTANCE.isConfigured()) {
            Log.e("PaywallFragment", "Purchases is not configured. Make sure to call Purchases.configure() before launching the paywall. Dismissing.");
            removeFragment();
            return;
        }
        this.launcher = new PaywallActivityLauncher(this, this);
        String requiredEntitlementIdentifier = getRequiredEntitlementIdentifier();
        if (requiredEntitlementIdentifier != null) {
            launchPaywallIfNeeded(requiredEntitlementIdentifier);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            launchPaywall();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFragmentResult(String paywallResult) {
        String requestKey = getRequestKey();
        Bundle bundle = new Bundle();
        bundle.putString(ResultKey.PAYWALL_RESULT.getKey(), paywallResult);
        L l10 = L.f17438a;
        B.a(this, requestKey, bundle);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResultHandler, g.InterfaceC4812b
    public void onActivityResult(PaywallResult result) {
        AbstractC5504s.h(result, "result");
        setFragmentResult(result);
        removeFragment();
    }
}
