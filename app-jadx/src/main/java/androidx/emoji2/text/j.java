package androidx.emoji2.text;

import A1.A;
import H1.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f29596k = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {
        public Typeface a(Context context, j.b bVar) {
            return H1.j.a(context, null, new j.b[]{bVar});
        }

        public j.a b(Context context, H1.f fVar) {
            return H1.j.b(context, null, fVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f29597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final H1.f f29598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f29599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f29600d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f29601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f29602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f29603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f29604h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f29605i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f29606j;

        b(Context context, H1.f fVar, a aVar) {
            K1.f.h(context, "Context cannot be null");
            K1.f.h(fVar, "FontRequest cannot be null");
            this.f29597a = context.getApplicationContext();
            this.f29598b = fVar;
            this.f29599c = aVar;
        }

        private void b() {
            synchronized (this.f29600d) {
                try {
                    this.f29604h = null;
                    ContentObserver contentObserver = this.f29605i;
                    if (contentObserver != null) {
                        this.f29599c.c(this.f29597a, contentObserver);
                        this.f29605i = null;
                    }
                    Handler handler = this.f29601e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f29606j);
                    }
                    this.f29601e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f29603g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f29602f = null;
                    this.f29603g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private j.b e() {
            try {
                j.a aVarB = this.f29599c.b(this.f29597a, this.f29598b);
                if (aVarB.e() == 0) {
                    j.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            K1.f.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f29600d) {
                this.f29604h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f29600d) {
                try {
                    if (this.f29604h == null) {
                        return;
                    }
                    try {
                        j.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f29600d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            G1.n.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f29599c.a(this.f29597a, bVarE);
                            ByteBuffer byteBufferF = A.f(this.f29597a, null, bVarE.e());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            G1.n.b();
                            synchronized (this.f29600d) {
                                try {
                                    e.i iVar = this.f29604h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            G1.n.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f29600d) {
                            try {
                                e.i iVar2 = this.f29604h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f29600d) {
                try {
                    if (this.f29604h == null) {
                        return;
                    }
                    if (this.f29602f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f29603g = threadPoolExecutorB;
                        this.f29602f = threadPoolExecutorB;
                    }
                    this.f29602f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f29607a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f29600d) {
                this.f29602f = executor;
            }
        }
    }

    public j(Context context, H1.f fVar) {
        super(new b(context, fVar, f29596k));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
