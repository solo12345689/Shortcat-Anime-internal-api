package G1;

import Td.u;
import Td.v;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zd.e f6979a;

    public f(Zd.e eVar) {
        super(false);
        this.f6979a = eVar;
    }

    public void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            Zd.e eVar = this.f6979a;
            u.a aVar = u.f17466b;
            eVar.resumeWith(u.b(v.a(th2)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f6979a.resumeWith(u.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
