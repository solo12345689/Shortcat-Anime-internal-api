package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f43471i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M f43473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f43474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f43475d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f43477f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f43479h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f43476e = new C6551a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43478g = false;

    private j0(FirebaseMessaging firebaseMessaging, M m10, h0 h0Var, H h10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f43475d = firebaseMessaging;
        this.f43473b = m10;
        this.f43479h = h0Var;
        this.f43474c = h10;
        this.f43472a = context;
        this.f43477f = scheduledExecutorService;
    }

    public static /* synthetic */ j0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, M m10, H h10) {
        return new j0(firebaseMessaging, m10, h0.b(context, scheduledExecutorService), h10, context, scheduledExecutorService);
    }

    private void b(g0 g0Var, n9.j jVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f43476e) {
            try {
                String strE = g0Var.e();
                if (this.f43476e.containsKey(strE)) {
                    arrayDeque = (ArrayDeque) this.f43476e.get(strE);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f43476e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void c(n9.i iVar) throws IOException {
        try {
            n9.l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void d(String str) throws IOException {
        c(this.f43474c.m(this.f43475d.o(), str));
    }

    private void e(String str) throws IOException {
        c(this.f43474c.n(this.f43475d.o(), str));
    }

    static n9.i f(final FirebaseMessaging firebaseMessaging, final M m10, final H h10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return n9.l.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j0.a(context, scheduledExecutorService, firebaseMessaging, m10, h10);
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void j(g0 g0Var) {
        synchronized (this.f43476e) {
            try {
                String strE = g0Var.e();
                if (this.f43476e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f43476e.get(strE);
                    n9.j jVar = (n9.j) arrayDeque.poll();
                    if (jVar != null) {
                        jVar.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f43476e.remove(strE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o() {
        if (i()) {
            return;
        }
        s(0L);
    }

    boolean g() {
        return this.f43479h.c() != null;
    }

    synchronized boolean i() {
        return this.f43478g;
    }

    boolean k(g0 g0Var) throws IOException {
        try {
            String strB = g0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    e(g0Var.c());
                    if (!h()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + g0Var.c() + " succeeded.");
                    return true;
                }
            } else if (strB.equals("S")) {
                d(g0Var.c());
                if (!h()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + g0Var.c() + " succeeded.");
                return true;
            }
            if (!h()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + g0Var + ".");
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    void l(Runnable runnable, long j10) {
        this.f43477f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    n9.i m(g0 g0Var) {
        this.f43479h.a(g0Var);
        n9.j jVar = new n9.j();
        b(g0Var, jVar);
        return jVar.a();
    }

    synchronized void n(boolean z10) {
        this.f43478g = z10;
    }

    void p() {
        if (g()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n9.i q(String str) {
        n9.i iVarM = m(g0.f(str));
        p();
        return iVarM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean r() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.h0 r0 = r2.f43479h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.g0 r0 = r0.c()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = h()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.h0 r1 = r2.f43479h
            r1.e(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.j0.r():boolean");
    }

    void s(long j10) {
        l(new k0(this, this.f43472a, this.f43473b, Math.min(Math.max(30L, 2 * j10), f43471i)), j10);
        n(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n9.i t(String str) {
        n9.i iVarM = m(g0.g(str));
        p();
        return iVarM;
    }
}
