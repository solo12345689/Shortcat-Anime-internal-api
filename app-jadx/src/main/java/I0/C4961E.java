package i0;

import Y.V0;
import android.os.Parcel;
import android.os.Parcelable;
import b0.AbstractC2964a;
import b0.e;
import i0.C4961E;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import je.InterfaceC5374d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i0.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4961E implements Parcelable, InterfaceC4976U, List, RandomAccess, InterfaceC5374d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC4978W f48394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f48393b = new b(null);
    public static final Parcelable.Creator<C4961E> CREATOR = new a();

    /* JADX INFO: renamed from: i0.E$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(Parcel parcel, ClassLoader classLoader, int i10) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4961E createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C4961E createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            return AbstractC4962F.a(parcel.readInt(), new Function1() { // from class: i0.D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4961E.a.d(parcel, classLoader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C4961E[] newArray(int i10) {
            return new C4961E[i10];
        }
    }

    /* JADX INFO: renamed from: i0.E$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C4961E(b0.e eVar) {
        this.f48394a = AbstractC4962F.l(this, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(int i10, Collection collection, List list) {
        return list.addAll(i10, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(Collection collection, List list) {
        return list.retainAll(collection);
    }

    public final int A(Collection collection, int i10, int i11) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        int size = size();
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            e.a aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i10, i11).retainAll(collection);
            b0.e eVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(eVarBuild, eVarI)) {
                break;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarBuild, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return size - size();
    }

    public final List B() {
        return AbstractC4962F.g(this).i();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVarAdd = eVarI.add(obj);
            if (AbstractC5504s.c(eVarAdd, eVarI)) {
                return false;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarAdd, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i10, final Collection collection) {
        return AbstractC4962F.k(this, new Function1() { // from class: i0.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C4961E.e(i10, collection, (List) obj));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC4993l abstractC4993lC;
        AbstractC4978W abstractC4978WL = l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        C4971O c4971o = (C4971O) abstractC4978WL;
        synchronized (AbstractC5003v.O()) {
            abstractC4993lC = AbstractC4993l.f48495e.c();
            C4971O c4971o2 = (C4971O) AbstractC5003v.p0(c4971o, this, abstractC4993lC);
            synchronized (AbstractC4962F.f48395a) {
                c4971o2.l(AbstractC2964a.b());
                c4971o2.m(c4971o2.j() + 1);
                c4971o2.n(c4971o2.k() + 1);
            }
        }
        AbstractC5003v.X(abstractC4993lC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC4962F.g(this).i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return AbstractC4962F.g(this).i().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return AbstractC4962F.g(this).i().size();
    }

    @Override // java.util.List
    public Object get(int i10) {
        return AbstractC4962F.g(this).i().get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return AbstractC4962F.g(this).i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return AbstractC4962F.g(this).i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W l() {
        return this.f48394a;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC4962F.g(this).i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C4970N(this, 0);
    }

    @Override // i0.InterfaceC4976U
    public void r(AbstractC4978W abstractC4978W) {
        abstractC4978W.g(l());
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f48394a = (C4971O) abstractC4978W;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return w(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVarRemoveAll = eVarI.removeAll(collection);
            if (AbstractC5504s.c(eVarRemoveAll, eVarI)) {
                return false;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarRemoveAll, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection collection) {
        return AbstractC4962F.k(this, new Function1() { // from class: i0.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C4961E.z(collection, (List) obj));
            }
        });
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        Object obj2 = get(i10);
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVar = eVarI.set(i10, obj);
            if (AbstractC5504s.c(eVar, eVarI)) {
                return obj2;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVar, false);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            V0.a("fromIndex or toIndex are out of bounds");
        }
        return new C4979X(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    public String toString() {
        AbstractC4978W abstractC4978WL = l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C4971O) AbstractC5003v.K((C4971O) abstractC4978WL)).i() + ")@" + hashCode();
    }

    public Object w(int i10) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        Object obj = get(i10);
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVarH0 = eVarI.h0(i10);
            if (AbstractC5504s.c(eVarH0, eVarI)) {
                return obj;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarH0, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return obj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List listB = B();
        int size = listB.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeValue(listB.get(i11));
        }
    }

    public final void y(int i10, int i11) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            e.a aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i10, i11).clear();
            b0.e eVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(eVarBuild, eVarI)) {
                return;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarBuild, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVarAddAll = eVarI.addAll(collection);
            if (AbstractC5504s.c(eVarAddAll, eVarI)) {
                return false;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarAddAll, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new C4970N(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVarRemove = eVarI.remove(obj);
            if (AbstractC5504s.c(eVarRemove, eVarI)) {
                return false;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarRemove, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC5496j.b(this, objArr);
    }

    public C4961E() {
        this(AbstractC2964a.b());
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        int iJ;
        b0.e eVarI;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (AbstractC4962F.f48395a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            b0.e eVarAdd = eVarI.add(i10, obj);
            if (AbstractC5504s.c(eVarAdd, eVarI)) {
                return;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = AbstractC4962F.f((C4971O) AbstractC5003v.p0(c4971o2, this, abstractC4993lC), iJ, eVarAdd, true);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zF);
    }
}
