package sf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f59614b = new h("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f59615c = new h("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f59616d = new h("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f59617e = new h("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f59618f = new h("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f59619g = new h("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f59620h = new h("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f59621i = new h("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f59622j = new h("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f59623k = new h("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ h[] f59624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f59625m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59626a;

    static {
        h[] hVarArrA = a();
        f59624l = hVarArrA;
        f59625m = AbstractC3048a.a(hVarArrA);
    }

    private h(String str, int i10, String str2) {
        this.f59626a = str2;
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f59614b, f59615c, f59616d, f59617e, f59618f, f59619g, f59620h, f59621i, f59622j, f59623k};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f59624l.clone();
    }

    public final String b() {
        return this.f59626a;
    }
}
