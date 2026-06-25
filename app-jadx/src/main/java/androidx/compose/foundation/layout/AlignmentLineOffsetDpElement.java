package androidx.compose.foundation.layout;

import I0.AbstractC1675a;
import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/b;", "LI0/a;", "alignmentLine", "Li1/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(LI0/a;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/b;", "node", "h", "(Landroidx/compose/foundation/layout/b;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LI0/a;", "getAlignmentLine", "()LI0/a;", "F", "getBefore-D9Ej5fM", "()F", "d", "getAfter-D9Ej5fM", "e", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1675a alignmentLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1 inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AbstractC1675a abstractC1675a, float f10, float f11, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC1675a, f10, f11, function1);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.alignmentLine, this.before, this.after, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        return alignmentLineOffsetDpElement != null && AbstractC5504s.c(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && C5015h.q(this.before, alignmentLineOffsetDpElement.before) && C5015h.q(this.after, alignmentLineOffsetDpElement.after);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b node) {
        node.F1(this.alignmentLine);
        node.G1(this.before);
        node.E1(this.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + C5015h.r(this.before)) * 31) + C5015h.r(this.after);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }

    private AlignmentLineOffsetDpElement(AbstractC1675a abstractC1675a, float f10, float f11, Function1 function1) {
        this.alignmentLine = abstractC1675a;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = function1;
        if ((f10 < 0.0f && !C5015h.q(f10, C5015h.f48547b.c())) || (f11 < 0.0f && !C5015h.q(f11, C5015h.f48547b.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
