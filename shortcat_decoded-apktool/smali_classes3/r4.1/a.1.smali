.class public final synthetic Lr4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcg/q$a;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/a;->a:Landroidx/concurrent/futures/c$a;

    .line 5
    .line 6
    iput p2, p0, Lr4/a;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lr4/a;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/a;->a:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    iget v1, p0, Lr4/a;->b:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lr4/a;->c:Z

    .line 6
    .line 7
    check-cast p1, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lapp/notifee/core/BlockStateBroadcastReceiver;->a(Landroidx/concurrent/futures/c$a;IZLandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
