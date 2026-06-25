package Ee;

import Ee.AbstractC1529h;
import Oe.InterfaceC1980a;
import he.AbstractC4945a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ee.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1528g extends u implements InterfaceC1980a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotation f5935a;

    public C1528g(Annotation annotation) {
        AbstractC5504s.h(annotation, "annotation");
        this.f5935a = annotation;
    }

    @Override // Oe.InterfaceC1980a
    public boolean G() {
        return false;
    }

    public final Annotation Q() {
        return this.f5935a;
    }

    @Override // Oe.InterfaceC1980a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public q b() {
        return new q(AbstractC4945a.b(AbstractC4945a.a(this.f5935a)));
    }

    @Override // Oe.InterfaceC1980a
    public boolean d() {
        return false;
    }

    @Override // Oe.InterfaceC1980a
    public Collection e() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = AbstractC4945a.b(AbstractC4945a.a(this.f5935a)).getDeclaredMethods();
        AbstractC5504s.g(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC1529h.a aVar = AbstractC1529h.f5936b;
            Object objInvoke = method.invoke(this.f5935a, null);
            AbstractC5504s.g(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, Xe.f.m(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1528g) && this.f5935a == ((C1528g) obj).f5935a;
    }

    @Override // Oe.InterfaceC1980a
    public Xe.b g() {
        return AbstractC1527f.e(AbstractC4945a.b(AbstractC4945a.a(this.f5935a)));
    }

    public int hashCode() {
        return System.identityHashCode(this.f5935a);
    }

    public String toString() {
        return C1528g.class.getName() + ": " + this.f5935a;
    }
}
