package fh;

/* JADX INFO: loaded from: classes5.dex */
abstract class l {
    static int a(int i10) {
        return i10 + ((i10 >> 31) & 8380417);
    }

    static int b(long j10) {
        return (int) ((j10 - (((long) ((int) (58728449 * j10))) * 8380417)) >>> 32);
    }

    static int c(int i10) {
        return i10 - (((4194304 + i10) >> 23) * 8380417);
    }
}
