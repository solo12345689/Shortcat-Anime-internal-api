.class public final Ls2/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final c:LP9/K;

.field public static final d:Ls2/e;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;


# instance fields
.field public final a:LP9/u;

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, LP9/K;->c()LP9/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ls2/b;

    .line 6
    .line 7
    invoke-direct {v1}, Ls2/b;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LP9/K;->d(LO9/f;)LP9/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ls2/e;->c:LP9/K;

    .line 15
    .line 16
    new-instance v0, Ls2/e;

    .line 17
    .line 18
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3}, Ls2/e;-><init>(Ljava/util/List;J)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ls2/e;->d:Ls2/e;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Ls2/e;->e:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Ls2/e;->f:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/util/List;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ls2/e;->c:LP9/K;

    .line 5
    .line 6
    invoke-static {v0, p1}, LP9/u;->L(Ljava/util/Comparator;Ljava/lang/Iterable;)LP9/u;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ls2/e;->a:LP9/u;

    .line 11
    .line 12
    iput-wide p2, p0, Ls2/e;->b:J

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Ls2/a;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget p0, p0, Ls2/a;->r:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static b(Ljava/util/List;)LP9/u;
    .locals 3

    .line 1
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ls2/a;

    .line 17
    .line 18
    iget-object v2, v2, Ls2/a;->d:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ls2/a;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 30
    .line 31
    .line 32
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static c(Landroid/os/Bundle;)Ls2/e;
    .locals 3

    .line 1
    sget-object v0, Ls2/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ls2/d;

    .line 15
    .line 16
    invoke-direct {v1}, Ls2/d;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    sget-object v1, Ls2/e;->f:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    new-instance p0, Ls2/e;

    .line 30
    .line 31
    invoke-direct {p0, v0, v1, v2}, Ls2/e;-><init>(Ljava/util/List;J)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method


# virtual methods
.method public d()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ls2/e;->e:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Ls2/e;->a:LP9/u;

    .line 9
    .line 10
    invoke-static {v2}, Ls2/e;->b(Ljava/util/List;)LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Ls2/c;

    .line 15
    .line 16
    invoke-direct {v3}, Ls2/c;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Lt2/i;->h(Ljava/util/Collection;LO9/f;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Ls2/e;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-wide v2, p0, Ls2/e;->b:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
