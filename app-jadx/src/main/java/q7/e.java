package Q7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f14385b = new e("Unknown", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f14386c = new e("Rendered", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f14387d = new e("None", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f14388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14389f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14390a;

    static {
        e[] eVarArrA = a();
        f14388e = eVarArrA;
        f14389f = AbstractC3048a.a(eVarArrA);
    }

    private e(String str, int i10, int i11) {
        this.f14390a = i11;
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f14385b, f14386c, f14387d};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f14388e.clone();
    }
}
