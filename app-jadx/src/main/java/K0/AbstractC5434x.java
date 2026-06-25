package k0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5434x {
    private static final boolean a(C5432v c5432v) {
        return c5432v.g() < c5432v.f().length() - 1 && Character.isLetter(c5432v.f().charAt(c5432v.g())) && c5432v.f().charAt(c5432v.g() + 1) == '(';
    }

    private static final List b(C5432v c5432v) throws C5430t {
        boolean z10;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!c5432v.c() && !c5432v.h(':')) {
            if (c5432v.h('*')) {
                C5432v.b(c5432v, 0, 1, null);
                z10 = true;
            } else {
                z10 = false;
            }
            Integer numValueOf2 = !c5432v.h('@') ? Integer.valueOf(c5432v.j("@") + 1) : null;
            C5432v.b(c5432v, 0, 1, null);
            int iJ = c5432v.j("L,:");
            if (c5432v.h('L')) {
                C5432v.b(c5432v, 0, 1, null);
                numValueOf = Integer.valueOf(c5432v.j(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new C5426p(numValueOf2 != null ? numValueOf2.intValue() : -1, iJ, numValueOf != null ? numValueOf.intValue() : -1, z10));
            if (c5432v.h(',')) {
                C5432v.b(c5432v, 0, 1, null);
            }
        }
        C5432v.b(c5432v, 0, 1, null);
        return arrayList;
    }

    private static final List c(C5432v c5432v) throws C5430t {
        String strG;
        c5432v.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (!c5432v.c() && !c5432v.h(')')) {
            if (c5432v.h('!')) {
                C5432v.b(c5432v, 0, 1, null);
                String strK = c5432v.k("!,)");
                if (strK.length() != 0) {
                    int i10 = Integer.parseInt(strK);
                    int i11 = 0;
                    while (i10 > 0) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                arrayList.add(new C5429s(i11, null, null, 6, null));
                                i10--;
                                break;
                            }
                            if (((C5429s) arrayList.get(i12)).a() == i11) {
                                i11++;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    z10 = true;
                }
            } else {
                int iJ = c5432v.j("!:,)");
                if (c5432v.h(':')) {
                    C5432v.b(c5432v, 0, 1, null);
                    strG = g(c5432v.k("!,)"));
                } else {
                    strG = null;
                }
                if (z10) {
                    int i13 = 0;
                    while (i13 < iJ) {
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                arrayList.add(new C5429s(i13, null, null, 6, null));
                                break;
                            }
                            if (((C5429s) arrayList.get(i14)).a() == i13) {
                                i13++;
                                break;
                            }
                            i14++;
                        }
                    }
                    z10 = false;
                }
                arrayList.add(new C5429s(iJ, null, strG, 2, null));
            }
            if (c5432v.h(',')) {
                C5432v.b(c5432v, 0, 1, null);
            }
        }
        c5432v.e(')');
        C5432v.b(c5432v, 0, 1, null);
        return arrayList;
    }

    private static final List d(C5432v c5432v) throws C5430t {
        String strG;
        c5432v.a(2);
        ArrayList arrayList = new ArrayList();
        while (!c5432v.c() && !c5432v.h(')')) {
            String strK = c5432v.k(":,)");
            if (c5432v.h(':')) {
                C5432v.b(c5432v, 0, 1, null);
                strG = g(c5432v.k(",)"));
            } else {
                strG = null;
            }
            arrayList.add(new C5429s(arrayList.size(), strK, strG));
            if (c5432v.h(',')) {
                C5432v.b(c5432v, 0, 1, null);
            }
        }
        c5432v.e(')');
        C5432v.b(c5432v, 0, 1, null);
        return arrayList;
    }

    public static final C5433w e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (C5430t e10) {
            g0.y.a(e10.getMessage(), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final k0.C5433w f(java.lang.String r13) throws k0.C5430t {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.AbstractC5434x.f(java.lang.String):k0.w");
    }

    private static final String g(String str) {
        return Df.r.M(str, "c#", "androidx.compose.", false, 4, null);
    }
}
