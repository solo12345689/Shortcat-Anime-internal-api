package com.google.android.gms.common.api.internal;

import P8.f;
import P8.h;
import P8.k;
import R8.AbstractC2115p;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePendingResult<R extends k> extends h {
    static final ThreadLocal zaa = new b();
    protected final a zab;
    protected final WeakReference zac;
    private k zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends d9.h {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                android.support.v4.media.session.b.a(pair.first);
                k kVar = (k) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(kVar);
                    throw e10;
                }
            }
            if (i10 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f38936i);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
        }
    }

    protected BasePendingResult(f fVar) {
        this.zab = new a(fVar != null ? fVar.d() : Looper.getMainLooper());
        this.zac = new WeakReference(fVar);
    }

    private final k b() {
        k kVar;
        synchronized (this.zae) {
            AbstractC2115p.p(!this.zal, "Result has already been consumed.");
            AbstractC2115p.p(isReady(), "Result is not ready.");
            kVar = this.zaj;
            this.zaj = null;
            this.zal = true;
        }
        android.support.v4.media.session.b.a(this.zai.getAndSet(null));
        return (k) AbstractC2115p.l(kVar);
    }

    private final void c(k kVar) {
        this.zaj = kVar;
        this.zak = kVar.b();
        this.zaf.countDown();
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    protected abstract k a(Status status);

    @Override // P8.h
    public final void addStatusListener(h.a aVar) {
        AbstractC2115p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // P8.h
    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            AbstractC2115p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC2115p.p(!this.zal, "Result has already been consumed.");
        AbstractC2115p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f38936i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f38934g);
        }
        AbstractC2115p.p(isReady(), "Result is not ready.");
        return (R) b();
    }

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(a(status));
                    this.zan = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                AbstractC2115p.p(!isReady(), "Results have already been set");
                AbstractC2115p.p(!this.zal, "Result has already been consumed");
                c(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public static void zal(k kVar) {
    }
}
