package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.A;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.G;
import C.I;
import C.InterfaceC1138i;
import C.J;
import C.K;
import Df.r;
import I0.B;
import I0.InterfaceC1680f;
import J.i;
import K0.InterfaceC1788g;
import R0.C;
import Td.L;
import U.AbstractC2174k;
import U.C2171h;
import U.C2172i;
import U.D;
import U.j0;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import Y.m2;
import Y0.L;
import android.net.Uri;
import androidx.compose.animation.a;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcherKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import g0.InterfaceC4820b;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import ie.p;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import p0.AbstractC5906a;
import p0.AbstractC5912g;
import s0.C6385r0;
import v.AbstractC6783d;
import v.InterfaceC6781b;
import x.AbstractC7010h;
import x.C7009g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aU\u0010\u0010\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0012\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%\u001a?\u0010(\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b.\u0010/\u001a+\u00101\u001a\u00020\u0004*\u0002002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020&2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b1\u00102\u001a\u000f\u00103\u001a\u00020\u0004H\u0003¢\u0006\u0004\b3\u00104\u001a\u000f\u00105\u001a\u00020\u0004H\u0003¢\u0006\u0004\b5\u00104\u001a\u000f\u00106\u001a\u00020\u0004H\u0003¢\u0006\u0004\b6\u00104\"\u0018\u0010:\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0018\u0010<\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00109\"\u0018\u0010>\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u00109\"\u0018\u0010@\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u00109\"\u0018\u0010B\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u00109\"\u0018\u0010D\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u00109\"\u0018\u0010F\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00109\"\u0018\u0010H\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00109\"\u0018\u0010J\u001a\u000207*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u00109¨\u0006L²\u0006\u000e\u0010K\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "LTd/L;", "Template7", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "LC/i;", "", "packageSelectionVisible", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;", "tiers", "selectedTier", "Lkotlin/Function1;", "onSelectTierChange", "Template7PortraitContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;ZLjava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;Lkotlin/jvm/functions/Function1;LY/m;I)V", "Template7LandscapeContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;Lkotlin/jvm/functions/Function1;LY/m;I)V", "Landroid/net/Uri;", "uri", "HeaderImage", "(Landroid/net/Uri;LY/m;I)V", "Title", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;LY/m;I)V", "tier", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;", "selectedLocalizationForTier", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;", "Features", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;LY/m;I)V", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "feature", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "Feature", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packages", "AnimatedPackages", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;ZLjava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;II)V", "packageInfo", "SelectPackageButton", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "isSelected", "CheckmarkBox", "(ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "LC/I;", "DiscountBanner", "(LC/I;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "Template7PaywallPreview", "(LY/m;I)V", "Template7PaywallFooterPreview", "Template7PaywallFooterCondensedPreview", "Ls0/r0;", "getTierSwitcherBackground", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;)J", "tierSwitcherBackground", "getTierSwitcherBackgroundSelected", "tierSwitcherBackgroundSelected", "getTierSwitcherForeground", "tierSwitcherForeground", "getTierSwitcherForegroundSelected", "tierSwitcherForegroundSelected", "getFeatureIcon", "featureIcon", "getSelectedOutline", "selectedOutline", "getUnselectedOutline", "unselectedOutline", "getSelectedDiscountText", "selectedDiscountText", "getUnselectedDiscountText", "unselectedDiscountText", "packageSelectorVisible", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template7Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$AnimatedPackages$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.Colors colors, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$packages = list;
            this.$colors = colors;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.AnimatedPackages(this.$state, this.$viewModel, this.$packageSelectionVisible, this.$packages, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$CheckmarkBox$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45022 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45022(boolean z10, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$isSelected = z10;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.CheckmarkBox(this.$isSelected, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$DiscountBanner$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ I $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i11) {
            super(2);
            this.$this_DiscountBanner = i10;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$DiscountBanner$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ I $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i11) {
            super(2);
            this.$this_DiscountBanner = i10;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Feature$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45031 extends AbstractC5506u implements Function1 {
        public static final C45031 INSTANCE = new C45031();

        C45031() {
            super(1);
        }

        public final void invoke(C semantics) {
            AbstractC5504s.h(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Feature$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45043 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.LocalizedConfiguration.Feature $feature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45043(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$feature = feature;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Feature(this.$feature, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Features$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/b;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;", "it", "LTd/L;", "invoke", "(Lv/b;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45051 extends AbstractC5506u implements p {
        final /* synthetic */ TemplateConfiguration.Colors $colorForTier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45051(TemplateConfiguration.Colors colors) {
            super(4);
            this.$colorForTier = colors;
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((InterfaceC6781b) obj, (ProcessedLocalizedConfiguration) obj2, (InterfaceC2425m) obj3, ((Number) obj4).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC6781b AnimatedContent, ProcessedLocalizedConfiguration it, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(AnimatedContent, "$this$AnimatedContent");
            AbstractC5504s.h(it, "it");
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1011395967, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features.<anonymous> (Template7.kt:373)");
            }
            e.a aVar = e.f52304a;
            e.b bVarG = aVar.g();
            C1131b.m mVarQ = C1131b.f2093a.q(UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
            TemplateConfiguration.Colors colors = this.$colorForTier;
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            B bA = AbstractC1136g.a(mVarQ, bVarG, interfaceC2425m, 48);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            Y.I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425m, aVar2);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
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
            m2.e(interfaceC2425mB, bA, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            interfaceC2425m.V(965626904);
            Iterator<T> it2 = it.getFeatures().iterator();
            while (it2.hasNext()) {
                Template7Kt.Feature((PaywallData.LocalizedConfiguration.Feature) it2.next(), colors, interfaceC2425m, 0);
            }
            interfaceC2425m.O();
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Features$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45062 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45062(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, int i10) {
            super(2);
            this.$state = legacy;
            this.$selectedTier = tierInfo;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Features(this.$state, this.$selectedTier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$HeaderImage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45072 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45072(Uri uri, int i10) {
            super(2);
            this.$uri = uri;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.HeaderImage(this.$uri, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$SelectPackageButton$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45083 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45083(TemplateConfiguration.PackageInfo packageInfo, long j10, boolean z10, TemplateConfiguration.Colors colors, PaywallState.Loaded.Legacy legacy) {
            super(3);
            this.$packageInfo = packageInfo;
            this.$textColor = j10;
            this.$isSelected = z10;
            this.$colors = colors;
            this.$state = legacy;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(I Button, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(Button, "$this$Button");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-731847976, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template7.kt:527)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarH = s.h(aVar, 0.0f, 1, null);
            C1131b c1131b = C1131b.f2093a;
            C1131b.f fVarO = c1131b.o(C5015h.n(4));
            e.a aVar2 = l0.e.f52304a;
            e.b bVarK = aVar2.k();
            TemplateConfiguration.PackageInfo packageInfo = this.$packageInfo;
            long j10 = this.$textColor;
            boolean z10 = this.$isSelected;
            TemplateConfiguration.Colors colors = this.$colors;
            PaywallState.Loaded.Legacy legacy = this.$state;
            B bA = AbstractC1136g.a(fVarO, bVarK, interfaceC2425m, 54);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            Y.I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425m, eVarH);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
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
            m2.e(interfaceC2425mB, bA, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            B b10 = G.b(c1131b.o(C5015h.n(6)), aVar2.i(), interfaceC2425m, 54);
            int iA2 = AbstractC2410h.a(interfaceC2425m, 0);
            Y.I iR2 = interfaceC2425m.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425m, aVar);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA2);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB2, b10, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            J j11 = J.f2025a;
            Template7Kt.CheckmarkBox(z10, colors, interfaceC2425m, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            Y0 y0B = d10.c(interfaceC2425m, i11).b();
            j0.b(offerName, j11.a(aVar, 1.0f, true), j10, 0L, null, Y0.L.f22613b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, y0B, interfaceC2425m, 196608, 0, 65496);
            Template7Kt.DiscountBanner(j11, legacy, packageInfo, colors, interfaceC2425m, 6);
            interfaceC2425m.x();
            IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(packageInfo), j10, d10.c(interfaceC2425m, i11).c(), null, null, false, null, interfaceC2425m, 100663296, 704);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$SelectPackageButton$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$this_SelectPackageButton = interfaceC1138i;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45093 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45093(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Template7(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7LandscapeContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45102 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function1 $onSelectTierChange;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template7LandscapeContent;
        final /* synthetic */ List<TemplateConfiguration.TierInfo> $tiers;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45102(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, Function1 function1, int i10) {
            super(2);
            this.$this_Template7LandscapeContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$tiers = list;
            this.$selectedTier = tierInfo;
            this.$onSelectTierChange = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Template7LandscapeContent(this.$this_Template7LandscapeContent, this.$state, this.$viewModel, this.$tiers, this.$selectedTier, this.$onSelectTierChange, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45111 extends AbstractC5506u implements InterfaceC5082a {
        public static final C45111 INSTANCE = new C45111();

        C45111() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m917invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m917invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45122 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45122(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Template7PaywallFooterCondensedPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45131 extends AbstractC5506u implements InterfaceC5082a {
        public static final C45131 INSTANCE = new C45131();

        C45131() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m918invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m918invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45142 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45142(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Template7PaywallFooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45151 extends AbstractC5506u implements InterfaceC5082a {
        public static final C45151 INSTANCE = new C45151();

        C45151() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m919invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m919invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45162 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45162(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Template7PaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PortraitContent$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45173 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function1 $onSelectTierChange;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template7PortraitContent;
        final /* synthetic */ List<TemplateConfiguration.TierInfo> $tiers;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45173(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, Function1 function1, int i10) {
            super(2);
            this.$this_Template7PortraitContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$tiers = list;
            this.$selectedTier = tierInfo;
            this.$onSelectTierChange = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Template7PortraitContent(this.$this_Template7PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$tiers, this.$selectedTier, this.$onSelectTierChange, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Title$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45181 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45181(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, int i10) {
            super(2);
            this.$this_Title = interfaceC1138i;
            this.$state = legacy;
            this.$selectedTier = tierInfo;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template7Kt.Title(this.$this_Title, this.$state, this.$selectedTier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r25, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r26, boolean r27, java.util.List<com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo> r28, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r29, Y.InterfaceC2425m r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt.AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, boolean, java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkBox(boolean z10, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1250968455);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(colors) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1250968455, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template7.kt:564)");
            }
            androidx.compose.ui.e eVarD = b.d(AbstractC5912g.a(s.r(androidx.compose.ui.e.f26613a, Template7UIConstants.INSTANCE.m920getCheckmarkSizeD9Ej5fM()), i.g()), z10 ? colors.m781getBackground0d7_KjU() : getUnselectedOutline(colors), null, 2, null);
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            interfaceC2425mG.V(1030293438);
            if (z10) {
                PaywallIconKt.m607PaywallIconFNF3uiM(PaywallIconName.CHECK_CIRCLE, null, getSelectedOutline(colors), interfaceC2425mG, 6, 2);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45022(z10, colors, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscountBanner(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        PaywallState.Loaded.Legacy legacy2;
        TemplateConfiguration.PackageInfo packageInfo2;
        TemplateConfiguration.Colors colors2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(148348005);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.U(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            legacy2 = legacy;
            i12 |= interfaceC2425mG.U(legacy2) ? 32 : 16;
        } else {
            legacy2 = legacy;
        }
        if ((i11 & 384) == 0) {
            packageInfo2 = packageInfo;
            i12 |= interfaceC2425mG.U(packageInfo2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        } else {
            packageInfo2 = packageInfo;
        }
        if ((i11 & 3072) == 0) {
            colors2 = colors;
            i12 |= interfaceC2425mG.U(colors2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            colors2 = colors;
        }
        if ((i12 & 1171) != 1170 || !interfaceC2425mG.i()) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(148348005, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountBanner (Template7.kt:585)");
            }
            String offerBadge = packageInfo2.getLocalization().getOfferBadge();
            if (offerBadge != null) {
                String upperCase = offerBadge.toUpperCase(Locale.ROOT);
                AbstractC5504s.g(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    if (r.l0(upperCase)) {
                        if (AbstractC2454w.L()) {
                            AbstractC2454w.T();
                        }
                        B1 b1K = interfaceC2425mG.k();
                        if (b1K != null) {
                            b1K.a(new AnonymousClass1(i10, legacy2, packageInfo2, colors2, i11));
                            return;
                        }
                        return;
                    }
                    int i13 = (i12 >> 3) & 126;
                    long jM849packageButtonColorAnimation9z6LAg8 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedOutline(colors), getUnselectedOutline(colors), interfaceC2425mG, i13);
                    long jM849packageButtonColorAnimation9z6LAg82 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedDiscountText(colors), getUnselectedDiscountText(colors), interfaceC2425mG, i13);
                    e.a aVar = androidx.compose.ui.e.f26613a;
                    e.a aVar2 = l0.e.f52304a;
                    androidx.compose.ui.e eVarC = i10.c(aVar, aVar2.l());
                    UIConstant uIConstant = UIConstant.INSTANCE;
                    float fM386getDefaultHorizontalPaddingD9Ej5fM = uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM();
                    Template7UIConstants template7UIConstants = Template7UIConstants.INSTANCE;
                    androidx.compose.ui.e eVarA = n.a(eVarC, C5015h.n(fM386getDefaultHorizontalPaddingD9Ej5fM - template7UIConstants.m921getDiscountPaddingD9Ej5fM()), C5015h.n(C5015h.n(-uIConstant.m389getDefaultVerticalSpacingD9Ej5fM()) + template7UIConstants.m921getDiscountPaddingD9Ej5fM()));
                    B bH = f.h(aVar2.o(), false);
                    int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                    Y.I iR = interfaceC2425mG.r();
                    androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarA);
                    InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
                    InterfaceC5082a interfaceC5082aA = aVar3.a();
                    if (interfaceC2425mG.j() == null) {
                        AbstractC2410h.d();
                    }
                    interfaceC2425mG.I();
                    if (interfaceC2425mG.e()) {
                        interfaceC2425mG.h(interfaceC5082aA);
                    } else {
                        interfaceC2425mG.s();
                    }
                    InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
                    m2.e(interfaceC2425mB, bH, aVar3.e());
                    m2.e(interfaceC2425mB, iR, aVar3.g());
                    Function2 function2B = aVar3.b();
                    if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                        interfaceC2425mB.u(Integer.valueOf(iA));
                        interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                    }
                    m2.e(interfaceC2425mB, eVarF, aVar3.f());
                    h hVar = h.f26161a;
                    androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.p.k(b.c(aVar, jM849packageButtonColorAnimation9z6LAg8, C2172i.f18372a.k(interfaceC2425mG, C2172i.f18386o)), 0.0f, C5015h.n(4), 1, null), C5015h.n(8), 0.0f, 2, null);
                    B bH2 = f.h(aVar2.o(), false);
                    int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
                    Y.I iR2 = interfaceC2425mG.r();
                    androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarK);
                    InterfaceC5082a interfaceC5082aA2 = aVar3.a();
                    if (interfaceC2425mG.j() == null) {
                        AbstractC2410h.d();
                    }
                    interfaceC2425mG.I();
                    if (interfaceC2425mG.e()) {
                        interfaceC2425mG.h(interfaceC5082aA2);
                    } else {
                        interfaceC2425mG.s();
                    }
                    InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
                    m2.e(interfaceC2425mB2, bH2, aVar3.e());
                    m2.e(interfaceC2425mB2, iR2, aVar3.g());
                    Function2 function2B2 = aVar3.b();
                    if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                        interfaceC2425mB2.u(Integer.valueOf(iA2));
                        interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
                    }
                    m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
                    j0.b(upperCase, null, jM849packageButtonColorAnimation9z6LAg82, 0L, null, Y0.L.f22613b.g(), null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425mG, D.f17598b).m(), interfaceC2425mG, 196608, 0, 65498);
                    interfaceC2425mG = interfaceC2425mG;
                    interfaceC2425mG.x();
                    interfaceC2425mG.x();
                    if (AbstractC2454w.L()) {
                        AbstractC2454w.T();
                    }
                }
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            B1 b1K2 = interfaceC2425mG.k();
            if (b1K2 != null) {
                b1K2.a(new Template7Kt$DiscountBanner$text$1(i10, legacy, packageInfo, colors, i11));
                return;
            }
            return;
        }
        interfaceC2425mG.K();
        B1 b1K3 = interfaceC2425mG.k();
        if (b1K3 != null) {
            b1K3.a(new AnonymousClass3(i10, legacy, packageInfo, colors, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-840416555);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(feature) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(colors) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-840416555, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template7.kt:394)");
            }
            e.a aVar = l0.e.f52304a;
            e.c cVarI = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarE = R0.r.e(s.h(aVar2, 0.0f, 1, null), true, C45031.INSTANCE);
            C1131b c1131b = C1131b.f2093a;
            B b10 = G.b(c1131b.g(), cVarI, interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarE);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, b10, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            J j10 = J.f2025a;
            androidx.compose.ui.e eVarR = s.r(aVar2, Template7UIConstants.INSTANCE.m922getFeatureIconSizeD9Ej5fM());
            B bH = f.h(aVar.o(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarR);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA2);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB2, bH, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            h hVar = h.f26161a;
            String iconID = feature.getIconID();
            PaywallIconName paywallIconNameFromValue = iconID != null ? PaywallIconName.INSTANCE.fromValue(iconID) : null;
            interfaceC2425mG.V(-928908279);
            if (paywallIconNameFromValue != null) {
                PaywallIconKt.m607PaywallIconFNF3uiM(paywallIconNameFromValue, null, getFeatureIcon(colors), interfaceC2425mG, 0, 2);
                L l10 = L.f17438a;
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.p.m(aVar2, UIConstant.INSTANCE.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            B bA = AbstractC1136g.a(c1131b.h(), aVar.k(), interfaceC2425mG, 0);
            int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR3 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarM);
            InterfaceC5082a interfaceC5082aA3 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA3);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB3, bA, aVar3.e());
            m2.e(interfaceC2425mB3, iR3, aVar3.g());
            Function2 function2B3 = aVar3.b();
            if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                interfaceC2425mB3.u(Integer.valueOf(iA3));
                interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
            }
            m2.e(interfaceC2425mB3, eVarF3, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            D d10 = D.f17597a;
            int i12 = D.f17598b;
            Y0 y0B = d10.c(interfaceC2425mG, i12).b();
            L.a aVar4 = Y0.L.f22613b;
            Y0.L lG = aVar4.g();
            C4830j.a aVar5 = C4830j.f47278b;
            MarkdownKt.m594MarkdownDkhmgE0(feature.getTitle(), null, colors.m786getText10d7_KjU(), y0B, 0L, lG, null, null, C4830j.h(aVar5.f()), false, true, false, interfaceC2425mG, 196608, 54, 722);
            String content = feature.getContent();
            interfaceC2425mG.V(-928885417);
            if (content == null) {
                interfaceC2425m2 = interfaceC2425mG;
            } else {
                interfaceC2425m2 = interfaceC2425mG;
                MarkdownKt.m594MarkdownDkhmgE0(content, null, colors.m787getText20d7_KjU(), d10.c(interfaceC2425mG, i12).c(), 0L, aVar4.g(), null, null, C4830j.h(aVar5.f()), false, true, false, interfaceC2425m2, 196608, 54, 722);
                Td.L l11 = Td.L.f17438a;
            }
            interfaceC2425m2.O();
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C45043(feature, colors, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Features(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(571837189);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(tierInfo) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(571837189, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template7.kt:364)");
            }
            a.a(selectedLocalizationForTier(tierInfo), null, null, null, "features portrait", null, g0.i.d(-1011395967, true, new C45051(legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, interfaceC2425mG, (i11 >> 3) & 14)), interfaceC2425mG, 54), interfaceC2425mG, 1597440, 46);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45062(legacy, tierInfo, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderImage(Uri uri, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(108999699);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(uri) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(108999699, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template7.kt:324)");
            }
            if (uri != null) {
                String string = uri.toString();
                AbstractC5504s.g(string, "uri.toString()");
                RemoteImageKt.RemoteImage(string, androidx.compose.foundation.layout.c.b(androidx.compose.ui.e.f26613a, 2.0f, false, 2, null), null, InterfaceC1680f.f8703a.a(), null, null, 0.0f, null, interfaceC2425mG, 3120, 244);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45072(uri, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButton(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallState.Loaded.Legacy legacy2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-235261752);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            legacy2 = legacy;
            i11 |= interfaceC2425mG.U(legacy2) ? 32 : 16;
        } else {
            legacy2 = legacy;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(packageInfo) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(colors) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-235261752, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template7.kt:496)");
            }
            boolean zC = AbstractC5504s.c(packageInfo, legacy2.getSelectedPackage().getValue());
            float fPackageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, interfaceC2425mG, (i12 >> 9) & 14);
            long jM786getText10d7_KjU = colors.m786getText10d7_KjU();
            long jM849packageButtonColorAnimation9z6LAg8 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedOutline(colors), getUnselectedOutline(colors), interfaceC2425mG, (i12 >> 3) & 126);
            androidx.compose.ui.e eVarB = interfaceC1138i.b(AbstractC5906a.a(s.h(androidx.compose.ui.e.f26613a, 0.0f, 1, null), fPackageButtonActionInProgressOpacityAnimation), l0.e.f52304a.k());
            interfaceC2425mG.V(1056049171);
            boolean zA = interfaceC2425mG.a(zC);
            Object objD = interfaceC2425mG.D();
            if (zA || objD == InterfaceC2425m.f22370a.a()) {
                objD = new Template7Kt$SelectPackageButton$1$1(zC);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarF = R0.r.f(eVarB, false, (Function1) objD, 1, null);
            C2171h c2171hB = C2172i.f18372a.b(C6385r0.f58985b.i(), jM786getText10d7_KjU, 0L, 0L, interfaceC2425mG, (C2172i.f18386o << 12) | 6, 12);
            UIConstant uIConstant = UIConstant.INSTANCE;
            J.h hVarD = i.d(uIConstant.m388getDefaultPackageCornerRadiusD9Ej5fM());
            A aB = androidx.compose.foundation.layout.p.b(uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            C7009g c7009gA = AbstractC7010h.a(uIConstant.m387getDefaultPackageBorderWidthD9Ej5fM(), jM849packageButtonColorAnimation9z6LAg8);
            interfaceC2425mG.V(1056051494);
            boolean z10 = ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object objD2 = interfaceC2425mG.D();
            if (z10 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new Template7Kt$SelectPackageButton$2$1(paywallViewModel, packageInfo);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            InterfaceC4820b interfaceC4820bD = g0.i.d(-731847976, true, new C45083(packageInfo, jM786getText10d7_KjU, zC, colors, legacy), interfaceC2425mG, 54);
            interfaceC2425mG = interfaceC2425mG;
            AbstractC2174k.a((InterfaceC5082a) objD2, eVarF, false, hVarD, c2171hB, null, c7009gA, aB, null, interfaceC4820bD, interfaceC2425mG, 805306368, 292);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(interfaceC1138i, legacy, packageInfo, paywallViewModel, colors, i10));
        }
    }

    public static final void Template7(PaywallState.Loaded.Legacy state, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallState.Loaded.Legacy legacy;
        PaywallViewModel viewModel = paywallViewModel;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(viewModel, "viewModel");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-305592021);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(viewModel) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            legacy = state;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-305592021, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7 (Template7.kt:95)");
            }
            TemplateConfiguration.PackageConfiguration packages = state.getTemplateConfiguration().getPackages();
            if (!(packages instanceof TemplateConfiguration.PackageConfiguration.MultiTier)) {
                throw new IllegalArgumentException("The configuration is not MultiTier");
            }
            TemplateConfiguration.PackageConfiguration.MultiTier multiTier = (TemplateConfiguration.PackageConfiguration.MultiTier) packages;
            TemplateConfiguration.TierInfo defaultTier = multiTier.getDefaultTier();
            List<TemplateConfiguration.TierInfo> allTiers = multiTier.getAllTiers();
            interfaceC2425mG.V(-1567782808);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = b2.e(Boolean.valueOf(state.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), null, 2, null);
                interfaceC2425mG.u(objD);
            }
            C0 c02 = (C0) objD;
            interfaceC2425mG.O();
            interfaceC2425mG.V(-1567778671);
            Object objD2 = interfaceC2425mG.D();
            if (objD2 == aVar.a()) {
                objD2 = b2.e(defaultTier, null, 2, null);
                interfaceC2425mG.u(objD2);
            }
            C0 c03 = (C0) objD2;
            interfaceC2425mG.O();
            TemplateConfiguration.Colors currentColorsForTier = state.getTemplateConfiguration().getCurrentColorsForTier(Template7$lambda$5(c03), interfaceC2425mG, 0);
            androidx.compose.ui.e eVarD = b.d(androidx.compose.ui.e.f26613a, currentColorsForTier.m781getBackground0d7_KjU(), null, 2, null);
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            int i13 = i12 & 14;
            if (WindowHelperKt.shouldUseLandscapeLayout(state, interfaceC2425mG, i13)) {
                interfaceC2425mG.V(513322183);
                TemplateConfiguration.TierInfo tierInfoTemplate7$lambda$5 = Template7$lambda$5(c03);
                interfaceC2425mG.V(-1091814896);
                boolean z10 = i13 == 4;
                Object objD3 = interfaceC2425mG.D();
                if (z10 || objD3 == aVar.a()) {
                    objD3 = new Template7Kt$Template7$2$1$1(state, c03);
                    interfaceC2425mG.u(objD3);
                }
                interfaceC2425mG.O();
                int i14 = i12 << 3;
                Template7LandscapeContent(c1139j, state, viewModel, allTiers, tierInfoTemplate7$lambda$5, (Function1) objD3, interfaceC2425mG, (i14 & 896) | 6 | (i14 & 112));
                interfaceC2425mG = interfaceC2425mG;
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(513612064);
                boolean zTemplate7$lambda$2 = Template7$lambda$2(c02);
                TemplateConfiguration.TierInfo tierInfoTemplate7$lambda$52 = Template7$lambda$5(c03);
                interfaceC2425mG.V(-1091804336);
                boolean z11 = i13 == 4;
                Object objD4 = interfaceC2425mG.D();
                if (z11 || objD4 == aVar.a()) {
                    objD4 = new Template7Kt$Template7$2$2$1(state, c03);
                    interfaceC2425mG.u(objD4);
                }
                interfaceC2425mG.O();
                int i15 = i12 << 3;
                Template7PortraitContent(c1139j, state, paywallViewModel, zTemplate7$lambda$2, allTiers, tierInfoTemplate7$lambda$52, (Function1) objD4, interfaceC2425mG, 6 | (i15 & 112) | (i15 & 896));
                interfaceC2425mG = interfaceC2425mG;
                interfaceC2425mG.O();
            }
            int i16 = i12 & 112;
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(state, paywallViewModel, null, 0.0f, currentColorsForTier, interfaceC2425mG, i12 & 126, 12);
            legacy = state;
            TemplateConfiguration templateConfiguration = legacy.getTemplateConfiguration();
            interfaceC2425mG.V(-1091792526);
            Object objD5 = interfaceC2425mG.D();
            if (objD5 == aVar.a()) {
                objD5 = new Template7Kt$Template7$2$3$1(c02);
                interfaceC2425mG.u(objD5);
            }
            interfaceC2425mG.O();
            FooterKt.Footer(templateConfiguration, paywallViewModel, null, currentColorsForTier, (InterfaceC5082a) objD5, interfaceC2425mG, i16 | 24576, 4);
            viewModel = paywallViewModel;
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45093(legacy, viewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template7$lambda$2(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7$lambda$3(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemplateConfiguration.TierInfo Template7$lambda$5(C0 c02) {
        return (TemplateConfiguration.TierInfo) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7LandscapeContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2027062712);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.F(list) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(tierInfo) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2027062712, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7LandscapeContent (Template7.kt:248)");
            }
            o oVarC = m.c(0, interfaceC2425mG, 0, 1);
            o oVarC2 = m.c(0, interfaceC2425mG, 0, 1);
            TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, interfaceC2425mG, (i11 >> 12) & 14);
            C1131b.e eVarC = C1131b.a.f2102a.c();
            e.a aVar = l0.e.f52304a;
            e.c cVarI = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarC2 = InterfaceC1138i.c(interfaceC1138i, aVar2, 1.0f, false, 2, null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.p.m(eVarC2, 0.0f, uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            B b10 = G.b(eVarC, cVarI, interfaceC2425mG, 54);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarK);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, b10, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            J j10 = J.f2025a;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.p.j(I.b(j10, m.f(aVar2, oVarC, false, null, false, 14, null), 1.0f, false, 2, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            e.b bVarG = aVar.g();
            C1131b c1131b = C1131b.f2093a;
            B bA = AbstractC1136g.a(c1131b.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.i()), bVarG, interfaceC2425mG, 48);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarJ);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA2);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
            int i13 = i11;
            m2.e(interfaceC2425mB2, bA, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            Title(c1139j, legacy, tierInfo, interfaceC2425mG, (i13 & 112) | 6 | ((i13 >> 6) & 896));
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            int i14 = i13 >> 3;
            int i15 = i13 >> 9;
            Features(legacy, tierInfo, interfaceC2425mG, (i14 & 14) | (i15 & 112));
            interfaceC2425mG.x();
            androidx.compose.ui.e eVarJ2 = androidx.compose.foundation.layout.p.j(I.b(j10, m.f(aVar2, oVarC2, false, null, false, 14, null), 1.0f, false, 2, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            B bA2 = AbstractC1136g.a(c1131b.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.i()), aVar.g(), interfaceC2425mG, 48);
            int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR3 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarJ2);
            InterfaceC5082a interfaceC5082aA3 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA3);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB3, bA2, aVar3.e());
            m2.e(interfaceC2425mB3, iR3, aVar3.g());
            Function2 function2B3 = aVar3.b();
            if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                interfaceC2425mB3.u(Integer.valueOf(iA3));
                interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
            }
            m2.e(interfaceC2425mB3, eVarF3, aVar3.f());
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            interfaceC2425mG.V(392910811);
            if (list.size() > 1) {
                interfaceC2425mG.V(392915745);
                boolean z10 = (i13 & 458752) == 131072;
                Object objD = interfaceC2425mG.D();
                if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new Template7Kt$Template7LandscapeContent$1$2$1$1(function1);
                    interfaceC2425mG.u(objD);
                }
                interfaceC2425mG.O();
                i12 = 0;
                TierSwitcherKt.m634TierSwitcherUFBoNtE(list, tierInfo, (Function1) objD, getTierSwitcherBackground(currentColorsForTier), getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForeground(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), interfaceC2425mG, i15 & 126);
                K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            } else {
                i12 = 0;
            }
            interfaceC2425mG.O();
            AnimatedPackages(legacy, paywallViewModel, false, tierInfo.getPackages(), currentColorsForTier, interfaceC2425mG, i14 & 126, 4);
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, i12);
            interfaceC2425mG.x();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45102(interfaceC1138i, legacy, paywallViewModel, list, tierInfo, function1, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PaywallFooterCondensedPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(957146168);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(957146168, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallFooterCondensedPreview (Template7.kt:687)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C45111.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate7Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45122(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PaywallFooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-323823251);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-323823251, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallFooterPreview (Template7.kt:676)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C45131.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate7Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45142(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(292324402);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(292324402, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallPreview (Template7.kt:665)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C45151.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate7Offering(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45162(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PortraitContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        List<TemplateConfiguration.TierInfo> list2;
        int i12;
        C1139j c1139j;
        TemplateConfiguration.TierInfo tierInfo2;
        int i13;
        int i14;
        e.a aVar;
        int i15;
        Object obj;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1979964246);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            list2 = list;
            i11 |= interfaceC2425mG.F(list2) ? 16384 : 8192;
        } else {
            list2 = list;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC2425mG.U(tierInfo) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            tierInfo2 = tierInfo;
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1979964246, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PortraitContent (Template7.kt:161)");
            }
            TemplateConfiguration.Images images = legacy.getTemplateConfiguration().getImagesByTier().get(tierInfo.getId());
            Uri headerUri = images != null ? images.getHeaderUri() : null;
            interfaceC2425mG.V(-1182000584);
            if (PaywallStateKt.isInFullScreenMode(legacy) && headerUri != null) {
                HeaderImage(headerUri, interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            int i16 = (i11 >> 15) & 14;
            TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, interfaceC2425mG, i16);
            o oVarC = m.c(0, interfaceC2425mG, 0, 1);
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            boolean zIsInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
            interfaceC2425mG.V(-1181990216);
            int i17 = i11 & 14;
            boolean zU = (i17 == 4) | interfaceC2425mG.U(oVarC);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new Template7Kt$Template7PortraitContent$1$1(interfaceC1138i, oVarC);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarConditional = ModifierExtensionsKt.conditional(aVar2, zIsInFullScreenMode, (Function1) objD);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.p.j(eVarConditional, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            e.a aVar3 = l0.e.f52304a;
            B bA = AbstractC1136g.a(C1131b.f2093a.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar3.i()), aVar3.g(), interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarJ);
            InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
            Uri uri = headerUri;
            InterfaceC5082a interfaceC5082aA = aVar4.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            int i18 = i11;
            m2.e(interfaceC2425mB, bA, aVar4.e());
            m2.e(interfaceC2425mB, iR, aVar4.g());
            Function2 function2B = aVar4.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar4.f());
            C1139j c1139j2 = C1139j.f2142a;
            interfaceC2425mG.V(-1539492651);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                interfaceC2425mG.V(-1539491336);
                if (uri == null) {
                    interfaceC2425mG.V(-1539490146);
                    i12 = 0;
                    if (!legacy.getShouldDisplayDismissButton()) {
                        InsetSpacersKt.StatusBarSpacer(interfaceC2425mG, 0);
                    }
                    interfaceC2425mG.O();
                    K.a(s.i(aVar2, uIConstant.m390getIconButtonSizeD9Ej5fM()), interfaceC2425mG, 0);
                } else {
                    i12 = 0;
                }
                interfaceC2425mG.O();
                Title(c1139j2, legacy, tierInfo, interfaceC2425mG, 6 | (i18 & 112) | ((i18 >> 9) & 896));
            } else {
                i12 = 0;
            }
            interfaceC2425mG.O();
            interfaceC2425mG.V(-1539481725);
            if (list2.size() <= 1) {
                c1139j = c1139j2;
                tierInfo2 = tierInfo;
                i13 = i12;
                i14 = i17;
                aVar = aVar2;
                i15 = i18;
                obj = null;
                interfaceC2425m2 = interfaceC2425mG;
            } else if (z10) {
                interfaceC2425mG.V(-479242408);
                interfaceC2425mG.V(-1539475708);
                int i19 = (i18 & 3670016) != 1048576 ? i12 : 1;
                Object objD2 = interfaceC2425mG.D();
                if (i19 != 0 || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new Template7Kt$Template7PortraitContent$2$1$1(function1);
                    interfaceC2425mG.u(objD2);
                }
                interfaceC2425mG.O();
                aVar = aVar2;
                interfaceC2425m2 = interfaceC2425mG;
                i14 = i17;
                i15 = i18;
                obj = null;
                c1139j = c1139j2;
                i13 = i12;
                TierSwitcherKt.m634TierSwitcherUFBoNtE(list, tierInfo, (Function1) objD2, getTierSwitcherBackground(currentColorsForTier), getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForeground(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), interfaceC2425m2, (i18 >> 12) & 126);
                interfaceC2425m2.O();
                tierInfo2 = tierInfo;
            } else {
                c1139j = c1139j2;
                i13 = i12;
                i14 = i17;
                aVar = aVar2;
                i15 = i18;
                obj = null;
                interfaceC2425m2 = interfaceC2425mG;
                interfaceC2425m2.V(-478662150);
                TierSwitcherKt.m633SelectedTierView1wkBAMs(tierInfo, getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), interfaceC2425m2, i16);
                tierInfo2 = tierInfo;
                interfaceC2425m2.O();
            }
            interfaceC2425m2.O();
            interfaceC2425m2.V(-1539451407);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                Features(legacy, tierInfo2, interfaceC2425m2, ((i15 >> 3) & 14) | ((i15 >> 12) & 112));
            }
            interfaceC2425m2.O();
            Object obj2 = obj;
            AnimatedPackages(legacy, paywallViewModel, z10, tierInfo2.getPackages(), currentColorsForTier, interfaceC2425m2, (i15 >> 3) & 1022, 0);
            interfaceC2425m2.V(-1539440657);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425m2, i13);
            }
            interfaceC2425m2.O();
            interfaceC2425m2.x();
            AbstractC6783d.d(interfaceC1138i, z10, null, androidx.compose.animation.f.m(uIConstant.defaultAnimation(), 0.0f, 2, obj2), androidx.compose.animation.f.o(uIConstant.defaultAnimation(), 0.0f, 2, obj2), "Template7.packageSpacing", ComposableSingletons$Template7Kt.INSTANCE.m866getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425m2, i14 | 1769472 | ((i15 >> 6) & 112), 2);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C45173(interfaceC1138i, legacy, paywallViewModel, z10, list, tierInfo2, function1, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1395216940);
        if ((i10 & 48) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(tierInfo) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 145) == 144 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1395216940, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template7.kt:339)");
            }
            TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, interfaceC2425mG, (i11 >> 6) & 14);
            ProcessedLocalizedConfiguration processedLocalizedConfigurationSelectedLocalizationForTier = selectedLocalizationForTier(tierInfo);
            interfaceC2425m2 = interfaceC2425mG;
            MarkdownKt.m594MarkdownDkhmgE0(processedLocalizedConfigurationSelectedLocalizationForTier.getTitle(), s.h(androidx.compose.ui.e.f26613a, 0.0f, 1, null), currentColorsForTier.m786getText10d7_KjU(), D.f17597a.c(interfaceC2425mG, D.f17598b).i(), 0L, Y0.L.f22613b.b(), null, null, C4830j.h(C4830j.f47278b.a()), false, true, false, interfaceC2425m2, 196656, 54, 720);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C45181(interfaceC1138i, legacy, tierInfo, i10));
        }
    }

    private static final long getFeatureIcon(TemplateConfiguration.Colors colors) {
        return colors.m778getAccent10d7_KjU();
    }

    private static final long getSelectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.m787getText20d7_KjU();
    }

    private static final long getSelectedOutline(TemplateConfiguration.Colors colors) {
        return colors.m779getAccent20d7_KjU();
    }

    private static final long getTierSwitcherBackground(TemplateConfiguration.Colors colors) {
        C6385r0 c6385r0M789getTierControlBackgroundQN2ZGVo = colors.m789getTierControlBackgroundQN2ZGVo();
        return c6385r0M789getTierControlBackgroundQN2ZGVo != null ? c6385r0M789getTierControlBackgroundQN2ZGVo.A() : colors.m778getAccent10d7_KjU();
    }

    private static final long getTierSwitcherBackgroundSelected(TemplateConfiguration.Colors colors) {
        C6385r0 c6385r0M791getTierControlSelectedBackgroundQN2ZGVo = colors.m791getTierControlSelectedBackgroundQN2ZGVo();
        return c6385r0M791getTierControlSelectedBackgroundQN2ZGVo != null ? c6385r0M791getTierControlSelectedBackgroundQN2ZGVo.A() : getUnselectedDiscountText(colors);
    }

    private static final long getTierSwitcherForeground(TemplateConfiguration.Colors colors) {
        C6385r0 c6385r0M790getTierControlForegroundQN2ZGVo = colors.m790getTierControlForegroundQN2ZGVo();
        return c6385r0M790getTierControlForegroundQN2ZGVo != null ? c6385r0M790getTierControlForegroundQN2ZGVo.A() : colors.m786getText10d7_KjU();
    }

    private static final long getTierSwitcherForegroundSelected(TemplateConfiguration.Colors colors) {
        C6385r0 c6385r0M792getTierControlSelectedForegroundQN2ZGVo = colors.m792getTierControlSelectedForegroundQN2ZGVo();
        return c6385r0M792getTierControlSelectedForegroundQN2ZGVo != null ? c6385r0M792getTierControlSelectedForegroundQN2ZGVo.A() : colors.m786getText10d7_KjU();
    }

    private static final long getUnselectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.m788getText30d7_KjU();
    }

    private static final long getUnselectedOutline(TemplateConfiguration.Colors colors) {
        return colors.m780getAccent30d7_KjU();
    }

    private static final ProcessedLocalizedConfiguration selectedLocalizationForTier(TemplateConfiguration.TierInfo tierInfo) {
        return tierInfo.getDefaultPackage().getLocalization();
    }
}
