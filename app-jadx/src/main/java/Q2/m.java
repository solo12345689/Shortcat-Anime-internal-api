package Q2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.InterfaceC6627n;
import t2.P;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: d */
    public static final c f14325d = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final c f14326e = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f */
    public static final c f14327f = new c(2, -9223372036854775807L);

    /* JADX INFO: renamed from: g */
    public static final c f14328g = new c(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a */
    private final R2.a f14329a;

    /* JADX INFO: renamed from: b */
    private d f14330b;

    /* JADX INFO: renamed from: c */
    private IOException f14331c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final int f14332a;

        /* JADX INFO: renamed from: b */
        private final long f14333b;

        /* synthetic */ c(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public boolean c() {
            int i10 = this.f14332a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f14332a = i10;
            this.f14333b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f14334a;

        /* JADX INFO: renamed from: b */
        private final e f14335b;

        /* JADX INFO: renamed from: c */
        private final long f14336c;

        /* JADX INFO: renamed from: d */
        private b f14337d;

        /* JADX INFO: renamed from: e */
        private IOException f14338e;

        /* JADX INFO: renamed from: f */
        private int f14339f;

        /* JADX INFO: renamed from: g */
        private Thread f14340g;

        /* JADX INFO: renamed from: h */
        private boolean f14341h;

        /* JADX INFO: renamed from: i */
        private volatile boolean f14342i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f14335b = eVar;
            this.f14337d = bVar;
            this.f14334a = i10;
            this.f14336c = j10;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) AbstractC6614a.e(this.f14337d)).v(this.f14335b, jElapsedRealtime, jElapsedRealtime - this.f14336c, this.f14339f);
            this.f14338e = null;
            m.this.f14329a.execute((Runnable) AbstractC6614a.e(m.this.f14330b));
        }

        private void c() {
            m.this.f14330b = null;
        }

        private long d() {
            return Math.min((this.f14339f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f14342i = z10;
            this.f14338e = null;
            if (hasMessages(1)) {
                this.f14341h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f14341h = true;
                        this.f14335b.c();
                        Thread thread = this.f14340g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC6614a.e(this.f14337d)).h(this.f14335b, jElapsedRealtime, jElapsedRealtime - this.f14336c, true);
                this.f14337d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f14338e;
            if (iOException != null && this.f14339f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            AbstractC6614a.g(m.this.f14330b == null);
            m.this.f14330b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f14342i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f14336c;
            b bVar = (b) AbstractC6614a.e(this.f14337d);
            if (this.f14341h) {
                bVar.h(this.f14335b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.j(this.f14335b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    AbstractC6635w.e("LoadTask", "Unexpected exception handling load completed", e10);
                    m.this.f14331c = new h(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f14338e = iOException;
            int i12 = this.f14339f + 1;
            this.f14339f = i12;
            c cVarN = bVar.n(this.f14335b, jElapsedRealtime, j10, iOException, i12);
            if (cVarN.f14332a == 3) {
                m.this.f14331c = this.f14338e;
            } else if (cVarN.f14332a != 2) {
                if (cVarN.f14332a == 1) {
                    this.f14339f = 1;
                }
                f(cVarN.f14333b != -9223372036854775807L ? cVarN.f14333b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f14341h;
                    this.f14340g = Thread.currentThread();
                }
                if (!z10) {
                    P.a("load:" + this.f14335b.getClass().getSimpleName());
                    try {
                        this.f14335b.a();
                        P.b();
                    } catch (Throwable th2) {
                        P.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f14340g = null;
                    Thread.interrupted();
                }
                if (this.f14342i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f14342i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f14342i) {
                    return;
                }
                AbstractC6635w.e("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new h(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f14342i) {
                    return;
                }
                AbstractC6635w.e("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new h(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f14342i) {
                    AbstractC6635w.e("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void a();

        void c();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        void m();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a */
        private final f f14344a;

        public g(f fVar) {
            this.f14344a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14344a.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends IOException {
        public h(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    public m(String str) {
        this(R2.a.p0(a0.W0("ExoPlayer:Loader:" + str), new InterfaceC6627n() { // from class: Q2.l
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // Q2.n
    public void b() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC6614a.i(this.f14330b)).a(false);
    }

    public void g() {
        this.f14331c = null;
    }

    public boolean i() {
        return this.f14331c != null;
    }

    public boolean j() {
        return this.f14330b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f14331c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f14330b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f14334a;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f14330b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f14329a.execute(new g(fVar));
        }
        this.f14329a.a();
    }

    public long n(e eVar, b bVar, int i10) {
        Looper looper = (Looper) AbstractC6614a.i(Looper.myLooper());
        this.f14331c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    public m(R2.a aVar) {
        this.f14329a = aVar;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void h(e eVar, long j10, long j11, boolean z10);

        void j(e eVar, long j10, long j11);

        c n(e eVar, long j10, long j11, IOException iOException, int i10);

        default void v(e eVar, long j10, long j11, int i10) {
        }
    }
}
