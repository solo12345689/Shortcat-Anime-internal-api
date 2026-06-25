package Z0;

import Y0.AbstractC2468c;
import Y0.F;
import Y0.H;
import Y0.K;
import Y0.L;
import Z0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC2468c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.a f23110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L f23111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f23113h;

    public /* synthetic */ d(String str, c.a aVar, L l10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, l10, i10, z10);
    }

    private final String f() {
        return this.f23113h ? com.amazon.a.a.o.b.f34640af : com.amazon.a.a.o.b.f34641ag;
    }

    private final int h(int i10) {
        return H.f(i10, H.f22594b.a()) ? 1 : 0;
    }

    @Override // Y0.InterfaceC2484t
    public L b() {
        return this.f23111f;
    }

    @Override // Y0.InterfaceC2484t
    public int c() {
        return this.f23112g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC5504s.c(this.f23109d, dVar.f23109d) && AbstractC5504s.c(this.f23110e, dVar.f23110e) && AbstractC5504s.c(b(), dVar.b()) && H.f(c(), dVar.c()) && this.f23113h == dVar.f23113h;
    }

    public final H1.f g() {
        String str = "name=" + this.f23109d + "&weight=" + b().v() + "&italic=" + h(c()) + "&besteffort=" + f();
        List listA = this.f23110e.a();
        return listA != null ? new H1.f(this.f23110e.c(), this.f23110e.d(), str, listA) : new H1.f(this.f23110e.c(), this.f23110e.d(), str, this.f23110e.b());
    }

    public int hashCode() {
        return (((((((this.f23109d.hashCode() * 31) + this.f23110e.hashCode()) * 31) + b().hashCode()) * 31) + H.g(c())) * 31) + Boolean.hashCode(this.f23113h);
    }

    public final int i() {
        boolean zF = H.f(c(), H.f22594b.a());
        boolean z10 = b().compareTo(L.f22613b.b()) >= 0;
        if (zF && z10) {
            return 3;
        }
        if (zF) {
            return 2;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return "Font(GoogleFont(\"" + this.f23109d + "\", bestEffort=" + this.f23113h + "), weight=" + b() + ", style=" + ((Object) H.h(c())) + ')';
    }

    private d(String str, c.a aVar, L l10, int i10, boolean z10) {
        super(F.f22590a.a(), f.f23114a, new K.d(new K.a[0]), null);
        this.f23109d = str;
        this.f23110e = aVar;
        this.f23111f = l10;
        this.f23112g = i10;
        this.f23113h = z10;
    }
}
