package xf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: xf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7153e extends AbstractC7149a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC7151c f64476a;

    protected AbstractC7153e(AbstractC7151c arrayMap) {
        AbstractC5504s.h(arrayMap, "arrayMap");
        this.f64476a = arrayMap;
    }

    private final String i(AbstractC7151c abstractC7151c, int i10, String str) {
        Object next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(abstractC7151c.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map mapB = d().b();
        sb4.append("[");
        sb4.append('\n');
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(abstractC7151c, 10));
        int i11 = 0;
        for (Object obj : abstractC7151c) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC2279u.w();
            }
            Iterator it = mapB.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).intValue() == i11) {
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) next) + '[' + i11 + "]: " + obj);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append("]");
        sb4.append('\n');
        sb2.append("Content: " + sb4.toString());
        sb2.append('\n');
        return sb2.toString();
    }

    @Override // xf.AbstractC7149a
    protected final AbstractC7151c b() {
        return this.f64476a;
    }

    @Override // xf.AbstractC7149a
    protected final void e(String keyQualifiedName, Object value) {
        AbstractC5504s.h(keyQualifiedName, "keyQualifiedName");
        AbstractC5504s.h(value, "value");
        int iE = d().e(keyQualifiedName);
        int iB = this.f64476a.b();
        if (iB == 0) {
            AbstractC7151c abstractC7151c = this.f64476a;
            if (!(abstractC7151c instanceof C7157i)) {
                throw new IllegalStateException(i(abstractC7151c, 0, "EmptyArrayMap"));
            }
            this.f64476a = new C7163o(value, iE);
            return;
        }
        if (iB == 1) {
            AbstractC7151c abstractC7151c2 = this.f64476a;
            try {
                AbstractC5504s.f(abstractC7151c2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                C7163o c7163o = (C7163o) abstractC7151c2;
                if (c7163o.e() == iE) {
                    this.f64476a = new C7163o(value, iE);
                    return;
                } else {
                    C7152d c7152d = new C7152d();
                    c7152d.d(c7163o.e(), c7163o.f());
                    this.f64476a = c7152d;
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException(i(abstractC7151c2, 1, "OneElementArrayMap"), e10);
            }
        }
        this.f64476a.d(iE, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7153e() {
        C7157i c7157i = C7157i.f64489a;
        AbstractC5504s.f(c7157i, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(c7157i);
    }
}
