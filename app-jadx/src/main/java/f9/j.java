package f9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 9);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
        return objArr;
    }
}
