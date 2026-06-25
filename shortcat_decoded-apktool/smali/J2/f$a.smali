.class LJ2/f$a;
.super Landroid/os/Handler;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ2/f;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ2/f;


# direct methods
.method constructor <init>(LJ2/f;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ2/f$a;->a:LJ2/f;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/f$a;->a:LJ2/f;

    .line 2
    .line 3
    invoke-static {v0, p1}, LJ2/f;->e(LJ2/f;Landroid/os/Message;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
