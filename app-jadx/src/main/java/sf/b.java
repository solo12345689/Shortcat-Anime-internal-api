package sf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f59593b = new b("ERROR_CLASS", 0, "<Error class: %s>");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f59594c = new b("ERROR_FUNCTION", 1, "<Error function>");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f59595d = new b("ERROR_SCOPE", 2, "<Error scope>");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f59596e = new b("ERROR_MODULE", 3, "<Error module>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f59597f = new b("ERROR_PROPERTY", 4, "<Error property>");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f59598g = new b("ERROR_TYPE", 5, "[Error type: %s]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f59599h = new b("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ b[] f59600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f59601j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59602a;

    static {
        b[] bVarArrA = a();
        f59600i = bVarArrA;
        f59601j = AbstractC3048a.a(bVarArrA);
    }

    private b(String str, int i10, String str2) {
        this.f59602a = str2;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f59593b, f59594c, f59595d, f59596e, f59597f, f59598g, f59599h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f59600i.clone();
    }

    public final String b() {
        return this.f59602a;
    }
}
