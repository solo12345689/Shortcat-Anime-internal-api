package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import t.C6552b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o */
    private static final Object f29535o = new Object();

    /* JADX INFO: renamed from: p */
    private static final Object f29536p = new Object();

    /* JADX INFO: renamed from: q */
    private static volatile e f29537q;

    /* JADX INFO: renamed from: b */
    private final Set f29539b;

    /* JADX INFO: renamed from: e */
    private final b f29542e;

    /* JADX INFO: renamed from: f */
    final h f29543f;

    /* JADX INFO: renamed from: g */
    private final j f29544g;

    /* JADX INFO: renamed from: h */
    final boolean f29545h;

    /* JADX INFO: renamed from: i */
    final boolean f29546i;

    /* JADX INFO: renamed from: j */
    final int[] f29547j;

    /* JADX INFO: renamed from: k */
    private final boolean f29548k;

    /* JADX INFO: renamed from: l */
    private final int f29549l;

    /* JADX INFO: renamed from: m */
    private final int f29550m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC0506e f29551n;

    /* JADX INFO: renamed from: a */
    private final ReadWriteLock f29538a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    private volatile int f29540c = 3;

    /* JADX INFO: renamed from: d */
    private final Handler f29541d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends b {

        /* JADX INFO: renamed from: b */
        private volatile androidx.emoji2.text.h f29552b;

        /* JADX INFO: renamed from: c */
        private volatile m f29553c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0505a extends i {
            C0505a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                a.this.f29555a.p(th2);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                a.this.f(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        int a(CharSequence charSequence, int i10) {
            return this.f29552b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.e.b
        int b(CharSequence charSequence, int i10) {
            return this.f29552b.c(charSequence, i10);
        }

        @Override // androidx.emoji2.text.e.b
        void c() {
            try {
                this.f29555a.f29543f.a(new C0505a());
            } catch (Throwable th2) {
                this.f29555a.p(th2);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f29552b.j(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.e.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f29553c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f29555a.f29545h);
        }

        void f(m mVar) {
            if (mVar == null) {
                this.f29555a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f29553c = mVar;
            m mVar2 = this.f29553c;
            j jVar = this.f29555a.f29544g;
            InterfaceC0506e interfaceC0506e = this.f29555a.f29551n;
            e eVar = this.f29555a;
            this.f29552b = new androidx.emoji2.text.h(mVar2, jVar, interfaceC0506e, eVar.f29546i, eVar.f29547j, androidx.emoji2.text.g.a());
            this.f29555a.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a */
        final e f29555a;

        b(e eVar) {
            this.f29555a = eVar;
        }

        abstract int a(CharSequence charSequence, int i10);

        abstract int b(CharSequence charSequence, int i10);

        abstract void c();

        abstract CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void e(EditorInfo editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        final h f29556a;

        /* JADX INFO: renamed from: b */
        j f29557b;

        /* JADX INFO: renamed from: c */
        boolean f29558c;

        /* JADX INFO: renamed from: d */
        boolean f29559d;

        /* JADX INFO: renamed from: e */
        int[] f29560e;

        /* JADX INFO: renamed from: f */
        Set f29561f;

        /* JADX INFO: renamed from: g */
        boolean f29562g;

        /* JADX INFO: renamed from: h */
        int f29563h = -16711936;

        /* JADX INFO: renamed from: i */
        int f29564i = 0;

        /* JADX INFO: renamed from: j */
        InterfaceC0506e f29565j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            K1.f.h(hVar, "metadataLoader cannot be null.");
            this.f29556a = hVar;
        }

        protected final h a() {
            return this.f29556a;
        }

        public c b(int i10) {
            this.f29564i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public androidx.emoji2.text.i a(o oVar) {
            return new p(oVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0506e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g implements Runnable {

        /* JADX INFO: renamed from: a */
        private final List f29566a;

        /* JADX INFO: renamed from: b */
        private final Throwable f29567b;

        /* JADX INFO: renamed from: c */
        private final int f29568c;

        g(f fVar, int i10) {
            this(Arrays.asList((f) K1.f.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f29566a.size();
            int i10 = 0;
            if (this.f29568c != 1) {
                while (i10 < size) {
                    ((f) this.f29566a.get(i10)).a(this.f29567b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f29566a.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th2) {
            K1.f.h(collection, "initCallbacks cannot be null");
            this.f29566a = new ArrayList(collection);
            this.f29568c = i10;
            this.f29567b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface h {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(m mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface j {
        androidx.emoji2.text.i a(o oVar);
    }

    private e(c cVar) {
        this.f29545h = cVar.f29558c;
        this.f29546i = cVar.f29559d;
        this.f29547j = cVar.f29560e;
        this.f29548k = cVar.f29562g;
        this.f29549l = cVar.f29563h;
        this.f29543f = cVar.f29556a;
        this.f29550m = cVar.f29564i;
        this.f29551n = cVar.f29565j;
        C6552b c6552b = new C6552b();
        this.f29539b = c6552b;
        j jVar = cVar.f29557b;
        this.f29544g = jVar == null ? new d() : jVar;
        Set set = cVar.f29561f;
        if (set != null && !set.isEmpty()) {
            c6552b.addAll(cVar.f29561f);
        }
        this.f29542e = new a(this);
        o();
    }

    public static e c() {
        e eVar;
        synchronized (f29535o) {
            eVar = f29537q;
            K1.f.i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.d(inputConnection, editable, i10, i11, z10);
    }

    public static boolean i(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.e(editable, i10, keyEvent);
    }

    public static e j(c cVar) {
        e eVar;
        e eVar2 = f29537q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f29535o) {
            try {
                eVar = f29537q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f29537q = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static boolean k() {
        return f29537q != null;
    }

    private boolean m() {
        return g() == 1;
    }

    private void o() {
        this.f29538a.writeLock().lock();
        try {
            if (this.f29550m == 0) {
                this.f29540c = 0;
            }
            this.f29538a.writeLock().unlock();
            if (g() == 0) {
                this.f29542e.c();
            }
        } catch (Throwable th2) {
            this.f29538a.writeLock().unlock();
            throw th2;
        }
    }

    public int d(CharSequence charSequence, int i10) {
        K1.f.i(m(), "Not initialized yet");
        K1.f.h(charSequence, "charSequence cannot be null");
        return this.f29542e.a(charSequence, i10);
    }

    public int e() {
        return this.f29549l;
    }

    public int f(CharSequence charSequence, int i10) {
        K1.f.i(m(), "Not initialized yet");
        K1.f.h(charSequence, "charSequence cannot be null");
        return this.f29542e.b(charSequence, i10);
    }

    public int g() {
        this.f29538a.readLock().lock();
        try {
            return this.f29540c;
        } finally {
            this.f29538a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f29548k;
    }

    public void n() {
        K1.f.i(this.f29550m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f29538a.writeLock().lock();
        try {
            if (this.f29540c == 0) {
                return;
            }
            this.f29540c = 0;
            this.f29538a.writeLock().unlock();
            this.f29542e.c();
        } finally {
            this.f29538a.writeLock().unlock();
        }
    }

    void p(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f29538a.writeLock().lock();
        try {
            this.f29540c = 2;
            arrayList.addAll(this.f29539b);
            this.f29539b.clear();
            this.f29538a.writeLock().unlock();
            this.f29541d.post(new g(arrayList, this.f29540c, th2));
        } catch (Throwable th3) {
            this.f29538a.writeLock().unlock();
            throw th3;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.f29538a.writeLock().lock();
        try {
            this.f29540c = 1;
            arrayList.addAll(this.f29539b);
            this.f29539b.clear();
            this.f29538a.writeLock().unlock();
            this.f29541d.post(new g(arrayList, this.f29540c));
        } catch (Throwable th2) {
            this.f29538a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11) {
        return t(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i10, int i11, int i12) {
        return u(charSequence, i10, i11, i12, 0);
    }

    public CharSequence u(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        K1.f.i(m(), "Not initialized yet");
        K1.f.e(i10, "start cannot be negative");
        K1.f.e(i11, "end cannot be negative");
        K1.f.e(i12, "maxEmojiCount cannot be negative");
        K1.f.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        K1.f.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        K1.f.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f29545h : false;
        } else {
            z10 = true;
        }
        return this.f29542e.d(charSequence, i10, i11, i12, z10);
    }

    public void v(f fVar) {
        K1.f.h(fVar, "initCallback cannot be null");
        this.f29538a.writeLock().lock();
        try {
            if (this.f29540c == 1 || this.f29540c == 2) {
                this.f29541d.post(new g(fVar, this.f29540c));
            } else {
                this.f29539b.add(fVar);
            }
            this.f29538a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f29538a.writeLock().unlock();
            throw th2;
        }
    }

    public void w(f fVar) {
        K1.f.h(fVar, "initCallback cannot be null");
        this.f29538a.writeLock().lock();
        try {
            this.f29539b.remove(fVar);
        } finally {
            this.f29538a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f29542e.e(editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {
        public void b() {
        }

        public void a(Throwable th2) {
        }
    }
}
