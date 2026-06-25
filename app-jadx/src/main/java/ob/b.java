package Ob;

import Y4.h;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f13115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Nb.b f13116b;

    public b(h glideUrl) {
        AbstractC5504s.h(glideUrl, "glideUrl");
        this.f13115a = glideUrl;
    }

    public final h a() {
        return this.f13115a;
    }

    public final Nb.b b() {
        return this.f13116b;
    }

    public final void c(Nb.b bVar) {
        this.f13116b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC5504s.c(this.f13115a, ((b) obj).f13115a);
    }

    public int hashCode() {
        return this.f13115a.hashCode();
    }

    public String toString() {
        String string = this.f13115a.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
