package F8;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class i extends FutureTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ j f6581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f6581a = jVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6581a.f6582a.f6590f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        } else if (Log.isLoggable("GAv4", 6)) {
            String strValueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
            sb2.append("MeasurementExecutor: job failed with ");
            sb2.append(strValueOf);
            Log.e("GAv4", sb2.toString());
        }
        super.setException(th2);
    }
}
