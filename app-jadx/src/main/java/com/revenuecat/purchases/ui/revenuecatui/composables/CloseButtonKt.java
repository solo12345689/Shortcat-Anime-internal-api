package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.InterfaceC1132c;
import I0.B;
import K0.InterfaceC1788g;
import U.A;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import l0.e;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LC/c;", "", "shouldDisplayDismissButton", "Ls0/r0;", "color", "actionInProgress", "Lkotlin/Function0;", "LTd/L;", "onClick", "CloseButton-drOMvmE", "(LC/c;ZLs0/r0;ZLie/a;LY/m;I)V", "CloseButton", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CloseButtonKt {
    /* JADX INFO: renamed from: CloseButton-drOMvmE, reason: not valid java name */
    public static final void m566CloseButtondrOMvmE(InterfaceC1132c CloseButton, boolean z10, C6385r0 c6385r0, boolean z11, InterfaceC5082a onClick, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(CloseButton, "$this$CloseButton");
        AbstractC5504s.h(onClick, "onClick");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-396768639);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(CloseButton) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(c6385r0) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.F(onClick) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-396768639, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton (CloseButton.kt:20)");
            }
            if (z10) {
                e.a aVar = e.f26613a;
                e.a aVar2 = l0.e.f52304a;
                androidx.compose.ui.e eVarB = CloseButton.b(aVar, aVar2.o());
                B bA = AbstractC1136g.a(C1131b.f2093a.h(), aVar2.k(), interfaceC2425mG, 0);
                int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarB);
                InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA = aVar3.a();
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
                m2.e(interfaceC2425mB, bA, aVar3.e());
                m2.e(interfaceC2425mB, iR, aVar3.g());
                Function2 function2B = aVar3.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar3.f());
                C1139j c1139j = C1139j.f2142a;
                InsetSpacersKt.StatusBarSpacer(interfaceC2425mG, 0);
                A.a(onClick, null, !z11, null, null, i.d(170484435, true, new CloseButtonKt$CloseButton$1$1(c6385r0), interfaceC2425mG, 54), interfaceC2425mG, ((i11 >> 12) & 14) | 196608, 26);
                interfaceC2425mG.x();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new CloseButtonKt$CloseButton$2(CloseButton, z10, c6385r0, z11, onClick, i10));
        }
    }
}
