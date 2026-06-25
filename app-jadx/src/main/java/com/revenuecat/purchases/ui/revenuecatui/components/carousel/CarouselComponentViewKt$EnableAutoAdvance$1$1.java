package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import G.C;
import Gf.O;
import Td.L;
import Zd.e;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$EnableAutoAdvance$1$1", f = "CarouselComponentView.kt", l = {293, 301}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class CarouselComponentViewKt$EnableAutoAdvance$1$1 extends l implements Function2 {
    final /* synthetic */ CarouselComponent.AutoAdvancePages $autoAdvance;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ C $pagerState;
    final /* synthetic */ boolean $shouldLoop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselComponentViewKt$EnableAutoAdvance$1$1(CarouselComponent.AutoAdvancePages autoAdvancePages, C c10, boolean z10, int i10, e eVar) {
        super(2, eVar);
        this.$autoAdvance = autoAdvancePages;
        this.$pagerState = c10;
        this.$shouldLoop = z10;
        this.$pageCount = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new CarouselComponentViewKt$EnableAutoAdvance$1$1(this.$autoAdvance, this.$pagerState, this.$shouldLoop, this.$pageCount, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((CarouselComponentViewKt$EnableAutoAdvance$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    /* JADX WARN: Path cross not found for [B:41:0x0021, B:46:0x0039], limit reached: 27 */
    /* JADX WARN: Path cross not found for [B:46:0x0039, B:41:0x0021], limit reached: 27 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0037 -> B:41:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x006a -> B:41:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x0021
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Td.v.b(r12)     // Catch: java.util.concurrent.CancellationException -> L21
            goto L21
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            Td.v.b(r12)
            goto L31
        L1e:
            Td.v.b(r12)
        L21:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r12 = r11.$autoAdvance
            int r12 = r12.getMsTimePerPage()
            long r4 = (long) r12
            r11.label = r3
            java.lang.Object r12 = Gf.Z.a(r4, r11)
            if (r12 != r0) goto L31
            goto L6c
        L31:
            G.C r12 = r11.$pagerState
            boolean r12 = r12.a()
            if (r12 != 0) goto L21
            boolean r12 = r11.$shouldLoop
            if (r12 == 0) goto L46
            G.C r12 = r11.$pagerState
            int r12 = r12.v()
            int r12 = r12 + r3
        L44:
            r5 = r12
            goto L51
        L46:
            G.C r12 = r11.$pagerState
            int r12 = r12.v()
            int r12 = r12 + r3
            int r1 = r11.$pageCount
            int r12 = r12 % r1
            goto L44
        L51:
            G.C r4 = r11.$pagerState     // Catch: java.util.concurrent.CancellationException -> L21
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r12 = r11.$autoAdvance     // Catch: java.util.concurrent.CancellationException -> L21
            int r12 = r12.getMsTransitionTime()     // Catch: java.util.concurrent.CancellationException -> L21
            r1 = 0
            r6 = 6
            r7 = 0
            w.r0 r7 = w.AbstractC6906j.j(r12, r1, r7, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L21
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L21
            r6 = 0
            r9 = 2
            r10 = 0
            r8 = r11
            java.lang.Object r12 = G.C.n(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L21
            if (r12 != r0) goto L21
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt$EnableAutoAdvance$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
