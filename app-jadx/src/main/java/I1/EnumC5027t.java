package i1;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i1.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5027t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC5027t f48573a = new EnumC5027t("Ltr", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC5027t f48574b = new EnumC5027t("Rtl", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5027t[] f48575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f48576d;

    static {
        EnumC5027t[] enumC5027tArrA = a();
        f48575c = enumC5027tArrA;
        f48576d = AbstractC3048a.a(enumC5027tArrA);
    }

    private EnumC5027t(String str, int i10) {
    }

    private static final /* synthetic */ EnumC5027t[] a() {
        return new EnumC5027t[]{f48573a, f48574b};
    }

    public static EnumC5027t valueOf(String str) {
        return (EnumC5027t) Enum.valueOf(EnumC5027t.class, str);
    }

    public static EnumC5027t[] values() {
        return (EnumC5027t[]) f48575c.clone();
    }
}
