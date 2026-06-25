.class final LM2/O$a;
.super LP2/C;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Lq2/a0;


# direct methods
.method public constructor <init>(LP2/A;Lq2/a0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP2/C;-><init>(LP2/A;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LM2/O$a;->b:Lq2/a0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(I)Lq2/x;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/O$a;->b:Lq2/a0;

    .line 2
    .line 3
    invoke-virtual {p0}, LP2/C;->t()LP2/A;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1, p1}, LP2/E;->f(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, Lq2/a0;->c(I)Lq2/x;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public e(Lq2/x;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, LP2/C;->t()LP2/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LM2/O$a;->b:Lq2/a0;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lq2/a0;->d(Lq2/x;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-interface {v0, p1}, LP2/E;->l(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, LP2/C;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, LM2/O$a;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    check-cast p1, LM2/O$a;

    .line 13
    .line 14
    iget-object v0, p0, LM2/O$a;->b:Lq2/a0;

    .line 15
    .line 16
    iget-object p1, p1, LM2/O$a;->b:Lq2/a0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lq2/a0;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, LP2/C;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, LM2/O$a;->b:Lq2/a0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lq2/a0;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    return v0
.end method

.method public m()Lq2/a0;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/O$a;->b:Lq2/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()Lq2/x;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/O$a;->b:Lq2/a0;

    .line 2
    .line 3
    invoke-virtual {p0}, LP2/C;->t()LP2/A;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LP2/A;->p()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lq2/a0;->c(I)Lq2/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
