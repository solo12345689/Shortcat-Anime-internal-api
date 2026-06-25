package V;

import b4.C2985b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2985b f19599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f19600b;

    public e(C2985b c2985b, d dVar) {
        this.f19599a = c2985b;
        this.f19600b = dVar;
    }

    public final C2985b a() {
        return this.f19599a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC5504s.c(this.f19599a, eVar.f19599a) && AbstractC5504s.c(this.f19600b, eVar.f19600b);
    }

    public int hashCode() {
        return (this.f19599a.hashCode() * 31) + this.f19600b.hashCode();
    }

    public String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f19599a + ", windowPosture=" + this.f19600b + ')';
    }
}
