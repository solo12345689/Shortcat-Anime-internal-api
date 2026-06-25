package com.revenuecat.purchases.ui.revenuecatui.composables;

import B.j;
import B.k;
import B.o;
import Gf.AbstractC1617k;
import Gf.O;
import I0.A;
import I0.C;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import K0.E;
import K0.H;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.C5009b;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import w.AbstractC6890b;
import w.C6888a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;", "Landroidx/compose/ui/e$c;", "LK0/E;", "LB/k;", "interactionSource", "", "checked", "<init>", "(LB/k;Z)V", "LTd/L;", "onAttach", "()V", "Landroidx/compose/ui/layout/l;", "LI0/A;", "measurable", "Li1/b;", "constraints", "LI0/C;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;", "measure", "update", "LB/k;", "getInteractionSource", "()LB/k;", "setInteractionSource", "(LB/k;)V", "Z", "getChecked", "()Z", "setChecked", "(Z)V", "isPressed", "Lw/a;", "", "Lw/m;", "offsetAnim", "Lw/a;", "sizeAnim", "initialOffset", "F", "initialSize", "getShouldAutoInvalidate", "shouldAutoInvalidate", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ThumbNode extends e.c implements E {
    private boolean checked;
    private float initialOffset;
    private float initialSize;
    private k interactionSource;
    private boolean isPressed;
    private C6888a offsetAnim;
    private C6888a sizeAnim;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode$onAttach$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode$onAttach$1", f = "Switch.kt", l = {333}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        int label;

        AnonymousClass1(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return ThumbNode.this.new AnonymousClass1(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                final kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
                InterfaceC1742e interfaceC1742eB = ThumbNode.this.getInteractionSource().b();
                final ThumbNode thumbNode = ThumbNode.this;
                InterfaceC1743f interfaceC1743f = new InterfaceC1743f() { // from class: com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode.onAttach.1.1
                    @Override // Jf.InterfaceC1743f
                    public final Object emit(j jVar, Zd.e eVar) {
                        if (jVar instanceof o.b) {
                            l10.f52257a++;
                        } else if (jVar instanceof o.c) {
                            kotlin.jvm.internal.L l11 = l10;
                            l11.f52257a--;
                        } else if (jVar instanceof o.a) {
                            kotlin.jvm.internal.L l12 = l10;
                            l12.f52257a--;
                        }
                        boolean z10 = l10.f52257a > 0;
                        if (thumbNode.isPressed != z10) {
                            thumbNode.isPressed = z10;
                            H.b(thumbNode);
                        }
                        return L.f17438a;
                    }
                };
                this.label = 1;
                if (interfaceC1742eB.collect(interfaceC1743f, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public ThumbNode(k interactionSource, boolean z10) {
        AbstractC5504s.h(interactionSource, "interactionSource");
        this.interactionSource = interactionSource;
        this.checked = z10;
        this.initialOffset = Float.NaN;
        this.initialSize = Float.NaN;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final k getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // K0.E
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return super.maxIntrinsicHeight(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return super.maxIntrinsicWidth(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l measure, A measurable, long j10) {
        AbstractC5504s.h(measure, "$this$measure");
        AbstractC5504s.h(measurable, "measurable");
        float fL1 = measure.l1(this.isPressed ? SwitchTokens.INSTANCE.m626getPressedHandleWidthD9Ej5fM() : ((measurable.I(C5009b.l(j10)) != 0 && measurable.q0(C5009b.k(j10)) != 0) || this.checked) ? SwitchKt.ThumbDiameter : SwitchKt.UncheckedThumbDiameter);
        C6888a c6888a = this.sizeAnim;
        int iFloatValue = (int) (c6888a != null ? ((Number) c6888a.m()).floatValue() : fL1);
        s sVarV0 = measurable.v0(C5009b.f48540b.c(iFloatValue, iFloatValue));
        float fL12 = measure.l1(C5015h.n(C5015h.n(SwitchKt.SwitchHeight - measure.e1(fL1)) / 2.0f));
        float fL13 = measure.l1(C5015h.n(C5015h.n(SwitchKt.SwitchWidth - SwitchKt.ThumbDiameter) - SwitchKt.ThumbPadding));
        boolean z10 = this.isPressed;
        if (z10 && this.checked) {
            fL12 = fL13 - measure.l1(SwitchTokens.INSTANCE.m630getTrackOutlineWidthD9Ej5fM());
        } else if (z10 && !this.checked) {
            fL12 = measure.l1(SwitchTokens.INSTANCE.m630getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            fL12 = fL13;
        }
        C6888a c6888a2 = this.sizeAnim;
        if (!AbstractC5504s.b(c6888a2 != null ? (Float) c6888a2.k() : null, fL1)) {
            AbstractC1617k.d(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fL1, null), 3, null);
        }
        C6888a c6888a3 = this.offsetAnim;
        if (!AbstractC5504s.b(c6888a3 != null ? (Float) c6888a3.k() : null, fL12)) {
            AbstractC1617k.d(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, fL12, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fL1;
            this.initialOffset = fL12;
        }
        return androidx.compose.ui.layout.l.u0(measure, iFloatValue, iFloatValue, null, new ThumbNode$measure$3(sVarV0, this, fL12), 4, null);
    }

    @Override // K0.E
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return super.minIntrinsicHeight(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // K0.E
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return super.minIntrinsicWidth(interfaceC1687m, interfaceC1686l, i10);
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        AbstractC1617k.d(getCoroutineScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // K0.InterfaceC1794j, K0.v0
    public /* bridge */ /* synthetic */ void onDensityChange() {
        super.onDensityChange();
    }

    @Override // K0.InterfaceC1794j
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
        super.onLayoutDirectionChange();
    }

    public final void setChecked(boolean z10) {
        this.checked = z10;
    }

    public final void setInteractionSource(k kVar) {
        AbstractC5504s.h(kVar, "<set-?>");
        this.interactionSource = kVar;
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = AbstractC6890b.b(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = AbstractC6890b.b(this.initialOffset, 0.0f, 2, null);
    }
}
