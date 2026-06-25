package androidx.compose.foundation.layout;

import C.y;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "LK0/Y;", "LC/y;", "", "weight", "", "fill", "<init>", "(FZ)V", "c", "()LC/y;", "node", "LTd/L;", "h", "(LC/y;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWeight", "()F", "Z", "getFill", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutWeightElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean fill;

    public LayoutWeightElement(float f10, boolean z10) {
        this.weight = f10;
        this.fill = z10;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y create() {
        return new y(this.weight, this.fill);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = other instanceof LayoutWeightElement ? (LayoutWeightElement) other : null;
        return layoutWeightElement != null && this.weight == layoutWeightElement.weight && this.fill == layoutWeightElement.fill;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(y node) {
        node.G1(this.weight);
        node.F1(this.fill);
    }

    public int hashCode() {
        return (Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("weight");
        v02.e(Float.valueOf(this.weight));
        v02.b().c("weight", Float.valueOf(this.weight));
        v02.b().c("fill", Boolean.valueOf(this.fill));
    }
}
