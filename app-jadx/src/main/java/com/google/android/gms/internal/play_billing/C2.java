package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f40139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f40140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f40141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final B2 f40142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f40143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f40144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f40145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f40146h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2.<clinit>():void");
    }

    static boolean A(Class cls) {
        int i10 = AbstractC3650c1.f40447a;
        try {
            Class cls2 = f40140b;
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

    static boolean B(Object obj, long j10) {
        return f40142d.g(obj, j10);
    }

    static boolean C() {
        return f40144f;
    }

    static boolean D() {
        return f40143e;
    }

    private static int E(Class cls) {
        if (f40144f) {
            return f40142d.f40133a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f40144f) {
            return f40142d.f40133a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC3650c1.f40447a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f40142d.f40133a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f40142d.f40133a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f40142d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f40142d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f40142d.f40133a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f40142d.f40133a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f40139a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f40142d.f40133a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3757y2());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th2) {
        Logger.getLogger(C2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f40142d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f40142d.d(bArr, f40145g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f40142d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f40142d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f40142d.f40133a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f40142d.f40133a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f40142d.f40133a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f40142d.f40133a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f40142d.f40133a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
