package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf.AbstractC7151c;
import xf.AbstractC7153e;
import xf.AbstractC7174z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends AbstractC7153e implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: b */
    public static final a f58089b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final r0 f58090c = new r0(AbstractC2279u.m());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC7174z {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // xf.AbstractC7174z
        public int c(ConcurrentHashMap concurrentHashMap, String key, Function1 compute) {
            int iIntValue;
            AbstractC5504s.h(concurrentHashMap, "<this>");
            AbstractC5504s.h(key, "key");
            AbstractC5504s.h(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public final r0 j(List attributes) {
            AbstractC5504s.h(attributes, "attributes");
            return attributes.isEmpty() ? k() : new r0(attributes, null);
        }

        public final r0 k() {
            return r0.f58090c;
        }

        private a() {
        }
    }

    public /* synthetic */ r0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // xf.AbstractC7149a
    protected AbstractC7174z d() {
        return f58089b;
    }

    public final r0 n(r0 other) {
        AbstractC5504s.h(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f58089b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) b().get(iIntValue);
            p0 p0Var2 = (p0) other.b().get(iIntValue);
            Af.a.a(arrayList, p0Var == null ? p0Var2 != null ? p0Var2.a(p0Var) : null : p0Var.a(p0Var2));
        }
        return f58089b.j(arrayList);
    }

    public final boolean p(p0 attribute) {
        AbstractC5504s.h(attribute, "attribute");
        return b().get(f58089b.f(attribute.b())) != null;
    }

    public final r0 r(r0 other) {
        AbstractC5504s.h(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f58089b.h().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) b().get(iIntValue);
            p0 p0Var2 = (p0) other.b().get(iIntValue);
            Af.a.a(arrayList, p0Var == null ? p0Var2 != null ? p0Var2.c(p0Var) : null : p0Var.c(p0Var2));
        }
        return f58089b.j(arrayList);
    }

    public final r0 t(p0 attribute) {
        AbstractC5504s.h(attribute, "attribute");
        if (p(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new r0(attribute);
        }
        return f58089b.j(AbstractC2279u.J0(AbstractC2279u.b1(this), attribute));
    }

    public final r0 u(p0 attribute) {
        AbstractC5504s.h(attribute, "attribute");
        if (!isEmpty()) {
            AbstractC7151c abstractC7151cB = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : abstractC7151cB) {
                if (!AbstractC5504s.c((p0) obj, attribute)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != b().b()) {
                return f58089b.j(arrayList);
            }
        }
        return this;
    }

    private r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            f(p0Var.b(), p0Var);
        }
    }

    private r0(p0 p0Var) {
        this(AbstractC2279u.e(p0Var));
    }
}
