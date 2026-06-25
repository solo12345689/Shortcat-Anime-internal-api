package ci;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class f extends Handler implements l {

    /* JADX INFO: renamed from: a */
    private final k f33749a;

    /* JADX INFO: renamed from: b */
    private final int f33750b;

    /* JADX INFO: renamed from: c */
    private final c f33751c;

    /* JADX INFO: renamed from: d */
    private boolean f33752d;

    public f(c cVar, Looper looper, int i10) {
        super(looper);
        this.f33751c = cVar;
        this.f33750b = i10;
        this.f33749a = new k();
    }

    @Override // ci.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f33749a.a(jVarA);
                if (!this.f33752d) {
                    this.f33752d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                j jVarB = this.f33749a.b();
                if (jVarB == null) {
                    synchronized (this) {
                        jVarB = this.f33749a.b();
                        if (jVarB == null) {
                            this.f33752d = false;
                            return;
                        }
                    }
                }
                this.f33751c.g(jVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f33750b);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f33752d = true;
        } catch (Throwable th2) {
            this.f33752d = false;
            throw th2;
        }
    }
}
