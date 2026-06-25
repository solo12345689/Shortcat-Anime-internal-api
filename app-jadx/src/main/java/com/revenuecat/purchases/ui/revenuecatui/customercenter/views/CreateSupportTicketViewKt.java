package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.K;
import Df.r;
import I0.B;
import K.C1772w;
import K.C1773x;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
import U.H;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import Y.m2;
import a1.C2551s;
import a1.C2558z;
import android.util.Patterns;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.q1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonConfig;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import g0.InterfaceC4820b;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6062h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u001a=\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010$\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a7\u0010(\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\"2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b(\u0010)\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061²\u0006\u000e\u0010\u000f\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\"8\nX\u008a\u0084\u0002²\u0006\u0012\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\"8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;", "data", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Landroidx/compose/ui/e;", "modifier", "", "initialEmail", "initialDescription", "LTd/L;", "CreateSupportTicketView", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LY/m;II)V", "CreateSupportTicketView_Preview", "(LY/m;I)V", "CreateSupportTicketView_WithDataPreview", "email", "", "isValidEmail", "(Ljava/lang/String;)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/EmailInputState;", "emailState", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;", "descriptionState", "isSubmitting", "CreateSupportTicketContent", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/EmailInputState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;ZLcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V", "state", "Lq0/h;", "focusManager", "EmailInputField", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/EmailInputState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lq0/h;LY/m;I)V", "DescriptionInputField", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V", com.amazon.a.a.o.b.f34645c, "Lkotlin/Function0;", "onSubmit", "SubmitTicketButton", "(Ljava/lang/String;Ljava/lang/String;ZLie/a;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V", "hasError", "onErrorShow", "ErrorSnackbar", "(ZLie/a;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;LY/m;II)V", "", "MAX_DESCRIPTION_LENGTH", "I", "emailDirty", "emailHasFocus", "currentOnSubmit", "currentOnErrorShow", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class CreateSupportTicketViewKt {
    private static final int MAX_DESCRIPTION_LENGTH = 250;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$CreateSupportTicketContent$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ DescriptionInputState $descriptionState;
        final /* synthetic */ EmailInputState $emailState;
        final /* synthetic */ boolean $isSubmitting;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(EmailInputState emailInputState, DescriptionInputState descriptionInputState, boolean z10, CustomerCenterConfigData.Localization localization, int i10) {
            super(2);
            this.$emailState = emailInputState;
            this.$descriptionState = descriptionInputState;
            this.$isSubmitting = z10;
            this.$localization = localization;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.CreateSupportTicketContent(this.$emailState, this.$descriptionState, this.$isSubmitting, this.$localization, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$CreateSupportTicketView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C43722 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CreateSupportTicketData $data;
        final /* synthetic */ String $initialDescription;
        final /* synthetic */ String $initialEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43722(CreateSupportTicketData createSupportTicketData, CustomerCenterConfigData.Localization localization, e eVar, String str, String str2, int i10, int i11) {
            super(2);
            this.$data = createSupportTicketData;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$initialEmail = str;
            this.$initialDescription = str2;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.CreateSupportTicketView(this.$data, this.$localization, this.$modifier, this.$initialEmail, this.$initialDescription, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$CreateSupportTicketView_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CreateSupportTicketData $mockData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CreateSupportTicketData createSupportTicketData) {
            super(2);
            this.$mockData = createSupportTicketData;
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
                AbstractC2454w.U(-1460784282, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_Preview.<anonymous> (CreateSupportTicketView.kt:126)");
            }
            e eVarD = androidx.compose.foundation.b.d(s.f(e.f26613a, 0.0f, 1, null), D.f17597a.a(interfaceC2425m, D.f17598b).c(), null, 2, null);
            CreateSupportTicketData createSupportTicketData = this.$mockData;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarD);
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
            CreateSupportTicketViewKt.CreateSupportTicketView(createSupportTicketData, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), null, null, null, interfaceC2425m, 0, 28);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$CreateSupportTicketView_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43732 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43732(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.CreateSupportTicketView_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43741 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CreateSupportTicketData $mockData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43741(CreateSupportTicketData createSupportTicketData) {
            super(2);
            this.$mockData = createSupportTicketData;
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
                AbstractC2454w.U(1169956790, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_WithDataPreview.<anonymous> (CreateSupportTicketView.kt:148)");
            }
            e eVarD = androidx.compose.foundation.b.d(s.f(e.f26613a, 0.0f, 1, null), D.f17597a.a(interfaceC2425m, D.f17598b).c(), null, 2, null);
            CreateSupportTicketData createSupportTicketData = this.$mockData;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarD);
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
            CreateSupportTicketViewKt.CreateSupportTicketView(createSupportTicketData, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), null, "user@example.com", "I'm having an issue with my subscription.", interfaceC2425m, 27648, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43752 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43752(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.CreateSupportTicketView_WithDataPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$DescriptionInputField$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43762 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43762(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(870248988, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputField.<anonymous> (CreateSupportTicketView.kt:291)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DESCRIPTION), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$DescriptionInputField$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ String $remainingCharsText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(2);
            this.$remainingCharsText = str;
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
                AbstractC2454w.U(-1857613335, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputField.<anonymous> (CreateSupportTicketView.kt:298)");
            }
            j0.b(this.$remainingCharsText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425m, D.f17598b).d(), interfaceC2425m, 0, 0, 65534);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$DescriptionInputField$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ DescriptionInputState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(DescriptionInputState descriptionInputState, CustomerCenterConfigData.Localization localization, int i10) {
            super(2);
            this.$state = descriptionInputState;
            this.$localization = localization;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.DescriptionInputField(this.$state, this.$localization, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$EmailInputField$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43771 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43771(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(-959949005, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField.<anonymous> (CreateSupportTicketView.kt:249)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.INVALID_EMAIL_ERROR), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$EmailInputField$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43784 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43784(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(-664568609, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField.<anonymous> (CreateSupportTicketView.kt:233)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.EMAIL), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$EmailInputField$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(1544555872, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField.<anonymous> (CreateSupportTicketView.kt:240)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.ENTER_EMAIL), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$EmailInputField$6 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass6 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ InterfaceC6062h $focusManager;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ EmailInputState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(EmailInputState emailInputState, CustomerCenterConfigData.Localization localization, InterfaceC6062h interfaceC6062h, int i10) {
            super(2);
            this.$state = emailInputState;
            this.$localization = localization;
            this.$focusManager = interfaceC6062h;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.EmailInputField(this.$state, this.$localization, this.$focusManager, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$ErrorSnackbar$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43792 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $hasError;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ InterfaceC5082a $onErrorShow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43792(boolean z10, InterfaceC5082a interfaceC5082a, CustomerCenterConfigData.Localization localization, e eVar, int i10, int i11) {
            super(2);
            this.$hasError = z10;
            this.$onErrorShow = interfaceC5082a;
            this.$localization = localization;
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
            CreateSupportTicketViewKt.ErrorSnackbar(this.$hasError, this.$onErrorShow, this.$localization, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt$SubmitTicketButton$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43801 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $description;
        final /* synthetic */ String $email;
        final /* synthetic */ boolean $isSubmitting;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onSubmit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43801(String str, String str2, boolean z10, InterfaceC5082a interfaceC5082a, CustomerCenterConfigData.Localization localization, int i10) {
            super(2);
            this.$email = str;
            this.$description = str2;
            this.$isSubmitting = z10;
            this.$onSubmit = interfaceC5082a;
            this.$localization = localization;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            CreateSupportTicketViewKt.SubmitTicketButton(this.$email, this.$description, this.$isSubmitting, this.$onSubmit, this.$localization, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void CreateSupportTicketContent(EmailInputState emailInputState, DescriptionInputState descriptionInputState, boolean z10, CustomerCenterConfigData.Localization localization, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1823655295);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(emailInputState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(descriptionInputState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.F(localization) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i11 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1823655295, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketContent (CreateSupportTicketView.kt:191)");
            }
            e.a aVar = e.f26613a;
            e eVarF = s.f(aVar, 0.0f, 1, null);
            CustomerCenterConstants.Layout layout = CustomerCenterConstants.Layout.INSTANCE;
            e eVarF2 = m.f(p.i(eVarF, layout.m657getSECTION_SPACINGD9Ej5fM()), m.c(0, interfaceC2425mG, 0, 1), false, null, false, 14, null);
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF3 = androidx.compose.ui.c.f(interfaceC2425mG, eVarF2);
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
            m2.e(interfaceC2425mB, eVarF3, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            int i12 = (i11 >> 6) & 112;
            EmailInputField(emailInputState, localization, (InterfaceC6062h) interfaceC2425mG.n(AbstractC2739w0.f()), interfaceC2425mG, (i11 & 14) | i12);
            K.a(s.i(aVar, layout.m658getSECTION_TITLE_BOTTOM_PADDINGD9Ej5fM()), interfaceC2425mG, 6);
            DescriptionInputField(descriptionInputState, localization, interfaceC2425mG, ((i11 >> 3) & 14) | i12);
            K.a(s.i(aVar, layout.m657getSECTION_SPACINGD9Ej5fM()), interfaceC2425mG, 6);
            SubmitTicketButton(emailInputState.getEmail(), descriptionInputState.getDescription(), z10, descriptionInputState.getOnSubmit(), localization, interfaceC2425mG, (i11 & 896) | ((i11 << 3) & 57344));
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(emailInputState, descriptionInputState, z10, localization, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void CreateSupportTicketView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData r27, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r28, androidx.compose.ui.e r29, java.lang.String r30, java.lang.String r31, Y.InterfaceC2425m r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt.CreateSupportTicketView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, java.lang.String, java.lang.String, Y.m, int, int):void");
    }

    public static final String CreateSupportTicketView$lambda$1(C0 c02) {
        return (String) c02.getValue();
    }

    private static final boolean CreateSupportTicketView$lambda$10(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    public static final void CreateSupportTicketView$lambda$11(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    private static final boolean CreateSupportTicketView$lambda$12(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    public static final void CreateSupportTicketView$lambda$13(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    public static final boolean CreateSupportTicketView$lambda$3(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    public static final void CreateSupportTicketView$lambda$4(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    private static final boolean CreateSupportTicketView$lambda$5(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    public static final void CreateSupportTicketView$lambda$6(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    public static final String CreateSupportTicketView$lambda$8(C0 c02) {
        return (String) c02.getValue();
    }

    public static final void CreateSupportTicketView_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1094842373);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1094842373, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_Preview (CreateSupportTicketView.kt:119)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-1460784282, true, new AnonymousClass1(new CreateSupportTicketData(CreateSupportTicketViewKt$CreateSupportTicketView_Preview$mockData$1.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_Preview$mockData$2.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_Preview$mockData$3.INSTANCE)), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43732(i10));
        }
    }

    public static final void CreateSupportTicketView_WithDataPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1452070229);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1452070229, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_WithDataPreview (CreateSupportTicketView.kt:141)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1169956790, true, new C43741(new CreateSupportTicketData(CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$mockData$1.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$mockData$2.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$mockData$3.INSTANCE)), interfaceC2425mG, 54), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43752(i10));
        }
    }

    public static final void DescriptionInputField(DescriptionInputState descriptionInputState, CustomerCenterConfigData.Localization localization, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-202186622);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(descriptionInputState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(localization) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-202186622, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputField (CreateSupportTicketView.kt:278)");
            }
            String strK = r.K(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.CHARACTERS_REMAINING), "{{ count }}", descriptionInputState.getDescription().length() + " / 250", false, 4, null);
            h2 h2VarO = U1.o(descriptionInputState.getOnSubmit(), interfaceC2425mG, 0);
            String description = descriptionInputState.getDescription();
            int i12 = i11;
            Function1 onDescriptionChange = descriptionInputState.getOnDescriptionChange();
            boolean enabled = descriptionInputState.getEnabled();
            e eVarA = q1.a(s.i(s.h(e.f26613a, 0.0f, 1, null), C5015h.n(200)), "description_field");
            C1773x c1773x = new C1773x(0, null, 0, C2551s.f23628b.b(), null, null, null, 119, null);
            interfaceC2425mG.V(248605445);
            boolean zU = interfaceC2425mG.U(h2VarO) | ((i12 & 14) == 4);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new CreateSupportTicketViewKt$DescriptionInputField$1$1(descriptionInputState, h2VarO);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            interfaceC2425m2 = interfaceC2425mG;
            H.a(description, onDescriptionChange, eVarA, enabled, false, null, i.d(870248988, true, new C43762(localization), interfaceC2425mG, 54), null, null, null, null, null, i.d(-1857613335, true, new AnonymousClass3(strK), interfaceC2425mG, 54), false, null, c1773x, new C1772w((Function1) objD, null, null, null, null, null, 62, null), false, 10, 6, null, null, null, interfaceC2425m2, 1573248, 906166656, 0, 7499696);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(descriptionInputState, localization, i10));
        }
    }

    public static final InterfaceC5082a DescriptionInputField$lambda$23(h2 h2Var) {
        return (InterfaceC5082a) h2Var.getValue();
    }

    public static final void EmailInputField(EmailInputState emailInputState, CustomerCenterConfigData.Localization localization, InterfaceC6062h interfaceC6062h, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(449665849);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(emailInputState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(localization) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC6062h) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(449665849, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField (CreateSupportTicketView.kt:228)");
            }
            String email = emailInputState.getEmail();
            int i12 = i11;
            Function1 onEmailChange = emailInputState.getOnEmailChange();
            boolean showError = emailInputState.getShowError();
            interfaceC2425mG.V(464966584);
            InterfaceC4820b interfaceC4820bD = emailInputState.getShowError() ? i.d(-959949005, true, new C43771(localization), interfaceC2425mG, 54) : null;
            interfaceC2425mG.O();
            boolean enabled = emailInputState.getEnabled();
            e eVarH = s.h(e.f26613a, 0.0f, 1, null);
            interfaceC2425mG.V(464980338);
            boolean z10 = (i12 & 14) == 4;
            Object objD = interfaceC2425mG.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new CreateSupportTicketViewKt$EmailInputField$2$1(emailInputState);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            e eVarA = q1.a(androidx.compose.ui.focus.b.a(eVarH, (Function1) objD), "email_field");
            C1773x c1773x = new C1773x(0, null, C2558z.f23658b.c(), C2551s.f23628b.d(), null, null, null, 115, null);
            interfaceC2425mG.V(464991337);
            boolean zF = interfaceC2425mG.F(interfaceC6062h);
            Object objD2 = interfaceC2425mG.D();
            if (zF || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new CreateSupportTicketViewKt$EmailInputField$3$1(interfaceC6062h);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            interfaceC2425m2 = interfaceC2425mG;
            H.a(email, onEmailChange, eVarA, enabled, false, null, i.d(-664568609, true, new C43784(localization), interfaceC2425mG, 54), i.d(1544555872, true, new AnonymousClass5(localization), interfaceC2425mG, 54), null, null, null, null, interfaceC4820bD, showError, null, c1773x, new C1772w(null, null, (Function1) objD2, null, null, null, 59, null), true, 0, 0, null, null, null, interfaceC2425m2, 14155776, 12779520, 0, 8146736);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass6(emailInputState, localization, interfaceC6062h, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ErrorSnackbar(boolean r16, ie.InterfaceC5082a r17, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r18, androidx.compose.ui.e r19, Y.InterfaceC2425m r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt.ErrorSnackbar(boolean, ie.a, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final InterfaceC5082a ErrorSnackbar$lambda$26(h2 h2Var) {
        return (InterfaceC5082a) h2Var.getValue();
    }

    public static final void SubmitTicketButton(String str, String str2, boolean z10, InterfaceC5082a interfaceC5082a, CustomerCenterConfigData.Localization localization, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC5082a interfaceC5082a2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1201248039);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC5082a) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.F(localization) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC5082a2 = interfaceC5082a;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1201248039, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SubmitTicketButton (CreateSupportTicketView.kt:324)");
            }
            interfaceC5082a2 = interfaceC5082a;
            SettingsButtonKt.SettingsButton(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SUBMIT_TICKET), interfaceC5082a2, new SettingsButtonConfig((z10 || !isValidEmail(str) || r.l0(str2)) ? false : true, z10), null, null, interfaceC2425mG, (i11 >> 6) & 112, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43801(str, str2, z10, interfaceC5082a2, localization, i10));
        }
    }

    private static final boolean isValidEmail(String str) {
        return !r.l0(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
