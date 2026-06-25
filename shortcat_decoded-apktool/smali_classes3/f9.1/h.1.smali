.class final Lf9/h;
.super Lf9/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final transient d:I

.field final transient e:I

.field final synthetic f:Lf9/i;


# direct methods
.method constructor <init>(Lf9/i;II)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf9/h;->f:Lf9/i;

    .line 5
    .line 6
    invoke-direct {p0}, Lf9/i;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lf9/h;->d:I

    .line 10
    .line 11
    iput p3, p0, Lf9/h;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method final b()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/h;->f:Lf9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/d;->b()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method final c()I
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/h;->f:Lf9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/d;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lf9/h;->d:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method final d()I
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/h;->f:Lf9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/d;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lf9/h;->d:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget v1, p0, Lf9/h;->e:I

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lf9/h;->e:I

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lf9/z;->b(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lf9/h;->f:Lf9/i;

    .line 9
    .line 10
    iget v1, p0, Lf9/h;->d:I

    .line 11
    .line 12
    add-int/2addr p1, v1

    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final i(II)Lf9/i;
    .locals 2

    .line 1
    iget v0, p0, Lf9/h;->e:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lf9/z;->d(III)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lf9/h;->d:I

    .line 7
    .line 8
    iget-object v1, p0, Lf9/h;->f:Lf9/i;

    .line 9
    .line 10
    add-int/2addr p1, v0

    .line 11
    add-int/2addr p2, v0

    .line 12
    invoke-virtual {v1, p1, p2}, Lf9/i;->i(II)Lf9/i;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lf9/h;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lf9/i;->i(II)Lf9/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
