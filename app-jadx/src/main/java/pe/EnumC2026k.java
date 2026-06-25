package Pe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pe.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2026k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2026k f13898a = new EnumC2026k("FORCE_FLEXIBILITY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2026k f13899b = new EnumC2026k("NULLABLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2026k f13900c = new EnumC2026k("NOT_NULL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2026k[] f13901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13902e;

    static {
        EnumC2026k[] enumC2026kArrA = a();
        f13901d = enumC2026kArrA;
        f13902e = AbstractC3048a.a(enumC2026kArrA);
    }

    private EnumC2026k(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2026k[] a() {
        return new EnumC2026k[]{f13898a, f13899b, f13900c};
    }

    public static EnumC2026k valueOf(String str) {
        return (EnumC2026k) Enum.valueOf(EnumC2026k.class, str);
    }

    public static EnumC2026k[] values() {
        return (EnumC2026k[]) f13901d.clone();
    }
}
