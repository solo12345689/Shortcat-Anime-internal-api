package androidx.compose.foundation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import x.b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\r*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u0006\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0007\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "LK0/Y;", "Lx/b0;", "Landroidx/compose/foundation/o;", "scrollState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZZ)V", "c", "()Lx/b0;", "node", "LTd/L;", "h", "(Lx/b0;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "Landroidx/compose/foundation/o;", "getScrollState", "()Landroidx/compose/foundation/o;", "Z", "()Z", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScrollingLayoutElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o scrollState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isReversed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    public ScrollingLayoutElement(o oVar, boolean z10, boolean z11) {
        this.scrollState = oVar;
        this.isReversed = z10;
        this.isVertical = z11;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b0 create() {
        return new b0(this.scrollState, this.isReversed, this.isVertical);
    }

    public boolean equals(Object other) {
        if (!(other instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) other;
        return AbstractC5504s.c(this.scrollState, scrollingLayoutElement.scrollState) && this.isReversed == scrollingLayoutElement.isReversed && this.isVertical == scrollingLayoutElement.isVertical;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b0 node) {
        node.I1(this.scrollState);
        node.H1(this.isReversed);
        node.J1(this.isVertical);
    }

    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.isReversed)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("layoutInScroll");
        v02.b().c("state", this.scrollState);
        v02.b().c("isReversed", Boolean.valueOf(this.isReversed));
        v02.b().c("isVertical", Boolean.valueOf(this.isVertical));
    }
}
