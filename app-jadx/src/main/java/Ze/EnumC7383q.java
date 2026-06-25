package ze;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ze.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC7383q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC7383q f66239a = new EnumC7383q("RUNTIME", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC7383q f66240b = new EnumC7383q("BINARY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC7383q f66241c = new EnumC7383q("SOURCE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC7383q[] f66242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f66243e;

    static {
        EnumC7383q[] enumC7383qArrA = a();
        f66242d = enumC7383qArrA;
        f66243e = AbstractC3048a.a(enumC7383qArrA);
    }

    private EnumC7383q(String str, int i10) {
    }

    private static final /* synthetic */ EnumC7383q[] a() {
        return new EnumC7383q[]{f66239a, f66240b, f66241c};
    }

    public static EnumC7383q valueOf(String str) {
        return (EnumC7383q) Enum.valueOf(EnumC7383q.class, str);
    }

    public static EnumC7383q[] values() {
        return (EnumC7383q[]) f66242d.clone();
    }
}
