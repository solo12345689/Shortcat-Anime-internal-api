package K8;

import Q8.InterfaceC2067o;
import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p2.AbstractC5917a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC5917a implements InterfaceC2067o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Semaphore f10951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f10952p;

    public g(Context context, Set set) {
        super(context);
        this.f10951o = new Semaphore(0);
        this.f10952p = set;
    }

    @Override // p2.AbstractC5917a
    public final /* bridge */ /* synthetic */ Object C() {
        Iterator it = this.f10952p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((P8.f) it.next()).e(this)) {
                i10++;
            }
        }
        try {
            this.f10951o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p2.AbstractC5918b
    protected final void p() {
        this.f10951o.drainPermits();
        h();
    }
}
