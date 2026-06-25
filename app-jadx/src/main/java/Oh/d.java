package Oh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f13174b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f13175a;

    public d(byte[] bArr) {
        this(bArr, 160);
    }

    public static byte[] a(byte[] bArr, int i10) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        Hg.h hVar = new Hg.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        hVar.update(bArr, 0, bArr.length);
        int i11 = i10 / 8;
        byte[] bArr2 = new byte[i11];
        hVar.e(bArr2, 0, i11);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return a.c(((d) obj).f13175a, this.f13175a);
        }
        return false;
    }

    public int hashCode() {
        return a.q(this.f13175a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 != this.f13175a.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            }
            stringBuffer.append(f13174b[(this.f13175a[i10] >>> 4) & 15]);
            stringBuffer.append(f13174b[this.f13175a[i10] & 15]);
        }
        return stringBuffer.toString();
    }

    public d(byte[] bArr, int i10) {
        this.f13175a = a(bArr, i10);
    }
}
