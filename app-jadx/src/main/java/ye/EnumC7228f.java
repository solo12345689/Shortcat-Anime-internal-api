package ye;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ye.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC7228f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC7228f f65097b = new EnumC7228f("CLASS", 0, "class");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC7228f f65098c = new EnumC7228f("INTERFACE", 1, "interface");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC7228f f65099d = new EnumC7228f("ENUM_CLASS", 2, "enum class");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC7228f f65100e = new EnumC7228f("ENUM_ENTRY", 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC7228f f65101f = new EnumC7228f("ANNOTATION_CLASS", 4, "annotation class");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC7228f f65102g = new EnumC7228f("OBJECT", 5, "object");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC7228f[] f65103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f65104i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65105a;

    static {
        EnumC7228f[] enumC7228fArrA = a();
        f65103h = enumC7228fArrA;
        f65104i = AbstractC3048a.a(enumC7228fArrA);
    }

    private EnumC7228f(String str, int i10, String str2) {
        this.f65105a = str2;
    }

    private static final /* synthetic */ EnumC7228f[] a() {
        return new EnumC7228f[]{f65097b, f65098c, f65099d, f65100e, f65101f, f65102g};
    }

    public static EnumC7228f valueOf(String str) {
        return (EnumC7228f) Enum.valueOf(EnumC7228f.class, str);
    }

    public static EnumC7228f[] values() {
        return (EnumC7228f[]) f65103h.clone();
    }

    public final boolean b() {
        return this == f65102g || this == f65100e;
    }
}
