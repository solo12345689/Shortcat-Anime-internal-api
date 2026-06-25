package Pe;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Pe.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2023h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13884e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2023h f13885f = new C2023h(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2026k f13886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC2024i f13887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13889d;

    /* JADX INFO: renamed from: Pe.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2023h a() {
            return C2023h.f13885f;
        }

        private a() {
        }
    }

    public C2023h(EnumC2026k enumC2026k, EnumC2024i enumC2024i, boolean z10, boolean z11) {
        this.f13886a = enumC2026k;
        this.f13887b = enumC2024i;
        this.f13888c = z10;
        this.f13889d = z11;
    }

    public static /* synthetic */ C2023h c(C2023h c2023h, EnumC2026k enumC2026k, EnumC2024i enumC2024i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC2026k = c2023h.f13886a;
        }
        if ((i10 & 2) != 0) {
            enumC2024i = c2023h.f13887b;
        }
        if ((i10 & 4) != 0) {
            z10 = c2023h.f13888c;
        }
        if ((i10 & 8) != 0) {
            z11 = c2023h.f13889d;
        }
        return c2023h.b(enumC2026k, enumC2024i, z10, z11);
    }

    public final C2023h b(EnumC2026k enumC2026k, EnumC2024i enumC2024i, boolean z10, boolean z11) {
        return new C2023h(enumC2026k, enumC2024i, z10, z11);
    }

    public final boolean d() {
        return this.f13888c;
    }

    public final EnumC2024i e() {
        return this.f13887b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2023h)) {
            return false;
        }
        C2023h c2023h = (C2023h) obj;
        return this.f13886a == c2023h.f13886a && this.f13887b == c2023h.f13887b && this.f13888c == c2023h.f13888c && this.f13889d == c2023h.f13889d;
    }

    public final EnumC2026k f() {
        return this.f13886a;
    }

    public final boolean g() {
        return this.f13889d;
    }

    public int hashCode() {
        EnumC2026k enumC2026k = this.f13886a;
        int iHashCode = (enumC2026k == null ? 0 : enumC2026k.hashCode()) * 31;
        EnumC2024i enumC2024i = this.f13887b;
        return ((((iHashCode + (enumC2024i != null ? enumC2024i.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13888c)) * 31) + Boolean.hashCode(this.f13889d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f13886a + ", mutability=" + this.f13887b + ", definitelyNotNull=" + this.f13888c + ", isNullabilityQualifierForWarning=" + this.f13889d + ')';
    }

    public /* synthetic */ C2023h(EnumC2026k enumC2026k, EnumC2024i enumC2024i, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC2026k, enumC2024i, z10, (i10 & 8) != 0 ? false : z11);
    }
}
