package c7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f33527b = new b("CONSOLE", 0, "console");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f33528c = new b("MEMORY", 1, "heap-profiler");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f33529d = new b("NETWORK", 2, "network");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f33530e = new b("PERFORMANCE", 3, "timeline");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f33531f = new b("REACT_COMPONENTS", 4, "react-devtools-components");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f33532g = new b("REACT_PROFILER", 5, "react-devtools-profiler");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f33533h = new b("SOURCES", 6, "sources");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f33534i = new b("WELCOME", 7, "rn-welcome");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f33535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33536k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33537a;

    static {
        b[] bVarArrA = a();
        f33535j = bVarArrA;
        f33536k = AbstractC3048a.a(bVarArrA);
    }

    private b(String str, int i10, String str2) {
        this.f33537a = str2;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f33527b, f33528c, f33529d, f33530e, f33531f, f33532g, f33533h, f33534i};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f33535j.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f33537a;
    }
}
