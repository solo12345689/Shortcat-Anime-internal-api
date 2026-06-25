.class public final Ll1/l;
.super Ll1/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/l$a;,
        Ll1/l$b;
    }
.end annotation


# instance fields
.field private f:Z

.field private g:Ll1/l$b;

.field private final h:I

.field private i:I

.field private final j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ll1/i;-><init>(Lp1/f;)V

    .line 3
    .line 4
    .line 5
    iget v0, p0, Ll1/l;->h:I

    .line 6
    .line 7
    iput v0, p0, Ll1/l;->i:I

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ll1/l;->j:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public i()V
    .locals 1

    .line 1
    invoke-super {p0}, Ll1/i;->i()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ll1/l;->h:I

    .line 5
    .line 6
    iput v0, p0, Ll1/l;->i:I

    .line 7
    .line 8
    return-void
.end method

.method public final k(Landroidx/compose/ui/e;Ll1/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    iget-boolean v0, p0, Ll1/l;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ll1/i;->b(Ll1/x;)Lp1/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ll1/e;

    .line 10
    .line 11
    invoke-virtual {p2}, Ll1/f;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2, v0}, Ll1/e;-><init>(Ljava/lang/Object;Lp1/f;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance v0, Ll1/l$a;

    .line 22
    .line 23
    invoke-direct {v0, p2, p3}, Ll1/l$a;-><init>(Ll1/f;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public final l()Ll1/f;
    .locals 3

    .line 1
    iget-object v0, p0, Ll1/l;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Ll1/l;->i:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Ll1/l;->i:I

    .line 8
    .line 9
    invoke-static {v0, v1}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ll1/f;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ll1/f;

    .line 18
    .line 19
    iget v1, p0, Ll1/l;->i:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Ll1/f;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ll1/l;->j:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-object v0
.end method

.method public final m()Ll1/l$b;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/l;->g:Ll1/l$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ll1/l$b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ll1/l$b;-><init>(Ll1/l;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll1/l;->g:Ll1/l$b;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method
