.class public final Lr3/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/r;


# instance fields
.field private final a:LU2/r;

.field private final b:Lr3/r$a;

.field private final c:Landroid/util/SparseArray;

.field private d:Z


# direct methods
.method public constructor <init>(LU2/r;Lr3/r$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr3/s;->a:LU2/r;

    .line 5
    .line 6
    iput-object p2, p0, Lr3/s;->b:Lr3/r$a;

    .line 7
    .line 8
    new-instance p1, Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lr3/s;->c:Landroid/util/SparseArray;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public e(II)LU2/O;
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p2, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lr3/s;->d:Z

    .line 6
    .line 7
    iget-object v0, p0, Lr3/s;->a:LU2/r;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, LU2/r;->e(II)LU2/O;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Lr3/s;->c:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lr3/u;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Lr3/u;

    .line 26
    .line 27
    iget-object v1, p0, Lr3/s;->a:LU2/r;

    .line 28
    .line 29
    invoke-interface {v1, p1, p2}, LU2/r;->e(II)LU2/O;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object v1, p0, Lr3/s;->b:Lr3/r$a;

    .line 34
    .line 35
    invoke-direct {v0, p2, v1}, Lr3/u;-><init>(LU2/O;Lr3/r$a;)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p0, Lr3/s;->c:Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/s;->a:LU2/r;

    .line 2
    .line 3
    invoke-interface {v0}, LU2/r;->p()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lr3/s;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lr3/s;->c:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge v0, v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lr3/s;->c:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lr3/u;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {v1, v2}, Lr3/u;->k(Z)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public t(LU2/J;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr3/s;->a:LU2/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LU2/r;->t(LU2/J;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
