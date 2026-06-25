package com.revenuecat.purchases.ui.revenuecatui.composables;

import B.l;
import B.m;
import C.C1131b;
import C.EnumC1152x;
import C.G;
import C.J;
import I0.B;
import J.i;
import K0.InterfaceC1788g;
import U.D;
import U.j0;
import U0.Y0;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.b2;
import Y.h2;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.k;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC2739w0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import g1.C4830j;
import i1.C5015h;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import l0.e;
import p0.AbstractC5912g;
import s0.C6385r0;
import v.v;
import w.AbstractC6892c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\\\u0010\u0011\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;", "selectedTier", "Ls0/r0;", "backgroundSelectedColor", "foregroundSelectedColor", "LTd/L;", "SelectedTierView-1wkBAMs", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;JJLY/m;I)V", "SelectedTierView", "", "tiers", "Lkotlin/Function1;", "onTierSelected", "backgroundColor", "foregroundColor", "TierSwitcher-UFBoNtE", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$TierInfo;Lkotlin/jvm/functions/Function1;JJJJLY/m;I)V", "TierSwitcher", "", "totalWidthPx", "Li1/h;", "totalHeightRowDp", "backgroundColorState", "backgroundSelectedColorState", "foregroundColorState", "foregroundSelectedColorState", "indicatorOffset", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TierSwitcherKt {
    /* JADX INFO: renamed from: SelectedTierView-1wkBAMs, reason: not valid java name */
    public static final void m633SelectedTierView1wkBAMs(TemplateConfiguration.TierInfo selectedTier, long j10, long j11, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        AbstractC5504s.h(selectedTier, "selectedTier");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-474734628);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(selectedTier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-474734628, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SelectedTierView (TierSwitcher.kt:52)");
            }
            e eVarC = b.c(e.f26613a, j10, i.a(50));
            TierSwitcherUIConstants tierSwitcherUIConstants = TierSwitcherUIConstants.INSTANCE;
            e eVarJ = p.j(eVarC, tierSwitcherUIConstants.m640getTierHorizontalPaddingD9Ej5fM(), tierSwitcherUIConstants.m643getTierVerticalPaddingD9Ej5fM());
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarJ);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
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
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            interfaceC2425m2 = interfaceC2425mG;
            j0.b(selectedTier.getName(), null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425mG, D.f17598b).c(), interfaceC2425m2, i11 & 896, 0, 65530);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new TierSwitcherKt$SelectedTierView$2(selectedTier, j10, j11, i10));
        }
    }

    /* JADX INFO: renamed from: TierSwitcher-UFBoNtE, reason: not valid java name */
    public static final void m634TierSwitcherUFBoNtE(List<TemplateConfiguration.TierInfo> tiers, TemplateConfiguration.TierInfo selectedTier, Function1 onTierSelected, long j10, long j11, long j12, long j13, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(tiers, "tiers");
        AbstractC5504s.h(selectedTier, "selectedTier");
        AbstractC5504s.h(onTierSelected, "onTierSelected");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1054819874);
        int i11 = (i10 & 6) == 0 ? (interfaceC2425mG.F(tiers) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(selectedTier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(onTierSelected) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC2425mG.d(j12) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.d(j13) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1054819874, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcher (TierSwitcher.kt:82)");
            }
            int iIndexOf = tiers.indexOf(selectedTier);
            interfaceC2425mG.V(-1638624750);
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            int i12 = i11;
            if (objD == aVar.a()) {
                objD = b2.e(0, null, 2, null);
                interfaceC2425mG.u(objD);
            }
            C0 c02 = (C0) objD;
            interfaceC2425mG.O();
            interfaceC2425mG.V(-1638622858);
            Object objD2 = interfaceC2425mG.D();
            if (objD2 == aVar.a()) {
                objD2 = b2.e(C5015h.h(C5015h.n(40)), null, 2, null);
                interfaceC2425mG.u(objD2);
            }
            C0 c03 = (C0) objD2;
            interfaceC2425mG.O();
            InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425mG.n(AbstractC2739w0.e());
            UIConstant uIConstant = UIConstant.INSTANCE;
            h2 h2VarA = v.a(j10, uIConstant.getDefaultColorAnimation(), "backgroundColor", null, interfaceC2425mG, ((i12 >> 9) & 14) | 384, 8);
            h2 h2VarA2 = v.a(j11, uIConstant.getDefaultColorAnimation(), "backgroundSelectedColor", null, interfaceC2425mG, ((i12 >> 12) & 14) | 384, 8);
            h2 h2VarA3 = v.a(j12, uIConstant.getDefaultColorAnimation(), "foregroundColor", null, interfaceC2425mG, ((i12 >> 15) & 14) | 384, 8);
            h2 h2VarA4 = v.a(j13, uIConstant.getDefaultColorAnimation(), "foregroundSelectedColor", null, interfaceC2425mG, ((i12 >> 18) & 14) | 384, 8);
            e.a aVar2 = e.f26613a;
            e eVarD = b.d(AbstractC5912g.a(aVar2, i.a(50)), TierSwitcher_UFBoNtE$lambda$7(h2VarA), null, 2, null);
            float f10 = 0.0f;
            e eVarH = s.h(eVarD, 0.0f, 1, null);
            interfaceC2425mG.V(-1638586667);
            Object objD3 = interfaceC2425mG.D();
            if (objD3 == aVar.a()) {
                objD3 = new TierSwitcherKt$TierSwitcher$1$1(c02);
                interfaceC2425mG.u(objD3);
            }
            interfaceC2425mG.O();
            e eVarA = androidx.compose.ui.layout.p.a(eVarH, (Function1) objD3);
            e.a aVar3 = l0.e.f52304a;
            B bH = f.h(aVar3.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarA);
            InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar4.a();
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
            m2.e(interfaceC2425mB, bH, aVar4.e());
            m2.e(interfaceC2425mB, iR, aVar4.g());
            Function2 function2B = aVar4.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar4.f());
            h hVar = h.f26161a;
            float fN = C5015h.n(interfaceC5011d.A(TierSwitcher_UFBoNtE$lambda$2(c02) / tiers.size()) * iIndexOf);
            int i13 = 1;
            h2 h2VarC = AbstractC6892c.c(fN, null, "tier_switcher", null, interfaceC2425mG, 384, 10);
            interfaceC2425mG = interfaceC2425mG;
            androidx.compose.ui.e eVarI = s.i(s.g(n.b(aVar2, TierSwitcher_UFBoNtE$lambda$20$lambda$13(h2VarC), 0.0f, 2, null), 1.0f / tiers.size()), TierSwitcher_UFBoNtE$lambda$5(c03));
            TierSwitcherUIConstants tierSwitcherUIConstants = TierSwitcherUIConstants.INSTANCE;
            f.a(b.d(AbstractC5912g.a(p.i(eVarI, tierSwitcherUIConstants.m639getSelectedTierPaddingD9Ej5fM()), i.a(50)), TierSwitcher_UFBoNtE$lambda$8(h2VarA2), null, 2, null), interfaceC2425mG, 0);
            e.c cVarI = aVar3.i();
            C1131b.f fVarF = C1131b.f2093a.f();
            interfaceC2425mG.V(1157748976);
            boolean zU = interfaceC2425mG.U(interfaceC5011d);
            Object objD4 = interfaceC2425mG.D();
            if (zU || objD4 == aVar.a()) {
                objD4 = new TierSwitcherKt$TierSwitcher$2$1$1(interfaceC5011d, c03);
                interfaceC2425mG.u(objD4);
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarK = s.k(k.a(androidx.compose.ui.layout.p.a(aVar2, (Function1) objD4), EnumC1152x.Max), tierSwitcherUIConstants.m638getMinimumHeightD9Ej5fM(), 0.0f, 2, null);
            B b10 = G.b(fVarF, cVarI, interfaceC2425mG, 54);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarK);
            InterfaceC5082a interfaceC5082aA2 = aVar4.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA2);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB2, b10, aVar4.e());
            m2.e(interfaceC2425mB2, iR2, aVar4.g());
            Function2 function2B2 = aVar4.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar4.f());
            J j14 = J.f2025a;
            interfaceC2425mG.V(686110850);
            for (TemplateConfiguration.TierInfo tierInfo : tiers) {
                l0.e eVarE = l0.e.f52304a.e();
                e.a aVar5 = androidx.compose.ui.e.f26613a;
                J j15 = j14;
                androidx.compose.ui.e eVarD2 = s.d(C.I.b(j14, aVar5, 1.0f, false, 2, null), f10, i13, null);
                interfaceC2425mG.V(-606775784);
                Object objD5 = interfaceC2425mG.D();
                InterfaceC2425m.a aVar6 = InterfaceC2425m.f22370a;
                if (objD5 == aVar6.a()) {
                    objD5 = l.a();
                    interfaceC2425mG.u(objD5);
                }
                m mVar = (m) objD5;
                interfaceC2425mG.O();
                interfaceC2425mG.V(-606773603);
                int i14 = ((i12 & 896) == 256 ? i13 : 0) | (interfaceC2425mG.U(tierInfo) ? 1 : 0);
                Object objD6 = interfaceC2425mG.D();
                if (i14 != 0 || objD6 == aVar6.a()) {
                    objD6 = new TierSwitcherKt$TierSwitcher$2$2$1$2$1(onTierSelected, tierInfo);
                    interfaceC2425mG.u(objD6);
                }
                interfaceC2425mG.O();
                androidx.compose.ui.e eVarB = d.b(eVarD2, mVar, null, false, null, null, (InterfaceC5082a) objD6, 28, null);
                B bH2 = f.h(eVarE, false);
                int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR3 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarB);
                InterfaceC1788g.a aVar7 = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA3 = aVar7.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA3);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB3, bH2, aVar7.e());
                m2.e(interfaceC2425mB3, iR3, aVar7.g());
                Function2 function2B3 = aVar7.b();
                if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                    interfaceC2425mB3.u(Integer.valueOf(iA3));
                    interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
                }
                m2.e(interfaceC2425mB3, eVarF3, aVar7.f());
                h hVar2 = h.f26161a;
                String name = tierInfo.getName();
                Y0 y0C = D.f17597a.c(interfaceC2425mG, D.f17598b).c();
                int iA4 = C4830j.f47278b.a();
                TierSwitcherUIConstants tierSwitcherUIConstants2 = TierSwitcherUIConstants.INSTANCE;
                j0.b(name, p.j(aVar5, tierSwitcherUIConstants2.m641getTierTextPaddingHorizontalD9Ej5fM(), tierSwitcherUIConstants2.m642getTierTextPaddingVerticalD9Ej5fM()), AbstractC5504s.c(selectedTier, tierInfo) ? TierSwitcher_UFBoNtE$lambda$10(h2VarA4) : TierSwitcher_UFBoNtE$lambda$9(h2VarA3), 0L, null, null, null, 0L, null, C4830j.h(iA4), 0L, 0, false, 0, 0, null, y0C, interfaceC2425mG, 48, 0, 65016);
                interfaceC2425mG.x();
                f10 = f10;
                j14 = j15;
                i13 = 1;
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new TierSwitcherKt$TierSwitcher$3(tiers, selectedTier, onTierSelected, j10, j11, j12, j13, i10));
        }
    }

    private static final long TierSwitcher_UFBoNtE$lambda$10(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }

    private static final int TierSwitcher_UFBoNtE$lambda$2(C0 c02) {
        return ((Number) c02.getValue()).intValue();
    }

    private static final float TierSwitcher_UFBoNtE$lambda$20$lambda$13(h2 h2Var) {
        return ((C5015h) h2Var.getValue()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TierSwitcher_UFBoNtE$lambda$3(C0 c02, int i10) {
        c02.setValue(Integer.valueOf(i10));
    }

    private static final float TierSwitcher_UFBoNtE$lambda$5(C0 c02) {
        return ((C5015h) c02.getValue()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TierSwitcher_UFBoNtE$lambda$6(C0 c02, float f10) {
        c02.setValue(C5015h.h(f10));
    }

    private static final long TierSwitcher_UFBoNtE$lambda$7(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }

    private static final long TierSwitcher_UFBoNtE$lambda$8(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }

    private static final long TierSwitcher_UFBoNtE$lambda$9(h2 h2Var) {
        return ((C6385r0) h2Var.getValue()).A();
    }
}
