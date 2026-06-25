package uf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f61516b = new v("IN", 0, "in");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f61517c = new v("OUT", 1, "out");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f61518d = new v("INV", 2, "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v[] f61519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61520f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f61521a;

    static {
        v[] vVarArrA = a();
        f61519e = vVarArrA;
        f61520f = AbstractC3048a.a(vVarArrA);
    }

    private v(String str, int i10, String str2) {
        this.f61521a = str2;
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f61516b, f61517c, f61518d};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f61519e.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f61521a;
    }
}
