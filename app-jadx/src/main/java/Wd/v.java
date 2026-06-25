package wd;

import kotlin.jvm.internal.AbstractC5504s;
import wd.w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yd.n f63154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f63155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w.a f63156c;

    public v(yd.n nVar, w.b bVar, w.a aVar) {
        this.f63154a = nVar;
        this.f63155b = bVar;
        this.f63156c = aVar;
    }

    public final w.a a() {
        return this.f63156c;
    }

    public final w.b b() {
        return this.f63155b;
    }

    public final yd.n c() {
        return this.f63154a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return AbstractC5504s.c(this.f63154a, vVar.f63154a) && AbstractC5504s.c(this.f63155b, vVar.f63155b) && AbstractC5504s.c(this.f63156c, vVar.f63156c);
    }

    public int hashCode() {
        yd.n nVar = this.f63154a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        w.b bVar = this.f63155b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        w.a aVar = this.f63156c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "UpdateResponse(responseHeaderData=" + this.f63154a + ", manifestUpdateResponsePart=" + this.f63155b + ", directiveUpdateResponsePart=" + this.f63156c + ")";
    }
}
