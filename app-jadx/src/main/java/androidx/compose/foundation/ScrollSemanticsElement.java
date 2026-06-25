package androidx.compose.foundation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b\t\u0010&R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b\n\u0010&¨\u0006-"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "LK0/Y;", "Landroidx/compose/foundation/n;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Lz/n;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLz/n;ZZ)V", "c", "()Landroidx/compose/foundation/n;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/n;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/o;", "getState", "()Landroidx/compose/foundation/o;", "Z", "getReverseScrolling", "()Z", "d", "Lz/n;", "getFlingBehavior", "()Lz/n;", "e", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class ScrollSemanticsElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reverseScrolling;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final z.n flingBehavior;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isScrollable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVertical;

    public ScrollSemanticsElement(o oVar, boolean z10, z.n nVar, boolean z11, boolean z12) {
        this.state = oVar;
        this.reverseScrolling = z10;
        this.flingBehavior = nVar;
        this.isScrollable = z11;
        this.isVertical = z12;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n create() {
        return new n(this.state, this.reverseScrolling, this.flingBehavior, this.isScrollable, this.isVertical);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) other;
        return AbstractC5504s.c(this.state, scrollSemanticsElement.state) && this.reverseScrolling == scrollSemanticsElement.reverseScrolling && AbstractC5504s.c(this.flingBehavior, scrollSemanticsElement.flingBehavior) && this.isScrollable == scrollSemanticsElement.isScrollable && this.isVertical == scrollSemanticsElement.isVertical;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(n node) {
        node.I1(this.state);
        node.G1(this.reverseScrolling);
        node.F1(this.flingBehavior);
        node.H1(this.isScrollable);
        node.J1(this.isVertical);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        z.n nVar = this.flingBehavior;
        return ((((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + Boolean.hashCode(this.isScrollable)) * 31) + Boolean.hashCode(this.isVertical);
    }

    public String toString() {
        return "ScrollSemanticsElement(state=" + this.state + ", reverseScrolling=" + this.reverseScrolling + ", flingBehavior=" + this.flingBehavior + ", isScrollable=" + this.isScrollable + ", isVertical=" + this.isVertical + ')';
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
    }
}
