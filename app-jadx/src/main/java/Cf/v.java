package Cf;

import Ud.AbstractC2279u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v extends t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterable, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f3118a;

        public a(i iVar) {
            this.f3118a = iVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f3118a.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f3119a = new b();

        b() {
            super(1, i.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final Iterator invoke(i p02) {
            AbstractC5504s.h(p02, "p0");
            return p02.iterator();
        }
    }

    public static i A(i iVar, Function1 predicate) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return new f(iVar, false, predicate);
    }

    public static i B(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        i iVarA = A(iVar, new Function1() { // from class: Cf.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(v.C(obj));
            }
        });
        AbstractC5504s.f(iVarA, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return iVarA;
    }

    public static final boolean C(Object obj) {
        return obj == null;
    }

    public static Object D(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        Iterator it = iVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static i E(i iVar, Function1 transform) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(transform, "transform");
        return new g(iVar, transform, b.f3119a);
    }

    public static int F(i iVar, Object obj) {
        AbstractC5504s.h(iVar, "<this>");
        int i10 = 0;
        for (Object obj2 : iVar) {
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            if (AbstractC5504s.c(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable G(i iVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(buffer, "buffer");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Df.r.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String H(i iVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        return ((StringBuilder) G(iVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String I(i iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return H(iVar, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object J(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static i K(i iVar, Function1 transform) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(transform, "transform");
        return new z(iVar, transform);
    }

    public static i L(i iVar, Function1 transform) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(transform, "transform");
        return B(new z(iVar, transform));
    }

    public static i M(i iVar, i elements) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(elements, "elements");
        return s.j(s.s(iVar, elements));
    }

    public static i N(i iVar, Iterable elements) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(elements, "elements");
        return s.j(s.s(iVar, AbstractC2279u.c0(elements)));
    }

    public static i O(i iVar, Object obj) {
        AbstractC5504s.h(iVar, "<this>");
        return s.j(s.s(iVar, s.s(obj)));
    }

    public static long P(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        Iterator it = iVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static i Q(i iVar, int i10) {
        AbstractC5504s.h(iVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? s.i() : iVar instanceof c ? ((c) iVar).b(i10) : new x(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static i R(i iVar, Function1 predicate) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return new y(iVar, predicate);
    }

    public static final Collection S(i iVar, Collection destination) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(destination, "destination");
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List T(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return AbstractC2279u.m();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC2279u.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List U(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return (List) S(iVar, new ArrayList());
    }

    public static Iterable u(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return new a(iVar);
    }

    public static boolean v(i iVar, Object obj) {
        AbstractC5504s.h(iVar, "<this>");
        return F(iVar, obj) >= 0;
    }

    public static int w(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        Iterator it = iVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC2279u.v();
            }
        }
        return i10;
    }

    public static i x(i iVar, int i10) {
        AbstractC5504s.h(iVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? iVar : iVar instanceof c ? ((c) iVar).a(i10) : new Cf.b(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static i y(i iVar, Function1 predicate) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return new d(iVar, predicate);
    }

    public static i z(i iVar, Function1 predicate) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return new f(iVar, true, predicate);
    }
}
