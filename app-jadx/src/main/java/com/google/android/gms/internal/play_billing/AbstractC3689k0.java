package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3689k0 extends AbstractC3719q0 {
    protected AbstractC3689k0() {
    }

    static Object l(Object obj) throws ExecutionException {
        if (obj instanceof C3664f0) {
            Throwable th2 = ((C3664f0) obj).f40458b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (!(obj instanceof C3674h0)) {
            if (obj == AbstractC3719q0.f40535d) {
                return null;
            }
            return obj;
        }
        Throwable th3 = ((C3674h0) obj).f40466a;
        if (th3 != null) {
            throw new ExecutionException(th3);
        }
        AbstractC3719q0.f40536e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(C3674h0.f40465c.f40466a);
    }

    static boolean q(Object obj) {
        return !(obj instanceof RunnableC3669g0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object t(G0 g02) {
        Throwable thA;
        if (g02 instanceof InterfaceC3684j0) {
            Object c3664f0 = ((AbstractC3689k0) g02).f40539a;
            if (c3664f0 instanceof C3664f0) {
                C3664f0 c3664f02 = (C3664f0) c3664f0;
                if (c3664f02.f40457a) {
                    Throwable th2 = c3664f02.f40458b;
                    c3664f0 = th2 != null ? new C3664f0(false, th2) : C3664f0.f40456d;
                }
            }
            Objects.requireNonNull(c3664f0);
            return c3664f0;
        }
        if ((g02 instanceof N0) && (thA = ((N0) g02).a()) != null) {
            return new C3674h0(thA);
        }
        boolean zIsCancelled = g02.isCancelled();
        if ((!AbstractC3719q0.f40537f) && zIsCancelled) {
            C3664f0 c3664f03 = C3664f0.f40456d;
            Objects.requireNonNull(c3664f03);
            return c3664f03;
        }
        try {
            Object objU = u(g02);
            if (!zIsCancelled) {
                return objU == null ? AbstractC3719q0.f40535d : objU;
            }
            return new C3664f0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(g02)));
        } catch (Error | Exception e10) {
            return new C3674h0(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new C3674h0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(g02)), e11)) : new C3664f0(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new C3664f0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(g02)), e12)) : new C3674h0(e12.getCause());
        }
    }

    private static Object u(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void v(StringBuilder sb2) {
        try {
            Object objU = u(this);
            sb2.append("SUCCESS, result=[");
            if (objU == null) {
                sb2.append("null");
            } else if (objU == this) {
                sb2.append("this future");
            } else {
                sb2.append(objU.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objU)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    public static void w(AbstractC3689k0 abstractC3689k0, boolean z10) {
        C3679i0 c3679i0;
        C3679i0 c3679i02 = null;
        while (true) {
            abstractC3689k0.g();
            abstractC3689k0.o();
            C3679i0 c3679i03 = c3679i02;
            C3679i0 c3679i0C = abstractC3689k0.c(C3679i0.f40473d);
            C3679i0 c3679i04 = c3679i03;
            while (c3679i0C != null) {
                C3679i0 c3679i05 = c3679i0C.f40476c;
                c3679i0C.f40476c = c3679i04;
                c3679i04 = c3679i0C;
                c3679i0C = c3679i05;
            }
            while (c3679i04 != null) {
                Runnable runnable = c3679i04.f40474a;
                c3679i0 = c3679i04.f40476c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC3669g0) {
                    RunnableC3669g0 runnableC3669g0 = (RunnableC3669g0) runnable2;
                    abstractC3689k0 = runnableC3669g0.f40459a;
                    if (abstractC3689k0.f40539a != runnableC3669g0 || !AbstractC3719q0.i(abstractC3689k0, runnableC3669g0, t(runnableC3669g0.f40460b))) {
                    }
                } else {
                    Executor executor = c3679i04.f40475b;
                    Objects.requireNonNull(executor);
                    x(runnable2, executor);
                }
                c3679i04 = c3679i0;
            }
            return;
            c3679i02 = c3679i0;
        }
    }

    private static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            AbstractC3719q0.f40536e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    protected final Throwable a() {
        if (!(this instanceof InterfaceC3684j0)) {
            return null;
        }
        Object obj = this.f40539a;
        if (obj instanceof C3674h0) {
            return ((C3674h0) obj).f40466a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f40539a
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.RunnableC3669g0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.play_billing.AbstractC3719q0.f40537f
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.play_billing.f0 r1 = new com.google.android.gms.internal.play_billing.f0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.play_billing.f0 r1 = com.google.android.gms.internal.play_billing.C3664f0.f40455c
            goto L26
        L24:
            com.google.android.gms.internal.play_billing.f0 r1 = com.google.android.gms.internal.play_billing.C3664f0.f40456d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = com.google.android.gms.internal.play_billing.AbstractC3719q0.i(r4, r0, r1)
            if (r6 == 0) goto L56
            w(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.RunnableC3669g0
            if (r4 == 0) goto L55
            com.google.android.gms.internal.play_billing.g0 r0 = (com.google.android.gms.internal.play_billing.RunnableC3669g0) r0
            com.google.android.gms.internal.play_billing.G0 r0 = r0.f40460b
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.InterfaceC3684j0
            if (r4 == 0) goto L52
            r4 = r0
            com.google.android.gms.internal.play_billing.k0 r4 = (com.google.android.gms.internal.play_billing.AbstractC3689k0) r4
            java.lang.Object r0 = r4.f40539a
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.RunnableC3669g0
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.f40539a
            boolean r6 = q(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC3689k0.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return d();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40539a instanceof C3664f0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f40539a;
        return (obj != null) & q(obj);
    }

    protected abstract String m();

    protected abstract void o();

    @Override // com.google.android.gms.internal.play_billing.G0
    public final void p(Runnable runnable, Executor executor) {
        C3679i0 c3679i0;
        A.c(executor, "Executor was null.");
        if (!isDone() && (c3679i0 = this.f40540b) != C3679i0.f40473d) {
            C3679i0 c3679i02 = new C3679i0(runnable, executor);
            do {
                c3679i02.f40476c = c3679i0;
                if (h(c3679i0, c3679i02)) {
                    return;
                } else {
                    c3679i0 = this.f40540b;
                }
            } while (c3679i0 != C3679i0.f40473d);
        }
        x(runnable, executor);
    }

    protected final boolean r(Throwable th2) {
        if (!AbstractC3719q0.i(this, null, new C3674h0(th2))) {
            return false;
        }
        w(this, false);
        return true;
    }

    protected final boolean s(G0 g02) {
        C3674h0 c3674h0;
        Object obj = this.f40539a;
        if (obj == null) {
            if (g02.isDone()) {
                if (!AbstractC3719q0.i(this, null, t(g02))) {
                    return false;
                }
                w(this, false);
                return true;
            }
            RunnableC3669g0 runnableC3669g0 = new RunnableC3669g0(this, g02);
            if (AbstractC3719q0.i(this, null, runnableC3669g0)) {
                try {
                    g02.p(runnableC3669g0, EnumC3747w0.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        c3674h0 = new C3674h0(th2);
                    } catch (Error | Exception unused) {
                        c3674h0 = C3674h0.f40464b;
                    }
                    AbstractC3719q0.i(this, runnableC3669g0, c3674h0);
                }
                return true;
            }
            obj = this.f40539a;
        }
        if (obj instanceof C3664f0) {
            g02.cancel(((C3664f0) obj).f40457a);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC3689k0.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return e(j10, timeUnit);
    }
}
