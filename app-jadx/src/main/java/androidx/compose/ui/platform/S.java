package androidx.compose.ui.platform;

import Gf.AbstractC1613i;
import Gf.C1608f0;
import Td.AbstractC2163n;
import Ud.C2272m;
import Y.InterfaceC2446t0;
import ae.AbstractC2605b;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S extends Gf.K {

    /* JADX INFO: renamed from: m */
    public static final c f27366m = new c(null);

    /* JADX INFO: renamed from: n */
    public static final int f27367n = 8;

    /* JADX INFO: renamed from: o */
    private static final Lazy f27368o = AbstractC2163n.b(a.f27380a);

    /* JADX INFO: renamed from: p */
    private static final ThreadLocal f27369p = new b();

    /* JADX INFO: renamed from: c */
    private final Choreographer f27370c;

    /* JADX INFO: renamed from: d */
    private final Handler f27371d;

    /* JADX INFO: renamed from: e */
    private final Object f27372e;

    /* JADX INFO: renamed from: f */
    private final C2272m f27373f;

    /* JADX INFO: renamed from: g */
    private List f27374g;

    /* JADX INFO: renamed from: h */
    private List f27375h;

    /* JADX INFO: renamed from: i */
    private boolean f27376i;

    /* JADX INFO: renamed from: j */
    private boolean f27377j;

    /* JADX INFO: renamed from: k */
    private final d f27378k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC2446t0 f27379l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f27380a = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.S$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0471a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f27381a;

            C0471a(Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0471a(eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0471a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f27381a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return Choreographer.getInstance();
            }
        }

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final Zd.i invoke() {
            S s10 = new S(T.b() ? Choreographer.getInstance() : (Choreographer) AbstractC1613i.e(C1608f0.c(), new C0471a(null)), G1.h.a(Looper.getMainLooper()), null);
            return s10.w(s10.k2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends ThreadLocal {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a */
        public Zd.i initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            S s10 = new S(choreographer, G1.h.a(looperMyLooper), null);
            return s10.w(s10.k2());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Zd.i a() {
            if (T.b()) {
                return b();
            }
            Zd.i iVar = (Zd.i) S.f27369p.get();
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final Zd.i b() {
            return (Zd.i) S.f27368o.getValue();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            S.this.f27371d.removeCallbacks(this);
            S.this.n2();
            S.this.m2(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.n2();
            Object obj = S.this.f27372e;
            S s10 = S.this;
            synchronized (obj) {
                try {
                    if (s10.f27374g.isEmpty()) {
                        s10.j2().removeFrameCallback(this);
                        s10.f27377j = false;
                    }
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ S(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable l2() {
        Runnable runnable;
        synchronized (this.f27372e) {
            runnable = (Runnable) this.f27373f.z();
        }
        return runnable;
    }

    public final void m2(long j10) {
        synchronized (this.f27372e) {
            if (this.f27377j) {
                this.f27377j = false;
                List list = this.f27374g;
                this.f27374g = this.f27375h;
                this.f27375h = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    public final void n2() {
        boolean z10;
        do {
            Runnable runnableL2 = l2();
            while (runnableL2 != null) {
                runnableL2.run();
                runnableL2 = l2();
            }
            synchronized (this.f27372e) {
                if (this.f27373f.isEmpty()) {
                    z10 = false;
                    this.f27376i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        synchronized (this.f27372e) {
            try {
                this.f27373f.addLast(runnable);
                if (!this.f27376i) {
                    this.f27376i = true;
                    this.f27371d.post(this.f27378k);
                    if (!this.f27377j) {
                        this.f27377j = true;
                        this.f27370c.postFrameCallback(this.f27378k);
                    }
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Choreographer j2() {
        return this.f27370c;
    }

    public final InterfaceC2446t0 k2() {
        return this.f27379l;
    }

    public final void o2(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f27372e) {
            try {
                this.f27374g.add(frameCallback);
                if (!this.f27377j) {
                    this.f27377j = true;
                    this.f27370c.postFrameCallback(this.f27378k);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p2(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f27372e) {
            this.f27374g.remove(frameCallback);
        }
    }

    private S(Choreographer choreographer, Handler handler) {
        this.f27370c = choreographer;
        this.f27371d = handler;
        this.f27372e = new Object();
        this.f27373f = new C2272m();
        this.f27374g = new ArrayList();
        this.f27375h = new ArrayList();
        this.f27378k = new d();
        this.f27379l = new U(choreographer, this);
    }
}
