package expo.modules.fetch;

import dg.C;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C f46092a;

    public c(C c10) {
        this.f46092a = c10;
    }

    public final void a(C c10) {
        this.f46092a = c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC5504s.c(this.f46092a, ((c) obj).f46092a);
    }

    public int hashCode() {
        C c10 = this.f46092a;
        if (c10 == null) {
            return 0;
        }
        return c10.hashCode();
    }

    public String toString() {
        return "RequestHolder(request=" + this.f46092a + ")";
    }
}
