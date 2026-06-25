package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Td.L;
import Td.z;
import U.C2175l;
import U.D;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import ie.InterfaceC5082a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6387s0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u000e\u001a\u00020\b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0016\u0010\u001c\u001a\u00020\u0019*\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020 H\u0001¢\u0006\u0004\b$\u0010\"\"\u0018\u0010(\u001a\u00020%*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0018\u0010+\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010-\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*\"\u0018\u00101\u001a\u00020.*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\"\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0018\u00108\u001a\u000205*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;", "", "Lcom/revenuecat/purchases/Package;", "packages", "LU/l;", "currentColorScheme", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "createDefault", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;Ljava/util/List;LU/l;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "packageIdentifiers", "currentColors", "createDefaultForIdentifiers", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "defaultLocalization", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "defaultColors", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;LU/l;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getThemeColors", "(LU/l;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "Ls0/r0;", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "asPaywallColor-8_81llA", "(J)Lcom/revenuecat/purchases/paywalls/PaywallColor;", "asPaywallColor", "Lcom/revenuecat/purchases/Offering;", "getDefaultPreviewOffering", "(LY/m;I)Lcom/revenuecat/purchases/Offering;", "LTd/L;", "DefaultPaywallPreview", "(LY/m;I)V", "DefaultPaywallFooterPreview", "DefaultPaywallFooterCondensedPreview", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "getDefaultTemplate", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "defaultTemplate", "getDefaultAppIconPlaceholder", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)Ljava/lang/String;", "defaultAppIconPlaceholder", "getDefaultBackgroundPlaceholder", "defaultBackgroundPlaceholder", "", "getRevisionID", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)I", "revisionID", "getZeroDecimalPlaceCountries", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)Ljava/util/List;", "zeroDecimalPlaceCountries", "Ljava/net/URL;", "getDefaultTemplateBaseURL", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)Ljava/net/URL;", "defaultTemplateBaseURL", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallDataExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterCondensedPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m852invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m852invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterCondensedPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallDataExtensionsKt.DefaultPaywallFooterCondensedPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44381 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44381 INSTANCE = new C44381();

        C44381() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m853invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m853invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44392 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44392(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallDataExtensionsKt.DefaultPaywallFooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44401 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44401 INSTANCE = new C44401();

        C44401() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m854invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m854invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44412 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44412(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallDataExtensionsKt.DefaultPaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void DefaultPaywallFooterCondensedPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1110154474);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1110154474, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallFooterCondensedPreview (PaywallDataExtensions.kt:168)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(AnonymousClass1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, getDefaultPreviewOffering(interfaceC2425mG, 0), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    public static final void DefaultPaywallFooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1073266441);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1073266441, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallFooterPreview (PaywallDataExtensions.kt:159)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44381.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, getDefaultPreviewOffering(interfaceC2425mG, 0), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44392(i10));
        }
    }

    public static final void DefaultPaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1231396708);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1231396708, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallPreview (PaywallDataExtensions.kt:150)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44401.INSTANCE).build(), new MockViewModel(null, getDefaultPreviewOffering(interfaceC2425mG, 0), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44412(i10));
        }
    }

    /* JADX INFO: renamed from: asPaywallColor-8_81llA */
    private static final PaywallColor m851asPaywallColor8_81llA(long j10) {
        return new PaywallColor(AbstractC6387s0.k(j10));
    }

    public static final PaywallData createDefault(PaywallData.Companion companion, List<Package> packages, C2175l currentColorScheme, ResourceProvider resourceProvider) {
        AbstractC5504s.h(companion, "<this>");
        AbstractC5504s.h(packages, "packages");
        AbstractC5504s.h(currentColorScheme, "currentColorScheme");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        PaywallData.Companion companion2 = PaywallData.INSTANCE;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(packages, 10));
        Iterator<T> it = packages.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).getIdentifier());
        }
        return createDefaultForIdentifiers(companion2, arrayList, currentColorScheme, resourceProvider);
    }

    public static final PaywallData createDefaultForIdentifiers(PaywallData.Companion companion, List<String> packageIdentifiers, C2175l currentColors, ResourceProvider resourceProvider) {
        AbstractC5504s.h(companion, "<this>");
        AbstractC5504s.h(packageIdentifiers, "packageIdentifiers");
        AbstractC5504s.h(currentColors, "currentColors");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        PaywallData.Companion companion2 = PaywallData.INSTANCE;
        return new PaywallData((String) null, getDefaultTemplate(companion2).getId(), new PaywallData.Configuration((List) packageIdentifiers, (String) null, new PaywallData.Configuration.Images((String) null, getDefaultBackgroundPlaceholder(companion2), getDefaultAppIconPlaceholder(companion2), 1, (DefaultConstructorMarker) null), (Map) null, defaultColors(companion2, currentColors), (Map) null, (List) null, true, true, (URL) null, (URL) null, 1642, (DefaultConstructorMarker) null), getDefaultTemplateBaseURL(companion2), getRevisionID(companion2), S.f(z.a(resourceProvider.getLocale().toString(), defaultLocalization(companion2, resourceProvider))), (Map) null, getZeroDecimalPlaceCountries(companion2), (String) null, 321, (DefaultConstructorMarker) null);
    }

    private static final PaywallData.Configuration.ColorInformation defaultColors(PaywallData.Companion companion, C2175l c2175l) {
        PaywallData.Configuration.Colors themeColors = getThemeColors(c2175l);
        return new PaywallData.Configuration.ColorInformation(themeColors, themeColors);
    }

    private static final PaywallData.LocalizedConfiguration defaultLocalization(PaywallData.Companion companion, ResourceProvider resourceProvider) {
        return new PaywallData.LocalizedConfiguration("{{ app_name }}", (String) null, resourceProvider.getString(R.string.continue_cta, new Object[0]), (String) null, (String) null, "{{ total_price_and_per_month }}", resourceProvider.getString(R.string.default_offer_details_with_intro_offer, new Object[0]), (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3738, (DefaultConstructorMarker) null);
    }

    public static final String getDefaultAppIconPlaceholder(PaywallData.Companion companion) {
        AbstractC5504s.h(companion, "<this>");
        return "revenuecatui_default_paywall_app_icon";
    }

    public static final String getDefaultBackgroundPlaceholder(PaywallData.Companion companion) {
        AbstractC5504s.h(companion, "<this>");
        return "revenuecatui_default_paywall_background";
    }

    private static final Offering getDefaultPreviewOffering(InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-363130030);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-363130030, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.getDefaultPreviewOffering (PaywallDataExtensions.kt:127)");
        }
        TestData.Packages packages = TestData.Packages.INSTANCE;
        List listP = AbstractC2279u.p(packages.getWeekly(), packages.getMonthly(), packages.getAnnual());
        Offering offering = new Offering("Template2", "", S.i(), listP, createDefault(PaywallData.INSTANCE, listP, D.f17597a.a(interfaceC2425m, D.f17598b), new MockResourceProvider(null, null, null, null, null, 31, null)), null, null, 96, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return offering;
    }

    public static final PaywallTemplate getDefaultTemplate(PaywallData.Companion companion) {
        AbstractC5504s.h(companion, "<this>");
        return PaywallTemplate.TEMPLATE_2;
    }

    private static final URL getDefaultTemplateBaseURL(PaywallData.Companion companion) {
        return new URL("https://");
    }

    private static final int getRevisionID(PaywallData.Companion companion) {
        return -1;
    }

    private static final PaywallData.Configuration.Colors getThemeColors(C2175l c2175l) {
        return new PaywallData.Configuration.Colors(m851asPaywallColor8_81llA(c2175l.c()), m851asPaywallColor8_81llA(c2175l.o()), (PaywallColor) null, (PaywallColor) null, m851asPaywallColor8_81llA(c2175l.F()), m851asPaywallColor8_81llA(c2175l.c()), (PaywallColor) null, m851asPaywallColor8_81llA(c2175l.C()), m851asPaywallColor8_81llA(c2175l.n()), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32332, (DefaultConstructorMarker) null);
    }

    private static final List<String> getZeroDecimalPlaceCountries(PaywallData.Companion companion) {
        return AbstractC2279u.m();
    }
}
