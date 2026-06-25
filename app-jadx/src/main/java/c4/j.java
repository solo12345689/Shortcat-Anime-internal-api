package c4;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33503a;

    public j(List displayFeatures) {
        AbstractC5504s.h(displayFeatures, "displayFeatures");
        this.f33503a = displayFeatures;
    }

    public final List a() {
        return this.f33503a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC5504s.c(j.class, obj.getClass())) {
            return false;
        }
        return AbstractC5504s.c(this.f33503a, ((j) obj).f33503a);
    }

    public int hashCode() {
        return this.f33503a.hashCode();
    }

    public String toString() {
        return AbstractC2279u.w0(this.f33503a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
