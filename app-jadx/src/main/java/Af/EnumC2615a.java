package af;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: af.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2615a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2615a f23965c = new EnumC2615a("NO_ARGUMENTS", 0, false, false, 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2615a f23966d = new EnumC2615a("UNLESS_EMPTY", 1, true, false, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC2615a f23967e = new EnumC2615a("ALWAYS_PARENTHESIZED", 2, true, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC2615a[] f23968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f23969g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23971b;

    static {
        EnumC2615a[] enumC2615aArrA = a();
        f23968f = enumC2615aArrA;
        f23969g = AbstractC3048a.a(enumC2615aArrA);
    }

    private EnumC2615a(String str, int i10, boolean z10, boolean z11) {
        this.f23970a = z10;
        this.f23971b = z11;
    }

    private static final /* synthetic */ EnumC2615a[] a() {
        return new EnumC2615a[]{f23965c, f23966d, f23967e};
    }

    public static EnumC2615a valueOf(String str) {
        return (EnumC2615a) Enum.valueOf(EnumC2615a.class, str);
    }

    public static EnumC2615a[] values() {
        return (EnumC2615a[]) f23968f.clone();
    }

    public final boolean b() {
        return this.f23970a;
    }

    public final boolean c() {
        return this.f23971b;
    }

    /* synthetic */ EnumC2615a(String str, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
