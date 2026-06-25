package androidx.compose.foundation.layout;

import C.EnumC1152x;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/m;", "LC/x;", "width", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(LC/x;ZLkotlin/jvm/functions/Function1;)V", "c", "()Landroidx/compose/foundation/layout/m;", "node", "h", "(Landroidx/compose/foundation/layout/m;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "LC/x;", "getWidth", "()LC/x;", "Z", "getEnforceIncoming", "()Z", "d", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IntrinsicWidthElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC1152x width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1 inspectorInfo;

    public IntrinsicWidthElement(EnumC1152x enumC1152x, boolean z10, Function1 function1) {
        this.width = enumC1152x;
        this.enforceIncoming = z10;
        this.inspectorInfo = function1;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m create() {
        return new m(this.width, this.enforceIncoming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = other instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) other : null;
        return intrinsicWidthElement != null && this.width == intrinsicWidthElement.width && this.enforceIncoming == intrinsicWidthElement.enforceIncoming;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(m node) {
        node.H1(this.width);
        node.G1(this.enforceIncoming);
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }
}
