package dc;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f45116a = new m("MAIN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f45117b = new m("DEFAULT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f45118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f45119d;

    static {
        m[] mVarArrA = a();
        f45118c = mVarArrA;
        f45119d = AbstractC3048a.a(mVarArrA);
    }

    private m(String str, int i10) {
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f45116a, f45117b};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f45118c.clone();
    }
}
