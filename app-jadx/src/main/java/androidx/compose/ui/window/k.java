package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f27844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f27845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27847f;

    public k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13, String str) {
        this.f27842a = z10;
        this.f27843b = z11;
        this.f27844c = uVar;
        this.f27845d = z12;
        this.f27846e = z13;
        this.f27847f = str;
    }

    public final boolean a() {
        return this.f27846e;
    }

    public final boolean b() {
        return this.f27842a;
    }

    public final boolean c() {
        return this.f27843b;
    }

    public final u d() {
        return this.f27844c;
    }

    public final boolean e() {
        return this.f27845d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f27842a == kVar.f27842a && this.f27843b == kVar.f27843b && this.f27844c == kVar.f27844c && this.f27845d == kVar.f27845d && this.f27846e == kVar.f27846e;
    }

    public final String f() {
        return this.f27847f;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f27842a) * 31) + Boolean.hashCode(this.f27843b)) * 31) + this.f27844c.hashCode()) * 31) + Boolean.hashCode(this.f27845d)) * 31) + Boolean.hashCode(this.f27846e);
    }

    public /* synthetic */ k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? u.f27897a : uVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? "" : str);
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public k(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, u.f27897a, z12, true, null, 32, null);
    }

    public /* synthetic */ k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? u.f27897a : uVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public /* synthetic */ k(boolean z10, boolean z11, u uVar, boolean z12, boolean z13) {
        this(z10, z11, u.f27897a, z12, true, "");
    }
}
