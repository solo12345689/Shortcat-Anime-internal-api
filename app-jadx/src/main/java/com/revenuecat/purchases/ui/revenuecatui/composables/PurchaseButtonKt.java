package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.InterfaceC1132c;
import Td.L;
import U.K;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.animation.f;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.TestTag;
import g0.i;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import v.AbstractC6783d;
import v.InterfaceC6784e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a@\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aJ\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a$\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001f\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\nH\u0003¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "Landroidx/compose/ui/e;", "childModifier", "Li1/h;", "horizontalPadding", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "LTd/L;", "PurchaseButton-hGBTI10", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroidx/compose/ui/e;FLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;II)V", TestTag.PURCHASE_BUTTON_TAG, "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;", "packages", "LY/C0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "selectedPackage", "PurchaseButton-WH-ejsw", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;FLandroidx/compose/ui/e;LY/m;II)V", "Ls0/r0;", "primaryColor", "secondaryColor", "Ls0/h0;", "buttonBrush-A47ccPs", "(JLs0/r0;LY/m;I)Ls0/h0;", "buttonBrush", "LC/c;", "", "shouldShow", "LoadingSpinner", "(LC/c;ZLcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "PurchaseButtonPreview", "(LY/m;I)V", "", "labelOpacity", "primaryCTAColor", "secondaryCTAColorState", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseButtonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$LoadingSpinner$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ InterfaceC1132c $this_LoadingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TemplateConfiguration.Colors colors, InterfaceC1132c interfaceC1132c) {
            super(3);
            this.$colors = colors;
            this.$this_LoadingSpinner = interfaceC1132c;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1498164238, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.LoadingSpinner.<anonymous> (PurchaseButton.kt:190)");
            }
            K.a(this.$this_LoadingSpinner.b(e.f26613a, l0.e.f52304a.e()), this.$colors.m783getCallToActionForeground0d7_KjU(), 0.0f, 0L, 0, interfaceC2425m, 0, 28);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$LoadingSpinner$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $shouldShow;
        final /* synthetic */ InterfaceC1132c $this_LoadingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC1132c interfaceC1132c, boolean z10, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$this_LoadingSpinner = interfaceC1132c;
            this.$shouldShow = z10;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseButtonKt.LoadingSpinner(this.$this_LoadingSpinner, this.$shouldShow, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$PurchaseButtonPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43071 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43071(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PurchaseButtonKt.PurchaseButtonPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void LoadingSpinner(InterfaceC1132c interfaceC1132c, boolean z10, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        boolean z11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-268216038);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1132c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(colors) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            z11 = z10;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-268216038, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.LoadingSpinner (PurchaseButton.kt:182)");
            }
            e eVarB = interfaceC1132c.b(e.f26613a, l0.e.f52304a.e());
            UIConstant uIConstant = UIConstant.INSTANCE;
            z11 = z10;
            AbstractC6783d.e(z11, eVarB, f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), "PurchaseButton.LoadingSpinner", i.d(-1498164238, true, new AnonymousClass1(colors, interfaceC1132c), interfaceC2425mG, 54), interfaceC2425mG, ((i11 >> 3) & 14) | 221184, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(interfaceC1132c, z11, colors, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: PurchaseButton-WH-ejsw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m615PurchaseButtonWHejsw(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r29, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration r30, Y.C0 r31, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r32, float r33, androidx.compose.ui.e r34, Y.InterfaceC2425m r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.m615PurchaseButtonWHejsw(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageConfiguration, Y.C0, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, float, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0128  */
    /* JADX INFO: renamed from: PurchaseButton-hGBTI10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m616PurchaseButtonhGBTI10(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r13, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r14, androidx.compose.ui.e r15, float r16, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r17, Y.InterfaceC2425m r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.m616PurchaseButtonhGBTI10(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, float, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, Y.m, int, int):void");
    }

    public static final void PurchaseButtonPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1498117025);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1498117025, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonPreview (PurchaseButton.kt:199)");
            }
            MockViewModel mockViewModel = new MockViewModel(null, TestData.INSTANCE.getTemplate2Offering(), null, true, false, 21, null);
            PaywallState.Loaded.Legacy legacyLoadedLegacyState = mockViewModel.loadedLegacyState();
            if (legacyLoadedLegacyState != null) {
                m616PurchaseButtonhGBTI10(legacyLoadedLegacyState, mockViewModel, null, 0.0f, null, interfaceC2425mG, 0, 28);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43071(i10));
        }
    }

    public static final float PurchaseButton_WH_ejsw$lambda$6$lambda$0(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    private static final long PurchaseButton_WH_ejsw$lambda$6$lambda$1(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }

    private static final long PurchaseButton_WH_ejsw$lambda$6$lambda$2(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX INFO: renamed from: buttonBrush-A47ccPs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final s0.AbstractC6358h0 m618buttonBrushA47ccPs(long r7, s0.C6385r0 r9, Y.InterfaceC2425m r10, int r11) {
        /*
            boolean r10 = Y.AbstractC2454w.L()
            if (r10 == 0) goto Lf
            r10 = -1
            java.lang.String r0 = "com.revenuecat.purchases.ui.revenuecatui.composables.buttonBrush (PurchaseButton.kt:170)"
            r1 = -58833710(0xfffffffffc7e44d2, float:-5.280957E36)
            Y.AbstractC2454w.U(r1, r11, r10, r0)
        Lf:
            if (r9 == 0) goto L33
            long r9 = r9.A()
            s0.h0$a r0 = s0.AbstractC6358h0.Companion
            s0.r0 r11 = s0.C6385r0.m(r7)
            s0.r0 r9 = s0.C6385r0.m(r9)
            s0.r0[] r9 = new s0.C6385r0[]{r11, r9}
            java.util.List r1 = Ud.AbstractC2279u.p(r9)
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            s0.h0 r9 = s0.AbstractC6358h0.a.c(r0, r1, r2, r3, r4, r5, r6)
            if (r9 != 0) goto L39
        L33:
            s0.F1 r9 = new s0.F1
            r10 = 0
            r9.<init>(r7, r10)
        L39:
            boolean r7 = Y.AbstractC2454w.L()
            if (r7 == 0) goto L42
            Y.AbstractC2454w.T()
        L42:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.m618buttonBrushA47ccPs(long, s0.r0, Y.m, int):s0.h0");
    }
}
