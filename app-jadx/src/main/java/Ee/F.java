package Ee;

import Oe.InterfaceC1980a;
import Ud.AbstractC2279u;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F extends u implements j, Oe.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeVariable f5907a;

    public F(TypeVariable typeVariable) {
        AbstractC5504s.h(typeVariable, "typeVariable");
        this.f5907a = typeVariable;
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return false;
    }

    @Override // Oe.y
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f5907a.getBounds();
        AbstractC5504s.g(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) AbstractC2279u.O0(arrayList);
        return AbstractC5504s.c(sVar != null ? sVar.Q() : null, Object.class) ? AbstractC2279u.m() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof F) && AbstractC5504s.c(this.f5907a, ((F) obj).f5907a);
    }

    @Override // Oe.InterfaceC1983d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Oe.t
    public Xe.f getName() {
        Xe.f fVarM = Xe.f.m(this.f5907a.getName());
        AbstractC5504s.g(fVarM, "identifier(...)");
        return fVarM;
    }

    @Override // Oe.InterfaceC1983d
    public /* bridge */ /* synthetic */ InterfaceC1980a h(Xe.c cVar) {
        return h(cVar);
    }

    public int hashCode() {
        return this.f5907a.hashCode();
    }

    @Override // Ee.j
    public AnnotatedElement s() {
        TypeVariable typeVariable = this.f5907a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return F.class.getName() + ": " + this.f5907a;
    }

    @Override // Ee.j, Oe.InterfaceC1983d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? AbstractC2279u.m() : listB;
    }

    @Override // Ee.j, Oe.InterfaceC1983d
    public C1528g h(Xe.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC5504s.h(fqName, "fqName");
        AnnotatedElement annotatedElementS = s();
        if (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}
