package fe;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f47010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f47011b;

    public g(File root, List segments) {
        AbstractC5504s.h(root, "root");
        AbstractC5504s.h(segments, "segments");
        this.f47010a = root;
        this.f47011b = segments;
    }

    public final File a() {
        return this.f47010a;
    }

    public final List b() {
        return this.f47011b;
    }

    public final int c() {
        return this.f47011b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC5504s.c(this.f47010a, gVar.f47010a) && AbstractC5504s.c(this.f47011b, gVar.f47011b);
    }

    public int hashCode() {
        return (this.f47010a.hashCode() * 31) + this.f47011b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f47010a + ", segments=" + this.f47011b + ')';
    }
}
