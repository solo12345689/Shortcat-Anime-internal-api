package Rf;

import Td.AbstractC2163n;
import Td.L;
import Td.q;
import Tf.c;
import Tf.l;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.K;
import Ud.S;
import Vf.AbstractC2318b;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends AbstractC2318b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6014d f15512a;

    /* JADX INFO: renamed from: b */
    private List f15513b;

    /* JADX INFO: renamed from: c */
    private final Lazy f15514c;

    /* JADX INFO: renamed from: d */
    private final Map f15515d;

    /* JADX INFO: renamed from: e */
    private final Map f15516e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements K {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Iterable f15517a;

        public a(Iterable iterable) {
            this.f15517a = iterable;
        }

        @Override // Ud.K
        public Object a(Object obj) {
            return ((b) ((Map.Entry) obj).getValue()).getDescriptor().o();
        }

        @Override // Ud.K
        public Iterator b() {
            return this.f15517a.iterator();
        }
    }

    public h(final String serialName, InterfaceC6014d baseClass, InterfaceC6014d[] subclasses, b[] subclassSerializers) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(subclasses, "subclasses");
        AbstractC5504s.h(subclassSerializers, "subclassSerializers");
        this.f15512a = baseClass;
        this.f15513b = AbstractC2279u.m();
        this.f15514c = AbstractC2163n.a(q.f17462b, new InterfaceC5082a() { // from class: Rf.e
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return h.i(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + e().v() + " should be marked @Serializable");
        }
        Map mapW = S.w(AbstractC2273n.n1(subclasses, subclassSerializers));
        this.f15515d = mapW;
        a aVar = new a(mapW.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = aVar.b();
        while (itB.hasNext()) {
            Object next = itB.next();
            Object objA = aVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f15516e = linkedHashMap2;
    }

    public static final Tf.e i(String str, final h hVar) {
        return Tf.k.d(str, c.a.f17502a, new Tf.e[0], new Function1() { // from class: Rf.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.j(this.f15510a, (Tf.a) obj);
            }
        });
    }

    public static final L j(final h hVar, Tf.a buildSerialDescriptor) {
        AbstractC5504s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Tf.a.b(buildSerialDescriptor, "type", Sf.a.F(U.f52264a).getDescriptor(), null, false, 12, null);
        Tf.a.b(buildSerialDescriptor, "value", Tf.k.d("kotlinx.serialization.Sealed<" + hVar.e().v() + '>', l.a.f17532a, new Tf.e[0], new Function1() { // from class: Rf.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.k(this.f15511a, (Tf.a) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.h(hVar.f15513b);
        return L.f17438a;
    }

    public static final L k(h hVar, Tf.a buildSerialDescriptor) {
        AbstractC5504s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry entry : hVar.f15516e.entrySet()) {
            Tf.a.b(buildSerialDescriptor, (String) entry.getKey(), ((b) entry.getValue()).getDescriptor(), null, false, 12, null);
        }
        return L.f17438a;
    }

    @Override // Vf.AbstractC2318b
    public Rf.a c(Uf.c decoder, String str) {
        AbstractC5504s.h(decoder, "decoder");
        b bVar = (b) this.f15516e.get(str);
        return bVar != null ? bVar : super.c(decoder, str);
    }

    @Override // Vf.AbstractC2318b
    public k d(Uf.f encoder, Object value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        k kVarD = (b) this.f15515d.get(O.b(value.getClass()));
        if (kVarD == null) {
            kVarD = super.d(encoder, value);
        }
        if (kVarD != null) {
            return kVarD;
        }
        return null;
    }

    @Override // Vf.AbstractC2318b
    public InterfaceC6014d e() {
        return this.f15512a;
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return (Tf.e) this.f15514c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String serialName, InterfaceC6014d baseClass, InterfaceC6014d[] subclasses, b[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(subclasses, "subclasses");
        AbstractC5504s.h(subclassSerializers, "subclassSerializers");
        AbstractC5504s.h(classAnnotations, "classAnnotations");
        this.f15513b = AbstractC2273n.e(classAnnotations);
    }
}
