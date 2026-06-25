package g1;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4829i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4829i f47274a = new EnumC4829i("Ltr", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC4829i f47275b = new EnumC4829i("Rtl", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC4829i[] f47276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f47277d;

    static {
        EnumC4829i[] enumC4829iArrA = a();
        f47276c = enumC4829iArrA;
        f47277d = AbstractC3048a.a(enumC4829iArrA);
    }

    private EnumC4829i(String str, int i10) {
    }

    private static final /* synthetic */ EnumC4829i[] a() {
        return new EnumC4829i[]{f47274a, f47275b};
    }

    public static EnumC4829i valueOf(String str) {
        return (EnumC4829i) Enum.valueOf(EnumC4829i.class, str);
    }

    public static EnumC4829i[] values() {
        return (EnumC4829i[]) f47276c.clone();
    }
}
