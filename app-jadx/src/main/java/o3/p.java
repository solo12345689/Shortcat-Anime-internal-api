package o3;

import java.nio.ByteBuffer;
import java.util.UUID;
import t2.AbstractC6635w;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final UUID f54396a;

        /* JADX INFO: renamed from: b */
        public final int f54397b;

        /* JADX INFO: renamed from: c */
        public final byte[] f54398c;

        /* JADX INFO: renamed from: d */
        public final UUID[] f54399d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f54396a = uuid;
            this.f54397b = i10;
            this.f54398c = bArr;
            this.f54399d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        C6609I c6609i = new C6609I(bArr);
        if (c6609i.j() < 32) {
            return null;
        }
        c6609i.b0(0);
        int iA = c6609i.a();
        int iV = c6609i.v();
        if (iV != iA) {
            AbstractC6635w.i("PsshAtomUtil", "Advertised atom size (" + iV + ") does not match buffer size: " + iA);
            return null;
        }
        int iV2 = c6609i.v();
        if (iV2 != 1886614376) {
            AbstractC6635w.i("PsshAtomUtil", "Atom type is not pssh: " + iV2);
            return null;
        }
        int iQ = AbstractC5811b.q(c6609i.v());
        if (iQ > 1) {
            AbstractC6635w.i("PsshAtomUtil", "Unsupported pssh version: " + iQ);
            return null;
        }
        UUID uuid = new UUID(c6609i.F(), c6609i.F());
        if (iQ == 1) {
            int iQ2 = c6609i.Q();
            uuidArr = new UUID[iQ2];
            for (int i10 = 0; i10 < iQ2; i10++) {
                uuidArr[i10] = new UUID(c6609i.F(), c6609i.F());
            }
        } else {
            uuidArr = null;
        }
        int iQ3 = c6609i.Q();
        int iA2 = c6609i.a();
        if (iQ3 == iA2) {
            byte[] bArr2 = new byte[iQ3];
            c6609i.q(bArr2, 0, iQ3);
            return new a(uuid, iQ, bArr2, uuidArr);
        }
        AbstractC6635w.i("PsshAtomUtil", "Atom data size (" + iQ3 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f54396a)) {
            return aVarD.f54398c;
        }
        AbstractC6635w.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f54396a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f54396a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f54397b;
    }
}
