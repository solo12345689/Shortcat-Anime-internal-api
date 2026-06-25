.class final Lcom/facebook/react/views/scroll/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Lcom/facebook/react/views/scroll/b;

.field private b:Lcom/facebook/react/views/scroll/r;

.field private c:I

.field private d:I

.field private e:Lcom/facebook/react/views/scroll/c;

.field private f:Lcom/facebook/react/views/scroll/c;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/r;IILcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)V
    .locals 1

    const-string v0, "interval"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "virtualView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->a:Lcom/facebook/react/views/scroll/b;

    .line 3
    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->b:Lcom/facebook/react/views/scroll/r;

    .line 4
    iput p3, p0, Lcom/facebook/react/views/scroll/c;->c:I

    .line 5
    iput p4, p0, Lcom/facebook/react/views/scroll/c;->d:I

    .line 6
    iput-object p5, p0, Lcom/facebook/react/views/scroll/c;->e:Lcom/facebook/react/views/scroll/c;

    .line 7
    iput-object p6, p0, Lcom/facebook/react/views/scroll/c;->f:Lcom/facebook/react/views/scroll/c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/r;IILcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/b;->a()I

    move-result p3

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x10

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move-object v5, p4

    goto :goto_0

    :cond_2
    move-object v5, p5

    :goto_0
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    move-object v6, p4

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    goto :goto_2

    :cond_3
    move-object v6, p6

    goto :goto_1

    .line 9
    :goto_2
    invoke-direct/range {v0 .. v6}, Lcom/facebook/react/views/scroll/c;-><init>(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/views/scroll/r;IILcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/c;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/c;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Lcom/facebook/react/views/scroll/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->a:Lcom/facebook/react/views/scroll/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lcom/facebook/react/views/scroll/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->e:Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/c;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lcom/facebook/react/views/scroll/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->f:Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lcom/facebook/react/views/scroll/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->b:Lcom/facebook/react/views/scroll/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public final h(Lcom/facebook/react/views/scroll/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->a:Lcom/facebook/react/views/scroll/b;

    .line 7
    .line 8
    return-void
.end method

.method public final i(Lcom/facebook/react/views/scroll/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->e:Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    return-void
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lcom/facebook/react/views/scroll/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->f:Lcom/facebook/react/views/scroll/c;

    .line 2
    .line 3
    return-void
.end method

.method public final l(Lcom/facebook/react/views/scroll/r;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->b:Lcom/facebook/react/views/scroll/r;

    .line 7
    .line 8
    return-void
.end method
