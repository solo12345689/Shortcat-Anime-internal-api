package Vb;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f19970a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f19971b = new WeakReference(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e eVar, androidx.appcompat.app.c cVar) {
        eVar.a(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(d dVar, androidx.appcompat.app.c cVar) {
        Iterator it = dVar.f19970a.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((e) it.next()).a(cVar);
        }
    }

    @Override // Vb.a
    public void a(final e listener) {
        AbstractC5504s.h(listener, "listener");
        this.f19970a.add(listener);
        final androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) this.f19971b.get();
        if (cVar != null) {
            cVar.runOnUiThread(new Runnable() { // from class: Vb.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.e(listener, cVar);
                }
            });
        }
    }

    @Override // Vb.a
    public void b(e listener) {
        AbstractC5504s.h(listener, "listener");
        this.f19970a.remove(listener);
    }

    public final void f(final androidx.appcompat.app.c activity) {
        AbstractC5504s.h(activity, "activity");
        this.f19971b = new WeakReference(activity);
        activity.runOnUiThread(new Runnable() { // from class: Vb.c
            @Override // java.lang.Runnable
            public final void run() {
                d.g(this.f19968a, activity);
            }
        });
    }
}
