package Md;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class o extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12394a;

    public o(Object obj) {
        super(obj);
        this.f12394a = obj != null ? obj.hashCode() : 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this == obj || AbstractC5504s.c(get(), ((o) obj).get());
        }
        return false;
    }

    public int hashCode() {
        return this.f12394a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj, ReferenceQueue q10) {
        super(obj, q10);
        AbstractC5504s.h(q10, "q");
        this.f12394a = obj != null ? obj.hashCode() : 0;
    }
}
