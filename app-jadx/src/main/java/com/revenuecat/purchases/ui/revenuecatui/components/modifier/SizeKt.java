package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import I0.B;
import K0.InterfaceC1788g;
import Td.D;
import Td.L;
import Td.r;
import U.j0;
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
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a3\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\bH\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\f\u001a\u000f\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\f\u001a\u000f\u0010\u0010\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\f\u001a\u000f\u0010\u0011\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\f\u001a\u000f\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Ll0/e$b;", "horizontalAlignment", "Ll0/e$c;", "verticalAlignment", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;)Landroidx/compose/ui/e;", "LTd/L;", "Size_Preview", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V", "Size_Preview_FitFit", "(LY/m;I)V", "Size_Preview_FillFill", "Size_Preview_FillFit", "Size_Preview_FitFill", "Size_Preview_FixedFixed", "Size_Preview_HorizontalAlignment", "Size_Preview_VerticalAlignment", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class SizeKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Size $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Size size, int i10) {
            super(2);
            this.$size = size;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview(this.$size, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_FillFill$1 */
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
            SizeKt.Size_Preview_FillFill(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_FillFit$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42161 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42161(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview_FillFit(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_FitFill$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42171 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42171(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview_FitFill(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_FitFit$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42181 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42181(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview_FitFit(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_FixedFixed$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42191 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42191(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview_FixedFixed(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_HorizontalAlignment$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42202 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42202(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview_HorizontalAlignment(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.SizeKt$Size_Preview_VerticalAlignment$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42212 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42212(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SizeKt.Size_Preview_VerticalAlignment(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void Size_Preview(Size size, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(229743802);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(size) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(229743802, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview (Size.kt:59)");
            }
            e.a aVar = e.f26613a;
            e eVarM = s.m(aVar, C5015h.n(200));
            e.a aVar2 = l0.e.f52304a;
            B bH = f.h(aVar2.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarM);
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
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            h hVar = h.f26161a;
            androidx.compose.ui.e eVarSize$default = size$default(b.d(aVar, C6385r0.f58985b.h(), null, 2, null), size, null, null, 6, null);
            B bH2 = f.h(aVar2.e(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarSize$default);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
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
            m2.e(interfaceC2425mB2, bH2, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            interfaceC2425m2 = interfaceC2425mG;
            j0.b("Hello world!", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m2, 6, 0, 131070);
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(size, i10));
        }
    }

    public static final void Size_Preview_FillFill(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1104053776);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1104053776, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FillFill (Size.kt:85)");
            }
            SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
            Size_Preview(new Size(fill, fill), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    public static final void Size_Preview_FillFit(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1057098538);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1057098538, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FillFit (Size.kt:91)");
            }
            Size_Preview(new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42161(i10));
        }
    }

    public static final void Size_Preview_FitFill(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(464684496);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(464684496, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FitFill (Size.kt:97)");
            }
            Size_Preview(new Size(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42171(i10));
        }
    }

    public static final void Size_Preview_FitFit(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(692061002);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(692061002, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FitFit (Size.kt:79)");
            }
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            Size_Preview(new Size(fit, fit), interfaceC2425mG, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42181(i10));
        }
    }

    public static final void Size_Preview_FixedFixed(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-729326102);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-729326102, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FixedFixed (Size.kt:103)");
            }
            Size_Preview(new Size(new SizeConstraint.Fixed(D.b(50), null), new SizeConstraint.Fixed(D.b(50), null)), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42191(i10));
        }
    }

    public static final void Size_Preview_HorizontalAlignment(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1277946437);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1277946437, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_HorizontalAlignment (Size.kt:109)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarM = s.m(aVar, C5015h.n(200));
            e.a aVar2 = l0.e.f52304a;
            B bH = f.h(aVar2.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarM);
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
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            h hVar = h.f26161a;
            androidx.compose.ui.e eVarQ = s.q(b.d(aVar, C6385r0.f58985b.h(), null, 2, null), C5015h.n(150));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            androidx.compose.ui.e eVarSize$default = size$default(eVarQ, new Size(fit, fit), aVar2.j(), null, 4, null);
            B bH2 = f.h(aVar2.e(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarSize$default);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
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
            m2.e(interfaceC2425mB2, bH2, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            interfaceC2425m2 = interfaceC2425mG;
            j0.b("Hello world!", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m2, 6, 0, 131070);
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42202(i10));
        }
    }

    public static final void Size_Preview_VerticalAlignment(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(450739689);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(450739689, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_VerticalAlignment (Size.kt:132)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarM = s.m(aVar, C5015h.n(200));
            e.a aVar2 = l0.e.f52304a;
            B bH = f.h(aVar2.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarM);
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
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            h hVar = h.f26161a;
            androidx.compose.ui.e eVarL = s.l(b.d(aVar, C6385r0.f58985b.h(), null, 2, null), C5015h.n(150));
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            androidx.compose.ui.e eVarSize$default = size$default(eVarL, new Size(fit, fit), null, aVar2.a(), 2, null);
            B bH2 = f.h(aVar2.e(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarSize$default);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
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
            m2.e(interfaceC2425mB2, bH2, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            interfaceC2425m2 = interfaceC2425mG;
            j0.b("Hello world!", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m2, 6, 0, 131070);
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42212(i10));
        }
    }

    public static final /* synthetic */ androidx.compose.ui.e size(androidx.compose.ui.e eVar, Size size, e.b bVar, e.c cVar) {
        androidx.compose.ui.e eVarV;
        androidx.compose.ui.e eVarI;
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(size, "size");
        SizeConstraint width = size.getWidth();
        if (width instanceof SizeConstraint.Fit) {
            e.a aVar = androidx.compose.ui.e.f26613a;
            if (bVar == null) {
                bVar = l0.e.f52304a.g();
            }
            eVarV = s.D(aVar, bVar, false, 2, null);
        } else if (width instanceof SizeConstraint.Fill) {
            eVarV = s.h(androidx.compose.ui.e.f26613a, 0.0f, 1, null);
        } else {
            if (!(width instanceof SizeConstraint.Fixed)) {
                throw new r();
            }
            eVarV = s.v(androidx.compose.ui.e.f26613a, C5015h.n(((SizeConstraint.Fixed) width).getValue()));
        }
        SizeConstraint height = size.getHeight();
        if (height instanceof SizeConstraint.Fit) {
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            if (cVar == null) {
                cVar = l0.e.f52304a.i();
            }
            eVarI = s.z(aVar2, cVar, false, 2, null);
        } else if (height instanceof SizeConstraint.Fill) {
            eVarI = s.d(androidx.compose.ui.e.f26613a, 0.0f, 1, null);
        } else {
            if (!(height instanceof SizeConstraint.Fixed)) {
                throw new r();
            }
            eVarI = s.i(androidx.compose.ui.e.f26613a, C5015h.n(((SizeConstraint.Fixed) height).getValue()));
        }
        return eVar.then(eVarV).then(eVarI);
    }

    public static /* synthetic */ androidx.compose.ui.e size$default(androidx.compose.ui.e eVar, Size size, e.b bVar, e.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        return size(eVar, size, bVar, cVar);
    }
}
