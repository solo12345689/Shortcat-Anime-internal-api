.class public final LEe/C;
.super LEe/E;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOe/v;


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/util/Collection;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-string v0, "reflectType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LEe/E;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LEe/C;->b:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LEe/C;->c:Ljava/util/Collection;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LEe/C;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic Q()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    invoke-virtual {p0}, LEe/C;->R()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected R()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LEe/C;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAnnotations()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LEe/C;->c:Ljava/util/Collection;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lve/l;
    .locals 2

    .line 1
    invoke-virtual {p0}, LEe/C;->R()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {p0}, LEe/C;->R()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lgf/e;->b(Ljava/lang/String;)Lgf/e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lgf/e;->m()Lve/l;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
