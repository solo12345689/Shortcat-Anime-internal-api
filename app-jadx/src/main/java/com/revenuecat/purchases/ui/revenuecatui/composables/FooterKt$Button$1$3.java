package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.I;
import R0.C;
import R0.r;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import g0.i;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class FooterKt$Button$1$3 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int[] $texts;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$Button$1$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(C clearAndSetSemantics) {
            AbstractC5504s.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$1$3(int[] iArr, e eVar, long j10) {
        super(3);
        this.$texts = iArr;
        this.$childModifier = eVar;
        this.$color = j10;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(I TextButton, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(TextButton, "$this$TextButton");
        int i11 = (i10 & 6) == 0 ? i10 | (interfaceC2425m.U(TextButton) ? 4 : 2) : i10;
        if ((i11 & 19) == 18 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(365963733, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous> (Footer.kt:216)");
        }
        e eVarC = r.c(e.f26613a, AnonymousClass1.INSTANCE);
        interfaceC2425m.V(-1033616621);
        int[] iArr = this.$texts;
        e eVar = this.$childModifier;
        long j10 = this.$color;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i12 : iArr) {
            arrayList.add(i.d(-1943754282, true, new FooterKt$Button$1$3$2$1(i12, eVar, j10), interfaceC2425m, 54));
        }
        interfaceC2425m.O();
        interfaceC2425m.V(-1033598812);
        int[] iArr2 = this.$texts;
        e eVar2 = this.$childModifier;
        long j11 = this.$color;
        ArrayList arrayList2 = new ArrayList(iArr2.length);
        for (int i13 : iArr2) {
            arrayList2.add(i.d(1301841013, true, new FooterKt$Button$1$3$3$1(i13, eVar2, j11), interfaceC2425m, 54));
        }
        interfaceC2425m.O();
        AdaptiveComposableKt.AdaptiveComposable(TextButton, eVarC, AbstractC2279u.I0(arrayList, arrayList2), interfaceC2425m, i11 & 14, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
