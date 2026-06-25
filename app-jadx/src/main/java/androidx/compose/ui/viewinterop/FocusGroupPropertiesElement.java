package androidx.compose.ui.viewinterop;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;", "LK0/Y;", "Landroidx/compose/ui/viewinterop/g;", "<init>", "()V", "c", "()Landroidx/compose/ui/viewinterop/g;", "node", "LTd/L;", "h", "(Landroidx/compose/ui/viewinterop/g;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusGroupPropertiesElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FocusGroupPropertiesElement f27653b = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g create() {
        return new g();
    }

    public boolean equals(Object other) {
        return other == this;
    }

    public int hashCode() {
        return -1929324230;
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("FocusGroupProperties");
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(g node) {
    }
}
