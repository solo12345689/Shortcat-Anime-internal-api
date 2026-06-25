package androidx.compose.foundation.layout;

import C.A;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/r;", "LC/A;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(LC/A;Lkotlin/jvm/functions/Function1;)V", "c", "()Landroidx/compose/foundation/layout/r;", "node", "h", "(Landroidx/compose/foundation/layout/r;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "LC/A;", "getPaddingValues", "()LC/A;", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingValuesElement extends Y {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final A paddingValues;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 inspectorInfo;

    public PaddingValuesElement(A a10, Function1 function1) {
        this.paddingValues = a10;
        this.inspectorInfo = function1;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public r create() {
        return new r(this.paddingValues);
    }

    public boolean equals(Object other) {
        PaddingValuesElement paddingValuesElement = other instanceof PaddingValuesElement ? (PaddingValuesElement) other : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC5504s.c(this.paddingValues, paddingValuesElement.paddingValues);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(r node) {
        node.F1(this.paddingValues);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }
}
