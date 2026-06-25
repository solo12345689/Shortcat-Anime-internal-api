package com.revenuecat.purchases.ui.revenuecatui.views;

import Td.InterfaceC2154e;
import Td.L;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nBQ\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J!\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u0019\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R$\u0010:\u001a\u00020(2\u0006\u00105\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "", "condensed", "Lkotlin/Function0;", "LTd/L;", "dismissHandler", "(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;ZLie/a;)V", "init", "parseAttributes", "setPaywallListener", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V", "setDismissHandler", "(Lie/a;)V", "", "offeringId", "setOfferingId", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "setOfferingIdAndPresentedOfferingContext", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "setFontProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V", "LY/C0;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "paywallOptionsState", "LY/C0;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "initialOfferingInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "initialFontProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "initialCondensed", "Z", "Lie/a;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "internalListener", "value", "getPaywallOptions", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "setPaywallOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;)V", "paywallOptions", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OriginalTemplatePaywallFooterView extends FrameLayout {
    public static final int $stable = 8;
    private InterfaceC5082a dismissHandler;
    private boolean initialCondensed;
    private FontProvider initialFontProvider;
    private OfferingSelection.IdAndPresentedOfferingContext initialOfferingInfo;
    private PaywallListener internalListener;
    private PaywallListener listener;
    private final C0 paywallOptionsState;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView$init$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m929invoke() {
            InterfaceC5082a interfaceC5082a = OriginalTemplatePaywallFooterView.this.dismissHandler;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m929invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView$init$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"com/revenuecat/purchases/ui/revenuecatui/views/OriginalTemplatePaywallFooterView$init$2", "Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;", "LTd/L;", "Content", "(LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "paywallOptions", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends CompatComposeView {
        final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
            super(context, null, 0, 6, null);
            this.this$0 = originalTemplatePaywallFooterView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaywallOptions Content$lambda$1(C0 c02) {
            return (PaywallOptions) c02.getValue();
        }

        @Override // androidx.compose.ui.platform.AbstractC2680a
        public void Content(InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(951143030);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(951143030, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView.init.<no name provided>.Content (OriginalTemplatePaywallFooterView.kt:192)");
            }
            interfaceC2425m.V(-704718066);
            OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView = this.this$0;
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = originalTemplatePaywallFooterView.paywallOptionsState;
                interfaceC2425m.u(objD);
            }
            interfaceC2425m.O();
            RevenueCatThemeKt.RevenueCatTheme(i.d(-1757622246, true, new OriginalTemplatePaywallFooterView$init$2$Content$1(this.this$0, (C0) objD), interfaceC2425m, 54), interfaceC2425m, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context) {
        this(context, null, null, null, false, null, 62, null);
        AbstractC5504s.h(context, "context");
    }

    private final PaywallOptions getPaywallOptions() {
        return (PaywallOptions) this.paywallOptionsState.getValue();
    }

    private final void init(Context context, AttributeSet attrs) {
        parseAttributes(context, attrs);
        setPaywallOptions(new PaywallOptions.Builder(new AnonymousClass1()).setListener(this.internalListener).setFontProvider(this.initialFontProvider).setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(this.initialOfferingInfo).build());
        addView(new AnonymousClass2(context, this));
    }

    private final void parseAttributes(Context context, AttributeSet attrs) {
        PaywallViewAttributesReader.Companion companion = PaywallViewAttributesReader.INSTANCE;
        int[] PaywallFooterView = R.styleable.PaywallFooterView;
        AbstractC5504s.g(PaywallFooterView, "PaywallFooterView");
        PaywallViewAttributesReader.PaywallViewAttributes attributes = companion.parseAttributes(context, attrs, PaywallFooterView);
        if (attributes == null) {
            return;
        }
        String offeringId = attributes.getOfferingId();
        FontProvider fontProvider = attributes.getFontProvider();
        Boolean condensed = attributes.getCondensed();
        this.initialOfferingInfo = offeringId != null ? new OfferingSelection.IdAndPresentedOfferingContext(offeringId, null) : null;
        this.initialFontProvider = fontProvider;
        if (condensed != null) {
            this.initialCondensed = condensed.booleanValue();
        }
    }

    private final void setPaywallOptions(PaywallOptions paywallOptions) {
        this.paywallOptionsState.setValue(paywallOptions);
    }

    public final void setDismissHandler(InterfaceC5082a dismissHandler) {
        this.dismissHandler = dismissHandler;
    }

    public final void setFontProvider(FontProvider fontProvider) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, fontProvider, null, null, null, null, null, null, 507, null));
    }

    @InterfaceC2154e
    public final void setOfferingId(String offeringId) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), offeringId == null ? OfferingSelection.None.INSTANCE : new OfferingSelection.IdAndPresentedOfferingContext(offeringId, null), false, null, null, null, null, null, null, null, 510, null));
    }

    public final void setOfferingIdAndPresentedOfferingContext(String offeringId, PresentedOfferingContext presentedOfferingContext) {
        if (offeringId == null) {
            setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), OfferingSelection.None.INSTANCE, false, null, null, null, null, null, null, null, 510, null));
        } else {
            setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), new OfferingSelection.IdAndPresentedOfferingContext(offeringId, presentedOfferingContext), false, null, null, null, null, null, null, null, 510, null));
        }
    }

    public final void setPaywallListener(PaywallListener listener) {
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering) {
        this(context, offering, null, null, false, null, 60, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, false, null, 56, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, false, null, 48, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10) {
        this(context, offering, paywallListener, fontProvider, z10, null, 32, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5504s.h(context, "context");
        this.paywallOptionsState = b2.e(new PaywallOptions.Builder(new OriginalTemplatePaywallFooterView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView$internalListener$1
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
            public void onPurchasePackageInitiated(Package r12, Resumable resumable) {
                PaywallListener.DefaultImpls.onPurchasePackageInitiated(this, r12, resumable);
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
    public OriginalTemplatePaywallFooterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
        this.paywallOptionsState = b2.e(new PaywallOptions.Builder(new OriginalTemplatePaywallFooterView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView$internalListener$1
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
            public void onPurchasePackageInitiated(Package r12, Resumable resumable) {
                PaywallListener.DefaultImpls.onPurchasePackageInitiated(this, r12, resumable);
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

    public /* synthetic */ OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : offering, (i10 & 4) != 0 ? null : paywallListener, (i10 & 8) != 0 ? null : fontProvider, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : interfaceC5082a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z10, InterfaceC5082a interfaceC5082a) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.paywallOptionsState = b2.e(new PaywallOptions.Builder(new OriginalTemplatePaywallFooterView$paywallOptionsState$1(this)).build(), null, 2, null);
        this.internalListener = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView$internalListener$1
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
            public void onPurchasePackageInitiated(Package r12, Resumable resumable) {
                PaywallListener.DefaultImpls.onPurchasePackageInitiated(this, r12, resumable);
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
        setOfferingId(offering != null ? offering.getIdentifier() : null);
        this.initialFontProvider = fontProvider;
        this.initialCondensed = z10;
        init(context, null);
    }
}
