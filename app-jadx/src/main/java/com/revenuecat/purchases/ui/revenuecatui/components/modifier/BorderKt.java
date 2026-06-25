package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import J.i;
import Td.L;
import Td.r;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.E1;
import s0.t1;
import x.AbstractC7007e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a%\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0002\u0010\u0005\u001a.\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u000f\u0010\u0012\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u000f\u0010\u0013\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0013\u0010\u000e\u001a\u000f\u0010\u0014\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0014\u0010\u000e\u001a\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;", "border", "Ls0/E1;", "shape", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;Ls0/E1;)Landroidx/compose/ui/e;", "Li1/h;", "width", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "colorStyle", "border-ziNgDLE", "(Landroidx/compose/ui/e;FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;", "LTd/L;", "Border_Preview_Solid", "(LY/m;I)V", "Border_Preview_SolidThin", "Border_Preview_SolidCircle", "Border_Preview_LinearGradientSquare", "Border_Preview_LinearGradientCircle", "Border_Preview_RadialGradientSquare", "Border_Preview_RadialGradientCircle", "Border_Preview_LinearGradient", "(Ls0/E1;LY/m;I)V", "Border_Preview_RadialGradient", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class BorderKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_LinearGradient$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ E1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(E1 e12, int i10) {
            super(2);
            this.$shape = e12;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_LinearGradient(this.$shape, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_LinearGradientCircle$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42021 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42021(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_LinearGradientCircle(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_LinearGradientSquare$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42031 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42031(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_LinearGradientSquare(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_RadialGradient$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42041 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ E1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42041(E1 e12, int i10) {
            super(2);
            this.$shape = e12;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_RadialGradient(this.$shape, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_RadialGradientCircle$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42051 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42051(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_RadialGradientCircle(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_RadialGradientSquare$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42061 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42061(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_RadialGradientSquare(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_Solid$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42071 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42071(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_Solid(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_SolidCircle$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42081 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42081(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_SolidCircle(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt$Border_Preview_SolidThin$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42091 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42091(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BorderKt.Border_Preview_SolidThin(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void Border_Preview_LinearGradient(E1 e12, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1213727402);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(e12) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1213727402, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradient (Border.kt:117)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(border(b.d(eVarM, aVar.h(), null, 2, null), new BorderStyle(C5015h.n(10), ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(135.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.c()), 10.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(0, 102, 255, 0, 8, null)), 30.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(160, 0, 160, 0, 8, null)), 80.0f)))), null), e12), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(e12, i10));
        }
    }

    public static final void Border_Preview_LinearGradientCircle(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-873280999);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-873280999, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradientCircle (Border.kt:99)");
            }
            Border_Preview_LinearGradient(i.g(), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42021(i10));
        }
    }

    public static final void Border_Preview_LinearGradientSquare(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(328570534);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(328570534, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_LinearGradientSquare (Border.kt:93)");
            }
            Border_Preview_LinearGradient(t1.a(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42031(i10));
        }
    }

    public static final void Border_Preview_RadialGradient(E1 e12, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1379549156);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(e12) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1379549156, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradient (Border.kt:150)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(border(b.d(eVarM, aVar.h(), null, 2, null), new BorderStyle(C5015h.n(10), ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.c()), 80.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(0, 102, 255, 0, 8, null)), 90.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(AbstractC6387s0.f(160, 0, 160, 0, 8, null)), 96.0f)))), null), e12), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42041(e12, i10));
        }
    }

    public static final void Border_Preview_RadialGradientCircle(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1718788077);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1718788077, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradientCircle (Border.kt:111)");
            }
            Border_Preview_RadialGradient(i.g(), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42051(i10));
        }
    }

    public static final void Border_Preview_RadialGradientSquare(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-516936544);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-516936544, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_RadialGradientSquare (Border.kt:105)");
            }
            Border_Preview_RadialGradient(t1.a(), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42061(i10));
        }
    }

    public static final void Border_Preview_Solid(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1171018009);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1171018009, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_Solid (Border.kt:42)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(border$default(b.d(eVarM, aVar.h(), null, 2, null), new BorderStyle(C5015h.n(10), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null), null, 2, null), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42071(i10));
        }
    }

    public static final void Border_Preview_SolidCircle(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2094328983);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2094328983, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_SolidCircle (Border.kt:76)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(border(b.d(eVarM, aVar.h(), null, 2, null), new BorderStyle(C5015h.n(10), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null), i.g()), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42081(i10));
        }
    }

    public static final void Border_Preview_SolidThin(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(471558496);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(471558496, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Border_Preview_SolidThin (Border.kt:59)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(border$default(b.d(eVarM, aVar.h(), null, 2, null), new BorderStyle(C5015h.n(2), ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar.b())), null), null, 2, null), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42091(i10));
        }
    }

    public static final /* synthetic */ e border(e eVar, BorderStyle border, E1 shape) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(border, "border");
        AbstractC5504s.h(shape, "shape");
        return m434borderziNgDLE(eVar, border.m457getWidthD9Ej5fM(), border.getColor(), shape);
    }

    public static /* synthetic */ e border$default(e eVar, BorderStyle borderStyle, E1 e12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e12 = t1.a();
        }
        return border(eVar, borderStyle, e12);
    }

    /* JADX INFO: renamed from: border-ziNgDLE */
    public static final /* synthetic */ e m434borderziNgDLE(e border, float f10, ColorStyle colorStyle, E1 shape) {
        AbstractC5504s.h(border, "$this$border");
        AbstractC5504s.h(colorStyle, "colorStyle");
        AbstractC5504s.h(shape, "shape");
        if (colorStyle instanceof ColorStyle.Solid) {
            return AbstractC7007e.f(border, f10, ((ColorStyle.Solid) colorStyle).m476unboximpl(), shape);
        }
        if (colorStyle instanceof ColorStyle.Gradient) {
            return AbstractC7007e.h(border, f10, ((ColorStyle.Gradient) colorStyle).m468unboximpl(), shape);
        }
        throw new r();
    }
}
