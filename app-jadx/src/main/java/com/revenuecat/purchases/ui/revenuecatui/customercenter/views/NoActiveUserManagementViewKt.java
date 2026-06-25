package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
import U.j0;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.InfoKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import g0.i;
import g1.C4830j;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import x0.C7032d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ac\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "screen", "", "contactEmail", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "supportTickets", "Lcom/revenuecat/purchases/Offering;", "offering", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "virtualCurrencies", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;", "LTd/L;", "onAction", "NoActiveUserManagementView", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lkotlin/jvm/functions/Function1;LY/m;II)V", com.amazon.a.a.o.b.f34626S, com.amazon.a.a.o.b.f34645c, "Landroidx/compose/ui/e;", "modifier", "ContentUnavailableView", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/e;LY/m;II)V", "NoActiveUserManagementView_Preview", "(LY/m;I)V", "NoActiveUserManagementView_WithVCs_Preview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NoActiveUserManagementViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$ContentUnavailableView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ String $description;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2) {
            super(2);
            this.$title = str;
            this.$description = str2;
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
                AbstractC2454w.U(-805166926, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ContentUnavailableView.<anonymous> (NoActiveUserManagementView.kt:118)");
            }
            e.a aVar = e.f26613a;
            e eVarH = s.h(aVar, 0.0f, 1, null);
            CustomerCenterUIConstants customerCenterUIConstants = CustomerCenterUIConstants.INSTANCE;
            e eVarJ = p.j(eVarH, customerCenterUIConstants.m661getContentUnavailableViewPaddingHorizontalD9Ej5fM(), customerCenterUIConstants.m663getContentUnavailableViewPaddingVerticalD9Ej5fM());
            e.b bVarG = l0.e.f52304a.g();
            String str = this.$title;
            String str2 = this.$description;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), bVarG, interfaceC2425m, 48);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarJ);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            C7032d info = InfoKt.getInfo();
            D d10 = D.f17597a;
            int i11 = D.f17598b;
            U.B.b(info, null, s.r(aVar, customerCenterUIConstants.m660getContentUnavailableIconSizeD9Ej5fM()), d10.a(interfaceC2425m, i11).w(), interfaceC2425m, 432, 0);
            Y0 y0O = d10.c(interfaceC2425m, i11).o();
            j0.b(str, p.m(aVar, 0.0f, customerCenterUIConstants.m662getContentUnavailableViewPaddingTextD9Ej5fM(), 0.0f, 0.0f, 13, null), d10.a(interfaceC2425m, i11).w(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y0O, interfaceC2425m, 48, 0, 65528);
            interfaceC2425m.V(-1018767756);
            if (str2 != null) {
                Y0 y0C = d10.c(interfaceC2425m, i11).c();
                j0.b(str2, p.m(aVar, 0.0f, customerCenterUIConstants.m662getContentUnavailableViewPaddingTextD9Ej5fM(), 0.0f, 0.0f, 13, null), d10.a(interfaceC2425m, i11).w(), 0L, null, null, null, 0L, null, C4830j.h(C4830j.f47278b.a()), 0L, 0, false, 0, 0, null, y0C, interfaceC2425m, 48, 0, 65016);
            }
            interfaceC2425m.O();
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$ContentUnavailableView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $description;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$title = str;
            this.$description = str2;
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
            NoActiveUserManagementViewKt.ContentUnavailableView(this.$title, this.$description, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$NoActiveUserManagementView$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43842 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ Function1 $onAction;
        final /* synthetic */ CustomerCenterConfigData.Screen $screen;
        final /* synthetic */ CustomerCenterConfigData.Support.SupportTickets $supportTickets;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43842(CustomerCenterConfigData.Screen screen, String str, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, CustomerCenterConfigData.Support.SupportTickets supportTickets, Offering offering, VirtualCurrencies virtualCurrencies, Function1 function1, int i10, int i11) {
            super(2);
            this.$screen = screen;
            this.$contactEmail = str;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$supportTickets = supportTickets;
            this.$offering = offering;
            this.$virtualCurrencies = virtualCurrencies;
            this.$onAction = function1;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            NoActiveUserManagementViewKt.NoActiveUserManagementView(this.$screen, this.$contactEmail, this.$appearance, this.$localization, this.$supportTickets, this.$offering, this.$virtualCurrencies, this.$onAction, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$NoActiveUserManagementView_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43851 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $noActiveScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43851(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$noActiveScreen = screen;
            this.$testData = customerCenterConfigData;
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
                AbstractC2454w.U(403847802, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_Preview.<anonymous> (NoActiveUserManagementView.kt:162)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), D.f17597a.a(interfaceC2425m, D.f17598b).c(), null, 2, null);
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarD);
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
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            NoActiveUserManagementViewKt.NoActiveUserManagementView(screen, "support@example.com", CustomerCenterConfigTestData.INSTANCE.getStandardAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), null, null, NoActiveUserManagementViewKt$NoActiveUserManagementView_Preview$1$1$1.INSTANCE, interfaceC2425m, 12779568, 64);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$NoActiveUserManagementView_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43862 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43862(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            NoActiveUserManagementViewKt.NoActiveUserManagementView_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$NoActiveUserManagementView_WithVCs_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43871 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Screen $noActiveScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43871(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$noActiveScreen = screen;
            this.$testData = customerCenterConfigData;
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
                AbstractC2454w.U(-793311143, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_WithVCs_Preview.<anonymous> (NoActiveUserManagementView.kt:194)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(s.f(androidx.compose.ui.e.f26613a, 0.0f, 1, null), D.f17597a.a(interfaceC2425m, D.f17598b).c(), null, 2, null);
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarD);
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
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            NoActiveUserManagementViewKt.NoActiveUserManagementView(screen, "support@example.com", customerCenterConfigTestData.getStandardAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), null, customerCenterConfigTestData.getFiveVirtualCurrencies(), NoActiveUserManagementViewKt$NoActiveUserManagementView_WithVCs_Preview$1$1$1.INSTANCE, interfaceC2425m, 12779568, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt$NoActiveUserManagementView_WithVCs_Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43882 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43882(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            NoActiveUserManagementViewKt.NoActiveUserManagementView_WithVCs_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ContentUnavailableView(java.lang.String r20, java.lang.String r21, androidx.compose.ui.e r22, Y.InterfaceC2425m r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt.ContentUnavailableView(java.lang.String, java.lang.String, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NoActiveUserManagementView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen r24, java.lang.String r25, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r26, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r27, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets r28, com.revenuecat.purchases.Offering r29, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r30, kotlin.jvm.functions.Function1 r31, Y.InterfaceC2425m r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt.NoActiveUserManagementView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen, java.lang.String, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets, com.revenuecat.purchases.Offering, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NoActiveUserManagementView_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(109169625);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(109169625, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_Preview (NoActiveUserManagementView.kt:157)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(403847802, true, new C43851(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43862(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NoActiveUserManagementView_WithVCs_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1469396296);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1469396296, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_WithVCs_Preview (NoActiveUserManagementView.kt:189)");
            }
            CustomerCenterConfigData customerCenterConfigDataCustomerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            CustomerCenterConfigData.Screen screen = customerCenterConfigDataCustomerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            AbstractC5504s.e(screen);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-793311143, true, new C43871(screen, customerCenterConfigDataCustomerCenterData$default), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43882(i10));
        }
    }
}
