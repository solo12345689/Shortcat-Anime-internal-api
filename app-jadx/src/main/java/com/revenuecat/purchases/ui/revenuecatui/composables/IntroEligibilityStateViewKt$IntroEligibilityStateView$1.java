package com.revenuecat.purchases.ui.revenuecatui.composables;

import U0.Y0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y0.L;
import androidx.compose.ui.e;
import com.facebook.imageutils.JfifUtil;
import g1.C4830j;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LTd/L;", "invoke", "(Ljava/lang/String;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class IntroEligibilityStateViewKt$IntroEligibilityStateView$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ boolean $allowLinks;
    final /* synthetic */ long $color;
    final /* synthetic */ L $fontWeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Y0 $style;
    final /* synthetic */ C4830j $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntroEligibilityStateViewKt$IntroEligibilityStateView$1(e eVar, long j10, Y0 y02, L l10, C4830j c4830j, boolean z10) {
        super(3);
        this.$modifier = eVar;
        this.$color = j10;
        this.$style = y02;
        this.$fontWeight = l10;
        this.$textAlign = c4830j;
        this.$allowLinks = z10;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return Td.L.f17438a;
    }

    public final void invoke(String it, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(it, "it");
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425m.U(it) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 19) == 18 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-88431708, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateView.<anonymous> (IntroEligibilityStateView.kt:40)");
        }
        MarkdownKt.m594MarkdownDkhmgE0(it, this.$modifier, this.$color, this.$style, 0L, this.$fontWeight, null, null, this.$textAlign, this.$allowLinks, true, false, interfaceC2425m, i11 & 14, 54, JfifUtil.MARKER_RST0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
