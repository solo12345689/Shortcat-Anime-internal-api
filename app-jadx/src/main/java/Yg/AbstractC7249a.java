package yg;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: yg.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7249a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final File[] f65154a = new File[0];

    public static void a(File file) throws IOException {
        if (!file.exists()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(file);
            stringBuffer.append(" does not exist");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        if (!file.isDirectory()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(file);
            stringBuffer2.append(" is not a directory");
            throw new IllegalArgumentException(stringBuffer2.toString());
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Failed to list contents of ");
            stringBuffer3.append(file);
            throw new IOException(stringBuffer3.toString());
        }
        IOException e10 = null;
        for (File file2 : fileArrListFiles) {
            try {
                j(file2);
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    public static void b(File file, File file2) throws IOException {
        d(file, file2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.io.File r5, java.io.File r6, java.io.FileFilter r7, boolean r8) throws java.io.IOException {
        /*
            if (r5 == 0) goto Lc0
            if (r6 == 0) goto Lb8
            boolean r0 = r5.exists()
            java.lang.String r1 = "Source '"
            if (r0 == 0) goto L9e
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L84
            java.lang.String r0 = r5.getCanonicalPath()
            java.lang.String r2 = r6.getCanonicalPath()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L62
            java.lang.String r0 = r6.getCanonicalPath()
            java.lang.String r1 = r5.getCanonicalPath()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L5d
            if (r7 != 0) goto L35
            java.io.File[] r0 = r5.listFiles()
            goto L39
        L35:
            java.io.File[] r0 = r5.listFiles(r7)
        L39:
            if (r0 == 0) goto L5d
            int r1 = r0.length
            if (r1 <= 0) goto L5d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            r2 = 0
        L45:
            int r3 = r0.length
            if (r2 >= r3) goto L5e
            java.io.File r3 = new java.io.File
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            r3.<init>(r6, r4)
            java.lang.String r3 = r3.getCanonicalPath()
            r1.add(r3)
            int r2 = r2 + 1
            goto L45
        L5d:
            r1 = 0
        L5e:
            h(r5, r6, r7, r8, r1)
            return
        L62:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            r8.append(r1)
            r8.append(r5)
            java.lang.String r5 = "' and destination '"
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = "' are the same"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
        L84:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            r7.append(r1)
            r7.append(r5)
            java.lang.String r5 = "' exists but is not a directory"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L9e:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            r7.append(r1)
            r7.append(r5)
            java.lang.String r5 = "' does not exist"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Destination must not be null"
            r5.<init>(r6)
            throw r5
        Lc0:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Source must not be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.AbstractC7249a.c(java.io.File, java.io.File, java.io.FileFilter, boolean):void");
    }

    public static void d(File file, File file2, boolean z10) throws IOException {
        c(file, file2, null, z10);
    }

    public static void e(File file, File file2) throws IOException {
        f(file, file2, true);
    }

    public static void f(File file, File file2, boolean z10) throws IOException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Source '");
            stringBuffer.append(file);
            stringBuffer.append("' does not exist");
            throw new FileNotFoundException(stringBuffer.toString());
        }
        if (file.isDirectory()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Source '");
            stringBuffer2.append(file);
            stringBuffer2.append("' exists but is a directory");
            throw new IOException(stringBuffer2.toString());
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Source '");
            stringBuffer3.append(file);
            stringBuffer3.append("' and destination '");
            stringBuffer3.append(file2);
            stringBuffer3.append("' are the same");
            throw new IOException(stringBuffer3.toString());
        }
        if (file2.getParentFile() != null && !file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Destination '");
            stringBuffer4.append(file2);
            stringBuffer4.append("' directory cannot be created");
            throw new IOException(stringBuffer4.toString());
        }
        if (!file2.exists() || file2.canWrite()) {
            i(file, file2, z10);
            return;
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("Destination '");
        stringBuffer5.append(file2);
        stringBuffer5.append("' exists but is read-only");
        throw new IOException(stringBuffer5.toString());
    }

    public static void g(File file) throws IOException {
        if (file.exists()) {
            a(file);
            if (file.delete()) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unable to delete directory ");
            stringBuffer.append(file);
            stringBuffer.append(".");
            throw new IOException(stringBuffer.toString());
        }
    }

    private static void h(File file, File file2, FileFilter fileFilter, boolean z10, List list) throws IOException {
        if (!file2.exists()) {
            if (!file2.mkdirs()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Destination '");
                stringBuffer.append(file2);
                stringBuffer.append("' directory cannot be created");
                throw new IOException(stringBuffer.toString());
            }
            if (z10) {
                file2.setLastModified(file.lastModified());
            }
        } else if (!file2.isDirectory()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Destination '");
            stringBuffer2.append(file2);
            stringBuffer2.append("' exists but is not a directory");
            throw new IOException(stringBuffer2.toString());
        }
        if (!file2.canWrite()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Destination '");
            stringBuffer3.append(file2);
            stringBuffer3.append("' cannot be written to");
            throw new IOException(stringBuffer3.toString());
        }
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (fileArrListFiles == null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Failed to list contents of ");
            stringBuffer4.append(file);
            throw new IOException(stringBuffer4.toString());
        }
        for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
            File file3 = new File(file2, fileArrListFiles[i10].getName());
            if (list == null || !list.contains(fileArrListFiles[i10].getCanonicalPath())) {
                if (fileArrListFiles[i10].isDirectory()) {
                    h(fileArrListFiles[i10], file3, fileFilter, z10, list);
                } else {
                    i(fileArrListFiles[i10], file3, z10);
                }
            }
        }
    }

    private static void i(File file, File file2, boolean z10) throws IOException {
        if (file2.exists() && file2.isDirectory()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Destination '");
            stringBuffer.append(file2);
            stringBuffer.append("' exists but is a directory");
            throw new IOException(stringBuffer.toString());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC7250b.c(fileInputStream, fileOutputStream);
                AbstractC7250b.a(fileInputStream);
                if (file.length() == file2.length()) {
                    if (z10) {
                        file2.setLastModified(file.lastModified());
                    }
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Failed to copy full contents from '");
                    stringBuffer2.append(file);
                    stringBuffer2.append("' to '");
                    stringBuffer2.append(file2);
                    stringBuffer2.append("'");
                    throw new IOException(stringBuffer2.toString());
                }
            } finally {
                AbstractC7250b.b(fileOutputStream);
            }
        } catch (Throwable th2) {
            AbstractC7250b.a(fileInputStream);
            throw th2;
        }
    }

    public static void j(File file) throws IOException {
        if (file.isDirectory()) {
            g(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (zExists) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unable to delete file: ");
            stringBuffer.append(file);
            throw new IOException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("File does not exist: ");
        stringBuffer2.append(file);
        throw new FileNotFoundException(stringBuffer2.toString());
    }
}
