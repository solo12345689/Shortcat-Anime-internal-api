package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.I;
import Td.L;
import Y.AbstractC2409g1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"LC/I;", "Landroidx/compose/ui/e;", "modifier", "", "Lkotlin/Function0;", "LTd/L;", "composables", "AdaptiveComposable", "(LC/I;Landroidx/compose/ui/e;Ljava/util/List;LY/m;II)V", "", "maxSize", "selectedIndex", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AdaptiveComposableKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposableKt$AdaptiveComposable$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ List<Function2> $composables;
        final /* synthetic */ e $modifier;
        final /* synthetic */ I $this_AdaptiveComposable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(I i10, e eVar, List<? extends Function2> list, int i11, int i12) {
            super(2);
            this.$this_AdaptiveComposable = i10;
            this.$modifier = eVar;
            this.$composables = list;
            this.$$changed = i11;
            this.$$default = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AdaptiveComposableKt.AdaptiveComposable(this.$this_AdaptiveComposable, this.$modifier, this.$composables, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AdaptiveComposable(C.I r40, androidx.compose.ui.e r41, java.util.List<? extends kotlin.jvm.functions.Function2> r42, Y.InterfaceC2425m r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposableKt.AdaptiveComposable(C.I, androidx.compose.ui.e, java.util.List, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AdaptiveComposable$lambda$1(C0 c02) {
        return ((Number) c02.getValue()).intValue();
    }

    private static final int AdaptiveComposable$lambda$14$lambda$12(h2 h2Var) {
        return ((Number) h2Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdaptiveComposable$lambda$2(C0 c02, int i10) {
        c02.setValue(Integer.valueOf(i10));
    }
}
