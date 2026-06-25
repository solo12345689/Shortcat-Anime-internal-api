.class LF3/g$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:LF3/q$b;

.field public final e:Landroid/os/Bundle;

.field public final f:LF3/g$o;

.field public final g:Ljava/util/HashMap;

.field final synthetic h:LF3/g;


# direct methods
.method constructor <init>(LF3/g;Ljava/lang/String;IILandroid/os/Bundle;LF3/g$o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$f;->h:LF3/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LF3/g$f;->g:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p2, p0, LF3/g$f;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput p3, p0, LF3/g$f;->b:I

    .line 16
    .line 17
    iput p4, p0, LF3/g$f;->c:I

    .line 18
    .line 19
    new-instance p1, LF3/q$b;

    .line 20
    .line 21
    invoke-direct {p1, p2, p3, p4}, LF3/q$b;-><init>(Ljava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LF3/g$f;->d:LF3/q$b;

    .line 25
    .line 26
    iput-object p5, p0, LF3/g$f;->e:Landroid/os/Bundle;

    .line 27
    .line 28
    iput-object p6, p0, LF3/g$f;->f:LF3/g$o;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$f;->h:LF3/g;

    .line 2
    .line 3
    iget-object v0, v0, LF3/g;->g:LF3/g$q;

    .line 4
    .line 5
    new-instance v1, LF3/g$f$a;

    .line 6
    .line 7
    invoke-direct {v1, p0}, LF3/g$f$a;-><init>(LF3/g$f;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
