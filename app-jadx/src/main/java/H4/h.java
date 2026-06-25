package H4;

import H4.c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7920c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f7921d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f7922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7923b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        c.b bVar = c.b.f7910a;
        f7921d = new h(bVar, bVar);
    }

    public h(c cVar, c cVar2) {
        this.f7922a = cVar;
        this.f7923b = cVar2;
    }

    public final c a() {
        return this.f7923b;
    }

    public final c b() {
        return this.f7922a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC5504s.c(this.f7922a, hVar.f7922a) && AbstractC5504s.c(this.f7923b, hVar.f7923b);
    }

    public int hashCode() {
        return (this.f7922a.hashCode() * 31) + this.f7923b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f7922a + ", height=" + this.f7923b + ')';
    }
}
