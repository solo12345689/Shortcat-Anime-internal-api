package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Td.L;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.C5911f;
import p0.j;
import s0.AbstractC6362i1;
import s0.AbstractC6365j1;
import s0.E1;
import s0.t1;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "color", "Ls0/E1;", "shape", "overlay", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;", "underlay", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class OverlayKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$overlay$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/f;", "Lp0/j;", "invoke", "(Lp0/f;)Lp0/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ E1 $shape;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$overlay$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "LTd/L;", "invoke", "(Lu0/c;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06811 extends AbstractC5506u implements Function1 {
            final /* synthetic */ ColorStyle $color;
            final /* synthetic */ AbstractC6362i1 $outline;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06811(ColorStyle colorStyle, AbstractC6362i1 abstractC6362i1) {
                super(1);
                this.$color = colorStyle;
                this.$outline = abstractC6362i1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6708c) obj);
                return L.f17438a;
            }

            public final void invoke(InterfaceC6708c onDrawWithContent) {
                AbstractC5504s.h(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.B1();
                ColorStyle colorStyle = this.$color;
                if (colorStyle instanceof ColorStyle.Solid) {
                    AbstractC6365j1.e(onDrawWithContent, this.$outline, ((ColorStyle.Solid) colorStyle).m476unboximpl(), 0.0f, null, null, 0, 60, null);
                } else if (colorStyle instanceof ColorStyle.Gradient) {
                    AbstractC6365j1.c(onDrawWithContent, this.$outline, ((ColorStyle.Gradient) colorStyle).m468unboximpl(), 0.0f, null, null, 0, 60, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(E1 e12, ColorStyle colorStyle) {
            super(1);
            this.$shape = e12;
            this.$color = colorStyle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j invoke(C5911f drawWithCache) {
            AbstractC5504s.h(drawWithCache, "$this$drawWithCache");
            return drawWithCache.p(new C06811(this.$color, this.$shape.mo6createOutlinePq9zytI(drawWithCache.f(), drawWithCache.getLayoutDirection(), drawWithCache)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$underlay$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/f;", "LTd/L;", "invoke", "(Lu0/f;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42101 extends AbstractC5506u implements Function1 {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ E1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42101(E1 e12, ColorStyle colorStyle) {
            super(1);
            this.$shape = e12;
            this.$color = colorStyle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC6711f drawBehind) {
            AbstractC5504s.h(drawBehind, "$this$drawBehind");
            AbstractC6362i1 abstractC6362i1Mo6createOutlinePq9zytI = this.$shape.mo6createOutlinePq9zytI(drawBehind.f(), drawBehind.getLayoutDirection(), drawBehind);
            ColorStyle colorStyle = this.$color;
            if (colorStyle instanceof ColorStyle.Solid) {
                AbstractC6365j1.e(drawBehind, abstractC6362i1Mo6createOutlinePq9zytI, ((ColorStyle.Solid) colorStyle).m476unboximpl(), 0.0f, null, null, 0, 60, null);
            } else if (colorStyle instanceof ColorStyle.Gradient) {
                AbstractC6365j1.c(drawBehind, abstractC6362i1Mo6createOutlinePq9zytI, ((ColorStyle.Gradient) colorStyle).m468unboximpl(), 0.0f, null, null, 0, 60, null);
            }
        }
    }

    public static final /* synthetic */ e overlay(e eVar, ColorStyle color, E1 shape) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(color, "color");
        AbstractC5504s.h(shape, "shape");
        return b.c(eVar, new AnonymousClass1(shape, color));
    }

    public static /* synthetic */ e overlay$default(e eVar, ColorStyle colorStyle, E1 e12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        return overlay(eVar, colorStyle, e12);
    }

    public static final /* synthetic */ e underlay(e eVar, ColorStyle color, E1 shape) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(color, "color");
        AbstractC5504s.h(shape, "shape");
        return b.b(eVar, new C42101(shape, color));
    }

    public static /* synthetic */ e underlay$default(e eVar, ColorStyle colorStyle, E1 e12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        return underlay(eVar, colorStyle, e12);
    }
}
