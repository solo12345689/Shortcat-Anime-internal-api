package Pe;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Pe.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2027l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2026k f13904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13905b;

    public C2027l(EnumC2026k qualifier, boolean z10) {
        AbstractC5504s.h(qualifier, "qualifier");
        this.f13904a = qualifier;
        this.f13905b = z10;
    }

    public static /* synthetic */ C2027l b(C2027l c2027l, EnumC2026k enumC2026k, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC2026k = c2027l.f13904a;
        }
        if ((i10 & 2) != 0) {
            z10 = c2027l.f13905b;
        }
        return c2027l.a(enumC2026k, z10);
    }

    public final C2027l a(EnumC2026k qualifier, boolean z10) {
        AbstractC5504s.h(qualifier, "qualifier");
        return new C2027l(qualifier, z10);
    }

    public final EnumC2026k c() {
        return this.f13904a;
    }

    public final boolean d() {
        return this.f13905b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2027l)) {
            return false;
        }
        C2027l c2027l = (C2027l) obj;
        return this.f13904a == c2027l.f13904a && this.f13905b == c2027l.f13905b;
    }

    public int hashCode() {
        return (this.f13904a.hashCode() * 31) + Boolean.hashCode(this.f13905b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f13904a + ", isForWarningOnly=" + this.f13905b + ')';
    }

    public /* synthetic */ C2027l(EnumC2026k enumC2026k, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC2026k, (i10 & 2) != 0 ? false : z10);
    }
}
