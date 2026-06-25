package Lf;

import Td.u;
import a.C2502a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f11548a = new C2502a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f11549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11550c;

    static {
        Object objB;
        Object objB2;
        try {
            u.a aVar = Td.u.f17466b;
            objB = Td.u.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            u.a aVar2 = Td.u.f17466b;
            objB = Td.u.b(Td.v.a(th2));
        }
        if (Td.u.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f11549b = (String) objB;
        try {
            objB2 = Td.u.b(D.class.getCanonicalName());
        } catch (Throwable th3) {
            u.a aVar3 = Td.u.f17466b;
            objB2 = Td.u.b(Td.v.a(th3));
        }
        if (Td.u.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f11550c = (String) objB2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
