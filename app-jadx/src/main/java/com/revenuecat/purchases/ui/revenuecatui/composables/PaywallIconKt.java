package com.revenuecat.purchases.ui.revenuecatui.composables;

import E.AbstractC1287h;
import E.InterfaceC1281b;
import P0.c;
import Td.L;
import U.B;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;", "icon", "Landroidx/compose/ui/e;", "modifier", "Ls0/r0;", "tintColor", "LTd/L;", "PaywallIcon-FNF3uiM", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;Landroidx/compose/ui/e;JLY/m;II)V", "PaywallIcon", "PaywallIconPreview", "(LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallIconKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt$PaywallIconPreview$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            PaywallIconKt.PaywallIconPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: PaywallIcon-FNF3uiM, reason: not valid java name */
    public static final void m607PaywallIconFNF3uiM(PaywallIconName icon, e eVar, long j10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        long j11;
        AbstractC5504s.h(icon, "icon");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(269660957);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(icon) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
            j11 = j10;
        } else {
            j11 = j10;
            if ((i10 & 384) == 0) {
                i12 |= interfaceC2425mG.d(j11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
            }
        }
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                eVar = e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(269660957, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIcon (PaywallIcon.kt:23)");
            }
            B.a(c.c(icon.drawable$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 0), null, s.f(androidx.compose.foundation.layout.c.b(e.f26613a, 1.0f, false, 2, null), 0.0f, 1, null).then(eVar), j11, interfaceC2425mG, ((i12 << 3) & 7168) | 48, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        e eVar2 = eVar;
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new PaywallIconKt$PaywallIcon$1(icon, eVar2, j10, i10, i11));
        }
    }

    public static final void PaywallIconPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1356053803);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1356053803, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconPreview (PaywallIcon.kt:150)");
            }
            PaywallIconName[] paywallIconNameArrValues = PaywallIconName.values();
            InterfaceC1281b.a aVar = new InterfaceC1281b.a(C5015h.n(40), null);
            interfaceC2425mG.V(914039657);
            boolean zF = interfaceC2425mG.F(paywallIconNameArrValues);
            Object objD = interfaceC2425mG.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                objD = new PaywallIconKt$PaywallIconPreview$1$1(paywallIconNameArrValues);
                interfaceC2425mG.u(objD);
            }
            interfaceC2425mG.O();
            AbstractC1287h.a(aVar, null, null, null, false, null, null, null, false, (Function1) objD, interfaceC2425mG, 0, 510);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }
}
