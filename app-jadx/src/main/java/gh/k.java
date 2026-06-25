package gh;

/* JADX INFO: loaded from: classes5.dex */
abstract class k {
    public static short a(short s10) {
        return (short) (s10 - ((short) (((short) ((((short) 20159) * s10) >> 26)) * 3329)));
    }

    public static short b(short s10) {
        short s11 = (short) (s10 - 3329);
        return (short) (s11 + ((s11 >> 15) & 3329));
    }

    public static short c(int i10) {
        return (short) ((i10 - (((short) (62209 * i10)) * 3329)) >> 16);
    }
}
