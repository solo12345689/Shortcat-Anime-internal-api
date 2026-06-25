package com.amazon.c.a.a;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34858a = "Kiwi__Version__Obfuscator";

    private d() {
    }

    public static String a(String str) {
        b(str, "text");
        return c.a(a(str.getBytes()));
    }

    public static String b(String str) {
        b(str, "text");
        return new String(a(c.c(str.getBytes())), Constants.ENCODING);
    }

    public static String c(String str) throws Throwable {
        BufferedReader bufferedReader;
        b(str, "file");
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String line = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
            return new String(a(c.c(line.getBytes())), Constants.ENCODING);
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static void a(String str, String str2) throws Throwable {
        BufferedWriter bufferedWriter;
        b(str, "text");
        b(str2, "file");
        String strA = c.a(a(str.getBytes()));
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(str2));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(strA);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private static void b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("input '" + str2 + "' cannot be null or empty");
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        byte[] bytes = f34858a.getBytes();
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = (byte) (bArr[i11] ^ bytes[i10]);
            i10++;
            if (i10 >= bytes.length) {
                i10 = 0;
            }
        }
        return bArr2;
    }

    public static void a(String[] strArr) throws Throwable {
        if (strArr != null && strArr.length != 0) {
            if (strArr.length > 1) {
                a(strArr[0], strArr[1]);
                return;
            } else {
                System.out.println(a(strArr[0]));
                return;
            }
        }
        System.out.println("Usage: com.amazon.mas.kiwi.util.KiwiVersionEncrypter <textToBeEncrypted> [<encryptToFileName>]");
    }
}
