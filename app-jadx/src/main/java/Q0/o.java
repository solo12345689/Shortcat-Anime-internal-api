package q0;

import Td.r;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f56121a = new o("Active", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f56122b = new o("ActiveParent", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f56123c = new o("Captured", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f56124d = new o("Inactive", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ o[] f56125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f56126f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56127a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f56123c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f56121a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f56122b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.f56124d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f56127a = iArr;
        }
    }

    static {
        o[] oVarArrC = c();
        f56125e = oVarArrC;
        f56126f = AbstractC3048a.a(oVarArrC);
    }

    private o(String str, int i10) {
    }

    private static final /* synthetic */ o[] c() {
        return new o[]{f56121a, f56122b, f56123c, f56124d};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f56125e.clone();
    }

    @Override // q0.n
    public boolean a() {
        int i10 = a.f56127a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new r();
    }

    @Override // q0.n
    public boolean b() {
        int i10 = a.f56127a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new r();
    }
}
