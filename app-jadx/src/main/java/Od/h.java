package Od;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f13153a;

    public h(WeakReference ref) {
        AbstractC5504s.h(ref, "ref");
        this.f13153a = ref;
    }

    public final WeakReference a() {
        return this.f13153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC5504s.c(this.f13153a, ((h) obj).f13153a);
    }

    public int hashCode() {
        return this.f13153a.hashCode();
    }

    public String toString() {
        return "WeakDomWebViewRef(ref=" + this.f13153a + ")";
    }
}
