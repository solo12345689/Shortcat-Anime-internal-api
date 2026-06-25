package i4;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48706a = i.i("WorkerFactory");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends v {
        a() {
        }

        @Override // i4.v
        public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static v c() {
        return new a();
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        androidx.work.c cVarA = a(context, str, workerParameters);
        if (cVarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            } catch (Throwable th2) {
                i.e().d(f48706a, "Invalid class: " + str, th2);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    cVarA = (androidx.work.c) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    i.e().d(f48706a, "Could not instantiate " + str, th3);
                }
            }
        }
        if (cVarA == null || !cVarA.j()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
