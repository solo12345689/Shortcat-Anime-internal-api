package U0;

import U0.C2197e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements C2197e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18803a;

    public b1(String str) {
        this.f18803a = str;
    }

    public final String a() {
        return this.f18803a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && AbstractC5504s.c(this.f18803a, ((b1) obj).f18803a);
    }

    public int hashCode() {
        return this.f18803a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f18803a + ')';
    }
}
