package androidx.compose.foundation.layout;

import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/u;", "Li1/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/u;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/layout/u;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "F", "getMinWidth-D9Ej5fM", "()F", "getMinHeight-D9Ej5fM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u create() {
        return new u(this.minWidth, this.minHeight, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) other;
        return C5015h.q(this.minWidth, unspecifiedConstraintsElement.minWidth) && C5015h.q(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(u node) {
        node.F1(this.minWidth);
        node.E1(this.minHeight);
    }

    public int hashCode() {
        return (C5015h.r(this.minWidth) * 31) + C5015h.r(this.minHeight);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("defaultMinSize");
        v02.b().c("minWidth", C5015h.h(this.minWidth));
        v02.b().c("minHeight", C5015h.h(this.minHeight));
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
