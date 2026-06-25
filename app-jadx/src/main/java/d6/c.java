package d6;

import Td.L;
import a6.InterfaceC2580a;
import android.graphics.Bitmap;
import android.util.SparseArray;
import b6.InterfaceC3025b;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w6.d f45021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b6.c f45022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f45023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f45024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f45025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f45026f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2580a f45027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3025b f45028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f45030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f45031e;

        public a(c cVar, InterfaceC2580a animationBackend, InterfaceC3025b bitmapFrameCache, int i10, int i11) {
            AbstractC5504s.h(animationBackend, "animationBackend");
            AbstractC5504s.h(bitmapFrameCache, "bitmapFrameCache");
            this.f45031e = cVar;
            this.f45027a = animationBackend;
            this.f45028b = bitmapFrameCache;
            this.f45029c = i10;
            this.f45030d = i11;
        }

        private final boolean a(int i10, int i11) {
            C5.a aVarK;
            int i12 = 2;
            try {
                if (i11 == 1) {
                    aVarK = this.f45028b.K(i10, this.f45027a.e(), this.f45027a.c());
                } else {
                    if (i11 != 2) {
                        return false;
                    }
                    aVarK = this.f45031e.f45021a.b(this.f45027a.e(), this.f45027a.c(), this.f45031e.f45023c);
                    i12 = -1;
                }
                C5.a aVar = aVarK;
                boolean zB = b(i10, aVar, i11);
                C5.a.m(aVar);
                return (zB || i12 == -1) ? zB : a(i10, i12);
            } catch (RuntimeException e10) {
                AbstractC7283a.F(this.f45031e.f45025e, "Failed to create frame bitmap", e10);
                return false;
            } finally {
                C5.a.m(null);
            }
        }

        private final boolean b(int i10, C5.a aVar, int i11) {
            if (C5.a.H(aVar) && aVar != null) {
                b6.c cVar = this.f45031e.f45022b;
                Object objC = aVar.C();
                AbstractC5504s.g(objC, "get(...)");
                if (cVar.a(i10, (Bitmap) objC)) {
                    AbstractC7283a.y(this.f45031e.f45025e, "Frame %d ready.", Integer.valueOf(i10));
                    synchronized (this.f45031e.f45026f) {
                        this.f45028b.I(i10, aVar, i11);
                        L l10 = L.f17438a;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f45028b.H(this.f45029c)) {
                    AbstractC7283a.y(this.f45031e.f45025e, "Frame %d is cached already.", Integer.valueOf(this.f45029c));
                    SparseArray sparseArray = this.f45031e.f45026f;
                    c cVar = this.f45031e;
                    synchronized (sparseArray) {
                        cVar.f45026f.remove(this.f45030d);
                        L l10 = L.f17438a;
                    }
                    return;
                }
                if (a(this.f45029c, 1)) {
                    AbstractC7283a.y(this.f45031e.f45025e, "Prepared frame %d.", Integer.valueOf(this.f45029c));
                } else {
                    AbstractC7283a.k(this.f45031e.f45025e, "Could not prepare frame %d.", Integer.valueOf(this.f45029c));
                }
                SparseArray sparseArray2 = this.f45031e.f45026f;
                c cVar2 = this.f45031e;
                synchronized (sparseArray2) {
                    cVar2.f45026f.remove(this.f45030d);
                    L l11 = L.f17438a;
                }
            } catch (Throwable th2) {
                SparseArray sparseArray3 = this.f45031e.f45026f;
                c cVar3 = this.f45031e;
                synchronized (sparseArray3) {
                    cVar3.f45026f.remove(this.f45030d);
                    L l12 = L.f17438a;
                    throw th2;
                }
            }
        }
    }

    public c(w6.d platformBitmapFactory, b6.c bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        AbstractC5504s.h(platformBitmapFactory, "platformBitmapFactory");
        AbstractC5504s.h(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC5504s.h(bitmapConfig, "bitmapConfig");
        AbstractC5504s.h(executorService, "executorService");
        this.f45021a = platformBitmapFactory;
        this.f45022b = bitmapFrameRenderer;
        this.f45023c = bitmapConfig;
        this.f45024d = executorService;
        this.f45025e = c.class;
        this.f45026f = new SparseArray();
    }

    private final int g(InterfaceC2580a interfaceC2580a, int i10) {
        return (interfaceC2580a.hashCode() * 31) + i10;
    }

    @Override // d6.b
    public boolean a(InterfaceC3025b bitmapFrameCache, InterfaceC2580a animationBackend, int i10) throws Throwable {
        Throwable th2;
        AbstractC5504s.h(bitmapFrameCache, "bitmapFrameCache");
        AbstractC5504s.h(animationBackend, "animationBackend");
        int iG = g(animationBackend, i10);
        synchronized (this.f45026f) {
            try {
                try {
                    if (this.f45026f.get(iG) != null) {
                        AbstractC7283a.y(this.f45025e, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                        return true;
                    }
                    if (bitmapFrameCache.H(i10)) {
                        AbstractC7283a.y(this.f45025e, "Frame %d is cached already.", Integer.valueOf(i10));
                        return true;
                    }
                    try {
                        a aVar = new a(this, animationBackend, bitmapFrameCache, i10, iG);
                        this.f45026f.put(iG, aVar);
                        this.f45024d.execute(aVar);
                        L l10 = L.f17438a;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th2 = th;
            throw th2;
        }
    }
}
