package a6;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: a6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2582c extends AbstractC2581b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F5.b f23818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f23819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f23824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f23825m;

    /* JADX INFO: renamed from: a6.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C2582c.this) {
                try {
                    C2582c.this.f23820h = false;
                    if (!C2582c.this.t()) {
                        C2582c.this.u();
                    } else if (C2582c.this.f23824l != null) {
                        C2582c.this.f23824l.i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a6.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void i();
    }

    private C2582c(InterfaceC2580a interfaceC2580a, b bVar, F5.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(interfaceC2580a);
        this.f23820h = false;
        this.f23822j = 2000L;
        this.f23823k = 1000L;
        this.f23825m = new a();
        this.f23824l = bVar;
        this.f23818f = bVar2;
        this.f23819g = scheduledExecutorService;
    }

    public static AbstractC2581b r(InterfaceC2580a interfaceC2580a, F5.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return s(interfaceC2580a, (b) interfaceC2580a, bVar, scheduledExecutorService);
    }

    public static AbstractC2581b s(InterfaceC2580a interfaceC2580a, b bVar, F5.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new C2582c(interfaceC2580a, bVar, bVar2, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        return this.f23818f.now() - this.f23821i > this.f23822j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        if (!this.f23820h) {
            this.f23820h = true;
            this.f23819g.schedule(this.f23825m, this.f23823k, TimeUnit.MILLISECONDS);
        }
    }

    @Override // a6.AbstractC2581b, a6.InterfaceC2580a
    public boolean h(Drawable drawable, Canvas canvas, int i10) {
        this.f23821i = this.f23818f.now();
        boolean zH = super.h(drawable, canvas, i10);
        u();
        return zH;
    }
}
