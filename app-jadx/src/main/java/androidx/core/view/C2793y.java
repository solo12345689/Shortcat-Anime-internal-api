package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2793y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f29126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f29127b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f29128c = new HashMap();

    /* JADX INFO: renamed from: androidx.core.view.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC2857k f29129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC2861o f29130b;

        a(AbstractC2857k abstractC2857k, InterfaceC2861o interfaceC2861o) {
            this.f29129a = abstractC2857k;
            this.f29130b = interfaceC2861o;
            abstractC2857k.addObserver(interfaceC2861o);
        }

        void a() {
            this.f29129a.removeObserver(this.f29130b);
            this.f29130b = null;
        }
    }

    public C2793y(Runnable runnable) {
        this.f29126a = runnable;
    }

    public static /* synthetic */ void a(C2793y c2793y, AbstractC2857k.b bVar, B b10, androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
        c2793y.getClass();
        if (aVar == AbstractC2857k.a.h(bVar)) {
            c2793y.c(b10);
            return;
        }
        if (aVar == AbstractC2857k.a.ON_DESTROY) {
            c2793y.j(b10);
        } else if (aVar == AbstractC2857k.a.b(bVar)) {
            c2793y.f29127b.remove(b10);
            c2793y.f29126a.run();
        }
    }

    public static /* synthetic */ void b(C2793y c2793y, B b10, androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
        c2793y.getClass();
        if (aVar == AbstractC2857k.a.ON_DESTROY) {
            c2793y.j(b10);
        }
    }

    public void c(B b10) {
        this.f29127b.add(b10);
        this.f29126a.run();
    }

    public void d(final B b10, androidx.lifecycle.r rVar) {
        c(b10);
        AbstractC2857k lifecycle = rVar.getLifecycle();
        a aVar = (a) this.f29128c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f29128c.put(b10, new a(lifecycle, new InterfaceC2861o() { // from class: androidx.core.view.x
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(androidx.lifecycle.r rVar2, AbstractC2857k.a aVar2) {
                C2793y.b(this.f29124a, b10, rVar2, aVar2);
            }
        }));
    }

    public void e(final B b10, androidx.lifecycle.r rVar, final AbstractC2857k.b bVar) {
        AbstractC2857k lifecycle = rVar.getLifecycle();
        a aVar = (a) this.f29128c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f29128c.put(b10, new a(lifecycle, new InterfaceC2861o() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(androidx.lifecycle.r rVar2, AbstractC2857k.a aVar2) {
                C2793y.a(this.f29121a, bVar, b10, rVar2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f29127b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f29127b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f29127b.iterator();
        while (it.hasNext()) {
            if (((B) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f29127b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).b(menu);
        }
    }

    public void j(B b10) {
        this.f29127b.remove(b10);
        a aVar = (a) this.f29128c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f29126a.run();
    }
}
