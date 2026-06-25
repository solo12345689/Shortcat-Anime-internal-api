package androidx.window.layout.adapter.sidecar;

import Td.L;
import Ud.AbstractC2279u;
import a4.C2576k;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import c4.j;
import d4.InterfaceC4566a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC4566a {

    /* JADX INFO: renamed from: d */
    private static volatile b f32633d;

    /* JADX INFO: renamed from: a */
    private androidx.window.layout.adapter.sidecar.a f32635a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f32636b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public static final a f32632c = new a(null);

    /* JADX INFO: renamed from: e */
    private static final ReentrantLock f32634e = new ReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            AbstractC5504s.h(context, "context");
            if (b.f32633d == null) {
                ReentrantLock reentrantLock = b.f32634e;
                reentrantLock.lock();
                try {
                    if (b.f32633d == null) {
                        b.f32633d = new b(b.f32632c.b(context));
                    }
                    L l10 = L.f17438a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            b bVar = b.f32633d;
            AbstractC5504s.e(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            AbstractC5504s.h(context, "context");
            try {
                if (c(SidecarCompat.f32620f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.n()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(C2576k c2576k) {
            return c2576k != null && c2576k.compareTo(C2576k.f23792f.a()) >= 0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class C0544b implements a.InterfaceC0543a {
        public C0544b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0543a
        public void a(Activity activity, j newLayout) {
            AbstractC5504s.h(activity, "activity");
            AbstractC5504s.h(newLayout, "newLayout");
            for (c cVar : b.this.g()) {
                if (AbstractC5504s.c(cVar.d(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final Activity f32638a;

        /* JADX INFO: renamed from: b */
        private final Executor f32639b;

        /* JADX INFO: renamed from: c */
        private final K1.a f32640c;

        /* JADX INFO: renamed from: d */
        private j f32641d;

        public c(Activity activity, Executor executor, K1.a callback) {
            AbstractC5504s.h(activity, "activity");
            AbstractC5504s.h(executor, "executor");
            AbstractC5504s.h(callback, "callback");
            this.f32638a = activity;
            this.f32639b = executor;
            this.f32640c = callback;
        }

        public static final void c(c this$0, j newLayoutInfo) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(newLayoutInfo, "$newLayoutInfo");
            this$0.f32640c.accept(newLayoutInfo);
        }

        public final void b(final j newLayoutInfo) {
            AbstractC5504s.h(newLayoutInfo, "newLayoutInfo");
            this.f32641d = newLayoutInfo;
            this.f32639b.execute(new Runnable() { // from class: f4.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(this.f46852a, newLayoutInfo);
                }
            });
        }

        public final Activity d() {
            return this.f32638a;
        }

        public final K1.a e() {
            return this.f32640c;
        }

        public final j f() {
            return this.f32641d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f32635a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f32635a;
        if (aVar2 != null) {
            aVar2.a(new C0544b());
        }
    }

    private final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32636b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC5504s.c(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.f32635a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    private final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32636b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // d4.InterfaceC4566a
    public void a(K1.a callback) {
        AbstractC5504s.h(callback, "callback");
        synchronized (f32634e) {
            try {
                if (this.f32635a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c callbackWrapper : this.f32636b) {
                    if (callbackWrapper.e() == callback) {
                        AbstractC5504s.g(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f32636b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f(((c) it.next()).d());
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d4.InterfaceC4566a
    public void b(Context context, Executor executor, K1.a callback) {
        Object next;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(callback, "callback");
        L l10 = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f32634e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar = this.f32635a;
                if (aVar == null) {
                    callback.accept(new j(AbstractC2279u.m()));
                    return;
                }
                boolean zH = h(activity);
                c cVar = new c(activity, executor, callback);
                this.f32636b.add(cVar);
                if (zH) {
                    Iterator it = this.f32636b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (AbstractC5504s.c(activity, ((c) next).d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) next;
                    j jVarF = cVar2 != null ? cVar2.f() : null;
                    if (jVarF != null) {
                        cVar.b(jVarF);
                    }
                } else {
                    aVar.b(activity);
                }
                L l11 = L.f17438a;
                reentrantLock.unlock();
                l10 = L.f17438a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (l10 == null) {
            callback.accept(new j(AbstractC2279u.m()));
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f32636b;
    }
}
