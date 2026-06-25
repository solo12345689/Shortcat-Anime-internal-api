package com.revenuecat.purchases.ui.revenuecatui.components;

import I0.A;
import I0.B;
import I0.C;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.b2;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import com.revenuecat.purchases.paywalls.components.PaywallAnimation;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import g0.i;
import i1.AbstractC5022o;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import v.AbstractC6783d;
import v.InterfaceC6784e;
import w.AbstractC6877F;
import w.AbstractC6906j;
import w.InterfaceC6875D;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\n\u0010\u0006\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "transition", "Lkotlin/Function0;", "LTd/L;", "content", "TransitionView", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lkotlin/jvm/functions/Function2;LY/m;I)V", "Landroidx/compose/ui/e;", "hidden", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "AnimatedVisibility", "Landroidx/compose/animation/h;", "enterTransition", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)Landroidx/compose/animation/h;", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "Lw/D;", "easing", "(Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)Lw/D;", "getEasing", "", "shouldShow", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransitionViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$AnimatedVisibility$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ Function2 $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function2 function2) {
            super(3);
            this.$content = function2;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1879822145, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.AnimatedVisibility.<anonymous> (TransitionView.kt:66)");
            }
            this.$content.invoke(interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$AnimatedVisibility$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ PaywallTransition $this_AnimatedVisibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallTransition paywallTransition, Function2 function2, int i10) {
            super(2);
            this.$this_AnimatedVisibility = paywallTransition;
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TransitionViewKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$TransitionView$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41692 extends AbstractC5506u implements Function2 {
        final /* synthetic */ Function2 $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41692(Function2 function2) {
            super(2);
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(797485256, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.TransitionView.<anonymous> (TransitionView.kt:42)");
            }
            this.$content.invoke(interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$TransitionView$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41703 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ PaywallTransition $transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41703(PaywallTransition paywallTransition, Function2 function2, int i10) {
            super(2);
            this.$transition = paywallTransition;
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            TransitionViewKt.TransitionView(this.$transition, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaywallTransition.TransitionType.values().length];
            try {
                iArr[PaywallTransition.TransitionType.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallTransition.TransitionType.FADE_AND_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallTransition.TransitionType.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallTransition.TransitionType.SLIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaywallAnimation.AnimationType.values().length];
            try {
                iArr2[PaywallAnimation.AnimationType.EASE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaywallAnimation.AnimationType.EASE_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaywallAnimation.AnimationType.EASE_IN_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaywallAnimation.AnimationType.LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$enterTransition$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li1/r;", "it", "Li1/n;", "invoke-mHKZG7I", "(J)J", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(m395invokemHKZG7I(((C5025r) obj).j()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
        public final long m395invokemHKZG7I(long j10) {
            return AbstractC5022o.a(-180, 0);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$hidden$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/l;", "LI0/A;", "measurable", "Li1/b;", "constraints", "LI0/C;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41711 extends AbstractC5506u implements InterfaceC5096o {
        public static final C41711 INSTANCE = new C41711();

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.TransitionViewKt$hidden$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/s$a;", "LTd/L;", "invoke", "(Landroidx/compose/ui/layout/s$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06801 extends AbstractC5506u implements Function1 {
            public static final C06801 INSTANCE = new C06801();

            C06801() {
                super(1);
            }

            public final void invoke(s.a layout) {
                AbstractC5504s.h(layout, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }
        }

        C41711() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m396invoke3p2s80s((l) obj, (A) obj2, ((C5009b) obj3).r());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final C m396invoke3p2s80s(l layout, A measurable, long j10) {
            AbstractC5504s.h(layout, "$this$layout");
            AbstractC5504s.h(measurable, "measurable");
            s sVarV0 = measurable.v0(j10);
            return l.u0(layout, sVarV0.W0(), sVarV0.P0(), null, C06801.INSTANCE, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedVisibility(PaywallTransition paywallTransition, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(391884057);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(paywallTransition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(391884057, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.AnimatedVisibility (TransitionView.kt:57)");
            }
            interfaceC2425mG.V(1463461260);
            boolean zU = interfaceC2425mG.U(paywallTransition);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = b2.e(Boolean.FALSE, null, 2, null);
                interfaceC2425mG.u(objD);
            }
            C0 c02 = (C0) objD;
            interfaceC2425mG.O();
            interfaceC2425mG.V(1463463365);
            boolean zU2 = interfaceC2425mG.U(c02);
            Object objD2 = interfaceC2425mG.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new TransitionViewKt$AnimatedVisibility$1$1(c02, null);
                interfaceC2425mG.u(objD2);
            }
            interfaceC2425mG.O();
            AbstractC2393b0.e(paywallTransition, (Function2) objD2, interfaceC2425mG, i11 & 14);
            AbstractC6783d.e(AnimatedVisibility$lambda$3(c02), null, enterTransition(paywallTransition), null, null, i.d(1879822145, true, new AnonymousClass2(function2), interfaceC2425mG, 54), interfaceC2425mG, 196608, 26);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(paywallTransition, function2, i10));
        }
    }

    private static final boolean AnimatedVisibility$lambda$3(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedVisibility$lambda$4(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    public static final void TransitionView(PaywallTransition paywallTransition, Function2 content, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(content, "content");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1753108978);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(paywallTransition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(content) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1753108978, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.TransitionView (TransitionView.kt:29)");
            }
            if (paywallTransition == null) {
                interfaceC2425mG.V(1473784896);
                content.invoke(interfaceC2425mG, Integer.valueOf((i11 >> 3) & 14));
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(1473826622);
                if (paywallTransition.getDisplacementStrategy() == PaywallTransition.DisplacementStrategy.GREEDY) {
                    interfaceC2425mG.V(1473916429);
                    e.a aVar = e.f26613a;
                    e.a aVar2 = l0.e.f52304a;
                    B bH = f.h(aVar2.o(), false);
                    int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                    I iR = interfaceC2425mG.r();
                    androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, aVar);
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
                    androidx.compose.ui.e eVarHidden = hidden(aVar);
                    B bH2 = f.h(aVar2.o(), false);
                    int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
                    I iR2 = interfaceC2425mG.r();
                    androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarHidden);
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
                    content.invoke(interfaceC2425mG, Integer.valueOf((i11 >> 3) & 14));
                    interfaceC2425mG.x();
                    AnimatedVisibility(paywallTransition, i.d(1120237739, true, new TransitionViewKt$TransitionView$1$2(content), interfaceC2425mG, 54), interfaceC2425mG, (i11 & 14) | 48);
                    interfaceC2425mG.x();
                    interfaceC2425mG.O();
                } else {
                    interfaceC2425mG.V(1474120502);
                    AnimatedVisibility(paywallTransition, i.d(797485256, true, new C41692(content), interfaceC2425mG, 54), interfaceC2425mG, (i11 & 14) | 48);
                    interfaceC2425mG.O();
                }
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41703(paywallTransition, content, i10));
        }
    }

    private static final InterfaceC6875D easing(PaywallAnimation paywallAnimation) {
        InterfaceC6875D easing;
        return (paywallAnimation == null || (easing = getEasing(paywallAnimation)) == null) ? AbstractC6877F.f() : easing;
    }

    private static final androidx.compose.animation.h enterTransition(PaywallTransition paywallTransition) {
        int msDuration;
        int i10 = WhenMappings.$EnumSwitchMapping$0[paywallTransition.getType().ordinal()];
        if (i10 == 1) {
            PaywallAnimation animation = paywallTransition.getAnimation();
            msDuration = animation != null ? animation.getMsDuration() : 300;
            PaywallAnimation animation2 = paywallTransition.getAnimation();
            return androidx.compose.animation.f.m(AbstractC6906j.i(msDuration, animation2 != null ? animation2.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 2, null);
        }
        if (i10 == 2) {
            PaywallAnimation animation3 = paywallTransition.getAnimation();
            int msDuration2 = animation3 != null ? animation3.getMsDuration() : 300;
            PaywallAnimation animation4 = paywallTransition.getAnimation();
            androidx.compose.animation.h hVarM = androidx.compose.animation.f.m(AbstractC6906j.i(msDuration2, animation4 != null ? animation4.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 2, null);
            PaywallAnimation animation5 = paywallTransition.getAnimation();
            msDuration = animation5 != null ? animation5.getMsDuration() : 300;
            PaywallAnimation animation6 = paywallTransition.getAnimation();
            return hVarM.c(androidx.compose.animation.f.q(AbstractC6906j.i(msDuration, animation6 != null ? animation6.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 0L, 6, null));
        }
        if (i10 == 3) {
            PaywallAnimation animation7 = paywallTransition.getAnimation();
            msDuration = animation7 != null ? animation7.getMsDuration() : 300;
            PaywallAnimation animation8 = paywallTransition.getAnimation();
            return androidx.compose.animation.f.q(AbstractC6906j.i(msDuration, animation8 != null ? animation8.getMsDelay() : 0, easing(paywallTransition.getAnimation())), 0.0f, 0L, 6, null);
        }
        if (i10 != 4) {
            throw new r();
        }
        PaywallAnimation animation9 = paywallTransition.getAnimation();
        msDuration = animation9 != null ? animation9.getMsDuration() : 300;
        PaywallAnimation animation10 = paywallTransition.getAnimation();
        return androidx.compose.animation.f.v(AbstractC6906j.i(msDuration, animation10 != null ? animation10.getMsDelay() : 0, easing(paywallTransition.getAnimation())), AnonymousClass1.INSTANCE);
    }

    private static final InterfaceC6875D getEasing(PaywallAnimation paywallAnimation) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[paywallAnimation.getType().ordinal()];
        if (i10 == 1) {
            return AbstractC6877F.d();
        }
        if (i10 == 2) {
            return AbstractC6877F.c();
        }
        if (i10 == 3) {
            return AbstractC6877F.f();
        }
        if (i10 == 4) {
            return AbstractC6877F.e();
        }
        throw new r();
    }

    private static final androidx.compose.ui.e hidden(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.layout.i.a(eVar, C41711.INSTANCE);
    }
}
