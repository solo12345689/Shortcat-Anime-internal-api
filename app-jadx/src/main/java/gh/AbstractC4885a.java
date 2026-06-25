package gh;

/* JADX INFO: renamed from: gh.a */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC4885a {
    private static long a(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | ((long) (bArr[i10] & 255)) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    private static long b(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | ((long) (bArr[i10] & 255)) | (((long) (bArr[i10 + 1] & 255)) << 8) | (((long) (bArr[i10 + 2] & 255)) << 16);
    }

    public static void c(i iVar, byte[] bArr, int i10) {
        if (i10 != 3) {
            for (int i11 = 0; i11 < 32; i11++) {
                long jB = b(bArr, i11 * 4);
                long j10 = (jB & 1431655765) + ((jB >> 1) & 1431655765);
                for (int i12 = 0; i12 < 8; i12++) {
                    int i13 = i12 * 4;
                    iVar.j((i11 * 8) + i12, (short) (((short) ((j10 >> i13) & 3)) - ((short) (3 & (j10 >> (i13 + i10))))));
                }
            }
            return;
        }
        for (int i14 = 0; i14 < 64; i14++) {
            long jA = a(bArr, i14 * 3);
            long j11 = (jA & 2396745) + ((jA >> 1) & 2396745) + ((jA >> 2) & 2396745);
            for (int i15 = 0; i15 < 4; i15++) {
                int i16 = i15 * 6;
                iVar.j((i14 * 4) + i15, (short) (((short) ((j11 >> i16) & 7)) - ((short) (7 & (j11 >> (i16 + 3))))));
            }
        }
    }
}
