package fe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f47036a = new j("TOP_DOWN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f47037b = new j("BOTTOM_UP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ j[] f47038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f47039d;

    static {
        j[] jVarArrA = a();
        f47038c = jVarArrA;
        f47039d = AbstractC3048a.a(jVarArrA);
    }

    private j(String str, int i10) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f47036a, f47037b};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f47038c.clone();
    }
}
