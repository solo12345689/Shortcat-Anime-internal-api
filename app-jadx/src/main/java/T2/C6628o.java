package t2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: t2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6628o implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f60606a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f60607b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f60608c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f60609d = Collections.EMPTY_LIST;

    public Set a1() {
        Set set;
        synchronized (this.f60606a) {
            set = this.f60608c;
        }
        return set;
    }

    public void b(Object obj) {
        synchronized (this.f60606a) {
            try {
                ArrayList arrayList = new ArrayList(this.f60609d);
                arrayList.add(obj);
                this.f60609d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f60607b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f60608c);
                    hashSet.add(obj);
                    this.f60608c = Collections.unmodifiableSet(hashSet);
                }
                this.f60607b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int c(Object obj) {
        int iIntValue;
        synchronized (this.f60606a) {
            try {
                iIntValue = this.f60607b.containsKey(obj) ? ((Integer) this.f60607b.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void d(Object obj) {
        synchronized (this.f60606a) {
            try {
                Integer num = (Integer) this.f60607b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f60609d);
                arrayList.remove(obj);
                this.f60609d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f60607b.remove(obj);
                    HashSet hashSet = new HashSet(this.f60608c);
                    hashSet.remove(obj);
                    this.f60608c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f60607b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f60606a) {
            it = this.f60609d.iterator();
        }
        return it;
    }
}
