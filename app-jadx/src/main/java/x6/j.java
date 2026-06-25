package x6;

import Td.L;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r5.InterfaceC6271a;
import s5.InterfaceC6433d;
import u4.C6736f;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f63961h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Class f63962i = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t5.k f63963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B5.i f63964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B5.l f63965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f63966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f63967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f63968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f63969g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(t5.k fileCache, B5.i pooledByteBufferFactory, B5.l pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        AbstractC5504s.h(fileCache, "fileCache");
        AbstractC5504s.h(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC5504s.h(pooledByteStreams, "pooledByteStreams");
        AbstractC5504s.h(readExecutor, "readExecutor");
        AbstractC5504s.h(writeExecutor, "writeExecutor");
        AbstractC5504s.h(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f63963a = fileCache;
        this.f63964b = pooledByteBufferFactory;
        this.f63965c = pooledByteStreams;
        this.f63966d = readExecutor;
        this.f63967e = writeExecutor;
        this.f63968f = imageCacheStatsTracker;
        C cD = C.d();
        AbstractC5504s.g(cD, "getInstance(...)");
        this.f63969g = cD;
    }

    private final boolean g(InterfaceC6433d interfaceC6433d) {
        E6.k kVarC = this.f63969g.c(interfaceC6433d);
        if (kVarC != null) {
            kVarC.close();
            AbstractC7283a.y(f63962i, "Found image for %s in staging area", interfaceC6433d.a());
            this.f63968f.e(interfaceC6433d);
            return true;
        }
        AbstractC7283a.y(f63962i, "Did not find image for %s in staging area", interfaceC6433d.a());
        this.f63968f.j(interfaceC6433d);
        try {
            return this.f63963a.f(interfaceC6433d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j this$0) {
        AbstractC5504s.h(this$0, "this$0");
        Object objE = F6.a.e(obj, null);
        try {
            this$0.f63969g.a();
            this$0.f63963a.a();
            return null;
        } finally {
        }
    }

    private final C6736f l(InterfaceC6433d interfaceC6433d, E6.k kVar) {
        AbstractC7283a.y(f63962i, "Found image for %s in staging area", interfaceC6433d.a());
        this.f63968f.e(interfaceC6433d);
        C6736f c6736fH = C6736f.h(kVar);
        AbstractC5504s.g(c6736fH, "forResult(...)");
        return c6736fH;
    }

    private final C6736f n(final InterfaceC6433d interfaceC6433d, final AtomicBoolean atomicBoolean) {
        try {
            final Object objD = F6.a.d("BufferedDiskCache_getAsync");
            return C6736f.b(new Callable() { // from class: x6.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.o(objD, atomicBoolean, this, interfaceC6433d);
                }
            }, this.f63966d);
        } catch (Exception e10) {
            AbstractC7283a.H(f63962i, e10, "Failed to schedule disk-cache read for %s", interfaceC6433d.a());
            return C6736f.g(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E6.k o(Object obj, AtomicBoolean isCancelled, j this$0, InterfaceC6433d key) {
        AbstractC5504s.h(isCancelled, "$isCancelled");
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(key, "$key");
        Object objE = F6.a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            E6.k kVarC = this$0.f63969g.c(key);
            if (kVarC != null) {
                AbstractC7283a.y(f63962i, "Found image for %s in staging area", key.a());
                this$0.f63968f.e(key);
            } else {
                AbstractC7283a.y(f63962i, "Did not find image for %s in staging area", key.a());
                this$0.f63968f.j(key);
                try {
                    B5.h hVarR = this$0.r(key);
                    if (hVarR == null) {
                        return null;
                    }
                    C5.a aVarJ = C5.a.J(hVarR);
                    AbstractC5504s.g(aVarJ, "of(...)");
                    try {
                        kVarC = new E6.k(aVarJ);
                    } finally {
                        C5.a.m(aVarJ);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return kVarC;
            }
            AbstractC7283a.x(f63962i, "Host thread was interrupted, decreasing reference count");
            kVarC.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                F6.a.c(obj, th2);
                throw th2;
            } finally {
                F6.a.f(objE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j this$0, InterfaceC6433d key, E6.k kVar) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(key, "$key");
        Object objE = F6.a.e(obj, null);
        try {
            this$0.u(key, kVar);
        } finally {
        }
    }

    private final B5.h r(InterfaceC6433d interfaceC6433d) throws IOException {
        try {
            Class cls = f63962i;
            AbstractC7283a.y(cls, "Disk cache read for %s", interfaceC6433d.a());
            InterfaceC6271a interfaceC6271aC = this.f63963a.c(interfaceC6433d);
            if (interfaceC6271aC == null) {
                AbstractC7283a.y(cls, "Disk cache miss for %s", interfaceC6433d.a());
                this.f63968f.k(interfaceC6433d);
                return null;
            }
            AbstractC7283a.y(cls, "Found entry in disk cache for %s", interfaceC6433d.a());
            this.f63968f.h(interfaceC6433d);
            InputStream inputStreamA = interfaceC6271aC.a();
            try {
                B5.h hVarB = this.f63964b.b(inputStreamA, (int) interfaceC6271aC.size());
                inputStreamA.close();
                AbstractC7283a.y(cls, "Successful read from disk cache for %s", interfaceC6433d.a());
                return hVarB;
            } catch (Throwable th2) {
                inputStreamA.close();
                throw th2;
            }
        } catch (IOException e10) {
            AbstractC7283a.H(f63962i, e10, "Exception reading from cache for %s", interfaceC6433d.a());
            this.f63968f.l(interfaceC6433d);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j this$0, InterfaceC6433d key) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(key, "$key");
        Object objE = F6.a.e(obj, null);
        try {
            this$0.f63969g.g(key);
            this$0.f63963a.e(key);
            return null;
        } finally {
        }
    }

    private final void u(InterfaceC6433d interfaceC6433d, final E6.k kVar) {
        Class cls = f63962i;
        AbstractC7283a.y(cls, "About to write to disk-cache for key %s", interfaceC6433d.a());
        try {
            this.f63963a.d(interfaceC6433d, new s5.j() { // from class: x6.i
                @Override // s5.j
                public final void a(OutputStream outputStream) {
                    j.v(kVar, this, outputStream);
                }
            });
            this.f63968f.c(interfaceC6433d);
            AbstractC7283a.y(cls, "Successful disk-cache write for key %s", interfaceC6433d.a());
        } catch (IOException e10) {
            AbstractC7283a.H(f63962i, e10, "Failed to write to disk-cache for key %s", interfaceC6433d.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(E6.k kVar, j this$0, OutputStream os) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(os, "os");
        AbstractC5504s.e(kVar);
        InputStream inputStreamQ = kVar.q();
        if (inputStreamQ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f63965c.a(inputStreamQ, os);
    }

    public final void f(InterfaceC6433d key) {
        AbstractC5504s.h(key, "key");
        this.f63963a.g(key);
    }

    public final C6736f h() {
        this.f63969g.a();
        final Object objD = F6.a.d("BufferedDiskCache_clearAll");
        try {
            return C6736f.b(new Callable() { // from class: x6.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.i(objD, this);
                }
            }, this.f63967e);
        } catch (Exception e10) {
            AbstractC7283a.H(f63962i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return C6736f.g(e10);
        }
    }

    public final boolean j(InterfaceC6433d key) {
        AbstractC5504s.h(key, "key");
        return this.f63969g.b(key) || this.f63963a.b(key);
    }

    public final boolean k(InterfaceC6433d key) {
        AbstractC5504s.h(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final C6736f m(InterfaceC6433d key, AtomicBoolean isCancelled) {
        C6736f c6736fN;
        C6736f c6736fL;
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(isCancelled, "isCancelled");
        if (!L6.b.d()) {
            E6.k kVarC = this.f63969g.c(key);
            return (kVarC == null || (c6736fL = l(key, kVarC)) == null) ? n(key, isCancelled) : c6736fL;
        }
        L6.b.a("BufferedDiskCache#get");
        try {
            E6.k kVarC2 = this.f63969g.c(key);
            if (kVarC2 == null || (c6736fN = l(key, kVarC2)) == null) {
                c6736fN = n(key, isCancelled);
            }
            L6.b.b();
            return c6736fN;
        } catch (Throwable th2) {
            L6.b.b();
            throw th2;
        }
    }

    public final void p(final InterfaceC6433d key, E6.k encodedImage) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(encodedImage, "encodedImage");
        if (!L6.b.d()) {
            if (!E6.k.Y(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f63969g.f(key, encodedImage);
            final E6.k kVarB = E6.k.b(encodedImage);
            try {
                final Object objD = F6.a.d("BufferedDiskCache_putAsync");
                this.f63967e.execute(new Runnable() { // from class: x6.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD, this, key, kVarB);
                    }
                });
                return;
            } catch (Exception e10) {
                AbstractC7283a.H(f63962i, e10, "Failed to schedule disk-cache write for %s", key.a());
                this.f63969g.h(key, encodedImage);
                E6.k.g(kVarB);
                return;
            }
        }
        L6.b.a("BufferedDiskCache#put");
        try {
            if (!E6.k.Y(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f63969g.f(key, encodedImage);
            final E6.k kVarB2 = E6.k.b(encodedImage);
            try {
                final Object objD2 = F6.a.d("BufferedDiskCache_putAsync");
                this.f63967e.execute(new Runnable() { // from class: x6.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD2, this, key, kVarB2);
                    }
                });
            } catch (Exception e11) {
                AbstractC7283a.H(f63962i, e11, "Failed to schedule disk-cache write for %s", key.a());
                this.f63969g.h(key, encodedImage);
                E6.k.g(kVarB2);
            }
            L l10 = L.f17438a;
        } finally {
            L6.b.b();
        }
    }

    public final C6736f s(final InterfaceC6433d key) {
        AbstractC5504s.h(key, "key");
        this.f63969g.g(key);
        try {
            final Object objD = F6.a.d("BufferedDiskCache_remove");
            return C6736f.b(new Callable() { // from class: x6.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.t(objD, this, key);
                }
            }, this.f63967e);
        } catch (Exception e10) {
            AbstractC7283a.H(f63962i, e10, "Failed to schedule disk-cache remove for %s", key.a());
            return C6736f.g(e10);
        }
    }
}
