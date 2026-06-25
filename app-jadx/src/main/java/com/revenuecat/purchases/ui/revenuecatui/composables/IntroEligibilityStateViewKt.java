package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Td.r;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ax\u0010\u0015\u001a\u00020\u00122\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001c\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"", "textWithNoIntroOffer", "textWithIntroOffer", "textWithMultipleIntroOffers", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "eligibility", "Ls0/r0;", "color", "LU0/Y0;", "style", "LY0/L;", "fontWeight", "Lg1/j;", "textAlign", "", "allowLinks", "Landroidx/compose/ui/e;", "modifier", "LTd/L;", "IntroEligibilityStateView-QETHhvg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V", "IntroEligibilityStateView", "introEligibilityText", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "IntroEligibilityPreviewNoOffer", "(LY/m;I)V", "IntroEligibilityPreviewBothTextsIneligible", "IntroEligibilityPreviewBothTextsEligibleSingleOffer", "IntroEligibilityPreviewBothTextsEligibleMultipleOffers", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntroEligibilityStateViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleMultipleOffers$1, reason: invalid class name */
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
            IntroEligibilityStateViewKt.IntroEligibilityPreviewBothTextsEligibleMultipleOffers(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleSingleOffer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43031 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43031(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewBothTextsEligibleSingleOffer(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsIneligible$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43041 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43041(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewBothTextsIneligible(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt$IntroEligibilityPreviewNoOffer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43051 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43051(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            IntroEligibilityStateViewKt.IntroEligibilityPreviewNoOffer(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewBothTextsEligibleMultipleOffers(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-420223294);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-420223294, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleMultipleOffers (IntroEligibilityStateView.kt:152)");
            }
            m585IntroEligibilityStateViewQETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter.", OfferEligibility.IntroOfferMultiple.INSTANCE, C6385r0.f58985b.a(), null, null, null, false, null, interfaceC2425mG, 28086, 992);
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
    public static final void IntroEligibilityPreviewBothTextsEligibleSingleOffer(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1448735195);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1448735195, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleSingleOffer (IntroEligibilityStateView.kt:140)");
            }
            m585IntroEligibilityStateViewQETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $3.99/mo thereafter.", OfferEligibility.IntroOfferSingle.INSTANCE, C6385r0.f58985b.a(), null, null, null, false, null, interfaceC2425mG, 28086, 992);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43031(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewBothTextsIneligible(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(170689540);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(170689540, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsIneligible (IntroEligibilityStateView.kt:128)");
            }
            m585IntroEligibilityStateViewQETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter.", OfferEligibility.Ineligible.INSTANCE, C6385r0.f58985b.a(), null, null, null, false, null, interfaceC2425mG, 28086, 992);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43041(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroEligibilityPreviewNoOffer(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-255198870);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-255198870, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewNoOffer (IntroEligibilityStateView.kt:116)");
            }
            m585IntroEligibilityStateViewQETHhvg("$3.99/mo", null, null, OfferEligibility.IntroOfferSingle.INSTANCE, C6385r0.f58985b.a(), null, null, null, false, null, interfaceC2425mG, 28086, 992);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43051(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    /* JADX INFO: renamed from: IntroEligibilityStateView-QETHhvg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m585IntroEligibilityStateViewQETHhvg(java.lang.String r20, java.lang.String r21, java.lang.String r22, com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility r23, long r24, U0.Y0 r26, Y0.L r27, g1.C4830j r28, boolean r29, androidx.compose.ui.e r30, Y.InterfaceC2425m r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt.m585IntroEligibilityStateViewQETHhvg(java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility, long, U0.Y0, Y0.L, g1.j, boolean, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final String introEligibilityText(OfferEligibility eligibility, String str, String str2, String str3) {
        AbstractC5504s.h(eligibility, "eligibility");
        if (AbstractC5504s.c(eligibility, OfferEligibility.IntroOfferSingle.INSTANCE) ? true : AbstractC5504s.c(eligibility, OfferEligibility.PromoOfferSingle.INSTANCE)) {
            str2 = str;
        } else {
            if (!(AbstractC5504s.c(eligibility, OfferEligibility.IntroOfferMultiple.INSTANCE) ? true : AbstractC5504s.c(eligibility, OfferEligibility.PromoOfferMultiple.INSTANCE))) {
                if (!(AbstractC5504s.c(eligibility, OfferEligibility.Ineligible.INSTANCE) ? true : AbstractC5504s.c(eligibility, OfferEligibility.PromoOfferIneligible.INSTANCE))) {
                    throw new r();
                }
                str2 = str3;
            }
        }
        return str2 == null ? str3 == null ? str == null ? "" : str : str3 : str2;
    }
}
