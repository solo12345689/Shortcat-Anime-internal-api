package C5;

import C5.a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends a {
    c(Object obj, h hVar, a.c cVar, Throwable th2) {
        super(obj, hVar, cVar, th2, true);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2864a) {
                    return;
                }
                Object objF = this.f2865b.f();
                AbstractC7283a.K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2865b)), objF == null ? null : objF.getClass().getName());
                this.f2865b.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // C5.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // C5.a
    /* JADX INFO: renamed from: g */
    public a clone() {
        return this;
    }
}
