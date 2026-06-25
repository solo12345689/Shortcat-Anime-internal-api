package bc;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3046e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3046e f33268a = new EnumC3046e("MODULE_CREATE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3046e f33269b = new EnumC3046e("MODULE_DESTROY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3046e f33270c = new EnumC3046e("ACTIVITY_ENTERS_FOREGROUND", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3046e f33271d = new EnumC3046e("ACTIVITY_ENTERS_BACKGROUND", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3046e f33272e = new EnumC3046e("ACTIVITY_DESTROYS", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3046e f33273f = new EnumC3046e("ON_NEW_INTENT", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3046e f33274g = new EnumC3046e("ON_ACTIVITY_RESULT", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3046e f33275h = new EnumC3046e("ON_USER_LEAVES_ACTIVITY", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC3046e[] f33276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33277j;

    static {
        EnumC3046e[] enumC3046eArrA = a();
        f33276i = enumC3046eArrA;
        f33277j = AbstractC3048a.a(enumC3046eArrA);
    }

    private EnumC3046e(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3046e[] a() {
        return new EnumC3046e[]{f33268a, f33269b, f33270c, f33271d, f33272e, f33273f, f33274g, f33275h};
    }

    public static EnumC3046e valueOf(String str) {
        return (EnumC3046e) Enum.valueOf(EnumC3046e.class, str);
    }

    public static EnumC3046e[] values() {
        return (EnumC3046e[]) f33276i.clone();
    }
}
