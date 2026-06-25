package Nf;

import Gf.AbstractC1601c;
import Gf.T;
import Lf.E;
import Lf.z;
import Td.L;
import Td.r;
import be.AbstractC3048a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final C0202a f12829h = new C0202a(null);

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ AtomicLongFieldUpdater f12830i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j */
    private static final /* synthetic */ AtomicLongFieldUpdater f12831j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12832k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l */
    public static final E f12833l = new E("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f12834a;

    /* JADX INFO: renamed from: b */
    public final int f12835b;

    /* JADX INFO: renamed from: c */
    public final long f12836c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f12837d;

    /* JADX INFO: renamed from: e */
    public final Nf.d f12838e;

    /* JADX INFO: renamed from: f */
    public final Nf.d f12839f;

    /* JADX INFO: renamed from: g */
    public final z f12840g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: Nf.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0202a {
        public /* synthetic */ C0202a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0202a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12841a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f12853c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f12852b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f12851a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f12854d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f12855e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12841a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f12851a = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: b */
        public static final d f12852b = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: c */
        public static final d f12853c = new d("PARKING", 2);

        /* JADX INFO: renamed from: d */
        public static final d f12854d = new d("DORMANT", 3);

        /* JADX INFO: renamed from: e */
        public static final d f12855e = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ d[] f12856f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f12857g;

        static {
            d[] dVarArrA = a();
            f12856f = dVarArrA;
            f12857g = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f12851a, f12852b, f12853c, f12854d, f12855e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f12856f.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f12834a = i10;
        this.f12835b = i11;
        this.f12836c = j10;
        this.f12837d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f12838e = new Nf.d();
            this.f12839f = new Nf.d();
            this.f12840g = new z((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final boolean B0(long j10) {
        if (AbstractC5874j.e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f12834a) {
            int iH = h();
            if (iH == 1 && this.f12834a > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    private final int C(c cVar) {
        Object objG = cVar.g();
        while (objG != f12833l) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    private final c D() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12830i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f12840g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iC = C(cVar);
            if (iC >= 0 && f12830i.compareAndSet(this, j10, ((long) iC) | j11)) {
                cVar.o(f12833l);
                return cVar;
            }
        }
    }

    static /* synthetic */ boolean F0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f12831j.get(aVar);
        }
        return aVar.B0(j10);
    }

    private final boolean G0() {
        c cVarD;
        do {
            cVarD = D();
            if (cVarD == null) {
                return false;
            }
        } while (!c.f12842i.compareAndSet(cVarD, -1, 0));
        LockSupport.unpark(cVarD);
        return true;
    }

    private final void Y(long j10) {
        if (G0() || B0(j10)) {
            return;
        }
        G0();
    }

    private final boolean g(h hVar) {
        return hVar.f12868b ? this.f12839f.a(hVar) : this.f12838e.a(hVar);
    }

    private final int h() {
        synchronized (this.f12840g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f12831j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iE = AbstractC5874j.e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iE >= this.f12834a) {
                    return 0;
                }
                if (i10 >= this.f12835b) {
                    return 0;
                }
                int i11 = ((int) (q().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f12840g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f12840g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f12831j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iE + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final c k() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC5504s.c(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final h k0(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f12845c) == d.f12855e) {
            return hVar;
        }
        if (!hVar.f12868b && dVar == d.f12852b) {
            return hVar;
        }
        cVar.f12849g = true;
        return cVar.f12843a.a(hVar, z10);
    }

    public static /* synthetic */ void o(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.l(runnable, z10, z11);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater q() {
        return f12831j;
    }

    public final boolean E(c cVar) {
        long j10;
        int iF;
        if (cVar.g() != f12833l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12830i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f12840g.b((int) (2097151 & j10)));
        } while (!f12830i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iF)));
        return true;
    }

    public final void H(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12830i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iC = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iC == i10) {
                iC = i11 == 0 ? C(cVar) : i11;
            }
            if (iC >= 0) {
                if (f12830i.compareAndSet(this, j10, j11 | ((long) iC))) {
                    return;
                }
            }
        }
    }

    public final void O(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                AbstractC1601c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = z()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            Nf.a$c r0 = r7.k()
            Lf.z r1 = r7.f12840g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = b()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            Lf.z r4 = r7.f12840g
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.AbstractC5504s.e(r4)
            Nf.a$c r4 = (Nf.a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            Nf.l r4 = r4.f12843a
            Nf.d r5 = r7.f12839f
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            Nf.d r8 = r7.f12839f
            r8.b()
            Nf.d r8 = r7.f12838e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            Nf.h r8 = r0.e(r2)
            if (r8 != 0) goto L8b
        L5f:
            Nf.d r8 = r7.f12838e
            java.lang.Object r8 = r8.e()
            Nf.h r8 = (Nf.h) r8
            if (r8 != 0) goto L8b
            Nf.d r8 = r7.f12839f
            java.lang.Object r8 = r8.e()
            Nf.h r8 = (Nf.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            Nf.a$d r8 = Nf.a.d.f12855e
            r0.r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = w()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = q()
            r8.set(r7, r0)
            return
        L8b:
            r7.O(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Nf.a.S(long):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        S(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        o(this, runnable, false, false, 6, null);
    }

    public final void h0() {
        if (G0() || F0(this, 0L, 1, null)) {
            return;
        }
        G0();
    }

    public final boolean isTerminated() {
        return f12832k.get(this) == 1;
    }

    public final h j(Runnable runnable, boolean z10) {
        long jA = j.f12875f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f12867a = jA;
        hVar.f12868b = z10;
        return hVar;
    }

    public final void l(Runnable runnable, boolean z10, boolean z11) {
        AbstractC1601c.a();
        h hVarJ = j(runnable, z10);
        boolean z12 = hVarJ.f12868b;
        long jAddAndGet = z12 ? f12831j.addAndGet(this, 2097152L) : 0L;
        h hVarK0 = k0(k(), hVarJ, z11);
        if (hVarK0 != null && !g(hVarK0)) {
            throw new RejectedExecutionException(this.f12837d + " was terminated");
        }
        if (z12) {
            Y(jAddAndGet);
        } else {
            h0();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f12840g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f12840g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f12843a.i();
                int i17 = b.f12841a[cVar.f12845c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new r();
                    }
                    i14++;
                }
            }
        }
        long j10 = f12831j.get(this);
        return this.f12837d + '@' + T.b(this) + "[Pool Size {core = " + this.f12834a + ", max = " + this.f12835b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f12838e.c() + ", global blocking queue size = " + this.f12839f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f12834a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class c extends Thread {

        /* JADX INFO: renamed from: i */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f12842i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a */
        public final l f12843a;

        /* JADX INFO: renamed from: b */
        private final N f12844b;

        /* JADX INFO: renamed from: c */
        public d f12845c;

        /* JADX INFO: renamed from: d */
        private long f12846d;

        /* JADX INFO: renamed from: e */
        private long f12847e;

        /* JADX INFO: renamed from: f */
        private int f12848f;

        /* JADX INFO: renamed from: g */
        public boolean f12849g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f12843a = new l();
            this.f12844b = new N();
            this.f12845c = d.f12854d;
            this.nextParkedWorker = a.f12833l;
            int iNanoTime = (int) System.nanoTime();
            this.f12848f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f12846d = 0L;
            if (this.f12845c == d.f12853c) {
                this.f12845c = d.f12852b;
            }
            if (!hVar.f12868b) {
                a.this.O(hVar);
                return;
            }
            if (r(d.f12852b)) {
                a.this.h0();
            }
            a.this.O(hVar);
            a.q().addAndGet(a.this, -2097152L);
            if (this.f12845c != d.f12855e) {
                this.f12845c = d.f12854d;
            }
        }

        private final h c(boolean z10) {
            h hVarL;
            h hVarL2;
            if (z10) {
                boolean z11 = j(a.this.f12834a * 2) == 0;
                if (z11 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f12843a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f12843a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f12839f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f12833l;
        }

        private final void k() {
            if (this.f12846d == 0) {
                this.f12846d = System.nanoTime() + a.this.f12836c;
            }
            LockSupport.parkNanos(a.this.f12836c);
            if (System.nanoTime() - this.f12846d >= 0) {
                this.f12846d = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f12838e.e();
                return hVar != null ? hVar : (h) a.this.f12839f.e();
            }
            h hVar2 = (h) a.this.f12839f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f12838e.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f12845c != d.f12855e) {
                    h hVarE = e(this.f12849g);
                    if (hVarE != null) {
                        this.f12847e = 0L;
                        b(hVarE);
                    } else {
                        this.f12849g = false;
                        if (this.f12847e == 0) {
                            q();
                        } else if (z10) {
                            r(d.f12853c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f12847e);
                            this.f12847e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            r(d.f12855e);
        }

        private final boolean p() {
            long j10;
            if (this.f12845c == d.f12851a) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterQ = a.q();
            do {
                j10 = atomicLongFieldUpdaterQ.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.q().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f12845c = d.f12851a;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.E(this);
                return;
            }
            f12842i.set(this, -1);
            while (i() && f12842i.get(this) == -1 && !a.this.isTerminated() && this.f12845c != d.f12855e) {
                r(d.f12853c);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.q().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f12840g.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f12843a.r(i10, this.f12844b);
                    if (jR == -1) {
                        N n10 = this.f12844b;
                        h hVar = (h) n10.f52259a;
                        n10.f52259a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f12847e = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f12840g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.q().get(aVar) & 2097151)) <= aVar.f12834a) {
                        return;
                    }
                    if (f12842i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.H(this, i10, 0);
                        int andDecrement = (int) (a.q().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f12840g.b(andDecrement);
                            AbstractC5504s.e(objB);
                            c cVar = (c) objB;
                            aVar.f12840g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.H(cVar, andDecrement, i10);
                        }
                        aVar.f12840g.c(andDecrement, null);
                        L l10 = L.f17438a;
                        this.f12845c = d.f12855e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f12848f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f12848f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f12837d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f12845c;
            boolean z10 = dVar2 == d.f12851a;
            if (z10) {
                a.q().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f12845c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
