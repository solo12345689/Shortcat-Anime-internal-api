package D5;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import y5.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f3549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f3550i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f3552b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f3554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f3555e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f3551a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f3553c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f3557g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f3556f = new ReentrantLock();

    /* JADX INFO: renamed from: D5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum EnumC0039a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f3557g) {
            return;
        }
        this.f3556f.lock();
        try {
            if (!this.f3557g) {
                this.f3552b = Environment.getDataDirectory();
                this.f3554d = Environment.getExternalStorageDirectory();
                g();
                this.f3557g = true;
            }
        } finally {
            this.f3556f.unlock();
        }
    }

    public static synchronized a d() {
        try {
            if (f3549h == null) {
                f3549h = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3549h;
    }

    private void e() {
        if (this.f3556f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f3555e > f3550i) {
                    g();
                }
            } finally {
                this.f3556f.unlock();
            }
        }
    }

    private void g() {
        this.f3551a = h(this.f3551a, this.f3552b);
        this.f3553c = h(this.f3553c, this.f3554d);
        this.f3555e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th2) {
                throw p.a(th2);
            }
        }
        return null;
    }

    public long c(EnumC0039a enumC0039a) {
        b();
        e();
        StatFs statFs = enumC0039a == EnumC0039a.INTERNAL ? this.f3551a : this.f3553c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0039a enumC0039a, long j10) {
        b();
        long jC = c(enumC0039a);
        return jC <= 0 || jC < j10;
    }
}
