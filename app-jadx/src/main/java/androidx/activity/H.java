package androidx.activity;

import Ud.C2272m;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.H;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f24166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K1.a f24167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2272m f24168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private G f24169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f24170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f24171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24173h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(C2632b backEvent) {
            AbstractC5504s.h(backEvent, "backEvent");
            H.this.n(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2632b) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(C2632b backEvent) {
            AbstractC5504s.h(backEvent, "backEvent");
            H.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2632b) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m53invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m53invoke() {
            H.this.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m54invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m54invoke() {
            H.this.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5082a {
        e() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m55invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m55invoke() {
            H.this.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f24179a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC5082a onBackInvoked) {
            AbstractC5504s.h(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final InterfaceC5082a onBackInvoked) {
            AbstractC5504s.h(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.I
                public final void onBackInvoked() {
                    H.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            AbstractC5504s.h(dispatcher, "dispatcher");
            AbstractC5504s.h(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            AbstractC5504s.h(dispatcher, "dispatcher");
            AbstractC5504s.h(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f24180a = new g();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f24181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f24182b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5082a f24183c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5082a f24184d;

            a(Function1 function1, Function1 function12, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2) {
                this.f24181a = function1;
                this.f24182b = function12;
                this.f24183c = interfaceC5082a;
                this.f24184d = interfaceC5082a2;
            }

            public void onBackCancelled() {
                this.f24184d.invoke();
            }

            public void onBackInvoked() {
                this.f24183c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                AbstractC5504s.h(backEvent, "backEvent");
                this.f24182b.invoke(new C2632b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                AbstractC5504s.h(backEvent, "backEvent");
                this.f24181a.invoke(new C2632b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(Function1 onBackStarted, Function1 onBackProgressed, InterfaceC5082a onBackInvoked, InterfaceC5082a onBackCancelled) {
            AbstractC5504s.h(onBackStarted, "onBackStarted");
            AbstractC5504s.h(onBackProgressed, "onBackProgressed");
            AbstractC5504s.h(onBackInvoked, "onBackInvoked");
            AbstractC5504s.h(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class h implements InterfaceC2861o, InterfaceC2633c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC2857k f24185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final G f24186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC2633c f24187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ H f24188d;

        public h(H h10, AbstractC2857k lifecycle, G onBackPressedCallback) {
            AbstractC5504s.h(lifecycle, "lifecycle");
            AbstractC5504s.h(onBackPressedCallback, "onBackPressedCallback");
            this.f24188d = h10;
            this.f24185a = lifecycle;
            this.f24186b = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.InterfaceC2633c
        public void cancel() {
            this.f24185a.removeObserver(this);
            this.f24186b.i(this);
            InterfaceC2633c interfaceC2633c = this.f24187c;
            if (interfaceC2633c != null) {
                interfaceC2633c.cancel();
            }
            this.f24187c = null;
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(androidx.lifecycle.r source, AbstractC2857k.a event) {
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(event, "event");
            if (event == AbstractC2857k.a.ON_START) {
                this.f24187c = this.f24188d.j(this.f24186b);
                return;
            }
            if (event != AbstractC2857k.a.ON_STOP) {
                if (event == AbstractC2857k.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC2633c interfaceC2633c = this.f24187c;
                if (interfaceC2633c != null) {
                    interfaceC2633c.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class i implements InterfaceC2633c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final G f24189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f24190b;

        public i(H h10, G onBackPressedCallback) {
            AbstractC5504s.h(onBackPressedCallback, "onBackPressedCallback");
            this.f24190b = h10;
            this.f24189a = onBackPressedCallback;
        }

        @Override // androidx.activity.InterfaceC2633c
        public void cancel() {
            this.f24190b.f24168c.remove(this.f24189a);
            if (AbstractC5504s.c(this.f24190b.f24169d, this.f24189a)) {
                this.f24189a.c();
                this.f24190b.f24169d = null;
            }
            this.f24189a.i(this);
            InterfaceC5082a interfaceC5082aB = this.f24189a.b();
            if (interfaceC5082aB != null) {
                interfaceC5082aB.invoke();
            }
            this.f24189a.k(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class j extends AbstractC5502p implements InterfaceC5082a {
        j(Object obj) {
            super(0, obj, H.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
            ((H) this.receiver).q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class k extends AbstractC5502p implements InterfaceC5082a {
        k(Object obj) {
            super(0, obj, H.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m57invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m57invoke() {
            ((H) this.receiver).q();
        }
    }

    public H(Runnable runnable, K1.a aVar) {
        this.f24166a = runnable;
        this.f24167b = aVar;
        this.f24168c = new C2272m();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f24170e = i10 >= 34 ? g.f24180a.a(new a(), new b(), new c(), new d()) : f.f24179a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        Object objPrevious;
        G g10 = this.f24169d;
        if (g10 == null) {
            C2272m c2272m = this.f24168c;
            ListIterator<E> listIterator = c2272m.listIterator(c2272m.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((G) objPrevious).g()) {
                        break;
                    }
                }
            }
            g10 = (G) objPrevious;
        }
        this.f24169d = null;
        if (g10 != null) {
            g10.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C2632b c2632b) {
        Object objPrevious;
        G g10 = this.f24169d;
        if (g10 == null) {
            C2272m c2272m = this.f24168c;
            ListIterator<E> listIterator = c2272m.listIterator(c2272m.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((G) objPrevious).g()) {
                        break;
                    }
                }
            }
            g10 = (G) objPrevious;
        }
        if (g10 != null) {
            g10.e(c2632b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C2632b c2632b) {
        Object objPrevious;
        C2272m c2272m = this.f24168c;
        ListIterator<E> listIterator = c2272m.listIterator(c2272m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((G) objPrevious).g()) {
                    break;
                }
            }
        }
        G g10 = (G) objPrevious;
        if (this.f24169d != null) {
            k();
        }
        this.f24169d = g10;
        if (g10 != null) {
            g10.f(c2632b);
        }
    }

    private final void p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f24171f;
        OnBackInvokedCallback onBackInvokedCallback = this.f24170e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f24172g) {
            f.f24179a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f24172g = true;
        } else {
            if (z10 || !this.f24172g) {
                return;
            }
            f.f24179a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f24172g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.f24173h;
        C2272m c2272m = this.f24168c;
        boolean z11 = false;
        if (c2272m == null || !c2272m.isEmpty()) {
            Iterator<E> it = c2272m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((G) it.next()).g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f24173h = z11;
        if (z11 != z10) {
            K1.a aVar = this.f24167b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(G onBackPressedCallback) {
        AbstractC5504s.h(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(androidx.lifecycle.r owner, G onBackPressedCallback) {
        AbstractC5504s.h(owner, "owner");
        AbstractC5504s.h(onBackPressedCallback, "onBackPressedCallback");
        AbstractC2857k lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC2857k.b.f30235a) {
            return;
        }
        onBackPressedCallback.a(new h(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new j(this));
    }

    public final InterfaceC2633c j(G onBackPressedCallback) {
        AbstractC5504s.h(onBackPressedCallback, "onBackPressedCallback");
        this.f24168c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        q();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    public final void l() {
        Object objPrevious;
        G g10 = this.f24169d;
        if (g10 == null) {
            C2272m c2272m = this.f24168c;
            ListIterator<E> listIterator = c2272m.listIterator(c2272m.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((G) objPrevious).g()) {
                        break;
                    }
                }
            }
            g10 = (G) objPrevious;
        }
        this.f24169d = null;
        if (g10 != null) {
            g10.d();
            return;
        }
        Runnable runnable = this.f24166a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        AbstractC5504s.h(invoker, "invoker");
        this.f24171f = invoker;
        p(this.f24173h);
    }

    public H(Runnable runnable) {
        this(runnable, null);
    }
}
