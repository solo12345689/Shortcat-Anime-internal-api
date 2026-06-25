package com.revenuecat.purchases.ui.revenuecatui.composables;

import E.C;
import E.o;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import x.AbstractC7007e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE/C;", "LTd/L;", "invoke", "(LE/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallIconKt$PaywallIconPreview$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ PaywallIconName[] $icons;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt$PaywallIconPreview$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE/o;", "", "it", "LTd/L;", "invoke", "(LE/o;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements p {
        final /* synthetic */ PaywallIconName[] $icons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallIconName[] paywallIconNameArr) {
            super(4);
            this.$icons = paywallIconNameArr;
        }

        @Override // ie.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((o) obj, ((Number) obj2).intValue(), (InterfaceC2425m) obj3, ((Number) obj4).intValue());
            return L.f17438a;
        }

        public final void invoke(o items, int i10, InterfaceC2425m interfaceC2425m, int i11) {
            int i12;
            AbstractC5504s.h(items, "$this$items");
            if ((i11 & 48) == 0) {
                i12 = i11 | (interfaceC2425m.c(i10) ? 32 : 16);
            } else {
                i12 = i11;
            }
            if ((i12 & 145) == 144 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-320278688, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview.<anonymous>.<anonymous>.<anonymous> (PaywallIcon.kt:155)");
            }
            e.a aVar = e.f26613a;
            C6385r0.a aVar2 = C6385r0.f58985b;
            e eVarG = AbstractC7007e.g(b.d(aVar, aVar2.k(), null, 2, null), C5015h.n(1), aVar2.a(), null, 4, null);
            PaywallIconName[] paywallIconNameArr = this.$icons;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarG);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            h hVar = h.f26161a;
            PaywallIconKt.m607PaywallIconFNF3uiM(paywallIconNameArr[i10], null, aVar2.a(), interfaceC2425m, 384, 2);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallIconKt$PaywallIconPreview$1$1(PaywallIconName[] paywallIconNameArr) {
        super(1);
        this.$icons = paywallIconNameArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C) obj);
        return L.f17438a;
    }

    public final void invoke(C LazyVerticalGrid) {
        AbstractC5504s.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
        PaywallIconName[] paywallIconNameArr = this.$icons;
        C.b(LazyVerticalGrid, paywallIconNameArr.length, null, null, null, i.b(-320278688, true, new AnonymousClass1(paywallIconNameArr)), 14, null);
    }
}
