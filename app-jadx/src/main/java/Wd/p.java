package wd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rd.d f63131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63132b;

    public p(rd.d dVar, boolean z10) {
        this.f63131a = dVar;
        this.f63132b = z10;
    }

    public final rd.d a() {
        return this.f63131a;
    }

    public final boolean b() {
        return this.f63132b;
    }

    public final rd.d c() {
        return this.f63131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC5504s.c(this.f63131a, pVar.f63131a) && this.f63132b == pVar.f63132b;
    }

    public int hashCode() {
        rd.d dVar = this.f63131a;
        return ((dVar == null ? 0 : dVar.hashCode()) * 31) + Boolean.hashCode(this.f63132b);
    }

    public String toString() {
        return "ProcessSuccessLoaderResult(availableUpdate=" + this.f63131a + ", didRollBackToEmbedded=" + this.f63132b + ")";
    }
}
