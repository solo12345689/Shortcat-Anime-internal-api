package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import C.A;
import C.K;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Y.AbstractC2393b0;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.SizeConstraintExtensionsKt;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import l1.AbstractC5527i;
import l1.AbstractC5542x;
import l1.C5524f;
import l1.C5530l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5 extends AbstractC5506u implements Function2 {
    final /* synthetic */ C0 $contentTracker;
    final /* synthetic */ InterfaceC5082a $onHelpersChanged;
    final /* synthetic */ C5530l $scope;
    final /* synthetic */ PaywallState.Loaded.Components $state$inlined;
    final /* synthetic */ TimelineComponentState $timelineState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$5(C0 c02, C5530l c5530l, InterfaceC5082a interfaceC5082a, TimelineComponentState timelineComponentState, PaywallState.Loaded.Components components) {
        super(2);
        this.$contentTracker = c02;
        this.$scope = c5530l;
        this.$onHelpersChanged = interfaceC5082a;
        this.$timelineState$inlined = timelineComponentState;
        this.$state$inlined = components;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        SizeConstraint.Fixed fixed;
        Iterator it;
        float fN;
        int i12;
        A a10;
        ArrayList arrayList;
        int i13;
        SizeConstraint.Fixed fixed2;
        IconComponentStyle icon;
        Size size;
        SizeConstraint height;
        C5015h c5015hDpOrNull;
        C5524f c5524f;
        AbstractC5527i.b bVar;
        InterfaceC2425m interfaceC2425m2 = interfaceC2425m;
        int i14 = 2;
        if ((i10 & 3) == 2 && interfaceC2425m2.i()) {
            interfaceC2425m2.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)");
        }
        this.$contentTracker.setValue(L.f17438a);
        int iH = this.$scope.h();
        this.$scope.i();
        C5530l c5530l = this.$scope;
        interfaceC2425m2.V(-425492318);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        interfaceC2425m2.V(-290820944);
        Object objD = interfaceC2425m2.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = U1.d(new TimelineComponentViewKt$TimelineComponentView$2$biggestIconWidth$2$1(this.$timelineState$inlined));
            interfaceC2425m2.u(objD);
        }
        h2 h2Var = (h2) objD;
        interfaceC2425m2.O();
        interfaceC2425m2.V(-290812056);
        Iterator it2 = this.$timelineState$inlined.getItems().iterator();
        InterfaceC2425m interfaceC2425m3 = interfaceC2425m2;
        while (true) {
            i11 = 1;
            fixed = null;
            if (!it2.hasNext()) {
                break;
            }
            TimelineComponentState.ItemState itemState = (TimelineComponentState.ItemState) it2.next();
            C5530l.b bVarM = c5530l.m();
            C5524f c5524fA = bVarM.a();
            C5524f c5524fB = bVarM.b();
            C5524f c5524fC = bVarM.c();
            C5524f c5524fD = bVarM.d();
            AbstractC5542x[] abstractC5542xArr = new AbstractC5542x[3];
            abstractC5542xArr[0] = c5524fA;
            abstractC5542xArr[1] = c5524fB;
            abstractC5542xArr[i14] = c5524fC;
            AbstractC5527i.b bVarD = AbstractC5527i.d(c5530l, abstractC5542xArr, 0.0f, i14, null);
            AbstractC5527i.c cVarE = c5530l.e(new AbstractC5542x[]{c5524fA}, C5015h.n(this.$timelineState$inlined.getColumnGutter()));
            AbstractC5527i.b bVar2 = (AbstractC5527i.b) AbstractC2279u.A0(arrayList2);
            arrayList3.add(c5524fA);
            arrayList2.add(AbstractC5527i.d(c5530l, new AbstractC5542x[]{c5524fD}, 0.0f, i14, null));
            e.a aVar = e.f26613a;
            e eVarI = s.i(aVar, C5015h.n(this.$timelineState$inlined.getItemSpacing()));
            interfaceC2425m3.V(-290795278);
            boolean zU = interfaceC2425m3.U(bVarD);
            Object objD2 = interfaceC2425m3.D();
            if (zU || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new TimelineComponentViewKt$TimelineComponentView$2$1$1(bVarD);
                interfaceC2425m3.u(objD2);
            }
            interfaceC2425m3.O();
            K.a(c5530l.k(eVarI, c5524fD, (Function1) objD2), interfaceC2425m3, 0);
            interfaceC2425m3.V(-290789187);
            boolean zU2 = interfaceC2425m3.U(this.$timelineState$inlined) | interfaceC2425m3.U(bVar2) | interfaceC2425m3.U(c5524fB) | interfaceC2425m3.U(c5524fC);
            Object objD3 = interfaceC2425m3.D();
            if (zU2 || objD3 == InterfaceC2425m.f22370a.a()) {
                c5524f = c5524fA;
                bVar = bVar2;
                Object timelineComponentViewKt$TimelineComponentView$2$2$1 = new TimelineComponentViewKt$TimelineComponentView$2$2$1(this.$timelineState$inlined, bVar, c5524fB, c5524fC, h2Var);
                c5524fC = c5524fC;
                interfaceC2425m3.u(timelineComponentViewKt$TimelineComponentView$2$2$1);
                objD3 = timelineComponentViewKt$TimelineComponentView$2$2$1;
            } else {
                bVar = bVar2;
                c5524f = c5524fA;
            }
            interfaceC2425m3.O();
            e eVarK = c5530l.k(aVar, c5524f, (Function1) objD3);
            e.a aVar2 = l0.e.f52304a;
            B bH = f.h(aVar2.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m3, 0);
            I iR = interfaceC2425m3.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425m3, eVarK);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425m3.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m3.I();
            if (interfaceC2425m3.e()) {
                interfaceC2425m3.h(interfaceC5082aA);
            } else {
                interfaceC2425m3.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m3);
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            ArrayList arrayList4 = arrayList2;
            InterfaceC2425m interfaceC2425m4 = interfaceC2425m;
            IconComponentViewKt.IconComponentView(itemState.getIcon(), this.$state$inlined, h.f26161a.b(aVar, aVar2.m()), interfaceC2425m4, 0, 0);
            interfaceC2425m4.x();
            TextComponentStyle title = itemState.getTitle();
            PaywallState.Loaded.Components components = this.$state$inlined;
            interfaceC2425m4.V(-290754551);
            boolean zU3 = interfaceC2425m4.U(this.$timelineState$inlined) | interfaceC2425m4.U(c5524f) | interfaceC2425m4.U(bVar) | interfaceC2425m4.U(cVarE);
            Object objD4 = interfaceC2425m4.D();
            if (zU3 || objD4 == InterfaceC2425m.f22370a.a()) {
                objD4 = new TimelineComponentViewKt$TimelineComponentView$2$4$1(this.$timelineState$inlined, c5524f, bVar, cVarE);
                interfaceC2425m4.u(objD4);
            }
            interfaceC2425m4.O();
            TextComponentViewKt.TextComponentView(title, components, c5530l.k(aVar, c5524fB, (Function1) objD4), interfaceC2425m4, 0, 0);
            TextComponentStyle description = itemState.getDescription();
            interfaceC2425m4.V(-290731404);
            if (description != null) {
                PaywallState.Loaded.Components components2 = this.$state$inlined;
                interfaceC2425m4.V(149597858);
                boolean zU4 = interfaceC2425m4.U(c5524fB) | interfaceC2425m4.U(this.$timelineState$inlined);
                Object objD5 = interfaceC2425m4.D();
                if (zU4 || objD5 == InterfaceC2425m.f22370a.a()) {
                    objD5 = new TimelineComponentViewKt$TimelineComponentView$2$5$1$1(c5524fB, this.$timelineState$inlined);
                    interfaceC2425m4.u(objD5);
                }
                interfaceC2425m4.O();
                TextComponentViewKt.TextComponentView(description, components2, c5530l.k(aVar, c5524fC, (Function1) objD5), interfaceC2425m4, 0, 0);
                L l10 = L.f17438a;
            }
            interfaceC2425m4.O();
            arrayList2 = arrayList4;
            i14 = 2;
            interfaceC2425m3 = interfaceC2425m4;
        }
        interfaceC2425m3.O();
        interfaceC2425m3.V(-290709150);
        Iterator it3 = this.$timelineState$inlined.getItems().iterator();
        int i15 = 0;
        while (it3.hasNext()) {
            int i16 = i15 + 1;
            TimelineComponentState.ItemState itemState2 = (TimelineComponentState.ItemState) it3.next();
            boolean z10 = i15 == this.$timelineState$inlined.getItems().size() - i11 ? i11 : 0;
            C5524f c5524f2 = (C5524f) arrayList3.get(i15);
            C5524f c5524f3 = (C5524f) AbstractC2279u.p0(arrayList3, i16);
            TimelineComponentStyle.ConnectorStyle connector = itemState2.getConnector();
            interfaceC2425m3.V(-290701069);
            if (connector == null) {
                it = it3;
                fixed2 = fixed;
                i12 = i16;
                arrayList = arrayList3;
                i13 = i11;
            } else {
                C5524f c5524fL = c5530l.l();
                Object size2 = itemState2.getIcon().getSize();
                interfaceC2425m3.V(149624325);
                boolean zU5 = interfaceC2425m3.U(size2) | interfaceC2425m3.U(c5524fL);
                Object objD6 = interfaceC2425m3.D();
                if (zU5 || objD6 == InterfaceC2425m.f22370a.a()) {
                    SizeConstraint height2 = itemState2.getIcon().getSize().getHeight();
                    float fN2 = (height2 instanceof SizeConstraint.Fixed ? (SizeConstraint.Fixed) height2 : fixed) != null ? C5015h.n(C5015h.n(r3.getValue()) / 2) : C5015h.n(0);
                    C5015h c5015hTimelineComponentView$lambda$13$lambda$1 = TimelineComponentViewKt.TimelineComponentView$lambda$13$lambda$1(h2Var);
                    if (c5015hTimelineComponentView$lambda$13$lambda$1 != null) {
                        int iT = (int) c5015hTimelineComponentView$lambda$13$lambda$1.t();
                        it = it3;
                        fN = C5015h.n(C5015h.n(iT - (itemState2.getConnector() != null ? r15.getWidth() : 0)) / 2);
                    } else {
                        it = it3;
                        fN = C5015h.n(0);
                    }
                    objD6 = z.a(C5015h.h(fN), C5015h.h(fN2));
                    interfaceC2425m3.u(objD6);
                } else {
                    it = it3;
                }
                Pair pair = (Pair) objD6;
                interfaceC2425m3.O();
                TimelineComponentState.ItemState itemState3 = (TimelineComponentState.ItemState) AbstractC2279u.p0(this.$timelineState$inlined.getItems(), i16);
                float fN3 = C5015h.n(((itemState3 == null || (icon = itemState3.getIcon()) == null || (size = icon.getSize()) == null || (height = size.getHeight()) == null || (c5015hDpOrNull = SizeConstraintExtensionsKt.dpOrNull(height)) == null) ? C5015h.n(0) : c5015hDpOrNull.t()) / 2);
                e.a aVar4 = androidx.compose.ui.e.f26613a;
                TimelineComponentStyle.ConnectorStyle connector2 = itemState2.getConnector();
                if (connector2 == null || (a10 = connector2.getMargin()) == null) {
                    i12 = i16;
                    a10 = p.a(C5015h.n(0));
                } else {
                    i12 = i16;
                }
                arrayList = arrayList3;
                i13 = 1;
                androidx.compose.ui.e eVarA = l0.p.a(n.b(p.h(aVar4, a10), 0.0f, ((C5015h) pair.d()).t(), 1, null), -1.0f);
                interfaceC2425m3.V(149657484);
                boolean zU6 = interfaceC2425m3.U(pair) | interfaceC2425m3.U(itemState2) | interfaceC2425m3.U(c5524f2) | interfaceC2425m3.a(z10) | interfaceC2425m3.U(c5524f3) | interfaceC2425m3.b(fN3);
                Object objD7 = interfaceC2425m3.D();
                if (zU6 || objD7 == InterfaceC2425m.f22370a.a()) {
                    objD7 = new TimelineComponentViewKt$TimelineComponentView$2$6$1$1(pair, itemState2, c5524f2, z10, c5524f3, fN3);
                    interfaceC2425m3.u(objD7);
                }
                interfaceC2425m3.O();
                androidx.compose.ui.e eVarK2 = c5530l.k(eVarA, c5524fL, (Function1) objD7);
                ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(connector.getColor(), interfaceC2425m3, 0);
                fixed2 = null;
                f.a(OverlayKt.overlay$default(eVarK2, forCurrentTheme, null, 2, null), interfaceC2425m3, 0);
                L l11 = L.f17438a;
            }
            interfaceC2425m3.O();
            i11 = i13;
            fixed = fixed2;
            arrayList3 = arrayList;
            it3 = it;
            i15 = i12;
        }
        interfaceC2425m3.O();
        interfaceC2425m3.O();
        if (this.$scope.h() != iH) {
            AbstractC2393b0.g(this.$onHelpersChanged, interfaceC2425m3, 6);
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
