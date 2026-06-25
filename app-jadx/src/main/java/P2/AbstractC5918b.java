package p2;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: p2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5918b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f55712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f55713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f55714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55715d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55716e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55717f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f55718g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55719h = false;

    /* JADX INFO: renamed from: p2.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(AbstractC5918b abstractC5918b, Object obj);
    }

    public AbstractC5918b(Context context) {
        this.f55714c = context.getApplicationContext();
    }

    public void a() {
        this.f55716e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f55719h = false;
    }

    public String d(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        if (obj == null) {
            sb2.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void f(Object obj) {
        a aVar = this.f55713b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f55712a);
        printWriter.print(" mListener=");
        printWriter.println(this.f55713b);
        if (this.f55715d || this.f55718g || this.f55719h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f55715d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f55718g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f55719h);
        }
        if (this.f55716e || this.f55717f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f55716e);
            printWriter.print(" mReset=");
            printWriter.println(this.f55717f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f55716e;
    }

    public boolean j() {
        return this.f55715d;
    }

    protected abstract boolean l();

    public void m() {
        if (this.f55715d) {
            h();
        } else {
            this.f55718g = true;
        }
    }

    protected abstract void p();

    public void r(int i10, a aVar) {
        if (this.f55713b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f55713b = aVar;
        this.f55712a = i10;
    }

    public void s() {
        o();
        this.f55717f = true;
        this.f55715d = false;
        this.f55716e = false;
        this.f55718g = false;
        this.f55719h = false;
    }

    public void t() {
        if (this.f55719h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f55712a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f55715d = true;
        this.f55717f = false;
        this.f55716e = false;
        p();
    }

    public void v() {
        this.f55715d = false;
        q();
    }

    public void w(a aVar) {
        a aVar2 = this.f55713b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f55713b = null;
    }

    public void e() {
    }

    protected void k() {
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void q() {
    }
}
