package x5;

import java.io.File;

/* JADX INFO: renamed from: x5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7054a {
    public static boolean a(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zB = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zB &= b(file2);
            }
        }
        return zB;
    }

    public static boolean b(File file) {
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    public static void c(File file, b bVar) {
        bVar.c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2, bVar);
                } else {
                    bVar.b(file2);
                }
            }
        }
        bVar.a(file);
    }
}
