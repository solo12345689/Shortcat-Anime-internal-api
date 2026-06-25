package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3372m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f39272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3381p1 f39273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3381p1 f39274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f39275d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC3381p1 abstractC3381p1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f39272a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC3381p1 = (AbstractC3381p1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f39273b = abstractC3381p1;
        f39274c = new C3389s1();
    }

    public static AbstractC3381p1 a() {
        return f39273b;
    }

    public static AbstractC3381p1 b() {
        return f39274c;
    }

    static void c(AbstractC3381p1 abstractC3381p1, Object obj, Object obj2) {
        abstractC3381p1.d(obj, abstractC3381p1.b(abstractC3381p1.a(obj), abstractC3381p1.a(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!C0.class.isAssignableFrom(cls) && (cls2 = f39272a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
