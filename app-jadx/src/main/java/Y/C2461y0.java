package Y;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Y.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2461y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f22574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E1 f22575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2392b f22576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f22577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U0 f22578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f22579g;

    public C2461y0(AbstractC2455w0 abstractC2455w0, Object obj, Q q10, E1 e12, C2392b c2392b, List list, U0 u02, List list2) {
        this.f22573a = obj;
        this.f22574b = q10;
        this.f22575c = e12;
        this.f22576d = c2392b;
        this.f22577e = list;
        this.f22578f = u02;
        this.f22579g = list2;
    }

    public final C2392b a() {
        return this.f22576d;
    }

    public final Q b() {
        return this.f22574b;
    }

    public final AbstractC2455w0 c() {
        return null;
    }

    public final List d() {
        return this.f22577e;
    }

    public final U0 e() {
        return this.f22578f;
    }

    public final Object f() {
        return this.f22573a;
    }

    public final E1 g() {
        return this.f22575c;
    }

    public final void h() {
        List list = this.f22577e;
        Q q10 = this.f22574b;
        AbstractC5504s.f(q10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.f22577e = AbstractC2279u.I0(list, ((B) q10).M(this.f22576d));
    }
}
