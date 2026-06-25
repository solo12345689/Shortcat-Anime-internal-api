package com.revenuecat.purchases.ui.revenuecatui.composables;

import B.l;
import B.m;
import C.InterfaceC1132c;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.os.Build;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import v.InterfaceC6784e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SimpleBottomSheetScaffoldKt$Scrim$1$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ InterfaceC5082a $onClick;
    final /* synthetic */ InterfaceC1132c $this_Box;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt$Scrim$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final e invoke(e conditional) {
            AbstractC5504s.h(conditional, "$this$conditional");
            return b.d(conditional, C6385r0.q(C6385r0.f58985b.a(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleBottomSheetScaffoldKt$Scrim$1$1(InterfaceC1132c interfaceC1132c, InterfaceC5082a interfaceC5082a) {
        super(3);
        this.$this_Box = interfaceC1132c;
        this.$onClick = interfaceC5082a;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(996852834, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Scrim.<anonymous>.<anonymous> (SimpleBottomSheetScaffold.kt:125)");
        }
        e eVarC = this.$this_Box.c(e.f26613a);
        interfaceC2425m.V(257503834);
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = l.a();
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        f.a(ModifierExtensionsKt.conditional(d.b(eVarC, (m) objD, null, false, null, null, this.$onClick, 28, null), Build.VERSION.SDK_INT < 31, AnonymousClass2.INSTANCE), interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
