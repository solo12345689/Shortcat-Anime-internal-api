package androidx.work.impl;

import Ud.S;
import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f32699a = new A();

    private A() {
    }

    private final File c(Context context) {
        return new File(C2951a.f32779a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        AbstractC5504s.h(context, "context");
        A a10 = f32699a;
        if (a10.b(context).exists()) {
            i4.i.e().a(B.f32700a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a10.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        i4.i.e().k(B.f32700a, "Over-writing contents of " + file2);
                    }
                    i4.i.e().a(B.f32700a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public final File a(Context context) {
        AbstractC5504s.h(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        AbstractC5504s.h(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC5504s.g(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        AbstractC5504s.h(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = B.f32701b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(strArr.length), 16));
        for (String str : strArr) {
            Pair pairA = Td.z.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return S.q(linkedHashMap, Td.z.a(fileB, fileA));
    }
}
