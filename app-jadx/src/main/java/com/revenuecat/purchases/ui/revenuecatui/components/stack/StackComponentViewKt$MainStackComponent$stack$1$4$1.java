package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.InterfaceC1138i;
import C.P;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import g0.i;
import ie.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5906a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScope;", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$MainStackComponent$stack$1$4$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function2 $clickHandler;
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ P $safeDrawingInsets;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt$MainStackComponent$stack$1$4$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LC/i;", "", "index", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "child", "LTd/L;", "invoke", "(LC/i;ILcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements q {
        final /* synthetic */ Function2 $clickHandler;
        final /* synthetic */ float $contentAlpha;
        final /* synthetic */ P $safeDrawingInsets;
        final /* synthetic */ StackComponentState $stackState;
        final /* synthetic */ PaywallState.Loaded.Components $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Components components, Function2 function2, StackComponentState stackComponentState, P p10, float f10) {
            super(5);
            this.$state = components;
            this.$clickHandler = function2;
            this.$stackState = stackComponentState;
            this.$safeDrawingInsets = p10;
            this.$contentAlpha = f10;
        }

        @Override // ie.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            invoke((InterfaceC1138i) obj, ((Number) obj2).intValue(), (ComponentStyle) obj3, (InterfaceC2425m) obj4, ((Number) obj5).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1138i items, int i10, ComponentStyle child, InterfaceC2425m interfaceC2425m, int i11) {
            int i12;
            AbstractC5504s.h(items, "$this$items");
            AbstractC5504s.h(child, "child");
            if ((i11 & 6) == 0) {
                i12 = (interfaceC2425m.U(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= interfaceC2425m.c(i10) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                i12 |= interfaceC2425m.U(child) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
            }
            if ((i12 & 1171) == 1170 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1477849382, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.MainStackComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:541)");
            }
            PaywallState.Loaded.Components components = this.$state;
            Function2 function2 = this.$clickHandler;
            e.a aVar = e.f26613a;
            boolean zC = AbstractC5504s.c(child.getSize().getHeight(), SizeConstraint.Fill.INSTANCE);
            interfaceC2425m.V(-1700519402);
            boolean z10 = false;
            boolean z11 = (i12 & 14) == 4;
            Object objD = interfaceC2425m.D();
            if (z11 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new StackComponentViewKt$MainStackComponent$stack$1$4$1$1$1$1(items);
                interfaceC2425m.u(objD);
            }
            interfaceC2425m.O();
            e eVarConditional = ModifierExtensionsKt.conditional(aVar, zC, (Function1) objD);
            if (this.$stackState.getApplyTopWindowInsets() && i10 == 0 && !StackComponentViewKt.getShouldIgnoreTopWindowInsets(child)) {
                z10 = true;
            }
            interfaceC2425m.V(-1700502167);
            boolean zU = interfaceC2425m.U(this.$safeDrawingInsets);
            P p10 = this.$safeDrawingInsets;
            Object objD2 = interfaceC2425m.D();
            if (zU || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new StackComponentViewKt$MainStackComponent$stack$1$4$1$1$2$1(p10);
                interfaceC2425m.u(objD2);
            }
            interfaceC2425m.O();
            ComponentViewKt.ComponentView(child, components, function2, AbstractC5906a.a(ModifierExtensionsKt.conditional(eVarConditional, z10, (Function1) objD2), this.$contentAlpha), interfaceC2425m, (i12 >> 6) & 14, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$MainStackComponent$stack$1$4$1(StackComponentState stackComponentState, PaywallState.Loaded.Components components, Function2 function2, P p10, float f10) {
        super(1);
        this.$stackState = stackComponentState;
        this.$state = components;
        this.$clickHandler = function2;
        this.$safeDrawingInsets = p10;
        this.$contentAlpha = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VerticalStackScope) obj);
        return L.f17438a;
    }

    public final void invoke(VerticalStackScope VerticalStack) {
        AbstractC5504s.h(VerticalStack, "$this$VerticalStack");
        VerticalStack.items(this.$stackState.getChildren(), i.b(1477849382, true, new AnonymousClass1(this.$state, this.$clickHandler, this.$stackState, this.$safeDrawingInsets, this.$contentAlpha)));
    }
}
