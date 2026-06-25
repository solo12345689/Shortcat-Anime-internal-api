package q0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6056b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC6056b f56108a = new EnumC6056b("None", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6056b f56109b = new EnumC6056b("Cancelled", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6056b f56110c = new EnumC6056b("Redirected", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6056b f56111d = new EnumC6056b("RedirectCancelled", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC6056b[] f56112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f56113f;

    static {
        EnumC6056b[] enumC6056bArrA = a();
        f56112e = enumC6056bArrA;
        f56113f = AbstractC3048a.a(enumC6056bArrA);
    }

    private EnumC6056b(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6056b[] a() {
        return new EnumC6056b[]{f56108a, f56109b, f56110c, f56111d};
    }

    public static EnumC6056b valueOf(String str) {
        return (EnumC6056b) Enum.valueOf(EnumC6056b.class, str);
    }

    public static EnumC6056b[] values() {
        return (EnumC6056b[]) f56112e.clone();
    }
}
