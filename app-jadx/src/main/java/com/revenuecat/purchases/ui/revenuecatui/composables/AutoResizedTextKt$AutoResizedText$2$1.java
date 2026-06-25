package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import U0.T0;
import U0.Y0;
import Y.C0;
import i1.AbstractC5030w;
import i1.C5029v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/T0;", "result", "LTd/L;", "invoke", "(LU0/T0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AutoResizedTextKt$AutoResizedText$2$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ long $defaultFontSize;
    final /* synthetic */ C0 $resizedTextStyle$delegate;
    final /* synthetic */ C0 $shouldDraw$delegate;
    final /* synthetic */ Y0 $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoResizedTextKt$AutoResizedText$2$1(Y0 y02, long j10, C0 c02, C0 c03) {
        super(1);
        this.$style = y02;
        this.$defaultFontSize = j10;
        this.$resizedTextStyle$delegate = c02;
        this.$shouldDraw$delegate = c03;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((T0) obj);
        return L.f17438a;
    }

    public final void invoke(T0 result) {
        AbstractC5504s.h(result, "result");
        if (!result.g()) {
            AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$5(this.$shouldDraw$delegate, true);
            return;
        }
        if (AbstractC5030w.g(this.$style.n())) {
            C0 c02 = this.$resizedTextStyle$delegate;
            c02.setValue(Y0.e(AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$1(c02), 0L, this.$defaultFontSize, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        long jN = AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$1(this.$resizedTextStyle$delegate).n();
        AbstractC5030w.b(jN);
        long jI = AbstractC5030w.i(C5029v.f(jN), (float) (((double) C5029v.h(jN)) * 0.95d));
        C0 c03 = this.$resizedTextStyle$delegate;
        c03.setValue(Y0.e(AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$1(c03), 0L, jI, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
    }
}
