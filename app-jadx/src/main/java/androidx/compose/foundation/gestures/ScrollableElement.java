package androidx.compose.foundation.gestures;

import B.m;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import x.InterfaceC6999T;
import z.InterfaceC7262d;
import z.n;
import z.q;
import z.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u0017*\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LK0/Y;", "Landroidx/compose/foundation/gestures/f;", "Lz/x;", "state", "Lz/q;", "orientation", "Lx/T;", "overscrollEffect", "", "enabled", "reverseDirection", "Lz/n;", "flingBehavior", "LB/m;", "interactionSource", "Lz/d;", "bringIntoViewSpec", "<init>", "(Lz/x;Lz/q;Lx/T;ZZLz/n;LB/m;Lz/d;)V", "c", "()Landroidx/compose/foundation/gestures/f;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/gestures/f;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "Lz/x;", "getState", "()Lz/x;", "Lz/q;", "getOrientation", "()Lz/q;", "d", "Lx/T;", "getOverscrollEffect", "()Lx/T;", "e", "Z", "getEnabled", "()Z", "f", "getReverseDirection", "g", "Lz/n;", "getFlingBehavior", "()Lz/n;", "LB/m;", "getInteractionSource", "()LB/m;", "i", "Lz/d;", "getBringIntoViewSpec", "()Lz/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollableElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q orientation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6999T overscrollEffect;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n flingBehavior;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m interactionSource;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC7262d bringIntoViewSpec;

    public ScrollableElement(x xVar, q qVar, InterfaceC6999T interfaceC6999T, boolean z10, boolean z11, n nVar, m mVar, InterfaceC7262d interfaceC7262d) {
        this.state = xVar;
        this.orientation = qVar;
        this.overscrollEffect = interfaceC6999T;
        this.enabled = z10;
        this.reverseDirection = z11;
        this.flingBehavior = nVar;
        this.interactionSource = mVar;
        this.bringIntoViewSpec = interfaceC7262d;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f create() {
        return new f(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return AbstractC5504s.c(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && AbstractC5504s.c(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && AbstractC5504s.c(this.flingBehavior, scrollableElement.flingBehavior) && AbstractC5504s.c(this.interactionSource, scrollableElement.interactionSource) && AbstractC5504s.c(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f node) {
        node.l2(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        InterfaceC6999T interfaceC6999T = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (interfaceC6999T != null ? interfaceC6999T.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        n nVar = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        m mVar = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        InterfaceC7262d interfaceC7262d = this.bringIntoViewSpec;
        return iHashCode4 + (interfaceC7262d != null ? interfaceC7262d.hashCode() : 0);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("scrollable");
        v02.b().c("orientation", this.orientation);
        v02.b().c("state", this.state);
        v02.b().c("overscrollEffect", this.overscrollEffect);
        v02.b().c("enabled", Boolean.valueOf(this.enabled));
        v02.b().c("reverseDirection", Boolean.valueOf(this.reverseDirection));
        v02.b().c("flingBehavior", this.flingBehavior);
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("bringIntoViewSpec", this.bringIntoViewSpec);
    }
}
