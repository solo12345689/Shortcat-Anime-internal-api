package f9;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class p extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f46982a;

    public p(Looper looper) {
        super(looper);
        this.f46982a = Looper.getMainLooper();
    }

    public p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f46982a = Looper.getMainLooper();
    }
}
