package Xf;

import Td.C2160k;
import Tf.l;
import Tf.m;
import Vf.AbstractC2318b;
import Wf.AbstractC2358b;
import Wf.C2359c;
import Wf.C2363g;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Xf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC2366c extends Vf.U implements Wf.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2358b f21971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Wf.i f21972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final C2363g f21974f;

    public /* synthetic */ AbstractC2366c(AbstractC2358b abstractC2358b, Wf.i iVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2358b, iVar, str);
    }

    private final Void B0(Wf.E e10, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (Df.r.Q(str, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw C.f(-1, "Failed to parse literal '" + e10 + "' as " + sb2.toString() + " value at element: " + A0(str2), m0().toString());
    }

    public final String A0(String currentTag) {
        AbstractC5504s.h(currentTag, "currentTag");
        return i0() + com.amazon.a.a.o.c.a.b.f34706a + currentTag;
    }

    @Override // Vf.A0, Uf.e
    public Object C(Rf.a deserializer) {
        Wf.E eO;
        AbstractC5504s.h(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC2318b) || d().f().p()) {
            return deserializer.deserialize(this);
        }
        AbstractC2318b abstractC2318b = (AbstractC2318b) deserializer;
        String strC = S.c(abstractC2318b.getDescriptor(), d());
        Wf.i iVarG = g();
        String strO = abstractC2318b.getDescriptor().o();
        if (iVarG instanceof Wf.C) {
            Wf.C c10 = (Wf.C) iVarG;
            Wf.i iVar = (Wf.i) c10.get(strC);
            try {
                Rf.a aVarA = Rf.d.a((AbstractC2318b) deserializer, this, (iVar == null || (eO = Wf.j.o(iVar)) == null) ? null : Wf.j.f(eO));
                AbstractC5504s.f(aVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return b0.b(d(), strC, c10, aVarA);
            } catch (Rf.j e10) {
                String message = e10.getMessage();
                AbstractC5504s.e(message);
                throw C.f(-1, message, c10.toString());
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.C.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarG.getClass()).v() + " as the serialized body of " + strO + " at element: " + i0(), iVarG.toString());
    }

    @Override // Uf.e
    public boolean D() {
        return !(m0() instanceof Wf.z);
    }

    @Override // Uf.c
    public Yf.e a() {
        return d().a();
    }

    @Override // Uf.e
    public Uf.c b(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        Wf.i iVarM0 = m0();
        Tf.l lVarH = descriptor.h();
        if (AbstractC5504s.c(lVarH, m.b.f17535a) || (lVarH instanceof Tf.c)) {
            AbstractC2358b abstractC2358bD = d();
            String strO = descriptor.o();
            if (iVarM0 instanceof C2359c) {
                return new M(abstractC2358bD, (C2359c) iVarM0);
            }
            throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(C2359c.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarM0.getClass()).v() + " as the serialized body of " + strO + " at element: " + i0(), iVarM0.toString());
        }
        if (!AbstractC5504s.c(lVarH, m.c.f17536a)) {
            AbstractC2358b abstractC2358bD2 = d();
            String strO2 = descriptor.o();
            if (iVarM0 instanceof Wf.C) {
                return new K(abstractC2358bD2, (Wf.C) iVarM0, this.f21973e, null, 8, null);
            }
            throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.C.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarM0.getClass()).v() + " as the serialized body of " + strO2 + " at element: " + i0(), iVarM0.toString());
        }
        AbstractC2358b abstractC2358bD3 = d();
        Tf.e eVarA = f0.a(descriptor.n(0), abstractC2358bD3.a());
        Tf.l lVarH2 = eVarA.h();
        if ((lVarH2 instanceof Tf.d) || AbstractC5504s.c(lVarH2, l.b.f17533a)) {
            AbstractC2358b abstractC2358bD4 = d();
            String strO3 = descriptor.o();
            if (iVarM0 instanceof Wf.C) {
                return new O(abstractC2358bD4, (Wf.C) iVarM0);
            }
            throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.C.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarM0.getClass()).v() + " as the serialized body of " + strO3 + " at element: " + i0(), iVarM0.toString());
        }
        if (!abstractC2358bD3.f().c()) {
            throw C.d(eVarA);
        }
        AbstractC2358b abstractC2358bD5 = d();
        String strO4 = descriptor.o();
        if (iVarM0 instanceof C2359c) {
            return new M(abstractC2358bD5, (C2359c) iVarM0);
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(C2359c.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarM0.getClass()).v() + " as the serialized body of " + strO4 + " at element: " + i0(), iVarM0.toString());
    }

    public void c(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
    }

    @Override // Wf.h
    public AbstractC2358b d() {
        return this.f21971c;
    }

    @Override // Vf.U
    protected String e0(String parentName, String childName) {
        AbstractC5504s.h(parentName, "parentName");
        AbstractC5504s.h(childName, "childName");
        return childName;
    }

    @Override // Wf.h
    public Wf.i g() {
        return m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Wf.i l0(String str);

    protected final Wf.i m0() {
        Wf.i iVarL0;
        String str = (String) Y();
        return (str == null || (iVarL0 = l0(str)) == null) ? z0() : iVarL0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean N(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                Boolean boolE = Wf.j.e(e10);
                if (boolE != null) {
                    return boolE.booleanValue();
                }
                B0(e10, "boolean", tag);
                throw new C2160k();
            } catch (IllegalArgumentException unused) {
                B0(e10, "boolean", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of boolean at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public byte O(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                int iK = Wf.j.k(e10);
                Byte bValueOf = (-128 > iK || iK > 127) ? null : Byte.valueOf((byte) iK);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                B0(e10, "byte", tag);
                throw new C2160k();
            } catch (IllegalArgumentException unused) {
                B0(e10, "byte", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of byte at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public char P(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                return Df.r.r1(e10.b());
            } catch (IllegalArgumentException unused) {
                B0(e10, "char", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of char at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public double Q(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                double dG = Wf.j.g(e10);
                if (d().f().b()) {
                    return dG;
                }
                if (Double.isInfinite(dG) || Double.isNaN(dG)) {
                    throw C.a(Double.valueOf(dG), tag, m0().toString());
                }
                return dG;
            } catch (IllegalArgumentException unused) {
                B0(e10, "double", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of double at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public int R(String tag, Tf.e enumDescriptor) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        AbstractC2358b abstractC2358bD = d();
        Wf.i iVarL0 = l0(tag);
        String strO = enumDescriptor.o();
        if (iVarL0 instanceof Wf.E) {
            return E.k(enumDescriptor, abstractC2358bD, ((Wf.E) iVarL0).b(), null, 4, null);
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of " + strO + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public float S(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                float fI = Wf.j.i(e10);
                if (d().f().b()) {
                    return fI;
                }
                if (Float.isInfinite(fI) || Float.isNaN(fI)) {
                    throw C.a(Float.valueOf(fI), tag, m0().toString());
                }
                return fI;
            } catch (IllegalArgumentException unused) {
                B0(e10, "float", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of float at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public Uf.e T(String tag, Tf.e inlineDescriptor) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(inlineDescriptor, "inlineDescriptor");
        if (!W.b(inlineDescriptor)) {
            return super.T(tag, inlineDescriptor);
        }
        AbstractC2358b abstractC2358bD = d();
        Wf.i iVarL0 = l0(tag);
        String strO = inlineDescriptor.o();
        if (iVarL0 instanceof Wf.E) {
            return new C2386x(Y.a(abstractC2358bD, ((Wf.E) iVarL0).b()), d());
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of " + strO + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public int U(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                return Wf.j.k(e10);
            } catch (IllegalArgumentException unused) {
                B0(e10, "int", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of int at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public long V(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                return Wf.j.q(e10);
            } catch (IllegalArgumentException unused) {
                B0(e10, Constants.LONG, tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of " + Constants.LONG + " at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public short W(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (iVarL0 instanceof Wf.E) {
            Wf.E e10 = (Wf.E) iVarL0;
            try {
                int iK = Wf.j.k(e10);
                Short shValueOf = (-32768 > iK || iK > 32767) ? null : Short.valueOf((short) iK);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                B0(e10, "short", tag);
                throw new C2160k();
            } catch (IllegalArgumentException unused) {
                B0(e10, "short", tag);
                throw new C2160k();
            }
        }
        throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of short at element: " + A0(tag), iVarL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.A0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public String X(String tag) {
        AbstractC5504s.h(tag, "tag");
        Wf.i iVarL0 = l0(tag);
        if (!(iVarL0 instanceof Wf.E)) {
            throw C.f(-1, "Expected " + kotlin.jvm.internal.O.b(Wf.E.class).v() + ", but had " + kotlin.jvm.internal.O.b(iVarL0.getClass()).v() + " as the serialized body of string at element: " + A0(tag), iVarL0.toString());
        }
        Wf.E e10 = (Wf.E) iVarL0;
        if (!(e10 instanceof Wf.v)) {
            throw C.f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + A0(tag), m0().toString());
        }
        Wf.v vVar = (Wf.v) e10;
        if (vVar.d() || d().f().q()) {
            return vVar.b();
        }
        throw C.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + A0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m0().toString());
    }

    protected final String y0() {
        return this.f21973e;
    }

    @Override // Vf.A0, Uf.e
    public Uf.e z(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return Y() != null ? super.z(descriptor) : new G(d(), z0(), this.f21973e).z(descriptor);
    }

    public abstract Wf.i z0();

    public /* synthetic */ AbstractC2366c(AbstractC2358b abstractC2358b, Wf.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2358b, iVar, (i10 & 4) != 0 ? null : str, null);
    }

    private AbstractC2366c(AbstractC2358b abstractC2358b, Wf.i iVar, String str) {
        this.f21971c = abstractC2358b;
        this.f21972d = iVar;
        this.f21973e = str;
        this.f21974f = d().f();
    }
}
