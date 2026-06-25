package Lf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Lf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1910q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11590a = AtomicReferenceFieldUpdater.newUpdater(C1910q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C1910q(boolean z10) {
        this._cur$volatile = new r(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11590a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            int iA = rVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f11590a, this, rVar, rVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11590a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f11590a, this, rVar, rVar.l());
            }
        }
    }

    public final int c() {
        return ((r) f11590a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11590a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            Object objM = rVar.m();
            if (objM != r.f11594h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f11590a, this, rVar, rVar.l());
        }
    }
}
