package Me;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12404a = new c("INFLEXIBLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f12405b = new c("FLEXIBLE_UPPER_BOUND", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12406c = new c("FLEXIBLE_LOWER_BOUND", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f12407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12408e;

    static {
        c[] cVarArrA = a();
        f12407d = cVarArrA;
        f12408e = AbstractC3048a.a(cVarArrA);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f12404a, f12405b, f12406c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f12407d.clone();
    }
}
