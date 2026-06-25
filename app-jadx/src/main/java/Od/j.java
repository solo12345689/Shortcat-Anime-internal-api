package od;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f55388a = new j("VALID", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f55389b = new j("INVALID", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f55390c = new j("SKIPPED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f55391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f55392e;

    static {
        j[] jVarArrA = a();
        f55391d = jVarArrA;
        f55392e = AbstractC3048a.a(jVarArrA);
    }

    private j(String str, int i10) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f55388a, f55389b, f55390c};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f55391d.clone();
    }
}
