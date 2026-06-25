package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f29345a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f29346b = AbstractC2800d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f29347c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f29348d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f29349e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f29350f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f29351g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f29352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f29353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f29354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f29355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f29356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f29357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f29358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f29359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f29360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f29361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f29362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f29363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f29364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f29365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f29366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f29367w;

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

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean c(Object obj, long j10) {
            return k0.f29367w ? k0.q(obj, j10) : k0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void j(Object obj, long j10, boolean z10) {
            if (k0.f29367w) {
                k0.F(obj, j10, z10);
            } else {
                k0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void k(Object obj, long j10, byte b10) {
            if (k0.f29367w) {
                k0.I(obj, j10, b10);
            } else {
                k0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean c(Object obj, long j10) {
            return k0.f29367w ? k0.q(obj, j10) : k0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void j(Object obj, long j10, boolean z10) {
            if (k0.f29367w) {
                k0.F(obj, j10, z10);
            } else {
                k0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void k(Object obj, long j10, byte b10) {
            if (k0.f29367w) {
                k0.I(obj, j10, b10);
            } else {
                k0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean c(Object obj, long j10) {
            return this.f29368a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public double d(Object obj, long j10) {
            return this.f29368a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public float e(Object obj, long j10) {
            return this.f29368a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f29368a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void k(Object obj, long j10, byte b10) {
            this.f29368a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void l(Object obj, long j10, double d10) {
            this.f29368a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void m(Object obj, long j10, float f10) {
            this.f29368a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f29368a.getClass();
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
                k0.D(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f29368a.getClass();
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
                k0.D(th2);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f29368a;

        e(Unsafe unsafe) {
            this.f29368a = unsafe;
        }

        public final int a(Class cls) {
            return this.f29368a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f29368a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f29368a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f29368a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f29368a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f29368a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f29368a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f29368a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f29368a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f29368a;
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
                k0.D(th2);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f29368a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return k0.l() != null;
            } catch (Throwable th2) {
                k0.D(th2);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f29352h = j10;
        f29353i = j(boolean[].class);
        f29354j = k(boolean[].class);
        f29355k = j(int[].class);
        f29356l = k(int[].class);
        f29357m = j(long[].class);
        f29358n = k(long[].class);
        f29359o = j(float[].class);
        f29360p = k(float[].class);
        f29361q = j(double[].class);
        f29362r = k(double[].class);
        f29363s = j(Object[].class);
        f29364t = k(Object[].class);
        f29365u = o(l());
        f29366v = (int) (j10 & 7);
        f29367w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f29351g;
    }

    static boolean C() {
        return f29350f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th2) {
        Logger.getLogger(k0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void E(Object obj, long j10, boolean z10) {
        f29349e.j(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f29349e.k(bArr, f29352h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f29349e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f29349e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f29349e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f29349e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f29349e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f29349e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f29349e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f29345a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f29351g) {
            return f29349e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f29351g) {
            return f29349e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (AbstractC2800d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class cls) {
        if (!AbstractC2800d.c()) {
            return false;
        }
        try {
            Class cls2 = f29346b;
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
        if (field == null || (eVar = f29349e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f29349e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j10) {
        return f29349e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f29349e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f29349e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f29349e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f29345a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC2800d.c()) {
            return new d(unsafe);
        }
        if (f29347c) {
            return new c(unsafe);
        }
        if (f29348d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f29349e.h(obj, j10);
    }
}
