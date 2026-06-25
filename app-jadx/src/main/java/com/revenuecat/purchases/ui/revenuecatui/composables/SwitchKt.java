package com.revenuecat.purchases.ui.revenuecatui.composables;

import B.k;
import B.m;
import I0.B;
import J.i;
import K0.InterfaceC1788g;
import Td.L;
import Td.r;
import U.AbstractC2181s;
import U.C2175l;
import U.D;
import U.U;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.H;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.j;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.material3.a;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import s0.C6385r0;
import s0.E1;
import w.C6895d0;
import w.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u0018\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 \"\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 \"\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 \"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0018\u0010\u0017\u001a\u00020\u0011*\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0018\u0010\u0017\u001a\u00020\u001c*\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"", "checked", "Lkotlin/Function1;", "LTd/L;", "onCheckedChange", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "thumbContent", "enabled", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;", "colors", "LB/m;", "interactionSource", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;ZLcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;LB/m;LY/m;II)V", "LB/k;", "Ls0/E1;", "thumbShape", "SwitchImpl", "(Landroidx/compose/ui/e;ZZLcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;Lkotlin/jvm/functions/Function2;LB/k;Ls0/E1;LY/m;I)V", "LU/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ShapeKeyTokens;", "value", "fromToken", "(LU/U;Lcom/revenuecat/purchases/ui/revenuecatui/composables/ShapeKeyTokens;)Ls0/E1;", "LU/l;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ColorSchemeKeyTokens;", "Ls0/r0;", "(LU/l;Lcom/revenuecat/purchases/ui/revenuecatui/composables/ColorSchemeKeyTokens;)J", "Li1/h;", "ThumbDiameter", "F", "UncheckedThumbDiameter", "SwitchWidth", "SwitchHeight", "ThumbPadding", "Lw/d0;", "", "SnapSpec", "Lw/d0;", "Lw/r0;", "AnimationSpec", "Lw/r0;", "getValue", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ShapeKeyTokens;LY/m;I)Ls0/E1;", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ColorSchemeKeyTokens;LY/m;I)J", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwitchKt {
    private static final r0 AnimationSpec;
    private static final C6895d0 SnapSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float UncheckedThumbDiameter;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.SwitchKt$Switch$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ SwitchColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ m $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onCheckedChange;
        final /* synthetic */ Function2 $thumbContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, Function1 function1, e eVar, Function2 function2, boolean z11, SwitchColors switchColors, m mVar, int i10, int i11) {
            super(2);
            this.$checked = z10;
            this.$onCheckedChange = function1;
            this.$modifier = eVar;
            this.$thumbContent = function2;
            this.$enabled = z11;
            this.$colors = switchColors;
            this.$interactionSource = mVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SwitchKt.Switch(this.$checked, this.$onCheckedChange, this.$modifier, this.$thumbContent, this.$enabled, this.$colors, this.$interactionSource, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.SwitchKt$SwitchImpl$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ SwitchColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ k $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2 $thumbContent;
        final /* synthetic */ E1 $thumbShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(e eVar, boolean z10, boolean z11, SwitchColors switchColors, Function2 function2, k kVar, E1 e12, int i10) {
            super(2);
            this.$modifier = eVar;
            this.$checked = z10;
            this.$enabled = z11;
            this.$colors = switchColors;
            this.$thumbContent = function2;
            this.$interactionSource = kVar;
            this.$thumbShape = e12;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SwitchKt.SwitchImpl(this.$modifier, this.$checked, this.$enabled, this.$colors, this.$thumbContent, this.$interactionSource, this.$thumbShape, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr2[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.OnSurface.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.Primary.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.Surface.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float fM627getSelectedHandleWidthD9Ej5fM = switchTokens.m627getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = fM627getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m632getUnselectedHandleWidthD9Ej5fM();
        SwitchWidth = switchTokens.m631getTrackWidthD9Ej5fM();
        float fM629getTrackHeightD9Ej5fM = switchTokens.m629getTrackHeightD9Ej5fM();
        SwitchHeight = fM629getTrackHeightD9Ej5fM;
        ThumbPadding = C5015h.n(C5015h.n(fM629getTrackHeightD9Ej5fM - fM627getSelectedHandleWidthD9Ej5fM) / 2);
        SnapSpec = new C6895d0(0, 1, null);
        AnimationSpec = new r0(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(boolean r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.e r39, kotlin.jvm.functions.Function2 r40, boolean r41, com.revenuecat.purchases.ui.revenuecatui.composables.SwitchColors r42, B.m r43, Y.InterfaceC2425m r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.e, kotlin.jvm.functions.Function2, boolean, com.revenuecat.purchases.ui.revenuecatui.composables.SwitchColors, B.m, Y.m, int, int):void");
    }

    public static final void SwitchImpl(e eVar, boolean z10, boolean z11, SwitchColors switchColors, Function2 function2, k kVar, E1 e12, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(871043204);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.U(switchColors) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC2425mG.U(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.U(e12) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(871043204, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SwitchImpl (Switch.kt:256)");
            }
            ColorStyle colorStyleTrackColor$revenuecatui_defaultsBc8Release = switchColors.trackColor$revenuecatui_defaultsBc8Release(z11, z10);
            ColorStyle colorStyleThumbColor$revenuecatui_defaultsBc8Release = switchColors.thumbColor$revenuecatui_defaultsBc8Release(z11, z10);
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            E1 value = getValue(switchTokens.getTrackShape(), interfaceC2425mG, 6);
            e eVarBackground = BackgroundKt.background(BorderKt.m434borderziNgDLE(eVar, switchTokens.m630getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$revenuecatui_defaultsBc8Release(z11, z10), value), colorStyleTrackColor$revenuecatui_defaultsBc8Release, value);
            e.a aVar = l0.e.f52304a;
            B bH = f.h(aVar.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarBackground);
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
            androidx.compose.ui.e eVarBackground2 = BackgroundKt.background(j.b(h.f26161a.b(androidx.compose.ui.e.f26613a, aVar.h()).then(new ThumbElement(kVar, z10)), kVar, a.c(false, C5015h.n(switchTokens.m628getStateLayerSizeD9Ej5fM() / 2), 0L, 4, null)), colorStyleThumbColor$revenuecatui_defaultsBc8Release, e12);
            B bH2 = f.h(aVar.e(), false);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarBackground2);
            InterfaceC5082a interfaceC5082aA2 = aVar2.a();
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
            m2.e(interfaceC2425mB2, bH2, aVar2.e());
            m2.e(interfaceC2425mB2, iR2, aVar2.g());
            Function2 function2B2 = aVar2.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar2.f());
            interfaceC2425mG.V(-1860834223);
            if (function2 != null) {
                H.c(AbstractC2181s.a().d(C6385r0.m(switchColors.m624iconColorWaAFU9c$revenuecatui_defaultsBc8Release(z11, z10))), function2, interfaceC2425mG, C2397c1.f22274i | ((i11 >> 9) & 112));
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(eVar, z10, z11, switchColors, function2, kVar, e12, i10));
        }
    }

    private static final E1 fromToken(U u10, ShapeKeyTokens shapeKeyTokens) {
        if (WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()] == 1) {
            return i.g();
        }
        throw new r();
    }

    private static final E1 getValue(ShapeKeyTokens shapeKeyTokens, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2130513227, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.<get-value> (Switch.kt:464)");
        }
        E1 e1FromToken = fromToken(D.f17597a.b(interfaceC2425m, D.f17598b), shapeKeyTokens);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return e1FromToken;
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-323273324, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.<get-value> (Switch.kt:468)");
        }
        long jFromToken = fromToken(D.f17597a.a(interfaceC2425m, D.f17598b), colorSchemeKeyTokens);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return jFromToken;
    }

    private static final long fromToken(C2175l c2175l, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$1[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return c2175l.s();
            case 2:
                return c2175l.t();
            case 3:
                return c2175l.w();
            case 4:
                return c2175l.A();
            case 5:
                return c2175l.C();
            case 6:
                return c2175l.H();
            case 7:
                return c2175l.L();
            default:
                throw new r();
        }
    }
}
