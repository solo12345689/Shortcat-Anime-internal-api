package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Landroidx/compose/ui/e;", "modifier", "LTd/L;", "TabControlToggleView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V", "", "checked", "TabControlToggleView_Preview", "(ZLY/m;I)V", "TabControlToggleView_Gradient_Preview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class TabControlToggleViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt$TabControlToggleView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabControlToggleComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TabControlToggleComponentStyle tabControlToggleComponentStyle, PaywallState.Loaded.Components components, e eVar, int i10, int i11) {
            super(2);
            this.$style = tabControlToggleComponentStyle;
            this.$state = components;
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
            TabControlToggleViewKt.TabControlToggleView(this.$style, this.$state, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt$TabControlToggleView_Gradient_Preview$1, reason: invalid class name */
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
            TabControlToggleViewKt.TabControlToggleView_Gradient_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt$TabControlToggleView_Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42731 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $checked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42731(boolean z10, int i10) {
            super(2);
            this.$checked = z10;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TabControlToggleViewKt.TabControlToggleView_Preview(this.$checked, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TabControlToggleView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle r32, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r33, androidx.compose.ui.e r34, Y.InterfaceC2425m r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt.TabControlToggleView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, Y.m, int, int):void");
    }

    private static final boolean TabControlToggleView$lambda$1(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabControlToggleView_Gradient_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-813499163);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-813499163, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView_Gradient_Preview (TabControlToggleView.kt:86)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            List listP = AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.f()), 35.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.b()), 100.0f));
            TabControlToggleView(new TabControlToggleComponentStyle(new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(listP)), null, 2, null), new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(listP)), null, 2, null), new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, listP)), null, 2, null), new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, listP)), null, 2, null)), PreviewHelpersKt.previewEmptyState(null, interfaceC2425mG, 0, 1), null, interfaceC2425mG, 0, 4);
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
    public static final void TabControlToggleView_Preview(boolean z10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(259221708);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(259221708, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView_Preview (TabControlToggleView.kt:59)");
            }
            C6385r0.a aVar = C6385r0.f58985b;
            TabControlToggleView(new TabControlToggleComponentStyle(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b()))), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.h()))), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f()))), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.f())), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.l())))), PreviewHelpersKt.previewEmptyState(Integer.valueOf(z10 ? 1 : 0), interfaceC2425mG, 0, 0), null, interfaceC2425mG, 0, 4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42731(z10, i10));
        }
    }
}
