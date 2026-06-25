package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import I0.B;
import J.i;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import Td.z;
import U.j0;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.ColorAlias;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.I1;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b*\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\b*\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0002\u0010\u0011\u001a+\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aP\u0010!\u001a\u00020\u001e2*\u0010\u001a\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014\"\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\\\u0010'\u001a\u00020\u001e2*\u0010\u001a\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014\"\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u000f\u0010)\u001a\u00020(H\u0003¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020(H\u0003¢\u0006\u0004\b+\u0010*\u001a\u000f\u0010,\u001a\u00020(H\u0003¢\u0006\u0004\b,\u0010*\u001a\u000f\u0010-\u001a\u00020(H\u0003¢\u0006\u0004\b-\u0010*\u001a\u000f\u0010.\u001a\u00020(H\u0003¢\u0006\u0004\b.\u0010*\u001a\u000f\u0010/\u001a\u00020(H\u0003¢\u0006\u0004\b/\u0010*\u001a\u0019\u00100\u001a\u00020(2\b\b\u0001\u0010\u001b\u001a\u00020\u0016H\u0003¢\u0006\u0004\b0\u00101\u001a\u000f\u00102\u001a\u00020(H\u0003¢\u0006\u0004\b2\u0010*\"\u0014\u00103\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104\"\u0018\u00107\u001a\u00020\u0001*\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "toColorStyle", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "", "Lcom/revenuecat/purchases/ColorAlias;", "aliases", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "toColorStyles", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "", "useLightAlias", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Ljava/util/Map;Z)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;", "", "Lkotlin/Pair;", "", "Ls0/r0;", "toColorStops", "(Ljava/util/List;)[Lkotlin/Pair;", "colorStops", "degrees", "Ls0/I1;", "tileMode", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "relativeLinearGradient-3YTHUZs", "([Lkotlin/Pair;FI)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "relativeLinearGradient", "Lr0/f;", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/GradientBrush;", "radialGradient", "LTd/L;", "LinearGradient_Preview_Square", "(LY/m;I)V", "LinearGradient_Preview_Rectangle", "LinearGradient_Preview_Rectangle_RedBlue", "LinearGradient_Preview_Rectangle_OrangeCyan", "LinearGradient_Preview_Rectangle_Template014Button", "LinearGradient_Preview_Square_BluePink", "LinearGradient_Preview_SquaresDegrees", "(FLY/m;I)V", "RadialGradient_Preview", "PERCENT_SCALE", "F", "getForCurrentTheme", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "forCurrentTheme", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorStyleKt {
    private static final float PERCENT_SCALE = 100.0f;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Rectangle$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_Rectangle(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Rectangle_OrangeCyan$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42241 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42241(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_Rectangle_OrangeCyan(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Rectangle_RedBlue$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42251 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42251(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_Rectangle_RedBlue(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Rectangle_Template014Button$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42261 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42261(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_Rectangle_Template014Button(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Square$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42271 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42271(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_Square(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_Square_BluePink$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42281 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42281(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_Square_BluePink(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$LinearGradient_Preview_SquaresDegrees$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ float $degrees;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f10, int i10) {
            super(2);
            this.$degrees = f10;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.LinearGradient_Preview_SquaresDegrees(this.$degrees, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt$RadialGradient_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42292 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42292(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ColorStyleKt.RadialGradient_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void LinearGradient_Preview_Rectangle(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2011369738);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2011369738, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Rectangle (ColorStyle.kt:320)");
            }
            e eVarN = s.n(e.f26613a, C5015h.n(300), C5015h.n(100));
            Float fValueOf = Float.valueOf(0.0f);
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(b.b(eVarN, m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(fValueOf, C6385r0.m(aVar.l())), z.a(Float.valueOf(0.5f), C6385r0.m(aVar.h())), z.a(Float.valueOf(1.0f), C6385r0.m(aVar.b()))}, 45.0f, 0, 4, null), null, 0.0f, 6, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    public static final void LinearGradient_Preview_Rectangle_OrangeCyan(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-123893266);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-123893266, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Rectangle_OrangeCyan (ColorStyle.kt:364)");
            }
            f.a(b.b(s.n(e.f26613a, C5015h.n(300), C5015h.n(55)), m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(Float.valueOf(0.6f), C6385r0.m(AbstractC6387s0.f(255, 165, 0, 0, 8, null))), z.a(Float.valueOf(1.0f), C6385r0.m(C6385r0.f58985b.c()))}, 135.0f, 0, 4, null), null, 0.0f, 6, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42241(i10));
        }
    }

    public static final void LinearGradient_Preview_Rectangle_RedBlue(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1224320034);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1224320034, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Rectangle_RedBlue (ColorStyle.kt:342)");
            }
            e eVarN = s.n(e.f26613a, C5015h.n(300), C5015h.n(55));
            Float fValueOf = Float.valueOf(0.0f);
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(b.b(eVarN, m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(fValueOf, C6385r0.m(aVar.h())), z.a(Float.valueOf(1.0f), C6385r0.m(aVar.b()))}, 45.0f, 0, 4, null), null, 0.0f, 6, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42251(i10));
        }
    }

    public static final void LinearGradient_Preview_Rectangle_Template014Button(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1429933954);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1429933954, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Rectangle_Template014Button (ColorStyle.kt:383)");
            }
            f.a(b.b(s.n(e.f26613a, C5015h.n(300), C5015h.n(55)), m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(Float.valueOf(0.0f), C6385r0.m(AbstractC6387s0.f(1, 1, 87, 0, 8, null))), z.a(Float.valueOf(0.46f), C6385r0.m(AbstractC6387s0.f(35, 35, 151, 0, 8, null))), z.a(Float.valueOf(1.0f), C6385r0.m(AbstractC6387s0.f(221, 2, 92, 0, 8, null)))}, 8.0f, 0, 4, null), i.a(50), 0.0f, 4, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42261(i10));
        }
    }

    public static final void LinearGradient_Preview_Square(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1721100010);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1721100010, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Square (ColorStyle.kt:300)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(200));
            Float fValueOf = Float.valueOf(0.0f);
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(b.b(eVarM, m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(fValueOf, C6385r0.m(aVar.l())), z.a(Float.valueOf(0.5f), C6385r0.m(aVar.h())), z.a(Float.valueOf(1.0f), C6385r0.m(aVar.b()))}, 45.0f, 0, 4, null), null, 0.0f, 6, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42271(i10));
        }
    }

    public static final void LinearGradient_Preview_Square_BluePink(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1487537977);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1487537977, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_Square_BluePink (ColorStyle.kt:406)");
            }
            f.a(b.b(s.m(e.f26613a, C5015h.n(100)), m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(Float.valueOf(0.0f), C6385r0.m(C6385r0.f58985b.b())), z.a(Float.valueOf(1.0f), C6385r0.m(AbstractC6387s0.f(255, JfifUtil.MARKER_SOFn, 203, 0, 8, null)))}, 70.0f, 0, 4, null), null, 0.0f, 6, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42281(i10));
        }
    }

    public static final void LinearGradient_Preview_SquaresDegrees(float f10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1866931670);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.b(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1866931670, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.LinearGradient_Preview_SquaresDegrees (ColorStyle.kt:439)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            Float fValueOf = Float.valueOf(0.0f);
            C6385r0.a aVar = C6385r0.f58985b;
            e eVarB = b.b(eVarM, m480relativeLinearGradient3YTHUZs$default(new Pair[]{z.a(fValueOf, C6385r0.m(aVar.h())), z.a(Float.valueOf(1.0f), C6385r0.m(aVar.k()))}, f10, 0, 4, null), null, 0.0f, 6, null);
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarB);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            interfaceC2425m2 = interfaceC2425mG;
            j0.b(f10 + "deg", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m2, 0, 0, 131070);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(f10, i10));
        }
    }

    public static final void RadialGradient_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1776704032);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1776704032, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.RadialGradient_Preview (ColorStyle.kt:462)");
            }
            e eVarN = s.n(e.f26613a, C5015h.n(300), C5015h.n(100));
            Float fValueOf = Float.valueOf(0.0f);
            C6385r0.a aVar = C6385r0.f58985b;
            e eVarB = b.b(eVarN, m478radialGradientP_VxKs$default(new Pair[]{z.a(fValueOf, C6385r0.m(aVar.h())), z.a(Float.valueOf(1.0f), C6385r0.m(aVar.k()))}, 0L, 0.0f, 0, 14, null), null, 0.0f, 6, null);
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarB);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
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
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42292(i10));
        }
    }

    public static final /* synthetic */ ColorStyle getForCurrentTheme(ColorStyles colorStyles, InterfaceC2425m interfaceC2425m, int i10) {
        ColorStyle light;
        AbstractC5504s.h(colorStyles, "<this>");
        interfaceC2425m.V(-375069960);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-375069960, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.<get-forCurrentTheme> (ColorStyle.kt:75)");
        }
        if (!AbstractC7015m.a(interfaceC2425m, 0) || (light = colorStyles.getDark()) == null) {
            light = colorStyles.getLight();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return light;
    }

    /* JADX INFO: renamed from: radialGradient-P_Vx-Ks */
    private static final GradientBrush m477radialGradientP_VxKs(Pair<Float, C6385r0>[] pairArr, long j10, float f10, int i10) {
        return new RadialGradient((Pair[]) Arrays.copyOf(pairArr, pairArr.length), j10, f10, i10, null);
    }

    /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default */
    static /* synthetic */ GradientBrush m478radialGradientP_VxKs$default(Pair[] pairArr, long j10, float f10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = C6224f.f58329b.b();
        }
        if ((i11 & 4) != 0) {
            f10 = Float.POSITIVE_INFINITY;
        }
        if ((i11 & 8) != 0) {
            i10 = I1.f58895a.a();
        }
        return m477radialGradientP_VxKs(pairArr, j10, f10, i10);
    }

    /* JADX INFO: renamed from: relativeLinearGradient-3YTHUZs */
    private static final GradientBrush m479relativeLinearGradient3YTHUZs(Pair<Float, C6385r0>[] pairArr, float f10, int i10) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair<Float, C6385r0> pair : pairArr) {
            arrayList.add(C6385r0.m(((C6385r0) pair.d()).A()));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<Float, C6385r0> pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
        }
        return new RelativeLinearGradient(arrayList, arrayList2, f10, i10, null);
    }

    /* JADX INFO: renamed from: relativeLinearGradient-3YTHUZs$default */
    static /* synthetic */ GradientBrush m480relativeLinearGradient3YTHUZs$default(Pair[] pairArr, float f10, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = I1.f58895a.a();
        }
        return m479relativeLinearGradient3YTHUZs(pairArr, f10, i10);
    }

    private static final Pair<Float, C6385r0>[] toColorStops(List<ColorInfo.Gradient.Point> list) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        for (ColorInfo.Gradient.Point point : list) {
            arrayList.add(z.a(Float.valueOf(point.getPercent() / PERCENT_SCALE), C6385r0.m(AbstractC6387s0.b(point.getColor()))));
        }
        return (Pair[]) arrayList.toArray(new Pair[0]);
    }

    public static final /* synthetic */ ColorStyle toColorStyle(ColorInfo.Gradient gradient) {
        GradientBrush gradientBrushM478radialGradientP_VxKs$default;
        AbstractC5504s.h(gradient, "<this>");
        if (gradient instanceof ColorInfo.Gradient.Linear) {
            ColorInfo.Gradient.Linear linear = (ColorInfo.Gradient.Linear) gradient;
            Pair<Float, C6385r0>[] colorStops = toColorStops(linear.getPoints());
            gradientBrushM478radialGradientP_VxKs$default = m480relativeLinearGradient3YTHUZs$default((Pair[]) Arrays.copyOf(colorStops, colorStops.length), linear.getDegrees(), 0, 4, null);
        } else {
            if (!(gradient instanceof ColorInfo.Gradient.Radial)) {
                throw new r();
            }
            Pair<Float, C6385r0>[] colorStops2 = toColorStops(((ColorInfo.Gradient.Radial) gradient).getPoints());
            gradientBrushM478radialGradientP_VxKs$default = m478radialGradientP_VxKs$default((Pair[]) Arrays.copyOf(colorStops2, colorStops2.length), 0L, 0.0f, 0, 14, null);
        }
        return ColorStyle.Gradient.m462boximpl(ColorStyle.Gradient.m463constructorimpl(gradientBrushM478radialGradientP_VxKs$default));
    }

    public static final /* synthetic */ Result toColorStyles(ColorScheme colorScheme, Map aliases) {
        AbstractC5504s.h(colorScheme, "<this>");
        AbstractC5504s.h(aliases, "aliases");
        Result colorStyle = toColorStyle(colorScheme.getLight(), aliases, true);
        if (!(colorStyle instanceof Result.Success)) {
            if (!(colorStyle instanceof Result.Error)) {
                throw new r();
            }
            colorStyle = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) colorStyle).getValue(), new PaywallValidationError[0]));
        }
        ColorInfo dark = colorScheme.getDark();
        Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(dark != null ? toColorStyle(dark, aliases, false) : null);
        if (!(resultOrSuccessfullyNull instanceof Result.Success)) {
            if (!(resultOrSuccessfullyNull instanceof Result.Error)) {
                throw new r();
            }
            resultOrSuccessfullyNull = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) resultOrSuccessfullyNull).getValue(), new PaywallValidationError[0]));
        }
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        Result.Success success4 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.collectErrors(AbstractC2279u.p(colorStyle, resultOrSuccessfullyNull, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        AbstractC5504s.f(colorStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) colorStyle).getValue();
        AbstractC5504s.f(resultOrSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) resultOrSuccessfullyNull).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        return new Result.Success(new ColorStyles((ColorStyle) value, (ColorStyle) value2));
    }

    public static final /* synthetic */ Result toColorStyle(ColorInfo colorInfo, Map aliases, boolean z10) {
        GradientBrush gradientBrushM478radialGradientP_VxKs$default;
        ColorInfo light;
        ColorInfo dark;
        AbstractC5504s.h(colorInfo, "<this>");
        AbstractC5504s.h(aliases, "aliases");
        if (colorInfo instanceof ColorInfo.Alias) {
            ColorInfo.Alias alias = (ColorInfo.Alias) colorInfo;
            ColorScheme colorScheme = (ColorScheme) aliases.get(ColorAlias.m114boximpl(alias.getValue()));
            if (colorScheme != null) {
                light = (z10 || (dark = colorScheme.getDark()) == null) ? colorScheme.getLight() : dark;
            } else {
                light = null;
            }
            if (light instanceof ColorInfo.Gradient ? true : light instanceof ColorInfo.Hex) {
                return toColorStyle(light, aliases, z10);
            }
            if (light instanceof ColorInfo.Alias) {
                return new Result.Error(new PaywallValidationError.AliasedColorIsAlias(alias.getValue(), ((ColorInfo.Alias) light).getValue(), null));
            }
            if (light == null) {
                return new Result.Error(new PaywallValidationError.MissingColorAlias(alias.getValue(), null));
            }
            throw new r();
        }
        if (colorInfo instanceof ColorInfo.Hex) {
            return new Result.Success(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.b(((ColorInfo.Hex) colorInfo).getValue()))));
        }
        if (colorInfo instanceof ColorInfo.Gradient) {
            if (colorInfo instanceof ColorInfo.Gradient.Linear) {
                ColorInfo.Gradient.Linear linear = (ColorInfo.Gradient.Linear) colorInfo;
                Pair<Float, C6385r0>[] colorStops = toColorStops(linear.getPoints());
                gradientBrushM478radialGradientP_VxKs$default = m480relativeLinearGradient3YTHUZs$default((Pair[]) Arrays.copyOf(colorStops, colorStops.length), linear.getDegrees(), 0, 4, null);
            } else if (colorInfo instanceof ColorInfo.Gradient.Radial) {
                Pair<Float, C6385r0>[] colorStops2 = toColorStops(((ColorInfo.Gradient.Radial) colorInfo).getPoints());
                gradientBrushM478radialGradientP_VxKs$default = m478radialGradientP_VxKs$default((Pair[]) Arrays.copyOf(colorStops2, colorStops2.length), 0L, 0.0f, 0, 14, null);
            } else {
                throw new r();
            }
            return new Result.Success(ColorStyle.Gradient.m462boximpl(ColorStyle.Gradient.m463constructorimpl(gradientBrushM478radialGradientP_VxKs$default)));
        }
        throw new r();
    }
}
