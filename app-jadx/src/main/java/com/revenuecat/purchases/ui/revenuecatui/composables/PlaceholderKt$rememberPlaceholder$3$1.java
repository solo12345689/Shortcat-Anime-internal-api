package com.revenuecat.purchases.ui.revenuecatui.composables;

import Gf.O;
import Td.L;
import Zd.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$rememberPlaceholder$3$1", f = "Placeholder.kt", l = {120, 122}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class PlaceholderKt$rememberPlaceholder$3$1 extends l implements Function2 {
    final /* synthetic */ boolean $inPreviewMode;
    final /* synthetic */ Placeholder $placeholder;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaceholderKt$rememberPlaceholder$3$1(boolean z10, boolean z11, Placeholder placeholder, e eVar) {
        super(2, eVar);
        this.$visible = z10;
        this.$inPreviewMode = z11;
        this.$placeholder = placeholder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new PlaceholderKt$rememberPlaceholder$3$1(this.$visible, this.$inPreviewMode, this.$placeholder, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((PlaceholderKt$rememberPlaceholder$3$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r5.startAnimation$revenuecatui_defaultsBc8Release(r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.stopAnimation$revenuecatui_defaultsBc8Release(r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            Td.v.b(r5)
            goto L3c
        L1b:
            Td.v.b(r5)
            boolean r5 = r4.$visible
            if (r5 == 0) goto L31
            boolean r5 = r4.$inPreviewMode
            if (r5 != 0) goto L31
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder r5 = r4.$placeholder
            r4.label = r3
            java.lang.Object r5 = r5.startAnimation$revenuecatui_defaultsBc8Release(r4)
            if (r5 != r0) goto L3c
            goto L3b
        L31:
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder r5 = r4.$placeholder
            r4.label = r2
            java.lang.Object r5 = r5.stopAnimation$revenuecatui_defaultsBc8Release(r4)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$rememberPlaceholder$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
