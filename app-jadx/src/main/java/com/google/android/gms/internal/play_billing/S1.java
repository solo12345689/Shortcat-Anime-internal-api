package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S1 f40397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S1 f40398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S1 f40399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S1 f40400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S1 f40401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S1 f40402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S1 f40403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S1 f40404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final S1 f40405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final S1 f40406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ S1[] f40407l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f40408a;

    static {
        S1 s12 = new S1("VOID", 0, Void.class, Void.class, null);
        f40397b = s12;
        Class cls = Integer.TYPE;
        S1 s13 = new S1("INT", 1, cls, Integer.class, 0);
        f40398c = s13;
        S1 s14 = new S1("LONG", 2, Long.TYPE, Long.class, 0L);
        f40399d = s14;
        S1 s15 = new S1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f40400e = s15;
        S1 s16 = new S1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f40401f = s16;
        S1 s17 = new S1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f40402g = s17;
        S1 s18 = new S1("STRING", 6, String.class, String.class, "");
        f40403h = s18;
        S1 s19 = new S1("BYTE_STRING", 7, AbstractC3710o1.class, AbstractC3710o1.class, AbstractC3710o1.f40523b);
        f40404i = s19;
        S1 s110 = new S1("ENUM", 8, cls, Integer.class, null);
        f40405j = s110;
        S1 s111 = new S1("MESSAGE", 9, Object.class, Object.class, null);
        f40406k = s111;
        f40407l = new S1[]{s12, s13, s14, s15, s16, s17, s18, s19, s110, s111};
    }

    private S1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f40408a = cls2;
    }

    public static S1[] values() {
        return (S1[]) f40407l.clone();
    }

    public final Class a() {
        return this.f40408a;
    }
}
