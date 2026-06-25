package com.revenuecat.purchases.ui.revenuecatui;

import C.A;
import C.P;
import C.S;
import C.X;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.P;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.b2;
import Y.m2;
import android.os.Build;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.window.a;
import androidx.compose.ui.window.k;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import e.AbstractC4633a;
import g0.i;
import h0.d;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2 \b\u0002\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006!²\u0006\u000e\u0010\u001e\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;", "paywallDialogOptions", "LTd/L;", "PaywallDialog", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;LY/m;I)V", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "offeringSelection", "Lkotlin/Function1;", "onDismissRequest", "PaywallDialogContent", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lkotlin/jvm/functions/Function1;LY/m;I)V", "Lkotlin/Function0;", "handleCloseRequest", "content", "PaywallDialogScaffold", "(Lie/a;Lkotlin/jvm/functions/Function2;LY/m;I)V", "dismissRequest", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "dismissRequestWithExitOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "buildPaywallOptions", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallDialogOptions;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;Lie/a;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "", "getDialogMaxHeightPercentage", "(LY/m;I)F", "", "shouldUsePlatformDefaultWidth", "(LY/m;I)Z", "shouldDisplayDialog", "currentDialogOffering", "pendingExitOffering", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallDialogKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(PaywallDialogOptions paywallDialogOptions, int i10) {
            super(2);
            this.$paywallDialogOptions = paywallDialogOptions;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallDialogKt.PaywallDialog(this.$paywallDialogOptions, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialogContent$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PaywallOptions $paywallOptions;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel) {
            super(2);
            this.$paywallOptions = paywallOptions;
            this.$viewModel = paywallViewModel;
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
                AbstractC2454w.U(-1280632207, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogContent.<anonymous> (PaywallDialog.kt:141)");
            }
            InternalPaywallKt.InternalPaywall(this.$paywallOptions, this.$viewModel, interfaceC2425m, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialogContent$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ OfferingSelection $offeringSelection;
        final /* synthetic */ Function1 $onDismissRequest;
        final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, Function1 function1, int i10) {
            super(2);
            this.$paywallDialogOptions = paywallDialogOptions;
            this.$offeringSelection = offeringSelection;
            this.$onDismissRequest = function1;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallDialogKt.PaywallDialogContent(this.$paywallDialogOptions, this.$offeringSelection, this.$onDismissRequest, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialogScaffold$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function2 $content;
        final /* synthetic */ float $dialogBottomPadding;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialogScaffold$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC/A;", "paddingValues", "LTd/L;", "invoke", "(LC/A;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06761 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ Function2 $content;
            final /* synthetic */ float $dialogBottomPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06761(float f10, Function2 function2) {
                super(3);
                this.$dialogBottomPadding = f10;
                this.$content = function2;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((A) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(A paddingValues, InterfaceC2425m interfaceC2425m, int i10) {
                int i11;
                AbstractC5504s.h(paddingValues, "paddingValues");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC2425m.U(paddingValues) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(790409931, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold.<anonymous>.<anonymous> (PaywallDialog.kt:176)");
                }
                float f10 = 0;
                boolean z10 = C5015h.q(paddingValues.c(), C5015h.n(f10)) && C5015h.q(paddingValues.d(), C5015h.n(f10));
                e eVarF = s.f(e.f26613a, 0.0f, 1, null);
                boolean z11 = Build.VERSION.SDK_INT <= 34;
                interfaceC2425m.V(196446879);
                boolean z12 = (i11 & 14) == 4;
                Object objD = interfaceC2425m.D();
                if (z12 || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new PaywallDialogKt$PaywallDialogScaffold$1$1$1$1(paddingValues);
                    interfaceC2425m.u(objD);
                }
                interfaceC2425m.O();
                e eVarM = p.m(ModifierExtensionsKt.conditional(eVarF, z11, (Function1) objD), 0.0f, 0.0f, 0.0f, z10 ? this.$dialogBottomPadding : C5015h.n(f10), 7, null);
                Function2 function2 = this.$content;
                B bH = f.h(l0.e.f52304a.o(), false);
                int iA = AbstractC2410h.a(interfaceC2425m, 0);
                I iR = interfaceC2425m.r();
                e eVarF2 = c.f(interfaceC2425m, eVarM);
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
                m2.e(interfaceC2425mB, eVarF2, aVar.f());
                h hVar = h.f26161a;
                function2.invoke(interfaceC2425m, 0);
                interfaceC2425m.x();
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f10, Function2 function2) {
            super(2);
            this.$dialogBottomPadding = f10;
            this.$content = function2;
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
                AbstractC2454w.U(515988412, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold.<anonymous> (PaywallDialog.kt:166)");
            }
            P.a(s.c(s.h(e.f26613a, 0.0f, 1, null), PaywallDialogKt.getDialogMaxHeightPercentage(interfaceC2425m, 0)), null, null, null, null, 0, C6385r0.q(C6385r0.f58985b.a(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, i.d(790409931, true, new C06761(this.$dialogBottomPadding, this.$content), interfaceC2425m, 54), interfaceC2425m, 806879232, 446);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialogScaffold$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ InterfaceC5082a $handleCloseRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC5082a interfaceC5082a, Function2 function2, int i10) {
            super(2);
            this.$handleCloseRequest = interfaceC5082a;
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallDialogKt.PaywallDialogScaffold(this.$handleCloseRequest, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallDialog(PaywallDialogOptions paywallDialogOptions, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        C0 c02;
        AbstractC5504s.h(paywallDialogOptions, "paywallDialogOptions");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1772149319);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(paywallDialogOptions) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1772149319, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialog (PaywallDialog.kt:48)");
            }
            Function1 shouldDisplayBlock = paywallDialogOptions.getShouldDisplayBlock();
            Object[] objArr = new Object[0];
            interfaceC2425mG.V(751319359);
            boolean zU = interfaceC2425mG.U(shouldDisplayBlock);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1(shouldDisplayBlock);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            C0 c03 = (C0) d.e(objArr, null, null, (InterfaceC5082a) objD, interfaceC2425mG, 0, 6);
            interfaceC2425mG.V(751321155);
            if (shouldDisplayBlock != null) {
                interfaceC2425mG.V(751323598);
                boolean zU2 = interfaceC2425mG.U(c03) | interfaceC2425mG.U(shouldDisplayBlock);
                Object objD2 = interfaceC2425mG.D();
                if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new PaywallDialogKt$PaywallDialog$1$1(shouldDisplayBlock, c03, null);
                    interfaceC2425mG.u(objD2);
                }
                interfaceC2425mG.O();
                AbstractC2393b0.e(paywallDialogOptions, (Function2) objD2, interfaceC2425mG, i11 & 14);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.V(751328942);
            Object objD3 = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD3 == aVar.a()) {
                objD3 = b2.e(PaywallDialog$lambda$1(c03) ? paywallDialogOptions.getOfferingSelection$revenuecatui_defaultsBc8Release() : null, null, 2, null);
                interfaceC2425mG.u(objD3);
            }
            C0 c04 = (C0) objD3;
            interfaceC2425mG.O();
            interfaceC2425mG.V(751334886);
            Object objD4 = interfaceC2425mG.D();
            if (objD4 == aVar.a()) {
                objD4 = b2.e(null, null, 2, null);
                interfaceC2425mG.u(objD4);
            }
            C0 c05 = (C0) objD4;
            interfaceC2425mG.O();
            Boolean boolValueOf = Boolean.valueOf(PaywallDialog$lambda$1(c03));
            interfaceC2425mG.V(751338033);
            int i12 = i11 & 14;
            boolean zU3 = interfaceC2425mG.U(c03) | (i12 == 4);
            Object objD5 = interfaceC2425mG.D();
            if (zU3 || objD5 == aVar.a()) {
                objD5 = new PaywallDialogKt$PaywallDialog$2$1(paywallDialogOptions, c03, c04, null);
                interfaceC2425mG.u(objD5);
            }
            interfaceC2425mG.O();
            AbstractC2393b0.e(boolValueOf, (Function2) objD5, interfaceC2425mG, 0);
            interfaceC2425mG.V(751344343);
            boolean zU4 = interfaceC2425mG.U(c03) | (i12 == 4);
            Object objD6 = interfaceC2425mG.D();
            if (zU4 || objD6 == aVar.a()) {
                objD6 = new PaywallDialogKt$PaywallDialog$dismissDialog$1$1(paywallDialogOptions, c04, c03);
                interfaceC2425mG.u(objD6);
            }
            InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD6;
            interfaceC2425mG.O();
            OfferingSelection offeringSelectionPaywallDialog$lambda$5 = PaywallDialog$lambda$5(c04);
            OfferingSelection offeringSelectionPaywallDialog$lambda$8 = PaywallDialog$lambda$8(c05);
            interfaceC2425mG.V(751354892);
            boolean zU5 = interfaceC2425mG.U(shouldDisplayBlock) | interfaceC2425mG.U(interfaceC5082a);
            Object objD7 = interfaceC2425mG.D();
            if (zU5 || objD7 == aVar.a()) {
                PaywallDialogKt$PaywallDialog$3$1 paywallDialogKt$PaywallDialog$3$1 = new PaywallDialogKt$PaywallDialog$3$1(shouldDisplayBlock, interfaceC5082a, c04, c05, null);
                c02 = c05;
                interfaceC2425mG.u(paywallDialogKt$PaywallDialog$3$1);
                objD7 = paywallDialogKt$PaywallDialog$3$1;
            } else {
                c02 = c05;
            }
            interfaceC2425mG.O();
            AbstractC2393b0.d(offeringSelectionPaywallDialog$lambda$5, offeringSelectionPaywallDialog$lambda$8, (Function2) objD7, interfaceC2425mG, 0);
            OfferingSelection offeringSelectionPaywallDialog$lambda$52 = PaywallDialog$lambda$5(c04);
            if (offeringSelectionPaywallDialog$lambda$52 != null) {
                interfaceC2425mG.V(714557138);
                boolean zU6 = interfaceC2425mG.U(interfaceC5082a);
                Object objD8 = interfaceC2425mG.D();
                if (zU6 || objD8 == aVar.a()) {
                    objD8 = new PaywallDialogKt$PaywallDialog$4$1$1(interfaceC5082a, c02, c04);
                    interfaceC2425mG.u(objD8);
                }
                interfaceC2425mG.O();
                PaywallDialogContent(paywallDialogOptions, offeringSelectionPaywallDialog$lambda$52, (Function1) objD8, interfaceC2425mG, i12);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass5(paywallDialogOptions, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PaywallDialog$lambda$1(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaywallDialog$lambda$2(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfferingSelection PaywallDialog$lambda$5(C0 c02) {
        return (OfferingSelection) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfferingSelection PaywallDialog$lambda$8(C0 c02) {
        return (OfferingSelection) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaywallDialogContent(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(217055693);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(paywallDialogOptions) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(offeringSelection) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(217055693, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogContent (PaywallDialog.kt:117)");
            }
            interfaceC2425mG.V(-926326503);
            boolean z10 = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            Object objD = interfaceC2425mG.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = buildPaywallOptions(paywallDialogOptions, offeringSelection, new PaywallDialogKt$PaywallDialogContent$paywallOptions$1$1(function1), new PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2(function1));
                interfaceC2425mG.u(objD);
            }
            PaywallOptions paywallOptions = (PaywallOptions) objD;
            interfaceC2425mG.O();
            PaywallViewModel paywallViewModel = InternalPaywallKt.getPaywallViewModel(paywallOptions, paywallDialogOptions.getShouldDisplayBlock(), interfaceC2425mG, 0, 0);
            L l10 = L.f17438a;
            interfaceC2425mG.V(-926307305);
            boolean zU = interfaceC2425mG.U(paywallViewModel);
            Object objD2 = interfaceC2425mG.D();
            if (zU || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new PaywallDialogKt$PaywallDialogContent$1$1(paywallViewModel, null);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            AbstractC2393b0.e(l10, (Function2) objD2, interfaceC2425mG, 6);
            interfaceC2425mG.V(-926303969);
            boolean zU2 = interfaceC2425mG.U(paywallViewModel);
            Object objD3 = interfaceC2425mG.D();
            if (zU2 || objD3 == InterfaceC2425m.f22370a.a()) {
                objD3 = new PaywallDialogKt$PaywallDialogContent$2$1(paywallViewModel);
                interfaceC2425mG.u(objD3);
            }
            interfaceC2425mG.O();
            PaywallDialogScaffold((InterfaceC5082a) objD3, i.d(-1280632207, true, new AnonymousClass3(paywallOptions, paywallViewModel), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass4(paywallDialogOptions, offeringSelection, function1, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaywallDialogScaffold(InterfaceC5082a interfaceC5082a, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        float fN;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(255737381);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(interfaceC5082a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(255737381, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold (PaywallDialog.kt:149)");
            }
            interfaceC2425mG.V(2017075815);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 > 34) {
                P.a aVar = C.P.f2033a;
                fN = C5015h.n(S.b(X.b(aVar, interfaceC2425mG, 6), interfaceC2425mG, 0).c() + S.b(X.d(aVar, interfaceC2425mG, 6), interfaceC2425mG, 0).d());
            } else {
                fN = C5015h.n(0);
            }
            interfaceC2425mG.O();
            AbstractC4633a.a(false, interfaceC5082a, interfaceC2425mG, (i11 << 3) & 112, 1);
            a.a(interfaceC5082a, new k(false, false, null, shouldUsePlatformDefaultWidth(interfaceC2425mG, 0), i12 <= 34, 7, null), i.d(515988412, true, new AnonymousClass1(fN, function2), interfaceC2425mG, 54), interfaceC2425mG, (i11 & 14) | 384, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(interfaceC5082a, function2, i10));
        }
    }

    private static final PaywallOptions buildPaywallOptions(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, InterfaceC5082a interfaceC5082a, Function2 function2) {
        return new PaywallOptions.Builder(interfaceC5082a).setOfferingSelection$revenuecatui_defaultsBc8Release(offeringSelection).setShouldDisplayDismissButton(paywallDialogOptions.getShouldDisplayDismissButton()).setFontProvider(paywallDialogOptions.getFontProvider()).setListener(paywallDialogOptions.getListener()).setPurchaseLogic(paywallDialogOptions.getPurchaseLogic()).setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(function2).setCustomVariables(paywallDialogOptions.getCustomVariables()).build();
    }

    static /* synthetic */ PaywallOptions buildPaywallOptions$default(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, InterfaceC5082a interfaceC5082a, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        return buildPaywallOptions(paywallDialogOptions, offeringSelection, interfaceC5082a, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getDialogMaxHeightPercentage(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1571840626, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.getDialogMaxHeightPercentage (PaywallDialog.kt:211)");
        }
        if (HelperFunctionsKt.windowAspectRatio(interfaceC2425m, 0) < 1.25f) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            return 1.0f;
        }
        float f10 = WindowHelperKt.hasCompactDimension(interfaceC2425m, 0) ? 1.0f : 0.85f;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return f10;
    }

    private static final boolean shouldUsePlatformDefaultWidth(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2082657643, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.shouldUsePlatformDefaultWidth (PaywallDialog.kt:220)");
        }
        boolean z10 = !WindowHelperKt.hasCompactDimension(interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return z10;
    }
}
