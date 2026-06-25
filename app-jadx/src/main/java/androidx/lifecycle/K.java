package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC2861o, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f30170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30171c;

    public K(String key, I handle) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(handle, "handle");
        this.f30169a = key;
        this.f30170b = handle;
    }

    public final void a(P3.f registry, AbstractC2857k lifecycle) {
        AbstractC5504s.h(registry, "registry");
        AbstractC5504s.h(lifecycle, "lifecycle");
        if (this.f30171c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f30171c = true;
        lifecycle.addObserver(this);
        registry.c(this.f30169a, this.f30170b.a());
    }

    public final I b() {
        return this.f30170b;
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        if (event == AbstractC2857k.a.ON_DESTROY) {
            this.f30171c = false;
            source.getLifecycle().removeObserver(this);
        }
    }

    public final boolean h() {
        return this.f30171c;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
