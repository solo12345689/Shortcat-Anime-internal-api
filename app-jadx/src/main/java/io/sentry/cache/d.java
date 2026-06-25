package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5267r0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f50552a = Charset.forName(Constants.ENCODING);

    static void a(C5322z3 c5322z3, String str, String str2) {
        File fileB = b(c5322z3, str);
        if (fileB == null) {
            c5322z3.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        c5322z3.getLogger().c(EnumC5215i3.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    static File b(C5322z3 c5322z3, String str) {
        String cacheDirPath = c5322z3.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    static Object c(C5322z3 c5322z3, String str, String str2, Class cls, InterfaceC5267r0 interfaceC5267r0) {
        File fileB = b(c5322z3, str);
        if (fileB == null) {
            c5322z3.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f50552a));
                try {
                    Object objC = interfaceC5267r0 == null ? c5322z3.getSerializer().c(bufferedReader, cls) : c5322z3.getSerializer().e(bufferedReader, cls, interfaceC5267r0);
                    bufferedReader.close();
                    return objC;
                } finally {
                }
            } catch (Throwable th2) {
                c5322z3.getLogger().a(EnumC5215i3.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    static void d(C5322z3 c5322z3, Object obj, String str, String str2) {
        File fileB = b(c5322z3, str);
        if (fileB == null) {
            c5322z3.getLogger().c(EnumC5215i3.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f50552a));
                try {
                    c5322z3.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            c5322z3.getLogger().a(EnumC5215i3.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}
