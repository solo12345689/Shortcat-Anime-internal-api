package androidx.activity;

import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f24164b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5082a f24165c;

    public G(boolean z10) {
        this.f24163a = z10;
    }

    public final void a(InterfaceC2633c cancellable) {
        AbstractC5504s.h(cancellable, "cancellable");
        this.f24164b.add(cancellable);
    }

    public final InterfaceC5082a b() {
        return this.f24165c;
    }

    public abstract void d();

    public void e(C2632b backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
    }

    public void f(C2632b backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f24163a;
    }

    public final void h() {
        Iterator it = this.f24164b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2633c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC2633c cancellable) {
        AbstractC5504s.h(cancellable, "cancellable");
        this.f24164b.remove(cancellable);
    }

    public final void j(boolean z10) {
        this.f24163a = z10;
        InterfaceC5082a interfaceC5082a = this.f24165c;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
    }

    public final void k(InterfaceC5082a interfaceC5082a) {
        this.f24165c = interfaceC5082a;
    }

    public void c() {
    }
}
