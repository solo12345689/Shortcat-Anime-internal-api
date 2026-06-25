.class Lr/l$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/l;->N()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/l;


# direct methods
.method constructor <init>(Lr/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/l$d;->a:Lr/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr/l$d;->b(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/l$d;->a:Lr/l;

    .line 2
    .line 3
    iget-object v1, v0, Lr/l;->q:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object v0, v0, Lr/l;->r:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lr/l$d;->a:Lr/l;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lr/l;->V(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lr/l$d;->a:Lr/l;

    .line 16
    .line 17
    iget-object v0, p1, Lr/l;->q:Landroid/os/Handler;

    .line 18
    .line 19
    iget-object p1, p1, Lr/l;->r:Ljava/lang/Runnable;

    .line 20
    .line 21
    const-wide/16 v1, 0x7d0

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method
