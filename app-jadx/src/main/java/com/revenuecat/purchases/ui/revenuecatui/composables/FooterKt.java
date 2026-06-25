package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.A;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.I;
import I0.B;
import K0.InterfaceC1788g;
import P0.f;
import R0.r;
import Td.L;
import U.AbstractC2174k;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.m2;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ColorsFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template2TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.UrisKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import p0.AbstractC5912g;
import pe.InterfaceC6018h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0003¢\u0006\u0004\b\u000b\u0010\u0011\u001a\u001e\u0010\u0017\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aB\u0010\u001e\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\f\b\u0001\u0010\u001a\u001a\u00020\u0018\"\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010%\u001a\u00020\tH\u0003¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;", "templateConfiguration", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "Landroidx/compose/ui/e;", "childModifier", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "Lkotlin/Function0;", "LTd/L;", "allPlansTapped", "Footer", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Lie/a;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "configuration", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;Lie/a;LY/m;II)V", "LC/I;", "Ls0/r0;", "color", "Separator-RPmYEkk", "(LC/I;JLY/m;I)V", "Separator", "", "", "texts", "action", "Button-sW7UJKQ", "(LC/I;JLandroidx/compose/ui/e;[ILie/a;LY/m;I)V", "Button", "Landroid/content/Context;", "context", "Ljava/net/URL;", "url", "openURL", "(Landroid/content/Context;Ljava/net/URL;)V", "FooterPreview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FooterKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$Footer$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ InterfaceC5082a $allPlansTapped;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration $templateConfiguration;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TemplateConfiguration templateConfiguration, PaywallViewModel paywallViewModel, e eVar, TemplateConfiguration.Colors colors, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$templateConfiguration = templateConfiguration;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$colors = colors;
            this.$allPlansTapped = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            FooterKt.Footer(this.$templateConfiguration, this.$viewModel, this.$childModifier, this.$colors, this.$allPlansTapped, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$Footer$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ InterfaceC5082a $allPlansTapped;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.Configuration $configuration;
        final /* synthetic */ PaywallMode $mode;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallMode paywallMode, PaywallData.Configuration configuration, TemplateConfiguration.Colors colors, PaywallViewModel paywallViewModel, e eVar, InterfaceC5082a interfaceC5082a, int i10, int i11) {
            super(2);
            this.$mode = paywallMode;
            this.$configuration = configuration;
            this.$colors = colors;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$allPlansTapped = interfaceC5082a;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            FooterKt.Footer(this.$mode, this.$configuration, this.$colors, this.$viewModel, this.$childModifier, this.$allPlansTapped, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$FooterPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            FooterKt.FooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$openURL$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "LTd/L;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43011 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43011(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return L.f17438a;
        }

        public final void invoke(Exception exception) {
            AbstractC5504s.h(exception, "exception");
            String string = exception instanceof ActivityNotFoundException ? this.$context.getString(R.string.no_browser_cannot_open_link) : this.$context.getString(R.string.cannot_open_link);
            AbstractC5504s.g(string, "if (exception is Activit…nnot_open_link)\n        }");
            Toast.makeText(this.$context, string, 0).show();
            Logger.INSTANCE.w(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Button-sW7UJKQ, reason: not valid java name */
    public static final void m576ButtonsW7UJKQ(I i10, long j10, e eVar, int[] iArr, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i11) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-806477784);
        int i12 = (i11 & 6) == 0 ? (interfaceC2425mG.U(i10) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 24576) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5082a) ? 16384 : 8192;
        }
        interfaceC2425mG.H(2066969951, Integer.valueOf(iArr.length));
        for (int i13 : iArr) {
            i12 |= interfaceC2425mG.c(i13) ? 2048 : 0;
        }
        interfaceC2425mG.S();
        if ((i12 & 7168) == 0) {
            i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-806477784, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button (Footer.kt:192)");
            }
            String strA = f.a(AbstractC2273n.W(iArr), interfaceC2425mG, 0);
            e.a aVar = e.f26613a;
            int i14 = i12;
            e eVarB = I.b(i10, aVar, 1.0f, false, 2, null);
            e.a aVar2 = l0.e.f52304a;
            androidx.compose.ui.e eVarC = i10.c(eVarB, aVar2.i());
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), aVar2.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarC);
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
            interfaceC2425mG.V(814442768);
            boolean z10 = (i14 & 57344) == 16384;
            Object objD = interfaceC2425mG.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new FooterKt$Button$1$1$1(interfaceC5082a);
                interfaceC2425mG.u(objD);
            }
            InterfaceC6018h interfaceC6018h = (InterfaceC6018h) objD;
            interfaceC2425mG.O();
            A a10 = p.a(C5015h.n(4));
            androidx.compose.ui.e eVarB2 = c1139j.b(aVar, aVar2.g());
            interfaceC2425mG.V(814449071);
            boolean zU = interfaceC2425mG.U(strA);
            Object objD2 = interfaceC2425mG.D();
            if (zU || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new FooterKt$Button$1$2$1(strA);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            interfaceC2425m2 = interfaceC2425mG;
            AbstractC2174k.c((InterfaceC5082a) interfaceC6018h, r.e(eVarB2, true, (Function1) objD2), false, null, null, null, null, a10, null, i.d(365963733, true, new FooterKt$Button$1$3(iArr, eVar, j10), interfaceC2425mG, 54), interfaceC2425m2, 817889280, 380);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new FooterKt$Button$2(i10, j10, eVar, iArr, interfaceC5082a, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Footer(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r18, androidx.compose.ui.e r19, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r20, ie.InterfaceC5082a r21, Y.InterfaceC2425m r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt.Footer(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, ie.a, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1861228911);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1861228911, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.FooterPreview (Footer.kt:270)");
            }
            PaywallMode paywallMode = PaywallMode.FULL_SCREEN;
            List listM = AbstractC2279u.m();
            URL url = new URL("https://revenuecat.com/tos");
            URL url2 = new URL("https://revenuecat.com/privacy");
            PaywallData.Configuration.Images images = new PaywallData.Configuration.Images((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            TestData testData = TestData.INSTANCE;
            byte b10 = 0 == true ? 1 : 0;
            byte b11 = 0 == true ? 1 : 0;
            Footer(paywallMode, new PaywallData.Configuration(listM, (String) null, images, (Map) b11, Template2TestDataKt.getTemplate2(testData).getConfig().getColors(), (Map) null, (List) b10, false, true, url, url2, 104, (DefaultConstructorMarker) null), ColorsFactory.INSTANCE.create(Template2TestDataKt.getTemplate2(testData).getConfig().getColors().getLight()), new MockViewModel(paywallMode, testData.getTemplate2Offering(), null, false, false, 28, 0 == true ? 1 : 0), null, null, interfaceC2425mG, 6, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Separator-RPmYEkk, reason: not valid java name */
    public static final void m577SeparatorRPmYEkk(I i10, long j10, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1035469312);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.U(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1035469312, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Separator (Footer.kt:169)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarH = s.h(aVar, 0.0f, 1, null);
            e.a aVar2 = l0.e.f52304a;
            androidx.compose.ui.e eVarB = I.b(i10, s.B(eVarH, aVar2.e(), false, 2, null), 0.5f, false, 2, null);
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), aVar2.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarB);
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
            androidx.compose.foundation.layout.f.a(b.d(AbstractC5912g.a(s.r(aVar, C5015h.n(5)), J.i.g()), j10, null, 2, null), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new FooterKt$Separator$2(i10, j10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openURL(Context context, URL url) {
        String string = url.toString();
        AbstractC5504s.g(string, "url.toString()");
        UrisKt.openUriOrElse(context, string, new C43011(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Footer(com.revenuecat.purchases.ui.revenuecatui.PaywallMode r23, com.revenuecat.purchases.paywalls.PaywallData.Configuration r24, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r25, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r26, androidx.compose.ui.e r27, ie.InterfaceC5082a r28, Y.InterfaceC2425m r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt.Footer(com.revenuecat.purchases.ui.revenuecatui.PaywallMode, com.revenuecat.purchases.paywalls.PaywallData$Configuration, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, ie.a, Y.m, int, int):void");
    }
}
