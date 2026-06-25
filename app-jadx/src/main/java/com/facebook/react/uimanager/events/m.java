package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.events.m;
import com.facebook.react.uimanager.f0;
import h7.C4914b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f37612h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Handler f37613i = UiThreadUtil.getUiThreadHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f37614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventEmitterImpl f37615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f37616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f37617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f37618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f37620g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f37621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37622b;

        public b() {
        }

        private final void b() {
            com.facebook.react.modules.core.b.f36977f.a().k(b.a.f36987e, m.this.f37618e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar) {
            bVar.c();
        }

        public final void c() {
            if (this.f37621a) {
                return;
            }
            this.f37621a = true;
            b();
        }

        public final void d() {
            if (this.f37621a) {
                return;
            }
            if (m.this.f37614a.isOnUiQueueThread()) {
                c();
            } else {
                m.this.f37614a.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.b.e(this.f37624a);
                    }
                });
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f37622b) {
                this.f37621a = false;
            } else {
                b();
            }
            U7.a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = m.this.f37617d.iterator();
                AbstractC5504s.g(it, "iterator(...)");
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
            } finally {
                U7.a.i(0L);
            }
        }

        public final void f() {
            this.f37622b = false;
        }

        public final void g() {
            this.f37622b = true;
        }
    }

    public m(ReactApplicationContext reactContext, RCTModernEventEmitter fabricEventEmitter) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(fabricEventEmitter, "fabricEventEmitter");
        this.f37614a = reactContext;
        EventEmitterImpl eventEmitterImpl = new EventEmitterImpl(reactContext);
        this.f37615b = eventEmitterImpl;
        this.f37616c = new CopyOnWriteArrayList();
        this.f37617d = new CopyOnWriteArrayList();
        this.f37618e = new b();
        this.f37620g = new Runnable() { // from class: com.facebook.react.uimanager.events.l
            @Override // java.lang.Runnable
            public final void run() {
                m.m(this.f37611a);
            }
        };
        reactContext.addLifecycleEventListener(this);
        eventEmitterImpl.registerFabricEventEmitter(fabricEventEmitter);
    }

    private final void k() {
        UiThreadUtil.assertOnUiThread();
        if (!C4914b.O()) {
            this.f37618e.g();
        } else {
            this.f37619f = false;
            f37613i.removeCallbacks(this.f37620g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m mVar) {
        mVar.f37619f = false;
        U7.a.c(0L, "BatchEventDispatchedListeners");
        try {
            Iterator it = mVar.f37617d.iterator();
            AbstractC5504s.g(it, "iterator(...)");
            while (it.hasNext()) {
                ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
            }
        } finally {
            U7.a.i(0L);
        }
    }

    private final void n(d dVar) {
        U7.a.c(0L, "FabricEventDispatcher.dispatchSynchronous('" + dVar.getEventName() + "')");
        try {
            UIManager uIManagerG = f0.g(this.f37614a, 2);
            if (uIManagerG instanceof u) {
                ((u) uIManagerG).receiveEvent(dVar.getSurfaceId(), dVar.getViewTag(), dVar.getEventName(), dVar.canCoalesce(), dVar.internal_getEventData$ReactAndroid_release(), dVar.internal_getEventCategory$ReactAndroid_release(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new IllegalStateException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
            U7.a.i(0L);
        } catch (Throwable th2) {
            U7.a.i(0L);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(m mVar) {
        mVar.k();
    }

    private final void r() {
        if (!C4914b.O()) {
            this.f37618e.d();
        } else {
            if (this.f37619f) {
                return;
            }
            this.f37619f = true;
            f37613i.postAtFrontOfQueue(this.f37620g);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
        o();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(i listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37616c.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(i listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37616c.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d event) {
        AbstractC5504s.h(event, "event");
        Iterator it = this.f37616c.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((i) it.next()).onEventDispatch(event);
        }
        if (event.internal_experimental_isSynchronous$ReactAndroid_release()) {
            n(event);
        } else {
            event.dispatchModern(this.f37615b);
        }
        event.dispose();
        r();
    }

    public void j(com.facebook.react.uimanager.events.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37617d.add(listener);
    }

    public void l() {
        r();
    }

    public final void o() {
        this.f37615b.registerFabricEventEmitter(null);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.k
            @Override // java.lang.Runnable
            public final void run() {
                m.p(this.f37610a);
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        k();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        k();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        r();
        if (C4914b.O()) {
            return;
        }
        this.f37618e.f();
    }

    public void q(com.facebook.react.uimanager.events.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.f37617d.remove(listener);
    }
}
