package androidx.compose.ui.draganddrop;

import K0.Y;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5096o;
import java.util.Iterator;
import o0.b;
import o0.c;
import o0.d;
import o0.f;
import t.C6552b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5096o f26578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f26579b = new d(null, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6552b f26580c = new C6552b(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f26581d = new Y() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // K0.Y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d create() {
            return this.f26582b.f26579b;
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f26582b.f26579b.hashCode();
        }

        @Override // K0.Y
        public void inspectableProperties(V0 v02) {
            v02.d("RootDragAndDropNode");
        }

        @Override // K0.Y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void update(d node) {
        }
    };

    public AndroidDragAndDropManager(InterfaceC5096o interfaceC5096o) {
        this.f26578a = interfaceC5096o;
    }

    @Override // o0.c
    public boolean a(f fVar) {
        return this.f26580c.contains(fVar);
    }

    @Override // o0.c
    public void b(f fVar) {
        this.f26580c.add(fVar);
    }

    public e d() {
        return this.f26581d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        b bVar = new b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zE1 = this.f26579b.E1(bVar);
                Iterator<E> it = this.f26580c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).U(bVar);
                }
                break;
            case 2:
                this.f26579b.v0(bVar);
                break;
            case 4:
                this.f26579b.w0(bVar);
                this.f26580c.clear();
                break;
            case 5:
                this.f26579b.X0(bVar);
                break;
            case 6:
                this.f26579b.c0(bVar);
                break;
        }
        return false;
    }
}
