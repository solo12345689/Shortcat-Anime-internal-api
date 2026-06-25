package C5;

import C5.a;
import y5.k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends a {
    private b(i iVar, a.c cVar, Throwable th2) {
        super(iVar, cVar, th2);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2864a) {
                    super.finalize();
                    return;
                }
                Object objF = this.f2865b.f();
                AbstractC7283a.K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2865b)), objF == null ? null : objF.getClass().getName());
                a.c cVar = this.f2866c;
                if (cVar != null) {
                    cVar.a(this.f2865b, this.f2867d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // C5.a
    /* JADX INFO: renamed from: g */
    public a clone() {
        k.i(E());
        return new b(this.f2865b, this.f2866c, this.f2867d != null ? new Throwable() : null);
    }

    b(Object obj, h hVar, a.c cVar, Throwable th2) {
        super(obj, hVar, cVar, th2, true);
    }
}
