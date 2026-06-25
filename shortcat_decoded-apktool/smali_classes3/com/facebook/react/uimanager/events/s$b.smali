.class public final Lcom/facebook/react/uimanager/events/s$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/Map;

.field private final g:Ljava/util/Map;

.field private final h:Ljava/util/Map;

.field private final i:Ljava/util/Set;


# direct methods
.method public constructor <init>(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V
    .locals 1

    .line 1
    const-string v0, "offsetByPointerId"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "hitPathByPointerId"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "eventCoordinatesByPointerId"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "screenCoordinatesByPointerId"

    .line 17
    .line 18
    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "hoveringPointerIds"

    .line 22
    .line 23
    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput p1, p0, Lcom/facebook/react/uimanager/events/s$b;->a:I

    .line 30
    .line 31
    iput p2, p0, Lcom/facebook/react/uimanager/events/s$b;->b:I

    .line 32
    .line 33
    iput p3, p0, Lcom/facebook/react/uimanager/events/s$b;->c:I

    .line 34
    .line 35
    iput p4, p0, Lcom/facebook/react/uimanager/events/s$b;->d:I

    .line 36
    .line 37
    iput-object p5, p0, Lcom/facebook/react/uimanager/events/s$b;->e:Ljava/util/Map;

    .line 38
    .line 39
    iput-object p6, p0, Lcom/facebook/react/uimanager/events/s$b;->f:Ljava/util/Map;

    .line 40
    .line 41
    iput-object p7, p0, Lcom/facebook/react/uimanager/events/s$b;->g:Ljava/util/Map;

    .line 42
    .line 43
    iput-object p8, p0, Lcom/facebook/react/uimanager/events/s$b;->h:Ljava/util/Map;

    .line 44
    .line 45
    new-instance p1, Ljava/util/HashSet;

    .line 46
    .line 47
    check-cast p9, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-direct {p1, p9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/s$b;->i:Ljava/util/Set;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/s$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->g:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->f:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->f:Ljava/util/Map;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/events/s$b;->b:I

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "Required value was null."

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->i:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/s$b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/s$b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->h:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/s$b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final k(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/s$b;->i:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
