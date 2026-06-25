package sd;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6451a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC6451a f59345a = new EnumC6451a("SHA256", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumC6451a[] f59346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f59347c;

    static {
        EnumC6451a[] enumC6451aArrA = a();
        f59346b = enumC6451aArrA;
        f59347c = AbstractC3048a.a(enumC6451aArrA);
    }

    private EnumC6451a(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6451a[] a() {
        return new EnumC6451a[]{f59345a};
    }

    public static EnumC6451a valueOf(String str) {
        return (EnumC6451a) Enum.valueOf(EnumC6451a.class, str);
    }

    public static EnumC6451a[] values() {
        return (EnumC6451a[]) f59346b.clone();
    }
}
