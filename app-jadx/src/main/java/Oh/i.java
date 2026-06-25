package Oh;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f13179a;

    static class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f13179a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f13179a = "\n";
            }
        } catch (Exception unused2) {
            f13179a = String.format("%n", new Object[0]);
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iC = Ph.e.c(bArr, cArr);
        if (iC >= 0) {
            return new String(cArr, 0, iC);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String d() {
        return f13179a;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static String f(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i10] = (char) (c10 + ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static String g(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('a' <= c10 && 'z' >= c10) {
                charArray[i10] = (char) (c10 - ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }
}
