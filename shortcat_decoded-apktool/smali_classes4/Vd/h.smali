.class public final LVd/h;
.super LUd/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Lje/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVd/h$a;
    }
.end annotation


# static fields
.field private static final b:LVd/h$a;

.field private static final c:LVd/h;


# instance fields
.field private final a:LVd/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LVd/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVd/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LVd/h;->b:LVd/h$a;

    .line 8
    .line 9
    new-instance v0, LVd/h;

    .line 10
    .line 11
    sget-object v1, LVd/d;->n:LVd/d$a;

    .line 12
    .line 13
    invoke-virtual {v1}, LVd/d$a;->e()LVd/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, LVd/h;-><init>(LVd/d;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LVd/h;->c:LVd/h;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, LVd/d;

    invoke-direct {v0}, LVd/d;-><init>()V

    invoke-direct {p0, v0}, LVd/h;-><init>(LVd/d;)V

    return-void
.end method

.method public constructor <init>(LVd/d;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, LUd/j;-><init>()V

    .line 2
    iput-object p1, p0, LVd/h;->a:LVd/d;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVd/d;->k(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LVd/d;->o()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LVd/d;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LVd/d;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVd/d;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LVd/d;->m()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LUd/j;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, LVd/h;->c:LVd/h;

    .line 14
    .line 15
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LVd/d;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LVd/d;->J()LVd/d$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVd/d;->S(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LVd/d;->o()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVd/h;->a:LVd/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LVd/d;->o()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method
