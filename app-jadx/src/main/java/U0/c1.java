package U0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18804a;

    public c1(String str) {
        super(null);
        this.f18804a = str;
    }

    public final String a() {
        return this.f18804a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && AbstractC5504s.c(this.f18804a, ((c1) obj).f18804a);
    }

    public int hashCode() {
        return this.f18804a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f18804a + ')';
    }
}
