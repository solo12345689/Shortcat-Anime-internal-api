package com.revenuecat.purchases.ui.revenuecatui.customercenter.composables;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class SettingsButtonKt$ButtonContent$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ long $loadingColor;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsButtonKt$ButtonContent$1(String str, boolean z10, long j10, int i10) {
        super(2);
        this.$title = str;
        this.$loading = z10;
        this.$loadingColor = j10;
        this.$$changed = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        SettingsButtonKt.m680ButtonContentXOJAsU(this.$title, this.$loading, this.$loadingColor, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
    }
}
