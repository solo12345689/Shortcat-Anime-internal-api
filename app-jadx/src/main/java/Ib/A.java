package Ib;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class A implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y4.h f8877a;

    public A(Y4.h glideUrl) {
        AbstractC5504s.h(glideUrl, "glideUrl");
        this.f8877a = glideUrl;
    }

    @Override // Ib.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Ob.b a() {
        return new Ob.b(this.f8877a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && AbstractC5504s.c(this.f8877a, ((A) obj).f8877a);
    }

    public int hashCode() {
        return this.f8877a.hashCode();
    }

    public String toString() {
        return "UrlModelProvider(glideUrl=" + this.f8877a + ")";
    }
}
