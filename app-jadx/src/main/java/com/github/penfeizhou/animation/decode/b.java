package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.penfeizhou.animation.io.Reader;
import e8.C4657a;
import j8.InterfaceC5342b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f38744u = "b";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Rect f38745v = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5342b f38747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f38748c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38751f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f38753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f38754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f38755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f38756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f38757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f38758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Map f38759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ByteBuffer f38760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected volatile Rect f38761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.github.penfeizhou.animation.io.e f38762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Reader f38763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile k f38765t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List f38749d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f38750e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f38752g = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f38754i.get()) {
                return;
            }
            if (!b.this.q()) {
                b.this.U();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jT = b.this.T();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            b.this.f38748c.removeCallbacks(b.this.f38755j);
            b.this.f38748c.postDelayed(this, Math.max(0L, jT - jCurrentTimeMillis2));
            for (j jVar : b.this.f38753h) {
                ByteBuffer byteBuffer = b.this.f38760o;
                if (byteBuffer != null) {
                    jVar.a(byteBuffer);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC0635b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f38767a;

        RunnableC0635b(j jVar) {
            this.f38767a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f38753h.add(this.f38767a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f38769a;

        c(j jVar) {
            this.f38769a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f38753h.remove(this.f38769a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f38753h.size() == 0) {
                b.this.U();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread f38772a;

        e(Thread thread) {
            this.f38772a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (b.this.f38761p == null) {
                        if (b.this.f38763r == null) {
                            b bVar = b.this;
                            bVar.f38763r = bVar.A(bVar.f38747b.a());
                        } else {
                            b.this.f38763r.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.D(bVar2.K(bVar2.f38763r));
                    }
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    b.this.f38761p = b.f38745v;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    e.printStackTrace();
                    b.this.f38761p = b.f38745v;
                }
                LockSupport.unpark(this.f38772a);
            } catch (Throwable th2) {
                LockSupport.unpark(this.f38772a);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.E();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f38751f = 0;
            b bVar = b.this;
            bVar.f38750e = -1;
            bVar.f38764s = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38778b;

        i(int i10, boolean z10) {
            this.f38777a = i10;
            this.f38778b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
            try {
                b bVar = b.this;
                bVar.f38756k = this.f38777a;
                bVar.D(bVar.K(bVar.A(bVar.f38747b.a())));
                if (this.f38778b) {
                    b.this.E();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface j {
        void a(ByteBuffer byteBuffer);

        void b();

        void c();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public b(InterfaceC5342b interfaceC5342b, j jVar) {
        HashSet hashSet = new HashSet();
        this.f38753h = hashSet;
        this.f38754i = new AtomicBoolean(true);
        this.f38755j = new a();
        this.f38756k = 1;
        this.f38757l = new HashSet();
        this.f38758m = new Object();
        this.f38759n = new WeakHashMap();
        this.f38762q = C();
        this.f38763r = null;
        this.f38764s = false;
        this.f38765t = k.IDLE;
        this.f38747b = interfaceC5342b;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int iA = C4657a.b().a();
        this.f38746a = iA;
        this.f38748c = new Handler(C4657a.b().c(iA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Rect rect) {
        this.f38761p = rect;
        long jWidth = ((long) rect.width()) * ((long) rect.height());
        int i10 = this.f38756k;
        long j10 = ((jWidth / (((long) i10) * ((long) i10))) + 1) * 4;
        try {
            this.f38760o = ByteBuffer.allocate((int) j10);
            if (this.f38762q == null) {
                this.f38762q = C();
            }
        } catch (OutOfMemoryError e10) {
            Log.e(f38744u, String.format("OutOfMemoryError in FrameSeqDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j10 / 1048576.0d), Long.valueOf(j10)));
            this.f38760o = null;
            this.f38761p = f38745v;
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.f38754i.compareAndSet(true, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (w() == 0) {
                try {
                    Reader reader = this.f38763r;
                    if (reader == null) {
                        this.f38763r = A(this.f38747b.a());
                    } else {
                        reader.reset();
                    }
                    D(K(this.f38763r));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            String str = f38744u;
            Log.i(str, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f38765t = k.RUNNING;
            if (z() != 0 && this.f38764s) {
                Log.i(str, r() + " No need to started");
                return;
            }
            this.f38750e = -1;
            this.f38748c.removeCallbacks(this.f38755j);
            this.f38755j.run();
            Iterator it = this.f38753h.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        } catch (Throwable th3) {
            Log.i(f38744u, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f38765t = k.RUNNING;
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.f38748c.removeCallbacks(this.f38755j);
        this.f38749d.clear();
        synchronized (this.f38758m) {
            try {
                for (Bitmap bitmap : this.f38757l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f38757l.clear();
            } finally {
            }
        }
        if (this.f38760o != null) {
            this.f38760o = null;
        }
        this.f38759n.clear();
        try {
            Reader reader = this.f38763r;
            if (reader != null) {
                reader.close();
                this.f38763r = null;
            }
            com.github.penfeizhou.animation.io.e eVar = this.f38762q;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        M();
        this.f38765t = k.IDLE;
        Iterator it = this.f38753h.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        int i10 = this.f38750e + 1;
        this.f38750e = i10;
        if (i10 >= w()) {
            this.f38750e = 0;
            this.f38751f++;
        }
        com.github.penfeizhou.animation.decode.a aVarU = u(this.f38750e);
        if (aVarU == null) {
            return 0L;
        }
        O(aVarU);
        return aVarU.frameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (!H() || w() == 0) {
            return false;
        }
        if (z() <= 0 || this.f38751f < z() - 1) {
            return true;
        }
        if (this.f38751f == z() - 1 && this.f38750e < w() - 1) {
            return true;
        }
        this.f38764s = true;
        return false;
    }

    private String r() {
        return "";
    }

    private int z() {
        Integer num = this.f38752g;
        return num != null ? num.intValue() : x();
    }

    protected abstract Reader A(Reader reader);

    public int B() {
        return this.f38756k;
    }

    protected abstract com.github.penfeizhou.animation.io.e C();

    public boolean G() {
        return this.f38754i.get();
    }

    public boolean H() {
        return this.f38765t == k.RUNNING || this.f38765t == k.INITIALIZING;
    }

    protected Bitmap I(int i10, int i11) {
        synchronized (this.f38758m) {
            try {
                Iterator it = this.f38757l.iterator();
                Bitmap bitmapCreateBitmap = null;
                while (it.hasNext()) {
                    int i12 = i10 * i11 * 4;
                    Bitmap bitmap = (Bitmap) it.next();
                    if (bitmap != null && bitmap.getAllocationByteCount() >= i12) {
                        it.remove();
                        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
                            if (i10 > 0 && i11 > 0) {
                                bitmap.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                            }
                        }
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                    bitmapCreateBitmap = bitmap;
                }
                if (i10 <= 0 || i11 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void J() {
        this.f38748c.removeCallbacks(this.f38755j);
        this.f38754i.compareAndSet(false, true);
    }

    protected abstract Rect K(Reader reader);

    protected void L(Bitmap bitmap) {
        synchronized (this.f38758m) {
            if (bitmap != null) {
                try {
                    this.f38757l.add(bitmap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected abstract void M();

    public void N(j jVar) {
        this.f38748c.post(new c(jVar));
    }

    protected abstract void O(com.github.penfeizhou.animation.decode.a aVar);

    public void P() {
        this.f38748c.post(new h());
    }

    public void Q() {
        this.f38754i.compareAndSet(true, false);
        this.f38748c.removeCallbacks(this.f38755j);
        this.f38748c.post(this.f38755j);
    }

    public int R(int i10, int i11) {
        int iT = t(i10, i11);
        if (iT != B()) {
            boolean zH = H();
            this.f38748c.removeCallbacks(this.f38755j);
            this.f38748c.post(new i(iT, zH));
        }
        return iT;
    }

    public void S() {
        if (this.f38761p == f38745v) {
            return;
        }
        if (this.f38765t != k.RUNNING) {
            k kVar = this.f38765t;
            k kVar2 = k.INITIALIZING;
            if (kVar != kVar2) {
                if (this.f38765t == k.FINISHING) {
                    Log.e(f38744u, r() + " Processing,wait for finish at " + this.f38765t);
                }
                this.f38765t = kVar2;
                if (Looper.myLooper() == this.f38748c.getLooper()) {
                    E();
                    return;
                } else {
                    this.f38748c.post(new f());
                    return;
                }
            }
        }
        Log.i(f38744u, r() + " Already started");
    }

    public void U() {
        if (this.f38761p == f38745v) {
            return;
        }
        k kVar = this.f38765t;
        k kVar2 = k.FINISHING;
        if (kVar == kVar2 || this.f38765t == k.IDLE) {
            Log.i(f38744u, r() + "No need to stop");
            return;
        }
        if (this.f38765t == k.INITIALIZING) {
            Log.e(f38744u, r() + "Processing,wait for finish at " + this.f38765t);
        }
        this.f38765t = kVar2;
        if (Looper.myLooper() == this.f38748c.getLooper()) {
            F();
        } else {
            this.f38748c.post(new g());
        }
    }

    public void V() {
        this.f38748c.post(new d());
    }

    public void p(j jVar) {
        this.f38748c.post(new RunnableC0635b(jVar));
    }

    public Rect s() {
        if (this.f38761p == null) {
            if (this.f38765t == k.FINISHING) {
                Log.e(f38744u, "In finishing,do not interrupt");
            }
            Thread threadCurrentThread = Thread.currentThread();
            this.f38748c.post(new e(threadCurrentThread));
            LockSupport.park(threadCurrentThread);
        }
        return this.f38761p == null ? f38745v : this.f38761p;
    }

    protected int t(int i10, int i11) {
        int i12 = 1;
        if (i10 != 0 && i11 != 0) {
            int iMin = Math.min(s().width() / i10, s().height() / i11);
            while (true) {
                int i13 = i12 * 2;
                if (i13 > iMin) {
                    break;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    public com.github.penfeizhou.animation.decode.a u(int i10) {
        if (i10 < 0 || i10 >= this.f38749d.size()) {
            return null;
        }
        return (com.github.penfeizhou.animation.decode.a) this.f38749d.get(i10);
    }

    public Bitmap v(int i10) {
        if (this.f38765t != k.IDLE) {
            Log.e(f38744u, r() + ",stop first");
            return null;
        }
        this.f38765t = k.RUNNING;
        this.f38754i.compareAndSet(true, false);
        if (this.f38749d.size() == 0) {
            Reader reader = this.f38763r;
            if (reader == null) {
                this.f38763r = A(this.f38747b.a());
            } else {
                reader.reset();
            }
            D(K(this.f38763r));
        }
        if (i10 < 0) {
            i10 += this.f38749d.size();
        }
        int i11 = i10 >= 0 ? i10 : 0;
        this.f38750e = -1;
        while (this.f38750e < i11 && q()) {
            T();
        }
        this.f38760o.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(this.f38760o);
        F();
        return bitmapCreateBitmap;
    }

    public int w() {
        return this.f38749d.size();
    }

    protected abstract int x();

    public int y() {
        int iCapacity;
        synchronized (this.f38758m) {
            try {
                iCapacity = 0;
                for (Bitmap bitmap : this.f38757l) {
                    if (!bitmap.isRecycled()) {
                        iCapacity += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f38760o;
                if (byteBuffer != null) {
                    iCapacity += byteBuffer.capacity();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iCapacity;
    }
}
