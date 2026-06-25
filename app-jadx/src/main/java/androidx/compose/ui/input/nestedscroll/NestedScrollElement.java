package androidx.compose.ui.input.nestedscroll;

import D0.b;
import D0.c;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\f*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "LK0/Y;", "LD0/c;", "LD0/a;", "connection", "LD0/b;", "dispatcher", "<init>", "(LD0/a;LD0/b;)V", "c", "()LD0/c;", "node", "LTd/L;", "h", "(LD0/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "LD0/a;", "getConnection", "()LD0/a;", "LD0/b;", "getDispatcher", "()LD0/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestedScrollElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0.a connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b dispatcher;

    public NestedScrollElement(D0.a aVar, b bVar) {
        this.connection = aVar;
        this.dispatcher = bVar;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.connection, this.dispatcher);
    }

    public boolean equals(Object other) {
        if (!(other instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) other;
        return AbstractC5504s.c(nestedScrollElement.connection, this.connection) && AbstractC5504s.c(nestedScrollElement.dispatcher, this.dispatcher);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c node) {
        node.L1(this.connection, this.dispatcher);
    }

    public int hashCode() {
        int iHashCode = this.connection.hashCode() * 31;
        b bVar = this.dispatcher;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("nestedScroll");
        v02.b().c("connection", this.connection);
        v02.b().c("dispatcher", this.dispatcher);
    }
}
