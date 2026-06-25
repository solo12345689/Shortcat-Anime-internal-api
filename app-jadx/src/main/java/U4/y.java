package U4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f19345b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).recycle();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v vVar, boolean z10) {
        try {
            if (this.f19344a || z10) {
                this.f19345b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f19344a = true;
                vVar.recycle();
                this.f19344a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
