.class abstract LE3/h3$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/h3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lq2/P;

.field c:Ljava/lang/String;

.field d:LE3/h3$d;

.field e:Landroid/app/PendingIntent;

.field f:Landroid/os/Bundle;

.field g:Landroid/os/Bundle;

.field h:Lt2/h;

.field i:Z

.field j:LP9/u;

.field k:LP9/u;

.field l:LP9/u;

.field m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq2/P;LE3/h3$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/Context;

    .line 9
    .line 10
    iput-object p1, p0, LE3/h3$c;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lq2/P;

    .line 17
    .line 18
    iput-object p1, p0, LE3/h3$c;->b:Lq2/P;

    .line 19
    .line 20
    invoke-interface {p2}, Lq2/P;->g()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Lt2/a;->a(Z)V

    .line 25
    .line 26
    .line 27
    const-string p1, ""

    .line 28
    .line 29
    iput-object p1, p0, LE3/h3$c;->c:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p3, p0, LE3/h3$c;->d:LE3/h3$d;

    .line 32
    .line 33
    new-instance p1, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LE3/h3$c;->f:Landroid/os/Bundle;

    .line 39
    .line 40
    new-instance p1, Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LE3/h3$c;->g:Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LE3/h3$c;->j:LP9/u;

    .line 52
    .line 53
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, LE3/h3$c;->k:LP9/u;

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    iput-boolean p1, p0, LE3/h3$c;->i:Z

    .line 61
    .line 62
    iput-boolean p1, p0, LE3/h3$c;->m:Z

    .line 63
    .line 64
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, LE3/h3$c;->l:LP9/u;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method a(LE3/h3$d;)LE3/h3$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE3/h3$d;

    .line 6
    .line 7
    iput-object p1, p0, LE3/h3$c;->d:LE3/h3$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public b(Ljava/util/List;)LE3/h3$c;
    .locals 0

    .line 1
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LE3/h3$c;->j:LP9/u;

    .line 6
    .line 7
    return-object p0
.end method

.method public c(Ljava/lang/String;)LE3/h3$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, LE3/h3$c;->c:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method
