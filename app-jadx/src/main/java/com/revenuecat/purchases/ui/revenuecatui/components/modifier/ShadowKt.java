package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import C.A;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import I0.B;
import J.h;
import J.i;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
import U.j0;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import android.graphics.BlurMaskFilter;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.amazon.device.iap.internal.c.b;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import i1.C5015h;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6225g;
import r0.AbstractC6229k;
import r0.C6224f;
import s0.AbstractC6362i1;
import s0.AbstractC6365j1;
import s0.AbstractC6384q0;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.E1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import s0.InterfaceC6374m1;
import s0.Q;
import s0.V;
import s0.t1;
import u0.InterfaceC6711f;
import x.AbstractC7007e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a#\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0002\u0010\u0005\u001a:\u0010\u0011\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a&\u0010\u0017\u001a\u00020\u0014*\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u000f\u0010\u001d\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u000f\u0010\u001e\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001e\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;", "shadow", "Ls0/E1;", "shape", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;Ls0/E1;)Landroidx/compose/ui/e;", "Lr0/l;", "size", "Li1/t;", "layoutDirection", "Li1/d;", "density", "Lr0/f;", b.as, "Ls0/m1;", "toPath-Xbl9iGQ", "(Ls0/E1;JLi1/t;Li1/d;Lr0/f;)Ls0/m1;", "toPath", "Ls0/i1;", "outline", "LTd/L;", "addOutline-0AR0LA0", "(Ls0/m1;Ls0/i1;J)V", "addOutline", "Shadow_Preview_Circle", "(LY/m;I)V", "Shadow_Preview_Square", "Shadow_Preview_CircleAlpha", "Shadow_Preview_SquareAlpha", "Shadow_Preview_Gradient_CustomShape", "Shadow_Preview_Margin", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ShadowKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Circle$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ShadowKt.Shadow_Preview_Circle(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_CircleAlpha$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42112 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42112(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ShadowKt.Shadow_Preview_CircleAlpha(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Gradient_CustomShape$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42122 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42122(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ShadowKt.Shadow_Preview_Gradient_CustomShape(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Margin$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42132 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42132(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ShadowKt.Shadow_Preview_Margin(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_Square$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42142 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42142(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ShadowKt.Shadow_Preview_Square(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$Shadow_Preview_SquareAlpha$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42152 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42152(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ShadowKt.Shadow_Preview_SquareAlpha(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt$shadow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/f;", "LTd/L;", "invoke", "(Lu0/f;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ ShadowStyle $shadow;
        final /* synthetic */ E1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShadowStyle shadowStyle, E1 e12) {
            super(1);
            this.$shadow = shadowStyle;
            this.$shape = e12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC6711f drawBehind) {
            AbstractC5504s.h(drawBehind, "$this$drawBehind");
            InterfaceC6374m1 interfaceC6374m1M437toPathXbl9iGQ = ShadowKt.m437toPathXbl9iGQ(this.$shape, drawBehind.f(), drawBehind.getLayoutDirection(), drawBehind, C6224f.d(AbstractC6225g.a(drawBehind.l1(this.$shadow.m490getXD9Ej5fM()), drawBehind.l1(this.$shadow.m491getYD9Ej5fM()))));
            InterfaceC6368k1 interfaceC6368k1A = Q.a();
            ShadowStyle shadowStyle = this.$shadow;
            ColorStyle color = shadowStyle.getColor();
            if (color instanceof ColorStyle.Solid) {
                interfaceC6368k1A.p(((ColorStyle.Solid) shadowStyle.getColor()).m476unboximpl());
            } else if (color instanceof ColorStyle.Gradient) {
                ((ColorStyle.Gradient) shadowStyle.getColor()).m468unboximpl().mo965applyToPq9zytI(drawBehind.f(), interfaceC6368k1A, 1.0f);
            }
            if (!C5015h.q(shadowStyle.m489getRadiusD9Ej5fM(), C5015h.n(0))) {
                interfaceC6368k1A.u().setMaskFilter(new BlurMaskFilter(drawBehind.l1(shadowStyle.m489getRadiusD9Ej5fM()), BlurMaskFilter.Blur.NORMAL));
            }
            E1 e12 = this.$shape;
            InterfaceC6364j0 interfaceC6364j0B = drawBehind.n1().b();
            interfaceC6364j0B.p();
            interfaceC6364j0B.b(ShadowKt.m438toPathXbl9iGQ$default(e12, drawBehind.f(), drawBehind.getLayoutDirection(), drawBehind, null, 8, null), AbstractC6384q0.f58976a.a());
            interfaceC6364j0B.t(interfaceC6374m1M437toPathXbl9iGQ, interfaceC6368k1A);
            interfaceC6364j0B.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Circle(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1888265500);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1888265500, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Circle (Shadow.kt:96)");
            }
            h hVarG = i.g();
            e.a aVar = e.f26613a;
            e eVarM = s.m(aVar, C5015h.n(200));
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarM);
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
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            e eVarM2 = s.m(aVar, C5015h.n(100));
            C6385r0.a aVar3 = C6385r0.f58985b;
            long jM470constructorimpl = ColorStyle.Solid.m470constructorimpl(aVar3.a());
            float f10 = 5;
            f.a(androidx.compose.foundation.b.c(shadow(eVarM2, new ShadowStyle(ColorStyle.Solid.m469boximpl(jM470constructorimpl), C5015h.n(0), C5015h.n(f10), C5015h.n(f10), null), hVarG), aVar3.h(), hVarG), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_CircleAlpha(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(524710378);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(524710378, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_CircleAlpha (Shadow.kt:149)");
            }
            h hVarG = i.g();
            e.a aVar = e.f26613a;
            e eVarM = s.m(aVar, C5015h.n(200));
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarM);
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
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            e eVarM2 = s.m(aVar, C5015h.n(100));
            C6385r0.a aVar3 = C6385r0.f58985b;
            long jM470constructorimpl = ColorStyle.Solid.m470constructorimpl(aVar3.a());
            float f10 = 5;
            f.a(androidx.compose.foundation.b.c(shadow(eVarM2, new ShadowStyle(ColorStyle.Solid.m469boximpl(jM470constructorimpl), C5015h.n(0), C5015h.n(f10), C5015h.n(f10), null), hVarG), C6385r0.q(aVar3.h(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), hVarG), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42112(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Gradient_CustomShape(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2006972301);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2006972301, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Gradient_CustomShape (Shadow.kt:203)");
            }
            h hVarA = i.a(50);
            e.a aVar = e.f26613a;
            e eVarM = s.m(aVar, C5015h.n(200));
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarM);
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
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            C6385r0.a aVar3 = C6385r0.f58985b;
            interfaceC2425m2 = interfaceC2425mG;
            j0.b("GET UNLIMITED RGB", p.j(androidx.compose.foundation.b.c(shadow(aVar, new ShadowStyle(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar3.h()), 10.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar3.f()), 50.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar3.b()), 90.0f)))), C5015h.n((float) 9.5d), C5015h.n(0), C5015h.n(6), null), hVarA), aVar3.a(), hVarA), C5015h.n(24), C5015h.n(16)), aVar3.k(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425mG, D.f17598b).p(), interfaceC2425m2, 390, 0, 65528);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C42122(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Margin(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1769512070);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1769512070, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Margin (Shadow.kt:249)");
            }
            float f10 = 16;
            A aD = p.d(C5015h.n(8), C5015h.n(f10), C5015h.n(4), C5015h.n(24));
            E1 e1A = t1.a();
            e.a aVar = e.f26613a;
            e eVarN = s.n(aVar, C5015h.n(100), C5015h.n(200));
            B bA = AbstractC1136g.a(C1131b.f2093a.b(), l0.e.f52304a.g(), interfaceC2425mG, 54);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarN);
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
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            float f11 = 50;
            e eVarN2 = s.n(p.h(aVar, aD), C5015h.n(f11), C5015h.n(f11));
            C6385r0.a aVar3 = C6385r0.f58985b;
            long jM470constructorimpl = ColorStyle.Solid.m470constructorimpl(aVar3.a());
            float f12 = 0;
            float fN = C5015h.n(f12);
            float f13 = 5;
            float fN2 = C5015h.n(f13);
            float f14 = 20;
            float f15 = 2;
            f.a(p.i(AbstractC7007e.f(androidx.compose.foundation.b.c(shadow(eVarN2, new ShadowStyle(ColorStyle.Solid.m469boximpl(jM470constructorimpl), C5015h.n(f14), fN, fN2, null), e1A), aVar3.h(), e1A), C5015h.n(f15), aVar3.b(), e1A), C5015h.n(f10)), interfaceC2425mG, 0);
            e eVarN3 = s.n(p.h(aVar, aD), C5015h.n(f11), C5015h.n(f11));
            long jM470constructorimpl2 = ColorStyle.Solid.m470constructorimpl(aVar3.a());
            f.a(p.i(AbstractC7007e.f(androidx.compose.foundation.b.c(shadow(eVarN3, new ShadowStyle(ColorStyle.Solid.m469boximpl(jM470constructorimpl2), C5015h.n(f14), C5015h.n(f12), C5015h.n(f13), null), e1A), aVar3.h(), e1A), C5015h.n(f15), aVar3.b(), e1A), C5015h.n(f10)), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42132(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_Square(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1204850263);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1204850263, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_Square (Shadow.kt:123)");
            }
            E1 e1A = t1.a();
            e.a aVar = e.f26613a;
            e eVarM = s.m(aVar, C5015h.n(200));
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarM);
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
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            e eVarM2 = s.m(aVar, C5015h.n(100));
            C6385r0.a aVar3 = C6385r0.f58985b;
            long jM470constructorimpl = ColorStyle.Solid.m470constructorimpl(aVar3.a());
            f.a(androidx.compose.foundation.b.c(shadow(eVarM2, new ShadowStyle(ColorStyle.Solid.m469boximpl(jM470constructorimpl), C5015h.n(20), C5015h.n(10), C5015h.n(5), null), e1A), aVar3.h(), e1A), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42142(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Shadow_Preview_SquareAlpha(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1511945597);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1511945597, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Shadow_Preview_SquareAlpha (Shadow.kt:176)");
            }
            E1 e1A = t1.a();
            e.a aVar = e.f26613a;
            e eVarM = s.m(aVar, C5015h.n(200));
            B bH = f.h(l0.e.f52304a.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarM);
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
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            e eVarM2 = s.m(aVar, C5015h.n(100));
            C6385r0.a aVar3 = C6385r0.f58985b;
            long jM470constructorimpl = ColorStyle.Solid.m470constructorimpl(aVar3.a());
            f.a(androidx.compose.foundation.b.c(shadow(eVarM2, new ShadowStyle(ColorStyle.Solid.m469boximpl(jM470constructorimpl), C5015h.n(20), C5015h.n(10), C5015h.n(5), null), e1A), C6385r0.q(aVar3.h(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), e1A), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42152(i10));
        }
    }

    /* JADX INFO: renamed from: addOutline-0AR0LA0, reason: not valid java name */
    private static final void m436addOutline0AR0LA0(InterfaceC6374m1 interfaceC6374m1, AbstractC6362i1 abstractC6362i1, long j10) {
        if (abstractC6362i1 instanceof AbstractC6362i1.b) {
            InterfaceC6374m1.t(interfaceC6374m1, ((AbstractC6362i1.b) abstractC6362i1).b().t(j10), null, 2, null);
        } else if (abstractC6362i1 instanceof AbstractC6362i1.c) {
            InterfaceC6374m1.s(interfaceC6374m1, AbstractC6229k.f(((AbstractC6362i1.c) abstractC6362i1).b(), j10), null, 2, null);
        } else if (abstractC6362i1 instanceof AbstractC6362i1.a) {
            interfaceC6374m1.q(((AbstractC6362i1.a) abstractC6362i1).b(), j10);
        }
    }

    public static final /* synthetic */ e shadow(e eVar, ShadowStyle shadow, E1 shape) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(shadow, "shadow");
        AbstractC5504s.h(shape, "shape");
        return androidx.compose.ui.draw.b.b(eVar, new AnonymousClass1(shadow, shape));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toPath-Xbl9iGQ, reason: not valid java name */
    public static final InterfaceC6374m1 m437toPathXbl9iGQ(E1 e12, long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d, C6224f c6224f) {
        AbstractC6362i1 abstractC6362i1Mo6createOutlinePq9zytI = e12.mo6createOutlinePq9zytI(j10, enumC5027t, interfaceC5011d);
        if (c6224f == null) {
            InterfaceC6374m1 interfaceC6374m1A = V.a();
            AbstractC6365j1.a(interfaceC6374m1A, abstractC6362i1Mo6createOutlinePq9zytI);
            return interfaceC6374m1A;
        }
        InterfaceC6374m1 interfaceC6374m1A2 = V.a();
        m436addOutline0AR0LA0(interfaceC6374m1A2, abstractC6362i1Mo6createOutlinePq9zytI, c6224f.u());
        return interfaceC6374m1A2;
    }

    /* JADX INFO: renamed from: toPath-Xbl9iGQ$default, reason: not valid java name */
    static /* synthetic */ InterfaceC6374m1 m438toPathXbl9iGQ$default(E1 e12, long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d, C6224f c6224f, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            c6224f = null;
        }
        return m437toPathXbl9iGQ(e12, j10, enumC5027t, interfaceC5011d, c6224f);
    }
}
