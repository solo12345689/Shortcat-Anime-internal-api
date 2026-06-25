package com.revenuecat.purchases.ui.revenuecatui.components;

import Td.L;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;", AppStateModule.APP_STATE_BACKGROUND, "Landroidx/compose/ui/e;", "modifier", "Ls0/E1;", "shape", "Lkotlin/Function1;", "LC/c;", "LTd/L;", "content", "ViewWithVideoBackground", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lie/o;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewWithVideoBackgroundKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.ViewWithVideoBackgroundKt$ViewWithVideoBackground$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BackgroundStyle $background;
        final /* synthetic */ InterfaceC5096o $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ E1 $shape;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Components components, BackgroundStyle backgroundStyle, e eVar, E1 e12, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.$state = components;
            this.$background = backgroundStyle;
            this.$modifier = eVar;
            this.$shape = e12;
            this.$content = interfaceC5096o;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ViewWithVideoBackgroundKt.ViewWithVideoBackground(this.$state, this.$background, this.$modifier, this.$shape, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ViewWithVideoBackground(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r37, com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle r38, androidx.compose.ui.e r39, s0.E1 r40, ie.InterfaceC5096o r41, Y.InterfaceC2425m r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.ViewWithVideoBackgroundKt.ViewWithVideoBackground(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle, androidx.compose.ui.e, s0.E1, ie.o, Y.m, int, int):void");
    }
}
