package H7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8043a = new i("BORDER_RADIUS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f8044b = new i("BORDER_TOP_LEFT_RADIUS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f8045c = new i("BORDER_TOP_RIGHT_RADIUS", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f8046d = new i("BORDER_BOTTOM_RIGHT_RADIUS", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f8047e = new i("BORDER_BOTTOM_LEFT_RADIUS", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f8048f = new i("BORDER_TOP_START_RADIUS", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f8049g = new i("BORDER_TOP_END_RADIUS", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f8050h = new i("BORDER_BOTTOM_START_RADIUS", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f8051i = new i("BORDER_BOTTOM_END_RADIUS", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f8052j = new i("BORDER_END_END_RADIUS", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f8053k = new i("BORDER_END_START_RADIUS", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f8054l = new i("BORDER_START_END_RADIUS", 11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f8055m = new i("BORDER_START_START_RADIUS", 12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ i[] f8056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8057o;

    static {
        i[] iVarArrA = a();
        f8056n = iVarArrA;
        f8057o = AbstractC3048a.a(iVarArrA);
    }

    private i(String str, int i10) {
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f8043a, f8044b, f8045c, f8046d, f8047e, f8048f, f8049g, f8050h, f8051i, f8052j, f8053k, f8054l, f8055m};
    }

    public static EnumEntries b() {
        return f8057o;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8056n.clone();
    }
}
