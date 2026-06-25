package com.revenuecat.purchases.ui.revenuecatui.composables;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
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
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import g1.C4830j;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "LTd/L;", "OfferDetails", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;II)V", "Ls0/r0;", "color", "OfferDetails-RPmYEkk", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;JLY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OfferDetailsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.Colors colors, int i10, int i11) {
            super(2);
            this.$state = legacy;
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
            OfferDetailsKt.OfferDetails(this.$state, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ long $color;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallState.Loaded.Legacy legacy, long j10, int i10) {
            super(2);
            this.$state = legacy;
            this.$color = j10;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            OfferDetailsKt.m605OfferDetailsRPmYEkk(this.$state, this.$color, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OfferDetails(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r4, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r5, Y.InterfaceC2425m r6, int r7, int r8) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            r0 = -2001121712(0xffffffff88b94e50, float:-1.1152694E-33)
            Y.m r6 = r6.g(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L13
            r1 = r7 | 6
            goto L23
        L13:
            r1 = r7 & 6
            if (r1 != 0) goto L22
            boolean r1 = r6.U(r4)
            if (r1 == 0) goto L1f
            r1 = 4
            goto L20
        L1f:
            r1 = 2
        L20:
            r1 = r1 | r7
            goto L23
        L22:
            r1 = r7
        L23:
            r2 = r7 & 48
            if (r2 != 0) goto L37
            r2 = r8 & 2
            if (r2 != 0) goto L34
            boolean r2 = r6.U(r5)
            if (r2 == 0) goto L34
            r2 = 32
            goto L36
        L34:
            r2 = 16
        L36:
            r1 = r1 | r2
        L37:
            r2 = r1 & 19
            r3 = 18
            if (r2 != r3) goto L48
            boolean r2 = r6.i()
            if (r2 != 0) goto L44
            goto L48
        L44:
            r6.K()
            goto L8f
        L48:
            r6.G()
            r2 = r7 & 1
            if (r2 == 0) goto L60
            boolean r2 = r6.N()
            if (r2 == 0) goto L56
            goto L60
        L56:
            r6.K()
            r2 = r8 & 2
            if (r2 == 0) goto L6e
        L5d:
            r1 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            goto L6e
        L60:
            r2 = r8 & 2
            if (r2 == 0) goto L6e
            com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration r5 = r4.getTemplateConfiguration()
            r2 = 0
            com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors r5 = r5.getCurrentColors(r6, r2)
            goto L5d
        L6e:
            r6.y()
            boolean r2 = Y.AbstractC2454w.L()
            if (r2 == 0) goto L7d
            r2 = -1
            java.lang.String r3 = "com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetails (OfferDetails.kt:25)"
            Y.AbstractC2454w.U(r0, r1, r2, r3)
        L7d:
            long r2 = r5.m786getText10d7_KjU()
            r0 = r1 & 14
            m605OfferDetailsRPmYEkk(r4, r2, r6, r0)
            boolean r0 = Y.AbstractC2454w.L()
            if (r0 == 0) goto L8f
            Y.AbstractC2454w.T()
        L8f:
            Y.B1 r6 = r6.k()
            if (r6 == 0) goto L9d
            com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$1
            r0.<init>(r4, r5, r7, r8)
            r6.a(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt.OfferDetails(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, Y.m, int, int):void");
    }

    /* JADX INFO: renamed from: OfferDetails-RPmYEkk, reason: not valid java name */
    public static final void m605OfferDetailsRPmYEkk(PaywallState.Loaded.Legacy state, long j10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(state, "state");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(683762235);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(683762235, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetails (OfferDetails.kt:37)");
            }
            e.a aVar = e.f26613a;
            e eVarM = p.m(aVar, 0.0f, 0.0f, 0.0f, UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM(), 7, null);
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarM);
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
            IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(PaywallStateKt.getSelectedLocalization(state).getOfferDetails(), PaywallStateKt.getSelectedLocalization(state).getOfferDetailsWithIntroOffer(), PaywallStateKt.getSelectedLocalization(state).getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility((TemplateConfiguration.PackageInfo) state.getSelectedPackage().getValue()), j10, D.f17597a.c(interfaceC2425mG, D.f17598b).c(), Y0.L.f22613b.g(), C4830j.h(C4830j.f47278b.a()), false, s.h(aVar, 0.0f, 1, null), interfaceC2425mG, ((i11 << 9) & 57344) | 806879232, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(state, j10, i10));
        }
    }
}
