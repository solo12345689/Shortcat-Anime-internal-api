package com.facebook.react.modules.core;

import Td.L;
import U6.i;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.b;
import j7.f;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q7.InterfaceC6145c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class JavaTimerManager implements LifecycleEventListener, f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f36950q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f36951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6145c f36952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.facebook.react.modules.core.b f36953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c7.f f36954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f36955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f36956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f36957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f36958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f36959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f36960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f36961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f36962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final PriorityQueue f36966p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(d dVar, long j10) {
            return !dVar.b() && ((long) dVar.a()) < j10;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f36967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f36968b;

        public b(long j10) {
            this.f36967a = j10;
        }

        public final void a() {
            this.f36968b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            if (this.f36968b) {
                return;
            }
            long jC = i.c() - (this.f36967a / ((long) 1000000));
            long jA = i.a() - jC;
            if (16.666666f - jC < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.f36956f;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z10 = javaTimerManager.f36965o;
                L l10 = L.f17438a;
            }
            if (z10) {
                JavaTimerManager.this.f36952b.callIdleCallbacks(jA);
            }
            JavaTimerManager.this.f36962l = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements Choreographer.FrameCallback {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (!JavaTimerManager.this.f36958h.get() || JavaTimerManager.this.f36959i.get()) {
                b bVar = JavaTimerManager.this.f36962l;
                if (bVar != null) {
                    bVar.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.f36962l = javaTimerManager.new b(j10);
                JavaTimerManager.this.f36951a.runOnJSQueueThread(JavaTimerManager.this.f36962l);
                JavaTimerManager.this.f36953c.k(b.a.f36988f, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f36974d;

        public d(int i10, long j10, int i11, boolean z10) {
            this.f36971a = i10;
            this.f36972b = j10;
            this.f36973c = i11;
            this.f36974d = z10;
        }

        public final int a() {
            return this.f36973c;
        }

        public final boolean b() {
            return this.f36974d;
        }

        public final long c() {
            return this.f36972b;
        }

        public final int d() {
            return this.f36971a;
        }

        public final void e(long j10) {
            this.f36972b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WritableArray f36975a;

        public e() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            d dVar;
            if (!JavaTimerManager.this.f36958h.get() || JavaTimerManager.this.f36959i.get()) {
                long j11 = j10 / ((long) 1000000);
                Object obj = JavaTimerManager.this.f36955e;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.f36966p.isEmpty()) {
                        try {
                            Object objPeek = javaTimerManager.f36966p.peek();
                            AbstractC5504s.e(objPeek);
                            if (((d) objPeek).c() >= j11 || (dVar = (d) javaTimerManager.f36966p.poll()) == null) {
                                break;
                            }
                            if (this.f36975a == null) {
                                this.f36975a = Arguments.createArray();
                            }
                            WritableArray writableArray = this.f36975a;
                            if (writableArray != null) {
                                writableArray.pushInt(dVar.d());
                            }
                            if (dVar.b()) {
                                dVar.e(((long) dVar.a()) + j11);
                                javaTimerManager.f36966p.add(dVar);
                            } else {
                                javaTimerManager.f36957g.remove(dVar.d());
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    L l10 = L.f17438a;
                }
                WritableArray writableArray2 = this.f36975a;
                if (writableArray2 != null) {
                    JavaTimerManager.this.f36952b.callTimers(writableArray2);
                    this.f36975a = null;
                }
                JavaTimerManager.this.f36953c.k(b.a.f36987e, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, InterfaceC6145c javaScriptTimerExecutor, com.facebook.react.modules.core.b reactChoreographer, c7.f devSupportManager) {
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        AbstractC5504s.h(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        AbstractC5504s.h(reactChoreographer, "reactChoreographer");
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        this.f36951a = reactApplicationContext;
        this.f36952b = javaScriptTimerExecutor;
        this.f36953c = reactChoreographer;
        this.f36954d = devSupportManager;
        this.f36955e = new Object();
        this.f36956f = new Object();
        this.f36957g = new SparseArray();
        this.f36958h = new AtomicBoolean(true);
        this.f36959i = new AtomicBoolean(false);
        this.f36960j = new e();
        this.f36961k = new c();
        final Function2 function2 = new Function2() { // from class: com.facebook.react.modules.core.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(JavaTimerManager.B((JavaTimerManager.d) obj, (JavaTimerManager.d) obj2));
            }
        };
        this.f36966p = new PriorityQueue(11, new Comparator() { // from class: q7.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return JavaTimerManager.C(function2, obj, obj2);
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        j7.e.f51674g.a(reactApplicationContext).e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(JavaTimerManager javaTimerManager, boolean z10) {
        synchronized (javaTimerManager.f36956f) {
            try {
                if (z10) {
                    javaTimerManager.z();
                } else {
                    javaTimerManager.r();
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(d dVar, d dVar2) {
        return AbstractC5466a.b(dVar.c() - dVar2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final void r() {
        if (this.f36964n) {
            this.f36953c.n(b.a.f36988f, this.f36961k);
            this.f36964n = false;
        }
    }

    private final void s() {
        j7.e eVarA = j7.e.f51674g.a(this.f36951a);
        if (this.f36963m && this.f36958h.get() && !eVarA.i()) {
            this.f36953c.n(b.a.f36987e, this.f36960j);
            this.f36963m = false;
        }
    }

    private final void v() {
        if (!this.f36958h.get() || this.f36959i.get()) {
            return;
        }
        s();
    }

    private final void w() {
        synchronized (this.f36956f) {
            try {
                if (this.f36965o) {
                    z();
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void y() {
        if (this.f36963m) {
            return;
        }
        this.f36953c.k(b.a.f36987e, this.f36960j);
        this.f36963m = true;
    }

    private final void z() {
        if (this.f36964n) {
            return;
        }
        this.f36953c.k(b.a.f36988f, this.f36961k);
        this.f36964n = true;
    }

    @Override // j7.f
    public void a(int i10) {
        if (this.f36959i.getAndSet(true)) {
            return;
        }
        y();
        w();
    }

    @Override // j7.f
    public void b(int i10) {
        if (j7.e.f51674g.a(this.f36951a).i()) {
            return;
        }
        this.f36959i.set(false);
        s();
        v();
    }

    public void createTimer(int i10, long j10, boolean z10) {
        d dVar = new d(i10, (i.b() / ((long) 1000000)) + j10, (int) j10, z10);
        synchronized (this.f36955e) {
            this.f36966p.add(dVar);
            this.f36957g.put(i10, dVar);
            L l10 = L.f17438a;
        }
    }

    public void deleteTimer(int i10) {
        synchronized (this.f36955e) {
            d dVar = (d) this.f36957g.get(i10);
            if (dVar == null) {
                return;
            }
            this.f36957g.remove(i10);
            this.f36966p.remove(dVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f36958h.set(true);
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.f36958h.set(false);
        y();
        w();
    }

    public void setSendIdleEvents(final boolean z10) {
        synchronized (this.f36956f) {
            this.f36965o = z10;
            L l10 = L.f17438a;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: q7.e
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager.A(this.f57684a, z10);
            }
        });
    }

    public void t(int i10, int i11, double d10, boolean z10) {
        long jA = i.a();
        long j10 = (long) d10;
        if (this.f36954d.m() && Math.abs(j10 - jA) > 60000) {
            this.f36952b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j10 - jA) + ((long) i11));
        if (i11 != 0 || z10) {
            createTimer(i10, jMax, z10);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i10);
        this.f36952b.callTimers(writableArrayCreateArray);
    }

    public final boolean u(long j10) {
        synchronized (this.f36955e) {
            d dVar = (d) this.f36966p.peek();
            if (dVar == null) {
                return false;
            }
            if (f36950q.b(dVar, j10)) {
                return true;
            }
            Iterator it = this.f36966p.iterator();
            AbstractC5504s.g(it, "iterator(...)");
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a aVar = f36950q;
                AbstractC5504s.e(dVar2);
                if (aVar.b(dVar2, j10)) {
                    return true;
                }
            }
            L l10 = L.f17438a;
            return false;
        }
    }

    public void x() {
        j7.e.f51674g.a(this.f36951a).k(this);
        this.f36951a.removeLifecycleEventListener(this);
        s();
        r();
    }
}
