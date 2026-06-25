package Bb;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f1638b = new p("INITIALIZED", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f1639c = new p("STARTED", 1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f1640d = new p("RESPONSE_RECEIVED", 2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f1641e = new p("BODY_COMPLETED", 3, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f1642f = new p("BODY_STREAMING_STARTED", 4, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f1643g = new p("BODY_STREAMING_CANCELED", 5, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f1644h = new p("ERROR_RECEIVED", 6, 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ p[] f1645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1646j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1647a;

    static {
        p[] pVarArrA = a();
        f1645i = pVarArrA;
        f1646j = AbstractC3048a.a(pVarArrA);
    }

    private p(String str, int i10, int i11) {
        this.f1647a = i11;
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f1638b, f1639c, f1640d, f1641e, f1642f, f1643g, f1644h};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f1645i.clone();
    }

    public final int b() {
        return this.f1647a;
    }
}
