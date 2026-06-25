.class public final LF3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/e$f;,
        LF3/e$b;,
        LF3/e$c;,
        LF3/e$e;,
        LF3/e$d;,
        LF3/e$i;,
        LF3/e$a;,
        LF3/e$g;,
        LF3/e$h;
    }
.end annotation


# static fields
.field static final b:Z


# instance fields
.field private final a:LF3/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "MediaBrowserCompat"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, LF3/e;->b:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;LF3/e$b;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, LF3/e$f;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3, p4}, LF3/e$f;-><init>(Landroid/content/Context;Landroid/content/ComponentName;LF3/e$b;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LF3/e;->a:LF3/e$c;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, LF3/e$e;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2, p3, p4}, LF3/e$e;-><init>(Landroid/content/Context;Landroid/content/ComponentName;LF3/e$b;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LF3/e;->a:LF3/e$c;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    const-string v0, "MediaBrowserCompat"

    .line 2
    .line 3
    const-string v1, "Connecting to a MediaBrowserService."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LF3/e;->a:LF3/e$c;

    .line 9
    .line 10
    invoke-interface {v0}, LF3/e$c;->S()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e;->a:LF3/e$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/e$c;->disconnect()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()LF3/n$j;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/e;->a:LF3/e$c;

    .line 2
    .line 3
    invoke-interface {v0}, LF3/e$c;->d()LF3/n$j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
