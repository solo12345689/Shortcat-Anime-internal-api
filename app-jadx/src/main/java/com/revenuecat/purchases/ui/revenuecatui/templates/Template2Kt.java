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
import I0.B;
import K0.InterfaceC1788g;
import R0.r;
import Td.L;
import U.AbstractC2174k;
import U.C2171h;
import U.C2172i;
import U.D;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.m2;
import android.net.Uri;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.q1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.TestTag;
import g0.i;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
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
import w.AbstractC6906j;
import x.AbstractC7010h;
import x.C7009g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a,\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a7\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0006H\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0006H\u0003¢\u0006\u0004\b&\u0010%\u001a\u000f\u0010'\u001a\u00020\u0006H\u0003¢\u0006\u0004\b'\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)²\u0006\u000e\u0010(\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "Landroidx/compose/ui/e;", "childModifier", "LTd/L;", "Template2", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;LY/m;II)V", "LC/i;", "", "packageSelectionVisible", "Template2PortraitContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;ZLandroidx/compose/ui/e;LY/m;I)V", "Template2LandscapeContent", "IconImage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Landroidx/compose/ui/e;LY/m;I)V", "Lg1/j;", "textAlign", "Title-8iNrtrE", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Landroidx/compose/ui/e;ILY/m;II)V", "Title", "Subtitle-8iNrtrE", "Subtitle", "landscapeLayout", "AnimatedPackages", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;ZZLcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageInfo", "SelectPackageButton", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;LY/m;I)V", "isSelected", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "CheckmarkBox", "(ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "Template2PaywallPreview", "(LY/m;I)V", "Template2PaywallFooterPreview", "Template2PaywallFooterCondensedPreview", "packageSelectorVisible", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template2Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$AnimatedPackages$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ boolean $landscapeLayout;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Legacy legacy, boolean z10, boolean z11, PaywallViewModel paywallViewModel, e eVar, int i10) {
            super(2);
            this.$state = legacy;
            this.$packageSelectionVisible = z10;
            this.$landscapeLayout = z11;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.AnimatedPackages(this.$state, this.$packageSelectionVisible, this.$landscapeLayout, this.$viewModel, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$CheckmarkBox$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44532 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44532(boolean z10, TemplateConfiguration.Colors colors, int i10) {
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
            Template2Kt.CheckmarkBox(this.$isSelected, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$IconImage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, e eVar, int i10) {
            super(2);
            this.$state = legacy;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.IconImage(this.$state, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$SelectPackageButton$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TemplateConfiguration.PackageInfo packageInfo, long j10, boolean z10, PaywallState.Loaded.Legacy legacy) {
            super(3);
            this.$packageInfo = packageInfo;
            this.$textColor = j10;
            this.$isSelected = z10;
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
                AbstractC2454w.U(760289252, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template2.kt:390)");
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
            Template2Kt.CheckmarkBox(z10, PaywallStateKt.getCurrentColors(legacy, interfaceC2425m, 0), interfaceC2425m, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            j0.b(offerName, null, j10, 0L, null, Y0.L.f22613b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, d10.c(interfaceC2425m, i11).b(), interfaceC2425m, 196608, 0, 65498);
            interfaceC2425m.x();
            IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(packageInfo), j10, d10.c(interfaceC2425m, i11).c(), null, null, false, null, interfaceC2425m, 100663296, 704);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$SelectPackageButton$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.$this_SelectPackageButton = interfaceC1138i;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44542 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44542(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.Template2(this.$state, this.$viewModel, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2LandscapeContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44552 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template2LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44552(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.$this_Template2LandscapeContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.Template2LandscapeContent(this.$this_Template2LandscapeContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44561 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44561 INSTANCE = new C44561();

        C44561() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m877invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m877invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44572 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44572(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.Template2PaywallFooterCondensedPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44581 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44581 INSTANCE = new C44581();

        C44581() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m878invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m878invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44592 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44592(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.Template2PaywallFooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44601 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44601 INSTANCE = new C44601();

        C44601() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m879invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m879invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44612 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44612(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.Template2PaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PortraitContent$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44623 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template2PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44623(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.$this_Template2PortraitContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template2Kt.Template2PortraitContent(this.$this_Template2PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$childModifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedPackages(PaywallState.Loaded.Legacy legacy, boolean z10, boolean z11, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1799464452);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(eVar) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1799464452, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages (Template2.kt:301)");
            }
            l0.e eVarO = PaywallStateKt.isInFullScreenMode(legacy) ? l0.e.f52304a.o() : l0.e.f52304a.b();
            e.a aVar = androidx.compose.ui.e.f26613a;
            B bH = f.h(eVarO, false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, aVar);
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
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            AbstractC6783d.e(!z10, null, androidx.compose.animation.f.m(AbstractC6906j.j(0, 200, null, 5, null), 0.0f, 2, null), androidx.compose.animation.f.o(AbstractC6906j.j(0, 200, null, 5, null), 0.0f, 2, null), "OfferDetailsVisibility", i.d(4658274, true, new Template2Kt$AnimatedPackages$1$1(legacy), interfaceC2425mG, 54), interfaceC2425mG, 224640, 2);
            e.a aVar3 = l0.e.f52304a;
            AbstractC6783d.e(z10, null, androidx.compose.animation.f.k(null, aVar3.a(), false, null, 13, null), androidx.compose.animation.f.u(null, aVar3.a(), false, null, 13, null), "SelectPackagesVisibility", i.d(1995133977, true, new Template2Kt$AnimatedPackages$1$2(z11, legacy, paywallViewModel, eVar), interfaceC2425mG, 54), interfaceC2425mG, ((i11 >> 3) & 14) | 224640, 2);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(legacy, z10, z11, paywallViewModel, eVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkBox(boolean z10, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1250819500);
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
                AbstractC2454w.U(1250819500, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template2.kt:419)");
            }
            androidx.compose.ui.e eVarD = b.d(AbstractC5912g.a(s.r(androidx.compose.ui.e.f26613a, Template2UIConstants.INSTANCE.m880getCheckmarkSizeD9Ej5fM()), J.i.g()), C6385r0.q(colors.m779getAccent20d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
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
            interfaceC2425mG.V(1030125607);
            if (z10) {
                PaywallIconKt.m607PaywallIconFNF3uiM(PaywallIconName.CHECK_CIRCLE, null, colors.m778getAccent10d7_KjU(), interfaceC2425mG, 6, 2);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44532(z10, colors, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconImage(PaywallState.Loaded.Legacy legacy, androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        androidx.compose.ui.e eVar2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-951232294);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(eVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            eVar2 = eVar;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-951232294, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.IconImage (Template2.kt:249)");
            }
            Uri iconUri = legacy.getTemplateConfiguration().getImages().getIconUri();
            Template2UIConstants template2UIConstants = Template2UIConstants.INSTANCE;
            eVar2 = eVar;
            IconImageKt.m584IconImagedjqsMU(iconUri, template2UIConstants.m882getMaxIconWidthD9Ej5fM(), template2UIConstants.m881getIconCornerRadiusD9Ej5fM(), eVar2, interfaceC2425mG, ((i11 << 6) & 7168) | 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(legacy, eVar2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButton(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        int i12;
        C7009g c7009gA;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1238280660);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(packageInfo) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(eVar) ? 16384 : 8192;
        }
        int i13 = i11;
        if ((i13 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1238280660, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template2.kt:348)");
            }
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0);
            boolean zC = AbstractC5504s.c(packageInfo, legacy.getSelectedPackage().getValue());
            float fPackageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, interfaceC2425mG, (i13 >> 9) & 14);
            int i14 = (i13 >> 3) & 126;
            long jM849packageButtonColorAnimation9z6LAg8 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy, packageInfo, currentColors.m779getAccent20d7_KjU(), currentColors.m781getBackground0d7_KjU(), interfaceC2425mG, i14);
            long jM849packageButtonColorAnimation9z6LAg82 = AnimationsKt.m849packageButtonColorAnimation9z6LAg8(legacy, packageInfo, currentColors.m778getAccent10d7_KjU(), currentColors.m786getText10d7_KjU(), interfaceC2425mG, i14);
            if (zC) {
                c7009gA = null;
                i12 = i13;
            } else {
                i12 = i13;
                c7009gA = AbstractC7010h.a(UIConstant.INSTANCE.m387getDefaultPackageBorderWidthD9Ej5fM(), C6385r0.q(currentColors.m786getText10d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null));
            }
            androidx.compose.ui.e eVarB = interfaceC1138i.b(AbstractC5906a.a(s.h(eVar, 0.0f, 1, null), fPackageButtonActionInProgressOpacityAnimation), l0.e.f52304a.k());
            interfaceC2425mG.V(1055888883);
            boolean zA = interfaceC2425mG.a(zC);
            Object objD = interfaceC2425mG.D();
            if (zA || objD == InterfaceC2425m.f22370a.a()) {
                objD = new Template2Kt$SelectPackageButton$1$1(zC);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarA = q1.a(r.f(eVarB, false, (Function1) objD, 1, null), TestTag.INSTANCE.selectButtonTestTag(packageInfo.getRcPackage().getIdentifier()));
            C2171h c2171hB = C2172i.f18372a.b(jM849packageButtonColorAnimation9z6LAg8, jM849packageButtonColorAnimation9z6LAg82, 0L, 0L, interfaceC2425mG, C2172i.f18386o << 12, 12);
            UIConstant uIConstant = UIConstant.INSTANCE;
            J.h hVarD = J.i.d(uIConstant.m388getDefaultPackageCornerRadiusD9Ej5fM());
            A aB = p.b(uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            interfaceC2425mG.V(1055893894);
            boolean z10 = ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object objD2 = interfaceC2425mG.D();
            if (z10 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new Template2Kt$SelectPackageButton$2$1(paywallViewModel, packageInfo);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            AbstractC2174k.a((InterfaceC5082a) objD2, eVarA, false, hVarD, c2171hB, null, c7009gA, aB, null, i.d(760289252, true, new AnonymousClass3(packageInfo, jM849packageButtonColorAnimation9z6LAg82, zC, legacy), interfaceC2425mG, 54), interfaceC2425mG, 805306368, 292);
            interfaceC2425mG = interfaceC2425mG;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(interfaceC1138i, legacy, packageInfo, paywallViewModel, eVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX INFO: renamed from: Subtitle-8iNrtrE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m871Subtitle8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r24, androidx.compose.ui.e r25, int r26, Y.InterfaceC2425m r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt.m871Subtitle8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, androidx.compose.ui.e, int, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Template2(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r20, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r21, androidx.compose.ui.e r22, Y.InterfaceC2425m r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt.Template2(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template2$lambda$5$lambda$4$lambda$1(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2$lambda$5$lambda$4$lambda$2(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2LandscapeContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1667751062);
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
            i11 |= interfaceC2425mG.U(eVar) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1667751062, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2LandscapeContent (Template2.kt:188)");
            }
            o oVarC = m.c(0, interfaceC2425mG, 0, 1);
            o oVarC2 = m.c(0, interfaceC2425mG, 0, 1);
            C1131b.e eVarC = C1131b.a.f2102a.c();
            e.a aVar = l0.e.f52304a;
            e.c cVarI = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarC2 = InterfaceC1138i.c(interfaceC1138i, aVar2, 1.0f, false, 2, null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarJ = p.j(eVarC2, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            B b10 = G.b(eVarC, cVarI, interfaceC2425mG, 54);
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
            m2.e(interfaceC2425mB, b10, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            J j10 = J.f2025a;
            androidx.compose.ui.e eVarB = I.b(j10, m.f(aVar2, oVarC, false, null, false, 14, null), 0.5f, false, 2, null);
            e.b bVarG = aVar.g();
            C1131b c1131b = C1131b.f2093a;
            B bA = AbstractC1136g.a(c1131b.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.i()), bVarG, interfaceC2425mG, 48);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarB);
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
            int i13 = i12 >> 3;
            int i14 = i13 & 14;
            int i15 = ((i12 >> 9) & 112) | i14;
            IconImage(legacy, eVar, interfaceC2425mG, i15);
            C4830j.a aVar4 = C4830j.f47278b;
            m872Title8iNrtrE(legacy, eVar, aVar4.f(), interfaceC2425mG, i15, 0);
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            m871Subtitle8iNrtrE(legacy, eVar, aVar4.f(), interfaceC2425mG, i15, 0);
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            androidx.compose.ui.e eVarB2 = I.b(j10, m.f(aVar2, oVarC2, false, null, false, 14, null), 0.5f, false, 2, null);
            B bA2 = AbstractC1136g.a(c1131b.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.i()), aVar.g(), interfaceC2425mG, 48);
            int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR3 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarB2);
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
            int i16 = i14 | 384;
            int i17 = i12 >> 6;
            AnimatedPackages(legacy, z10, true, paywallViewModel, eVar, interfaceC2425mG, i16 | (i17 & 112) | ((i12 << 3) & 7168) | (57344 & i12));
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(legacy, paywallViewModel, eVar, C5015h.n(0), null, interfaceC2425mG, i14 | 3072 | (i13 & 112) | (i17 & 896), 16);
            interfaceC2425mG = interfaceC2425mG;
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44552(interfaceC1138i, legacy, paywallViewModel, z10, eVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PaywallFooterCondensedPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-741508648);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-741508648, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallFooterCondensedPreview (Template2.kt:465)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44561.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate2Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44572(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PaywallFooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1374736823);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1374736823, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallFooterPreview (Template2.kt:455)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44581.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate2Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44592(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(44645436);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(44645436, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallPreview (Template2.kt:445)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44601.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate2Offering(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44612(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PortraitContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallViewModel paywallViewModel2;
        boolean z11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(75198122);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            paywallViewModel2 = paywallViewModel;
            i11 |= interfaceC2425mG.U(paywallViewModel2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        } else {
            paywallViewModel2 = paywallViewModel;
        }
        if ((i10 & 3072) == 0) {
            z11 = z10;
            i11 |= interfaceC2425mG.a(z11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            z11 = z10;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(eVar) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(75198122, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PortraitContent (Template2.kt:138)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            UIConstant uIConstant = UIConstant.INSTANCE;
            K.a(s.i(aVar, uIConstant.m389getDefaultVerticalSpacingD9Ej5fM()), interfaceC2425mG, 0);
            o oVarC = m.c(0, interfaceC2425mG, 0, 1);
            boolean zIsInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
            interfaceC2425mG.V(-491622595);
            boolean zU = ((i12 & 14) == 4) | interfaceC2425mG.U(oVarC);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new Template2Kt$Template2PortraitContent$1$1(interfaceC1138i, oVarC);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarJ = p.j(ModifierExtensionsKt.conditional(aVar, zIsInFullScreenMode, (Function1) objD), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
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
            interfaceC2425mG.V(-1596100152);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
                int i13 = ((i12 >> 9) & 112) | ((i12 >> 3) & 14);
                IconImage(legacy, eVar, interfaceC2425mG, i13);
                m872Title8iNrtrE(legacy, eVar, 0, interfaceC2425mG, i13, 4);
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
                m871Subtitle8iNrtrE(legacy, eVar, 0, interfaceC2425mG, i13, 4);
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            AnimatedPackages(legacy, z11, false, paywallViewModel2, eVar, interfaceC2425mG, ((i12 >> 3) & 14) | 384 | ((i12 >> 6) & 112) | ((i12 << 3) & 7168) | (57344 & i12));
            interfaceC2425mG = interfaceC2425mG;
            interfaceC2425mG.V(-1596084908);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44623(interfaceC1138i, legacy, paywallViewModel, z10, eVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX INFO: renamed from: Title-8iNrtrE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m872Title8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r24, androidx.compose.ui.e r25, int r26, Y.InterfaceC2425m r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt.m872Title8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, androidx.compose.ui.e, int, Y.m, int, int):void");
    }
}
