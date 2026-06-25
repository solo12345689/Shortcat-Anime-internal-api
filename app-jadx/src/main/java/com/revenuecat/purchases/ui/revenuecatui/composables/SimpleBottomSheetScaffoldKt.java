package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import w.AbstractC6906j;
import w.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aH\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;", "sheetState", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "LTd/L;", "content", "SimpleBottomSheetScaffold", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V", "", "show", "Li1/h;", "radius", "onClick", "Scrim-EUb7tLY", "(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V", "Scrim", "T", "Lw/r0;", "blurAnimationSpec", "()Lw/r0;", "SimpleBottomSheetScaffold_Preview", "(LY/m;I)V", "", "ALPHA_SCRIM", "F", "targetRadius", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SimpleBottomSheetScaffoldKt {
    private static final float ALPHA_SCRIM = 0.6f;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ SimpleSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SimpleSheetState simpleSheetState, e eVar, Function2 function2, int i10, int i11) {
            super(2);
            this.$sheetState = simpleSheetState;
            this.$modifier = eVar;
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
            SimpleBottomSheetScaffoldKt.SimpleBottomSheetScaffold(this.$sheetState, this.$modifier, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold_Preview$1, reason: invalid class name */
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
            SimpleBottomSheetScaffoldKt.SimpleBottomSheetScaffold_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Scrim-EUb7tLY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m620ScrimEUb7tLY(boolean r17, float r18, ie.InterfaceC5082a r19, androidx.compose.ui.e r20, kotlin.jvm.functions.Function2 r21, Y.InterfaceC2425m r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt.m620ScrimEUb7tLY(boolean, float, ie.a, androidx.compose.ui.e, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }

    private static final float Scrim_EUb7tLY$lambda$2(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SimpleBottomSheetScaffold(com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState r17, androidx.compose.ui.e r18, kotlin.jvm.functions.Function2 r19, Y.InterfaceC2425m r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt.SimpleBottomSheetScaffold(com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState, androidx.compose.ui.e, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SimpleBottomSheetScaffold_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-266393130);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-266393130, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold_Preview (SimpleBottomSheetScaffold.kt:147)");
            }
            SimpleSheetState simpleSheetState = new SimpleSheetState();
            ComposableSingletons$SimpleBottomSheetScaffoldKt composableSingletons$SimpleBottomSheetScaffoldKt = ComposableSingletons$SimpleBottomSheetScaffoldKt.INSTANCE;
            SimpleSheetState.show$default(simpleSheetState, true, composableSingletons$SimpleBottomSheetScaffoldKt.m570getLambda2$revenuecatui_defaultsBc8Release(), null, 4, null);
            SimpleBottomSheetScaffold(simpleSheetState, b.d(s.f(e.f26613a, 0.0f, 1, null), C6385r0.f58985b.e(), null, 2, null), composableSingletons$SimpleBottomSheetScaffoldKt.m571getLambda3$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    private static final <T> r0 blurAnimationSpec() {
        return AbstractC6906j.j(0, 0, null, 7, null);
    }
}
