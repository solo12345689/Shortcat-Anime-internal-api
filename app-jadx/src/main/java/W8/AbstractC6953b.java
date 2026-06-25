package w8;

/* JADX INFO: renamed from: w8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6953b {
    public static Object a(int i10, Object obj, InterfaceC6952a interfaceC6952a, c cVar) {
        Object objApply;
        if (i10 < 1) {
            return interfaceC6952a.apply(obj);
        }
        do {
            objApply = interfaceC6952a.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return objApply;
    }
}
