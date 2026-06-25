package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.j f29572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f29573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e.InterfaceC0506e f29574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f29576e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f29577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e.j f29578b;

        b(q qVar, e.j jVar) {
            this.f29577a = qVar;
            this.f29578b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, o oVar) {
            if (oVar.k()) {
                return true;
            }
            if (this.f29577a == null) {
                this.f29577a = new q(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f29577a.setSpan(this.f29578b.a(oVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public q a() {
            return this.f29577a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i10, int i11, o oVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29583a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m.a f29584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.a f29585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m.a f29586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f29587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f29588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f29589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f29590h;

        f(m.a aVar, boolean z10, int[] iArr) {
            this.f29584b = aVar;
            this.f29585c = aVar;
            this.f29589g = z10;
            this.f29590h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f29583a = 1;
            this.f29585c = this.f29584b;
            this.f29588f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f29585c.b().j() || d(this.f29587e)) {
                return true;
            }
            if (this.f29589g) {
                if (this.f29590h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f29590h, this.f29585c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            m.a aVarA = this.f29585c.a(i10);
            int iG = 2;
            if (this.f29583a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f29583a = 2;
                    this.f29585c = aVarA;
                    this.f29588f = 1;
                }
            } else if (aVarA != null) {
                this.f29585c = aVarA;
                this.f29588f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f29585c.b() != null) {
                    iG = 3;
                    if (this.f29588f != 1 || h()) {
                        this.f29586d = this.f29585c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f29587e = i10;
            return iG;
        }

        o b() {
            return this.f29585c.b();
        }

        o c() {
            return this.f29586d.b();
        }

        boolean e() {
            if (this.f29583a != 2 || this.f29585c.b() == null) {
                return false;
            }
            return this.f29588f > 1 || h();
        }
    }

    h(m mVar, e.j jVar, e.InterfaceC0506e interfaceC0506e, boolean z10, int[] iArr, Set set) {
        this.f29572a = jVar;
        this.f29573b = mVar;
        this.f29574c = interfaceC0506e;
        this.f29575d = z10;
        this.f29576e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i10, int i11, o oVar) {
        if (oVar.d() == 0) {
            oVar.m(this.f29574c.a(charSequence, i10, i11, oVar.h()));
        }
        return oVar.d() == 2;
    }

    private static boolean g(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private Object k(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int iCharCount;
        f fVar = new f(this.f29573b.f(), this.f29575d, this.f29576e);
        int i13 = 0;
        boolean zB = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zB) {
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !f(charSequence, iCharCount, i10, fVar.c())) {
                        zB = cVar.b(charSequence, iCharCount, i10, fVar.c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (fVar.e() && i13 < i12 && zB && (z10 || !f(charSequence, iCharCount, i10, fVar.b()))) {
            cVar.b(charSequence, iCharCount, i10, fVar.b());
        }
        return cVar.a();
    }

    int b(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i10, i10 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanEnd(iVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d(i10))).f29581c;
    }

    int c(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i10, i10 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanStart(iVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d(i10))).f29580b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0069, B:44:0x0085, B:19:0x0031), top: B:66:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r1 = r11 instanceof androidx.emoji2.text.n
            if (r1 == 0) goto La
            r0 = r11
            androidx.emoji2.text.n r0 = (androidx.emoji2.text.n) r0
            r0.a()
        La:
            java.lang.Class<androidx.emoji2.text.i> r0 = androidx.emoji2.text.i.class
            if (r1 != 0) goto L31
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L31
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2f
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2f
            androidx.emoji2.text.q r2 = new androidx.emoji2.text.q     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L39
        L2a:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto Lba
        L2f:
            r2 = 0
            goto L39
        L31:
            androidx.emoji2.text.q r2 = new androidx.emoji2.text.q     // Catch: java.lang.Throwable -> Lb0
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
        L39:
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.i[] r4 = (androidx.emoji2.text.i[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L49:
            if (r6 >= r5) goto L65
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L5a
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L5a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L49
        L65:
            r4 = r12
            r5 = r13
            if (r4 == r5) goto L6f
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb0
            if (r4 < r12) goto L71
        L6f:
            r3 = r11
            goto Lb3
        L71:
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r12) goto L84
            if (r2 == 0) goto L84
            int r12 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r12 = r2.getSpans(r3, r12, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.i[] r12 = (androidx.emoji2.text.i[]) r12     // Catch: java.lang.Throwable -> L2a
            int r12 = r12.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r12
        L84:
            r6 = r14
            androidx.emoji2.text.h$b r8 = new androidx.emoji2.text.h$b     // Catch: java.lang.Throwable -> Lb0
            androidx.emoji2.text.e$j r12 = r10.f29572a     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r2 = r10
            r3 = r11
            r7 = r15
            java.lang.Object r11 = r2.k(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La4
            androidx.emoji2.text.q r11 = (androidx.emoji2.text.q) r11     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La7
            android.text.Spannable r11 = r11.b()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            r12 = r3
            androidx.emoji2.text.n r12 = (androidx.emoji2.text.n) r12
            r12.d()
        La3:
            return r11
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Lba
        La7:
            if (r1 == 0) goto Laf
            r11 = r3
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
        Lac:
            r11.d()
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            r3 = r11
            goto La5
        Lb3:
            if (r1 == 0) goto Lb9
            r11 = r3
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
            goto Lac
        Lb9:
            return r3
        Lba:
            if (r1 == 0) goto Lc2
            r11 = r3
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
            r11.d()
        Lc2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29580b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29581c = -1;

        d(int i10) {
            this.f29579a = i10;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, o oVar) {
            int i12 = this.f29579a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f29580b = i10;
            this.f29581c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29582a;

        e(String str) {
            this.f29582a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, o oVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f29582a)) {
                return true;
            }
            oVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }
}
