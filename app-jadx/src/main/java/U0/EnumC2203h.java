package U0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class EnumC2203h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2203h f18827a = new EnumC2203h("Paragraph", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2203h f18828b = new EnumC2203h("Span", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2203h f18829c = new EnumC2203h("VerbatimTts", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2203h f18830d = new EnumC2203h("Url", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC2203h f18831e = new EnumC2203h("Link", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC2203h f18832f = new EnumC2203h("Clickable", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2203h f18833g = new EnumC2203h("String", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC2203h[] f18834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f18835i;

    static {
        EnumC2203h[] enumC2203hArrA = a();
        f18834h = enumC2203hArrA;
        f18835i = AbstractC3048a.a(enumC2203hArrA);
    }

    private EnumC2203h(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2203h[] a() {
        return new EnumC2203h[]{f18827a, f18828b, f18829c, f18830d, f18831e, f18832f, f18833g};
    }

    public static EnumC2203h valueOf(String str) {
        return (EnumC2203h) Enum.valueOf(EnumC2203h.class, str);
    }

    public static EnumC2203h[] values() {
        return (EnumC2203h[]) f18834h.clone();
    }
}
