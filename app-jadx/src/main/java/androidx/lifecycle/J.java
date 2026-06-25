package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC2861o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f30168a;

    public J(N provider) {
        AbstractC5504s.h(provider, "provider");
        this.f30168a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        if (event == AbstractC2857k.a.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.f30168a.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
