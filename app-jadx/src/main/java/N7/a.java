package N7;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u7.EnumC6741a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0197a f12684f = new C0197a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC6741a f12686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f12687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f12688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12689e;

    /* JADX INFO: renamed from: N7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0197a {
        public /* synthetic */ C0197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            AbstractC5504s.h(context, "context");
            return new a(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", 0.0d, 0.0d, EnumC6741a.f61402a, 12, null);
        }

        private C0197a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, null, 28, null);
        AbstractC5504s.h(context, "context");
    }

    private final Uri a(Context context) {
        this.f12689e = true;
        return c.f(context, this.f12685a);
    }

    private final Uri b(Context context) {
        try {
            Uri uriA = Uri.parse(this.f12685a);
            if (uriA.getScheme() == null) {
                uriA = a(context);
            }
            AbstractC5504s.e(uriA);
            return uriA;
        } catch (NullPointerException unused) {
            return a(context);
        }
    }

    public final EnumC6741a c() {
        return this.f12686b;
    }

    public final double d() {
        return this.f12688d;
    }

    public final String e() {
        return this.f12685a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC5504s.c(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (Double.compare(aVar.f12688d, this.f12688d) == 0 && g() == aVar.g() && AbstractC5504s.c(f(), aVar.f()) && AbstractC5504s.c(this.f12685a, aVar.f12685a) && this.f12686b == aVar.f12686b) {
                return true;
            }
        }
        return false;
    }

    public Uri f() {
        return this.f12687c;
    }

    public boolean g() {
        return this.f12689e;
    }

    public int hashCode() {
        return Objects.hash(f(), this.f12685a, Double.valueOf(this.f12688d), Boolean.valueOf(g()), this.f12686b);
    }

    public a(Context context, String str, double d10, double d11, EnumC6741a cacheControl) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(cacheControl, "cacheControl");
        this.f12685a = str;
        this.f12686b = cacheControl;
        this.f12687c = b(context);
        this.f12688d = d10 * d11;
    }

    public /* synthetic */ a(Context context, String str, double d10, double d11, EnumC6741a enumC6741a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11, (i10 & 16) != 0 ? EnumC6741a.f61402a : enumC6741a);
    }
}
