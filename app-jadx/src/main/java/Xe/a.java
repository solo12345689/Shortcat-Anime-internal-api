package Xe;

import Df.r;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0376a f21751f = new C0376a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f21752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f21753h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f21754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f21755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f21757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f21758e;

    /* JADX INFO: renamed from: Xe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0376a {
        public /* synthetic */ C0376a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0376a() {
        }
    }

    static {
        f fVar = h.f21792m;
        f21752g = fVar;
        f21753h = c.f21763c.a(fVar);
    }

    private a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f21754a = cVar;
        this.f21755b = cVar2;
        this.f21756c = fVar;
        this.f21757d = bVar;
        this.f21758e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC5504s.c(this.f21754a, aVar.f21754a) && AbstractC5504s.c(this.f21755b, aVar.f21755b) && AbstractC5504s.c(this.f21756c, aVar.f21756c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f21754a.hashCode()) * 31;
        c cVar = this.f21755b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f21756c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r.J(this.f21754a.a(), com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null));
        sb2.append("/");
        c cVar = this.f21755b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f21756c);
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c packageName, f callableName) {
        this(packageName, null, callableName, null, null);
        AbstractC5504s.h(packageName, "packageName");
        AbstractC5504s.h(callableName, "callableName");
    }
}
