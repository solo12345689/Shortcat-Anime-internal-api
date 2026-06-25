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
public abstract class P1 extends AbstractC4977V implements InterfaceC2464z0, InterfaceC4957A {

    /* JADX INFO: renamed from: b */
    private a f22175b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC4978W {

        /* JADX INFO: renamed from: c */
        private float f22176c;

        public a(long j10, float f10) {
            super(j10);
            this.f22176c = f10;
        }

        @Override // i0.AbstractC4978W
        public void c(AbstractC4978W abstractC4978W) {
            AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f22176c = ((a) abstractC4978W).f22176c;
        }

        @Override // i0.AbstractC4978W
        public AbstractC4978W d(long j10) {
            return new a(j10, this.f22176c);
        }

        public final float i() {
            return this.f22176c;
        }

        public final void j(float f10) {
            this.f22176c = f10;
        }
    }

    public P1(float f10) {
        AbstractC4993l abstractC4993lM = AbstractC5003v.M();
        a aVar = new a(abstractC4993lM.i(), f10);
        if (!(abstractC4993lM instanceof C4983b)) {
            aVar.g(new a(AbstractC4998q.c(1), f10));
        }
        this.f22175b = aVar;
    }

    @Override // Y.InterfaceC2464z0, Y.InterfaceC2396c0
    public float c() {
        return ((a) AbstractC5003v.e0(this.f22175b, this)).i();
    }

    @Override // i0.InterfaceC4957A
    public T1 d() {
        return U1.q();
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W i(AbstractC4978W abstractC4978W, AbstractC4978W abstractC4978W2, AbstractC4978W abstractC4978W3) {
        AbstractC5504s.f(abstractC4978W2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        AbstractC5504s.f(abstractC4978W3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) abstractC4978W2).i() == ((a) abstractC4978W3).i()) {
            return abstractC4978W2;
        }
        return null;
    }

    @Override // Y.InterfaceC2464z0
    public void k(float f10) {
        AbstractC4993l abstractC4993lC;
        a aVar = (a) AbstractC5003v.K(this.f22175b);
        if (aVar.i() == f10) {
            return;
        }
        a aVar2 = this.f22175b;
        synchronized (AbstractC5003v.O()) {
            abstractC4993lC = AbstractC4993l.f48495e.c();
            ((a) AbstractC5003v.Z(aVar2, this, abstractC4993lC, aVar)).j(f10);
            Td.L l10 = Td.L.f17438a;
        }
        AbstractC5003v.X(abstractC4993lC, this);
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W l() {
        return this.f22175b;
    }

    @Override // i0.InterfaceC4976U
    public void r(AbstractC4978W abstractC4978W) {
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f22175b = (a) abstractC4978W;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) AbstractC5003v.K(this.f22175b)).i() + ")@" + hashCode();
    }
}
