package Pe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pe.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2024i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2024i f13891a = new EnumC2024i("READ_ONLY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2024i f13892b = new EnumC2024i("MUTABLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC2024i[] f13893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13894d;

    static {
        EnumC2024i[] enumC2024iArrA = a();
        f13893c = enumC2024iArrA;
        f13894d = AbstractC3048a.a(enumC2024iArrA);
    }

    private EnumC2024i(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2024i[] a() {
        return new EnumC2024i[]{f13891a, f13892b};
    }

    public static EnumC2024i valueOf(String str) {
        return (EnumC2024i) Enum.valueOf(EnumC2024i.class, str);
    }

    public static EnumC2024i[] values() {
        return (EnumC2024i[]) f13893c.clone();
    }
}
