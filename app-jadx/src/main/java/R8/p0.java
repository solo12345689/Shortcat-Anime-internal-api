package R8;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f15348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15350e;

    public p0(ComponentName componentName, int i10) {
        this.f15346a = null;
        this.f15347b = null;
        AbstractC2115p.l(componentName);
        this.f15348c = componentName;
        this.f15349d = 4225;
        this.f15350e = false;
    }

    public final String a() {
        return this.f15346a;
    }

    public final String b() {
        return this.f15347b;
    }

    public final ComponentName c() {
        return this.f15348c;
    }

    public final boolean d() {
        return this.f15350e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC2113n.a(this.f15346a, p0Var.f15346a) && AbstractC2113n.a(this.f15347b, p0Var.f15347b) && AbstractC2113n.a(this.f15348c, p0Var.f15348c) && this.f15350e == p0Var.f15350e;
    }

    public final int hashCode() {
        return AbstractC2113n.b(this.f15346a, this.f15347b, this.f15348c, 4225, Boolean.valueOf(this.f15350e));
    }

    public final String toString() {
        String str = this.f15346a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f15348c;
        AbstractC2115p.l(componentName);
        return componentName.flattenToString();
    }

    public p0(String str, String str2, int i10, boolean z10) {
        AbstractC2115p.f(str);
        this.f15346a = str;
        AbstractC2115p.f(str2);
        this.f15347b = str2;
        this.f15348c = null;
        this.f15349d = 4225;
        this.f15350e = z10;
    }
}
