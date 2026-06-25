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
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.p;
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
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.Iterator;
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
import x.AbstractC7010h;
import x.C7009g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010 \u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b#\u0010$\u001a#\u0010&\u001a\u00020\u0004*\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0004H\u0003¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\u0004H\u0003¢\u0006\u0004\b*\u0010)\u001a\u000f\u0010+\u001a\u00020\u0004H\u0003¢\u0006\u0004\b+\u0010)\"\u0018\u0010/\u001a\u00020,*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0018\u00101\u001a\u00020,*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.\"\u0018\u00103\u001a\u00020,*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.\"\u0018\u00105\u001a\u00020,*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.\"\u0018\u00107\u001a\u00020,*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010.¨\u00069²\u0006\u000e\u00108\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "LTd/L;", "Template5", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "LC/i;", "", "packageSelectionVisible", "Template5PortraitContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;ZLY/m;I)V", "Template5LandscapeContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "Landroid/net/Uri;", "uri", "HeaderImage", "(Landroid/net/Uri;LY/m;I)V", "Title", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V", "Features", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "feature", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "Feature", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "AnimatedPackages", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;ZLY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageInfo", "SelectPackageButton", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "isSelected", "CheckmarkBox", "(ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "LC/I;", "DiscountBanner", "(LC/I;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;LY/m;I)V", "Template5PaywallPreview", "(LY/m;I)V", "Template5PaywallFooterPreview", "Template5PaywallFooterCondensedPreview", "Ls0/r0;", "getFeatureIcon", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;)J", "featureIcon", "getSelectedOutline", "selectedOutline", "getUnselectedOutline", "unselectedOutline", "getSelectedDiscountText", "selectedDiscountText", "getUnselectedDiscountText", "unselectedDiscountText", "packageSelectorVisible", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template5Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$AnimatedPackages$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.AnimatedPackages(this.$state, this.$viewModel, this.$packageSelectionVisible, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$CheckmarkBox$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44862 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44862(boolean z10, TemplateConfiguration.Colors colors, int i10) {
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
            Template5Kt.CheckmarkBox(this.$isSelected, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$DiscountBanner$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ I $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, int i11) {
            super(2);
            this.$this_DiscountBanner = i10;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$$changed = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$DiscountBanner$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ I $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, int i11) {
            super(2);
            this.$this_DiscountBanner = i10;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$$changed = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Feature$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44871 extends AbstractC5506u implements Function1 {
        public static final C44871 INSTANCE = new C44871();

        C44871() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Feature$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44883 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.LocalizedConfiguration.Feature $feature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44883(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, int i10) {
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
            Template5Kt.Feature(this.$feature, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Features$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44892 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44892(PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.Features(this.$state, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$HeaderImage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44902 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44902(Uri uri, int i10) {
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
            Template5Kt.HeaderImage(this.$uri, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$SelectPackageButton$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44913 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44913(TemplateConfiguration.PackageInfo packageInfo, long j10, boolean z10, TemplateConfiguration.Colors colors, PaywallState.Loaded.Legacy legacy) {
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
                AbstractC2454w.U(644978660, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template5.kt:402)");
            }
            e.a aVar = e.f26613a;
            e eVarH = s.h(aVar, 0.0f, 1, null);
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
            Template5Kt.CheckmarkBox(z10, colors, interfaceC2425m, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            Y0 y0B = d10.c(interfaceC2425m, i11).b();
            j0.b(offerName, j11.a(aVar, 1.0f, true), j10, 0L, null, Y0.L.f22613b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, y0B, interfaceC2425m, 196608, 0, 65496);
            Template5Kt.DiscountBanner(j11, legacy, packageInfo, interfaceC2425m, 6);
            interfaceC2425m.x();
            IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(packageInfo), j10, d10.c(interfaceC2425m, i11).c(), null, null, false, null, interfaceC2425m, 100663296, 704);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$SelectPackageButton$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$this_SelectPackageButton = interfaceC1138i;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44922 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44922(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template5Kt.Template5(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5LandscapeContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44932 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template5LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44932(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$this_Template5LandscapeContent = interfaceC1138i;
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
            Template5Kt.Template5LandscapeContent(this.$this_Template5LandscapeContent, this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44941 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44941 INSTANCE = new C44941();

        C44941() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m909invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m909invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44952 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44952(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.Template5PaywallFooterCondensedPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44961 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44961 INSTANCE = new C44961();

        C44961() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m910invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m910invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44972 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44972(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.Template5PaywallFooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44981 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44981 INSTANCE = new C44981();

        C44981() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m911invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m911invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44992 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44992(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.Template5PaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Template5PortraitContent$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45003 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template5PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45003(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, int i10) {
            super(2);
            this.$this_Template5PortraitContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.Template5PortraitContent(this.$this_Template5PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt$Title$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C45011 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45011(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$this_Title = interfaceC1138i;
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template5Kt.Title(this.$this_Title, this.$state, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r23, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r24, boolean r25, Y.InterfaceC2425m r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt.AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, boolean, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkBox(boolean z10, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1250908873);
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
                AbstractC2454w.U(1250908873, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template5.kt:435)");
            }
            androidx.compose.ui.e eVarD = b.d(AbstractC5912g.a(s.r(androidx.compose.ui.e.f26613a, Template5UIConstants.INSTANCE.m912getCheckmarkSizeD9Ej5fM()), i.g()), z10 ? colors.m781getBackground0d7_KjU() : getUnselectedOutline(colors), null, 2, null);
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
            interfaceC2425mG.V(1030131166);
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
            b1K.a(new C44862(z10, colors, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscountBanner(I i10, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        PaywallState.Loaded.Legacy legacy2 = legacy;
        TemplateConfiguration.PackageInfo packageInfo2 = packageInfo;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1630065399);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.U(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.U(legacy2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.U(packageInfo2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i12 & 147) != 146 || !interfaceC2425mG.i()) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1630065399, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountBanner (Template5.kt:455)");
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
                            b1K.a(new AnonymousClass1(i10, legacy2, packageInfo2, i11));
                            return;
                        }
                        return;
                    }
                    int i13 = i12 >> 3;
                    TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy2, interfaceC2425mG, i13 & 14);
                    int i14 = i13 & 126;
                    long jM849packageButtonColorAnimation9z6LAg8 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy2, packageInfo2, getSelectedOutline(currentColors), getUnselectedOutline(currentColors), interfaceC2425mG, i14);
                    legacy2 = legacy;
                    packageInfo2 = packageInfo;
                    long jM849packageButtonColorAnimation9z6LAg82 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy2, packageInfo2, getSelectedDiscountText(currentColors), getUnselectedDiscountText(currentColors), interfaceC2425mG, i14);
                    e.a aVar = androidx.compose.ui.e.f26613a;
                    e.a aVar2 = l0.e.f52304a;
                    androidx.compose.ui.e eVarC = i10.c(aVar, aVar2.l());
                    UIConstant uIConstant = UIConstant.INSTANCE;
                    float fM386getDefaultHorizontalPaddingD9Ej5fM = uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM();
                    Template5UIConstants template5UIConstants = Template5UIConstants.INSTANCE;
                    androidx.compose.ui.e eVarA = n.a(eVarC, C5015h.n(fM386getDefaultHorizontalPaddingD9Ej5fM - template5UIConstants.m913getDiscountPaddingD9Ej5fM()), C5015h.n(C5015h.n(-uIConstant.m389getDefaultVerticalSpacingD9Ej5fM()) + template5UIConstants.m913getDiscountPaddingD9Ej5fM()));
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
                    androidx.compose.ui.e eVarK = p.k(p.k(b.c(aVar, jM849packageButtonColorAnimation9z6LAg8, C2172i.f18372a.k(interfaceC2425mG, C2172i.f18386o)), 0.0f, C5015h.n(4), 1, null), C5015h.n(8), 0.0f, 2, null);
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
                b1K2.a(new Template5Kt$DiscountBanner$text$1(i10, legacy2, packageInfo2, i11));
                return;
            }
            return;
        }
        interfaceC2425mG.K();
        B1 b1K3 = interfaceC2425mG.k();
        if (b1K3 != null) {
            b1K3.a(new AnonymousClass3(i10, legacy2, packageInfo2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-840476137);
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
                AbstractC2454w.U(-840476137, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template5.kt:274)");
            }
            e.a aVar = l0.e.f52304a;
            e.c cVarI = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarE = R0.r.e(s.h(aVar2, 0.0f, 1, null), true, C44871.INSTANCE);
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
            androidx.compose.ui.e eVarR = s.r(aVar2, Template5UIConstants.INSTANCE.m914getFeatureIconSizeD9Ej5fM());
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
            interfaceC2425mG.V(-929062679);
            if (paywallIconNameFromValue != null) {
                PaywallIconKt.m607PaywallIconFNF3uiM(paywallIconNameFromValue, null, getFeatureIcon(colors), interfaceC2425mG, 0, 2);
                L l10 = L.f17438a;
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            androidx.compose.ui.e eVarM = p.m(aVar2, UIConstant.INSTANCE.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
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
            interfaceC2425mG.V(-929039817);
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
            b1K.a(new C44883(feature, colors, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Features(PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-330300649);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-330300649, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template5.kt:259)");
            }
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0);
            Iterator<T> it = PaywallStateKt.getSelectedLocalization(legacy).getFeatures().iterator();
            while (it.hasNext()) {
                Feature((PaywallData.LocalizedConfiguration.Feature) it.next(), currentColors, interfaceC2425mG, 0);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44892(legacy, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderImage(Uri uri, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(108940117);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(uri) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(108940117, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template5.kt:228)");
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
            b1K.a(new C44902(uri, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButton(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(423303156);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(packageInfo) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(423303156, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template5.kt:370)");
            }
            int i13 = i12 >> 3;
            TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy, interfaceC2425mG, i13 & 14);
            boolean zC = AbstractC5504s.c(packageInfo, legacy.getSelectedPackage().getValue());
            float fPackageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, interfaceC2425mG, (i12 >> 9) & 14);
            long jM786getText10d7_KjU = currentColors.m786getText10d7_KjU();
            long jM849packageButtonColorAnimation9z6LAg8 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedOutline(currentColors), getUnselectedOutline(currentColors), interfaceC2425mG, i13 & 126);
            androidx.compose.ui.e eVarB = interfaceC1138i.b(AbstractC5906a.a(s.h(androidx.compose.ui.e.f26613a, 0.0f, 1, null), fPackageButtonActionInProgressOpacityAnimation), l0.e.f52304a.k());
            interfaceC2425mG.V(1055889971);
            boolean zA = interfaceC2425mG.a(zC);
            Object objD = interfaceC2425mG.D();
            if (zA || objD == InterfaceC2425m.f22370a.a()) {
                objD = new Template5Kt$SelectPackageButton$1$1(zC);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarF = R0.r.f(eVarB, false, (Function1) objD, 1, null);
            C2171h c2171hB = C2172i.f18372a.b(C6385r0.f58985b.i(), jM786getText10d7_KjU, 0L, 0L, interfaceC2425mG, (C2172i.f18386o << 12) | 6, 12);
            UIConstant uIConstant = UIConstant.INSTANCE;
            J.h hVarD = i.d(uIConstant.m388getDefaultPackageCornerRadiusD9Ej5fM());
            A aB = p.b(uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            C7009g c7009gA = AbstractC7010h.a(uIConstant.m387getDefaultPackageBorderWidthD9Ej5fM(), jM849packageButtonColorAnimation9z6LAg8);
            interfaceC2425mG.V(1055892294);
            boolean z10 = ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object objD2 = interfaceC2425mG.D();
            if (z10 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new Template5Kt$SelectPackageButton$2$1(paywallViewModel, packageInfo);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            AbstractC2174k.a((InterfaceC5082a) objD2, eVarF, false, hVarD, c2171hB, null, c7009gA, aB, null, g0.i.d(644978660, true, new C44913(packageInfo, jM786getText10d7_KjU, zC, currentColors, legacy), interfaceC2425mG, 54), interfaceC2425mG, 805306368, 292);
            interfaceC2425mG = interfaceC2425mG;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(interfaceC1138i, legacy, packageInfo, paywallViewModel, i10));
        }
    }

    public static final void Template5(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallState.Loaded.Legacy legacy;
        PaywallViewModel paywallViewModel;
        PaywallState.Loaded.Legacy legacy2;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(viewModel, "viewModel");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1727742443);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(viewModel) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            paywallViewModel = viewModel;
            legacy2 = state;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1727742443, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5 (Template5.kt:92)");
            }
            interfaceC2425mG.V(-1567803066);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = b2.e(Boolean.valueOf(state.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), null, 2, null);
                interfaceC2425mG.u(objD);
            }
            C0 c02 = (C0) objD;
            interfaceC2425mG.O();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, aVar2);
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
            m2.e(interfaceC2425mB, bA, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            if (WindowHelperKt.shouldUseLandscapeLayout(state, interfaceC2425mG, i11 & 14)) {
                interfaceC2425mG.V(1533583235);
                int i12 = i11 << 3;
                Template5LandscapeContent(c1139j, state, viewModel, interfaceC2425mG, (i12 & 896) | 6 | (i12 & 112));
                interfaceC2425mG.O();
                legacy = state;
                paywallViewModel = viewModel;
            } else {
                interfaceC2425mG.V(1533656364);
                int i13 = i11 << 3;
                Template5PortraitContent(c1139j, state, viewModel, Template5$lambda$1(c02), interfaceC2425mG, (i13 & 896) | 6 | (i13 & 112));
                legacy = state;
                paywallViewModel = viewModel;
                interfaceC2425mG = interfaceC2425mG;
                interfaceC2425mG.O();
            }
            int i14 = i11 & 112;
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(legacy, paywallViewModel, null, 0.0f, null, interfaceC2425mG, i11 & 126, 28);
            legacy2 = legacy;
            TemplateConfiguration templateConfiguration = legacy2.getTemplateConfiguration();
            interfaceC2425mG.V(188029008);
            Object objD2 = interfaceC2425mG.D();
            if (objD2 == aVar.a()) {
                objD2 = new Template5Kt$Template5$1$1$1(c02);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            FooterKt.Footer(templateConfiguration, paywallViewModel, null, null, (InterfaceC5082a) objD2, interfaceC2425mG, i14 | 24576, 12);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44922(legacy2, paywallViewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template5$lambda$1(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template5$lambda$2(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template5LandscapeContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC1138i interfaceC1138i2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1534776921);
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
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC1138i2 = interfaceC1138i;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1534776921, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5LandscapeContent (Template5.kt:175)");
            }
            o oVarC = m.c(0, interfaceC2425mG, 0, 1);
            o oVarC2 = m.c(0, interfaceC2425mG, 0, 1);
            C1131b.e eVarC = C1131b.a.f2102a.c();
            e.a aVar = l0.e.f52304a;
            e.c cVarI = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarC2 = InterfaceC1138i.c(interfaceC1138i, aVar2, 1.0f, false, 2, null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarK = p.k(p.m(eVarC2, 0.0f, uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
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
            androidx.compose.ui.e eVarJ = p.j(I.b(j10, m.f(aVar2, oVarC, false, null, false, 14, null), 1.0f, false, 2, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
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
            Title(c1139j, legacy, interfaceC2425mG, (i12 & 112) | 6);
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            int i13 = i12 >> 3;
            Features(legacy, interfaceC2425mG, i13 & 14);
            interfaceC2425mG.x();
            androidx.compose.ui.e eVarJ2 = p.j(I.b(j10, m.f(aVar2, oVarC2, false, null, false, 14, null), 1.0f, false, 2, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
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
            interfaceC1138i2 = interfaceC1138i;
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            AnimatedPackages(legacy, paywallViewModel, false, interfaceC2425mG, i13 & 126, 4);
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44932(interfaceC1138i2, legacy, paywallViewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template5PaywallFooterCondensedPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1995671160);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1995671160, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PaywallFooterCondensedPreview (Template5.kt:544)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44941.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate5Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44952(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template5PaywallFooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2073587697);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2073587697, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PaywallFooterPreview (Template5.kt:534)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44961.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate5Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44972(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template5PaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1911239734);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1911239734, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PaywallPreview (Template5.kt:524)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44981.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate5Offering(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44992(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template5PortraitContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2076791099);
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
            z11 = z10;
            i11 |= interfaceC2425mG.a(z11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            z11 = z10;
        }
        int i14 = i11;
        if ((i14 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2076791099, i14, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PortraitContent (Template5.kt:120)");
            }
            Uri headerUri = legacy.getTemplateConfiguration().getImages().getHeaderUri();
            interfaceC2425mG.V(812095237);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                HeaderImage(headerUri, interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            o oVarC = m.c(0, interfaceC2425mG, 0, 1);
            e.a aVar = androidx.compose.ui.e.f26613a;
            boolean zIsInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
            interfaceC2425mG.V(812101850);
            int i15 = i14 & 14;
            boolean zU = (i15 == 4) | interfaceC2425mG.U(oVarC);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new Template5Kt$Template5PortraitContent$1$1(interfaceC1138i, oVarC);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarConditional = ModifierExtensionsKt.conditional(aVar, zIsInFullScreenMode, (Function1) objD);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarJ = p.j(eVarConditional, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            e.a aVar2 = l0.e.f52304a;
            B bA = AbstractC1136g.a(C1131b.f2093a.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar2.i()), aVar2.g(), interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarJ);
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
            m2.e(interfaceC2425mB, bA, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            interfaceC2425mG.V(-1562177448);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                interfaceC2425mG.V(-1562176230);
                if (headerUri == null) {
                    interfaceC2425mG.V(-1562175040);
                    if (legacy.getShouldDisplayDismissButton()) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        InsetSpacersKt.StatusBarSpacer(interfaceC2425mG, 0);
                    }
                    interfaceC2425mG.O();
                    K.a(s.i(aVar, uIConstant.m390getIconButtonSizeD9Ej5fM()), interfaceC2425mG, i13);
                }
                interfaceC2425mG.O();
                Title(c1139j, legacy, interfaceC2425mG, (i14 & 112) | 6);
                i12 = i15;
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
                Features(legacy, interfaceC2425mG, (i14 >> 3) & 14);
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
            } else {
                i12 = i15;
            }
            interfaceC2425mG.O();
            AnimatedPackages(legacy, paywallViewModel, z11, interfaceC2425mG, (i14 >> 3) & 1022, 0);
            interfaceC2425mG.V(-1562162191);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            AbstractC6783d.d(interfaceC1138i, z10, null, androidx.compose.animation.f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), androidx.compose.animation.f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), "Template5.packageSpacing", ComposableSingletons$Template5Kt.INSTANCE.m865getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425mG, i12 | 1769472 | ((i14 >> 6) & 112), 2);
            interfaceC2425mG = interfaceC2425mG;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C45003(interfaceC1138i, legacy, paywallViewModel, z10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1309191016);
        if ((i10 & 48) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1309191016, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template5.kt:242)");
            }
            interfaceC2425m2 = interfaceC2425mG;
            MarkdownKt.m594MarkdownDkhmgE0(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), s.h(androidx.compose.ui.e.f26613a, 0.0f, 1, null), legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0).m786getText10d7_KjU(), D.f17597a.c(interfaceC2425mG, D.f17598b).i(), 0L, Y0.L.f22613b.b(), null, null, C4830j.h(C4830j.f47278b.f()), false, true, false, interfaceC2425m2, 196656, 54, 720);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C45011(interfaceC1138i, legacy, i10));
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

    private static final long getUnselectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.m788getText30d7_KjU();
    }

    private static final long getUnselectedOutline(TemplateConfiguration.Colors colors) {
        return colors.m780getAccent30d7_KjU();
    }
}
