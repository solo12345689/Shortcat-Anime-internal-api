package Q8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class Y extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final n9.j f14447b;

    public Y(int i10, n9.j jVar) {
        super(i10);
        this.f14447b = jVar;
    }

    @Override // Q8.c0
    public final void a(Status status) {
        this.f14447b.d(new P8.b(status));
    }

    @Override // Q8.c0
    public final void b(Exception exc) {
        this.f14447b.d(exc);
    }

    @Override // Q8.c0
    public final void c(E e10) throws DeadObjectException {
        try {
            h(e10);
        } catch (DeadObjectException e11) {
            a(c0.e(e11));
            throw e11;
        } catch (RemoteException e12) {
            a(c0.e(e12));
        } catch (RuntimeException e13) {
            this.f14447b.d(e13);
        }
    }

    protected abstract void h(E e10);
}
