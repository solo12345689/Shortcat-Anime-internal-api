package androidx.compose.foundation.layout;

import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/q;", "Li1/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/q;", "node", "h", "(Landroidx/compose/foundation/layout/q;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "getTop-D9Ej5fM", "setTop-0680j_4", "d", "getEnd-D9Ej5fM", "setEnd-0680j_4", "e", "getBottom-D9Ej5fM", "setBottom-0680j_4", "f", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "g", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingElement extends Y {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 inspectorInfo;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, function1);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public q create() {
        return new q(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    public boolean equals(Object other) {
        PaddingElement paddingElement = other instanceof PaddingElement ? (PaddingElement) other : null;
        return paddingElement != null && C5015h.q(this.start, paddingElement.start) && C5015h.q(this.top, paddingElement.top) && C5015h.q(this.end, paddingElement.end) && C5015h.q(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(q node) {
        node.K1(this.start);
        node.L1(this.top);
        node.I1(this.end);
        node.H1(this.bottom);
        node.J1(this.rtlAware);
    }

    public int hashCode() {
        return (((((((C5015h.r(this.start) * 31) + C5015h.r(this.top)) * 31) + C5015h.r(this.end)) * 31) + C5015h.r(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }

    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1) {
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        this.inspectorInfo = function1;
        if (f10 >= 0.0f || C5015h.q(f10, C5015h.f48547b.c())) {
            float f14 = this.top;
            if (f14 >= 0.0f || C5015h.q(f14, C5015h.f48547b.c())) {
                float f15 = this.end;
                if (f15 >= 0.0f || C5015h.q(f15, C5015h.f48547b.c())) {
                    float f16 = this.bottom;
                    if (f16 >= 0.0f || C5015h.q(f16, C5015h.f48547b.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
