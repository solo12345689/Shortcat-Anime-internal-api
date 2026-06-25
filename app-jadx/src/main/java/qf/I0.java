package qf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I0 f57981a = new I0("SUPERTYPE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I0 f57982b = new I0("COMMON", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ I0[] f57983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f57984d;

    static {
        I0[] i0ArrA = a();
        f57983c = i0ArrA;
        f57984d = AbstractC3048a.a(i0ArrA);
    }

    private I0(String str, int i10) {
    }

    private static final /* synthetic */ I0[] a() {
        return new I0[]{f57981a, f57982b};
    }

    public static I0 valueOf(String str) {
        return (I0) Enum.valueOf(I0.class, str);
    }

    public static I0[] values() {
        return (I0[]) f57983c.clone();
    }
}
