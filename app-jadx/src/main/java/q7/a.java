package Q7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14375b = new a("Visible", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14376c = new a("Prerender", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14377d = new a("Hidden", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f14378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14379f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14380a;

    static {
        a[] aVarArrA = a();
        f14378e = aVarArrA;
        f14379f = AbstractC3048a.a(aVarArrA);
    }

    private a(String str, int i10, int i11) {
        this.f14380a = i11;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f14375b, f14376c, f14377d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14378e.clone();
    }

    public final int b() {
        return this.f14380a;
    }
}
