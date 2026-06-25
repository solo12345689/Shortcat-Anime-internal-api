package Y;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0 f22197a = new S0("Invalid", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S0 f22198b = new S0("Cancelled", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S0 f22199c = new S0("InitialPending", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S0 f22200d = new S0("RecomposePending", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S0 f22201e = new S0("Recomposing", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S0 f22202f = new S0("ApplyPending", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S0 f22203g = new S0("Applied", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ S0[] f22204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f22205i;

    static {
        S0[] s0ArrA = a();
        f22204h = s0ArrA;
        f22205i = AbstractC3048a.a(s0ArrA);
    }

    private S0(String str, int i10) {
    }

    private static final /* synthetic */ S0[] a() {
        return new S0[]{f22197a, f22198b, f22199c, f22200d, f22201e, f22202f, f22203g};
    }

    public static S0 valueOf(String str) {
        return (S0) Enum.valueOf(S0.class, str);
    }

    public static S0[] values() {
        return (S0[]) f22204h.clone();
    }
}
