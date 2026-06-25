package Y0;

import Y0.K;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements InterfaceC2484t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f22661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K.d f22663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22664e;

    public /* synthetic */ f0(int i10, L l10, int i11, K.d dVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, l10, i11, dVar, i12);
    }

    @Override // Y0.InterfaceC2484t
    public int a() {
        return this.f22664e;
    }

    @Override // Y0.InterfaceC2484t
    public L b() {
        return this.f22661b;
    }

    @Override // Y0.InterfaceC2484t
    public int c() {
        return this.f22662c;
    }

    public final int d() {
        return this.f22660a;
    }

    public final K.d e() {
        return this.f22663d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f22660a == f0Var.f22660a && AbstractC5504s.c(b(), f0Var.b()) && H.f(c(), f0Var.c()) && AbstractC5504s.c(this.f22663d, f0Var.f22663d) && F.e(a(), f0Var.a());
    }

    public int hashCode() {
        return (((((((this.f22660a * 31) + b().hashCode()) * 31) + H.g(c())) * 31) + F.f(a())) * 31) + this.f22663d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f22660a + ", weight=" + b() + ", style=" + ((Object) H.h(c())) + ", loadingStrategy=" + ((Object) F.g(a())) + ')';
    }

    private f0(int i10, L l10, int i11, K.d dVar, int i12) {
        this.f22660a = i10;
        this.f22661b = l10;
        this.f22662c = i11;
        this.f22663d = dVar;
        this.f22664e = i12;
    }
}
