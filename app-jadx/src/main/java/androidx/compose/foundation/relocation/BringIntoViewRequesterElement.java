package androidx.compose.foundation.relocation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "LK0/Y;", "Landroidx/compose/foundation/relocation/e;", "LH/b;", "requester", "<init>", "(LH/b;)V", "c", "()Landroidx/compose/foundation/relocation/e;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/relocation/e;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LH/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BringIntoViewRequesterElement extends Y {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final H.b requester;

    public BringIntoViewRequesterElement(H.b bVar) {
        this.requester = bVar;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public e create() {
        return new e(this.requester);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof BringIntoViewRequesterElement) && AbstractC5504s.c(this.requester, ((BringIntoViewRequesterElement) other).requester);
        }
        return true;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(e node) {
        node.F1(this.requester);
    }

    public int hashCode() {
        return this.requester.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("bringIntoViewRequester");
        v02.b().c("bringIntoViewRequester", this.requester);
    }
}
