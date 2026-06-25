package pe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pe.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6031u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC6031u f56023a = new EnumC6031u("PUBLIC", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6031u f56024b = new EnumC6031u("PROTECTED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6031u f56025c = new EnumC6031u("INTERNAL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6031u f56026d = new EnumC6031u("PRIVATE", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC6031u[] f56027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f56028f;

    static {
        EnumC6031u[] enumC6031uArrA = a();
        f56027e = enumC6031uArrA;
        f56028f = AbstractC3048a.a(enumC6031uArrA);
    }

    private EnumC6031u(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6031u[] a() {
        return new EnumC6031u[]{f56023a, f56024b, f56025c, f56026d};
    }

    public static EnumC6031u valueOf(String str) {
        return (EnumC6031u) Enum.valueOf(EnumC6031u.class, str);
    }

    public static EnumC6031u[] values() {
        return (EnumC6031u[]) f56027e.clone();
    }
}
