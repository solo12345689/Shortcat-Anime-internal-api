package Xf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f21988c = new e0("OBJ", 0, '{', '}');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f21989d = new e0("LIST", 1, '[', ']');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f21990e = new e0("MAP", 2, '{', '}');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e0 f21991f = new e0("POLY_OBJ", 3, '[', ']');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ e0[] f21992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f21993h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f21994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f21995b;

    static {
        e0[] e0VarArrA = a();
        f21992g = e0VarArrA;
        f21993h = AbstractC3048a.a(e0VarArrA);
    }

    private e0(String str, int i10, char c10, char c11) {
        this.f21994a = c10;
        this.f21995b = c11;
    }

    private static final /* synthetic */ e0[] a() {
        return new e0[]{f21988c, f21989d, f21990e, f21991f};
    }

    public static EnumEntries b() {
        return f21993h;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f21992g.clone();
    }
}
