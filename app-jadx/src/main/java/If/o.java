package If;

import Gf.AbstractC1630q0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class o {
    public static final void a(v vVar, Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC1630q0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        vVar.k(cancellationExceptionA);
    }
}
