package jg;

import Td.L;
import fg.AbstractC4807e;
import ig.AbstractC5097a;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import jg.e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f51901f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f51903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ig.d f51904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f51905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f51906e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5097a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // ig.AbstractC5097a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(ig.e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        AbstractC5504s.h(taskRunner, "taskRunner");
        AbstractC5504s.h(timeUnit, "timeUnit");
        this.f51902a = i10;
        this.f51903b = timeUnit.toNanos(j10);
        this.f51904c = taskRunner.i();
        this.f51905d = new b(AbstractC4807e.f47070i + " ConnectionPool");
        this.f51906e = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int d(f fVar, long j10) {
        if (AbstractC4807e.f47069h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference reference = (Reference) listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                AbstractC5504s.f(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                og.j.f55583a.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i10);
                fVar.D(true);
                if (listN.isEmpty()) {
                    fVar.C(j10 - this.f51903b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(dg.C4620a r4, jg.e r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f51906e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            jg.f r1 = (jg.f) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.AbstractC5504s.g(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.v()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.t(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.d(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            Td.L r2 = Td.L.f17438a     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.g.a(dg.a, jg.e, java.util.List, boolean):boolean");
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f51906e) {
            AbstractC5504s.g(connection, "connection");
            synchronized (connection) {
                if (d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jO = j10 - connection.o();
                    if (jO > j11) {
                        fVar = connection;
                        j11 = jO;
                    }
                    L l10 = L.f17438a;
                }
            }
        }
        long j12 = this.f51903b;
        if (j11 < j12 && i10 <= this.f51902a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        AbstractC5504s.e(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.D(true);
            this.f51906e.remove(fVar);
            AbstractC4807e.n(fVar.E());
            if (this.f51906e.isEmpty()) {
                this.f51904c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        AbstractC5504s.h(connection, "connection");
        if (AbstractC4807e.f47069h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.f51902a != 0) {
            ig.d.j(this.f51904c, this.f51905d, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.f51906e.remove(connection);
        if (this.f51906e.isEmpty()) {
            this.f51904c.a();
        }
        return true;
    }

    public final void e(f connection) {
        AbstractC5504s.h(connection, "connection");
        if (!AbstractC4807e.f47069h || Thread.holdsLock(connection)) {
            this.f51906e.add(connection);
            ig.d.j(this.f51904c, this.f51905d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
