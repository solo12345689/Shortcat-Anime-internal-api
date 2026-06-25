package T7;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C3328c;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17332a;

    public j(int i10) {
        this.f17332a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r2 >= r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r0 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r0 instanceof com.facebook.soloader.C3331f) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if ((r0 instanceof com.facebook.soloader.C3328c) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        ((com.facebook.soloader.C3331f) r0).h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        com.facebook.soloader.p.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + r4.c() + " for library " + r8 + ": ", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        r4 = (com.facebook.soloader.C3328c) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        com.facebook.soloader.p.b("SoLoader", "Preparing BackupSoSource for the first time " + r4.c());
        r4.e(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r8 = r7.length;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(com.facebook.soloader.E[] r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "SoLoader"
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L6c
            r4 = r7[r3]
            boolean r5 = r4 instanceof com.facebook.soloader.C3328c
            if (r5 != 0) goto L10
            int r3 = r3 + 1
            goto L5
        L10:
            com.facebook.soloader.c r4 = (com.facebook.soloader.C3328c) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r1.<init>()     // Catch: java.lang.Exception -> L46
            java.lang.String r3 = "Preparing BackupSoSource for the first time "
            r1.append(r3)     // Catch: java.lang.Exception -> L46
            java.lang.String r3 = r4.c()     // Catch: java.lang.Exception -> L46
            r1.append(r3)     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L46
            com.facebook.soloader.p.b(r0, r1)     // Catch: java.lang.Exception -> L46
            r4.e(r2)     // Catch: java.lang.Exception -> L46
            int r8 = r7.length
        L2e:
            if (r2 >= r8) goto L44
            r0 = r7[r2]
            boolean r1 = r0 instanceof com.facebook.soloader.C3331f
            if (r1 != 0) goto L37
            goto L41
        L37:
            boolean r1 = r0 instanceof com.facebook.soloader.C3328c
            if (r1 == 0) goto L3c
            goto L41
        L3c:
            com.facebook.soloader.f r0 = (com.facebook.soloader.C3331f) r0
            r0.h()
        L41:
            int r2 = r2 + 1
            goto L2e
        L44:
            r7 = 1
            return r7
        L46:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Encountered an exception while reunpacking BackupSoSource "
            r1.append(r3)
            java.lang.String r3 = r4.c()
            r1.append(r3)
            java.lang.String r3 = " for library "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = ": "
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.facebook.soloader.p.c(r0, r8, r7)
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.j.b(com.facebook.soloader.E[], java.lang.String):boolean");
    }

    private void c(Error error, String str) {
        p.b("SoLoader", "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    private boolean d(E[] eArr, String str, int i10) {
        try {
            for (E e10 : eArr) {
                if ((e10 instanceof C3328c) && ((C3328c) e10).x(str, i10)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e11) {
            p.b("SoLoader", "Failed to run recovery for backup so source due to: " + e11);
            return false;
        }
    }

    @Override // T7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        C c10 = (C) unsatisfiedLinkError;
        String strA = c10.a();
        String message = c10.getMessage();
        if (strA == null) {
            p.b("SoLoader", "No so name provided in ULE, cannot recover");
            return false;
        }
        if (c10 instanceof B) {
            if ((this.f17332a & 1) == 0) {
                return false;
            }
            c(c10, strA);
            return d(eArr, strA, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        c(c10, strA);
        return b(eArr, strA);
    }
}
