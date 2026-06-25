package p2;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5917a extends AbstractC5918b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f55704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile RunnableC0854a f55705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile RunnableC0854a f55706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f55707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f55708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f55709n;

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class RunnableC0854a extends AbstractC5919c implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f55710f;

        RunnableC0854a() {
        }

        @Override // p2.AbstractC5919c
        protected Object b() {
            return AbstractC5917a.this.E();
        }

        @Override // p2.AbstractC5919c
        protected void g(Object obj) {
            AbstractC5917a.this.y(this, obj);
        }

        @Override // p2.AbstractC5919c
        protected void h(Object obj) {
            AbstractC5917a.this.z(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f55710f = false;
            AbstractC5917a.this.A();
        }
    }

    public AbstractC5917a(Context context) {
        super(context);
        this.f55708m = -10000L;
    }

    void A() {
        if (this.f55706k != null || this.f55705j == null) {
            return;
        }
        if (this.f55705j.f55710f) {
            this.f55705j.f55710f = false;
            this.f55709n.removeCallbacks(this.f55705j);
        }
        if (this.f55707l > 0 && SystemClock.uptimeMillis() < this.f55708m + this.f55707l) {
            this.f55705j.f55710f = true;
            this.f55709n.postAtTime(this.f55705j, this.f55708m + this.f55707l);
        } else {
            if (this.f55704i == null) {
                this.f55704i = B();
            }
            this.f55705j.c(this.f55704i);
        }
    }

    protected Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract Object C();

    protected Object E() {
        return C();
    }

    @Override // p2.AbstractC5918b
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f55705j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f55705j);
            printWriter.print(" waiting=");
            printWriter.println(this.f55705j.f55710f);
        }
        if (this.f55706k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f55706k);
            printWriter.print(" waiting=");
            printWriter.println(this.f55706k.f55710f);
        }
        if (this.f55707l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f55707l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f55708m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f55708m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p2.AbstractC5918b
    protected boolean l() {
        if (this.f55705j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f55706k != null) {
            if (this.f55705j.f55710f) {
                this.f55705j.f55710f = false;
                this.f55709n.removeCallbacks(this.f55705j);
            }
            this.f55705j = null;
            return false;
        }
        if (this.f55705j.f55710f) {
            this.f55705j.f55710f = false;
            this.f55709n.removeCallbacks(this.f55705j);
            this.f55705j = null;
            return false;
        }
        boolean zA = this.f55705j.a(false);
        if (zA) {
            this.f55706k = this.f55705j;
            x();
        }
        this.f55705j = null;
        return zA;
    }

    @Override // p2.AbstractC5918b
    protected void n() {
        super.n();
        b();
        this.f55705j = new RunnableC0854a();
        A();
    }

    void y(RunnableC0854a runnableC0854a, Object obj) {
        D(obj);
        if (this.f55706k == runnableC0854a) {
            t();
            this.f55708m = SystemClock.uptimeMillis();
            this.f55706k = null;
            e();
            A();
        }
    }

    void z(RunnableC0854a runnableC0854a, Object obj) {
        if (this.f55705j != runnableC0854a) {
            y(runnableC0854a, obj);
            return;
        }
        if (i()) {
            D(obj);
            return;
        }
        c();
        this.f55708m = SystemClock.uptimeMillis();
        this.f55705j = null;
        f(obj);
    }

    public void x() {
    }

    public void D(Object obj) {
    }
}
