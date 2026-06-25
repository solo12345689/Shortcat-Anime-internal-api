package Q8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f14449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n9.j f14450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2068p f14451d;

    public a0(int i10, r rVar, n9.j jVar, InterfaceC2068p interfaceC2068p) {
        super(i10);
        this.f14450c = jVar;
        this.f14449b = rVar;
        this.f14451d = interfaceC2068p;
        if (i10 == 2 && rVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // Q8.c0
    public final void a(Status status) {
        this.f14450c.d(this.f14451d.a(status));
    }

    @Override // Q8.c0
    public final void b(Exception exc) {
        this.f14450c.d(exc);
    }

    @Override // Q8.c0
    public final void c(E e10) throws DeadObjectException {
        try {
            this.f14449b.b(e10.v(), this.f14450c);
        } catch (DeadObjectException e11) {
            throw e11;
        } catch (RemoteException e12) {
            a(c0.e(e12));
        } catch (RuntimeException e13) {
            this.f14450c.d(e13);
        }
    }

    @Override // Q8.c0
    public final void d(C2073v c2073v, boolean z10) {
        c2073v.d(this.f14450c, z10);
    }

    @Override // Q8.M
    public final boolean f(E e10) {
        return this.f14449b.c();
    }

    @Override // Q8.M
    public final O8.c[] g(E e10) {
        return this.f14449b.e();
    }
}
