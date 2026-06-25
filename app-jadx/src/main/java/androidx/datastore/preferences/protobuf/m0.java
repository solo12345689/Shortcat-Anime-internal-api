package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a */
    static final int f29376a = c(1, 3);

    /* JADX INFO: renamed from: b */
    static final int f29377b = c(1, 4);

    /* JADX INFO: renamed from: c */
    static final int f29378c = c(2, 0);

    /* JADX INFO: renamed from: d */
    static final int f29379d = c(3, 2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends Enum {

        /* JADX INFO: renamed from: c */
        public static final b f29380c;

        /* JADX INFO: renamed from: d */
        public static final b f29381d;

        /* JADX INFO: renamed from: e */
        public static final b f29382e;

        /* JADX INFO: renamed from: f */
        public static final b f29383f;

        /* JADX INFO: renamed from: g */
        public static final b f29384g;

        /* JADX INFO: renamed from: h */
        public static final b f29385h;

        /* JADX INFO: renamed from: i */
        public static final b f29386i;

        /* JADX INFO: renamed from: j */
        public static final b f29387j;

        /* JADX INFO: renamed from: k */
        public static final b f29388k;

        /* JADX INFO: renamed from: l */
        public static final b f29389l;

        /* JADX INFO: renamed from: m */
        public static final b f29390m;

        /* JADX INFO: renamed from: n */
        public static final b f29391n;

        /* JADX INFO: renamed from: o */
        public static final b f29392o;

        /* JADX INFO: renamed from: p */
        public static final b f29393p;

        /* JADX INFO: renamed from: q */
        public static final b f29394q;

        /* JADX INFO: renamed from: r */
        public static final b f29395r;

        /* JADX INFO: renamed from: s */
        public static final b f29396s;

        /* JADX INFO: renamed from: t */
        public static final b f29397t;

        /* JADX INFO: renamed from: u */
        private static final /* synthetic */ b[] f29398u;

        /* JADX INFO: renamed from: a */
        private final c f29399a;

        /* JADX INFO: renamed from: b */
        private final int f29400b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum C0503b extends b {
            C0503b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f29380c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f29381d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f29382e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f29383f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f29384g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f29385h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f29386i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f29387j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f29388k = aVar;
            c cVar3 = c.MESSAGE;
            C0503b c0503b = new C0503b("GROUP", 9, cVar3, 3);
            f29389l = c0503b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f29390m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f29391n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f29392o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f29393p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f29394q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f29395r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f29396s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f29397t = bVar14;
            f29398u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0503b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f29398u.clone();
        }

        public c a() {
            return this.f29399a;
        }

        public int b() {
            return this.f29400b;
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f29399a = cVar;
            this.f29400b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC2802f.f29287b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a */
        private final Object f29411a;

        c(Object obj) {
            this.f29411a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
