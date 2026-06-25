package androidx.compose.ui.platform;

import a0.C2507c;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2507c f27212a = new C2507c(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f27213b = new ReferenceQueue();

    private final void a() {
        Reference referencePoll;
        do {
            referencePoll = this.f27213b.poll();
            if (referencePoll != null) {
                this.f27212a.w(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final Object b() {
        a();
        while (this.f27212a.p() != 0) {
            Object obj = ((Reference) this.f27212a.y(r0.p() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.f27212a.c(new WeakReference(obj, this.f27213b));
    }
}
