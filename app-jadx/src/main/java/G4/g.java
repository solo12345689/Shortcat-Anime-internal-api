package G4;

import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2863q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC2857k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f7270a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f7271b = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements androidx.lifecycle.r {
        a() {
        }

        @Override // androidx.lifecycle.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g getLifecycle() {
            return g.f7270a;
        }
    }

    private g() {
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public void addObserver(InterfaceC2863q interfaceC2863q) {
        if (!(interfaceC2863q instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((interfaceC2863q + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) interfaceC2863q;
        a aVar = f7271b;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public AbstractC2857k.b getCurrentState() {
        return AbstractC2857k.b.f30239e;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.AbstractC2857k
    public void removeObserver(InterfaceC2863q interfaceC2863q) {
    }
}
