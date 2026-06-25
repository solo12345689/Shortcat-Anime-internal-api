.class LP9/u$c;
.super LP9/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:LP9/u;


# direct methods
.method constructor <init>(LP9/u;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LP9/u$c;->e:LP9/u;

    .line 2
    .line 3
    invoke-direct {p0}, LP9/u;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, LP9/u$c;->c:I

    .line 7
    .line 8
    iput p3, p0, LP9/u$c;->d:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public M(II)LP9/u;
    .locals 2

    .line 1
    iget v0, p0, LP9/u$c;->d:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, LO9/n;->o(III)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP9/u$c;->e:LP9/u;

    .line 7
    .line 8
    iget v1, p0, LP9/u$c;->c:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    add-int/2addr p2, v1

    .line 12
    invoke-virtual {v0, p1, p2}, LP9/u;->M(II)LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method d()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/u$c;->e:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/s;->d()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method e()I
    .locals 2

    .line 1
    iget-object v0, p0, LP9/u$c;->e:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/s;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LP9/u$c;->c:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget v1, p0, LP9/u$c;->d:I

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method

.method f()I
    .locals 2

    .line 1
    iget-object v0, p0, LP9/u$c;->e:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/s;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LP9/u$c;->c:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LP9/u$c;->d:I

    .line 2
    .line 3
    invoke-static {p1, v0}, LO9/n;->h(II)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP9/u$c;->e:LP9/u;

    .line 7
    .line 8
    iget v1, p0, LP9/u$c;->c:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-super {p0}, LP9/u;->l()LP9/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, LP9/u;->y()LP9/Y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, LP9/u;->z(I)LP9/Y;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, LP9/u$c;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP9/u$c;->M(II)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
