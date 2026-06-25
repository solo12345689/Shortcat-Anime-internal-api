package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2849c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class E implements InterfaceC2861o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2849c.a f30131b;

    E(Object obj) {
        this.f30130a = obj;
        this.f30131b = C2849c.f30218c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r rVar, AbstractC2857k.a aVar) {
        this.f30131b.a(rVar, aVar, this.f30130a);
    }
}
