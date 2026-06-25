package com.revenuecat.purchases.ui.revenuecatui.composables;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import r0.AbstractC6231m;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.AbstractC6365j1;
import s0.C6385r0;
import s0.E1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import s0.t1;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ad\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aX\u0010\u001f\u001a\u0004\u0018\u00010\u0017*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a0\u0010%\u001a\u00020#*\u00020\u00152\u0006\u0010!\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0082\b¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/e;", "", "visible", "Ls0/r0;", "color", "Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;", "highlight", "Lkotlin/Function0;", "Lw/G;", "", "placeholderFadeTransitionSpec", "contentFadeTransitionSpec", "placeholder-TgFrcIs", "(Landroidx/compose/ui/e;ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;LY/m;II)Landroidx/compose/ui/e;", "placeholder", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "rememberPlaceholder-OadGlvw", "(ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "rememberPlaceholder", "Lu0/f;", ReactProgressBarViewManager.PROP_PROGRESS, "Ls0/i1;", "lastOutline", "Li1/t;", "lastLayoutDirection", "Lr0/l;", "lastSize", "drawPlaceholder-hpmOzss", "(Lu0/f;Ls0/E1;JLcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;FLs0/i1;Li1/t;Lr0/l;)Ls0/i1;", "drawPlaceholder", "Ls0/k1;", "paint", "Lkotlin/Function1;", "LTd/L;", "drawBlock", "withLayer", "(Lu0/f;Ls0/k1;Lkotlin/jvm/functions/Function1;)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PlaceholderKt {
    /* JADX INFO: renamed from: drawPlaceholder-hpmOzss */
    public static final AbstractC6362i1 m612drawPlaceholderhpmOzss(InterfaceC6711f interfaceC6711f, E1 e12, long j10, PlaceholderHighlight placeholderHighlight, float f10, AbstractC6362i1 abstractC6362i1, EnumC5027t enumC5027t, C6230l c6230l) {
        InterfaceC6711f interfaceC6711f2;
        AbstractC6362i1 abstractC6362i1Mo6createOutlinePq9zytI = null;
        if (e12 == t1.a()) {
            InterfaceC6711f.B0(interfaceC6711f, j10, 0L, 0L, 0.0f, null, null, 0, 126, null);
            if (placeholderHighlight != null) {
                InterfaceC6711f.P(interfaceC6711f, placeholderHighlight.mo574brushd16Qtg0(f10, interfaceC6711f.f()), 0L, 0L, placeholderHighlight.alpha(f10), null, null, 0, 118, null);
            }
            return null;
        }
        if (C6230l.e(interfaceC6711f.f(), c6230l) && interfaceC6711f.getLayoutDirection() == enumC5027t) {
            abstractC6362i1Mo6createOutlinePq9zytI = abstractC6362i1;
        }
        if (abstractC6362i1Mo6createOutlinePq9zytI == null) {
            interfaceC6711f2 = interfaceC6711f;
            abstractC6362i1Mo6createOutlinePq9zytI = e12.mo6createOutlinePq9zytI(interfaceC6711f.f(), interfaceC6711f.getLayoutDirection(), interfaceC6711f2);
        } else {
            interfaceC6711f2 = interfaceC6711f;
        }
        AbstractC6362i1 abstractC6362i12 = abstractC6362i1Mo6createOutlinePq9zytI;
        AbstractC6365j1.e(interfaceC6711f2, abstractC6362i12, j10, 0.0f, null, null, 0, 60, null);
        if (placeholderHighlight != null) {
            AbstractC6365j1.c(interfaceC6711f, abstractC6362i12, placeholderHighlight.mo574brushd16Qtg0(f10, interfaceC6711f.f()), placeholderHighlight.alpha(f10), null, null, 0, 56, null);
        }
        return abstractC6362i12;
    }

    /* JADX INFO: renamed from: placeholder-TgFrcIs */
    public static final e m613placeholderTgFrcIs(e placeholder, boolean z10, long j10, E1 e12, PlaceholderHighlight placeholderHighlight, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        AbstractC5504s.h(placeholder, "$this$placeholder");
        interfaceC2425m.V(828411458);
        E1 e1A = (i11 & 4) != 0 ? t1.a() : e12;
        PlaceholderHighlight placeholderHighlight2 = (i11 & 8) != 0 ? null : placeholderHighlight;
        InterfaceC5082a interfaceC5082a3 = (i11 & 16) != 0 ? PlaceholderKt$placeholder$1.INSTANCE : interfaceC5082a;
        InterfaceC5082a interfaceC5082a4 = (i11 & 32) != 0 ? PlaceholderKt$placeholder$2.INSTANCE : interfaceC5082a2;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(828411458, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.placeholder (Placeholder.kt:68)");
        }
        e eVarThen = placeholder.then(new PlaceholderElement(m614rememberPlaceholderOadGlvw(z10, j10, e1A, placeholderHighlight2, interfaceC5082a3, interfaceC5082a4, interfaceC2425m, (i10 >> 3) & 524286, 0)));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return eVarThen;
    }

    /* JADX INFO: renamed from: rememberPlaceholder-OadGlvw */
    public static final Placeholder m614rememberPlaceholderOadGlvw(boolean z10, long j10, E1 e12, PlaceholderHighlight placeholderHighlight, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(1627318888);
        E1 e1A = (i11 & 4) != 0 ? t1.a() : e12;
        PlaceholderHighlight placeholderHighlight2 = (i11 & 8) != 0 ? null : placeholderHighlight;
        InterfaceC5082a interfaceC5082a3 = (i11 & 16) != 0 ? PlaceholderKt$rememberPlaceholder$1.INSTANCE : interfaceC5082a;
        InterfaceC5082a interfaceC5082a4 = (i11 & 32) != 0 ? PlaceholderKt$rememberPlaceholder$2.INSTANCE : interfaceC5082a2;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1627318888, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.rememberPlaceholder (Placeholder.kt:102)");
        }
        Object[] objArr = {Boolean.valueOf(z10), C6385r0.m(j10), e1A, placeholderHighlight2, interfaceC5082a3, interfaceC5082a4};
        boolean zU = false;
        for (int i12 = 0; i12 < 6; i12++) {
            zU |= interfaceC2425m.U(objArr[i12]);
        }
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new Placeholder(z10, j10, e1A, placeholderHighlight2, interfaceC5082a3, interfaceC5082a4, null);
            interfaceC2425m.u(objD);
        }
        Placeholder placeholder = (Placeholder) objD;
        boolean zIsInPreviewMode = HelperFunctionsKt.isInPreviewMode(interfaceC2425m, 0);
        interfaceC2425m.V(653949553);
        boolean zA = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.a(z10)) || (i10 & 6) == 4) | interfaceC2425m.a(zIsInPreviewMode) | interfaceC2425m.U(placeholder);
        Object objD2 = interfaceC2425m.D();
        if (zA || objD2 == InterfaceC2425m.f22370a.a()) {
            objD2 = new PlaceholderKt$rememberPlaceholder$3$1(z10, zIsInPreviewMode, placeholder, null);
            interfaceC2425m.u(objD2);
        }
        interfaceC2425m.O();
        AbstractC2393b0.e(placeholder, (Function2) objD2, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return placeholder;
    }

    private static final void withLayer(InterfaceC6711f interfaceC6711f, InterfaceC6368k1 interfaceC6368k1, Function1 function1) {
        InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
        interfaceC6364j0B.s(AbstractC6231m.c(interfaceC6711f.f()), interfaceC6368k1);
        function1.invoke(interfaceC6711f);
        interfaceC6364j0B.k();
    }
}
