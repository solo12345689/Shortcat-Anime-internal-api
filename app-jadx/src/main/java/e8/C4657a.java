package e8;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: e8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4657a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f45814c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f45815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f45816b;

    /* JADX INFO: renamed from: e8.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C4657a f45817a = new C4657a();
    }

    public static C4657a b() {
        return b.f45817a;
    }

    public int a() {
        return this.f45816b.getAndIncrement();
    }

    public Looper c(int i10) {
        int i11 = i10 % f45814c;
        if (i11 < this.f45815a.size()) {
            if (this.f45815a.get(i11) == null) {
                return Looper.getMainLooper();
            }
            Looper looper = ((HandlerThread) this.f45815a.get(i11)).getLooper();
            return looper != null ? looper : Looper.getMainLooper();
        }
        HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i11);
        handlerThread.start();
        this.f45815a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }

    private C4657a() {
        this.f45815a = new ArrayList();
        this.f45816b = new AtomicInteger(0);
    }
}
