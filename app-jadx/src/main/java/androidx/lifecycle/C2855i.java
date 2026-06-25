package androidx.lifecycle;

import P3.f;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2857k;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2855i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2855i f30229a = new C2855i();

    /* JADX INFO: renamed from: androidx.lifecycle.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements f.a {
        @Override // P3.f.a
        public void a(P3.i owner) {
            AbstractC5504s.h(owner, "owner");
            if (!(owner instanceof Y)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            X viewModelStore = ((Y) owner).getViewModelStore();
            P3.f savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                U uB = viewModelStore.b((String) it.next());
                if (uB != null) {
                    C2855i.a(uB, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC2861o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2857k f30230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P3.f f30231b;

        b(AbstractC2857k abstractC2857k, P3.f fVar) {
            this.f30230a = abstractC2857k;
            this.f30231b = fVar;
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(r source, AbstractC2857k.a event) {
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(event, "event");
            if (event == AbstractC2857k.a.ON_START) {
                this.f30230a.removeObserver(this);
                this.f30231b.d(a.class);
            }
        }
    }

    private C2855i() {
    }

    public static final void a(U viewModel, P3.f registry, AbstractC2857k lifecycle) {
        AbstractC5504s.h(viewModel, "viewModel");
        AbstractC5504s.h(registry, "registry");
        AbstractC5504s.h(lifecycle, "lifecycle");
        K k10 = (K) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (k10 == null || k10.h()) {
            return;
        }
        k10.a(registry, lifecycle);
        f30229a.c(registry, lifecycle);
    }

    public static final K b(P3.f registry, AbstractC2857k lifecycle, String str, Bundle bundle) {
        AbstractC5504s.h(registry, "registry");
        AbstractC5504s.h(lifecycle, "lifecycle");
        AbstractC5504s.e(str);
        K k10 = new K(str, I.f30165c.a(registry.a(str), bundle));
        k10.a(registry, lifecycle);
        f30229a.c(registry, lifecycle);
        return k10;
    }

    private final void c(P3.f fVar, AbstractC2857k abstractC2857k) {
        AbstractC2857k.b currentState = abstractC2857k.getCurrentState();
        if (currentState == AbstractC2857k.b.f30236b || currentState.b(AbstractC2857k.b.f30238d)) {
            fVar.d(a.class);
        } else {
            abstractC2857k.addObserver(new b(abstractC2857k, fVar));
        }
    }
}
