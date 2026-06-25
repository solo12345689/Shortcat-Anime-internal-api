package A2;

import android.os.HandlerThread;
import android.os.Looper;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f146d;

    public M() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f143a) {
            try {
                if (this.f144b == null) {
                    AbstractC6614a.g(this.f146d == 0 && this.f145c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f145c = handlerThread;
                    handlerThread.start();
                    this.f144b = this.f145c.getLooper();
                }
                this.f146d++;
                looper = this.f144b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f143a) {
            try {
                AbstractC6614a.g(this.f146d > 0);
                int i10 = this.f146d - 1;
                this.f146d = i10;
                if (i10 == 0 && (handlerThread = this.f145c) != null) {
                    handlerThread.quit();
                    this.f145c = null;
                    this.f144b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public M(Looper looper) {
        this.f143a = new Object();
        this.f144b = looper;
        this.f145c = null;
        this.f146d = 0;
    }
}
