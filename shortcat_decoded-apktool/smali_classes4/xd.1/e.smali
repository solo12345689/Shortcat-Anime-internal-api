.class public final Lxd/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/e$a;
    }
.end annotation


# static fields
.field public static final b:Lxd/e$a;


# instance fields
.field private final a:Lub/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxd/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxd/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxd/e;->b:Lxd/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 1
    const-string v0, "filesDirectory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lub/l;

    .line 10
    .line 11
    const-string v1, "dev.expo.updates"

    .line 12
    .line 13
    invoke-direct {v0, v1, p1}, Lub/l;-><init>(Ljava/lang/String;Ljava/io/File;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxd/e;->a:Lub/l;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lxd/e;JLjava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lxd/e;->g(Lxd/e;JLjava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final b(Ljava/util/Date;)J
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const v2, 0x15180

    .line 11
    .line 12
    .line 13
    int-to-long v2, v2

    .line 14
    sub-long/2addr v0, v2

    .line 15
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Long;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0
.end method

.method private final d(Ljava/lang/String;J)Z
    .locals 3

    .line 1
    sget-object v0, Lxd/c;->i:Lxd/c$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxd/c$a;->a(Ljava/lang/String;)Lxd/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lxd/c;->g()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    cmp-long p1, v1, p2

    .line 16
    .line 17
    if-ltz p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    return v0
.end method

.method public static synthetic f(Lxd/e;Ljava/util/Date;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 2

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/Date;

    .line 6
    .line 7
    new-instance p3, Ljava/util/Date;

    .line 8
    .line 9
    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p3

    .line 16
    const v0, 0x15180

    .line 17
    .line 18
    .line 19
    int-to-long v0, v0

    .line 20
    sub-long/2addr p3, v0

    .line 21
    invoke-direct {p1, p3, p4}, Ljava/util/Date;-><init>(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0, p1, p2}, Lxd/e;->e(Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final g(Lxd/e;JLjava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "entryString"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p3, p1, p2}, Lxd/e;->d(Ljava/lang/String;J)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method


# virtual methods
.method public final c(Ljava/util/Date;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "newerThan"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lxd/e;->b(Ljava/util/Date;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object p1, p0, Lxd/e;->a:Lub/l;

    .line 11
    .line 12
    invoke-virtual {p1}, Lub/l;->m()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v4, v3

    .line 36
    check-cast v4, Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {p0, v4, v0, v1}, Lxd/e;->d(Ljava/lang/String;J)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-object v2
.end method

.method public final e(Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    const-string v0, "olderThan"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "completionHandler"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lxd/e;->b(Ljava/util/Date;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p1, p0, Lxd/e;->a:Lub/l;

    .line 16
    .line 17
    new-instance v2, Lxd/d;

    .line 18
    .line 19
    invoke-direct {v2, p0, v0, v1}, Lxd/d;-><init>(Lxd/e;J)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v2, p2}, Lub/l;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
