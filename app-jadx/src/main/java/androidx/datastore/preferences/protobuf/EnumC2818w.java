package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2818w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC2818w f29510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC2818w f29511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC2818w f29512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2818w f29513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC2818w f29514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC2818w f29515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC2818w f29516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC2818w f29517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC2818w f29518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC2818w f29519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC2818w[] f29520n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f29521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f29522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f29523c;

    static {
        EnumC2818w enumC2818w = new EnumC2818w("VOID", 0, Void.class, Void.class, null);
        f29510d = enumC2818w;
        Class cls = Integer.TYPE;
        EnumC2818w enumC2818w2 = new EnumC2818w("INT", 1, cls, Integer.class, 0);
        f29511e = enumC2818w2;
        EnumC2818w enumC2818w3 = new EnumC2818w("LONG", 2, Long.TYPE, Long.class, 0L);
        f29512f = enumC2818w3;
        EnumC2818w enumC2818w4 = new EnumC2818w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f29513g = enumC2818w4;
        EnumC2818w enumC2818w5 = new EnumC2818w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f29514h = enumC2818w5;
        EnumC2818w enumC2818w6 = new EnumC2818w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f29515i = enumC2818w6;
        EnumC2818w enumC2818w7 = new EnumC2818w("STRING", 6, String.class, String.class, "");
        f29516j = enumC2818w7;
        EnumC2818w enumC2818w8 = new EnumC2818w("BYTE_STRING", 7, AbstractC2802f.class, AbstractC2802f.class, AbstractC2802f.f29287b);
        f29517k = enumC2818w8;
        EnumC2818w enumC2818w9 = new EnumC2818w("ENUM", 8, cls, Integer.class, null);
        f29518l = enumC2818w9;
        EnumC2818w enumC2818w10 = new EnumC2818w("MESSAGE", 9, Object.class, Object.class, null);
        f29519m = enumC2818w10;
        f29520n = new EnumC2818w[]{enumC2818w, enumC2818w2, enumC2818w3, enumC2818w4, enumC2818w5, enumC2818w6, enumC2818w7, enumC2818w8, enumC2818w9, enumC2818w10};
    }

    private EnumC2818w(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f29521a = cls;
        this.f29522b = cls2;
        this.f29523c = obj;
    }

    public static EnumC2818w valueOf(String str) {
        return (EnumC2818w) Enum.valueOf(EnumC2818w.class, str);
    }

    public static EnumC2818w[] values() {
        return (EnumC2818w[]) f29520n.clone();
    }

    public Class a() {
        return this.f29522b;
    }
}
