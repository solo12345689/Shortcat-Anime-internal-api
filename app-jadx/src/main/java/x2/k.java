package x2;

import P9.AbstractC2013w;
import P9.X;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import t2.AbstractC6614a;
import t2.C6615b;
import t2.a0;
import v2.C6837a;
import v2.InterfaceC6838b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a */
    private final HashMap f63760a;

    /* JADX INFO: renamed from: b */
    private final SparseArray f63761b;

    /* JADX INFO: renamed from: c */
    private final SparseBooleanArray f63762c;

    /* JADX INFO: renamed from: d */
    private final SparseBooleanArray f63763d;

    /* JADX INFO: renamed from: e */
    private c f63764e;

    /* JADX INFO: renamed from: f */
    private c f63765f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements c {

        /* JADX INFO: renamed from: e */
        private static final String[] f63766e = {DiagnosticsEntry.ID_KEY, SubscriberAttributeKt.JSON_NAME_KEY, "metadata"};

        /* JADX INFO: renamed from: a */
        private final InterfaceC6838b f63767a;

        /* JADX INFO: renamed from: b */
        private final SparseArray f63768b = new SparseArray();

        /* JADX INFO: renamed from: c */
        private String f63769c;

        /* JADX INFO: renamed from: d */
        private String f63770d;

        public a(InterfaceC6838b interfaceC6838b) {
            this.f63767a = interfaceC6838b;
        }

        private void g(SQLiteDatabase sQLiteDatabase, j jVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k.r(jVar.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(DiagnosticsEntry.ID_KEY, Integer.valueOf(jVar.f63753a));
            contentValues.put(SubscriberAttributeKt.JSON_NAME_KEY, jVar.f63754b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) AbstractC6614a.e(this.f63770d), null, contentValues);
        }

        private static void h(InterfaceC6838b interfaceC6838b, String str) throws C6837a {
            try {
                String strL = l(str);
                SQLiteDatabase writableDatabase = interfaceC6838b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    v2.d.c(writableDatabase, 1, str);
                    j(writableDatabase, strL);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new C6837a(e10);
            }
        }

        private void i(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) AbstractC6614a.e(this.f63770d), "id = ?", new String[]{Integer.toString(i10)});
        }

        private static void j(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor k() {
            return this.f63767a.getReadableDatabase().query((String) AbstractC6614a.e(this.f63770d), f63766e, null, null, null, null, null);
        }

        private static String l(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void m(SQLiteDatabase sQLiteDatabase) throws C6837a {
            v2.d.d(sQLiteDatabase, 1, (String) AbstractC6614a.e(this.f63769c), 1);
            j(sQLiteDatabase, (String) AbstractC6614a.e(this.f63770d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f63770d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // x2.k.c
        public void a(j jVar, boolean z10) {
            if (z10) {
                this.f63768b.delete(jVar.f63753a);
            } else {
                this.f63768b.put(jVar.f63753a, null);
            }
        }

        @Override // x2.k.c
        public void b(HashMap map) throws C6837a {
            if (this.f63768b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f63767a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f63768b.size(); i10++) {
                    try {
                        j jVar = (j) this.f63768b.valueAt(i10);
                        if (jVar == null) {
                            i(writableDatabase, this.f63768b.keyAt(i10));
                        } else {
                            g(writableDatabase, jVar);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f63768b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new C6837a(e10);
            }
        }

        @Override // x2.k.c
        public void c(long j10) {
            String hexString = Long.toHexString(j10);
            this.f63769c = hexString;
            this.f63770d = l(hexString);
        }

        @Override // x2.k.c
        public void d(HashMap map) throws C6837a {
            try {
                SQLiteDatabase writableDatabase = this.f63767a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        g(writableDatabase, (j) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f63768b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } catch (SQLException e10) {
                throw new C6837a(e10);
            }
        }

        @Override // x2.k.c
        public void delete() throws C6837a {
            h(this.f63767a, (String) AbstractC6614a.e(this.f63769c));
        }

        @Override // x2.k.c
        public void e(j jVar) {
            this.f63768b.put(jVar.f63753a, jVar);
        }

        @Override // x2.k.c
        public boolean exists() throws C6837a {
            try {
                return v2.d.b(this.f63767a.getReadableDatabase(), 1, (String) AbstractC6614a.e(this.f63769c)) != -1;
            } catch (SQLException e10) {
                throw new C6837a(e10);
            }
        }

        @Override // x2.k.c
        public void f(HashMap map, SparseArray sparseArray) throws C6837a {
            AbstractC6614a.g(this.f63768b.size() == 0);
            try {
                if (v2.d.b(this.f63767a.getReadableDatabase(), 1, (String) AbstractC6614a.e(this.f63769c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f63767a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        m(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorK = k();
                while (cursorK.moveToNext()) {
                    try {
                        j jVar = new j(cursorK.getInt(0), (String) AbstractC6614a.e(cursorK.getString(1)), k.o(new DataInputStream(new ByteArrayInputStream(cursorK.getBlob(2)))));
                        map.put(jVar.f63754b, jVar);
                        sparseArray.put(jVar.f63753a, jVar.f63754b);
                    } finally {
                    }
                }
                cursorK.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new C6837a(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        void a(j jVar, boolean z10);

        void b(HashMap map);

        void c(long j10);

        void d(HashMap map);

        void delete();

        void e(j jVar);

        boolean exists();

        void f(HashMap map, SparseArray sparseArray);
    }

    public k(InterfaceC6838b interfaceC6838b, File file, byte[] bArr, boolean z10, boolean z11) {
        AbstractC6614a.g((interfaceC6838b == null && file == null) ? false : true);
        this.f63760a = new HashMap();
        this.f63761b = new SparseArray();
        this.f63762c = new SparseBooleanArray();
        this.f63763d = new SparseBooleanArray();
        a aVar = interfaceC6838b != null ? new a(interfaceC6838b) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : null;
        if (aVar == null || (bVar != null && z11)) {
            this.f63764e = (c) a0.l(bVar);
            this.f63765f = aVar;
        } else {
            this.f63764e = aVar;
            this.f63765f = bVar;
        }
    }

    private j c(String str) {
        int iJ = j(this.f63761b);
        j jVar = new j(iJ, str);
        this.f63760a.put(str, jVar);
        this.f63761b.put(iJ, str);
        this.f63763d.put(iJ, true);
        this.f63764e.e(jVar);
        return jVar;
    }

    static int j(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean m(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public static n o(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException("Invalid value size: " + i12);
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = a0.f60567f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new n(map);
    }

    public static void r(n nVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setH = nVar.h();
        dataOutputStream.writeInt(setH.size());
        for (Map.Entry entry : setH) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void d(String str, m mVar) {
        j jVarK = k(str);
        if (jVarK.b(mVar)) {
            this.f63764e.e(jVarK);
        }
    }

    public int e(String str) {
        return k(str).f63753a;
    }

    public j f(String str) {
        return (j) this.f63760a.get(str);
    }

    public Collection g() {
        return Collections.unmodifiableCollection(this.f63760a.values());
    }

    public l h(String str) {
        j jVarF = f(str);
        return jVarF != null ? jVarF.c() : n.f63780c;
    }

    public String i(int i10) {
        return (String) this.f63761b.get(i10);
    }

    public j k(String str) {
        j jVar = (j) this.f63760a.get(str);
        return jVar == null ? c(str) : jVar;
    }

    public void l(long j10) {
        c cVar;
        this.f63764e.c(j10);
        c cVar2 = this.f63765f;
        if (cVar2 != null) {
            cVar2.c(j10);
        }
        if (this.f63764e.exists() || (cVar = this.f63765f) == null || !cVar.exists()) {
            this.f63764e.f(this.f63760a, this.f63761b);
        } else {
            this.f63765f.f(this.f63760a, this.f63761b);
            this.f63764e.d(this.f63760a);
        }
        c cVar3 = this.f63765f;
        if (cVar3 != null) {
            cVar3.delete();
            this.f63765f = null;
        }
    }

    public void n(String str) {
        j jVar = (j) this.f63760a.get(str);
        if (jVar != null && jVar.f() && jVar.h()) {
            this.f63760a.remove(str);
            int i10 = jVar.f63753a;
            boolean z10 = this.f63763d.get(i10);
            this.f63764e.a(jVar, z10);
            if (z10) {
                this.f63761b.remove(i10);
                this.f63763d.delete(i10);
            } else {
                this.f63761b.put(i10, null);
                this.f63762c.put(i10, true);
            }
        }
    }

    public void p() {
        X it = AbstractC2013w.v(this.f63760a.keySet()).iterator();
        while (it.hasNext()) {
            n((String) it.next());
        }
    }

    public void q() {
        this.f63764e.b(this.f63760a);
        int size = this.f63762c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f63761b.remove(this.f63762c.keyAt(i10));
        }
        this.f63762c.clear();
        this.f63763d.clear();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        private final boolean f63771a;

        /* JADX INFO: renamed from: b */
        private final Cipher f63772b;

        /* JADX INFO: renamed from: c */
        private final SecretKeySpec f63773c;

        /* JADX INFO: renamed from: d */
        private final SecureRandom f63774d;

        /* JADX INFO: renamed from: e */
        private final C6615b f63775e;

        /* JADX INFO: renamed from: f */
        private boolean f63776f;

        /* JADX INFO: renamed from: g */
        private q f63777g;

        public b(File file, byte[] bArr, boolean z10) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            AbstractC6614a.g((bArr == null && z10) ? false : true);
            if (bArr != null) {
                AbstractC6614a.a(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                AbstractC6614a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f63771a = z10;
            this.f63772b = cipher;
            this.f63773c = secretKeySpec;
            this.f63774d = z10 ? new SecureRandom() : null;
            this.f63775e = new C6615b(file);
        }

        private int g(j jVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (jVar.f63753a * 31) + jVar.f63754b.hashCode();
            if (i10 < 2) {
                long jA = l.a(jVar.c());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jA ^ (jA >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = jVar.c().hashCode();
            }
            return i11 + iHashCode;
        }

        private j h(int i10, DataInputStream dataInputStream) throws IOException {
            n nVarO;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                m mVar = new m();
                m.g(mVar, j10);
                nVarO = n.f63780c.g(mVar);
            } else {
                nVarO = k.o(dataInputStream);
            }
            return new j(i11, utf, nVarO);
        }

        private boolean i(HashMap map, SparseArray sparseArray) throws Throwable {
            if (!this.f63775e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f63775e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f63772b == null) {
                                a0.p(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f63772b.init(2, (Key) a0.l(this.f63773c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f63772b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f63771a) {
                            this.f63776f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int iG = 0;
                        for (int i12 = 0; i12 < i11; i12++) {
                            j jVarH = h(i10, dataInputStream2);
                            map.put(jVarH.f63754b, jVarH);
                            sparseArray.put(jVarH.f63753a, jVarH.f63754b);
                            iG += g(jVarH, i10);
                        }
                        int i13 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i13 == iG && z10) {
                            a0.p(dataInputStream2);
                            return true;
                        }
                        a0.p(dataInputStream2);
                        return false;
                    }
                    a0.p(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        a0.p(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        a0.p(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void j(j jVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(jVar.f63753a);
            dataOutputStream.writeUTF(jVar.f63754b);
            k.r(jVar.c(), dataOutputStream);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void k(HashMap map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamF = this.f63775e.f();
                q qVar = this.f63777g;
                if (qVar == null) {
                    this.f63777g = new q(outputStreamF);
                } else {
                    qVar.a(outputStreamF);
                }
                q qVar2 = this.f63777g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(qVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f63771a ? 1 : 0);
                    if (this.f63771a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) a0.l(this.f63774d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) a0.l(this.f63772b)).init(1, (Key) a0.l(this.f63773c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(qVar2, this.f63772b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    int iG = 0;
                    for (j jVar : map.values()) {
                        j(jVar, dataOutputStream2);
                        iG += g(jVar, 2);
                    }
                    dataOutputStream2.writeInt(iG);
                    this.f63775e.b(dataOutputStream2);
                    a0.p(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    a0.p(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // x2.k.c
        public void a(j jVar, boolean z10) {
            this.f63776f = true;
        }

        @Override // x2.k.c
        public void b(HashMap map) throws Throwable {
            if (this.f63776f) {
                d(map);
            }
        }

        @Override // x2.k.c
        public void d(HashMap map) throws Throwable {
            k(map);
            this.f63776f = false;
        }

        @Override // x2.k.c
        public void delete() {
            this.f63775e.a();
        }

        @Override // x2.k.c
        public void e(j jVar) {
            this.f63776f = true;
        }

        @Override // x2.k.c
        public boolean exists() {
            return this.f63775e.c();
        }

        @Override // x2.k.c
        public void f(HashMap map, SparseArray sparseArray) {
            AbstractC6614a.g(!this.f63776f);
            if (i(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f63775e.a();
        }

        @Override // x2.k.c
        public void c(long j10) {
        }
    }
}
