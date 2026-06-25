.class public LE3/h3$e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/h3$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LE3/U6;

.field private b:Lq2/P$b;

.field private c:LP9/u;

.field private d:LP9/u;

.field private e:Landroid/os/Bundle;

.field private f:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(LE3/h3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p1, LE3/h3$e;->j:Lq2/P$b;

    .line 5
    .line 6
    iput-object p1, p0, LE3/h3$e$a;->b:Lq2/P$b;

    .line 7
    .line 8
    sget-object p1, LE3/h3$e;->h:LE3/U6;

    .line 9
    .line 10
    iput-object p1, p0, LE3/h3$e$a;->a:LE3/U6;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LE3/h3$e;
    .locals 9

    .line 1
    new-instance v0, LE3/h3$e;

    .line 2
    .line 3
    iget-object v2, p0, LE3/h3$e$a;->a:LE3/U6;

    .line 4
    .line 5
    iget-object v3, p0, LE3/h3$e$a;->b:Lq2/P$b;

    .line 6
    .line 7
    iget-object v4, p0, LE3/h3$e$a;->c:LP9/u;

    .line 8
    .line 9
    iget-object v5, p0, LE3/h3$e$a;->d:LP9/u;

    .line 10
    .line 11
    iget-object v6, p0, LE3/h3$e$a;->e:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v7, p0, LE3/h3$e$a;->f:Landroid/app/PendingIntent;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct/range {v0 .. v8}, LE3/h3$e;-><init>(ZLE3/U6;Lq2/P$b;LP9/u;LP9/u;Landroid/os/Bundle;Landroid/app/PendingIntent;LE3/h3$a;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public b(Lq2/P$b;)LE3/h3$e$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lq2/P$b;

    .line 6
    .line 7
    iput-object p1, p0, LE3/h3$e$a;->b:Lq2/P$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public c(LE3/U6;)LE3/h3$e$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE3/U6;

    .line 6
    .line 7
    iput-object p1, p0, LE3/h3$e$a;->a:LE3/U6;

    .line 8
    .line 9
    return-object p0
.end method

.method public d(Ljava/util/List;)LE3/h3$e$a;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, LE3/h3$e$a;->c:LP9/u;

    .line 10
    .line 11
    return-object p0
.end method

.method public e(Ljava/util/List;)LE3/h3$e$a;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, LE3/h3$e$a;->d:LP9/u;

    .line 10
    .line 11
    return-object p0
.end method
