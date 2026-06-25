.class public final LE3/U6$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/U6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LE3/U6$b;->a:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(LE3/U6;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE3/U6;

    iget-object p1, p1, LE3/U6;->a:LP9/w;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LE3/U6$b;->a:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(LE3/U6;LE3/U6$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/U6$b;-><init>(LE3/U6;)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LE3/T6;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, LE3/T6;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, LE3/U6$b;->a(LE3/T6;)LE3/U6$b;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method


# virtual methods
.method public a(LE3/T6;)LE3/U6$b;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/U6$b;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE3/T6;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method b()LE3/U6$b;
    .locals 1

    .line 1
    sget-object v0, LE3/T6;->e:LP9/u;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/U6$b;->d(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method c()LE3/U6$b;
    .locals 1

    .line 1
    sget-object v0, LE3/T6;->d:LP9/u;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LE3/U6$b;->d(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public e()LE3/U6;
    .locals 3

    .line 1
    new-instance v0, LE3/U6;

    .line 2
    .line 3
    iget-object v1, p0, LE3/U6$b;->a:Ljava/util/Set;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LE3/U6;-><init>(Ljava/util/Collection;LE3/U6$a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public f(I)LE3/U6$b;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LE3/U6$b;->a:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LE3/T6;

    .line 26
    .line 27
    iget v2, v1, LE3/T6;->a:I

    .line 28
    .line 29
    if-ne v2, p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, LE3/U6$b;->a:Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    return-object p0
.end method
