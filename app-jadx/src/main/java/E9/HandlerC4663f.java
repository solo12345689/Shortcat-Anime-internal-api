package e9;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: e9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerC4663f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f45821a;

    public HandlerC4663f(Looper looper) {
        super(looper);
        this.f45821a = Looper.getMainLooper();
    }

    public HandlerC4663f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f45821a = Looper.getMainLooper();
    }
}
