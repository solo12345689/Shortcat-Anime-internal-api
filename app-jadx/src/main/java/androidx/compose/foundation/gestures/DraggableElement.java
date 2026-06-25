package androidx.compose.foundation.gestures;

import E0.C;
import K0.Y;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import z.m;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0010*\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*¨\u00062"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LK0/Y;", "Landroidx/compose/foundation/gestures/c;", "Lz/m;", "state", "Lz/q;", "orientation", "", "enabled", "LB/m;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LGf/O;", "Lr0/f;", "LZd/e;", "LTd/L;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lz/m;Lz/q;ZLB/m;ZLie/o;Lie/o;Z)V", "c", "()Landroidx/compose/foundation/gestures/c;", "node", "h", "(Landroidx/compose/foundation/gestures/c;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "Lz/m;", "Lz/q;", "d", "Z", "e", "LB/m;", "f", "g", "Lie/o;", "i", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DraggableElement extends Y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function1 f25879k = a.f25888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q orientation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final B.m interactionSource;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean startDragImmediately;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5096o onDragStarted;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5096o onDragStopped;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25888a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C c10) {
            return Boolean.TRUE;
        }
    }

    public DraggableElement(m mVar, q qVar, boolean z10, B.m mVar2, boolean z11, InterfaceC5096o interfaceC5096o, InterfaceC5096o interfaceC5096o2, boolean z12) {
        this.state = mVar;
        this.orientation = qVar;
        this.enabled = z10;
        this.interactionSource = mVar2;
        this.startDragImmediately = z11;
        this.onDragStarted = interfaceC5096o;
        this.onDragStopped = interfaceC5096o2;
        this.reverseDirection = z12;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.state, f25879k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DraggableElement.class != other.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) other;
        return AbstractC5504s.c(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && AbstractC5504s.c(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && AbstractC5504s.c(this.onDragStarted, draggableElement.onDragStarted) && AbstractC5504s.c(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c node) {
        node.m2(this.state, f25879k, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        B.m mVar = this.interactionSource;
        return ((((((((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("draggable");
        v02.b().c("orientation", this.orientation);
        v02.b().c("enabled", Boolean.valueOf(this.enabled));
        v02.b().c("reverseDirection", Boolean.valueOf(this.reverseDirection));
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("startDragImmediately", Boolean.valueOf(this.startDragImmediately));
        v02.b().c("onDragStarted", this.onDragStarted);
        v02.b().c("onDragStopped", this.onDragStopped);
        v02.b().c("state", this.state);
    }
}
