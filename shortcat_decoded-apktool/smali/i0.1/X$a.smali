.class public final Li0/X$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/X;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:Li0/X;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;Li0/X;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iput-object p2, p0, Li0/X$a;->b:Li0/X;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li0/X$a;->b(Ljava/lang/Object;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-static {}, Li0/F;->d()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, LTd/k;

    .line 5
    .line 6
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public d()Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-static {}, Li0/F;->d()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-static {}, Li0/F;->d()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, LTd/k;

    .line 5
    .line 6
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public hasNext()Z
    .locals 3

    .line 1
    iget-object v0, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    .line 5
    iget-object v1, p0, Li0/X$a;->b:Li0/X;

    .line 6
    .line 7
    invoke-virtual {v1}, Li0/X;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    sub-int/2addr v1, v2

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iget-object v1, p0, Li0/X$a;->b:Li0/X;

    .line 8
    .line 9
    invoke-virtual {v1}, Li0/X;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Li0/F;->e(II)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 17
    .line 18
    iput v0, v1, Lkotlin/jvm/internal/L;->a:I

    .line 19
    .line 20
    iget-object v1, p0, Li0/X$a;->b:Li0/X;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Li0/X;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    .line 5
    iget-object v1, p0, Li0/X$a;->b:Li0/X;

    .line 6
    .line 7
    invoke-virtual {v1}, Li0/X;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Li0/F;->e(II)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 15
    .line 16
    add-int/lit8 v2, v0, -0x1

    .line 17
    .line 18
    iput v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 19
    .line 20
    iget-object v1, p0, Li0/X$a;->b:Li0/X;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Li0/X;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Li0/X$a;->a:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    .line 4
    .line 5
    return v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li0/X$a;->d()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li0/X$a;->e(Ljava/lang/Object;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method
