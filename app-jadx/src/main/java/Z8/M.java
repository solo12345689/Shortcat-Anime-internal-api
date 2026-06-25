package z8;

import A8.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import p8.C5938c;
import p8.EnumC5940e;
import r8.AbstractC6283i;
import r8.AbstractC6289o;
import r8.C6282h;
import u8.C6743a;
import u8.c;
import v8.AbstractC6852a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class M implements InterfaceC7327d, A8.b, InterfaceC7326c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C5938c f65954f = C5938c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U f65955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.a f65956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.a f65957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC7328e f65958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f65959e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f65960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f65961b;

        private c(String str, String str2) {
            this.f65960a = str;
            this.f65961b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface d {
        Object a();
    }

    M(B8.a aVar, B8.a aVar2, AbstractC7328e abstractC7328e, U u10, Provider provider) {
        this.f65955a = u10;
        this.f65956b = aVar;
        this.f65957c = aVar2;
        this.f65958d = abstractC7328e;
        this.f65959e = provider;
    }

    public static /* synthetic */ Integer B0(final M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        m2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: z8.s
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.q(this.f66009a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object C(long j10, AbstractC6289o abstractC6289o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC6289o.b(), String.valueOf(C8.a.a(abstractC6289o.d()))}) < 1) {
            contentValues.put("backend_name", abstractC6289o.b());
            contentValues.put("priority", Integer.valueOf(C8.a.a(abstractC6289o.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] D(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List E(SQLiteDatabase sQLiteDatabase) {
        return (List) m2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: z8.K
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.l((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object F0(M m10, List list, AbstractC6289o abstractC6289o, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC6283i.a aVarK = AbstractC6283i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                aVarK.h(new C6282h(k2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new C6282h(k2(cursor.getString(4)), m10.i2(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC7334k.a(j10, abstractC6289o, aVarK.d()));
        }
        return null;
    }

    public static /* synthetic */ Object G0(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f65956b.a()).execute();
        return null;
    }

    public static /* synthetic */ C6743a H(M m10, Map map, C6743a.C0919a c0919a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarT1 = m10.t1(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(u8.c.c().c(bVarT1).b(j10).a());
        }
        m10.h2(c0919a, map);
        c0919a.e(m10.Z1());
        c0919a.d(m10.O1());
        c0919a.c((String) m10.f65959e.get());
        return c0919a.b();
    }

    public static /* synthetic */ C6743a M0(final M m10, String str, final Map map, final C6743a.C0919a c0919a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (C6743a) m2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: z8.A
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.H(this.f65940a, map, c0919a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long O(M m10, AbstractC6283i abstractC6283i, AbstractC6289o abstractC6289o, SQLiteDatabase sQLiteDatabase) {
        if (m10.c2()) {
            m10.h(1L, c.b.CACHE_FULL, abstractC6283i.j());
            return -1L;
        }
        long jY1 = m10.y1(sQLiteDatabase, abstractC6289o);
        int iE = m10.f65958d.e();
        byte[] bArrA = abstractC6283i.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jY1));
        contentValues.put("transport_name", abstractC6283i.j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC6283i.f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC6283i.k()));
        contentValues.put("payload_encoding", abstractC6283i.e().b().a());
        contentValues.put("code", abstractC6283i.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC6283i.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private u8.b O1() {
        return u8.b.b().b(u8.e.c().b(A1()).c(AbstractC7328e.f65993a.f()).a()).a();
    }

    public static /* synthetic */ Object S(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private long S1() {
        return D1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ Long Y(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private long Y1() {
        return D1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private u8.f Z1() {
        final long jA = this.f65956b.a();
        return (u8.f) b2(new b() { // from class: z8.C
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.q1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ Long a1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private Long a2(SQLiteDatabase sQLiteDatabase, AbstractC6289o abstractC6289o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC6289o.b(), String.valueOf(C8.a.a(abstractC6289o.d()))));
        if (abstractC6289o.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC6289o.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: z8.n
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.Y((Cursor) obj);
            }
        });
    }

    private boolean c2() {
        return S1() * Y1() >= this.f65958d.f();
    }

    private List d2(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC7334k abstractC7334k = (AbstractC7334k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC7334k.c()))) {
                AbstractC6283i.a aVarL = abstractC7334k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC7334k.c()))) {
                    aVarL.c(cVar.f65960a, cVar.f65961b);
                }
                listIterator.set(AbstractC7334k.a(abstractC7334k.c(), abstractC7334k.d(), aVarL.d()));
            }
        }
        return list;
    }

    private List e2(SQLiteDatabase sQLiteDatabase, final AbstractC6289o abstractC6289o, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lA2 = a2(sQLiteDatabase, abstractC6289o);
        if (lA2 == null) {
            return arrayList;
        }
        m2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lA2.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: z8.x
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.F0(this.f66015a, arrayList, abstractC6289o, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map f2(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC7334k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: z8.z
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.p0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] g2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object h0(Throwable th2) {
        throw new A8.a("Timed out while trying to acquire the lock.", th2);
    }

    private void h2(C6743a.C0919a c0919a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0919a.a(u8.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] i2(long j10) {
        return (byte[]) m2(D1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: z8.B
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.D((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ u8.f j(long j10, Cursor cursor) {
        cursor.moveToNext();
        return u8.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    private Object j2(d dVar, b bVar) {
        long jA = this.f65957c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f65957c.a() >= ((long) this.f65958d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ List k(M m10, AbstractC6289o abstractC6289o, SQLiteDatabase sQLiteDatabase) {
        List listE2 = m10.e2(sQLiteDatabase, abstractC6289o, m10.f65958d.d());
        for (EnumC5940e enumC5940e : EnumC5940e.values()) {
            if (enumC5940e != abstractC6289o.d()) {
                int iD = m10.f65958d.d() - listE2.size();
                if (iD <= 0) {
                    break;
                }
                listE2.addAll(m10.e2(sQLiteDatabase, abstractC6289o.f(enumC5940e), iD));
            }
        }
        return m10.d2(listE2, m10.f2(sQLiteDatabase, listE2));
    }

    public static /* synthetic */ Object k0(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())}), new b() { // from class: z8.y
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.d()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    private static C5938c k2(String str) {
        return str == null ? f65954f : C5938c.b(str);
    }

    public static /* synthetic */ List l(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC6289o.a().b(cursor.getString(1)).d(C8.a.b(cursor.getInt(2))).c(g2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private static String l2(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC7334k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static /* synthetic */ Object m(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.h(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    static Object m2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ SQLiteDatabase o(Throwable th2) {
        throw new A8.a("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Object p0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Object q(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.h(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ u8.f q1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (u8.f) m2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: z8.D
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.j(j10, (Cursor) obj);
            }
        });
    }

    private c.b t1(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.d()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.d()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.d()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.d()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.d()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.d()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.d()) {
            return bVar7;
        }
        AbstractC6852a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void u1(final SQLiteDatabase sQLiteDatabase) {
        j2(new d() { // from class: z8.l
            @Override // z8.M.d
            public final Object a() {
                return M.S(sQLiteDatabase);
            }
        }, new b() { // from class: z8.w
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.h0((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ Object w(final M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        m2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: z8.v
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.m(this.f66014a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private long y1(SQLiteDatabase sQLiteDatabase, AbstractC6289o abstractC6289o) {
        Long lA2 = a2(sQLiteDatabase, abstractC6289o);
        if (lA2 != null) {
            return lA2.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC6289o.b());
        contentValues.put("priority", Integer.valueOf(C8.a.a(abstractC6289o.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC6289o.c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC6289o.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ Boolean z(M m10, AbstractC6289o abstractC6289o, SQLiteDatabase sQLiteDatabase) {
        Long lA2 = m10.a2(sQLiteDatabase, abstractC6289o);
        return lA2 == null ? Boolean.FALSE : (Boolean) m2(m10.D1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lA2.toString()}), new b() { // from class: z8.u
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    long A1() {
        return S1() * Y1();
    }

    SQLiteDatabase D1() {
        final U u10 = this.f65955a;
        Objects.requireNonNull(u10);
        return (SQLiteDatabase) j2(new d() { // from class: z8.E
            @Override // z8.M.d
            public final Object a() {
                return u10.getWritableDatabase();
            }
        }, new b() { // from class: z8.F
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.o((Throwable) obj);
            }
        });
    }

    @Override // z8.InterfaceC7327d
    public boolean F1(final AbstractC6289o abstractC6289o) {
        return ((Boolean) b2(new b() { // from class: z8.o
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.z(this.f66001a, abstractC6289o, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // z8.InterfaceC7327d
    public Iterable P(final AbstractC6289o abstractC6289o) {
        return (Iterable) b2(new b() { // from class: z8.m
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.k(this.f65999a, abstractC6289o, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // z8.InterfaceC7327d
    public AbstractC7334k P0(final AbstractC6289o abstractC6289o, final AbstractC6283i abstractC6283i) {
        AbstractC6852a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC6289o.d(), abstractC6283i.j(), abstractC6289o.b());
        long jLongValue = ((Long) b2(new b() { // from class: z8.I
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.O(this.f65946a, abstractC6283i, abstractC6289o, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC7334k.a(jLongValue, abstractC6289o, abstractC6283i);
    }

    @Override // z8.InterfaceC7327d
    public void Q(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            D1().compileStatement("DELETE FROM events WHERE _id in " + l2(iterable)).execute();
        }
    }

    @Override // z8.InterfaceC7327d
    public void Q0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + l2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            b2(new b() { // from class: z8.L
                @Override // z8.M.b
                public final Object apply(Object obj) {
                    return M.w(this.f65951a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // z8.InterfaceC7326c
    public void a() {
        b2(new b() { // from class: z8.q
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.G0(this.f66005a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // z8.InterfaceC7326c
    public C6743a b() {
        final C6743a.C0919a c0919aE = C6743a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C6743a) b2(new b() { // from class: z8.t
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.M0(this.f66010a, str, map, c0919aE, (SQLiteDatabase) obj);
            }
        });
    }

    Object b2(b bVar) {
        SQLiteDatabase sQLiteDatabaseD1 = D1();
        sQLiteDatabaseD1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseD1);
            sQLiteDatabaseD1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseD1.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65955a.close();
    }

    @Override // z8.InterfaceC7327d
    public Iterable d0() {
        return (Iterable) b2(new b() { // from class: z8.G
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.E((SQLiteDatabase) obj);
            }
        });
    }

    @Override // A8.b
    public Object g(b.a aVar) {
        SQLiteDatabase sQLiteDatabaseD1 = D1();
        u1(sQLiteDatabaseD1);
        try {
            Object objB = aVar.b();
            sQLiteDatabaseD1.setTransactionSuccessful();
            return objB;
        } finally {
            sQLiteDatabaseD1.endTransaction();
        }
    }

    @Override // z8.InterfaceC7327d
    public void g1(final AbstractC6289o abstractC6289o, final long j10) {
        b2(new b() { // from class: z8.p
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.C(j10, abstractC6289o, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // z8.InterfaceC7326c
    public void h(final long j10, final c.b bVar, final String str) {
        b2(new b() { // from class: z8.r
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.k0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // z8.InterfaceC7327d
    public int p() {
        final long jA = this.f65956b.a() - this.f65958d.c();
        return ((Integer) b2(new b() { // from class: z8.J
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.B0(this.f65949a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // z8.InterfaceC7327d
    public long r1(AbstractC6289o abstractC6289o) {
        return ((Long) m2(D1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC6289o.b(), String.valueOf(C8.a.a(abstractC6289o.d()))}), new b() { // from class: z8.H
            @Override // z8.M.b
            public final Object apply(Object obj) {
                return M.a1((Cursor) obj);
            }
        })).longValue();
    }
}
