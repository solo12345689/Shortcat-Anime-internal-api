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
public abstract class Q1 extends AbstractC4977V implements A0, InterfaceC4957A {

    /* JADX INFO: renamed from: b */
    private a f22177b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC4978W {

        /* JADX INFO: renamed from: c */
        private int f22178c;

        public a(long j10, int i10) {
            super(j10);
            this.f22178c = i10;
        }

        @Override // i0.AbstractC4978W
        public void c(AbstractC4978W abstractC4978W) {
            AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f22178c = ((a) abstractC4978W).f22178c;
        }

        @Override // i0.AbstractC4978W
        public AbstractC4978W d(long j10) {
            return new a(j10, this.f22178c);
        }

        public final int i() {
            return this.f22178c;
        }

        public final void j(int i10) {
            this.f22178c = i10;
        }
    }

    public Q1(int i10) {
        AbstractC4993l abstractC4993lM = AbstractC5003v.M();
        a aVar = new a(abstractC4993lM.i(), i10);
        if (!(abstractC4993lM instanceof C4983b)) {
            aVar.g(new a(AbstractC4998q.c(1), i10));
        }
        this.f22177b = aVar;
    }

    @Override // Y.A0, Y.InterfaceC2417j0
    public int b() {
        return ((a) AbstractC5003v.e0(this.f22177b, this)).i();
    }

    @Override // i0.InterfaceC4957A
    public T1 d() {
        return U1.q();
    }

    @Override // Y.A0
    public void f(int i10) {
        AbstractC4993l abstractC4993lC;
        a aVar = (a) AbstractC5003v.K(this.f22177b);
        if (aVar.i() != i10) {
            a aVar2 = this.f22177b;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                ((a) AbstractC5003v.Z(aVar2, this, abstractC4993lC, aVar)).j(i10);
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5003v.X(abstractC4993lC, this);
        }
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W i(AbstractC4978W abstractC4978W, AbstractC4978W abstractC4978W2, AbstractC4978W abstractC4978W3) {
        AbstractC5504s.f(abstractC4978W2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        AbstractC5504s.f(abstractC4978W3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) abstractC4978W2).i() == ((a) abstractC4978W3).i()) {
            return abstractC4978W2;
        }
        return null;
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W l() {
        return this.f22177b;
    }

    @Override // i0.InterfaceC4976U
    public void r(AbstractC4978W abstractC4978W) {
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f22177b = (a) abstractC4978W;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) AbstractC5003v.K(this.f22177b)).i() + ")@" + hashCode();
    }
}
