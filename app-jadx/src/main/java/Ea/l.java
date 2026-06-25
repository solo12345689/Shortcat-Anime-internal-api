package Ea;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5860d;

    public l(int i10, int i11, int i12, boolean z10) {
        this.f5857a = i10;
        this.f5858b = i11;
        this.f5859c = i12;
        this.f5860d = z10;
    }

    public final int a() {
        return this.f5858b;
    }

    public final int b() {
        return this.f5859c;
    }

    public final boolean c() {
        return this.f5860d;
    }

    public final int d() {
        return this.f5857a;
    }

    public final void e(boolean z10) {
        this.f5860d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f5857a == lVar.f5857a && this.f5858b == lVar.f5858b && this.f5859c == lVar.f5859c && this.f5860d == lVar.f5860d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f5857a) * 31) + Integer.hashCode(this.f5858b)) * 31) + Integer.hashCode(this.f5859c)) * 31) + Boolean.hashCode(this.f5860d);
    }

    public String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=" + this.f5857a + ", deferredInsetTypes=" + this.f5858b + ", dispatchMode=" + this.f5859c + ", hasTranslucentNavigationBar=" + this.f5860d + ")";
    }
}
