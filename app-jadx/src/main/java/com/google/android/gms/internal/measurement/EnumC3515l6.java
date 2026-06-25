package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3515l6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3515l6 f39820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3515l6 f39821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3515l6 f39822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3515l6 f39823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3515l6 f39824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3515l6 f39825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3515l6 f39826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC3515l6 f39827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC3515l6 f39828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC3515l6 f39829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC3515l6 f39830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC3515l6 f39831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC3515l6 f39832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC3515l6 f39833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC3515l6 f39834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC3515l6 f39835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC3515l6 f39836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC3515l6 f39837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumC3515l6[] f39838u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3524m6 f39839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39840b;

    static {
        EnumC3515l6 enumC3515l6 = new EnumC3515l6("DOUBLE", 0, EnumC3524m6.DOUBLE, 1);
        f39820c = enumC3515l6;
        EnumC3515l6 enumC3515l62 = new EnumC3515l6("FLOAT", 1, EnumC3524m6.FLOAT, 5);
        f39821d = enumC3515l62;
        EnumC3524m6 enumC3524m6 = EnumC3524m6.LONG;
        EnumC3515l6 enumC3515l63 = new EnumC3515l6("INT64", 2, enumC3524m6, 0);
        f39822e = enumC3515l63;
        EnumC3515l6 enumC3515l64 = new EnumC3515l6("UINT64", 3, enumC3524m6, 0);
        f39823f = enumC3515l64;
        EnumC3524m6 enumC3524m62 = EnumC3524m6.INT;
        EnumC3515l6 enumC3515l65 = new EnumC3515l6("INT32", 4, enumC3524m62, 0);
        f39824g = enumC3515l65;
        EnumC3515l6 enumC3515l66 = new EnumC3515l6("FIXED64", 5, enumC3524m6, 1);
        f39825h = enumC3515l66;
        EnumC3515l6 enumC3515l67 = new EnumC3515l6("FIXED32", 6, enumC3524m62, 5);
        f39826i = enumC3515l67;
        EnumC3515l6 enumC3515l68 = new EnumC3515l6("BOOL", 7, EnumC3524m6.BOOLEAN, 0);
        f39827j = enumC3515l68;
        EnumC3515l6 enumC3515l69 = new EnumC3515l6("STRING", 8, EnumC3524m6.STRING, 2);
        f39828k = enumC3515l69;
        EnumC3524m6 enumC3524m63 = EnumC3524m6.MESSAGE;
        EnumC3515l6 enumC3515l610 = new EnumC3515l6("GROUP", 9, enumC3524m63, 3);
        f39829l = enumC3515l610;
        EnumC3515l6 enumC3515l611 = new EnumC3515l6("MESSAGE", 10, enumC3524m63, 2);
        f39830m = enumC3515l611;
        EnumC3515l6 enumC3515l612 = new EnumC3515l6("BYTES", 11, EnumC3524m6.BYTE_STRING, 2);
        f39831n = enumC3515l612;
        EnumC3515l6 enumC3515l613 = new EnumC3515l6("UINT32", 12, enumC3524m62, 0);
        f39832o = enumC3515l613;
        EnumC3515l6 enumC3515l614 = new EnumC3515l6("ENUM", 13, EnumC3524m6.ENUM, 0);
        f39833p = enumC3515l614;
        EnumC3515l6 enumC3515l615 = new EnumC3515l6("SFIXED32", 14, enumC3524m62, 5);
        f39834q = enumC3515l615;
        EnumC3515l6 enumC3515l616 = new EnumC3515l6("SFIXED64", 15, enumC3524m6, 1);
        f39835r = enumC3515l616;
        EnumC3515l6 enumC3515l617 = new EnumC3515l6("SINT32", 16, enumC3524m62, 0);
        f39836s = enumC3515l617;
        EnumC3515l6 enumC3515l618 = new EnumC3515l6("SINT64", 17, enumC3524m6, 0);
        f39837t = enumC3515l618;
        f39838u = new EnumC3515l6[]{enumC3515l6, enumC3515l62, enumC3515l63, enumC3515l64, enumC3515l65, enumC3515l66, enumC3515l67, enumC3515l68, enumC3515l69, enumC3515l610, enumC3515l611, enumC3515l612, enumC3515l613, enumC3515l614, enumC3515l615, enumC3515l616, enumC3515l617, enumC3515l618};
    }

    private EnumC3515l6(String str, int i10, EnumC3524m6 enumC3524m6, int i11) {
        this.f39839a = enumC3524m6;
        this.f39840b = i11;
    }

    public static EnumC3515l6[] values() {
        return (EnumC3515l6[]) f39838u.clone();
    }

    public final EnumC3524m6 a() {
        return this.f39839a;
    }

    public final int b() {
        return this.f39840b;
    }
}
