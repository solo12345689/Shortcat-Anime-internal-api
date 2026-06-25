package qf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class N0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N0 f57999e = new N0("INVARIANT", 0, "", true, true, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N0 f58000f = new N0("IN_VARIANCE", 1, "in", true, false, -1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final N0 f58001g = new N0("OUT_VARIANCE", 2, "out", false, true, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ N0[] f58002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f58003i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f58007d;

    static {
        N0[] n0ArrA = a();
        f58002h = n0ArrA;
        f58003i = AbstractC3048a.a(n0ArrA);
    }

    private N0(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f58004a = str2;
        this.f58005b = z10;
        this.f58006c = z11;
        this.f58007d = i11;
    }

    private static final /* synthetic */ N0[] a() {
        return new N0[]{f57999e, f58000f, f58001g};
    }

    public static N0 valueOf(String str) {
        return (N0) Enum.valueOf(N0.class, str);
    }

    public static N0[] values() {
        return (N0[]) f58002h.clone();
    }

    public final boolean b() {
        return this.f58006c;
    }

    public final String c() {
        return this.f58004a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f58004a;
    }
}
