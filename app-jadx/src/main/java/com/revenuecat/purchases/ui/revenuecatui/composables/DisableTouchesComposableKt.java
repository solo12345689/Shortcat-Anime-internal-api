package com.revenuecat.purchases.ui.revenuecatui.composables;

import E0.V;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "shouldDisable", "Lkotlin/Function0;", "LTd/L;", "content", "DisableTouchesComposable", "(ZLkotlin/jvm/functions/Function2;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DisableTouchesComposableKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ boolean $shouldDisable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z10, Function2 function2, int i10, int i11) {
            super(2);
            this.$shouldDisable = z10;
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
            DisableTouchesComposableKt.DisableTouchesComposable(this.$shouldDisable, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final void DisableTouchesComposable(boolean z10, Function2 content, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        AbstractC5504s.h(content, "content");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1296500023);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.a(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1296500023, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposable (DisableTouchesComposable.kt:11)");
            }
            e.a aVar = e.f26613a;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, aVar);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            content.invoke(interfaceC2425mG, Integer.valueOf((i12 >> 3) & 14));
            interfaceC2425mG.V(882999730);
            if (z10) {
                f.a(hVar.c(aVar).then(new SuspendPointerInputElement(L.f17438a, null, null, new V.a(new DisableTouchesComposableKt$DisableTouchesComposable$1$1(null)), 6, null)), interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(z10, content, i10, i11));
        }
    }
}
