package nb;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f54095b = new o("PLAIN_TEXT", 0, "plain-text");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f54096c = new o("HTML", 1, "html");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f54097d = new o("IMAGE", 2, "image");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ o[] f54098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f54099f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54100a;

    static {
        o[] oVarArrA = a();
        f54098e = oVarArrA;
        f54099f = AbstractC3048a.a(oVarArrA);
    }

    private o(String str, int i10, String str2) {
        this.f54100a = str2;
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f54095b, f54096c, f54097d};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f54098e.clone();
    }

    public final String b() {
        return this.f54100a;
    }
}
