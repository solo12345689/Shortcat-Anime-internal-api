package E0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: E0.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1308s extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC1308s f4178a = new EnumC1308s("Initial", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC1308s f4179b = new EnumC1308s("Main", 1);

    /* JADX INFO: renamed from: c */
    public static final EnumC1308s f4180c = new EnumC1308s("Final", 2);

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ EnumC1308s[] f4181d;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumEntries f4182e;

    static {
        EnumC1308s[] enumC1308sArrA = a();
        f4181d = enumC1308sArrA;
        f4182e = AbstractC3048a.a(enumC1308sArrA);
    }

    private EnumC1308s(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ EnumC1308s[] a() {
        return new EnumC1308s[]{f4178a, f4179b, f4180c};
    }

    public static EnumC1308s valueOf(String str) {
        return (EnumC1308s) Enum.valueOf(EnumC1308s.class, str);
    }

    public static EnumC1308s[] values() {
        return (EnumC1308s[]) f4181d.clone();
    }
}
