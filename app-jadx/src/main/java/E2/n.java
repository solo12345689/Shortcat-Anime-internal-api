package E2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4297c;

    private n(List list, List list2, List list3) {
        this.f4295a = list;
        this.f4296b = list2;
        this.f4297c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    private static void c(String str, List list, List list2, List list3) {
        String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                length += 2;
            } else {
                list3.add("");
                int i10 = length + 1;
                int iIndexOf2 = str.indexOf("$", i10);
                String strSubstring2 = str.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f4296b.size(); i11++) {
            sb2.append((String) this.f4295a.get(i11));
            if (((Integer) this.f4296b.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) this.f4296b.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) this.f4297c.get(i11), Long.valueOf(j10)));
            } else if (((Integer) this.f4296b.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) this.f4297c.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) this.f4296b.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) this.f4297c.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) this.f4295a.get(this.f4296b.size()));
        return sb2.toString();
    }
}
