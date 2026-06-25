package I0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1688n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1688n f8716a = new EnumC1688n("Min", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1688n f8717b = new EnumC1688n("Max", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC1688n[] f8718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8719d;

    static {
        EnumC1688n[] enumC1688nArrA = a();
        f8718c = enumC1688nArrA;
        f8719d = AbstractC3048a.a(enumC1688nArrA);
    }

    private EnumC1688n(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1688n[] a() {
        return new EnumC1688n[]{f8716a, f8717b};
    }

    public static EnumC1688n valueOf(String str) {
        return (EnumC1688n) Enum.valueOf(EnumC1688n.class, str);
    }

    public static EnumC1688n[] values() {
        return (EnumC1688n[]) f8718c.clone();
    }
}
