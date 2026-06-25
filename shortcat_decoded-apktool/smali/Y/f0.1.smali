.class final LY/f0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Iterator;
.implements Lje/a;


# instance fields
.field private final a:LY/E1;

.field private final b:I

.field private c:I

.field private final d:I


# direct methods
.method public constructor <init>(LY/E1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/f0;->a:LY/E1;

    .line 5
    .line 6
    iput p3, p0, LY/f0;->b:I

    .line 7
    .line 8
    iput p2, p0, LY/f0;->c:I

    .line 9
    .line 10
    invoke-virtual {p1}, LY/E1;->z()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, LY/f0;->d:I

    .line 15
    .line 16
    invoke-virtual {p1}, LY/E1;->A()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, LY/G1;->u()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private final d()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/f0;->a:LY/E1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/E1;->z()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LY/f0;->d:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, LY/G1;->u()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public b()Lk0/k;
    .locals 4

    .line 1
    invoke-direct {p0}, LY/f0;->d()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LY/f0;->c:I

    .line 5
    .line 6
    iget-object v1, p0, LY/f0;->a:LY/E1;

    .line 7
    .line 8
    invoke-virtual {v1}, LY/E1;->t()[I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, v0}, LY/G1;->c([II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    iput v1, p0, LY/f0;->c:I

    .line 18
    .line 19
    new-instance v1, LY/F1;

    .line 20
    .line 21
    iget-object v2, p0, LY/f0;->a:LY/E1;

    .line 22
    .line 23
    iget v3, p0, LY/f0;->d:I

    .line 24
    .line 25
    invoke-direct {v1, v2, v0, v3}, LY/F1;-><init>(LY/E1;II)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LY/f0;->c:I

    .line 2
    .line 3
    iget v1, p0, LY/f0;->b:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

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

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/f0;->b()Lk0/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
