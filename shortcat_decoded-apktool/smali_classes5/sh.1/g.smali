.class final Lsh/g;
.super Lsh/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/g$b;
    }
.end annotation


# instance fields
.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method private constructor <init>(Lsh/g$b;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lsh/o;-><init>(Lsh/o$a;)V

    const/4 v0, 0x0

    iput v0, p0, Lsh/g;->e:I

    invoke-static {p1}, Lsh/g$b;->i(Lsh/g$b;)I

    move-result v0

    iput v0, p0, Lsh/g;->f:I

    invoke-static {p1}, Lsh/g$b;->j(Lsh/g$b;)I

    move-result p1

    iput p1, p0, Lsh/g;->g:I

    return-void
.end method

.method synthetic constructor <init>(Lsh/g$b;Lsh/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lsh/g;-><init>(Lsh/g$b;)V

    return-void
.end method


# virtual methods
.method protected d()[B
    .locals 3

    .line 1
    invoke-super {p0}, Lsh/o;->d()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lsh/g;->e:I

    .line 6
    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    invoke-static {v1, v0, v2}, LOh/g;->c(I[BI)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lsh/g;->f:I

    .line 13
    .line 14
    const/16 v2, 0x14

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, LOh/g;->c(I[BI)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lsh/g;->g:I

    .line 20
    .line 21
    const/16 v2, 0x18

    .line 22
    .line 23
    invoke-static {v1, v0, v2}, LOh/g;->c(I[BI)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method protected e()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/g;->f:I

    .line 2
    .line 3
    return v0
.end method

.method protected f()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/g;->g:I

    .line 2
    .line 3
    return v0
.end method
