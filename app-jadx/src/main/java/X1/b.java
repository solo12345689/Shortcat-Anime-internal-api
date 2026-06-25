package X1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f21608a;

    public b(boolean z10) {
        this.f21608a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f21608a.get();
    }

    public final void b(boolean z10) {
        this.f21608a.set(z10);
    }
}
