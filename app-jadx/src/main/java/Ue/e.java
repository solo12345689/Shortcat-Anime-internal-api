package Ue;

import Se.p;
import Se.q;
import Td.r;
import Td.y;
import Ud.AbstractC2279u;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a */
    private final q f19579a;

    /* JADX INFO: renamed from: b */
    private final p f19580b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19581a;

        static {
            int[] iArr = new int[p.c.EnumC0283c.values().length];
            try {
                iArr[p.c.EnumC0283c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.c.EnumC0283c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.c.EnumC0283c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19581a = iArr;
        }
    }

    public e(q strings, p qualifiedNames) {
        AbstractC5504s.h(strings, "strings");
        AbstractC5504s.h(qualifiedNames, "qualifiedNames");
        this.f19579a = strings;
        this.f19580b = qualifiedNames;
    }

    private final y c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            p.c cVarW = this.f19580b.w(i10);
            String strW = this.f19579a.w(cVarW.A());
            p.c.EnumC0283c enumC0283cY = cVarW.y();
            AbstractC5504s.e(enumC0283cY);
            int i11 = a.f19581a[enumC0283cY.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strW);
            } else if (i11 == 2) {
                linkedList.addFirst(strW);
            } else {
                if (i11 != 3) {
                    throw new r();
                }
                linkedList2.addFirst(strW);
                z10 = true;
            }
            i10 = cVarW.z();
        }
        return new y(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // Ue.d
    public boolean a(int i10) {
        return ((Boolean) c(i10).f()).booleanValue();
    }

    @Override // Ue.d
    public String b(int i10) {
        y yVarC = c(i10);
        List list = (List) yVarC.a();
        String strW0 = AbstractC2279u.w0((List) yVarC.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strW0;
        }
        return AbstractC2279u.w0(list, "/", null, null, 0, null, null, 62, null) + '/' + strW0;
    }

    @Override // Ue.d
    public String getString(int i10) {
        String strW = this.f19579a.w(i10);
        AbstractC5504s.g(strW, "getString(...)");
        return strW;
    }
}
