package bf;

import java.util.Comparator;
import ye.InterfaceC7227e;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.Z;
import ye.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class l implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final l f33310a = new l();

    private l() {
    }

    private static Integer b(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        int iC = c(interfaceC7235m2) - c(interfaceC7235m);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (i.B(interfaceC7235m) && i.B(interfaceC7235m2)) {
            return 0;
        }
        int iCompareTo = interfaceC7235m.getName().compareTo(interfaceC7235m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(InterfaceC7235m interfaceC7235m) {
        if (i.B(interfaceC7235m)) {
            return 8;
        }
        if (interfaceC7235m instanceof InterfaceC7234l) {
            return 7;
        }
        if (interfaceC7235m instanceof Z) {
            return ((Z) interfaceC7235m).O() == null ? 6 : 5;
        }
        if (interfaceC7235m instanceof InterfaceC7247z) {
            return ((InterfaceC7247z) interfaceC7235m).O() == null ? 4 : 3;
        }
        if (interfaceC7235m instanceof InterfaceC7227e) {
            return 2;
        }
        return interfaceC7235m instanceof l0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a */
    public int compare(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        Integer numB = b(interfaceC7235m, interfaceC7235m2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
