package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.AbstractC1133d;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.EnumC1152x;
import C.G;
import C.InterfaceC1134e;
import C.InterfaceC1138i;
import C.J;
import I0.B;
import K0.InterfaceC1788g;
import R0.C;
import Td.L;
import U.D;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.T1;
import Y.b2;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.k;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import g0.i;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import v.AbstractC6783d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0006\u001a1\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0017\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a,\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0004H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0004H\u0003¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\u0004H\u0003¢\u0006\u0004\b$\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&²\u0006\u000e\u0010%\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "LTd/L;", "Template4", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "Template4MainContent", "Packages", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageInfo", "Landroidx/compose/ui/e;", "modifier", "SelectPackageButton", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "SelectPackageButtonContent", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "", "text", "", "selected", "DiscountRelativeToMostExpensivePerMonth", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;ZLY/m;I)V", "Ls0/r0;", "textColor", "OfferName-3IgeMak", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;JLandroidx/compose/ui/e;LY/m;II)V", "OfferName", "isSelected", "CheckmarkBox", "(ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Landroidx/compose/ui/e;LY/m;II)V", "Template4PaywallPreview", "(LY/m;I)V", "Template4PaywallFooterPreview", "Template4PaywallFooterCondensedPreview", "packageSelectorVisible", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template4Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$CheckmarkBox$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z10, TemplateConfiguration.Colors colors, e eVar, int i10, int i11) {
            super(2);
            this.$isSelected = z10;
            this.$colors = colors;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.CheckmarkBox(this.$isSelected, this.$colors, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(C clearAndSetSemantics) {
            AbstractC5504s.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44732 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44732(String str, TemplateConfiguration.Colors colors, boolean z10, int i10) {
            super(2);
            this.$text = str;
            this.$colors = colors;
            this.$selected = z10;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.DiscountRelativeToMostExpensivePerMonth(this.$text, this.$colors, this.$selected, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Packages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/e;", "LTd/L;", "invoke", "(LC/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44741 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44741(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
            super(3);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1134e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1134e BoxWithConstraints, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC2425m.U(BoxWithConstraints) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1700467196, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Packages.<anonymous> (Template4.kt:234)");
            }
            float fPackages$packageWidth = Template4Kt.Packages$packageWidth(BoxWithConstraints, this.$state.getTemplateConfiguration().getPackages().getAll().size());
            e eVarB = m.b(s.h(k.a(e.f26613a, EnumC1152x.Min), 0.0f, 1, null), m.c(0, interfaceC2425m, 0, 1), false, null, false, 14, null);
            Template4UIConstants template4UIConstants = Template4UIConstants.INSTANCE;
            e eVarJ = p.j(eVarB, template4UIConstants.m906getPackagesHorizontalPaddingD9Ej5fM(), UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM());
            C1131b.f fVarO = C1131b.f2093a.o(template4UIConstants.m905getPackageHorizontalSpacingD9Ej5fM());
            PaywallState.Loaded.Legacy legacy = this.$state;
            PaywallViewModel paywallViewModel = this.$viewModel;
            B b10 = G.b(fVarO, l0.e.f52304a.l(), interfaceC2425m, 6);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarJ);
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
            m2.e(interfaceC2425mB, b10, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            J j10 = J.f2025a;
            interfaceC2425m.V(632318323);
            Iterator<T> it = legacy.getTemplateConfiguration().getPackages().getAll().iterator();
            while (it.hasNext()) {
                Template4Kt.SelectPackageButton(legacy, (TemplateConfiguration.PackageInfo) it.next(), paywallViewModel, s.v(e.f26613a, fPackages$packageWidth), interfaceC2425m, 0, 0);
            }
            interfaceC2425m.O();
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Packages$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44752 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44752(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template4Kt.Packages(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$SelectPackageButton$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44761 extends AbstractC5506u implements Function1 {
        public static final C44761 INSTANCE = new C44761();

        C44761() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$SelectPackageButton$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, e eVar, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.SelectPackageButton(this.$state, this.$packageInfo, this.$viewModel, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$SelectPackageButtonContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44772 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44772(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.SelectPackageButtonContent(this.$packageInfo, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44782 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44782(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template4Kt.Template4(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4MainContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44792 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44792(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template4Kt.Template4MainContent(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44801 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44801 INSTANCE = new C44801();

        C44801() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m898invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m898invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44812 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44812(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.Template4PaywallFooterCondensedPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44821 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44821 INSTANCE = new C44821();

        C44821() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m899invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m899invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44832 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44832(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.Template4PaywallFooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44841 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44841 INSTANCE = new C44841();

        C44841() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m900invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m900invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44852 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44852(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template4Kt.Template4PaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CheckmarkBox(boolean r15, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r16, androidx.compose.ui.e r17, Y.InterfaceC2425m r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.CheckmarkBox(boolean, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DiscountRelativeToMostExpensivePerMonth(java.lang.String r11, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r12, boolean r13, Y.InterfaceC2425m r14, int r15) {
        /*
            r0 = -1807074170(0xffffffff944a3c86, float:-1.021033E-26)
            Y.m r8 = r14.g(r0)
            r14 = r15 & 6
            if (r14 != 0) goto L16
            boolean r14 = r8.U(r11)
            if (r14 == 0) goto L13
            r14 = 4
            goto L14
        L13:
            r14 = 2
        L14:
            r14 = r14 | r15
            goto L17
        L16:
            r14 = r15
        L17:
            r1 = r15 & 48
            if (r1 != 0) goto L27
            boolean r1 = r8.U(r12)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r14 = r14 | r1
        L27:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L37
            boolean r1 = r8.a(r13)
            if (r1 == 0) goto L34
            r1 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r1 = 128(0x80, float:1.794E-43)
        L36:
            r14 = r14 | r1
        L37:
            r1 = r14 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L49
            boolean r1 = r8.i()
            if (r1 != 0) goto L44
            goto L49
        L44:
            r8.K()
            goto Lb6
        L49:
            boolean r1 = Y.AbstractC2454w.L()
            if (r1 == 0) goto L55
            r1 = -1
            java.lang.String r2 = "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountRelativeToMostExpensivePerMonth (Template4.kt:370)"
            Y.AbstractC2454w.U(r0, r14, r1, r2)
        L55:
            if (r11 == 0) goto L67
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r14 = r11.toUpperCase(r14)
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r14, r0)
            if (r14 != 0) goto L65
            goto L67
        L65:
            r1 = r14
            goto L6a
        L67:
            java.lang.String r14 = ""
            goto L65
        L6a:
            if (r13 == 0) goto L72
            long r2 = r12.m787getText20d7_KjU()
        L70:
            r3 = r2
            goto L77
        L72:
            long r2 = r12.m788getText30d7_KjU()
            goto L70
        L77:
            U.D r14 = U.D.f17597a
            int r0 = U.D.f17598b
            U.o0 r14 = r14.c(r8, r0)
            U0.Y0 r5 = r14.d()
            Y0.L$a r14 = Y0.L.f22613b
            Y0.L r6 = r14.b()
            g1.j$a r14 = g1.C4830j.f47278b
            int r7 = r14.a()
            androidx.compose.ui.e$a r14 = androidx.compose.ui.e.f26613a
            com.revenuecat.purchases.ui.revenuecatui.UIConstant r0 = com.revenuecat.purchases.ui.revenuecatui.UIConstant.INSTANCE
            float r0 = r0.m386getDefaultHorizontalPaddingD9Ej5fM()
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4UIConstants r2 = com.revenuecat.purchases.ui.revenuecatui.templates.Template4UIConstants.INSTANCE
            float r2 = r2.m903getDiscountVerticalPaddingD9Ej5fM()
            androidx.compose.ui.e r14 = androidx.compose.foundation.layout.p.j(r14, r0, r2)
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$1 r0 = com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.AnonymousClass1.INSTANCE
            androidx.compose.ui.e r2 = R0.r.c(r14, r0)
            r9 = 24576(0x6000, float:3.4438E-41)
            r10 = 0
            com.revenuecat.purchases.ui.revenuecatui.composables.AutoResizedTextKt.m564AutoResizedTextW72HBGU(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            boolean r14 = Y.AbstractC2454w.L()
            if (r14 == 0) goto Lb6
            Y.AbstractC2454w.T()
        Lb6:
            Y.B1 r14 = r8.k()
            if (r14 == 0) goto Lc4
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2 r0 = new com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.DiscountRelativeToMostExpensivePerMonth(java.lang.String, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, boolean, Y.m, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: OfferName-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m894OfferName3IgeMak(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo r32, long r33, androidx.compose.ui.e r35, Y.InterfaceC2425m r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.m894OfferName3IgeMak(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageInfo, long, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Packages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2132177050);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2132177050, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Packages (Template4.kt:217)");
            }
            AbstractC1133d.a(null, null, false, i.d(-1700467196, true, new C44741(legacy, paywallViewModel), interfaceC2425mG, 54), interfaceC2425mG, 3072, 7);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44752(legacy, paywallViewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Packages$packageWidth(InterfaceC1134e interfaceC1134e, float f10) {
        float fPackages$packagesToDisplay = Packages$packagesToDisplay(f10);
        Template4UIConstants template4UIConstants = Template4UIConstants.INSTANCE;
        return C5015h.n(C5015h.n(C5015h.n(interfaceC1134e.a() - C5015h.n(template4UIConstants.m906getPackagesHorizontalPaddingD9Ej5fM() * 2)) - C5015h.n(template4UIConstants.m905getPackageHorizontalSpacingD9Ej5fM() * (fPackages$packagesToDisplay - 1))) / fPackages$packagesToDisplay);
    }

    private static final float Packages$packagesToDisplay(float f10) {
        return Math.min(Math.min(3.5f, f10), 3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelectPackageButton(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r28, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo r29, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r30, androidx.compose.ui.e r31, Y.InterfaceC2425m r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.SelectPackageButton(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageInfo, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButtonContent(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2102143927);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(packageInfo) ? 4 : 2) | i10;
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
                AbstractC2454w.U(2102143927, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButtonContent (Template4.kt:343)");
            }
            C1131b.f fVarO = C1131b.f2093a.o(Template4UIConstants.INSTANCE.m904getPackageButtonContentVerticalSpacingD9Ej5fM());
            e.b bVarG = l0.e.f52304a.g();
            e.a aVar = androidx.compose.ui.e.f26613a;
            B bA = AbstractC1136g.a(fVarO, bVarG, interfaceC2425mG, 54);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
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
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            m894OfferName3IgeMak(packageInfo, colors.m786getText10d7_KjU(), InterfaceC1138i.c(C1139j.f2142a, s.B(aVar, null, false, 3, null), 1.0f, false, 2, null), interfaceC2425mG, i11 & 14, 0);
            j0.b(packageInfo.getRcPackage().getProduct().getPrice().getFormatted(), null, colors.m786getText10d7_KjU(), 0L, null, Y0.L.f22613b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425mG, D.f17598b).b(), interfaceC2425mG, 196608, 0, 65498);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44772(packageInfo, colors, i10));
        }
    }

    public static final void Template4(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(viewModel, "viewModel");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(596926027);
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
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(596926027, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4 (Template4.kt:102)");
            }
            if (PaywallStateKt.isInFullScreenMode(state)) {
                interfaceC2425mG.V(-1356655279);
                int i12 = i11 & 14;
                boolean zShouldUseLandscapeLayout = WindowHelperKt.shouldUseLandscapeLayout(state, interfaceC2425mG, i12);
                e.a aVar = androidx.compose.ui.e.f26613a;
                androidx.compose.ui.e eVarF = s.f(aVar, 0.0f, 1, null);
                e.a aVar2 = l0.e.f52304a;
                B bH = f.h(aVar2.o(), false);
                int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarF);
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
                m2.e(interfaceC2425mB, eVarF2, aVar3.f());
                h hVar = h.f26161a;
                interfaceC2425mG.V(-1319514881);
                if (!zShouldUseLandscapeLayout) {
                    PaywallBackgroundKt.PaywallBackground(hVar, state.getTemplateConfiguration(), interfaceC2425mG, 6);
                }
                interfaceC2425mG.O();
                interfaceC2425mG.V(-1319508245);
                Object objD = interfaceC2425mG.D();
                InterfaceC2425m.a aVar4 = InterfaceC2425m.f22370a;
                if (objD == aVar4.a()) {
                    objD = new Template4Kt$Template4$1$1$1(hVar);
                    interfaceC2425mG.u(objD);
                }
                interfaceC2425mG.O();
                androidx.compose.ui.e eVarConditional = ModifierExtensionsKt.conditional(aVar, zShouldUseLandscapeLayout, (Function1) objD);
                boolean z10 = !zShouldUseLandscapeLayout;
                interfaceC2425mG.V(-1319503568);
                Object objD2 = interfaceC2425mG.D();
                if (objD2 == aVar4.a()) {
                    objD2 = new Template4Kt$Template4$1$2$1(hVar);
                    interfaceC2425mG.u(objD2);
                }
                interfaceC2425mG.O();
                androidx.compose.ui.e eVarD = b.d(ModifierExtensionsKt.conditional(eVarConditional, z10, (Function1) objD2), PaywallStateKt.getCurrentColors(state, interfaceC2425mG, i12).m781getBackground0d7_KjU(), null, 2, null);
                B bA = AbstractC1136g.a(C1131b.f2093a.h(), aVar2.k(), interfaceC2425mG, 0);
                int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR2 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarD);
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
                m2.e(interfaceC2425mB2, eVarF3, aVar3.f());
                C1139j c1139j = C1139j.f2142a;
                interfaceC2425mG.V(-1458604088);
                if (zShouldUseLandscapeLayout) {
                    InsetSpacersKt.StatusBarSpacer(interfaceC2425mG, 0);
                }
                interfaceC2425mG.O();
                Template4MainContent(state, viewModel, interfaceC2425mG, i11 & 126);
                interfaceC2425mG.x();
                interfaceC2425mG.x();
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(-1355397392);
                Template4MainContent(state, viewModel, interfaceC2425mG, i11 & 126);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44782(state, viewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4MainContent(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        e.a aVar;
        int i12;
        C1131b c1131b;
        T1 t12;
        PaywallState.Loaded.Legacy legacy2;
        InterfaceC2425m interfaceC2425m3;
        PaywallViewModel paywallViewModel2 = paywallViewModel;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1408056045);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            legacy2 = legacy;
            interfaceC2425m3 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1408056045, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent (Template4.kt:148)");
            }
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0);
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarM = p.m(aVar2, 0.0f, uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null);
            C1131b c1131b2 = C1131b.f2093a;
            C1131b.f fVarO = c1131b2.o(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
            e.a aVar3 = l0.e.f52304a;
            B bA = AbstractC1136g.a(fVarO, aVar3.g(), interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarM);
            InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
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
            m2.e(interfaceC2425mB, bA, aVar4.e());
            m2.e(interfaceC2425mB, iR, aVar4.g());
            Function2 function2B = aVar4.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar4.f());
            C1139j c1139j = C1139j.f2142a;
            interfaceC2425mG.V(-1434964265);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                aVar = aVar2;
                c1131b = c1131b2;
                i12 = i11;
                t12 = null;
                MarkdownKt.m594MarkdownDkhmgE0(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), p.k(aVar2, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null), currentColors.m786getText10d7_KjU(), D.f17597a.c(interfaceC2425mG, D.f17598b).g(), 0L, Y0.L.f22613b.a(), null, null, C4830j.h(C4830j.f47278b.a()), false, true, false, interfaceC2425mG, 196608, 54, 720);
                interfaceC2425m2 = interfaceC2425mG;
            } else {
                interfaceC2425m2 = interfaceC2425mG;
                aVar = aVar2;
                i12 = i11;
                c1131b = c1131b2;
                t12 = null;
            }
            interfaceC2425m2.O();
            interfaceC2425m2.V(-1434945388);
            Object objD = interfaceC2425m2.D();
            InterfaceC2425m.a aVar5 = InterfaceC2425m.f22370a;
            if (objD == aVar5.a()) {
                objD = b2.e(Boolean.valueOf(legacy.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), t12, 2, t12);
                interfaceC2425m2.u(objD);
            }
            C0 c02 = (C0) objD;
            interfaceC2425m2.O();
            B bA2 = AbstractC1136g.a(c1131b.h(), aVar3.g(), interfaceC2425m2, 48);
            int iA2 = AbstractC2410h.a(interfaceC2425m2, 0);
            I iR2 = interfaceC2425m2.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425m2, aVar);
            InterfaceC5082a interfaceC5082aA2 = aVar4.a();
            if (interfaceC2425m2.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m2.I();
            if (interfaceC2425m2.e()) {
                interfaceC2425m2.h(interfaceC5082aA2);
            } else {
                interfaceC2425m2.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425m2);
            m2.e(interfaceC2425mB2, bA2, aVar4.e());
            m2.e(interfaceC2425mB2, iR2, aVar4.g());
            Function2 function2B2 = aVar4.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar4.f());
            InterfaceC2425m interfaceC2425m4 = interfaceC2425m2;
            AbstractC6783d.d(c1139j, Template4MainContent$lambda$9$lambda$5(c02), null, androidx.compose.animation.f.k(null, aVar3.a(), false, null, 13, null), androidx.compose.animation.f.u(null, aVar3.a(), false, null, 13, null), "SelectPackagesVisibility", i.d(492758735, true, new Template4Kt$Template4MainContent$1$1$1(legacy, paywallViewModel2), interfaceC2425m2, 54), interfaceC2425m4, 1797126, 2);
            AbstractC6783d.d(c1139j, Template4MainContent$lambda$9$lambda$5(c02), null, null, null, null, ComposableSingletons$Template4Kt.INSTANCE.m864getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425m4, 1572870, 30);
            ConsistentPackageContentViewKt.ConsistentPackageContentView(legacy, i.d(-1316875667, true, new Template4Kt$Template4MainContent$1$1$2(currentColors), interfaceC2425m4, 54), interfaceC2425m4, (i12 & 14) | 48);
            interfaceC2425m4.x();
            int i13 = i12 & 112;
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(legacy, paywallViewModel2, null, 0.0f, null, interfaceC2425m4, i12 & 126, 28);
            legacy2 = legacy;
            TemplateConfiguration templateConfiguration = legacy2.getTemplateConfiguration();
            interfaceC2425m4.V(-1434895273);
            Object objD2 = interfaceC2425m4.D();
            if (objD2 == aVar5.a()) {
                objD2 = new Template4Kt$Template4MainContent$1$2$1(c02);
                interfaceC2425m4.u(objD2);
            }
            interfaceC2425m4.O();
            paywallViewModel2 = paywallViewModel;
            FooterKt.Footer(templateConfiguration, paywallViewModel2, null, null, (InterfaceC5082a) objD2, interfaceC2425m4, i13 | 24576, 12);
            interfaceC2425m3 = interfaceC2425m4;
            interfaceC2425m3.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m3.k();
        if (b1K != null) {
            b1K.a(new C44792(legacy2, paywallViewModel2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template4MainContent$lambda$9$lambda$5(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4MainContent$lambda$9$lambda$6(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4PaywallFooterCondensedPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1780033640);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1780033640, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallFooterCondensedPreview (Template4.kt:485)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44801.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate4Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44812(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4PaywallFooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1022674125);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1022674125, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallFooterPreview (Template4.kt:474)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44821.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate4Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44832(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4PaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1574269896);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1574269896, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallPreview (Template4.kt:463)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44841.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate4Offering(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44852(i10));
        }
    }
}
