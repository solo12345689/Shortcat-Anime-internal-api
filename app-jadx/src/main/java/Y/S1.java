package Y;

import i0.AbstractC4977V;
import i0.AbstractC4978W;
import i0.AbstractC4993l;
import i0.AbstractC4998q;
import i0.AbstractC5003v;
import i0.C4983b;
import i0.InterfaceC4957A;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class S1 extends AbstractC4977V implements InterfaceC4957A {

    /* JADX INFO: renamed from: b */
    private final T1 f22206b;

    /* JADX INFO: renamed from: c */
    private a f22207c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC4978W {

        /* JADX INFO: renamed from: c */
        private Object f22208c;

        public a(long j10, Object obj) {
            super(j10);
            this.f22208c = obj;
        }

        @Override // i0.AbstractC4978W
        public void c(AbstractC4978W abstractC4978W) {
            AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f22208c = ((a) abstractC4978W).f22208c;
        }

        @Override // i0.AbstractC4978W
        /* JADX INFO: renamed from: i */
        public a d(long j10) {
            return new a(AbstractC5003v.M().i(), this.f22208c);
        }

        public final Object j() {
            return this.f22208c;
        }

        public final void k(Object obj) {
            this.f22208c = obj;
        }
    }

    public S1(Object obj, T1 t12) {
        this.f22206b = t12;
        AbstractC4993l abstractC4993lM = AbstractC5003v.M();
        a aVar = new a(abstractC4993lM.i(), obj);
        if (!(abstractC4993lM instanceof C4983b)) {
            aVar.g(new a(AbstractC4998q.c(1), obj));
        }
        this.f22207c = aVar;
    }

    @Override // i0.InterfaceC4957A
    public T1 d() {
        return this.f22206b;
    }

    @Override // Y.C0, Y.h2
    public Object getValue() {
        return ((a) AbstractC5003v.e0(this.f22207c, this)).j();
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W i(AbstractC4978W abstractC4978W, AbstractC4978W abstractC4978W2, AbstractC4978W abstractC4978W3) {
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) abstractC4978W;
        AbstractC5504s.f(abstractC4978W2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) abstractC4978W2;
        AbstractC5504s.f(abstractC4978W3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) abstractC4978W3;
        if (d().b(aVar2.j(), aVar3.j())) {
            return abstractC4978W2;
        }
        Object objA = d().a(aVar.j(), aVar2.j(), aVar3.j());
        if (objA == null) {
            return null;
        }
        a aVarD = aVar3.d(aVar3.f());
        aVarD.k(objA);
        return aVarD;
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W l() {
        return this.f22207c;
    }

    @Override // i0.InterfaceC4976U
    public void r(AbstractC4978W abstractC4978W) {
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f22207c = (a) abstractC4978W;
    }

    @Override // Y.C0
    public void setValue(Object obj) {
        AbstractC4993l abstractC4993lC;
        a aVar = (a) AbstractC5003v.K(this.f22207c);
        if (d().b(aVar.j(), obj)) {
            return;
        }
        a aVar2 = this.f22207c;
        synchronized (AbstractC5003v.O()) {
            abstractC4993lC = AbstractC4993l.f48495e.c();
            ((a) AbstractC5003v.Z(aVar2, this, abstractC4993lC, aVar)).k(obj);
            Td.L l10 = Td.L.f17438a;
        }
        AbstractC5003v.X(abstractC4993lC, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) AbstractC5003v.K(this.f22207c)).j() + ")@" + hashCode();
    }
}
