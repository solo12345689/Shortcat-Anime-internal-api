package nd;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5782f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC5782f f54120a = new EnumC5782f("VALID", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC5782f f54121b = new EnumC5782f("INVALID_NOT_ENABLED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC5782f f54122c = new EnumC5782f("INVALID_MISSING_URL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC5782f f54123d = new EnumC5782f("INVALID_MISSING_RUNTIME_VERSION", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC5782f[] f54124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f54125f;

    static {
        EnumC5782f[] enumC5782fArrA = a();
        f54124e = enumC5782fArrA;
        f54125f = AbstractC3048a.a(enumC5782fArrA);
    }

    private EnumC5782f(String str, int i10) {
    }

    private static final /* synthetic */ EnumC5782f[] a() {
        return new EnumC5782f[]{f54120a, f54121b, f54122c, f54123d};
    }

    public static EnumC5782f valueOf(String str) {
        return (EnumC5782f) Enum.valueOf(EnumC5782f.class, str);
    }

    public static EnumC5782f[] values() {
        return (EnumC5782f[]) f54124e.clone();
    }
}
