package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import J.c;
import J.h;
import Td.L;
import Td.r;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AbstractC2739w0;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import i1.C5015h;
import i1.InterfaceC5011d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;
import s0.t1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ StackComponentStyle $badgeStack;
    final /* synthetic */ s $stackPlaceable;
    final /* synthetic */ StackComponentState $stackState;
    final /* synthetic */ boolean $topBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1(StackComponentStyle stackComponentStyle, StackComponentState stackComponentState, boolean z10, s sVar) {
        super(2);
        this.$badgeStack = stackComponentStyle;
        this.$stackState = stackComponentState;
        this.$topBadge = z10;
        this.$stackPlaceable = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        E1 hVar;
        E1 e1A;
        if ((i10 & 3) == 2 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1688443959, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.StackWithLongEdgeToEdgeBadge.<anonymous>.<anonymous>.<anonymous> (StackComponentView.kt:249)");
        }
        BackgroundStyles background = this.$badgeStack.getBackground();
        interfaceC2425m.V(-712013242);
        BackgroundStyle backgroundStyleRememberBackgroundStyle = background == null ? null : BackgroundStyleKt.rememberBackgroundStyle(background, interfaceC2425m, 0);
        interfaceC2425m.O();
        BorderStyles border = this.$badgeStack.getBorder();
        interfaceC2425m.V(-712010114);
        BorderStyle borderStyleRememberBorderStyle = border == null ? null : BorderStyleKt.rememberBorderStyle(border, interfaceC2425m, 0);
        interfaceC2425m.O();
        ShadowStyles shadow = this.$badgeStack.getShadow();
        interfaceC2425m.V(-712007234);
        ShadowStyle shadowStyleRememberShadowStyle = shadow == null ? null : ShadowStyleKt.rememberShadowStyle(shadow, interfaceC2425m, 0);
        interfaceC2425m.O();
        CornerRadiuses cornerRadiuses = this.$badgeStack.getShape().getCornerRadiuses();
        if (cornerRadiuses instanceof CornerRadiuses.Percentage) {
            interfaceC2425m.V(-597179452);
            E1 shape = ShapeKt.toShape(this.$badgeStack.getShape());
            h hVar2 = shape instanceof h ? (h) shape : null;
            if (hVar2 == null) {
                hVar = null;
            } else {
                s sVar = this.$stackPlaceable;
                hVar = new h(StackComponentViewKt.makeAbsolute(hVar2.g(), sVar, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())), StackComponentViewKt.makeAbsolute(hVar2.f(), sVar, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())), StackComponentViewKt.makeAbsolute(hVar2.d(), sVar, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())), StackComponentViewKt.makeAbsolute(hVar2.e(), sVar, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())));
            }
            if (hVar == null) {
                hVar = t1.a();
            }
            interfaceC2425m.O();
        } else {
            if (!(cornerRadiuses instanceof CornerRadiuses.Dp)) {
                interfaceC2425m.V(-712373002);
                interfaceC2425m.O();
                throw new r();
            }
            interfaceC2425m.V(-596387247);
            CornerRadiuses cornerRadiuses2 = this.$stackState.getShape().getCornerRadiuses();
            if (cornerRadiuses2 instanceof CornerRadiuses.Dp) {
                if (this.$topBadge) {
                    CornerRadiuses.Dp dp = (CornerRadiuses.Dp) cornerRadiuses;
                    CornerRadiuses.Dp dp2 = (CornerRadiuses.Dp) cornerRadiuses2;
                    e1A = ShapeKt.toShape(new Shape.Rectangle(new CornerRadiuses.Dp(dp.getTopLeading(), dp.getTopTrailing(), dp2.getBottomLeading(), dp2.getBottomTrailing())));
                } else {
                    CornerRadiuses.Dp dp3 = (CornerRadiuses.Dp) cornerRadiuses2;
                    CornerRadiuses.Dp dp4 = (CornerRadiuses.Dp) cornerRadiuses;
                    e1A = ShapeKt.toShape(new Shape.Rectangle(new CornerRadiuses.Dp(dp3.getTopLeading(), dp3.getTopTrailing(), dp4.getBottomLeading(), dp4.getBottomTrailing())));
                }
            } else {
                if (!(cornerRadiuses2 instanceof CornerRadiuses.Percentage)) {
                    throw new r();
                }
                E1 shape2 = ShapeKt.toShape(this.$stackState.getShape());
                h hVar3 = shape2 instanceof h ? (h) shape2 : null;
                if (hVar3 == null) {
                    hVar = null;
                } else {
                    boolean z10 = this.$topBadge;
                    s sVar2 = this.$stackPlaceable;
                    if (z10) {
                        interfaceC2425m.V(-15533247);
                        CornerRadiuses.Dp dp5 = (CornerRadiuses.Dp) cornerRadiuses;
                        hVar = new h(c.c(C5015h.n((float) dp5.getTopLeading())), c.c(C5015h.n((float) dp5.getTopTrailing())), StackComponentViewKt.makeAbsolute(hVar3.d(), sVar2, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())), StackComponentViewKt.makeAbsolute(hVar3.e(), sVar2, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())));
                        interfaceC2425m.O();
                    } else {
                        interfaceC2425m.V(-14694108);
                        CornerRadiuses.Dp dp6 = (CornerRadiuses.Dp) cornerRadiuses;
                        hVar = new h(StackComponentViewKt.makeAbsolute(hVar3.g(), sVar2, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())), StackComponentViewKt.makeAbsolute(hVar3.f(), sVar2, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e())), c.c(C5015h.n((float) dp6.getBottomTrailing())), c.c(C5015h.n((float) dp6.getBottomLeading())));
                        interfaceC2425m.O();
                    }
                }
                if (hVar == null) {
                    e1A = t1.a();
                }
                interfaceC2425m.O();
            }
            hVar = e1A;
            interfaceC2425m.O();
        }
        interfaceC2425m.V(-711875803);
        boolean zU = interfaceC2425m.U(shadowStyleRememberShadowStyle) | interfaceC2425m.U(this.$badgeStack) | interfaceC2425m.U(backgroundStyleRememberBackgroundStyle) | interfaceC2425m.U(borderStyleRememberBorderStyle);
        StackComponentStyle stackComponentStyle = this.$badgeStack;
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = ModifierExtensionsKt.applyIfNotNull(ModifierExtensionsKt.applyIfNotNull(ModifierExtensionsKt.applyIfNotNull(p.h(e.f26613a, stackComponentStyle.getMargin()), backgroundStyleRememberBackgroundStyle, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$1(hVar)), hVar, StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$2.INSTANCE), borderStyleRememberBorderStyle, new StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$3(stackComponentStyle));
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        f.a(androidx.compose.foundation.layout.s.f(e.f26613a, 0.0f, 1, null).then((e) objD), interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
