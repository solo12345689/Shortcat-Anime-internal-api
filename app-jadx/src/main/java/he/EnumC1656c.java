package He;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: He.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC1656c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1656c f8547b = new EnumC1656c("METHOD_RETURN_TYPE", 0, "METHOD");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1656c f8548c = new EnumC1656c("VALUE_PARAMETER", 1, "PARAMETER");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1656c f8549d = new EnumC1656c("FIELD", 2, "FIELD");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1656c f8550e = new EnumC1656c("TYPE_USE", 3, "TYPE_USE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1656c f8551f = new EnumC1656c("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1656c f8552g = new EnumC1656c("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC1656c[] f8553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8554i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8555a;

    static {
        EnumC1656c[] enumC1656cArrA = a();
        f8553h = enumC1656cArrA;
        f8554i = AbstractC3048a.a(enumC1656cArrA);
    }

    private EnumC1656c(String str, int i10, String str2) {
        this.f8555a = str2;
    }

    private static final /* synthetic */ EnumC1656c[] a() {
        return new EnumC1656c[]{f8547b, f8548c, f8549d, f8550e, f8551f, f8552g};
    }

    public static EnumC1656c valueOf(String str) {
        return (EnumC1656c) Enum.valueOf(EnumC1656c.class, str);
    }

    public static EnumC1656c[] values() {
        return (EnumC1656c[]) f8553h.clone();
    }

    public final String b() {
        return this.f8555a;
    }
}
