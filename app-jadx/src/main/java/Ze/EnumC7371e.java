package ze;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.AbstractC7248a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ze.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC7371e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC7371e f66204b = new EnumC7371e("ALL", 0, null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC7371e f66205c = new EnumC7371e("FIELD", 1, null, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC7371e f66206d = new EnumC7371e("FILE", 2, null, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC7371e f66207e = new EnumC7371e("PROPERTY", 3, null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC7371e f66208f = new EnumC7371e("PROPERTY_GETTER", 4, com.amazon.a.a.o.b.au);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC7371e f66209g = new EnumC7371e("PROPERTY_SETTER", 5, "set");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC7371e f66210h = new EnumC7371e("RECEIVER", 6, null, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC7371e f66211i = new EnumC7371e("CONSTRUCTOR_PARAMETER", 7, "param");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC7371e f66212j = new EnumC7371e("SETTER_PARAMETER", 8, "setparam");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC7371e f66213k = new EnumC7371e("PROPERTY_DELEGATE_FIELD", 9, "delegate");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC7371e[] f66214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f66215m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f66216a;

    static {
        EnumC7371e[] enumC7371eArrA = a();
        f66214l = enumC7371eArrA;
        f66215m = AbstractC3048a.a(enumC7371eArrA);
    }

    private EnumC7371e(String str, int i10, String str2) {
        this.f66216a = str2 == null ? AbstractC7248a.f(name()) : str2;
    }

    private static final /* synthetic */ EnumC7371e[] a() {
        return new EnumC7371e[]{f66204b, f66205c, f66206d, f66207e, f66208f, f66209g, f66210h, f66211i, f66212j, f66213k};
    }

    public static EnumC7371e valueOf(String str) {
        return (EnumC7371e) Enum.valueOf(EnumC7371e.class, str);
    }

    public static EnumC7371e[] values() {
        return (EnumC7371e[]) f66214l.clone();
    }

    public final String b() {
        return this.f66216a;
    }

    /* synthetic */ EnumC7371e(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? null : str2);
    }
}
