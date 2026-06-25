package xa;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f64133a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f64134b = AbstractC7078d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f64135c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f64136d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f64137e = z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f64138f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f64139g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f64140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f64141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f64142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f64143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f64144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f64145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f64146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f64147o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f64148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f64149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f64150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f64151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f64152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f64153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f64154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f64155w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xa.c0.e
        public boolean c(Object obj, long j10) {
            return c0.f64155w ? c0.q(obj, j10) : c0.r(obj, j10);
        }

        @Override // xa.c0.e
        public byte d(Object obj, long j10) {
            return c0.f64155w ? c0.t(obj, j10) : c0.u(obj, j10);
        }

        @Override // xa.c0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // xa.c0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // xa.c0.e
        public void k(Object obj, long j10, boolean z10) {
            if (c0.f64155w) {
                c0.G(obj, j10, z10);
            } else {
                c0.H(obj, j10, z10);
            }
        }

        @Override // xa.c0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // xa.c0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // xa.c0.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xa.c0.e
        public boolean c(Object obj, long j10) {
            return c0.f64155w ? c0.q(obj, j10) : c0.r(obj, j10);
        }

        @Override // xa.c0.e
        public byte d(Object obj, long j10) {
            return c0.f64155w ? c0.t(obj, j10) : c0.u(obj, j10);
        }

        @Override // xa.c0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // xa.c0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // xa.c0.e
        public void k(Object obj, long j10, boolean z10) {
            if (c0.f64155w) {
                c0.G(obj, j10, z10);
            } else {
                c0.H(obj, j10, z10);
            }
        }

        @Override // xa.c0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // xa.c0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // xa.c0.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // xa.c0.e
        public boolean c(Object obj, long j10) {
            return this.f64156a.getBoolean(obj, j10);
        }

        @Override // xa.c0.e
        public byte d(Object obj, long j10) {
            return this.f64156a.getByte(obj, j10);
        }

        @Override // xa.c0.e
        public double e(Object obj, long j10) {
            return this.f64156a.getDouble(obj, j10);
        }

        @Override // xa.c0.e
        public float f(Object obj, long j10) {
            return this.f64156a.getFloat(obj, j10);
        }

        @Override // xa.c0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f64156a.putBoolean(obj, j10, z10);
        }

        @Override // xa.c0.e
        public void l(Object obj, long j10, double d10) {
            this.f64156a.putDouble(obj, j10, d10);
        }

        @Override // xa.c0.e
        public void m(Object obj, long j10, float f10) {
            this.f64156a.putFloat(obj, j10, f10);
        }

        @Override // xa.c0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f64156a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                c0.E(th2);
                return false;
            }
        }

        @Override // xa.c0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f64156a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                c0.E(th2);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f64156a;

        e(Unsafe unsafe) {
            this.f64156a = unsafe;
        }

        public final int a(Class cls) {
            return this.f64156a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f64156a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f64156a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f64156a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f64156a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f64156a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f64156a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f64156a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f64156a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f64156a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                c0.E(th2);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f64156a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return c0.l() != null;
            } catch (Throwable th2) {
                c0.E(th2);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f64140h = j10;
        f64141i = j(boolean[].class);
        f64142j = k(boolean[].class);
        f64143k = j(int[].class);
        f64144l = k(int[].class);
        f64145m = j(long[].class);
        f64146n = k(long[].class);
        f64147o = j(float[].class);
        f64148p = k(float[].class);
        f64149q = j(double[].class);
        f64150r = k(double[].class);
        f64151s = j(Object[].class);
        f64152t = k(Object[].class);
        f64153u = o(l());
        f64154v = (int) (j10 & 7);
        f64155w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Object A(Object obj, long j10) {
        return f64137e.i(obj, j10);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f64139g;
    }

    static boolean D() {
        return f64138f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E(Throwable th2) {
        Logger.getLogger(c0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void F(Object obj, long j10, boolean z10) {
        f64137e.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iX = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iX & (~(255 << i10))));
    }

    private static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f64137e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f64137e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f64137e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f64137e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f64137e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f64137e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f64137e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f64133a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f64139g) {
            return f64137e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f64139g) {
            return f64137e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (AbstractC7078d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class cls) {
        if (!AbstractC7078d.c()) {
            return false;
        }
        try {
            Class cls2 = f64134b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f64137e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j10) {
        return f64137e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    static byte s(byte[] bArr, long j10) {
        return f64137e.d(bArr, f64140h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j10) {
        return f64137e.e(obj, j10);
    }

    static float w(Object obj, long j10) {
        return f64137e.f(obj, j10);
    }

    static int x(Object obj, long j10) {
        return f64137e.g(obj, j10);
    }

    static long y(Object obj, long j10) {
        return f64137e.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f64133a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC7078d.c()) {
            return new d(unsafe);
        }
        if (f64135c) {
            return new c(unsafe);
        }
        if (f64136d) {
            return new b(unsafe);
        }
        return null;
    }
}
