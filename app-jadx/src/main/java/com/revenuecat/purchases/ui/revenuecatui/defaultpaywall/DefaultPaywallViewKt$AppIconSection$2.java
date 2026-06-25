package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import android.graphics.Bitmap;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class DefaultPaywallViewKt$AppIconSection$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $appName;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $shadowColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaywallViewKt$AppIconSection$2(Bitmap bitmap, String str, long j10, e eVar, int i10, int i11) {
        super(2);
        this.$bitmap = bitmap;
        this.$appName = str;
        this.$shadowColor = j10;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        DefaultPaywallViewKt.m799AppIconSectioncf5BqRc(this.$bitmap, this.$appName, this.$shadowColor, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
    }
}
