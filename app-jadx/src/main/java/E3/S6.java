package E3;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import t.C6551a;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class S6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4954b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f4956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f4957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4958f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4953a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6551a f4955c = new C6551a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends com.google.common.util.concurrent.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f4959h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Object f4960i;

        private a(int i10, Object obj) {
            this.f4959h = i10;
            this.f4960i = obj;
        }

        public static a J(int i10, Object obj) {
            return new a(i10, obj);
        }

        @Override // com.google.common.util.concurrent.a
        public boolean F(Object obj) {
            return super.F(obj);
        }

        public Object K() {
            return this.f4960i;
        }

        public int L() {
            return this.f4959h;
        }

        public void M() {
            F(this.f4960i);
        }
    }

    public a a(Object obj) {
        a aVarJ;
        synchronized (this.f4953a) {
            try {
                int iC = c();
                aVarJ = a.J(iC, obj);
                if (this.f4958f) {
                    aVarJ.M();
                } else {
                    this.f4955c.put(Integer.valueOf(iC), aVarJ);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarJ;
    }

    public void b(long j10, Runnable runnable) {
        synchronized (this.f4953a) {
            try {
                Handler handlerC = t2.a0.C();
                this.f4957e = handlerC;
                this.f4956d = runnable;
                if (this.f4955c.isEmpty()) {
                    d();
                } else {
                    handlerC.postDelayed(new Runnable() { // from class: E3.R6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4900a.d();
                        }
                    }, j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int c() {
        int i10;
        synchronized (this.f4953a) {
            i10 = this.f4954b;
            this.f4954b = i10 + 1;
        }
        return i10;
    }

    public void d() {
        ArrayList arrayList;
        synchronized (this.f4953a) {
            try {
                this.f4958f = true;
                arrayList = new ArrayList(this.f4955c.values());
                this.f4955c.clear();
                if (this.f4956d != null) {
                    ((Handler) AbstractC6614a.e(this.f4957e)).post(this.f4956d);
                    this.f4956d = null;
                    this.f4957e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).M();
        }
    }

    public void e(int i10, Object obj) {
        synchronized (this.f4953a) {
            try {
                a aVar = (a) this.f4955c.remove(Integer.valueOf(i10));
                if (aVar != null) {
                    if (aVar.K().getClass() == obj.getClass()) {
                        aVar.F(obj);
                    } else {
                        AbstractC6635w.i("SequencedFutureManager", "Type mismatch, expected " + aVar.K().getClass() + ", but was " + obj.getClass());
                    }
                }
                if (this.f4956d != null && this.f4955c.isEmpty()) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
