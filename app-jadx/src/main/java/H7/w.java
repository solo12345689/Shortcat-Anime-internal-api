package H7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f8141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f8142b;

    public w(Integer num, Float f10) {
        this.f8141a = num;
        this.f8142b = f10;
    }

    public final Integer a() {
        return this.f8141a;
    }

    public final Float b() {
        return this.f8142b;
    }

    public final void c(Integer num) {
        this.f8141a = num;
    }

    public /* synthetic */ w(Integer num, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : f10);
    }
}
