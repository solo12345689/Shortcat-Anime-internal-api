package m9;

import R8.AbstractC2115p;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.r;
import g9.h;
import g9.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: m9.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5649a {

    /* JADX INFO: renamed from: r */
    private static final long f53216r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s */
    private static volatile ScheduledExecutorService f53217s = null;

    /* JADX INFO: renamed from: t */
    private static final Object f53218t = new Object();

    /* JADX INFO: renamed from: u */
    private static volatile InterfaceC5653e f53219u = new C5651c();

    /* JADX INFO: renamed from: a */
    private final Object f53220a;

    /* JADX INFO: renamed from: b */
    private final PowerManager.WakeLock f53221b;

    /* JADX INFO: renamed from: c */
    private int f53222c;

    /* JADX INFO: renamed from: d */
    private Future f53223d;

    /* JADX INFO: renamed from: e */
    private long f53224e;

    /* JADX INFO: renamed from: f */
    private final Set f53225f;

    /* JADX INFO: renamed from: g */
    private boolean f53226g;

    /* JADX INFO: renamed from: h */
    private int f53227h;

    /* JADX INFO: renamed from: i */
    g9.b f53228i;

    /* JADX INFO: renamed from: j */
    private com.google.android.gms.common.util.d f53229j;

    /* JADX INFO: renamed from: k */
    private WorkSource f53230k;

    /* JADX INFO: renamed from: l */
    private final String f53231l;

    /* JADX INFO: renamed from: m */
    private final String f53232m;

    /* JADX INFO: renamed from: n */
    private final Context f53233n;

    /* JADX INFO: renamed from: o */
    private final Map f53234o;

    /* JADX INFO: renamed from: p */
    private AtomicInteger f53235p;

    /* JADX INFO: renamed from: q */
    private final ScheduledExecutorService f53236q;

    public C5649a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f53220a = new Object();
        this.f53222c = 0;
        this.f53225f = new HashSet();
        this.f53226g = true;
        this.f53229j = g.d();
        this.f53234o = new HashMap();
        this.f53235p = new AtomicInteger(0);
        AbstractC2115p.m(context, "WakeLock: context must not be null");
        AbstractC2115p.g(str, "WakeLock: wakeLockName must not be empty");
        this.f53233n = context.getApplicationContext();
        this.f53232m = str;
        this.f53228i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f53231l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f53231l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f53221b = wakeLockNewWakeLock;
        if (r.c(context)) {
            WorkSource workSourceB = r.b(context, p.a(packageName) ? context.getPackageName() : packageName);
            this.f53230k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f53217s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f53218t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f53217s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f53217s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f53236q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(C5649a c5649a) {
        synchronized (c5649a.f53220a) {
            try {
                if (c5649a.b()) {
                    Log.e("WakeLock", String.valueOf(c5649a.f53231l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c5649a.g();
                    if (c5649a.b()) {
                        c5649a.f53222c = 1;
                        c5649a.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String f(String str) {
        if (this.f53226g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f53225f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f53225f);
        this.f53225f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f53220a) {
            try {
                if (b()) {
                    if (this.f53226g) {
                        int i11 = this.f53222c - 1;
                        this.f53222c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f53222c = 0;
                    }
                    g();
                    Iterator it = this.f53234o.values().iterator();
                    while (it.hasNext()) {
                        ((C5652d) it.next()).f53238a = 0;
                    }
                    this.f53234o.clear();
                    Future future = this.f53223d;
                    if (future != null) {
                        future.cancel(false);
                        this.f53223d = null;
                        this.f53224e = 0L;
                    }
                    this.f53227h = 0;
                    if (this.f53221b.isHeld()) {
                        try {
                            try {
                                this.f53221b.release();
                                if (this.f53228i != null) {
                                    this.f53228i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f53231l).concat(" failed to release!"), e10);
                                if (this.f53228i != null) {
                                    this.f53228i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f53228i != null) {
                                this.f53228i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f53231l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f53235p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f53216r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f53220a) {
            try {
                if (!b()) {
                    this.f53228i = g9.b.a(false, null);
                    this.f53221b.acquire();
                    this.f53229j.c();
                }
                this.f53222c++;
                this.f53227h++;
                f(null);
                C5652d c5652d = (C5652d) this.f53234o.get(null);
                if (c5652d == null) {
                    c5652d = new C5652d(null);
                    this.f53234o.put(null, c5652d);
                }
                c5652d.f53238a++;
                long jC = this.f53229j.c();
                long j11 = Long.MAX_VALUE - jC > jMax ? jC + jMax : Long.MAX_VALUE;
                if (j11 > this.f53224e) {
                    this.f53224e = j11;
                    Future future = this.f53223d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f53223d = this.f53236q.schedule(new Runnable() { // from class: m9.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5649a.e(this.f53237a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f53220a) {
            z10 = this.f53222c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f53235p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f53231l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f53220a) {
            try {
                f(null);
                if (this.f53234o.containsKey(null)) {
                    C5652d c5652d = (C5652d) this.f53234o.get(null);
                    if (c5652d != null) {
                        int i10 = c5652d.f53238a - 1;
                        c5652d.f53238a = i10;
                        if (i10 == 0) {
                            this.f53234o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f53231l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f53220a) {
            this.f53226g = z10;
        }
    }
}
