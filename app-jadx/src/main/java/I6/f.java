package I6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8854b;

    public f(boolean z10, boolean z11) {
        this.f8853a = z10;
        this.f8854b = z11;
    }

    public final boolean a() {
        return this.f8853a;
    }

    public final boolean b() {
        return this.f8854b;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
