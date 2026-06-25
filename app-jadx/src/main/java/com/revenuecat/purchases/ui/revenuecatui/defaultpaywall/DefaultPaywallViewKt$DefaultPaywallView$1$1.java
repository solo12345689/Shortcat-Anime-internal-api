package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Gf.O;
import Td.L;
import Y.C0;
import Zd.e;
import android.content.Context;
import com.amazon.device.iap.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1", f = "DefaultPaywallView.kt", l = {a.f34980a, 104}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class DefaultPaywallViewKt$DefaultPaywallView$1$1 extends l implements Function2 {
    final /* synthetic */ C0 $appIconBitmap$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ C0 $prominentColors$delegate;
    final /* synthetic */ List<C6385r0> $providedProminentColors;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaywallViewKt$DefaultPaywallView$1$1(List<C6385r0> list, C0 c02, C0 c03, Context context, e eVar) {
        super(2, eVar);
        this.$providedProminentColors = list;
        this.$appIconBitmap$delegate = c02;
        this.$prominentColors$delegate = c03;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new DefaultPaywallViewKt$DefaultPaywallView$1$1(this.$providedProminentColors, this.$appIconBitmap$delegate, this.$prominentColors$delegate, this.$context, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((DefaultPaywallViewKt$DefaultPaywallView$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r12 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r12 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            Td.v.b(r12)
            r8 = r11
            goto L6b
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            java.lang.Object r1 = r11.L$0
            Y.C0 r1 = (Y.C0) r1
            Td.v.b(r12)
            r8 = r11
            goto L45
        L24:
            Td.v.b(r12)
            java.util.List<s0.r0> r12 = r11.$providedProminentColors
            if (r12 != 0) goto L4b
            Y.C0 r1 = r11.$prominentColors$delegate
            com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor r4 = com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor.INSTANCE
            Y.C0 r12 = r11.$appIconBitmap$delegate
            android.graphics.Bitmap r5 = com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$3(r12)
            r11.L$0 = r1
            r11.label = r3
            r6 = 2
            r7 = 0
            r9 = 4
            r10 = 0
            r8 = r11
            java.lang.Object r12 = com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor.getProminentColorsFromBitmap$default(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L45
            goto L6a
        L45:
            java.util.List r12 = (java.util.List) r12
            com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$7(r1, r12)
            goto L4c
        L4b:
            r8 = r11
        L4c:
            Y.C0 r12 = r8.$appIconBitmap$delegate
            android.graphics.Bitmap r12 = com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$3(r12)
            if (r12 != 0) goto L72
            Gf.K r12 = Gf.C1608f0.a()
            com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1 r1 = new com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1
            android.content.Context r3 = r8.$context
            r4 = 0
            r1.<init>(r3, r4)
            r8.L$0 = r4
            r8.label = r2
            java.lang.Object r12 = Gf.AbstractC1613i.g(r12, r1, r11)
            if (r12 != r0) goto L6b
        L6a:
            return r0
        L6b:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            Y.C0 r0 = r8.$appIconBitmap$delegate
            com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.access$DefaultPaywallView$lambda$4(r0, r12)
        L72:
            Td.L r12 = Td.L.f17438a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
