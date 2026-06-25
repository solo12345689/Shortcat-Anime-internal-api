package O3;

import O3.e;
import S3.g;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import android.database.Cursor;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    private static final Map a(g gVar, String str) throws IOException {
        Cursor cursorV1 = gVar.v1("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorV1.getColumnCount() <= 0) {
                Map mapI = S.i();
                fe.c.a(cursorV1, null);
                return mapI;
            }
            int columnIndex = cursorV1.getColumnIndex("name");
            int columnIndex2 = cursorV1.getColumnIndex("type");
            int columnIndex3 = cursorV1.getColumnIndex("notnull");
            int columnIndex4 = cursorV1.getColumnIndex("pk");
            int columnIndex5 = cursorV1.getColumnIndex("dflt_value");
            Map mapC = S.c();
            while (cursorV1.moveToNext()) {
                String name = cursorV1.getString(columnIndex);
                String type = cursorV1.getString(columnIndex2);
                boolean z10 = cursorV1.getInt(columnIndex3) != 0;
                int i10 = cursorV1.getInt(columnIndex4);
                String string = cursorV1.getString(columnIndex5);
                AbstractC5504s.g(name, "name");
                AbstractC5504s.g(type, "type");
                mapC.put(name, new e.a(name, type, z10, i10, string, 2));
            }
            Map mapB = S.b(mapC);
            fe.c.a(cursorV1, null);
            return mapB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                fe.c.a(cursorV1, th2);
                throw th3;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(DiagnosticsEntry.ID_KEY);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = AbstractC2279u.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC5504s.g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC5504s.g(string2, "cursor.getString(toColumnIndex)");
            listC.add(new e.d(i10, i11, string, string2));
        }
        return AbstractC2279u.Q0(AbstractC2279u.a(listC));
    }

    private static final Set c(g gVar, String str) throws IOException {
        Cursor cursorV1 = gVar.v1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorV1.getColumnIndex(DiagnosticsEntry.ID_KEY);
            int columnIndex2 = cursorV1.getColumnIndex("seq");
            int columnIndex3 = cursorV1.getColumnIndex("table");
            int columnIndex4 = cursorV1.getColumnIndex("on_delete");
            int columnIndex5 = cursorV1.getColumnIndex("on_update");
            List listB = b(cursorV1);
            cursorV1.moveToPosition(-1);
            Set setB = a0.b();
            while (cursorV1.moveToNext()) {
                if (cursorV1.getInt(columnIndex2) == 0) {
                    int i10 = cursorV1.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((e.d) obj).c() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.h());
                    }
                    String string = cursorV1.getString(columnIndex3);
                    AbstractC5504s.g(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorV1.getString(columnIndex4);
                    AbstractC5504s.g(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorV1.getString(columnIndex5);
                    AbstractC5504s.g(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = a0.a(setB);
            fe.c.a(cursorV1, null);
            return setA;
        } finally {
        }
    }

    private static final e.C0205e d(g gVar, String str, boolean z10) throws IOException {
        Cursor cursorV1 = gVar.v1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorV1.getColumnIndex("seqno");
            int columnIndex2 = cursorV1.getColumnIndex("cid");
            int columnIndex3 = cursorV1.getColumnIndex("name");
            int columnIndex4 = cursorV1.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorV1.moveToNext()) {
                    if (cursorV1.getInt(columnIndex2) >= 0) {
                        int i10 = cursorV1.getInt(columnIndex);
                        String columnName = cursorV1.getString(columnIndex3);
                        String str2 = cursorV1.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        AbstractC5504s.g(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                AbstractC5504s.g(collectionValues, "columnsMap.values");
                List listB1 = AbstractC2279u.b1(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                AbstractC5504s.g(collectionValues2, "ordersMap.values");
                e.C0205e c0205e = new e.C0205e(str, z10, listB1, AbstractC2279u.b1(collectionValues2));
                fe.c.a(cursorV1, null);
                return c0205e;
            }
            fe.c.a(cursorV1, null);
            return null;
        } finally {
        }
    }

    private static final Set e(g gVar, String str) throws IOException {
        Cursor cursorV1 = gVar.v1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorV1.getColumnIndex("name");
            int columnIndex2 = cursorV1.getColumnIndex("origin");
            int columnIndex3 = cursorV1.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = a0.b();
                while (cursorV1.moveToNext()) {
                    if (AbstractC5504s.c("c", cursorV1.getString(columnIndex2))) {
                        String name = cursorV1.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorV1.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        AbstractC5504s.g(name, "name");
                        e.C0205e c0205eD = d(gVar, name, z10);
                        if (c0205eD == null) {
                            fe.c.a(cursorV1, null);
                            return null;
                        }
                        setB.add(c0205eD);
                    }
                }
                Set setA = a0.a(setB);
                fe.c.a(cursorV1, null);
                return setA;
            }
            fe.c.a(cursorV1, null);
            return null;
        } finally {
        }
    }

    public static final e f(g database, String tableName) {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(tableName, "tableName");
        return new e(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
