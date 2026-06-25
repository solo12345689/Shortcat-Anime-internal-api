package com.revenuecat.purchases.ui.revenuecatui.composables;

import i1.EnumC5027t;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6231m;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.AbstractC6371l1;
import s0.C6385r0;
import s0.E1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import s0.Q;
import s0.t1;
import u0.InterfaceC6708c;
import w.AbstractC6890b;
import w.AbstractC6906j;
import w.C6888a;
import w.C6903h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u0004HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001dH\u0080@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u001dH\u0080@¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0000¢\u0006\u0004\b$\u0010%Ji\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u001e\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "", "", "visible", "Ls0/r0;", "color", "Ls0/E1;", "shape", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;", "highlight", "Lkotlin/Function0;", "Lw/G;", "", "placeholderFadeTransitionSpec", "contentFadeTransitionSpec", "<init>", "(ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2-0d7_KjU", "()J", "component2", "component3", "()Ls0/E1;", "component4", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;", "component5", "()Lie/a;", "component6", "LTd/L;", "startAnimation$revenuecatui_defaultsBc8Release", "(LZd/e;)Ljava/lang/Object;", "startAnimation", "stopAnimation$revenuecatui_defaultsBc8Release", "stopAnimation", "Lu0/c;", "draw$revenuecatui_defaultsBc8Release", "(Lu0/c;)V", "draw", "copy-3IgeMak", "(ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;)Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "J", "Ls0/E1;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;", "Lie/a;", "Lr0/l;", "lastSize", "Lr0/l;", "Li1/t;", "lastLayoutDirection", "Li1/t;", "Ls0/i1;", "lastOutline", "Ls0/i1;", "Lw/a;", "Lw/m;", "placeholderAlpha", "Lw/a;", "contentAlpha", "highlightProgress", "Ls0/k1;", "paint", "Ls0/k1;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Placeholder {
    public static final int $stable = 0;
    private final long color;
    private final C6888a contentAlpha;
    private final InterfaceC5082a contentFadeTransitionSpec;
    private final PlaceholderHighlight highlight;
    private final C6888a highlightProgress;
    private EnumC5027t lastLayoutDirection;
    private AbstractC6362i1 lastOutline;
    private C6230l lastSize;
    private final InterfaceC6368k1 paint;
    private final C6888a placeholderAlpha;
    private final InterfaceC5082a placeholderFadeTransitionSpec;
    private final E1 shape;
    private final boolean visible;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw/h0;", "", "invoke", "()Lw/h0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final C6903h0 invoke() {
            return AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw/h0;", "", "invoke", "()Lw/h0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final C6903h0 invoke() {
            return AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
        }
    }

    public /* synthetic */ Placeholder(boolean z10, long j10, E1 e12, PlaceholderHighlight placeholderHighlight, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, e12, placeholderHighlight, interfaceC5082a, interfaceC5082a2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    private final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final E1 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final PlaceholderHighlight getHighlight() {
        return this.highlight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final InterfaceC5082a getPlaceholderFadeTransitionSpec() {
        return this.placeholderFadeTransitionSpec;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final InterfaceC5082a getContentFadeTransitionSpec() {
        return this.contentFadeTransitionSpec;
    }

    /* JADX INFO: renamed from: copy-3IgeMak$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m609copy3IgeMak$default(Placeholder placeholder, boolean z10, long j10, E1 e12, PlaceholderHighlight placeholderHighlight, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = placeholder.visible;
        }
        if ((i10 & 2) != 0) {
            j10 = placeholder.color;
        }
        if ((i10 & 4) != 0) {
            e12 = placeholder.shape;
        }
        if ((i10 & 8) != 0) {
            placeholderHighlight = placeholder.highlight;
        }
        if ((i10 & 16) != 0) {
            interfaceC5082a = placeholder.placeholderFadeTransitionSpec;
        }
        if ((i10 & 32) != 0) {
            interfaceC5082a2 = placeholder.contentFadeTransitionSpec;
        }
        return placeholder.m610copy3IgeMak(z10, j10, e12, placeholderHighlight, interfaceC5082a, interfaceC5082a2);
    }

    /* JADX INFO: renamed from: copy-3IgeMak, reason: not valid java name */
    public final Placeholder m610copy3IgeMak(boolean visible, long color, E1 shape, PlaceholderHighlight highlight, InterfaceC5082a placeholderFadeTransitionSpec, InterfaceC5082a contentFadeTransitionSpec) {
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        AbstractC5504s.h(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        return new Placeholder(visible, color, shape, highlight, placeholderFadeTransitionSpec, contentFadeTransitionSpec, null);
    }

    public final void draw$revenuecatui_defaultsBc8Release(InterfaceC6708c interfaceC6708c) {
        InterfaceC6708c interfaceC6708c2;
        AbstractC5504s.h(interfaceC6708c, "<this>");
        float fFloatValue = ((Number) this.placeholderAlpha.m()).floatValue();
        float fFloatValue2 = ((Number) this.contentAlpha.m()).floatValue();
        if (fFloatValue2 > 0.01f) {
            this.paint.e(fFloatValue2);
            InterfaceC6368k1 interfaceC6368k1 = this.paint;
            InterfaceC6364j0 interfaceC6364j0B = interfaceC6708c.n1().b();
            interfaceC6364j0B.s(AbstractC6231m.c(interfaceC6708c.f()), interfaceC6368k1);
            interfaceC6708c.B1();
            interfaceC6364j0B.k();
        }
        if (fFloatValue > 0.01f) {
            this.paint.e(fFloatValue);
            InterfaceC6368k1 interfaceC6368k12 = this.paint;
            InterfaceC6364j0 interfaceC6364j0B2 = interfaceC6708c.n1().b();
            interfaceC6364j0B2.s(AbstractC6231m.c(interfaceC6708c.f()), interfaceC6368k12);
            interfaceC6708c2 = interfaceC6708c;
            this.lastOutline = PlaceholderKt.m612drawPlaceholderhpmOzss(interfaceC6708c2, this.shape, this.color, this.highlight, ((Number) this.highlightProgress.m()).floatValue(), this.lastOutline, this.lastLayoutDirection, this.lastSize);
            interfaceC6364j0B2.k();
        } else {
            interfaceC6708c2 = interfaceC6708c;
        }
        this.lastSize = C6230l.c(interfaceC6708c2.f());
        this.lastLayoutDirection = interfaceC6708c2.getLayoutDirection();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return this.visible == placeholder.visible && C6385r0.s(this.color, placeholder.color) && AbstractC5504s.c(this.shape, placeholder.shape) && AbstractC5504s.c(this.highlight, placeholder.highlight) && AbstractC5504s.c(this.placeholderFadeTransitionSpec, placeholder.placeholderFadeTransitionSpec) && AbstractC5504s.c(this.contentFadeTransitionSpec, placeholder.contentFadeTransitionSpec);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.visible) * 31) + C6385r0.y(this.color)) * 31) + this.shape.hashCode()) * 31;
        PlaceholderHighlight placeholderHighlight = this.highlight;
        return ((((iHashCode + (placeholderHighlight == null ? 0 : placeholderHighlight.hashCode())) * 31) + this.placeholderFadeTransitionSpec.hashCode()) * 31) + this.contentFadeTransitionSpec.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
    
        if (w.C6888a.f(r3, r1, r5, null, null, r8, 12, null) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
    
        if (r1.s(r3, r8) == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object startAnimation$revenuecatui_defaultsBc8Release(Zd.e r20) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder.startAnimation$revenuecatui_defaultsBc8Release(Zd.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7.t(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object stopAnimation$revenuecatui_defaultsBc8Release(Zd.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder$stopAnimation$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            Td.v.b(r7)
            goto L73
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder r2 = (com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder) r2
            Td.v.b(r7)
            goto L65
        L3f:
            java.lang.Object r2 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder r2 = (com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder) r2
            Td.v.b(r7)
            goto L58
        L47:
            Td.v.b(r7)
            w.a r7 = r6.placeholderAlpha
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L57
            goto L72
        L57:
            r2 = r6
        L58:
            w.a r7 = r2.contentAlpha
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L65
            goto L72
        L65:
            w.a r7 = r2.highlightProgress
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            Td.L r7 = Td.L.f17438a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder.stopAnimation$revenuecatui_defaultsBc8Release(Zd.e):java.lang.Object");
    }

    public String toString() {
        return "Placeholder(visible=" + this.visible + ", color=" + ((Object) C6385r0.z(this.color)) + ", shape=" + this.shape + ", highlight=" + this.highlight + ", placeholderFadeTransitionSpec=" + this.placeholderFadeTransitionSpec + ", contentFadeTransitionSpec=" + this.contentFadeTransitionSpec + ')';
    }

    private Placeholder(boolean z10, long j10, E1 shape, PlaceholderHighlight placeholderHighlight, InterfaceC5082a placeholderFadeTransitionSpec, InterfaceC5082a contentFadeTransitionSpec) {
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        AbstractC5504s.h(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        this.visible = z10;
        this.color = j10;
        this.shape = shape;
        this.highlight = placeholderHighlight;
        this.placeholderFadeTransitionSpec = placeholderFadeTransitionSpec;
        this.contentFadeTransitionSpec = contentFadeTransitionSpec;
        this.placeholderAlpha = AbstractC6890b.b(z10 ? 1.0f : 0.0f, 0.0f, 2, null);
        this.contentAlpha = AbstractC6890b.b(z10 ? 0.0f : 1.0f, 0.0f, 2, null);
        this.highlightProgress = AbstractC6890b.b(0.0f, 0.0f, 2, null);
        InterfaceC6368k1 interfaceC6368k1A = Q.a();
        interfaceC6368k1A.k(true);
        interfaceC6368k1A.z(AbstractC6371l1.f58959a.a());
        interfaceC6368k1A.c(interfaceC6368k1A.j());
        this.paint = interfaceC6368k1A;
    }

    public /* synthetic */ Placeholder(boolean z10, long j10, E1 e12, PlaceholderHighlight placeholderHighlight, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, (i10 & 4) != 0 ? t1.a() : e12, (i10 & 8) != 0 ? null : placeholderHighlight, (i10 & 16) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a, (i10 & 32) != 0 ? AnonymousClass2.INSTANCE : interfaceC5082a2, null);
    }
}
