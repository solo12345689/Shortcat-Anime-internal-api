package cg;

import M3.w;
import android.database.Cursor;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M3.q f33639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M3.i f33640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M3.h f33641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f33642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f33643e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a extends M3.i {
        public a(u uVar, M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR REPLACE INTO `work_data` (`id`,`notification`,`trigger`,`with_alarm_manager`) VALUES (?,?,?,?)";
        }

        @Override // M3.i
        public void i(S3.k kVar, Object obj) {
            v vVar = (v) obj;
            String str = vVar.f33644a;
            if (str == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, str);
            }
            byte[] bArr = vVar.f33645b;
            if (bArr == null) {
                kVar.I1(2);
            } else {
                kVar.p1(2, bArr);
            }
            byte[] bArr2 = vVar.f33646c;
            if (bArr2 == null) {
                kVar.I1(3);
            } else {
                kVar.p1(3, bArr2);
            }
            Boolean bool = vVar.f33647d;
            if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                kVar.I1(4);
            } else {
                kVar.m1(4, r5.intValue());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class b extends M3.h {
        public b(u uVar, M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE OR REPLACE `work_data` SET `id` = ?,`notification` = ?,`trigger` = ?,`with_alarm_manager` = ? WHERE `id` = ?";
        }

        @Override // M3.h
        public void i(S3.k kVar, Object obj) {
            v vVar = (v) obj;
            String str = vVar.f33644a;
            if (str == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, str);
            }
            byte[] bArr = vVar.f33645b;
            if (bArr == null) {
                kVar.I1(2);
            } else {
                kVar.p1(2, bArr);
            }
            byte[] bArr2 = vVar.f33646c;
            if (bArr2 == null) {
                kVar.I1(3);
            } else {
                kVar.p1(3, bArr2);
            }
            Boolean bool = vVar.f33647d;
            if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                kVar.I1(4);
            } else {
                kVar.m1(4, r0.intValue());
            }
            String str2 = vVar.f33644a;
            if (str2 == null) {
                kVar.I1(5);
            } else {
                kVar.Z0(5, str2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class c extends w {
        public c(u uVar, M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM work_data";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d extends w {
        public d(u uVar, M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM work_data WHERE id = ?";
        }
    }

    public u(M3.q qVar) {
        this.f33639a = qVar;
        this.f33640b = new a(this, qVar);
        this.f33641c = new b(this, qVar);
        this.f33642d = new c(this, qVar);
        this.f33643e = new d(this, qVar);
    }

    @Override // cg.t
    public void a(String str) {
        this.f33639a.d();
        S3.k kVarB = this.f33643e.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f33639a.e();
        try {
            kVarB.Z();
            this.f33639a.B();
        } finally {
            this.f33639a.i();
            this.f33643e.h(kVarB);
        }
    }

    @Override // cg.t
    public void b() {
        this.f33639a.d();
        S3.k kVarB = this.f33642d.b();
        this.f33639a.e();
        try {
            kVarB.Z();
            this.f33639a.B();
        } finally {
            this.f33639a.i();
            this.f33642d.h(kVarB);
        }
    }

    @Override // cg.t
    public void c(v vVar) {
        this.f33639a.d();
        this.f33639a.e();
        try {
            this.f33640b.j(vVar);
            this.f33639a.B();
        } finally {
            this.f33639a.i();
        }
    }

    @Override // cg.t
    public void d(v vVar) {
        this.f33639a.d();
        this.f33639a.e();
        try {
            this.f33641c.j(vVar);
            this.f33639a.B();
        } finally {
            this.f33639a.i();
        }
    }

    @Override // cg.t
    public List e(Boolean bool) {
        Boolean boolValueOf;
        M3.t tVarG = M3.t.g("SELECT * FROM work_data WHERE with_alarm_manager = ?", 1);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            tVarG.I1(1);
        } else {
            tVarG.m1(1, r15.intValue());
        }
        this.f33639a.d();
        Cursor cursorB = O3.b.b(this.f33639a, tVarG, false, null);
        try {
            int iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE2 = O3.a.e(cursorB, "notification");
            int iE3 = O3.a.e(cursorB, "trigger");
            int iE4 = O3.a.e(cursorB, "with_alarm_manager");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                byte[] blob = cursorB.isNull(iE2) ? null : cursorB.getBlob(iE2);
                byte[] blob2 = cursorB.isNull(iE3) ? null : cursorB.getBlob(iE3);
                Integer numValueOf = cursorB.isNull(iE4) ? null : Integer.valueOf(cursorB.getInt(iE4));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                arrayList.add(new v(string, blob, blob2, boolValueOf));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // cg.t
    public v b(String str) {
        boolean z10 = true;
        M3.t tVarG = M3.t.g("SELECT * from work_data WHERE id = ?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f33639a.d();
        v vVar = null;
        Boolean boolValueOf = null;
        Cursor cursorB = O3.b.b(this.f33639a, tVarG, false, null);
        try {
            int iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE2 = O3.a.e(cursorB, "notification");
            int iE3 = O3.a.e(cursorB, "trigger");
            int iE4 = O3.a.e(cursorB, "with_alarm_manager");
            if (cursorB.moveToFirst()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                byte[] blob = cursorB.isNull(iE2) ? null : cursorB.getBlob(iE2);
                byte[] blob2 = cursorB.isNull(iE3) ? null : cursorB.getBlob(iE3);
                Integer numValueOf = cursorB.isNull(iE4) ? null : Integer.valueOf(cursorB.getInt(iE4));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                }
                vVar = new v(string, blob, blob2, boolValueOf);
            }
            return vVar;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // cg.t
    public List a() {
        Boolean boolValueOf;
        M3.t tVarG = M3.t.g("SELECT * FROM work_data", 0);
        this.f33639a.d();
        Cursor cursorB = O3.b.b(this.f33639a, tVarG, false, null);
        try {
            int iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE2 = O3.a.e(cursorB, "notification");
            int iE3 = O3.a.e(cursorB, "trigger");
            int iE4 = O3.a.e(cursorB, "with_alarm_manager");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                byte[] blob = cursorB.isNull(iE2) ? null : cursorB.getBlob(iE2);
                byte[] blob2 = cursorB.isNull(iE3) ? null : cursorB.getBlob(iE3);
                Integer numValueOf = cursorB.isNull(iE4) ? null : Integer.valueOf(cursorB.getInt(iE4));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                arrayList.add(new v(string, blob, blob2, boolValueOf));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // cg.t
    public void a(List list) {
        this.f33639a.d();
        StringBuilder sbB = O3.d.b();
        sbB.append("DELETE FROM work_data WHERE id in (");
        O3.d.a(sbB, list.size());
        sbB.append(")");
        S3.k kVarF = this.f33639a.f(sbB.toString());
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                kVarF.I1(i10);
            } else {
                kVarF.Z0(i10, str);
            }
            i10++;
        }
        this.f33639a.e();
        try {
            kVarF.Z();
            this.f33639a.B();
        } finally {
            this.f33639a.i();
        }
    }
}
