package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3719q0 extends N0 implements G0 {

    /* JADX INFO: renamed from: d */
    static final Object f40535d = new Object();

    /* JADX INFO: renamed from: e */
    static final F0 f40536e = new F0(AbstractC3689k0.class);

    /* JADX INFO: renamed from: f */
    static final boolean f40537f;

    /* JADX INFO: renamed from: g */
    private static final AbstractC3694l0 f40538g;

    /* JADX INFO: renamed from: a */
    volatile Object f40539a;

    /* JADX INFO: renamed from: b */
    volatile C3679i0 f40540b;

    /* JADX INFO: renamed from: c */
    volatile C3714p0 f40541c;

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        AbstractC3694l0 c3704n0;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.f34641ag));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f40537f = z10;
        String property = System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                c3704n0 = new C3709o0(null);
            } catch (Error | Exception e10) {
                try {
                    c3704n0 = new C3699m0(null);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    c3704n0 = new C3704n0(null);
                }
            }
        } else {
            try {
                c3704n0 = new C3699m0(null);
            } catch (NoClassDefFoundError unused2) {
                c3704n0 = new C3704n0(null);
            }
        }
        th2 = null;
        th3 = null;
        f40538g = c3704n0;
        if (th2 != null) {
            F0 f02 = f40536e;
            Logger loggerA = f02.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            f02.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    AbstractC3719q0() {
    }

    private final void b(C3714p0 c3714p0) {
        c3714p0.f40530a = null;
        while (true) {
            C3714p0 c3714p02 = this.f40541c;
            if (c3714p02 != C3714p0.f40529c) {
                C3714p0 c3714p03 = null;
                while (c3714p02 != null) {
                    C3714p0 c3714p04 = c3714p02.f40531b;
                    if (c3714p02.f40530a != null) {
                        c3714p03 = c3714p02;
                    } else if (c3714p03 != null) {
                        c3714p03.f40531b = c3714p04;
                        if (c3714p03.f40530a == null) {
                            break;
                        }
                    } else if (!f40538g.g(this, c3714p02, c3714p04)) {
                        break;
                    }
                    c3714p02 = c3714p04;
                }
                return;
            }
            return;
        }
    }

    static boolean i(AbstractC3719q0 abstractC3719q0, Object obj, Object obj2) {
        return f40538g.f(abstractC3719q0, obj, obj2);
    }

    final C3679i0 c(C3679i0 c3679i0) {
        return f40538g.a(this, c3679i0);
    }

    final Object d() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f40539a;
        if ((obj2 != null) && AbstractC3689k0.q(obj2)) {
            return AbstractC3689k0.l(obj2);
        }
        C3714p0 c3714p0 = this.f40541c;
        if (c3714p0 != C3714p0.f40529c) {
            C3714p0 c3714p02 = new C3714p0();
            do {
                AbstractC3694l0 abstractC3694l0 = f40538g;
                abstractC3694l0.c(c3714p02, c3714p0);
                if (abstractC3694l0.g(this, c3714p0, c3714p02)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(c3714p02);
                            throw new InterruptedException();
                        }
                        obj = this.f40539a;
                    } while (!((obj != null) & AbstractC3689k0.q(obj)));
                    return AbstractC3689k0.l(obj);
                }
                c3714p0 = this.f40541c;
            } while (c3714p0 != C3714p0.f40529c);
        }
        Object obj3 = this.f40539a;
        Objects.requireNonNull(obj3);
        return AbstractC3689k0.l(obj3);
    }

    final Object e(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f40539a;
        boolean z10 = true;
        if ((obj != null) && AbstractC3689k0.q(obj)) {
            return AbstractC3689k0.l(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C3714p0 c3714p0 = this.f40541c;
            if (c3714p0 != C3714p0.f40529c) {
                C3714p0 c3714p02 = new C3714p0();
                do {
                    AbstractC3694l0 abstractC3694l0 = f40538g;
                    abstractC3694l0.c(c3714p02, c3714p0);
                    if (abstractC3694l0.g(this, c3714p0, c3714p02)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(c3714p02);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f40539a;
                            if ((obj2 != null) && AbstractC3689k0.q(obj2)) {
                                return AbstractC3689k0.l(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(c3714p02);
                    } else {
                        c3714p0 = this.f40541c;
                    }
                } while (c3714p0 != C3714p0.f40529c);
            }
            Object obj3 = this.f40539a;
            Objects.requireNonNull(obj3);
            return AbstractC3689k0.l(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f40539a;
            if ((obj4 != null) && AbstractC3689k0.q(obj4)) {
                return AbstractC3689k0.l(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z10) {
                    strConcat3 = strConcat3.concat(com.amazon.a.a.o.b.f.f34694a);
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z10) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    final void g() {
        for (C3714p0 c3714p0B = f40538g.b(this, C3714p0.f40529c); c3714p0B != null; c3714p0B = c3714p0B.f40531b) {
            Thread thread = c3714p0B.f40530a;
            if (thread != null) {
                c3714p0B.f40530a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final boolean h(C3679i0 c3679i0, C3679i0 c3679i02) {
        return f40538g.e(this, c3679i0, c3679i02);
    }
}
