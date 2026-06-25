package io.sentry.android.replay;

import Td.L;
import Ud.AbstractC2279u;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import ge.AbstractC4877a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.util.C5288a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements g, e, io.sentry.android.replay.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f50497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f50498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.replay.util.i f50499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f50500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f50501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f50502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Point f50503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5288a f50504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C5288a f50505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C5288a f50506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile a f50507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile HandlerThread f50508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Handler f50509n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5322z3 f50510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.android.replay.util.i f50511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f50512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private s f50513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f50514e;

        public a(C5322z3 options, io.sentry.android.replay.util.i mainLooperHandler) {
            AbstractC5504s.h(options, "options");
            AbstractC5504s.h(mainLooperHandler, "mainLooperHandler");
            this.f50510a = options;
            this.f50511b = mainLooperHandler;
            this.f50514e = new AtomicBoolean(true);
        }

        public final q a() {
            return this.f50512c;
        }

        public final void b() {
            q qVar = this.f50512c;
            if (qVar != null) {
                qVar.d();
            }
            this.f50514e.getAndSet(false);
        }

        public final void c() {
            if (this.f50510a.getSessionReplay().u()) {
                this.f50510a.getLogger().c(EnumC5215i3.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            q qVar = this.f50512c;
            if (qVar != null) {
                qVar.e();
            }
            this.f50514e.getAndSet(true);
            this.f50511b.d(this);
            if (this.f50511b.b(this)) {
                return;
            }
            this.f50510a.getLogger().c(EnumC5215i3.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void d(s sVar) {
            this.f50513d = sVar;
        }

        public final void e(q qVar) {
            this.f50512c = qVar;
        }

        public final void f() {
            q qVar = this.f50512c;
            if (qVar != null) {
                qVar.c();
            }
            this.f50512c = null;
            this.f50514e.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f50514e.get()) {
                if (this.f50510a.getSessionReplay().u()) {
                    this.f50510a.getLogger().c(EnumC5215i3.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.f50510a.getSessionReplay().u()) {
                    this.f50510a.getLogger().c(EnumC5215i3.DEBUG, "Capturing a frame.", new Object[0]);
                }
                q qVar = this.f50512c;
                if (qVar != null) {
                    qVar.b();
                }
            } catch (Throwable th2) {
                this.f50510a.getLogger().b(EnumC5215i3.ERROR, "Failed to capture a frame", th2);
            }
            if (this.f50510a.getSessionReplay().u()) {
                ILogger logger = this.f50510a.getLogger();
                EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Posting the capture runnable again, frame rate is ");
                s sVar = this.f50513d;
                sb2.append(sVar != null ? sVar.b() : 1);
                sb2.append(" fps.");
                logger.c(enumC5215i3, sb2.toString(), new Object[0]);
            }
            io.sentry.android.replay.util.i iVar = this.f50511b;
            s sVar2 = this.f50513d;
            if (iVar.c(this, 1000 / ((long) (sVar2 != null ? sVar2.b() : 1)))) {
                return;
            }
            this.f50510a.getLogger().c(EnumC5215i3.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f50516b;

        b(View view) {
            this.f50516b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakReference weakReference = (WeakReference) AbstractC2279u.A0(w.this.f50502g);
            if (!AbstractC5504s.c(this.f50516b, weakReference != null ? (View) weakReference.get() : null)) {
                io.sentry.android.replay.util.r.i(this.f50516b, this);
                return true;
            }
            if (io.sentry.android.replay.util.r.e(this.f50516b)) {
                io.sentry.android.replay.util.r.i(this.f50516b, this);
                if (this.f50516b.getWidth() != w.this.f50503h.x && this.f50516b.getHeight() != w.this.f50503h.y) {
                    w.this.f50503h.set(this.f50516b.getWidth(), this.f50516b.getHeight());
                    w.this.f50498c.h(this.f50516b.getWidth(), this.f50516b.getHeight());
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f50517a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(1);
            this.f50517a = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(AbstractC5504s.c(it.get(), this.f50517a));
        }
    }

    public w(C5322z3 options, r rVar, u windowCallback, io.sentry.android.replay.util.i mainLooperHandler, ScheduledExecutorService replayExecutor) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(windowCallback, "windowCallback");
        AbstractC5504s.h(mainLooperHandler, "mainLooperHandler");
        AbstractC5504s.h(replayExecutor, "replayExecutor");
        this.f50496a = options;
        this.f50497b = rVar;
        this.f50498c = windowCallback;
        this.f50499d = mainLooperHandler;
        this.f50500e = replayExecutor;
        this.f50501f = new AtomicBoolean(false);
        this.f50502g = new ArrayList();
        this.f50503h = new Point();
        this.f50504i = new C5288a();
        this.f50505j = new C5288a();
        this.f50506k = new C5288a();
    }

    @Override // io.sentry.android.replay.e
    public void a(View root, boolean z10) throws Exception {
        q qVarA;
        q qVarA2;
        q qVarA3;
        AbstractC5504s.h(root, "root");
        InterfaceC5192e0 interfaceC5192e0A = this.f50504i.a();
        try {
            if (!z10) {
                a aVar = this.f50507l;
                if (aVar != null && (qVarA2 = aVar.a()) != null) {
                    qVarA2.f(root);
                }
                AbstractC2279u.K(this.f50502g, new c(root));
                WeakReference weakReference = (WeakReference) AbstractC2279u.A0(this.f50502g);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !AbstractC5504s.c(root, view)) {
                    a aVar2 = this.f50507l;
                    if (aVar2 != null && (qVarA = aVar2.a()) != null) {
                        qVarA.a(view);
                    }
                    m(view);
                }
            } else {
                if (y.a(root) == null) {
                    this.f50496a.getLogger().c(EnumC5215i3.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return;
                }
                this.f50502g.add(new WeakReference(root));
                a aVar3 = this.f50507l;
                if (aVar3 != null && (qVarA3 = aVar3.a()) != null) {
                    qVarA3.a(root);
                }
                m(root);
            }
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC4877a.a(interfaceC5192e0A, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.b
    public io.sentry.android.replay.util.i b() {
        return this.f50499d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        reset();
        this.f50499d.d(this.f50507l);
        InterfaceC5192e0 interfaceC5192e0A = this.f50506k.a();
        try {
            Handler handler = this.f50509n;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.f50508m;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
            stop();
        } finally {
        }
    }

    @Override // io.sentry.android.replay.b
    public ScheduledExecutorService g() {
        return this.f50500e;
    }

    @Override // io.sentry.android.replay.b
    public Handler h() throws Exception {
        if (this.f50509n == null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f50506k.a();
            try {
                if (this.f50509n == null) {
                    this.f50508m = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.f50508m;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.f50508m;
                    AbstractC5504s.e(handlerThread2);
                    this.f50509n = new Handler(handlerThread2.getLooper());
                }
                L l10 = L.f17438a;
                AbstractC4877a.a(interfaceC5192e0A, null);
            } finally {
            }
        }
        Handler handler = this.f50509n;
        AbstractC5504s.e(handler);
        return handler;
    }

    @Override // io.sentry.android.replay.g
    public void i() {
        a aVar = this.f50507l;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void m(View root) {
        AbstractC5504s.h(root, "root");
        if (!io.sentry.android.replay.util.r.e(root)) {
            io.sentry.android.replay.util.r.b(root, new b(root));
            return;
        }
        if (root.getWidth() != this.f50503h.x) {
            int height = root.getHeight();
            Point point = this.f50503h;
            if (height != point.y) {
                point.set(root.getWidth(), root.getHeight());
                this.f50498c.h(root.getWidth(), root.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public void pause() {
        a aVar = this.f50507l;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // io.sentry.android.replay.g
    public void r(s config) throws Exception {
        a aVar;
        q qVarA;
        AbstractC5504s.h(config, "config");
        if (this.f50501f.get()) {
            if (this.f50507l == null) {
                InterfaceC5192e0 interfaceC5192e0A = this.f50505j.a();
                try {
                    if (this.f50507l == null) {
                        this.f50507l = new a(this.f50496a, this.f50499d);
                    }
                    L l10 = L.f17438a;
                    AbstractC4877a.a(interfaceC5192e0A, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC4877a.a(interfaceC5192e0A, th2);
                        throw th3;
                    }
                }
            }
            a aVar2 = this.f50507l;
            if (aVar2 != null) {
                aVar2.d(config);
            }
            a aVar3 = this.f50507l;
            if (aVar3 != null) {
                aVar3.e(new q(config, this.f50496a, this, this.f50497b));
            }
            WeakReference weakReference = (WeakReference) AbstractC2279u.A0(this.f50502g);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.f50507l) != null && (qVarA = aVar.a()) != null) {
                qVarA.a(view);
            }
            this.f50499d.d(this.f50507l);
            if (this.f50499d.c(this.f50507l, 100L)) {
                return;
            }
            this.f50496a.getLogger().c(EnumC5215i3.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.g
    public void reset() throws Exception {
        q qVarA;
        this.f50503h.set(0, 0);
        InterfaceC5192e0 interfaceC5192e0A = this.f50504i.a();
        try {
            for (WeakReference weakReference : this.f50502g) {
                a aVar = this.f50507l;
                if (aVar != null && (qVarA = aVar.a()) != null) {
                    qVarA.f((View) weakReference.get());
                }
            }
            this.f50502g.clear();
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.g
    public void start() {
        this.f50501f.getAndSet(true);
    }

    @Override // io.sentry.android.replay.g
    public void stop() throws Exception {
        a aVar = this.f50507l;
        if (aVar != null) {
            aVar.f();
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f50505j.a();
        try {
            this.f50507l = null;
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
            this.f50501f.set(false);
        } finally {
        }
    }
}
