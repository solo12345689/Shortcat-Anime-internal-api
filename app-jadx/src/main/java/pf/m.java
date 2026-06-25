package Pf;

import Lf.B;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class m extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f13974e;

    public m(long j10, m mVar, int i10) {
        super(j10, mVar, i10);
        this.f13974e = new AtomicReferenceArray(l.f13973f);
    }

    @Override // Lf.B
    public int r() {
        return l.f13973f;
    }

    @Override // Lf.B
    public void s(int i10, Throwable th2, Zd.i iVar) {
        v().set(i10, l.f13972e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f11547c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f13974e;
    }
}
