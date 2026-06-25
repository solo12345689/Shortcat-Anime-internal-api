package O3;

import Df.r;
import Ud.AbstractC2273n;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Cursor a(Cursor c10) throws IOException {
        AbstractC5504s.h(c10, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
            while (c10.moveToNext()) {
                Object[] objArr = new Object[c10.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = c10.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(c10.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = c10.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = c10.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            fe.c.a(c10, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        AbstractC5504s.g(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(String[] columnNames, String name) {
        AbstractC5504s.h(columnNames, "columnNames");
        AbstractC5504s.h(name, "name");
        String str = com.amazon.a.a.o.c.a.b.f34706a + name;
        String str2 = com.amazon.a.a.o.c.a.b.f34706a + name + '`';
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = columnNames[i10];
            int i12 = i11 + 1;
            if (str3.length() >= name.length() + 2 && (r.A(str3, str, false, 2, null) || (str3.charAt(0) == '`' && r.A(str3, str2, false, 2, null)))) {
                return i11;
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    public static final int d(Cursor c10, String name) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c10, name);
    }

    public static final int e(Cursor c10, String name) {
        String strY0;
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(name, "name");
        int iD = d(c10, name);
        if (iD >= 0) {
            return iD;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            AbstractC5504s.g(columnNames, "c.columnNames");
            strY0 = AbstractC2273n.y0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strY0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strY0);
    }
}
