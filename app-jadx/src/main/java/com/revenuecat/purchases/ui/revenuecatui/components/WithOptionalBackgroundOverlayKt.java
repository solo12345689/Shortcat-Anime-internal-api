package com.revenuecat.purchases.ui.revenuecatui.components;

import C.InterfaceC1132c;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;", AppStateModule.APP_STATE_BACKGROUND, "Landroidx/compose/ui/e;", "modifier", "Ls0/E1;", "shape", "Lkotlin/Function0;", "LTd/L;", "content", "WithOptionalBackgroundOverlay", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lkotlin/jvm/functions/Function2;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WithOptionalBackgroundOverlayKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlayKt$WithOptionalBackgroundOverlay$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/c;", "LTd/L;", "invoke", "(LC/c;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ Function2 $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function2 function2) {
            super(3);
            this.$content = function2;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1132c) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1132c ViewWithVideoBackground, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(ViewWithVideoBackground, "$this$ViewWithVideoBackground");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(340035564, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlay.<anonymous> (WithOptionalBackgroundOverlay.kt:27)");
            }
            this.$content.invoke(interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlayKt$WithOptionalBackgroundOverlay$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BackgroundStyle $background;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ E1 $shape;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallState.Loaded.Components components, BackgroundStyle backgroundStyle, e eVar, E1 e12, Function2 function2, int i10, int i11) {
            super(2);
            this.$state = components;
            this.$background = backgroundStyle;
            this.$modifier = eVar;
            this.$shape = e12;
            this.$content = function2;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            WithOptionalBackgroundOverlayKt.WithOptionalBackgroundOverlay(this.$state, this.$background, this.$modifier, this.$shape, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void WithOptionalBackgroundOverlay(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r16, com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle r17, androidx.compose.ui.e r18, s0.E1 r19, kotlin.jvm.functions.Function2 r20, Y.InterfaceC2425m r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlayKt.WithOptionalBackgroundOverlay(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle, androidx.compose.ui.e, s0.E1, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }
}
