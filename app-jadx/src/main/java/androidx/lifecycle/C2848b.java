package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2848b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f30217a;

    public C2848b(Object obj) {
        this.f30217a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return w.Y.a(this.f30217a, obj, obj2);
    }

    public final Object b() {
        return this.f30217a.get();
    }
}
