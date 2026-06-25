package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L0 extends P0 {

    /* JADX INFO: renamed from: c */
    private static final Class f39086c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ L0(K0 k02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) A1.f(obj, j10);
        if (list instanceof J0) {
            objUnmodifiableList = ((J0) list).m();
        } else if (f39086c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        A1.p(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List list3 = (List) A1.f(obj2, j10);
        int size = list3.size();
        List list4 = (List) A1.f(obj, j10);
        if (list4.isEmpty()) {
            List i02 = list4 instanceof J0 ? new I0(size) : new ArrayList(size);
            A1.p(obj, j10, i02);
            list2 = i02;
        } else {
            if (f39086c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                A1.p(obj, j10, arrayList);
                list = arrayList;
            } else {
                boolean z10 = list4 instanceof C3398v1;
                list2 = list4;
                if (z10) {
                    I0 i03 = new I0(list4.size() + size);
                    i03.addAll(i03.size(), (C3398v1) list4);
                    A1.p(obj, j10, i03);
                    list = i03;
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        A1.p(obj, j10, list3);
    }
}
