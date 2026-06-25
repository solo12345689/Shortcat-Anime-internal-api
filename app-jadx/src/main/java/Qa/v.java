package Qa;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f14729a = new v("NONE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f14730b = new v("BOX_NONE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f14731c = new v("BOX_ONLY", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f14732d = new v("AUTO", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v[] f14733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14734f;

    static {
        v[] vVarArrA = a();
        f14733e = vVarArrA;
        f14734f = AbstractC3048a.a(vVarArrA);
    }

    private v(String str, int i10) {
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f14729a, f14730b, f14731c, f14732d};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f14733e.clone();
    }
}
