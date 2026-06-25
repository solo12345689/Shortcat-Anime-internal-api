package E3;

import P9.AbstractC2013w;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class U6 {

    /* JADX INFO: renamed from: b */
    public static final U6 f4986b = new b().e();

    /* JADX INFO: renamed from: c */
    private static final String f4987c = t2.a0.H0(0);

    /* JADX INFO: renamed from: a */
    public final AbstractC2013w f4988a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Set f4989a;

        /* synthetic */ b(U6 u62, a aVar) {
            this(u62);
        }

        private void d(List list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                a(new T6(((Integer) list.get(i10)).intValue()));
            }
        }

        public b a(T6 t62) {
            this.f4989a.add((T6) AbstractC6614a.e(t62));
            return this;
        }

        b b() {
            d(T6.f4970e);
            return this;
        }

        b c() {
            d(T6.f4969d);
            return this;
        }

        public U6 e() {
            return new U6(this.f4989a);
        }

        public b f(int i10) {
            AbstractC6614a.a(i10 != 0);
            Iterator it = this.f4989a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T6 t62 = (T6) it.next();
                if (t62.f4974a == i10) {
                    this.f4989a.remove(t62);
                    break;
                }
            }
            return this;
        }

        public b() {
            this.f4989a = new HashSet();
        }

        private b(U6 u62) {
            this.f4989a = new HashSet(((U6) AbstractC6614a.e(u62)).f4988a);
        }
    }

    /* synthetic */ U6(Collection collection, a aVar) {
        this(collection);
    }

    private static boolean d(Collection collection, int i10) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((T6) it.next()).f4974a == i10) {
                return true;
            }
        }
        return false;
    }

    public static U6 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f4987c);
        if (parcelableArrayList == null) {
            AbstractC6635w.i("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return f4986b;
        }
        b bVar = new b();
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            bVar.a(T6.a((Bundle) parcelableArrayList.get(i10)));
        }
        return bVar.e();
    }

    public b a() {
        return new b();
    }

    public boolean b(int i10) {
        AbstractC6614a.b(i10 != 0, "Use contains(Command) for custom command");
        return d(this.f4988a, i10);
    }

    public boolean c(T6 t62) {
        return this.f4988a.contains(AbstractC6614a.e(t62));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U6) {
            return this.f4988a.equals(((U6) obj).f4988a);
        }
        return false;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        P9.X it = this.f4988a.iterator();
        while (it.hasNext()) {
            arrayList.add(((T6) it.next()).b());
        }
        bundle.putParcelableArrayList(f4987c, arrayList);
        return bundle;
    }

    public int hashCode() {
        return K1.b.b(this.f4988a);
    }

    private U6(Collection collection) {
        this.f4988a = AbstractC2013w.v(collection);
    }
}
