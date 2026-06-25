package com.revenuecat.purchases.ui.revenuecatui.activity;

import C.A;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import U.E;
import U.P;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2393b0;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import Y0.AbstractC2469d;
import Y0.AbstractC2485u;
import Y0.AbstractC2486v;
import Y0.H;
import Y0.InterfaceC2484t;
import Z0.c;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.AbstractActivityC2640j;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.GoogleFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFont;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.SdkConfigurationStateKt;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import e.AbstractC4634b;
import g.AbstractC4814d;
import g.InterfaceC4812b;
import g0.i;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import pe.InterfaceC6018h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;", "Landroidx/activity/j;", "<init>", "()V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;", "getArgs", "()Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "getFontProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "Lcom/revenuecat/purchases/Offering;", "exitOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "result", "LTd/L;", "onDismissRequest", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "launchExitOfferActivity", "(Lcom/revenuecat/purchases/Offering;)V", "Landroid/content/Intent;", "createResultIntent", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Lg/d;", "exitOfferLauncher", "Lg/d;", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallActivity extends AbstractActivityC2640j {
    public static final String ARGS_EXTRA = "paywall_args";
    public static final String RESULT_EXTRA = "paywall_result";
    private final AbstractC4814d exitOfferLauncher = registerForActivityResult(new PaywallContract(), new InterfaceC4812b() { // from class: com.revenuecat.purchases.ui.revenuecatui.activity.b
        @Override // g.InterfaceC4812b
        public final void onActivityResult(Object obj) {
            PaywallActivity.exitOfferLauncher$lambda$0(this.f44180a, (PaywallResult) obj);
        }
    });
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41541 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PaywallActivityArgs $args;
        final /* synthetic */ PaywallActivity$onCreate$compositeListener$1 $compositeListener;
        final /* synthetic */ OfferingSelection.IdAndPresentedOfferingContext $offeringSelection;
        final /* synthetic */ PaywallPurchaseLogic $purchaseLogic;
        final /* synthetic */ PaywallActivity this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06771 extends AbstractC5506u implements Function2 {
            final /* synthetic */ PaywallActivityArgs $args;
            final /* synthetic */ PaywallActivity$onCreate$compositeListener$1 $compositeListener;
            final /* synthetic */ OfferingSelection.IdAndPresentedOfferingContext $offeringSelection;
            final /* synthetic */ PaywallPurchaseLogic $purchaseLogic;
            final /* synthetic */ PaywallActivity this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC/A;", "<anonymous parameter 0>", "LTd/L;", "invoke", "(LC/A;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C06781 extends AbstractC5506u implements InterfaceC5096o {
                final /* synthetic */ PaywallActivityArgs $args;
                final /* synthetic */ PaywallActivity$onCreate$compositeListener$1 $compositeListener;
                final /* synthetic */ OfferingSelection.IdAndPresentedOfferingContext $offeringSelection;
                final /* synthetic */ PaywallPurchaseLogic $purchaseLogic;
                final /* synthetic */ PaywallActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06781(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs, PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1, PaywallPurchaseLogic paywallPurchaseLogic) {
                    super(3);
                    this.$offeringSelection = idAndPresentedOfferingContext;
                    this.this$0 = paywallActivity;
                    this.$args = paywallActivityArgs;
                    this.$compositeListener = paywallActivity$onCreate$compositeListener$1;
                    this.$purchaseLogic = paywallPurchaseLogic;
                }

                @Override // ie.InterfaceC5096o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((A) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                    return L.f17438a;
                }

                public final void invoke(A anonymous$parameter$0$, InterfaceC2425m interfaceC2425m, int i10) {
                    Map<String, CustomVariableValue> mapI;
                    AbstractC5504s.h(anonymous$parameter$0$, "$anonymous$parameter$0$");
                    if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                        interfaceC2425m.K();
                        return;
                    }
                    if (AbstractC2454w.L()) {
                        AbstractC2454w.U(2025926559, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaywallActivity.kt:208)");
                    }
                    e eVarF = s.f(e.f26613a, 0.0f, 1, null);
                    OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = this.$offeringSelection;
                    PaywallActivity paywallActivity = this.this$0;
                    PaywallActivityArgs paywallActivityArgs = this.$args;
                    PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1 = this.$compositeListener;
                    PaywallPurchaseLogic paywallPurchaseLogic = this.$purchaseLogic;
                    B bH = f.h(l0.e.f52304a.o(), false);
                    int iA = AbstractC2410h.a(interfaceC2425m, 0);
                    I iR = interfaceC2425m.r();
                    e eVarF2 = c.f(interfaceC2425m, eVarF);
                    InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
                    InterfaceC5082a interfaceC5082aA = aVar.a();
                    if (interfaceC2425m.j() == null) {
                        AbstractC2410h.d();
                    }
                    interfaceC2425m.I();
                    if (interfaceC2425m.e()) {
                        interfaceC2425m.h(interfaceC5082aA);
                    } else {
                        interfaceC2425m.s();
                    }
                    InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
                    m2.e(interfaceC2425mB, bH, aVar.e());
                    m2.e(interfaceC2425mB, iR, aVar.g());
                    Function2 function2B = aVar.b();
                    if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                        interfaceC2425mB.u(Integer.valueOf(iA));
                        interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                    }
                    m2.e(interfaceC2425mB, eVarF2, aVar.f());
                    h hVar = h.f26161a;
                    PaywallOptions.Builder purchaseLogic = new PaywallOptions.Builder(PaywallActivity$onCreate$1$1$1$1$paywallOptions$1.INSTANCE).setOfferingSelection$revenuecatui_defaultsBc8Release((OfferingSelection) idAndPresentedOfferingContext).setFontProvider(paywallActivity.getFontProvider()).setShouldDisplayDismissButton(paywallActivityArgs != null ? paywallActivityArgs.getShouldDisplayDismissButton() : true).setListener(paywallActivity$onCreate$compositeListener$1).setPurchaseLogic(paywallPurchaseLogic);
                    interfaceC2425m.V(1035114476);
                    boolean zF = interfaceC2425m.F(paywallActivity);
                    Object objD = interfaceC2425m.D();
                    if (zF || objD == InterfaceC2425m.f22370a.a()) {
                        objD = new PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1(paywallActivity);
                        interfaceC2425m.u(objD);
                    }
                    interfaceC2425m.O();
                    PaywallOptions.Builder dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release = purchaseLogic.setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release((Function2) ((InterfaceC6018h) objD));
                    if (paywallActivityArgs == null || (mapI = paywallActivityArgs.getCustomVariables()) == null) {
                        mapI = S.i();
                    }
                    PaywallOptions paywallOptionsBuild = dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release.setCustomVariables(mapI).build();
                    PaywallViewModel paywallViewModel = InternalPaywallKt.getPaywallViewModel(paywallOptionsBuild, null, interfaceC2425m, 0, 2);
                    L l10 = L.f17438a;
                    interfaceC2425m.V(1035122993);
                    boolean zU = interfaceC2425m.U(paywallViewModel);
                    Object objD2 = interfaceC2425m.D();
                    if (zU || objD2 == InterfaceC2425m.f22370a.a()) {
                        objD2 = new PaywallActivity$onCreate$1$1$1$1$1$1(paywallViewModel, null);
                        interfaceC2425m.u(objD2);
                    }
                    interfaceC2425m.O();
                    AbstractC2393b0.e(l10, (Function2) objD2, interfaceC2425m, 6);
                    PaywallKt.Paywall(paywallOptionsBuild, interfaceC2425m, 0);
                    interfaceC2425m.x();
                    if (AbstractC2454w.L()) {
                        AbstractC2454w.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06771(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs, PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1, PaywallPurchaseLogic paywallPurchaseLogic) {
                super(2);
                this.$offeringSelection = idAndPresentedOfferingContext;
                this.this$0 = paywallActivity;
                this.$args = paywallActivityArgs;
                this.$compositeListener = paywallActivity$onCreate$compositeListener$1;
                this.$purchaseLogic = paywallPurchaseLogic;
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
                    AbstractC2454w.U(-588670640, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous> (PaywallActivity.kt:205)");
                }
                P.a(null, null, null, null, null, 0, 0L, 0L, C.S.a(0, 0, 0, 0), i.d(2025926559, true, new C06781(this.$offeringSelection, this.this$0, this.$args, this.$compositeListener, this.$purchaseLogic), interfaceC2425m, 54), interfaceC2425m, 805306368, 255);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41541(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs, PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1, PaywallPurchaseLogic paywallPurchaseLogic) {
            super(2);
            this.$offeringSelection = idAndPresentedOfferingContext;
            this.this$0 = paywallActivity;
            this.$args = paywallActivityArgs;
            this.$compositeListener = paywallActivity$onCreate$compositeListener$1;
            this.$purchaseLogic = paywallPurchaseLogic;
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
                AbstractC2454w.U(2032214180, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous> (PaywallActivity.kt:202)");
            }
            E.a(null, null, null, i.d(-588670640, true, new C06771(this.$offeringSelection, this.this$0, this.$args, this.$compositeListener, this.$purchaseLogic), interfaceC2425m, 54), interfaceC2425m, 3072, 7);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent createResultIntent(PaywallResult result) {
        Intent intentPutExtra = new Intent().putExtra(RESULT_EXTRA, result);
        AbstractC5504s.g(intentPutExtra, "Intent().putExtra(RESULT_EXTRA, result)");
        return intentPutExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exitOfferLauncher$lambda$0(PaywallActivity paywallActivity, PaywallResult result) {
        AbstractC5504s.h(result, "result");
        paywallActivity.setResult(-1, paywallActivity.createResultIntent(result));
        paywallActivity.finish();
    }

    private final PaywallActivityArgs getArgs() {
        return Build.VERSION.SDK_INT >= 33 ? (PaywallActivityArgs) getIntent().getParcelableExtra(ARGS_EXTRA, PaywallActivityArgs.class) : (PaywallActivityArgs) getIntent().getParcelableExtra(ARGS_EXTRA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FontProvider getFontProvider() {
        Map<TypographyType, PaywallFontFamily> fonts;
        ArrayList arrayList;
        List<PaywallFont> fonts2;
        InterfaceC2484t interfaceC2484tA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PaywallActivityArgs args = getArgs();
        if (args == null || (fonts = args.getFonts()) == null) {
            return null;
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(fonts.size()));
        Iterator<T> it = fonts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            PaywallFontFamily paywallFontFamily = (PaywallFontFamily) entry.getValue();
            if (paywallFontFamily == null || (fonts2 = paywallFontFamily.getFonts()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(AbstractC2279u.x(fonts2, 10));
                for (PaywallFont paywallFont : fonts2) {
                    if (paywallFont instanceof PaywallFont.ResourceFont) {
                        PaywallFont.ResourceFont resourceFont = (PaywallFont.ResourceFont) paywallFont;
                        interfaceC2484tA = Y0.B.b(resourceFont.getResourceId(), resourceFont.getFontWeight(), H.d(resourceFont.getFontStyle()), 0, 8, null);
                    } else if (paywallFont instanceof PaywallFont.AssetFont) {
                        PaywallFont.AssetFont assetFont = (PaywallFont.AssetFont) paywallFont;
                        String path = assetFont.getPath();
                        AssetManager assets = getAssets();
                        AbstractC5504s.g(assets, "assets");
                        interfaceC2484tA = AbstractC2469d.d(path, assets, assetFont.getFontWeight(), H.d(assetFont.getFontStyle()), null, 16, null);
                    } else {
                        if (!(paywallFont instanceof PaywallFont.GoogleFont)) {
                            throw new r();
                        }
                        PaywallFont.GoogleFont googleFont = (PaywallFont.GoogleFont) paywallFont;
                        GoogleFontProvider fontProvider = googleFont.getFontProvider();
                        Object googleProvider = linkedHashMap.get(fontProvider);
                        if (googleProvider == null) {
                            googleProvider = fontProvider.toGoogleProvider();
                            linkedHashMap.put(fontProvider, googleProvider);
                        }
                        interfaceC2484tA = Z0.e.a(new Z0.c(googleFont.getFontName(), false, 2, null), (c.a) googleProvider, googleFont.getFontWeight(), H.d(googleFont.getFontStyle()));
                    }
                    arrayList.add(interfaceC2484tA);
                }
            }
            linkedHashMap2.put(key, arrayList != null ? AbstractC2486v.b(arrayList) : null);
        }
        return new FontProvider() { // from class: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.getFontProvider.1
            @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider
            public AbstractC2485u getFont(TypographyType type) {
                AbstractC5504s.h(type, "type");
                return linkedHashMap2.get(type);
            }
        };
    }

    private final void launchExitOfferActivity(Offering exitOffering) {
        PaywallActivityArgs args = getArgs();
        if (args == null) {
            finish();
        } else {
            this.exitOfferLauncher.a(PaywallActivityArgs.copy$default(args, null, new OfferingSelection.IdAndPresentedOfferingContext(exitOffering.getIdentifier(), null), null, false, false, false, null, null, 253, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDismissRequest(Offering exitOffering, PaywallResult result) {
        if (result != null) {
            setResult(-1, createResultIntent(result));
        }
        if (exitOffering != null) {
            launchExitOfferActivity(exitOffering);
        } else {
            finish();
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$compositeListener$1] */
    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Integer nonSerializableArgsKey;
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        SdkConfigurationStateKt.restoreSdkConfigurationIfNeeded(this, savedInstanceState);
        final PaywallActivityArgs args = getArgs();
        boolean z10 = false;
        if (!(args != null ? args.getWasLaunchedThroughSDK() : false) && !Purchases.INSTANCE.isConfigured()) {
            Logger.INSTANCE.e("PaywallActivity was launched incorrectly. Please use PaywallActivityLauncher, or Paywall/PaywallDialog/PaywallFooter composables to display the Paywall.");
            finish();
            return;
        }
        PaywallActivityNonSerializableArgs paywallActivityNonSerializableArgs = (args == null || (nonSerializableArgsKey = args.getNonSerializableArgsKey()) == null) ? null : PaywallActivityNonSerializableArgsStore.INSTANCE.get(nonSerializableArgsKey.intValue());
        if ((args != null ? args.getNonSerializableArgsKey() : null) != null && paywallActivityNonSerializableArgs == null) {
            Logger.INSTANCE.w("PaywallActivity was recreated after process death causing PurchaseLogic and/or PaywallListener to be lost. Finishing activity.");
            setResult(-1, createResultIntent(PaywallResult.Cancelled.INSTANCE));
            finish();
            return;
        }
        final PaywallListener listener = paywallActivityNonSerializableArgs != null ? paywallActivityNonSerializableArgs.getListener() : null;
        PaywallPurchaseLogic purchaseLogic = paywallActivityNonSerializableArgs != null ? paywallActivityNonSerializableArgs.getPurchaseLogic() : null;
        ?? r52 = new PaywallListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity$onCreate$compositeListener$1
            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCancelled();
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseCompleted(customerInfo, storeTransaction);
                }
                PaywallActivity paywallActivity = this;
                paywallActivity.setResult(-1, paywallActivity.createResultIntent(new PaywallResult.Purchased(customerInfo)));
                this.finish();
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseError(error);
                }
                PaywallResult error2 = error.getCode() == PurchasesErrorCode.PurchaseCancelledError ? PaywallResult.Cancelled.INSTANCE : new PaywallResult.Error(error);
                PaywallActivity paywallActivity = this;
                paywallActivity.setResult(-1, paywallActivity.createResultIntent(error2));
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onPurchasePackageInitiated(rcPackage, resume);
                } else {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseStarted(Package rcPackage) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onPurchaseStarted(rcPackage);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreCompleted(CustomerInfo customerInfo) {
                String requiredEntitlementIdentifier;
                AbstractC5504s.h(customerInfo, "customerInfo");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreCompleted(customerInfo);
                }
                PaywallActivity paywallActivity = this;
                paywallActivity.setResult(-1, paywallActivity.createResultIntent(new PaywallResult.Restored(customerInfo)));
                PaywallActivityArgs paywallActivityArgs = args;
                if (paywallActivityArgs == null || (requiredEntitlementIdentifier = paywallActivityArgs.getRequiredEntitlementIdentifier()) == null || !customerInfo.getEntitlements().getActive().containsKey(requiredEntitlementIdentifier)) {
                    return;
                }
                this.finish();
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreError(PurchasesError error) {
                AbstractC5504s.h(error, "error");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreError(error);
                }
                PaywallActivity paywallActivity = this;
                paywallActivity.setResult(-1, paywallActivity.createResultIntent(new PaywallResult.Error(error)));
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreInitiated(Resumable resume) {
                AbstractC5504s.h(resume, "resume");
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreInitiated(resume);
                } else {
                    Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
                }
            }

            @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                PaywallListener paywallListener = listener;
                if (paywallListener != null) {
                    paywallListener.onRestoreStarted();
                }
            }
        };
        if (args != null && args.getEdgeToEdge()) {
            z10 = true;
        }
        if (z10) {
            androidx.activity.s.b(this, null, null, 3, null);
        }
        AbstractC4634b.b(this, null, i.b(2032214180, true, new C41541(args != null ? args.getOfferingIdAndPresentedOfferingContext() : null, this, args, r52, purchaseLogic)), 1, null);
    }

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        SdkConfigurationStateKt.saveSdkConfiguration(outState);
        super.onSaveInstanceState(outState);
    }
}
