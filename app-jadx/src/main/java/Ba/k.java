package ba;

import R8.AbstractC2115p;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f33239f = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f33240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f33241b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f33242c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33243d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f33244e = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f33245a;

        a(Runnable runnable) {
            this.f33245a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33245a.run();
        }

        public String toString() {
            return this.f33245a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f33247a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f33247a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            ba.k.f33239f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f33247a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f33247a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                ba.k r2 = ba.k.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = ba.k.b(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                ba.k r0 = ba.k.this     // Catch: java.lang.Throwable -> L20
                ba.k$c r0 = ba.k.c(r0)     // Catch: java.lang.Throwable -> L20
                ba.k$c r3 = ba.k.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                ba.k r0 = ba.k.this     // Catch: java.lang.Throwable -> L20
                ba.k.e(r0)     // Catch: java.lang.Throwable -> L20
                ba.k r0 = ba.k.this     // Catch: java.lang.Throwable -> L20
                ba.k.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                ba.k r3 = ba.k.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = ba.k.b(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f33247a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                ba.k r0 = ba.k.this     // Catch: java.lang.Throwable -> L20
                ba.k$c r3 = ba.k.c.IDLE     // Catch: java.lang.Throwable -> L20
                ba.k.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f33247a     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f33247a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = ba.k.f()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f33247a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f33247a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.k.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f33241b) {
                    k.this.f33242c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f33247a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k.this.f33242c + "}";
        }

        /* synthetic */ b(k kVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k(Executor executor) {
        this.f33240a = (Executor) AbstractC2115p.l(executor);
    }

    static /* synthetic */ long e(k kVar) {
        long j10 = kVar.f33243d;
        kVar.f33243d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            R8.AbstractC2115p.l(r8)
            java.util.Deque r0 = r7.f33241b
            monitor-enter(r0)
            ba.k$c r1 = r7.f33242c     // Catch: java.lang.Throwable -> L6d
            ba.k$c r2 = ba.k.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            ba.k$c r2 = ba.k.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f33243d     // Catch: java.lang.Throwable -> L6d
            ba.k$a r1 = new ba.k$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f33241b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            ba.k$c r8 = ba.k.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f33242c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f33240a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            ba.k$b r5 = r7.f33244e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            ba.k$c r0 = r7.f33242c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f33241b
            monitor-enter(r0)
            long r5 = r7.f33243d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            ba.k$c r1 = r7.f33242c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f33242c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f33241b
            monitor-enter(r2)
            ba.k$c r0 = r7.f33242c     // Catch: java.lang.Throwable -> L55
            ba.k$c r3 = ba.k.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            ba.k$c r3 = ba.k.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f33241b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f33241b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.k.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f33240a + "}";
    }
}
