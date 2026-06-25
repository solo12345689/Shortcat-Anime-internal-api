package com.google.android.gms.internal.measurement;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3532n5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3532n5 f39872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3532n5 f39873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3532n5 f39874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3532n5 f39875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3532n5 f39876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3532n5 f39877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3532n5 f39878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3532n5 f39879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC3532n5 f39880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC3532n5 f39881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC3532n5[] f39882l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f39883a;

    static {
        EnumC3532n5 enumC3532n5 = new EnumC3532n5("VOID", 0, Void.class, Void.class, null);
        f39872b = enumC3532n5;
        Class cls = Integer.TYPE;
        EnumC3532n5 enumC3532n52 = new EnumC3532n5("INT", 1, cls, Integer.class, 0);
        f39873c = enumC3532n52;
        EnumC3532n5 enumC3532n53 = new EnumC3532n5("LONG", 2, Long.TYPE, Long.class, 0L);
        f39874d = enumC3532n53;
        EnumC3532n5 enumC3532n54 = new EnumC3532n5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f39875e = enumC3532n54;
        EnumC3532n5 enumC3532n55 = new EnumC3532n5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f39876f = enumC3532n55;
        EnumC3532n5 enumC3532n56 = new EnumC3532n5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f39877g = enumC3532n56;
        EnumC3532n5 enumC3532n57 = new EnumC3532n5("STRING", 6, String.class, String.class, "");
        f39878h = enumC3532n57;
        EnumC3532n5 enumC3532n58 = new EnumC3532n5("BYTE_STRING", 7, I4.class, I4.class, I4.f39386b);
        f39879i = enumC3532n58;
        EnumC3532n5 enumC3532n59 = new EnumC3532n5("ENUM", 8, cls, Integer.class, null);
        f39880j = enumC3532n59;
        EnumC3532n5 enumC3532n510 = new EnumC3532n5("MESSAGE", 9, Object.class, Object.class, null);
        f39881k = enumC3532n510;
        f39882l = new EnumC3532n5[]{enumC3532n5, enumC3532n52, enumC3532n53, enumC3532n54, enumC3532n55, enumC3532n56, enumC3532n57, enumC3532n58, enumC3532n59, enumC3532n510};
    }

    private EnumC3532n5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f39883a = cls2;
    }

    public static EnumC3532n5[] values() {
        return (EnumC3532n5[]) f39882l.clone();
    }

    public final Class a() {
        return this.f39883a;
    }
}
