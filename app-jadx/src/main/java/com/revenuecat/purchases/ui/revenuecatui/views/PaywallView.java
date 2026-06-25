package com.revenuecat.purchases.ui.revenuecatui.views;

import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import android.content.Context;
import android.util.AttributeSet;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableKeyValidator;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader;
import g0.i;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nBI\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0016B_\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0019J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\"\u0010#J%\u0010(\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\u00142\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0014H\u0016¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u0014H\u0017¢\u0006\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010?R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R$\u0010I\u001a\u0002072\u0006\u0010D\u001a\u0002078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J²\u0006\f\u0010I\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallView;", "Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "", "shouldDisplayDismissButton", "Lkotlin/Function0;", "LTd/L;", "dismissHandler", "(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Ljava/lang/Boolean;Lie/a;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;Lie/a;)V", "init", "parseAttributes", "dismiss", "()V", "setPaywallListener", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V", "setDismissHandler", "(Lie/a;)V", "setPurchaseLogic", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V", "", "offeringId", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "setOfferingId", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "setFontProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V", "setDisplayDismissButton", "(Z)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "variables", "setCustomVariables", "(Ljava/util/Map;)V", "onBackPressed", "Content", "(LY/m;I)V", "LY/C0;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "paywallOptionsState", "LY/C0;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "initialOfferingInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "initialFontProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "Lie/a;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "Ljava/lang/Boolean;", "internalListener", "value", "getPaywallOptions", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "setPaywallOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;)V", "paywallOptions", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallView extends CompatComposeView {
    public static final int $stable = 8;
    private InterfaceC5082a dismissHandler;
    private FontProvider initialFontProvider;
    private OfferingSelection.IdAndPresentedOfferingContext initialOfferingInfo;
    private PaywallListener internalListener;
    private PaywallListener listener;
    private final C0 paywallOptionsState;
    private PaywallPurchaseLogic purchaseLogic;
    private Boolean shouldDisplayDismissButton;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$Content$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ C0 $paywallOptions$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C0 c02) {
            super(2);
            this.$paywallOptions$delegate = c02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(226220304, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.PaywallView.Content.<anonymous> (PaywallView.kt:233)");
            }
            PaywallKt.Paywall(PaywallView.Content$lambda$4(this.$paywallOptions$delegate), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$init$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45191 extends AbstractC5506u implements InterfaceC5082a {
        C45191() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m931invoke() {
            PaywallView.this.dismiss();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m931invoke();
            return L.f17438a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context) {
        this(context, null, null, null, null, null, null, 126, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaywallOptions Content$lambda$4(C0 c02) {
        return (PaywallOptions) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        InterfaceC5082a interfaceC5082a = this.dismissHandler;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
    }

    private final PaywallOptions getPaywallOptions() {
        return (PaywallOptions) this.paywallOptionsState.getValue();
    }

    private final void init(Context context, AttributeSet attrs) {
        parseAttributes(context, attrs);
        PaywallOptions.Builder offeringIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release = new PaywallOptions.Builder(new C45191()).setListener(this.internalListener).setFontProvider(this.initialFontProvider).setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(this.initialOfferingInfo);
        Boolean bool = this.shouldDisplayDismissButton;
        setPaywallOptions(offeringIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release.setShouldDisplayDismissButton(bool != null ? bool.booleanValue() : false).setPurchaseLogic(this.purchaseLogic).build());
    }

    private final void parseAttributes(Context context, AttributeSet attrs) {
        PaywallViewAttributesReader.Companion companion = PaywallViewAttributesReader.INSTANCE;
        int[] PaywallView = R.styleable.PaywallView;
        AbstractC5504s.g(PaywallView, "PaywallView");
        PaywallViewAttributesReader.PaywallViewAttributes attributes = companion.parseAttributes(context, attrs, PaywallView);
        if (attributes == null) {
            return;
        }
        String offeringId = attributes.getOfferingId();
        FontProvider fontProvider = attributes.getFontProvider();
        Boolean shouldDisplayDismissButton = attributes.getShouldDisplayDismissButton();
        this.initialOfferingInfo = offeringId != null ? new OfferingSelection.IdAndPresentedOfferingContext(offeringId, null) : null;
        this.initialFontProvider = fontProvider;
        this.shouldDisplayDismissButton = shouldDisplayDismissButton;
    }

    public static /* synthetic */ void setOfferingId$default(PaywallView paywallView, String str, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            presentedOfferingContext = null;
        }
        paywallView.setOfferingId(str, presentedOfferingContext);
    }

    private final void setPaywallOptions(PaywallOptions paywallOptions) {
        this.paywallOptionsState.setValue(paywallOptions);
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a
    public void Content(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(1456977972);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1456977972, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.PaywallView.Content (PaywallView.kt:228)");
        }
        interfaceC2425m.V(502098637);
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = this.paywallOptionsState;
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        RevenueCatThemeKt.RevenueCatTheme(i.d(226220304, true, new AnonymousClass1((C0) objD), interfaceC2425m, 54), interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView
    public void onBackPressed() {
        L l10;
        if (this.dismissHandler != null) {
            dismiss();
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            super.onBackPressed();
        }
    }

    public final void setCustomVariables(Map<String, ? extends CustomVariableValue> variables) {
        AbstractC5504s.h(variables, "variables");
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, null, null, null, null, null, null, CustomVariableKeyValidator.INSTANCE.validateAndFilter(variables), 255, null));
    }

    public final void setDismissHandler(InterfaceC5082a dismissHandler) {
        this.dismissHandler = dismissHandler;
    }

    public final void setDisplayDismissButton(boolean shouldDisplayDismissButton) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, shouldDisplayDismissButton, null, null, null, null, null, null, null, 509, null));
    }

    public final void setFontProvider(FontProvider fontProvider) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, fontProvider, null, null, null, null, null, null, 507, null));
    }

    public final void setOfferingId(String str) {
        setOfferingId$default(this, str, null, 2, null);
    }

    public final void setPaywallListener(PaywallListener listener) {
        this.listener = listener;
    }

    public final void setPurchaseLogic(PaywallPurchaseLogic purchaseLogic) {
        this.purchaseLogic = purchaseLogic;
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, null, null, purchaseLogic, null, null, null, null, 495, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering) {
        this(context, offering, null, null, null, null, null, 124, null);
        AbstractC5504s.h(context, "context");
    }

    public final void setOfferingId(String offeringId, PresentedOfferingContext presentedOfferingContext) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), offeringId == null ? OfferingSelection.None.INSTANCE : new OfferingSelection.IdAndPresentedOfferingContext(offeringId, presentedOfferingContext), false, null, null, null, null, null, null, null, 510, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, null, null, null, 120, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, null, null, null, 112, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool) {
        this(context, offering, paywallListener, fontProvider, bool, null, null, 96, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, PaywallPurchaseLogic paywallPurchaseLogic) {
        this(context, offering, paywallListener, fontProvider, bool, paywallPurchaseLogic, null, 64, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        AbstractC5504s.h(context, "context");
        this.paywallOptionsState = b2.e(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$internalListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCompleted(customerInfo, storeTransaction);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseError(error);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
                L l10;
                AbstractC5504s.h(rcPackage, "rcPackage");
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchasePackageInitiated(rcPackage, resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package rcPackage) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseStarted(rcPackage);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreError(error);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreInitiated(Resumable resume) {
                L l10;
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreInitiated(resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreStarted();
                }
            }
        };
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
        this.paywallOptionsState = b2.e(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$internalListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCompleted(customerInfo, storeTransaction);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseError(error);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
                L l10;
                AbstractC5504s.h(rcPackage, "rcPackage");
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchasePackageInitiated(rcPackage, resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package rcPackage) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseStarted(rcPackage);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreError(error);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreInitiated(Resumable resume) {
                L l10;
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreInitiated(resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener = this.this$0.listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreStarted();
                }
            }
        };
        init(context, attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, InterfaceC5082a interfaceC5082a) {
        this(context, offering, paywallListener, fontProvider, bool, null, interfaceC5082a);
        AbstractC5504s.h(context, "context");
    }

    public /* synthetic */ PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, PaywallPurchaseLogic paywallPurchaseLogic, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : offering, (i10 & 4) != 0 ? null : paywallListener, (i10 & 8) != 0 ? null : fontProvider, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : paywallPurchaseLogic, (i10 & 64) != 0 ? null : interfaceC5082a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, PaywallPurchaseLogic paywallPurchaseLogic, InterfaceC5082a interfaceC5082a) {
        super(context, null, 0, 6, null);
        AbstractC5504s.h(context, "context");
        this.paywallOptionsState = b2.e(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.PaywallView$internalListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseCompleted(customerInfo, storeTransaction);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseError(error);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
                L l10;
                AbstractC5504s.h(rcPackage, "rcPackage");
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchasePackageInitiated(rcPackage, resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package rcPackage) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onPurchaseStarted(rcPackage);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreCompleted(customerInfo);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreError(error);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreInitiated(Resumable resume) {
                L l10;
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreInitiated(resume);
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener2 = this.this$0.listener;
                if (paywallListener2 != null) {
                    paywallListener2.onRestoreStarted();
                }
            }
        };
        setPaywallListener(paywallListener);
        setDismissHandler(interfaceC5082a);
        setPurchaseLogic(paywallPurchaseLogic);
        if (offering != null) {
            String identifier = offering.getIdentifier();
            Package r92 = (Package) AbstractC2279u.o0(offering.getAvailablePackages());
            setOfferingId(identifier, r92 != null ? r92.getPresentedOfferingContext() : null);
        }
        this.shouldDisplayDismissButton = bool;
        this.initialFontProvider = fontProvider;
        init(context, null);
    }
}
