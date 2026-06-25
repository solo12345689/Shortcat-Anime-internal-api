package Xh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f22054a = b();

    public static String a(String str) {
        int i10;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strSubstring = str.substring(1, str.length() - 1);
            if (strSubstring.startsWith("#")) {
                String strSubstring2 = strSubstring.substring(1);
                if (strSubstring2.startsWith("x") || strSubstring2.startsWith("X")) {
                    strSubstring2 = strSubstring2.substring(1);
                    i10 = 16;
                } else {
                    i10 = 10;
                }
                try {
                    int i11 = Integer.parseInt(strSubstring2, i10);
                    return i11 == 0 ? "�" : new String(Character.toChars(i11));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f22054a.get(strSubstring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    private static Map b() {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(d.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        return map;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf(com.amazon.a.a.o.b.f.f34695b);
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e10);
        }
    }
}
