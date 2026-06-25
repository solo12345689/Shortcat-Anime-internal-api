package Y;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22159a;

    public I0(String str) {
        this.f22159a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && AbstractC5504s.c(this.f22159a, ((I0) obj).f22159a);
    }

    public int hashCode() {
        return this.f22159a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f22159a + ')';
    }
}
