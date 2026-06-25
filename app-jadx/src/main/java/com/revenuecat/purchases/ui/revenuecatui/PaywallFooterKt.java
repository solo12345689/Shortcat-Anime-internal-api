package com.revenuecat.purchases.ui.revenuecatui;

import Td.InterfaceC2154e;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "options", "", "condensed", "Lkotlin/Function1;", "LC/A;", "LTd/L;", "mainContent", "PaywallFooter", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;LY/m;II)V", "OriginalTemplatePaywallFooter", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallFooterKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt$OriginalTemplatePaywallFooter$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $condensed;
        final /* synthetic */ InterfaceC5096o $mainContent;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallOptions paywallOptions, boolean z10, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.$options = paywallOptions;
            this.$condensed = z10;
            this.$mainContent = interfaceC5096o;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallFooterKt.OriginalTemplatePaywallFooter(this.$options, this.$condensed, this.$mainContent, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt$PaywallFooter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $condensed;
        final /* synthetic */ InterfaceC5096o $mainContent;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallOptions paywallOptions, boolean z10, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.$options = paywallOptions;
            this.$condensed = z10;
            this.$mainContent = interfaceC5096o;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallFooterKt.PaywallFooter(this.$options, this.$condensed, this.$mainContent, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OriginalTemplatePaywallFooter(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions r25, boolean r26, ie.InterfaceC5096o r27, Y.InterfaceC2425m r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt.OriginalTemplatePaywallFooter(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions, boolean, ie.o, Y.m, int, int):void");
    }

    @InterfaceC2154e
    public static final void PaywallFooter(PaywallOptions options, boolean z10, InterfaceC5096o interfaceC5096o, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC5096o interfaceC5096o2;
        boolean z11;
        AbstractC5504s.h(options, "options");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1966106382);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(options) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5096o) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            z11 = z10;
            interfaceC2425m2 = interfaceC2425mG;
            interfaceC5096o2 = interfaceC5096o;
        } else {
            boolean z12 = i13 != 0 ? false : z10;
            InterfaceC5096o interfaceC5096o3 = i14 != 0 ? null : interfaceC5096o;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1966106382, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallFooter (PaywallFooter.kt:34)");
            }
            int i15 = i12 & 1022;
            InterfaceC5096o interfaceC5096o4 = interfaceC5096o3;
            boolean z13 = z12;
            OriginalTemplatePaywallFooter(options, z13, interfaceC5096o4, interfaceC2425mG, i15, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m2 = interfaceC2425mG;
            interfaceC5096o2 = interfaceC5096o4;
            z11 = z13;
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(options, z11, interfaceC5096o2, i10, i11));
        }
    }
}
