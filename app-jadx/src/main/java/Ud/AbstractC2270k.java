package Ud;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Ud.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2270k extends AbstractC2261b implements Set, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19511a = new a(null);

    /* JADX INFO: renamed from: Ud.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set c10, Set other) {
            AbstractC5504s.h(c10, "c");
            AbstractC5504s.h(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        public final int b(Collection c10) {
            AbstractC5504s.h(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        private a() {
        }
    }

    protected AbstractC2270k() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f19511a.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f19511a.b(this);
    }
}
