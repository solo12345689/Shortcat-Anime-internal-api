package K0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H0 f10420a = new H0("ContinueTraversal", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H0 f10421b = new H0("SkipSubtreeAndContinueTraversal", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H0 f10422c = new H0("CancelTraversal", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ H0[] f10423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10424e;

    static {
        H0[] h0ArrA = a();
        f10423d = h0ArrA;
        f10424e = AbstractC3048a.a(h0ArrA);
    }

    private H0(String str, int i10) {
    }

    private static final /* synthetic */ H0[] a() {
        return new H0[]{f10420a, f10421b, f10422c};
    }

    public static H0 valueOf(String str) {
        return (H0) Enum.valueOf(H0.class, str);
    }

    public static H0[] values() {
        return (H0[]) f10423d.clone();
    }
}
