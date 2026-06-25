package k0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k0.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5429s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51990c;

    public C5429s(int i10, String str, String str2) {
        this.f51988a = i10;
        this.f51989b = str;
        this.f51990c = str2;
    }

    public final int a() {
        return this.f51988a;
    }

    public /* synthetic */ C5429s(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
