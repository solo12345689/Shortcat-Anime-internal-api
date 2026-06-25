.class public abstract LF3/j$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/j$a$b;,
        LF3/j$a$a;,
        LF3/j$a$c;
    }
.end annotation


# instance fields
.field final a:Landroid/media/session/MediaController$Callback;

.field b:LF3/j$a$b;

.field c:LF3/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF3/j$a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LF3/j$a$a;-><init>(LF3/j$a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LF3/j$a;->a:Landroid/media/session/MediaController$Callback;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract a(LF3/j$e;)V
.end method

.method public abstract b(Z)V
.end method

.method public binderDied()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v1}, LF3/j$a;->m(ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public abstract c(Landroid/os/Bundle;)V
.end method

.method public abstract d(LF3/m;)V
.end method

.method public abstract e(LF3/v;)V
.end method

.method public abstract f(Ljava/util/List;)V
.end method

.method public abstract g(Ljava/lang/CharSequence;)V
.end method

.method public abstract h(I)V
.end method

.method public abstract i()V
.end method

.method public abstract j(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract k()V
.end method

.method public abstract l(I)V
.end method

.method m(ILjava/lang/Object;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$a;->b:LF3/j$a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method n(Landroid/os/Handler;)V
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, LF3/j$a;->b:LF3/j$a$b;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p1, LF3/j$a$b;->a:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LF3/j$a;->b:LF3/j$a$b;

    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    new-instance v0, LF3/j$a$b;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p0, p1}, LF3/j$a$b;-><init>(LF3/j$a;Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LF3/j$a;->b:LF3/j$a$b;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, v0, LF3/j$a$b;->a:Z

    .line 30
    .line 31
    return-void
.end method
