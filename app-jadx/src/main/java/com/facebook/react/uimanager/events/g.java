package com.facebook.react.uimanager.events;

import Td.L;
import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.events.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f37587q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Comparator f37588r = new Comparator() { // from class: com.facebook.react.uimanager.events.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g.g((d) obj, (d) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f37589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f37590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray f37592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f37593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f37594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f37595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArrayList f37596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f37597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f37598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f37599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d[] f37600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EventEmitterImpl f37602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short f37603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f37604p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(int i10, short s10, short s11) {
            return ((((long) s10) & 65535) << 32) | ((long) i10) | ((((long) s11) & 65535) << 48);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U7.a.c(0L, "DispatchEventsRunnable");
            try {
                U7.a.f(0L, "ScheduleDispatchFrameCallback", g.this.f37599k.getAndIncrement());
                g.this.f37604p = false;
                Object obj = g.this.f37591c;
                g gVar = g.this;
                synchronized (obj) {
                    try {
                        if (gVar.f37601m > 0) {
                            if (gVar.f37601m > 1) {
                                Arrays.sort(gVar.f37600l, 0, gVar.f37601m, g.f37588r);
                            }
                            int i10 = gVar.f37601m;
                            for (int i11 = 0; i11 < i10; i11++) {
                                d dVar = gVar.f37600l[i11];
                                if (dVar != null) {
                                    U7.a.f(0L, dVar.getEventName(), dVar.getUniqueID());
                                    dVar.dispatchModern(gVar.f37602n);
                                    dVar.dispose();
                                }
                            }
                            gVar.x();
                            gVar.f37592d.clear();
                        }
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it = g.this.f37597i.iterator();
                AbstractC5504s.g(it, "iterator(...)");
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
            } finally {
                U7.a.i(0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f37606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37607b;

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c cVar) {
            cVar.b();
        }

        public final void b() {
            if (this.f37606a) {
                return;
            }
            this.f37606a = true;
            e();
        }

        public final void c() {
            if (this.f37606a) {
                return;
            }
            if (g.this.f37589a.isOnUiQueueThread()) {
                b();
            } else {
                g.this.f37589a.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c.d(this.f37609a);
                    }
                });
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f37607b) {
                this.f37606a = false;
            } else {
                e();
            }
            U7.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                g.this.A();
                if (!g.this.f37604p) {
                    g.this.f37604p = true;
                    U7.a.l(0L, "ScheduleDispatchFrameCallback", g.this.f37599k.get());
                    g.this.f37589a.runOnJSQueueThread(g.this.f37594f);
                }
            } finally {
                U7.a.i(0L);
            }
        }

        public final void e() {
            com.facebook.react.modules.core.b.f36977f.a().k(b.a.f36987e, g.this.f37598j);
        }

        public final void f() {
            this.f37607b = true;
        }
    }

    public g(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f37589a = reactContext;
        this.f37590b = new Object();
        this.f37591c = new Object();
        this.f37592d = new LongSparseArray();
        this.f37593e = new LinkedHashMap();
        this.f37594f = new b();
        this.f37595g = new ArrayList();
        this.f37596h = new CopyOnWriteArrayList();
        this.f37597i = new CopyOnWriteArrayList();
        this.f37598j = new c();
        this.f37599k = new AtomicInteger();
        this.f37600l = new d[16];
        reactContext.addLifecycleEventListener(this);
        this.f37602n = new EventEmitterImpl(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        synchronized (this.f37590b) {
            synchronized (this.f37591c) {
                try {
                    int size = this.f37595g.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = this.f37595g.get(i10);
                        AbstractC5504s.g(obj, "get(...)");
                        d dVar = (d) obj;
                        if (dVar.canCoalesce()) {
                            long jY = y(dVar.getViewTag(), dVar.getEventName(), dVar.getCoalescingKey());
                            Integer num = (Integer) this.f37592d.get(jY);
                            d dVar2 = null;
                            if (num == null) {
                                this.f37592d.put(jY, Integer.valueOf(this.f37601m));
                            } else {
                                d dVar3 = this.f37600l[num.intValue()];
                                if (dVar3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                d dVarCoalesce = dVar.coalesce(dVar3);
                                if (dVarCoalesce != dVar3) {
                                    this.f37592d.put(jY, Integer.valueOf(this.f37601m));
                                    this.f37600l[num.intValue()] = null;
                                    dVar2 = dVar3;
                                    dVar = dVarCoalesce;
                                } else {
                                    dVar2 = dVar;
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                w(dVar);
                            }
                            if (dVar2 != null) {
                                dVar2.dispose();
                            }
                        } else {
                            w(dVar);
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f37595g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(g gVar) {
        gVar.C();
    }

    private final void C() {
        UiThreadUtil.assertOnUiThread();
        this.f37598j.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(d dVar, d dVar2) {
        if (dVar == null && dVar2 == null) {
            return 0;
        }
        if (dVar == null) {
            return -1;
        }
        if (dVar2 == null) {
            return 1;
        }
        long timestampMs = dVar.getTimestampMs() - dVar2.getTimestampMs();
        if (timestampMs == 0) {
            return 0;
        }
        return timestampMs < 0 ? -1 : 1;
    }

    private final void w(d dVar) {
        int i10 = this.f37601m;
        d[] dVarArr = this.f37600l;
        if (i10 == dVarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f37600l = (d[]) objArrCopyOf;
        }
        d[] dVarArr2 = this.f37600l;
        int i11 = this.f37601m;
        this.f37601m = i11 + 1;
        dVarArr2[i11] = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Arrays.fill(this.f37600l, 0, this.f37601m, (Object) null);
        this.f37601m = 0;
    }

    private final long y(int i10, String str, short s10) {
        short sShortValue;
        Short sh2 = (Short) this.f37593e.get(str);
        if (sh2 != null) {
            sShortValue = sh2.shortValue();
        } else {
            short s11 = this.f37603o;
            this.f37603o = (short) (s11 + 1);
            this.f37593e.put(str, Short.valueOf(s11));
            sShortValue = s11;
        }
        return f37587q.b(i10, sShortValue, s10);
    }

    private final void z() {
        this.f37598j.c();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.e
            @Override // java.lang.Runnable
            public final void run() {
                g.B(this.f37586a);
            }
        });
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(i listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37596h.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(i listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37596h.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d event) {
        AbstractC5504s.h(event, "event");
        if (!event.isInitialized()) {
            throw new IllegalArgumentException("Dispatched event hasn't been initialized");
        }
        Iterator it = this.f37596h.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((i) it.next()).onEventDispatch(event);
        }
        synchronized (this.f37590b) {
            this.f37595g.add(event);
            U7.a.l(0L, event.getEventName(), event.getUniqueID());
            L l10 = L.f17438a;
        }
        z();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        z();
    }
}
