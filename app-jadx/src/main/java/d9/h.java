package d9;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f45085a;

    public h(Looper looper) {
        super(looper);
        this.f45085a = Looper.getMainLooper();
    }

    public h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f45085a = Looper.getMainLooper();
    }
}
