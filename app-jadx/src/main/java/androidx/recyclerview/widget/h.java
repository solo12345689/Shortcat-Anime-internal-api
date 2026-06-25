package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a */
    final a f32135a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        a.b a(int i10, int i11, int i12, Object obj);

        void b(a.b bVar);
    }

    h(a aVar) {
        this.f32135a = aVar;
    }

    private int a(List list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f32007a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f32010d;
        int i13 = bVar2.f32008b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f32008b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f32008b = i15 + bVar2.f32010d;
        }
        int i16 = bVar2.f32008b;
        if (i16 <= i12) {
            bVar.f32010d = i12 + bVar2.f32010d;
        }
        bVar2.f32008b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List list, int i10, int i11) {
        a.b bVar = (a.b) list.get(i10);
        a.b bVar2 = (a.b) list.get(i11);
        int i12 = bVar2.f32007a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            f(list, i10, bVar, i11, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        boolean z10;
        int i12 = bVar.f32008b;
        int i13 = bVar.f32010d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f32008b == i12 && bVar2.f32010d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f32008b == i13 + 1 && bVar2.f32010d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f32008b;
        if (i13 < i14) {
            bVar2.f32008b = i14 - 1;
        } else {
            int i15 = bVar2.f32010d;
            if (i13 < i14 + i15) {
                bVar2.f32010d = i15 - 1;
                bVar.f32007a = 2;
                bVar.f32010d = 1;
                if (bVar2.f32010d == 0) {
                    list.remove(i11);
                    this.f32135a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f32008b;
        int i17 = bVar2.f32008b;
        a.b bVarA = null;
        if (i16 <= i17) {
            bVar2.f32008b = i17 + 1;
        } else {
            int i18 = bVar2.f32010d;
            if (i16 < i17 + i18) {
                bVarA = this.f32135a.a(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f32010d = bVar.f32008b - bVar2.f32008b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f32135a.b(bVar);
            return;
        }
        if (z10) {
            if (bVarA != null) {
                int i19 = bVar.f32008b;
                if (i19 > bVarA.f32008b) {
                    bVar.f32008b = i19 - bVarA.f32010d;
                }
                int i20 = bVar.f32010d;
                if (i20 > bVarA.f32008b) {
                    bVar.f32010d = i20 - bVarA.f32010d;
                }
            }
            int i21 = bVar.f32008b;
            if (i21 > bVar2.f32008b) {
                bVar.f32008b = i21 - bVar2.f32010d;
            }
            int i22 = bVar.f32010d;
            if (i22 > bVar2.f32008b) {
                bVar.f32010d = i22 - bVar2.f32010d;
            }
        } else {
            if (bVarA != null) {
                int i23 = bVar.f32008b;
                if (i23 >= bVarA.f32008b) {
                    bVar.f32008b = i23 - bVarA.f32010d;
                }
                int i24 = bVar.f32010d;
                if (i24 >= bVarA.f32008b) {
                    bVar.f32010d = i24 - bVarA.f32010d;
                }
            }
            int i25 = bVar.f32008b;
            if (i25 >= bVar2.f32008b) {
                bVar.f32008b = i25 - bVar2.f32010d;
            }
            int i26 = bVar.f32010d;
            if (i26 >= bVar2.f32008b) {
                bVar.f32010d = i26 - bVar2.f32010d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f32008b != bVar.f32010d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVarA != null) {
            list.add(i10, bVarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f32010d
            int r1 = r13.f32008b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f32008b = r1
            goto L20
        Ld:
            int r5 = r13.f32010d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f32010d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f32135a
            int r1 = r11.f32008b
            java.lang.Object r5 = r13.f32009c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f32008b
            int r5 = r13.f32008b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f32008b = r5
            goto L41
        L2b:
            int r6 = r13.f32010d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f32135a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f32009c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r13.f32010d
            int r1 = r1 - r5
            r13.f32010d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f32010d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f32135a
            r11.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
