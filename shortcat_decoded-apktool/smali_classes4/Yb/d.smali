.class public final LYb/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ldc/r;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Lhc/h;

.field private final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldc/r;Ljava/util/Map;Ljava/util/Map;Lhc/h;Z)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "staticSyncFunctions"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "staticAsyncFunctions"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "objectDefinition"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LYb/d;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, p0, LYb/d;->b:Ldc/r;

    .line 32
    .line 33
    iput-object p3, p0, LYb/d;->c:Ljava/util/Map;

    .line 34
    .line 35
    iput-object p4, p0, LYb/d;->d:Ljava/util/Map;

    .line 36
    .line 37
    iput-object p5, p0, LYb/d;->e:Lhc/h;

    .line 38
    .line 39
    iput-boolean p6, p0, LYb/d;->f:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a()Ldc/r;
    .locals 1

    .line 1
    iget-object v0, p0, LYb/d;->b:Ldc/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LYb/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lhc/h;
    .locals 1

    .line 1
    iget-object v0, p0, LYb/d;->e:Lhc/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LUb/e;
    .locals 3

    .line 1
    new-instance v0, LUb/e;

    .line 2
    .line 3
    iget-object v1, p0, LYb/d;->c:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LYb/d;->d:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v0, v1, v2}, LUb/e;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LYb/d;->f:Z

    .line 2
    .line 3
    return v0
.end method
