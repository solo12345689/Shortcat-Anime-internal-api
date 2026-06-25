package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import k5.AbstractC5449a;
import k5.InterfaceC5451c;
import k5.InterfaceFutureC5450b;
import o5.AbstractC5828e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends AbstractC5449a implements Cloneable {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    protected static final k5.f f35636n0 = (k5.f) ((k5.f) ((k5.f) new k5.f().g(U4.j.f19227c)).U(g.LOW)).c0(true);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Context f35637A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final k f35638B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Class f35639C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final b f35640D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final d f35641E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private l f35642F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Object f35643G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private List f35644H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private j f35645I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private j f35646X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private Float f35647Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f35648Z = true;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f35649l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f35650m0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35652b;

        static {
            int[] iArr = new int[g.values().length];
            f35652b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35652b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35652b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35652b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f35651a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35651a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35651a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35651a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35651a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35651a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35651a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35651a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected j(b bVar, k kVar, Class cls, Context context) {
        this.f35640D = bVar;
        this.f35638B = kVar;
        this.f35639C = cls;
        this.f35637A = context;
        this.f35642F = kVar.t(cls);
        this.f35641E = bVar.j();
        p0(kVar.r());
        a(kVar.s());
    }

    private InterfaceC5451c k0(l5.d dVar, k5.e eVar, AbstractC5449a abstractC5449a, Executor executor) {
        return l0(new Object(), dVar, eVar, null, this.f35642F, abstractC5449a.y(), abstractC5449a.u(), abstractC5449a.t(), abstractC5449a, executor);
    }

    private InterfaceC5451c l0(Object obj, l5.d dVar, k5.e eVar, com.bumptech.glide.request.b bVar, l lVar, g gVar, int i10, int i11, AbstractC5449a abstractC5449a, Executor executor) {
        com.bumptech.glide.request.a aVar;
        com.bumptech.glide.request.b bVar2;
        Object obj2;
        l5.d dVar2;
        k5.e eVar2;
        l lVar2;
        g gVar2;
        int i12;
        int i13;
        AbstractC5449a abstractC5449a2;
        Executor executor2;
        j jVar;
        if (this.f35646X != null) {
            aVar = new com.bumptech.glide.request.a(obj, bVar);
            bVar2 = aVar;
            jVar = this;
            obj2 = obj;
            dVar2 = dVar;
            eVar2 = eVar;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            abstractC5449a2 = abstractC5449a;
            executor2 = executor;
        } else {
            aVar = null;
            bVar2 = bVar;
            obj2 = obj;
            dVar2 = dVar;
            eVar2 = eVar;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            abstractC5449a2 = abstractC5449a;
            executor2 = executor;
            jVar = this;
        }
        InterfaceC5451c interfaceC5451cM0 = jVar.m0(obj2, dVar2, eVar2, bVar2, lVar2, gVar2, i12, i13, abstractC5449a2, executor2);
        if (aVar == null) {
            return interfaceC5451cM0;
        }
        int iU = this.f35646X.u();
        int iT = this.f35646X.t();
        if (o5.l.u(i10, i11) && !this.f35646X.P()) {
            iU = abstractC5449a.u();
            iT = abstractC5449a.t();
        }
        j jVar2 = this.f35646X;
        com.bumptech.glide.request.a aVar2 = aVar;
        aVar2.e(interfaceC5451cM0, jVar2.l0(obj, dVar, eVar, aVar2, jVar2.f35642F, jVar2.y(), iU, iT, this.f35646X, executor));
        return aVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private InterfaceC5451c m0(Object obj, l5.d dVar, k5.e eVar, com.bumptech.glide.request.b bVar, l lVar, g gVar, int i10, int i11, AbstractC5449a abstractC5449a, Executor executor) {
        j jVar = this.f35645I;
        if (jVar == null) {
            if (this.f35647Y == null) {
                return x0(obj, dVar, eVar, abstractC5449a, bVar, lVar, gVar, i10, i11, executor);
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, bVar);
            thumbnailRequestCoordinator.setRequests(x0(obj, dVar, eVar, abstractC5449a, thumbnailRequestCoordinator, lVar, gVar, i10, i11, executor), x0(obj, dVar, eVar, abstractC5449a.clone().b0(this.f35647Y.floatValue()), thumbnailRequestCoordinator, lVar, o0(gVar), i10, i11, executor));
            return thumbnailRequestCoordinator;
        }
        if (this.f35650m0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l lVar2 = jVar.f35648Z ? lVar : jVar.f35642F;
        g gVarY = jVar.K() ? this.f35645I.y() : o0(gVar);
        int iU = this.f35645I.u();
        int iT = this.f35645I.t();
        if (o5.l.u(i10, i11) && !this.f35645I.P()) {
            iU = abstractC5449a.u();
            iT = abstractC5449a.t();
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = new ThumbnailRequestCoordinator(obj, bVar);
        InterfaceC5451c interfaceC5451cX0 = x0(obj, dVar, eVar, abstractC5449a, thumbnailRequestCoordinator2, lVar, gVar, i10, i11, executor);
        this.f35650m0 = true;
        j jVar2 = this.f35645I;
        InterfaceC5451c interfaceC5451cL0 = jVar2.l0(obj, dVar, eVar, thumbnailRequestCoordinator2, lVar2, gVarY, iU, iT, jVar2, executor);
        this.f35650m0 = false;
        thumbnailRequestCoordinator2.setRequests(interfaceC5451cX0, interfaceC5451cL0);
        return thumbnailRequestCoordinator2;
    }

    private g o0(g gVar) {
        int i10 = a.f35652b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + y());
    }

    private void p0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0((k5.e) it.next());
        }
    }

    private l5.d s0(l5.d dVar, k5.e eVar, AbstractC5449a abstractC5449a, Executor executor) {
        o5.k.e(dVar);
        if (!this.f35649l0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC5451c interfaceC5451cK0 = k0(dVar, eVar, abstractC5449a, executor);
        InterfaceC5451c interfaceC5451cC = dVar.c();
        if (interfaceC5451cK0.isEquivalentTo(interfaceC5451cC) && !t0(abstractC5449a, interfaceC5451cC)) {
            if (!((InterfaceC5451c) o5.k.e(interfaceC5451cC)).isRunning()) {
                interfaceC5451cC.begin();
            }
            return dVar;
        }
        this.f35638B.p(dVar);
        dVar.j(interfaceC5451cK0);
        this.f35638B.A(dVar, interfaceC5451cK0);
        return dVar;
    }

    private boolean t0(AbstractC5449a abstractC5449a, InterfaceC5451c interfaceC5451c) {
        return !abstractC5449a.J() && interfaceC5451c.isComplete();
    }

    private j w0(Object obj) {
        if (H()) {
            return clone().w0(obj);
        }
        this.f35643G = obj;
        this.f35649l0 = true;
        return (j) Y();
    }

    private InterfaceC5451c x0(Object obj, l5.d dVar, k5.e eVar, AbstractC5449a abstractC5449a, com.bumptech.glide.request.b bVar, l lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f35637A;
        d dVar2 = this.f35641E;
        return k5.h.t(context, dVar2, obj, this.f35643G, this.f35639C, abstractC5449a, i10, i11, gVar, dVar, eVar, this.f35644H, bVar, dVar2.e(), lVar.c(), executor);
    }

    public j A0(j jVar) {
        if (H()) {
            return clone().A0(jVar);
        }
        this.f35645I = jVar;
        return (j) Y();
    }

    @Override // k5.AbstractC5449a
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (super.equals(jVar) && Objects.equals(this.f35639C, jVar.f35639C) && this.f35642F.equals(jVar.f35642F) && Objects.equals(this.f35643G, jVar.f35643G) && Objects.equals(this.f35644H, jVar.f35644H) && Objects.equals(this.f35645I, jVar.f35645I) && Objects.equals(this.f35646X, jVar.f35646X) && Objects.equals(this.f35647Y, jVar.f35647Y) && this.f35648Z == jVar.f35648Z && this.f35649l0 == jVar.f35649l0) {
                return true;
            }
        }
        return false;
    }

    @Override // k5.AbstractC5449a
    public int hashCode() {
        return o5.l.q(this.f35649l0, o5.l.q(this.f35648Z, o5.l.p(this.f35647Y, o5.l.p(this.f35646X, o5.l.p(this.f35645I, o5.l.p(this.f35644H, o5.l.p(this.f35643G, o5.l.p(this.f35642F, o5.l.p(this.f35639C, super.hashCode())))))))));
    }

    public j i0(k5.e eVar) {
        if (H()) {
            return clone().i0(eVar);
        }
        if (eVar != null) {
            if (this.f35644H == null) {
                this.f35644H = new ArrayList();
            }
            this.f35644H.add(eVar);
        }
        return (j) Y();
    }

    @Override // k5.AbstractC5449a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public j a(AbstractC5449a abstractC5449a) {
        o5.k.e(abstractC5449a);
        return (j) super.a(abstractC5449a);
    }

    @Override // k5.AbstractC5449a
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        jVar.f35642F = jVar.f35642F.clone();
        if (jVar.f35644H != null) {
            jVar.f35644H = new ArrayList(jVar.f35644H);
        }
        j jVar2 = jVar.f35645I;
        if (jVar2 != null) {
            jVar.f35645I = jVar2.clone();
        }
        j jVar3 = jVar.f35646X;
        if (jVar3 != null) {
            jVar.f35646X = jVar3.clone();
        }
        return jVar;
    }

    public l5.d q0(l5.d dVar) {
        return r0(dVar, null, AbstractC5828e.b());
    }

    public l5.d r0(l5.d dVar, k5.e eVar, Executor executor) {
        return s0(dVar, eVar, this, executor);
    }

    public j u0(k5.e eVar) {
        if (H()) {
            return clone().u0(eVar);
        }
        this.f35644H = null;
        return i0(eVar);
    }

    public j v0(Object obj) {
        return w0(obj);
    }

    public InterfaceFutureC5450b y0() {
        return z0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public InterfaceFutureC5450b z0(int i10, int i11) {
        k5.d dVar = new k5.d(i10, i11);
        return (InterfaceFutureC5450b) r0(dVar, dVar, AbstractC5828e.a());
    }
}
