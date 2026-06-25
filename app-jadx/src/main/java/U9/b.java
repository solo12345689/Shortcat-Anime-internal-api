package U9;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f19399a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f19400b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: U9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class EnumC0332b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0332b f19401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0332b f19402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0332b[] f19403c;

        /* JADX INFO: renamed from: U9.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum a extends EnumC0332b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // U9.b.EnumC0332b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: U9.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum C0333b extends EnumC0332b {
            C0333b(String str, int i10) {
                super(str, i10);
            }

            @Override // U9.b.EnumC0332b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f19401a = aVar;
            C0333b c0333b = new C0333b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f19402b = c0333b;
            f19403c = new EnumC0332b[]{aVar, c0333b};
        }

        private EnumC0332b(String str, int i10) {
        }

        public static EnumC0332b valueOf(String str) {
            return (EnumC0332b) Enum.valueOf(EnumC0332b.class, str);
        }

        public static EnumC0332b[] values() {
            return (EnumC0332b[]) f19403c.clone();
        }

        public abstract boolean a();
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f19399a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return U9.a.a() || f19400b.get();
    }
}
