package s2;

import P9.AbstractC2011u;
import P9.K;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import t2.AbstractC6622i;
import t2.a0;

/* JADX INFO: renamed from: s2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6407e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final K f59082c = K.c().d(new O9.f() { // from class: s2.b
        @Override // O9.f
        public final Object apply(Object obj) {
            return Integer.valueOf(((C6403a) obj).f59063r);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C6407e f59083d = new C6407e(AbstractC2011u.A(), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f59084e = a0.H0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f59085f = a0.H0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2011u f59086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59087b;

    public C6407e(List list, long j10) {
        this.f59086a = AbstractC2011u.L(f59082c, list);
        this.f59087b = j10;
    }

    private static AbstractC2011u b(List list) {
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((C6403a) list.get(i10)).f59049d == null) {
                aVarT.a((C6403a) list.get(i10));
            }
        }
        return aVarT.k();
    }

    public static C6407e c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f59084e);
        return new C6407e(parcelableArrayList == null ? AbstractC2011u.A() : AbstractC6622i.d(new C6406d(), parcelableArrayList), bundle.getLong(f59085f));
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f59084e, AbstractC6622i.h(b(this.f59086a), new O9.f() { // from class: s2.c
            @Override // O9.f
            public final Object apply(Object obj) {
                return ((C6403a) obj).c();
            }
        }));
        bundle.putLong(f59085f, this.f59087b);
        return bundle;
    }
}
