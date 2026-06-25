package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3479h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f39778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f39779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f39780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3470g6 f39781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f39782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f39783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f39784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f39785h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3479h6.<clinit>():void");
    }

    static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f39781d.f39766a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void D(Throwable th2) {
        Logger.getLogger(AbstractC3479h6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    private static int E(Class cls) {
        if (f39783f) {
            return f39781d.f39766a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f39783f) {
            return f39781d.f39766a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC3611w4.f40013a;
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
        Unsafe unsafe = f39781d.f39766a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f39781d.f39766a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static boolean f() {
        return f39783f;
    }

    static boolean g() {
        return f39782e;
    }

    static Object h(Class cls) {
        try {
            return f39778a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int i(Object obj, long j10) {
        return f39781d.f39766a.getInt(obj, j10);
    }

    static void j(Object obj, long j10, int i10) {
        f39781d.f39766a.putInt(obj, j10, i10);
    }

    static long k(Object obj, long j10) {
        return f39781d.f39766a.getLong(obj, j10);
    }

    static void l(Object obj, long j10, long j11) {
        f39781d.f39766a.putLong(obj, j10, j11);
    }

    static boolean m(Object obj, long j10) {
        return f39781d.b(obj, j10);
    }

    static void n(Object obj, long j10, boolean z10) {
        f39781d.c(obj, j10, z10);
    }

    static float o(Object obj, long j10) {
        return f39781d.d(obj, j10);
    }

    static void p(Object obj, long j10, float f10) {
        f39781d.e(obj, j10, f10);
    }

    static double q(Object obj, long j10) {
        return f39781d.f(obj, j10);
    }

    static void r(Object obj, long j10, double d10) {
        f39781d.g(obj, j10, d10);
    }

    static Object s(Object obj, long j10) {
        return f39781d.f39766a.getObject(obj, j10);
    }

    static void t(Object obj, long j10, Object obj2) {
        f39781d.f39766a.putObject(obj, j10, obj2);
    }

    static void u(byte[] bArr, long j10, byte b10) {
        f39781d.a(bArr, f39784g + j10, b10);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3443d6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class cls) {
        int i10 = AbstractC3611w4.f40013a;
        try {
            Class cls2 = f39779b;
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

    static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f39781d.f39766a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
