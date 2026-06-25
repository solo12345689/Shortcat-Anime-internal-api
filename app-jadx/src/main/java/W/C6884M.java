package w;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6884M implements InterfaceC6904i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62376d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6874C f62377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC6891b0 f62378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f62379c;

    public /* synthetic */ C6884M(InterfaceC6874C interfaceC6874C, EnumC6891b0 enumC6891b0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6874C, enumC6891b0, j10);
    }

    @Override // w.InterfaceC6904i
    public v0 a(s0 s0Var) {
        return new C0(this.f62377a.a(s0Var), this.f62378b, this.f62379c, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6884M) {
            C6884M c6884m = (C6884M) obj;
            if (AbstractC5504s.c(c6884m.f62377a, this.f62377a) && c6884m.f62378b == this.f62378b && k0.d(c6884m.f62379c, this.f62379c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f62377a.hashCode() * 31) + this.f62378b.hashCode()) * 31) + k0.e(this.f62379c);
    }

    private C6884M(InterfaceC6874C interfaceC6874C, EnumC6891b0 enumC6891b0, long j10) {
        this.f62377a = interfaceC6874C;
        this.f62378b = enumC6891b0;
        this.f62379c = j10;
    }
}
