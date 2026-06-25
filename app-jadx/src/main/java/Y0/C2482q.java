package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2482q extends AbstractC2468c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L f22712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22713f;

    public /* synthetic */ C2482q(String str, L l10, int i10, K.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l10, i10, dVar);
    }

    @Override // Y0.InterfaceC2484t
    public L b() {
        return this.f22712e;
    }

    @Override // Y0.InterfaceC2484t
    public int c() {
        return this.f22713f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2482q)) {
            return false;
        }
        C2482q c2482q = (C2482q) obj;
        return AbstractC2481p.b(this.f22711d, c2482q.f22711d) && AbstractC5504s.c(b(), c2482q.b()) && H.f(c(), c2482q.c()) && AbstractC5504s.c(e(), c2482q.e());
    }

    public final Typeface f(Context context) {
        return e0.a().a(this.f22711d, b(), c(), e(), context);
    }

    public int hashCode() {
        return (((((AbstractC2481p.c(this.f22711d) * 31) + b().hashCode()) * 31) + H.g(c())) * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) AbstractC2481p.d(this.f22711d)) + "\", weight=" + b() + ", style=" + ((Object) H.h(c())) + ')';
    }

    private C2482q(String str, L l10, int i10, K.d dVar) {
        super(F.f22590a.c(), S.f22639a, dVar, null);
        this.f22711d = str;
        this.f22712e = l10;
        this.f22713f = i10;
    }
}
