package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.P;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.ScrollableKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5906a;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "rootModifier", "LTd/L;", "invoke", "(Landroidx/compose/ui/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$MainStackComponent$stack$1 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ Function2 $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ e $modifier;
    final /* synthetic */ P $safeDrawingInsets;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$MainStackComponent$stack$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/e;", "Landroidx/compose/foundation/o;", "state", "Lz/q;", "orientation", "invoke", "(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/q;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public final e invoke(e applyIfNotNull, o state, q orientation) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(state, "state");
            AbstractC5504s.h(orientation, "orientation");
            return ScrollableKt.scrollable(applyIfNotNull, state, orientation);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$MainStackComponent$stack$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/e;", "Landroidx/compose/foundation/o;", "state", "Lz/q;", "orientation", "invoke", "(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/q;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5096o {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public final e invoke(e applyIfNotNull, o state, q orientation) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(state, "state");
            AbstractC5504s.h(orientation, "orientation");
            return ScrollableKt.scrollable(applyIfNotNull, state, orientation);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$MainStackComponent$stack$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/e;", "Landroidx/compose/foundation/o;", "state", "Lz/q;", "orientation", "invoke", "(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/q;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements InterfaceC5096o {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public final e invoke(e applyIfNotNull, o state, q orientation) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(state, "state");
            AbstractC5504s.h(orientation, "orientation");
            return ScrollableKt.scrollable(applyIfNotNull, state, orientation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$MainStackComponent$stack$1(StackComponentState stackComponentState, e eVar, PaywallState.Loaded.Components components, Function2 function2, P p10, float f10) {
        super(3);
        this.$stackState = stackComponentState;
        this.$modifier = eVar;
        this.$state = components;
        this.$clickHandler = function2;
        this.$safeDrawingInsets = p10;
        this.$contentAlpha = f10;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(e rootModifier, InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2 = interfaceC2425m;
        AbstractC5504s.h(rootModifier, "rootModifier");
        int i11 = (i10 & 6) == 0 ? i10 | (interfaceC2425m2.U(rootModifier) ? 4 : 2) : i10;
        if ((i11 & 19) == 18 && interfaceC2425m2.i()) {
            interfaceC2425m2.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-586909421, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous> (StackComponentView.kt:491)");
        }
        q scrollOrientation = this.$stackState.getScrollOrientation();
        interfaceC2425m2.V(-958142529);
        o oVarC = scrollOrientation == null ? null : m.c(0, interfaceC2425m2, 0, 1);
        interfaceC2425m2.O();
        if (this.$stackState.getChildren().isEmpty()) {
            interfaceC2425m2.V(362640510);
            f.a(SizeKt.size$default(this.$modifier, this.$stackState.getSize(), null, null, 6, null).then(rootModifier), interfaceC2425m2, 0);
            interfaceC2425m2.O();
        } else {
            interfaceC2425m2.V(362943752);
            Dimension dimension = this.$stackState.getDimension();
            if (dimension instanceof Dimension.Horizontal) {
                interfaceC2425m2.V(-958123426);
                Size size = this.$stackState.getSize();
                Dimension.Horizontal horizontal = (Dimension.Horizontal) dimension;
                float fM503getSpacingD9Ej5fM = this.$stackState.m503getSpacingD9Ej5fM();
                e eVarThen = ModifierExtensionsKt.applyIfNotNull(SizeKt.size$default(this.$modifier, this.$stackState.getSize(), null, AlignmentKt.toAlignment(horizontal.getAlignment()), 2, null), oVarC, this.$stackState.getScrollOrientation(), AnonymousClass1.INSTANCE).then(rootModifier);
                interfaceC2425m2.V(-958106345);
                boolean zU = interfaceC2425m2.U(this.$stackState) | interfaceC2425m2.U(this.$state) | interfaceC2425m2.F(this.$clickHandler) | interfaceC2425m2.U(this.$safeDrawingInsets) | interfaceC2425m2.b(this.$contentAlpha);
                StackComponentState stackComponentState = this.$stackState;
                PaywallState.Loaded.Components components = this.$state;
                Function2 function2 = this.$clickHandler;
                P p10 = this.$safeDrawingInsets;
                float f10 = this.$contentAlpha;
                Object objD = interfaceC2425m2.D();
                if (zU || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new StackComponentViewKt$MainStackComponent$stack$1$2$1(stackComponentState, components, function2, p10, f10);
                    interfaceC2425m2.u(objD);
                }
                interfaceC2425m2.O();
                HorizontalStackKt.m502HorizontalStackTN_CM5M(size, horizontal, fM503getSpacingD9Ej5fM, eVarThen, (Function1) objD, interfaceC2425m2, 0, 0);
                interfaceC2425m2.O();
            } else if (dimension instanceof Dimension.Vertical) {
                interfaceC2425m2.V(-958079794);
                Size size2 = this.$stackState.getSize();
                Dimension.Vertical vertical = (Dimension.Vertical) dimension;
                float fM503getSpacingD9Ej5fM2 = this.$stackState.m503getSpacingD9Ej5fM();
                e eVarThen2 = ModifierExtensionsKt.applyIfNotNull(SizeKt.size$default(this.$modifier, this.$stackState.getSize(), AlignmentKt.toAlignment(vertical.getAlignment()), null, 4, null), oVarC, this.$stackState.getScrollOrientation(), AnonymousClass3.INSTANCE).then(rootModifier);
                interfaceC2425m2.V(-958062713);
                boolean zU2 = interfaceC2425m2.U(this.$stackState) | interfaceC2425m2.U(this.$state) | interfaceC2425m2.F(this.$clickHandler) | interfaceC2425m2.U(this.$safeDrawingInsets) | interfaceC2425m2.b(this.$contentAlpha);
                StackComponentState stackComponentState2 = this.$stackState;
                PaywallState.Loaded.Components components2 = this.$state;
                Function2 function22 = this.$clickHandler;
                P p11 = this.$safeDrawingInsets;
                float f11 = this.$contentAlpha;
                Object objD2 = interfaceC2425m2.D();
                if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new StackComponentViewKt$MainStackComponent$stack$1$4$1(stackComponentState2, components2, function22, p11, f11);
                    interfaceC2425m2.u(objD2);
                }
                interfaceC2425m2.O();
                VerticalStackKt.m508VerticalStackTN_CM5M(size2, vertical, fM503getSpacingD9Ej5fM2, eVarThen2, (Function1) objD2, interfaceC2425m2, 0, 0);
                interfaceC2425m2.O();
            } else if (dimension instanceof Dimension.ZLayer) {
                interfaceC2425m2.V(-958024193);
                Dimension.ZLayer zLayer = (Dimension.ZLayer) dimension;
                e eVarThen3 = ModifierExtensionsKt.applyIfNotNull(SizeKt.size(this.$modifier, this.$stackState.getSize(), AlignmentKt.toHorizontalAlignmentOrNull(zLayer.getAlignment()), AlignmentKt.toVerticalAlignmentOrNull(zLayer.getAlignment())), oVarC, this.$stackState.getScrollOrientation(), AnonymousClass5.INSTANCE).then(rootModifier);
                l0.e alignment = AlignmentKt.toAlignment(zLayer.getAlignment());
                StackComponentState stackComponentState3 = this.$stackState;
                PaywallState.Loaded.Components components3 = this.$state;
                Function2 function23 = this.$clickHandler;
                P p12 = this.$safeDrawingInsets;
                float f12 = this.$contentAlpha;
                B bH = f.h(alignment, false);
                int iA = AbstractC2410h.a(interfaceC2425m2, 0);
                I iR = interfaceC2425m2.r();
                e eVarF = c.f(interfaceC2425m2, eVarThen3);
                InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA = aVar.a();
                if (interfaceC2425m2.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425m2.I();
                if (interfaceC2425m2.e()) {
                    interfaceC2425m2.h(interfaceC5082aA);
                } else {
                    interfaceC2425m2.s();
                }
                InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m2);
                m2.e(interfaceC2425mB, bH, aVar.e());
                m2.e(interfaceC2425mB, iR, aVar.g());
                Function2 function2B = aVar.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar.f());
                h hVar = h.f26161a;
                interfaceC2425m2.V(1797954681);
                for (ComponentStyle componentStyle : stackComponentState3.getChildren()) {
                    e.a aVar2 = e.f26613a;
                    boolean z10 = stackComponentState3.getApplyTopWindowInsets() && !StackComponentViewKt.getShouldIgnoreTopWindowInsets(componentStyle);
                    interfaceC2425m2.V(193843242);
                    boolean zU3 = interfaceC2425m2.U(p12);
                    Object objD3 = interfaceC2425m2.D();
                    if (zU3 || objD3 == InterfaceC2425m.f22370a.a()) {
                        objD3 = new StackComponentViewKt$MainStackComponent$stack$1$6$1$1$1(p12);
                        interfaceC2425m2.u(objD3);
                    }
                    interfaceC2425m2.O();
                    e eVarA = AbstractC5906a.a(ModifierExtensionsKt.conditional(aVar2, z10, (Function1) objD3), f12);
                    PaywallState.Loaded.Components components4 = components3;
                    ComponentViewKt.ComponentView(componentStyle, components4, function23, eVarA, interfaceC2425m, 0, 0);
                    components3 = components4;
                    interfaceC2425m2 = interfaceC2425m;
                }
                interfaceC2425m2.O();
                interfaceC2425m2.x();
                interfaceC2425m2.O();
            } else {
                interfaceC2425m2.V(367323680);
                interfaceC2425m2.O();
            }
            interfaceC2425m2.O();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
