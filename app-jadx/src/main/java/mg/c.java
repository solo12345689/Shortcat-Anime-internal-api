package mg;

import com.revenuecat.purchases.common.Constants;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6686k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f53504d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C6686k f53505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C6686k f53506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C6686k f53507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C6686k f53508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C6686k f53509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C6686k f53510j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6686k f53511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6686k f53512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53513c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C6686k.a aVar = C6686k.f61044d;
        f53505e = aVar.g(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        f53506f = aVar.g(":status");
        f53507g = aVar.g(":method");
        f53508h = aVar.g(":path");
        f53509i = aVar.g(":scheme");
        f53510j = aVar.g(":authority");
    }

    public c(C6686k name, C6686k value) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(value, "value");
        this.f53511a = name;
        this.f53512b = value;
        this.f53513c = name.K() + 32 + value.K();
    }

    public final C6686k a() {
        return this.f53511a;
    }

    public final C6686k b() {
        return this.f53512b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC5504s.c(this.f53511a, cVar.f53511a) && AbstractC5504s.c(this.f53512b, cVar.f53512b);
    }

    public int hashCode() {
        return (this.f53511a.hashCode() * 31) + this.f53512b.hashCode();
    }

    public String toString() {
        return this.f53511a.Q() + ": " + this.f53512b.Q();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(value, "value");
        C6686k.a aVar = C6686k.f61044d;
        this(aVar.g(name), aVar.g(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(C6686k name, String value) {
        this(name, C6686k.f61044d.g(value));
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(value, "value");
    }
}
