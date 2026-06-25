package Ee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D extends y implements Oe.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5905a;

    public D(Object recordComponent) {
        AbstractC5504s.h(recordComponent, "recordComponent");
        this.f5905a = recordComponent;
    }

    @Override // Ee.y
    public Member R() throws IllegalAccessException, InvocationTargetException {
        Method methodC = C1522a.f5915a.c(this.f5905a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // Oe.w
    public boolean a() {
        return false;
    }

    @Override // Oe.w
    public Oe.x getType() throws IllegalAccessException, InvocationTargetException {
        Class clsD = C1522a.f5915a.d(this.f5905a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
