package com.revenuecat.purchases.ui.revenuecatui.composables;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Th.a;
import Th.c;
import U0.AbstractC2207j;
import U0.C2197e;
import U0.F;
import U0.I0;
import U0.U0;
import U0.Y0;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import Y0.AbstractC2485u;
import Y0.H;
import Y0.L;
import Yh.A;
import Yh.C2492b;
import Yh.d;
import Yh.f;
import Yh.g;
import Yh.h;
import Yh.j;
import Yh.o;
import Yh.u;
import Yh.v;
import Yh.w;
import Yh.z;
import Zh.e;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g0.i;
import g1.C4821a;
import g1.C4830j;
import g1.C4831k;
import g1.q;
import i1.C5029v;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C1;
import u0.AbstractC6712g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008e\u0001\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ah\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ar\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ah\u0010(\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a`\u0010-\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a`\u00102\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a~\u0010:\u001a\u00020\u00162\u0006\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001605H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a>\u0010@\u001a\u00020\u00162\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010=\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a!\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\bC\u0010D\u001ah\u0010H\u001a\u00020\u00162\u0006\u0010E\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a8\u0010L\u001a\u00020\u0016*\u00020I2\u0006\u0010E\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010=\u001a\u0004\u0018\u00010\nH\u0002ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a1\u0010N\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020M2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\bN\u0010O\u001a\u001f\u0010Q\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010R\"\u001c\u0010U\u001a\n T*\u0004\u0018\u00010S0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "Ls0/r0;", "color", "LU0/Y0;", "style", "Li1/v;", "fontSize", "LY0/L;", "fontWeight", "LY0/u;", "fontFamily", "Ll0/e$b;", "horizontalAlignment", "Lg1/j;", "textAlign", "", "allowLinks", "textFillMaxWidth", "applyFontSizeToParagraph", "LTd/L;", "Markdown-DkhmgE0", "(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;JLY0/L;LY0/u;Ll0/e$b;Lg1/j;ZZZLY/m;III)V", "Markdown", "LYh/f;", "document", "MDDocument-d8Fo1UA", "(LYh/f;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZLY/m;I)V", "MDDocument", "LYh/j;", "heading", "MDHeading-JFVkrdg", "(LYh/j;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZLandroidx/compose/ui/e;LY/m;III)V", "MDHeading", "LYh/v;", "paragraph", "MDParagraph-d8Fo1UA", "(LYh/v;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZLY/m;I)V", "MDParagraph", "LYh/c;", "bulletList", "MDBulletList-lzeOXFE", "(LYh/c;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZLY/m;I)V", "MDBulletList", "LYh/u;", "orderedList", "MDOrderedList-lzeOXFE", "(LYh/u;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZLY/m;I)V", "MDOrderedList", "LYh/q;", "listBlock", "Lkotlin/Function1;", "LYh/s;", "item", "MDListItems-JFVkrdg", "(LYh/q;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZLandroidx/compose/ui/e;Lie/o;LY/m;III)V", "MDListItems", "LYh/b;", "blockQuote", "baseFontWeight", "MDBlockQuote-8V94_ZQ", "(LYh/b;JZLY0/L;Landroidx/compose/ui/e;LY/m;II)V", "MDBlockQuote", "LYh/h;", "fencedCodeBlock", "MDFencedCodeBlock", "(LYh/h;Landroidx/compose/ui/e;LY/m;II)V", "parent", "MDBlockChildren-d8Fo1UA", "(LYh/s;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZLY/m;I)V", "MDBlockChildren", "LU0/e$b;", "appendMarkdownChildren-XO-JAsU", "(LU0/e$b;LYh/s;JZLY0/L;)V", "appendMarkdownChildren", "LU0/e;", "MarkdownText", "(LU0/e;LU0/Y0;ZLandroidx/compose/ui/e;LY/m;II)V", "overrides", "resolveMarkdownTextStyle", "(LU0/Y0;LU0/Y0;)LU0/Y0;", "LZh/e;", "kotlin.jvm.PlatformType", "parser", "LZh/e;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MarkdownKt {
    private static final e parser = e.a().i(AbstractC2279u.e(c.c())).g();

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MDFencedCodeBlock$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ h $fencedCodeBlock;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(h hVar, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$fencedCodeBlock = hVar;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            MarkdownKt.MDFencedCodeBlock(this.$fencedCodeBlock, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MarkdownText$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e conditional) {
            AbstractC5504s.h(conditional, "$this$conditional");
            return s.h(conditional, 0.0f, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt$MarkdownText$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43062 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Y0 $style;
        final /* synthetic */ C2197e $text;
        final /* synthetic */ boolean $textFillMaxWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43062(C2197e c2197e, Y0 y02, boolean z10, androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.$text = c2197e;
            this.$style = y02;
            this.$textFillMaxWidth = z10;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            MarkdownKt.MarkdownText(this.$text, this.$style, this.$textFillMaxWidth, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: MDBlockChildren-d8Fo1UA */
    public static final void m586MDBlockChildrend8Fo1UA(Yh.s sVar, long j10, Y0 y02, long j11, Y0.L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, boolean z12, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        boolean z13;
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2035102511);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(sVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        Y0 y03 = y02;
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(y03) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        Y0.L l11 = l10;
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(l11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC2425mG.U(abstractC2485u) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.U(c4830j) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            z13 = z10;
            i11 |= interfaceC2425mG.a(z13) ? 8388608 : 4194304;
        } else {
            z13 = z10;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? 67108864 : 33554432;
        }
        boolean z14 = z12;
        if ((i10 & 805306368) == 0) {
            i11 |= interfaceC2425mG.a(z14) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2035102511, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBlockChildren (Markdown.kt:457)");
            }
            Yh.s sVarC = sVar.c();
            while (sVarC != null) {
                if (sVarC instanceof C2492b) {
                    interfaceC2425mG.V(-1935094073);
                    int i13 = i11;
                    i12 = i13;
                    m587MDBlockQuote8V94_ZQ((C2492b) sVarC, j10, z13, l11, null, interfaceC2425mG, ((i13 >> 15) & 896) | (i13 & 112) | ((i13 >> 3) & 7168), 16);
                    interfaceC2425mG.O();
                } else {
                    i12 = i11;
                    if (sVarC instanceof j) {
                        interfaceC2425mG.V(-1935090826);
                        m590MDHeadingJFVkrdg((j) sVarC, j10, y03, j11, l10, abstractC2485u, c4830j, z10, z11, z14, null, interfaceC2425mG, i12 & 2147483632, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                        interfaceC2425mG.O();
                    } else if (sVarC instanceof v) {
                        interfaceC2425mG.V(-1935080104);
                        m593MDParagraphd8Fo1UA((v) sVarC, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, z12, interfaceC2425mG, i12 & 2147483632);
                        interfaceC2425mG.O();
                    } else {
                        if (sVarC instanceof h) {
                            interfaceC2425mG.V(-1935069412);
                            MDFencedCodeBlock((h) sVarC, null, interfaceC2425mG, 0, 2);
                            interfaceC2425mG.O();
                        } else if (sVarC instanceof Yh.c) {
                            interfaceC2425mG.V(-1935067441);
                            m588MDBulletListlzeOXFE((Yh.c) sVarC, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, interfaceC2425mG, i12 & 268435440);
                            interfaceC2425mG.O();
                        } else if (sVarC instanceof u) {
                            interfaceC2425mG.V(-1935057904);
                            m592MDOrderedListlzeOXFE((u) sVarC, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, interfaceC2425mG, i12 & 268435440);
                            interfaceC2425mG.O();
                        } else {
                            interfaceC2425mG.V(143014590);
                            interfaceC2425mG.O();
                        }
                        sVarC = sVarC.e();
                        y03 = y02;
                        l11 = l10;
                        z13 = z10;
                        z14 = z12;
                        i11 = i12;
                    }
                }
                sVarC = sVarC.e();
                y03 = y02;
                l11 = l10;
                z13 = z10;
                z14 = z12;
                i11 = i12;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new MarkdownKt$MDBlockChildren$1(sVar, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, z12, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: MDBlockQuote-8V94_ZQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m587MDBlockQuote8V94_ZQ(Yh.C2492b r38, long r39, boolean r41, Y0.L r42, androidx.compose.ui.e r43, Y.InterfaceC2425m r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.m587MDBlockQuote8V94_ZQ(Yh.b, long, boolean, Y0.L, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: renamed from: MDBulletList-lzeOXFE */
    public static final void m588MDBulletListlzeOXFE(Yh.c cVar, long j10, Y0 y02, long j11, Y0.L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, InterfaceC2425m interfaceC2425m, int i10) {
        Yh.c cVar2;
        int i11;
        long j12;
        Y0.L l11;
        AbstractC2485u abstractC2485u2;
        boolean z12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1037984523);
        if ((i10 & 6) == 0) {
            cVar2 = cVar;
            i11 = (interfaceC2425mG.F(cVar2) ? 4 : 2) | i10;
        } else {
            cVar2 = cVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            j12 = j10;
            i11 |= interfaceC2425mG.d(j12) ? 32 : 16;
        } else {
            j12 = j10;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(y02) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            l11 = l10;
            i11 |= interfaceC2425mG.U(l11) ? 16384 : 8192;
        } else {
            l11 = l10;
        }
        if ((196608 & i10) == 0) {
            abstractC2485u2 = abstractC2485u;
            i11 |= interfaceC2425mG.U(abstractC2485u2) ? 131072 : 65536;
        } else {
            abstractC2485u2 = abstractC2485u;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.U(c4830j) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            z12 = z10;
            i11 |= interfaceC2425mG.a(z12) ? 8388608 : 4194304;
        } else {
            z12 = z10;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1037984523, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBulletList (Markdown.kt:257)");
            }
            m591MDListItemsJFVkrdg(cVar2, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, null, i.d(1682895250, true, new MarkdownKt$MDBulletList$1(resolveMarkdownTextStyle(y02, new Y0(j12, j11, l11, null, null, abstractC2485u2, null, 0L, null, null, null, 0L, null, null, null, c4830j != null ? c4830j.n() : C4830j.f47278b.g(), 0, 0L, null, null, null, 0, 0, null, 16744408, null)), z11, cVar2.p(), j10, z12, l10), interfaceC2425mG, 54), interfaceC2425mG, i11 & 268435454, 6, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new MarkdownKt$MDBulletList$2(cVar, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, i10));
        }
    }

    /* JADX INFO: renamed from: MDDocument-d8Fo1UA */
    public static final void m589MDDocumentd8Fo1UA(f fVar, long j10, Y0 y02, long j11, Y0.L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, boolean z12, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        Y0 y03;
        long j12;
        Y0.L l11;
        AbstractC2485u abstractC2485u2;
        C4830j c4830j2;
        boolean z13;
        boolean z14;
        boolean z15;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-196481521);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            y03 = y02;
            i11 |= interfaceC2425mG.U(y03) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        } else {
            y03 = y02;
        }
        if ((i10 & 3072) == 0) {
            j12 = j11;
            i11 |= interfaceC2425mG.d(j12) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            j12 = j11;
        }
        if ((i10 & 24576) == 0) {
            l11 = l10;
            i11 |= interfaceC2425mG.U(l11) ? 16384 : 8192;
        } else {
            l11 = l10;
        }
        if ((196608 & i10) == 0) {
            abstractC2485u2 = abstractC2485u;
            i11 |= interfaceC2425mG.U(abstractC2485u2) ? 131072 : 65536;
        } else {
            abstractC2485u2 = abstractC2485u;
        }
        if ((1572864 & i10) == 0) {
            c4830j2 = c4830j;
            i11 |= interfaceC2425mG.U(c4830j2) ? 1048576 : 524288;
        } else {
            c4830j2 = c4830j;
        }
        if ((12582912 & i10) == 0) {
            z13 = z10;
            i11 |= interfaceC2425mG.a(z13) ? 8388608 : 4194304;
        } else {
            z13 = z10;
        }
        if ((100663296 & i10) == 0) {
            z14 = z11;
            i11 |= interfaceC2425mG.a(z14) ? 67108864 : 33554432;
        } else {
            z14 = z11;
        }
        if ((805306368 & i10) == 0) {
            z15 = z12;
            i11 |= interfaceC2425mG.a(z15) ? 536870912 : 268435456;
        } else {
            z15 = z12;
        }
        if ((i11 & 306783379) == 306783378 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-196481521, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDDocument (Markdown.kt:129)");
            }
            m586MDBlockChildrend8Fo1UA(fVar, j10, y03, j12, l11, abstractC2485u2, c4830j2, z13, z14, z15, interfaceC2425mG, i11 & 2147483646);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new MarkdownKt$MDDocument$1(fVar, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, z12, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MDFencedCodeBlock(Yh.h r58, androidx.compose.ui.e r59, Y.InterfaceC2425m r60, int r61, int r62) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MDFencedCodeBlock(Yh.h, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: MDHeading-JFVkrdg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m590MDHeadingJFVkrdg(Yh.j r42, long r43, U0.Y0 r45, long r46, Y0.L r48, Y0.AbstractC2485u r49, g1.C4830j r50, boolean r51, boolean r52, boolean r53, androidx.compose.ui.e r54, Y.InterfaceC2425m r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.m590MDHeadingJFVkrdg(Yh.j, long, U0.Y0, long, Y0.L, Y0.u, g1.j, boolean, boolean, boolean, androidx.compose.ui.e, Y.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: MDListItems-JFVkrdg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m591MDListItemsJFVkrdg(Yh.q r30, long r31, U0.Y0 r33, long r34, Y0.L r36, Y0.AbstractC2485u r37, g1.C4830j r38, boolean r39, boolean r40, androidx.compose.ui.e r41, ie.InterfaceC5096o r42, Y.InterfaceC2425m r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.m591MDListItemsJFVkrdg(Yh.q, long, U0.Y0, long, Y0.L, Y0.u, g1.j, boolean, boolean, androidx.compose.ui.e, ie.o, Y.m, int, int, int):void");
    }

    /* JADX INFO: renamed from: MDOrderedList-lzeOXFE */
    public static final void m592MDOrderedListlzeOXFE(u uVar, long j10, Y0 y02, long j11, Y0.L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, InterfaceC2425m interfaceC2425m, int i10) {
        u uVar2;
        int i11;
        long j12;
        Y0.L l11;
        AbstractC2485u abstractC2485u2;
        boolean z12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1401481105);
        if ((i10 & 6) == 0) {
            uVar2 = uVar;
            i11 = (interfaceC2425mG.F(uVar2) ? 4 : 2) | i10;
        } else {
            uVar2 = uVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            j12 = j10;
            i11 |= interfaceC2425mG.d(j12) ? 32 : 16;
        } else {
            j12 = j10;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(y02) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            l11 = l10;
            i11 |= interfaceC2425mG.U(l11) ? 16384 : 8192;
        } else {
            l11 = l10;
        }
        if ((196608 & i10) == 0) {
            abstractC2485u2 = abstractC2485u;
            i11 |= interfaceC2425mG.U(abstractC2485u2) ? 131072 : 65536;
        } else {
            abstractC2485u2 = abstractC2485u;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.U(c4830j) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            z12 = z10;
            i11 |= interfaceC2425mG.a(z12) ? 8388608 : 4194304;
        } else {
            z12 = z10;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1401481105, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList (Markdown.kt:306)");
            }
            kotlin.jvm.internal.L l12 = new kotlin.jvm.internal.L();
            l12.f52257a = uVar2.q();
            m591MDListItemsJFVkrdg(uVar2, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, null, i.d(-1609568168, true, new MarkdownKt$MDOrderedList$1(resolveMarkdownTextStyle(y02, new Y0(j12, j11, l11, null, null, abstractC2485u2, null, 0L, null, null, null, 0L, null, null, null, c4830j != null ? c4830j.n() : C4830j.f47278b.g(), 0, 0L, null, null, null, 0, 0, null, 16744408, null)), z11, l12, uVar2.p(), j10, z12, l10), interfaceC2425mG, 54), interfaceC2425mG, i11 & 268435454, 6, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new MarkdownKt$MDOrderedList$2(uVar, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, i10));
        }
    }

    /* JADX INFO: renamed from: MDParagraph-d8Fo1UA */
    public static final void m593MDParagraphd8Fo1UA(v vVar, long j10, Y0 y02, long j11, Y0.L l10, AbstractC2485u abstractC2485u, C4830j c4830j, boolean z10, boolean z11, boolean z12, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC2485u abstractC2485u2;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-581921093);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(vVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(y02) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.U(l10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            abstractC2485u2 = abstractC2485u;
            i11 |= interfaceC2425mG.U(abstractC2485u2) ? 131072 : 65536;
        } else {
            abstractC2485u2 = abstractC2485u;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC2425mG.U(c4830j) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC2425mG.a(z11) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= interfaceC2425mG.a(z12) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-581921093, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDParagraph (Markdown.kt:220)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, aVar);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            int i12 = i11;
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
            Y0 y0ResolveMarkdownTextStyle = resolveMarkdownTextStyle(y02, new Y0(j10, z12 ? j11 : C5029v.f48578b.a(), l10, null, null, abstractC2485u2, null, 0L, null, null, null, 0L, null, null, null, c4830j != null ? c4830j.n() : C4830j.f47278b.g(), 0, 0L, null, null, null, 0, 0, null, 16744408, null));
            C2197e.b bVar = new C2197e.b(0, 1, null);
            bVar.k(y0ResolveMarkdownTextStyle.O());
            AbstractC5504s.f(vVar, "null cannot be cast to non-null type org.commonmark.node.Node");
            m604appendMarkdownChildrenXOJAsU(bVar, vVar, j10, z10, l10);
            bVar.h();
            interfaceC2425m2 = interfaceC2425mG;
            MarkdownText(bVar.l(), y0ResolveMarkdownTextStyle, z11, null, interfaceC2425m2, (i12 >> 18) & 896, 8);
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new MarkdownKt$MDParagraph$2(vVar, j10, y02, j11, l10, abstractC2485u, c4830j, z10, z11, z12, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Markdown-DkhmgE0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m594MarkdownDkhmgE0(java.lang.String r31, androidx.compose.ui.e r32, long r33, U0.Y0 r35, long r36, Y0.L r38, Y0.AbstractC2485u r39, l0.e.b r40, g1.C4830j r41, boolean r42, boolean r43, boolean r44, Y.InterfaceC2425m r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.m594MarkdownDkhmgE0(java.lang.String, androidx.compose.ui.e, long, U0.Y0, long, Y0.L, Y0.u, l0.e$b, g1.j, boolean, boolean, boolean, Y.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MarkdownText(U0.C2197e r32, U0.Y0 r33, boolean r34, androidx.compose.ui.e r35, Y.InterfaceC2425m r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MarkdownText(U0.e, U0.Y0, boolean, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: renamed from: appendMarkdownChildren-XO-JAsU */
    public static final void m604appendMarkdownChildrenXOJAsU(C2197e.b bVar, Yh.s sVar, long j10, boolean z10, Y0.L l10) {
        Yh.s sVarC = sVar.c();
        while (sVarC != null) {
            if (sVarC instanceof v) {
                m604appendMarkdownChildrenXOJAsU(bVar, sVarC, j10, z10, l10);
            } else if (sVarC instanceof A) {
                String strN = ((A) sVarC).n();
                AbstractC5504s.g(strN, "child.literal");
                bVar.g(strN);
            } else if (sVarC instanceof g) {
                bVar.k(new I0(0L, 0L, (Y0.L) null, H.c(H.f22594b.a()), (Y0.I) null, (AbstractC2485u) null, (String) null, 0L, (C4821a) null, (q) null, (c1.e) null, 0L, (C4831k) null, (C1) null, (F) null, (AbstractC6712g) null, 65527, (DefaultConstructorMarker) null));
                m604appendMarkdownChildrenXOJAsU(bVar, sVarC, j10, z10, l10);
                bVar.h();
            } else if (sVarC instanceof z) {
                int iV = l10 != null ? l10.v() : 0;
                L.a aVar = Y0.L.f22613b;
                Y0.L lB = iV > aVar.b().v() ? l10 : aVar.b();
                bVar.k(new I0(0L, 0L, lB, (H) null, (Y0.I) null, (AbstractC2485u) null, (String) null, 0L, (C4821a) null, (q) null, (c1.e) null, 0L, (C4831k) null, (C1) null, (F) null, (AbstractC6712g) null, 65531, (DefaultConstructorMarker) null));
                m604appendMarkdownChildrenXOJAsU(bVar, sVarC, j10, z10, lB);
                bVar.h();
            } else {
                Yh.s sVar2 = sVarC;
                if (sVar2 instanceof d) {
                    bVar.k(new Y0(0L, 0L, null, null, null, AbstractC2485u.f22726b.c(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null).O());
                    String strN2 = ((d) sVar2).n();
                    AbstractC5504s.g(strN2, "child.literal");
                    bVar.g(strN2);
                    bVar.h();
                } else {
                    if (sVar2 instanceof Yh.i ? true : sVar2 instanceof w) {
                        AbstractC5504s.g(bVar.append('\n'), "append(...)");
                    } else if (!(sVar2 instanceof o)) {
                        sVarC = sVar2;
                        if (sVarC instanceof a) {
                            bVar.k(new Y0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C4831k.f47287b.b(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773119, null).O());
                            m604appendMarkdownChildrenXOJAsU(bVar, sVarC, j10, z10, l10);
                            bVar.h();
                        }
                    } else if (z10) {
                        I0 i02 = new I0(j10, 0L, (Y0.L) null, (H) null, (Y0.I) null, (AbstractC2485u) null, (String) null, 0L, (C4821a) null, (q) null, (c1.e) null, 0L, C4831k.f47287b.d(), (C1) null, (F) null, (AbstractC6712g) null, 61438, (DefaultConstructorMarker) null);
                        String strN3 = ((o) sVar2).n();
                        AbstractC5504s.g(strN3, "child.destination");
                        int iJ = bVar.j(new AbstractC2207j.b(strN3, new U0(i02, null, null, null, 14, null), null, 4, null));
                        sVarC = sVar2;
                        try {
                            m604appendMarkdownChildrenXOJAsU(bVar, sVarC, j10, true, l10);
                            Td.L l11 = Td.L.f17438a;
                        } finally {
                            bVar.i(iJ);
                        }
                    } else {
                        sVarC = sVar2;
                        m604appendMarkdownChildrenXOJAsU(bVar, sVarC, j10, false, l10);
                    }
                }
                sVarC = sVar2;
            }
            sVarC = sVarC.e();
        }
    }

    private static final Y0 resolveMarkdownTextStyle(Y0 y02, Y0 y03) {
        return y02.K(y03);
    }
}
