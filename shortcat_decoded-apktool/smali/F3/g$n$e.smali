.class LF3/g$n$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g$n;->g(LF3/g$o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LF3/g$o;

.field final synthetic b:LF3/g$n;


# direct methods
.method constructor <init>(LF3/g$n;LF3/g$o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$n$e;->b:LF3/g$n;

    .line 2
    .line 3
    iput-object p2, p0, LF3/g$n$e;->a:LF3/g$o;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, LF3/g$n$e;->a:LF3/g$o;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/g$o;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LF3/g$n$e;->b:LF3/g$n;

    .line 8
    .line 9
    iget-object v1, v1, LF3/g$n;->a:LF3/g;

    .line 10
    .line 11
    iget-object v1, v1, LF3/g;->e:Lt/a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lt/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LF3/g$f;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
