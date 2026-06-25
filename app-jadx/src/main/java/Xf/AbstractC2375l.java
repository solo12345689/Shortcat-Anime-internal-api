package Xf;

import Ud.C2272m;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2375l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2272m f21998a = new C2272m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21999b;

    protected final void a(char[] array) {
        AbstractC5504s.h(array, "array");
        synchronized (this) {
            try {
                if (this.f21999b + array.length < AbstractC2373j.f21996a) {
                    this.f21999b += array.length;
                    this.f21998a.addLast(array);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f21998a.A();
            if (cArr != null) {
                this.f21999b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
