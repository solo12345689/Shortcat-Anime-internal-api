package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f39049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f39050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f39051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z1 f39052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f39053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f39054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final boolean f39055g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.A1.<clinit>():void");
    }

    static double a(Object obj, long j10) {
        return f39052d.a(obj, j10);
    }

    static float b(Object obj, long j10) {
        return f39052d.b(obj, j10);
    }

    static int c(Object obj, long j10) {
        return f39052d.f39323a.getInt(obj, j10);
    }

    static long d(Object obj, long j10) {
        return f39052d.f39323a.getLong(obj, j10);
    }

    static Object e(Class cls) {
        try {
            return f39049a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object f(Object obj, long j10) {
        return f39052d.f39323a.getObject(obj, j10);
    }

    static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3401w1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void h(Throwable th2) {
        Logger.getLogger(A1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static /* synthetic */ void i(Object obj, long j10, boolean z10) {
        z1 z1Var = f39052d;
        long j11 = (-4) & j10;
        int i10 = z1Var.f39323a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        z1Var.f39323a.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    static /* synthetic */ void j(Object obj, long j10, boolean z10) {
        z1 z1Var = f39052d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        z1Var.f39323a.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & z1Var.f39323a.getInt(obj, j11)));
    }

    static void k(Object obj, long j10, boolean z10) {
        f39052d.c(obj, j10, z10);
    }

    static void l(Object obj, long j10, double d10) {
        f39052d.d(obj, j10, d10);
    }

    static void m(Object obj, long j10, float f10) {
        f39052d.e(obj, j10, f10);
    }

    static void n(Object obj, long j10, int i10) {
        f39052d.f39323a.putInt(obj, j10, i10);
    }

    static void o(Object obj, long j10, long j11) {
        f39052d.f39323a.putLong(obj, j10, j11);
    }

    static void p(Object obj, long j10, Object obj2) {
        f39052d.f39323a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean q(Object obj, long j10) {
        return ((byte) ((f39052d.f39323a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean r(Object obj, long j10) {
        return ((byte) ((f39052d.f39323a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean s(Class cls) {
        int i10 = AbstractC3344d0.f39152a;
        try {
            Class cls2 = f39050b;
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

    static boolean t(Object obj, long j10) {
        return f39052d.f(obj, j10);
    }

    static boolean u() {
        return f39054f;
    }

    static boolean v() {
        return f39053e;
    }

    private static int w(Class cls) {
        if (f39054f) {
            return f39052d.f39323a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int x(Class cls) {
        if (f39054f) {
            return f39052d.f39323a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field y() {
        int i10 = AbstractC3344d0.f39152a;
        Field fieldZ = z(Buffer.class, "effectiveDirectAddress");
        if (fieldZ != null) {
            return fieldZ;
        }
        Field fieldZ2 = z(Buffer.class, "address");
        if (fieldZ2 == null || fieldZ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZ2;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
