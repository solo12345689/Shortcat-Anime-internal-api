package sd;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: sd.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6452b extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC6452b f59348a = new EnumC6452b("READY", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC6452b f59349b = new EnumC6452b("PENDING", 1);

    /* JADX INFO: renamed from: c */
    public static final EnumC6452b f59350c = new EnumC6452b("EMBEDDED", 2);

    /* JADX INFO: renamed from: d */
    public static final EnumC6452b f59351d = new EnumC6452b("DEVELOPMENT", 3);

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumC6452b[] f59352e;

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ EnumEntries f59353f;

    static {
        EnumC6452b[] enumC6452bArrA = a();
        f59352e = enumC6452bArrA;
        f59353f = AbstractC3048a.a(enumC6452bArrA);
    }

    private EnumC6452b(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ EnumC6452b[] a() {
        return new EnumC6452b[]{f59348a, f59349b, f59350c, f59351d};
    }

    public static EnumC6452b valueOf(String str) {
        return (EnumC6452b) Enum.valueOf(EnumC6452b.class, str);
    }

    public static EnumC6452b[] values() {
        return (EnumC6452b[]) f59352e.clone();
    }
}
