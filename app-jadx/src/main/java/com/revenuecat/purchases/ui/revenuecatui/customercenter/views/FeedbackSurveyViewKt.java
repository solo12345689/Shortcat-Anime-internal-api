package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.b2;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.FeedbackSurveyData;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\u000e\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;", "data", "LTd/L;", "FeedbackSurveyView", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;LY/m;I)V", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "options", "Lkotlin/Function1;", "onAnswerSubmit", "", "loadingOption", "Landroidx/compose/ui/e;", "modifier", "FeedbackSurveyButtonsView", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/e;LY/m;II)V", "FeedbackSurveyPreview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class FeedbackSurveyViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt$FeedbackSurveyButtonsView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $loadingOption;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onAnswerSubmit;
        final /* synthetic */ List<CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option> $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option> list, Function1 function1, String str, e eVar, int i10, int i11) {
            super(2);
            this.$options = list;
            this.$onAnswerSubmit = function1;
            this.$loadingOption = str;
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
            FeedbackSurveyViewKt.FeedbackSurveyButtonsView(this.$options, this.$onAnswerSubmit, this.$loadingOption, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt$FeedbackSurveyPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "<anonymous parameter 0>", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43822 extends AbstractC5506u implements Function1 {
        public static final C43822 INSTANCE = new C43822();

        C43822() {
            super(1);
        }

        public final void invoke(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt$FeedbackSurveyPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            FeedbackSurveyViewKt.FeedbackSurveyPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt$FeedbackSurveyView$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C43832 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ FeedbackSurveyData $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43832(FeedbackSurveyData feedbackSurveyData, int i10) {
            super(2);
            this.$data = feedbackSurveyData;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            FeedbackSurveyViewKt.FeedbackSurveyView(this.$data, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void FeedbackSurveyButtonsView(java.util.List r22, kotlin.jvm.functions.Function1 r23, java.lang.String r24, androidx.compose.ui.e r25, Y.InterfaceC2425m r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt.FeedbackSurveyButtonsView(java.util.List, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final /* synthetic */ void FeedbackSurveyPreview(InterfaceC2425m interfaceC2425m, int i10) {
        List<CustomerCenterConfigData.HelpPath> paths;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1976778683);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1976778683, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyPreview (FeedbackSurveyView.kt:72)");
            }
            helpPath = null;
            CustomerCenterConfigData.Screen managementScreen = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getManagementScreen();
            if (managementScreen != null && (paths = managementScreen.getPaths()) != null) {
                for (CustomerCenterConfigData.HelpPath helpPath : paths) {
                    if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            AbstractC5504s.e(helpPath);
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = helpPath.getFeedbackSurvey();
            AbstractC5504s.e(feedbackSurvey);
            FeedbackSurveyView(new FeedbackSurveyData(feedbackSurvey, C43822.INSTANCE), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(i10));
        }
    }

    public static final /* synthetic */ void FeedbackSurveyView(FeedbackSurveyData data, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(data, "data");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1091362999);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(data) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1091362999, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyView (FeedbackSurveyView.kt:27)");
            }
            interfaceC2425mG.V(125160704);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = b2.e(null, null, 2, null);
                interfaceC2425mG.u(objD);
            }
            C0 c02 = (C0) objD;
            interfaceC2425mG.O();
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = data.getFeedbackSurvey();
            e.a aVar2 = e.f26613a;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, aVar2);
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
            List<CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option> options = feedbackSurvey.getOptions();
            interfaceC2425mG.V(-250247028);
            boolean zF = interfaceC2425mG.F(data);
            Object objD2 = interfaceC2425mG.D();
            if (zF || objD2 == aVar.a()) {
                objD2 = new FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1(data, c02);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            FeedbackSurveyButtonsView(options, (Function1) objD2, FeedbackSurveyView$lambda$1(c02), null, interfaceC2425mG, 0, 8);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43832(data, i10));
        }
    }

    private static final String FeedbackSurveyView$lambda$1(C0 c02) {
        return (String) c02.getValue();
    }
}
