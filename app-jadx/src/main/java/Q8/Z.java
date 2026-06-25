package Q8;

import R8.AbstractC2115p;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.a f14448b;

    public Z(int i10, com.google.android.gms.common.api.internal.a aVar) {
        super(i10);
        this.f14448b = (com.google.android.gms.common.api.internal.a) AbstractC2115p.m(aVar, "Null methods are not runnable.");
    }

    @Override // Q8.c0
    public final void a(Status status) {
        try {
            this.f14448b.h(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // Q8.c0
    public final void b(Exception exc) {
        try {
            this.f14448b.h(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // Q8.c0
    public final void c(E e10) throws DeadObjectException {
        try {
            this.f14448b.f(e10.v());
        } catch (RuntimeException e11) {
            b(e11);
        }
    }

    @Override // Q8.c0
    public final void d(C2073v c2073v, boolean z10) {
        c2073v.c(this.f14448b, z10);
    }
}
