package He;

import Pe.C2027l;
import Pe.EnumC2026k;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2027l f8579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f8580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8581c;

    public w(C2027l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC5504s.h(nullabilityQualifier, "nullabilityQualifier");
        AbstractC5504s.h(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f8579a = nullabilityQualifier;
        this.f8580b = qualifierApplicabilityTypes;
        this.f8581c = z10;
    }

    public static /* synthetic */ w b(w wVar, C2027l c2027l, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2027l = wVar.f8579a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f8580b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f8581c;
        }
        return wVar.a(c2027l, collection, z10);
    }

    public final w a(C2027l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC5504s.h(nullabilityQualifier, "nullabilityQualifier");
        AbstractC5504s.h(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new w(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f8581c;
    }

    public final C2027l d() {
        return this.f8579a;
    }

    public final Collection e() {
        return this.f8580b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC5504s.c(this.f8579a, wVar.f8579a) && AbstractC5504s.c(this.f8580b, wVar.f8580b) && this.f8581c == wVar.f8581c;
    }

    public int hashCode() {
        return (((this.f8579a.hashCode() * 31) + this.f8580b.hashCode()) * 31) + Boolean.hashCode(this.f8581c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f8579a + ", qualifierApplicabilityTypes=" + this.f8580b + ", definitelyNotNull=" + this.f8581c + ')';
    }

    public /* synthetic */ w(C2027l c2027l, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2027l, collection, (i10 & 4) != 0 ? c2027l.c() == EnumC2026k.f13900c : z10);
    }
}
