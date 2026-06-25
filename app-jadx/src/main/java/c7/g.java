package c7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f33538b = new g("JS", 0, "JS");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f33539c = new g("NATIVE", 1, "Native");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ g[] f33540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33541e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33542a;

    static {
        g[] gVarArrA = a();
        f33540d = gVarArrA;
        f33541e = AbstractC3048a.a(gVarArrA);
    }

    private g(String str, int i10, String str2) {
        this.f33542a = str2;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f33538b, f33539c};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f33540d.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f33542a;
    }
}
