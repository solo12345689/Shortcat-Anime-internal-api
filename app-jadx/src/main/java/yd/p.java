package yd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f65052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f65053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f65054c;

    public p(n responseHeaderData, o responsePartHeaderData, String body) {
        AbstractC5504s.h(responseHeaderData, "responseHeaderData");
        AbstractC5504s.h(responsePartHeaderData, "responsePartHeaderData");
        AbstractC5504s.h(body, "body");
        this.f65052a = responseHeaderData;
        this.f65053b = responsePartHeaderData;
        this.f65054c = body;
    }

    public final String a() {
        return this.f65054c;
    }

    public final n b() {
        return this.f65052a;
    }

    public final o c() {
        return this.f65053b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC5504s.c(this.f65052a, pVar.f65052a) && AbstractC5504s.c(this.f65053b, pVar.f65053b) && AbstractC5504s.c(this.f65054c, pVar.f65054c);
    }

    public int hashCode() {
        return (((this.f65052a.hashCode() * 31) + this.f65053b.hashCode()) * 31) + this.f65054c.hashCode();
    }

    public String toString() {
        return "ResponsePartInfo(responseHeaderData=" + this.f65052a + ", responsePartHeaderData=" + this.f65053b + ", body=" + this.f65054c + ")";
    }
}
