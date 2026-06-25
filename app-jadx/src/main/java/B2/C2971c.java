package b2;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import t.i0;

/* JADX INFO: renamed from: b2.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2971c {

    /* JADX INFO: renamed from: j */
    private static final ThreadLocal f33023j = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    private InterfaceC2980l f33028e;

    /* JADX INFO: renamed from: i */
    public e f33032i;

    /* JADX INFO: renamed from: a */
    private final i0 f33024a = new i0();

    /* JADX INFO: renamed from: b */
    final ArrayList f33025b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final b f33026c = new b();

    /* JADX INFO: renamed from: d */
    private final Runnable f33027d = new Runnable() { // from class: b2.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f33022a.f33026c.a();
        }
    };

    /* JADX INFO: renamed from: f */
    long f33029f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f33030g = false;

    /* JADX INFO: renamed from: h */
    public float f33031h = 1.0f;

    /* JADX INFO: renamed from: b2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b {
        private b() {
        }

        public void a() {
            C2971c.this.f33029f = SystemClock.uptimeMillis();
            C2971c c2971c = C2971c.this;
            c2971c.f(c2971c.f33029f);
            if (C2971c.this.f33025b.size() > 0) {
                C2971c.this.f33028e.a(C2971c.this.f33027d);
            }
        }

        /* synthetic */ b(C2971c c2971c, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: b2.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC0555c {
        boolean a(long j10);
    }

    /* JADX INFO: renamed from: b2.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d implements e {

        /* JADX INFO: renamed from: a */
        ValueAnimator.DurationScaleChangeListener f33034a;

        public d() {
        }

        @Override // b2.C2971c.e
        public boolean a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f33034a);
            this.f33034a = null;
            return zUnregisterDurationScaleChangeListener;
        }

        @Override // b2.C2971c.e
        public boolean b() {
            if (this.f33034a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: b2.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    C2971c.this.f33031h = f10;
                }
            };
            this.f33034a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }
    }

    /* JADX INFO: renamed from: b2.c$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        boolean a();

        boolean b();
    }

    /* JADX INFO: renamed from: b2.c$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f implements InterfaceC2980l {

        /* JADX INFO: renamed from: a */
        private final Choreographer f33036a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b */
        private final Looper f33037b = Looper.myLooper();

        f() {
        }

        @Override // b2.InterfaceC2980l
        public void a(final Runnable runnable) {
            this.f33036a.postFrameCallback(new Choreographer.FrameCallback() { // from class: b2.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }

        @Override // b2.InterfaceC2980l
        public boolean b() {
            return Thread.currentThread() == this.f33037b.getThread();
        }
    }

    public C2971c(InterfaceC2980l interfaceC2980l) {
        this.f33028e = interfaceC2980l;
    }

    private void e() {
        if (this.f33030g) {
            for (int size = this.f33025b.size() - 1; size >= 0; size--) {
                if (this.f33025b.get(size) == null) {
                    this.f33025b.remove(size);
                }
            }
            if (this.f33025b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f33032i.a();
            }
            this.f33030g = false;
        }
    }

    static C2971c h() {
        ThreadLocal threadLocal = f33023j;
        if (threadLocal.get() == null) {
            threadLocal.set(new C2971c(new f()));
        }
        return (C2971c) threadLocal.get();
    }

    private boolean i(InterfaceC0555c interfaceC0555c, long j10) {
        Long l10 = (Long) this.f33024a.get(interfaceC0555c);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f33024a.remove(interfaceC0555c);
        return true;
    }

    void d(InterfaceC0555c interfaceC0555c, long j10) {
        if (this.f33025b.size() == 0) {
            this.f33028e.a(this.f33027d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f33031h = ValueAnimator.getDurationScale();
                if (this.f33032i == null) {
                    this.f33032i = new d();
                }
                this.f33032i.b();
            }
        }
        if (!this.f33025b.contains(interfaceC0555c)) {
            this.f33025b.add(interfaceC0555c);
        }
        if (j10 > 0) {
            this.f33024a.put(interfaceC0555c, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void f(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f33025b.size(); i10++) {
            InterfaceC0555c interfaceC0555c = (InterfaceC0555c) this.f33025b.get(i10);
            if (interfaceC0555c != null && i(interfaceC0555c, jUptimeMillis)) {
                interfaceC0555c.a(j10);
            }
        }
        e();
    }

    public float g() {
        return this.f33031h;
    }

    boolean j() {
        return this.f33028e.b();
    }

    void k(InterfaceC0555c interfaceC0555c) {
        this.f33024a.remove(interfaceC0555c);
        int iIndexOf = this.f33025b.indexOf(interfaceC0555c);
        if (iIndexOf >= 0) {
            this.f33025b.set(iIndexOf, null);
            this.f33030g = true;
        }
    }
}
