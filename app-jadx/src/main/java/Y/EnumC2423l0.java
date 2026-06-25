package Y;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Y.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2423l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2423l0 f22361a = new EnumC2423l0("IGNORED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2423l0 f22362b = new EnumC2423l0("SCHEDULED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2423l0 f22363c = new EnumC2423l0("DEFERRED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2423l0 f22364d = new EnumC2423l0("IMMINENT", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC2423l0[] f22365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f22366f;

    static {
        EnumC2423l0[] enumC2423l0ArrA = a();
        f22365e = enumC2423l0ArrA;
        f22366f = AbstractC3048a.a(enumC2423l0ArrA);
    }

    private EnumC2423l0(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2423l0[] a() {
        return new EnumC2423l0[]{f22361a, f22362b, f22363c, f22364d};
    }

    public static EnumC2423l0 valueOf(String str) {
        return (EnumC2423l0) Enum.valueOf(EnumC2423l0.class, str);
    }

    public static EnumC2423l0[] values() {
        return (EnumC2423l0[]) f22365e.clone();
    }
}
