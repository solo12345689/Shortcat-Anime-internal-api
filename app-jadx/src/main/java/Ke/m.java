package Ke;

import Le.c0;
import Oe.y;
import Oe.z;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pf.InterfaceC6043h;
import ye.InterfaceC7235m;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a */
    private final k f11071a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7235m f11072b;

    /* JADX INFO: renamed from: c */
    private final int f11073c;

    /* JADX INFO: renamed from: d */
    private final Map f11074d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6043h f11075e;

    public m(k c10, InterfaceC7235m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(typeParameterOwner, "typeParameterOwner");
        this.f11071a = c10;
        this.f11072b = containingDeclaration;
        this.f11073c = i10;
        this.f11074d = Af.a.d(typeParameterOwner.getTypeParameters());
        this.f11075e = c10.e().d(new l(this));
    }

    public static final c0 c(m mVar, y typeParameter) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        Integer num = (Integer) mVar.f11074d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new c0(c.k(c.c(mVar.f11071a, mVar), mVar.f11072b.getAnnotations()), typeParameter, mVar.f11073c + num.intValue(), mVar.f11072b);
    }

    @Override // Ke.p
    public m0 a(y javaTypeParameter) {
        AbstractC5504s.h(javaTypeParameter, "javaTypeParameter");
        c0 c0Var = (c0) this.f11075e.invoke(javaTypeParameter);
        return c0Var != null ? c0Var : this.f11071a.f().a(javaTypeParameter);
    }
}
